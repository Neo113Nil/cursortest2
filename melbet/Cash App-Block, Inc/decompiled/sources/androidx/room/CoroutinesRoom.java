package androidx.room;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.CancellationSignal;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.SingleCloseImageProxy;
import androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.AutoValue_Packet;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.Format;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.dvb.DvbParser;
import androidx.media3.extractor.text.ssa.SsaParser;
import androidx.media3.extractor.text.subrip.SubripParser;
import androidx.media3.extractor.text.ttml.TtmlParser;
import androidx.media3.extractor.text.tx3g.Tx3gParser;
import androidx.media3.extractor.text.vobsub.VobsubParser;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.transition.Transition;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.pool.FactoryPools;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.core.internal.data.upload.UploadScheduler;
import com.datadog.android.core.internal.user.MutableUserInfoProvider;
import com.datadog.android.core.persistence.Serializer;
import com.datadog.android.rum.internal.domain.event.RumEventMeta$View;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.gson.JsonObject;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;
import net.oneformapp.ProfileStore_;
import okhttp3.Request;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import utils.AnyUtilsKt;

/* loaded from: classes3.dex */
public abstract class CoroutinesRoom {
    public static final Companion Companion = new Companion(0);

    public static final String createInsertQuery(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", str, "')");
    }

    public final class Companion implements CloseGuardHelper$CloseGuardImpl, SubtitleParser.Factory, VideoDecoder.MediaInitializer, ResourceEncoder, RequestManagerTreeNode, FactoryPools.Resetter, UploadScheduler, DataStoreHandler, MutableUserInfoProvider, Serializer {
        public final /* synthetic */ int $r8$classId;

        public Companion(CallResult callResult, FragmentManager fragmentManager) {
            this.$r8$classId = 21;
        }

