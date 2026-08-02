package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.core.util.Pools$Pool;
import androidx.media3.extractor.mkv.Sniffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Util;
import com.caverock.androidsvg.SVG;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class DecodePath {
    public final Class dataClass;
    public final List decoders;
    public final String failureMessage;
    public final Pools$Pool listPool;
    public final ResourceTranscoder transcoder;

    public DecodePath(Class cls, Class cls2, Class cls3, List list, ResourceTranscoder resourceTranscoder, Pools$Pool pools$Pool) {
        this.dataClass = cls;
        this.decoders = list;
        this.transcoder = resourceTranscoder;
        this.listPool = pools$Pool;
        this.failureMessage = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource decode(int i, int i2, Sniffer sniffer, Options options, DataRewinder dataRewinder) {
        Resource resource;
        Transformation transformation;
        int i3;
        ResourceEncoder resourceEncoder;
        Resource resource2;
        boolean z;
        boolean z2;
        Object dataCacheKey;
        Pools$Pool pools$Pool = this.listPool;
        Object acquire = pools$Pool.acquire();
        Util.checkNotNull(acquire, "Argument must not be null");
        List list = (List) acquire;
        try {
            Resource decodeResourceWithList = decodeResourceWithList(dataRewinder, i, i2, options, list);
            pools$Pool.release(list);
            DecodeJob decodeJob = (DecodeJob) sniffer.scratch;
            int i4 = sniffer.peekLength;
            DecodeHelper decodeHelper = decodeJob.decodeHelper;
            Class<?> cls = decodeResourceWithList.get().getClass();
            if (i4 != 4) {
                Transformation transformation2 = decodeHelper.getTransformation(cls);
                transformation = transformation2;
                resource = transformation2.transform(decodeJob.glideContext, decodeResourceWithList, decodeJob.width, decodeJob.height);
            } else {
                resource = decodeResourceWithList;
                transformation = null;
            }
            if (!decodeResourceWithList.equals(resource)) {
                decodeResourceWithList.recycle();
            }
            if (decodeHelper.glideContext.getRegistry().resourceEncoderRegistry.get(resource.getResourceClass()) != null) {
                resourceEncoder = decodeHelper.glideContext.getRegistry().resourceEncoderRegistry.get(resource.getResourceClass());
                if (resourceEncoder == null) {
                    throw new Registry.NoResultEncoderAvailableException(resource.getResourceClass());
                }
                i3 = resourceEncoder.getEncodeStrategy(decodeJob.options);
            } else {
                i3 = 3;
                resourceEncoder = null;
            }
            Key key = decodeJob.currentSourceKey;
            ArrayList loadData = decodeHelper.getLoadData();
            int size = loadData.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    resource2 = null;
                    z = false;
                    break;
                }
                resource2 = null;
                if (((ModelLoader.LoadData) loadData.get(i5)).sourceKey.equals(key)) {
                    z = true;
                    break;
                }
                i5++;
            }
            switch (decodeJob.diskCacheStrategy.$r8$classId) {
                default:
                    if (((!z && i4 == 3) || i4 == 1) && i3 == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (resourceEncoder == null) {
                    throw new Registry.NoResultEncoderAvailableException(resource.get().getClass());
                }
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i3);
                if (ordinal == 0) {
                    dataCacheKey = new DataCacheKey(decodeJob.currentSourceKey, decodeJob.signature);
                } else {
                    if (ordinal != 1) {
                        a$$ExternalSyntheticBUOutline0.m$3("Unknown strategy: ".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return resource2;
                    }
                    dataCacheKey = new ResourceCacheKey(decodeHelper.glideContext.arrayPool, decodeJob.currentSourceKey, decodeJob.signature, decodeJob.width, decodeJob.height, transformation, cls, decodeJob.options);
                }
                LockedResource lockedResource = (LockedResource) LockedResource.POOL.acquire();
                lockedResource.isRecycled = false;
                lockedResource.isLocked = true;
                lockedResource.toWrap = resource;
                SVG svg = decodeJob.deferredEncodeManager;
                svg.rootElement = dataCacheKey;
                svg.cssRules = resourceEncoder;
                svg.idToElementMap = lockedResource;
                resource = lockedResource;
            }
            return this.transcoder.transcode(resource, options);
        } catch (Throwable th) {
            pools$Pool.release(list);
            throw th;
        }
    }

    public final Resource decodeResourceWithList(DataRewinder dataRewinder, int i, int i2, Options options, List list) {
        List list2 = this.decoders;
        int size = list2.size();
        Resource resource = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder resourceDecoder = (ResourceDecoder) list2.get(i3);
            try {
                if (resourceDecoder.handles(dataRewinder.rewindAndGet(), options)) {
                    resource = resourceDecoder.decode(dataRewinder.rewindAndGet(), i, i2, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + resourceDecoder, e);
                }
                list.add(e);
            }
            if (resource != null) {
                break;
            }
        }
        if (resource != null) {
            return resource;
        }
        throw new GlideException(this.failureMessage, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.dataClass + ", decoders=" + this.decoders + ", transcoder=" + this.transcoder + '}';
    }
}
