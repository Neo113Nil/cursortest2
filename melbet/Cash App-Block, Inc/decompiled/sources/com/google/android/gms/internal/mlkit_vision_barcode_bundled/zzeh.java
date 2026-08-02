package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class zzeh extends zzcq {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzgt zzc;
    private int zzd;

    public zzeh() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = zzgt.zza;
    }

    public static zzeh zzJ(Class cls) {
        Map map = zzb;
        zzeh zzehVar = (zzeh) map.get(cls);
        if (zzehVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzehVar = (zzeh) map.get(cls);
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzehVar != null) {
            return zzehVar;
        }
        zzeh zzehVar2 = (zzeh) ((zzeh) zzgz.zze(cls)).zzg(6, null);
        if (zzehVar2 != null) {
            map.put(cls, zzehVar2);
            return zzehVar2;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static Object zzR(Method method, zzeh zzehVar, Object... objArr) {
        try {
            return method.invoke(zzehVar, objArr);
        } catch (IllegalAccessException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't use Java reflection to implement protocol message reflection.", (Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void zzV(Class cls, zzeh zzehVar) {
        zzehVar.zzU();
        zzb.put(cls, zzehVar);
    }

    public static final boolean zzX(zzeh zzehVar, boolean z) {
        byte byteValue = ((Byte) zzehVar.zzg(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzfu.zzb.zzb(zzehVar.getClass()).zzk(zzehVar);
        if (z) {
            zzehVar.zzg(2, true == zzk ? zzehVar : null);
        }
        return zzk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzfu.zzb.zzb(getClass()).zzj(this, (zzeh) obj);
    }

    public final int hashCode() {
        if (zzY()) {
            return zzfu.zzb.zzb(getClass()).zzb(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzfu.zzb.zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = zzfo.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        zzfo.zzd(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcq
    public final int zzB(zzge zzgeVar) {
        if (zzY()) {
            int zza = zzgeVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(zza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzgeVar.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | zza2;
            return zza2;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(zza2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final int zzF() {
        if (zzY()) {
            int zza = zzfu.zzb.zzb(getClass()).zza(this);
            if (zza >= 0) {
                return zza;
            }
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(zza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zza2 = zzfu.zzb.zzb(getClass()).zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | zza2;
            return zza2;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(zza2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final zzeb zzG() {
        return (zzeb) zzg(5, null);
    }

    public final void zzU() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzW() {
        this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    public final boolean zzY() {
        return (this.zzd & PKIFailureInfo.systemUnavail) != 0;
    }

    public final void zzab(zzdk zzdkVar) {
        zzge zzb2 = zzfu.zzb.zzb(getClass());
        zzfe zzfeVar = zzdkVar.zza;
        if (zzfeVar == null) {
            zzfeVar = new zzfe(zzdkVar);
        }
        zzb2.zzi(this, zzfeVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    public final boolean zzad() {
        return zzX(this, true);
    }

    public abstract Object zzg(int i, zzeh zzehVar);
}