        public static final void access$replaceHeader(Request.Builder builder, String str, String str2) {
            builder.getClass();
            str.getClass();
            builder.headers.removeAll(str);
            builder.addHeader(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object apply(Object obj) {
            UnsupportedOperationException unsupportedOperationException;
            Throwable th;
            Bitmap createBitmap;
            ProfileStore_ profileStore_ = null;
            Exif exif = null;
            ProfileStore_ profileStore_2 = null;
            switch (this.$r8$classId) {
                case 4:
                    AutoValue_Packet autoValue_Packet = (AutoValue_Packet) obj;
                    int i = autoValue_Packet.f846format;
                    Object obj2 = autoValue_Packet.data;
                    int i2 = autoValue_Packet.rotationDegrees;
                    try {
                        try {
                            if (i == 35) {
                                ImageProxy imageProxy = (ImageProxy) obj2;
                                Object[] objArr = i2 % EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE != 0;
                                ProfileStore_ profileStore_3 = new ProfileStore_(AnyUtilsKt.createIsolatedReader(objArr != false ? imageProxy.getHeight() : imageProxy.getWidth(), objArr != false ? imageProxy.getWidth() : imageProxy.getHeight(), 1, 2));
                                try {
                                    SingleCloseImageProxy convertYUVToRGB = ImageProcessingUtil.convertYUVToRGB(imageProxy, profileStore_3, ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4), i2, false);
                                    imageProxy.close();
                                    if (convertYUVToRGB == null) {
                                        throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                                    }
                                    createBitmap = ImageUtil.createBitmapFromImageProxy(convertYUVToRGB);
                                    convertYUVToRGB.close();
                                    profileStore_2 = profileStore_3;
                                } catch (UnsupportedOperationException e) {
                                    unsupportedOperationException = e;
                                    throw new ImageCaptureException(0, "Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException);
                                } catch (Throwable th2) {
                                    th = th2;
                                    profileStore_ = profileStore_3;
                                    if (profileStore_ == null) {
                                        throw th;
                                    }
                                    profileStore_.close();
                                    throw th;
                                }
                            } else {
                                if (i != 256 && i != 4101) {
                                    throw new IllegalArgumentException("Invalid postview image format : " + i);
                                }
                                ImageProxy imageProxy2 = (ImageProxy) obj2;
                                Bitmap createBitmapFromImageProxy = ImageUtil.createBitmapFromImageProxy(imageProxy2);
                                imageProxy2.close();
                                Matrix matrix = new Matrix();
                                matrix.postRotate(i2);
                                createBitmap = Bitmap.createBitmap(createBitmapFromImageProxy, 0, 0, createBitmapFromImageProxy.getWidth(), createBitmapFromImageProxy.getHeight(), matrix, true);
                            }
                            if (profileStore_2 != null) {
                                profileStore_2.close();
                            }
                            return createBitmap;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (UnsupportedOperationException e2) {
                        unsupportedOperationException = e2;
                    }
                    break;
                default:
                    AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket = (AutoValue_ProcessingNode_InputPacket) obj;
                    ImageProxy imageProxy3 = autoValue_ProcessingNode_InputPacket.imageProxy;
                    ProcessingRequest processingRequest = autoValue_ProcessingNode_InputPacket.processingRequest;
                    if (ImageUtil.isJpegFormats(imageProxy3.getFormat())) {
                        try {
                            Exif.AnonymousClass1 anonymousClass1 = Exif.DATE_FORMAT;
                            ByteBuffer buffer = imageProxy3.getPlanes()[0].getBuffer();
                            buffer.rewind();
                            byte[] bArr = new byte[buffer.capacity()];
                            buffer.get(bArr);
                            exif = new Exif(new ExifInterface(new ByteArrayInputStream(bArr)));
                            imageProxy3.getPlanes()[0].getBuffer().rewind();
                        } catch (IOException e3) {
                            throw new ImageCaptureException(1, "Failed to extract EXIF data.", e3);
                        }
                    }
                    Exif exif2 = exif;
                    if (((ImageCaptureRotationOptionQuirk) DeviceQuirks.sQuirks.get(ImageCaptureRotationOptionQuirk.class)) != null) {
                        AutoValue_Config_Option autoValue_Config_Option = CaptureConfig.OPTION_ROTATION;
                    } else if (ImageUtil.isJpegFormats(imageProxy3.getFormat())) {
                        TransactorKt.checkNotNull(exif2, "JPEG image must have exif.");
                        Size size = new Size(imageProxy3.getWidth(), imageProxy3.getHeight());
                        int rotation = processingRequest.mRotationDegrees - exif2.getRotation();
                        Size size2 = TransformUtils.is90or270(TransformUtils.within360(rotation)) ? new Size(size.getHeight(), size.getWidth()) : size;
                        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size.getWidth(), size.getHeight()), new RectF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, size2.getWidth(), size2.getHeight()), rotation, false);
                        RectF rectF = new RectF(processingRequest.mCropRect);
                        rectToRect.mapRect(rectF);
                        rectF.sort();
                        Rect rect = new Rect();
                        rectF.round(rect);
                        int rotation2 = exif2.getRotation();
                        Matrix matrix2 = new Matrix(processingRequest.mSensorToBufferTransform);
                        matrix2.postConcat(rectToRect);
                        CameraCaptureResult glideBuilder$1 = imageProxy3.getImageInfo() instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageProxy3.getImageInfo()).mCameraCaptureResult : new GlideBuilder$1();
                        imageProxy3.getFormat();
                        return new AutoValue_Packet(imageProxy3, exif2, imageProxy3.getFormat(), size2, rect, rotation2, matrix2, glideBuilder$1);
                    }
                    Rect rect2 = processingRequest.mCropRect;
                    int i3 = processingRequest.mRotationDegrees;
                    Matrix matrix3 = processingRequest.mSensorToBufferTransform;
                    CameraCaptureResult glideBuilder$12 = imageProxy3.getImageInfo() instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageProxy3.getImageInfo()).mCameraCaptureResult : new GlideBuilder$1();
                    Size size3 = new Size(imageProxy3.getWidth(), imageProxy3.getHeight());
                    if (ImageUtil.isJpegFormats(imageProxy3.getFormat())) {
                        TransactorKt.checkNotNull(exif2, "JPEG image must have Exif.");
                    }
                    return new AutoValue_Packet(imageProxy3, exif2, imageProxy3.getFormat(), size3, rect2, i3, matrix3, glideBuilder$12);
            }
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl, androidx.camera.viewfinder.core.impl.CloseGuardImpl
        public void close() {
        }

