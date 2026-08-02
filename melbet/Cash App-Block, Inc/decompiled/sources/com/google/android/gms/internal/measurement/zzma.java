package com.google.android.gms.internal.measurement;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class zzma {
    public static final ArrayMap zza = new ArrayMap(0);

    public static synchronized void zza() {
        synchronized (zzma.class) {
            ArrayMap arrayMap = zza;
            Iterator it = ((ArrayMap.ValueCollection) arrayMap.values()).iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            arrayMap.clear();
        }
    }
}
