package com.bumptech.glide.load.engine;

import androidx.core.util.Pools$Pool;
import androidx.media3.extractor.mkv.Sniffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class LoadPath {
    public final List decodePaths;
    public final String failureMessage;
    public final Pools$Pool listPool;

    public LoadPath(Class cls, Class cls2, Class cls3, List list, Pools$Pool pools$Pool) {
        this.listPool = pools$Pool;
        if (list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Must not be empty.");
            throw null;
        }
        this.decodePaths = list;
        this.failureMessage = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource load(int i, int i2, Sniffer sniffer, Options options, DataRewinder dataRewinder) {
        Pools$Pool pools$Pool = this.listPool;
        Object acquire = pools$Pool.acquire();
        Util.checkNotNull(acquire, "Argument must not be null");
        List list = (List) acquire;
        try {
            List list2 = this.decodePaths;
            int size = list2.size();
            Resource resource = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    resource = ((DecodePath) list2.get(i3)).decode(i, i2, sniffer, options, dataRewinder);
                } catch (GlideException e) {
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
        } finally {
            pools$Pool.release(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.decodePaths.toArray()) + '}';
    }
}