        @Override // androidx.media3.extractor.text.SubtitleParser.Factory
        public SubtitleParser create(Format format2) {
            String str = format2.sampleMimeType;
            List list = format2.initializationData;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new DvbParser(list);
                    case "application/pgs":
                        return new UnleashContext(7);
                    case "application/x-mp4-vtt":
                        return new Id3Peeker(1);
                    case "text/vtt":
                        return new CallResult(9);
                    case "application/x-quicktime-tx3g":
                        return new Tx3gParser(list);
                    case "text/x-ssa":
                        return new SsaParser(list);
                    case "application/vobsub":
                        return new VobsubParser(list);
                    case "application/x-subrip":
                        return new SubripParser();
                    case "application/ttml+xml":
                        return new TtmlParser();
                }
            }
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unsupported MIME type: ", str));
            return null;
        }

        @Override // com.bumptech.glide.load.Encoder
        public boolean encode(Object obj, File file, Options options) {
            try {
                ByteBufferUtil.toFile(((GifFrameLoader) ((GifDrawable) ((Resource) obj).get()).state.frameLoader).gifDecoder.rawData.asReadOnlyBuffer(), file);
                return true;
            } catch (IOException e) {
                if (!Log.isLoggable("GifEncoder", 5)) {
                    return false;
                }
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        
            if (r5 == r9) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object execute(RoomDatabase roomDatabase, CancellationSignal cancellationSignal, Callable callable, ContinuationImpl continuationImpl) {
            CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$3;
            int i;
            if (continuationImpl instanceof CoroutinesRoom$Companion$execute$3) {
                coroutinesRoom$Companion$execute$3 = (CoroutinesRoom$Companion$execute$3) continuationImpl;
                int i2 = coroutinesRoom$Companion$execute$3.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    coroutinesRoom$Companion$execute$3.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = coroutinesRoom$Companion$execute$3.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = coroutinesRoom$Companion$execute$3.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                            return callable.call();
                        }
                        coroutinesRoom$Companion$execute$3.L$0 = roomDatabase;
                        coroutinesRoom$Companion$execute$3.L$1 = cancellationSignal;
                        coroutinesRoom$Companion$execute$3.L$2 = callable;
                        coroutinesRoom$Companion$execute$3.label = 1;
                        obj = DBUtil.getCoroutineContext(roomDatabase, false, coroutinesRoom$Companion$execute$3);
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        callable = coroutinesRoom$Companion$execute$3.L$2;
                        cancellationSignal = coroutinesRoom$Companion$execute$3.L$1;
                        roomDatabase = coroutinesRoom$Companion$execute$3.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    CoroutineContext coroutineContext = (CoroutineContext) obj;
                    coroutinesRoom$Companion$execute$3.L$0 = roomDatabase;
                    coroutinesRoom$Companion$execute$3.L$1 = cancellationSignal;
                    coroutinesRoom$Companion$execute$3.L$2 = callable;
                    coroutinesRoom$Companion$execute$3.L$3 = coroutineContext;
                    coroutinesRoom$Companion$execute$3.label = 2;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(coroutinesRoom$Companion$execute$3));
                    cancellableContinuationImpl.initCancellability();
                    cancellableContinuationImpl.invokeOnCancellation(new Latch$await$2$2(5, cancellationSignal, JobKt.launch$default(roomDatabase.getCoroutineScope(), coroutineContext, null, new RealBadger2$clear$2(callable, cancellableContinuationImpl, continuation, 20), 2)));
                    Object result = cancellableContinuationImpl.getResult();
                    return result != obj2 ? obj2 : result;
                }
            }
            coroutinesRoom$Companion$execute$3 = new CoroutinesRoom$Companion$execute$3(this, continuationImpl);
            Object obj3 = coroutinesRoom$Companion$execute$3.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = coroutinesRoom$Companion$execute$3.label;
            Continuation continuation2 = null;
            if (i != 0) {
            }
            CoroutineContext coroutineContext2 = (CoroutineContext) obj3;
            coroutinesRoom$Companion$execute$3.L$0 = roomDatabase;
            coroutinesRoom$Companion$execute$3.L$1 = cancellationSignal;
            coroutinesRoom$Companion$execute$3.L$2 = callable;
            coroutinesRoom$Companion$execute$3.L$3 = coroutineContext2;
            coroutinesRoom$Companion$execute$3.label = 2;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(coroutinesRoom$Companion$execute$3));
            cancellableContinuationImpl2.initCancellability();
            cancellableContinuationImpl2.invokeOnCancellation(new Latch$await$2$2(5, cancellationSignal, JobKt.launch$default(roomDatabase.getCoroutineScope(), coroutineContext2, null, new RealBadger2$clear$2(callable, cancellableContinuationImpl2, continuation2, 20), 2)));
            Object result2 = cancellableContinuationImpl2.getResult();
            if (result2 != obj22) {
            }
        }

        @Override // androidx.media3.extractor.text.SubtitleParser.Factory
        public int getCueReplacementBehavior(Format format2) {
            String str = format2.sampleMimeType;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                    case "application/pgs":
                    case "application/x-mp4-vtt":
                        return 2;
                    case "text/vtt":
                        return 1;
                    case "application/x-quicktime-tx3g":
                        return 2;
                    case "text/x-ssa":
                        return 1;
                    case "application/vobsub":
                        return 2;
                    case "application/x-subrip":
                    case "application/ttml+xml":
                        return 1;
                }
            }
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Unsupported MIME type: ", str));
            return 0;
        }

        @Override // com.bumptech.glide.load.ResourceEncoder
        public int getEncodeStrategy(Options options) {
            return 1;
        }

        @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
        public UserInfo getUserInfo() {
            return new UserInfo();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public void initializeExtractor(MediaExtractor mediaExtractor, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.MediaInitializer
        public void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl
        public void open(String str) {
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Resetter
        public void reset(Object obj) {
            ((List) obj).clear();
        }

        @Override // com.datadog.android.core.persistence.Serializer
        public String serialize(Object obj) {
            RumEventMeta$View rumEventMeta$View = (RumEventMeta$View) obj;
            rumEventMeta$View.getClass();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type", "view");
            jsonObject.addProperty("viewId", rumEventMeta$View.viewId);
            jsonObject.addProperty("documentVersion", Long.valueOf(rumEventMeta$View.documentVersion));
            jsonObject.addProperty("hasAccessibility", rumEventMeta$View.hasAccessibility);
            String jsonElement = jsonObject.toString();
            jsonElement.getClass();
            return jsonElement;
        }

        @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
        public void setAnonymousId(String str) {
        }

        @Override // com.datadog.android.core.internal.user.MutableUserInfoProvider
        public void setUserInfo(String str, Map map) {
            map.getClass();
        }

        @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
        public void setValue(UUID uuid, Transition.AnonymousClass1 anonymousClass1) {
            uuid.getClass();
        }

        @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
        public void startScheduling() {
        }

        @Override // com.datadog.android.core.internal.data.upload.UploadScheduler
        public void stopScheduling() {
        }

        @Override // androidx.media3.extractor.text.SubtitleParser.Factory
        public boolean supportsFormat(Format format2) {
            String str = format2.sampleMimeType;
            return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
        }

        @Override // com.datadog.android.api.storage.datastore.DataStoreHandler
        public void value(n.b bVar, GlideBuilder$1 glideBuilder$1) {
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl, androidx.camera.viewfinder.core.impl.CloseGuardImpl
        public void warnIfOpen() {
        }

        public /* synthetic */ Companion(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        
            if (r5 == r9) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object execute(RoomDatabase roomDatabase, boolean z, Callable callable, ContinuationImpl continuationImpl) {
            CoroutinesRoom$Companion$execute$1 coroutinesRoom$Companion$execute$1;
            int i;
            if (continuationImpl instanceof CoroutinesRoom$Companion$execute$1) {
                coroutinesRoom$Companion$execute$1 = (CoroutinesRoom$Companion$execute$1) continuationImpl;
                int i2 = coroutinesRoom$Companion$execute$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    coroutinesRoom$Companion$execute$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = coroutinesRoom$Companion$execute$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = coroutinesRoom$Companion$execute$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                            return callable.call();
                        }
                        coroutinesRoom$Companion$execute$1.L$0 = callable;
                        coroutinesRoom$Companion$execute$1.label = 1;
                        obj = DBUtil.getCoroutineContext(roomDatabase, z, coroutinesRoom$Companion$execute$1);
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        callable = coroutinesRoom$Companion$execute$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(callable, continuation, 13);
                    coroutinesRoom$Companion$execute$1.L$0 = null;
                    coroutinesRoom$Companion$execute$1.label = 2;
                    Object withContext = JobKt.withContext((CoroutineContext) obj, diskLruCache$launchCleanup$1, coroutinesRoom$Companion$execute$1);
                    return withContext != obj2 ? obj2 : withContext;
                }
            }
            coroutinesRoom$Companion$execute$1 = new CoroutinesRoom$Companion$execute$1(this, continuationImpl);
            Object obj3 = coroutinesRoom$Companion$execute$1.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = coroutinesRoom$Companion$execute$1.label;
            Continuation continuation2 = null;
            if (i != 0) {
            }
            DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$12 = new DiskLruCache$launchCleanup$1(callable, continuation2, 13);
            coroutinesRoom$Companion$execute$1.L$0 = null;
            coroutinesRoom$Companion$execute$1.label = 2;
            Object withContext2 = JobKt.withContext((CoroutineContext) obj3, diskLruCache$launchCleanup$12, coroutinesRoom$Companion$execute$1);
            if (withContext2 != obj22) {
            }
        }
    }
}
