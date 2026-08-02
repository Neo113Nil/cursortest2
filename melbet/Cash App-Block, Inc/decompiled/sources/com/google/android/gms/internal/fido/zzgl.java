package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class zzgl {
    public static final Comparator zzb;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(zzgl.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = zzgk.zza;
        }
        zzb = comparator;
    }
}
