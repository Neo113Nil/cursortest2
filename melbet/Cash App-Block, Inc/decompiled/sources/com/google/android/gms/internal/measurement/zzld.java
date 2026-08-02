package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class zzld {
    public static final ConcurrentHashMap zza = new ConcurrentHashMap();

    public static void zza() {
        Iterator it = zza.values().iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
    }
}
