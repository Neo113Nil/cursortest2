package com.google.android.gms.common.api.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.internal.PrimitiveRegistry;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zaaa {
    public final Map zaa;
    public final Map zab;

    public zaaa() {
        this.zaa = Collections.synchronizedMap(new WeakHashMap());
        this.zab = Collections.synchronizedMap(new WeakHashMap());
    }

    public static PrimitiveRegistry.Builder builder() {
        PrimitiveRegistry.Builder builder = new PrimitiveRegistry.Builder();
        builder.primitiveConstructorMap = new HashMap();
        builder.primitiveWrapperMap = new HashMap();
        return builder;
    }

    public Object fromProtoEnum(Enum r1) {
        Object obj = this.zaa.get(r1);
        if (obj != null) {
            return obj;
        }
        MacWrapper$$ExternalSyntheticLambda0.m(r1, "Unable to convert proto enum: ");
        return null;
    }

    public Enum toProtoEnum(Object obj) {
        Enum r1 = (Enum) this.zab.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException(Boxes$$ExternalSyntheticOutline1.m("Unable to convert object enum: ", obj));
    }

    public void zah(Status status, boolean z) {
        HashMap hashMap;
        HashMap hashMap2;
        Map map = this.zaa;
        synchronized (map) {
            hashMap = new HashMap(map);
        }
        Map map2 = this.zab;
        synchronized (map2) {
            hashMap2 = new HashMap(map2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    public zaaa(Map map, Map map2) {
        this.zaa = map;
        this.zab = map2;
    }
}
