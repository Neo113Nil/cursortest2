package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class zzbjr extends zzbhz {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected zzbma zzc;

    public zzbjr() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = zzbma.zza;
    }

    public static zzbjr zzbE(Class cls) {
        Map map = zze;
        zzbjr zzbjrVar = (zzbjr) map.get(cls);
        if (zzbjrVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzbjrVar = (zzbjr) map.get(cls);
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzbjrVar != null) {
            return zzbjrVar;
        }
        zzbjr zzbjrVar2 = (zzbjr) ((zzbjr) zzbmg.zzb(cls)).zzb(6, null);
        if (zzbjrVar2 != null) {
            map.put(cls, zzbjrVar2);
            return zzbjrVar2;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static void zzbF(Class cls, zzbjr zzbjrVar) {
        zzbjrVar.zzbw();
        zze.put(cls, zzbjrVar);
    }

    public static Object zzbI(Method method, zzbjr zzbjrVar, Object... objArr) {
        try {
            return method.invoke(zzbjrVar, objArr);
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

    public static zzbjs zzbK(zzbjz zzbjzVar) {
        int size = zzbjzVar.size();
        return ((zzbjs) zzbjzVar).zzg(size + size);
    }

    public static final boolean zze(zzbjr zzbjrVar, boolean z) {
        byte byteValue = ((Byte) zzbjrVar.zzb(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzi = zzblj.zza.zzb(zzbjrVar.getClass()).zzi(zzbjrVar);
        if (z) {
            zzbjrVar.zzb(2, true == zzi ? zzbjrVar : null);
        }
        return zzi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzblj.zza.zzb(getClass()).zzb(this, (zzbjr) obj);
    }

    public final int hashCode() {
        if (zzbv()) {
            return zzblj.zza.zzb(getClass()).zzc(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzc = zzblj.zza.zzb(getClass()).zzc(this);
        this.zza = zzc;
        return zzc;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = zzblb.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        zzblb.zzc(this, sb, 0);
        return sb.toString();
    }

    public abstract Object zzb(int i, zzbjr zzbjrVar);

    public final zzbjl zzbB() {
        return (zzbjl) zzb(5, null);
    }

    public final void zzbC() {
        this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    public final int zzbD() {
        if (zzbv()) {
            int zze2 = zzblj.zza.zzb(getClass()).zze(this);
            if (zze2 >= 0) {
                return zze2;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(zze2).length() + 42, zze2);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zze3 = zzblj.zza.zzb(getClass()).zze(this);
        if (zze3 >= 0) {
            this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | zze3;
            return zze3;
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(zze3).length() + 42, zze3);
        return 0;
    }

    public final void zzbR(zzbiv zzbivVar) {
        zzbln zzb = zzblj.zza.zzb(getClass());
        zzfv zzfvVar = zzbivVar.zza;
        if (zzfvVar == null) {
            zzfvVar = new zzfv(zzbivVar);
        }
        zzb.zzf(this, zzfvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbhz
    public final int zzbt(zzbln zzblnVar) {
        if (zzbv()) {
            int zze2 = zzblnVar.zze(this);
            if (zze2 >= 0) {
                return zze2;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(zze2).length() + 42, zze2);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zze3 = zzblnVar.zze(this);
        if (zze3 >= 0) {
            this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | zze3;
            return zze3;
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(zze3).length() + 42, zze3);
        return 0;
    }

    public final boolean zzbv() {
        return (this.zzb & PKIFailureInfo.systemUnavail) != 0;
    }

    public final void zzbw() {
        this.zzb &= Integer.MAX_VALUE;
    }
}
