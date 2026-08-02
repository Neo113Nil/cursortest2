package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.android.gms.internal.mlkit_genai_prompt.zzjd;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzjg implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        Unsafe unsafe = zzjd.zzd.zza;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
