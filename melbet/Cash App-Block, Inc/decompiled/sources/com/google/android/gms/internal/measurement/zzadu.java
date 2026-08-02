package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class zzadu extends zzacb {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected zzaga zzc;

    public zzadu() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = zzaga.zza;
    }

    public static zzadu zzcA(zzadu zzaduVar, byte[] bArr, zzadf zzadfVar) {
        int length = bArr.length;
        if (length != 0) {
            zzadu zzck = zzaduVar.zzck();
            try {
                zzafp zzb = zzafl.zza().zzb(zzck.getClass());
                zzb.zzj(zzck, bArr, 0, length, new zzacg(zzadfVar));
                zzb.zzk(zzck);
                zzaduVar = zzck;
            } catch (zzaeh e) {
                if (e.zza) {
                    throw new zzaeh(e.getMessage(), e);
                }
                throw e;
            } catch (zzafy e2) {
                throw e2.zza();
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e3.getCause());
                }
                throw new zzaeh(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        zzf(zzaduVar);
        return zzaduVar;
    }

    public static zzadu zzcr(Class cls) {
        Map map = zze;
        zzadu zzaduVar = (zzadu) map.get(cls);
        if (zzaduVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaduVar = (zzadu) map.get(cls);
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzaduVar != null) {
            return zzaduVar;
        }
        zzadu zzaduVar2 = (zzadu) ((zzadu) zzagg.zzb(cls)).zzg(6);
        if (zzaduVar2 != null) {
            map.put(cls, zzaduVar2);
            return zzaduVar2;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static void zzcs(Class cls, zzadu zzaduVar) {
        zzaduVar.zzci();
        zze.put(cls, zzaduVar);
    }

    public static Object zzcu(Method method, zzadu zzaduVar, Object... objArr) {
        try {
            return method.invoke(zzaduVar, objArr);
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

    public static final boolean zzd(zzadu zzaduVar, boolean z) {
        byte byteValue = ((Byte) zzaduVar.zzg(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzafl.zza().zzb(zzaduVar.getClass()).zzl(zzaduVar);
        if (z) {
            zzaduVar.zzg(2);
        }
        return zzl;
    }

    public static void zzf(zzadu zzaduVar) {
        if (zzaduVar != null && !zzd(zzaduVar, true)) {
            throw new zzafy().zza();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzafl.zza().zzb(getClass()).zzb(this, (zzadu) obj);
    }

    public final int hashCode() {
        if (zzch()) {
            return zzafl.zza().zzb(getClass()).zzc(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzc = zzafl.zza().zzb(getClass()).zzc(this);
        this.zza = zzc;
        return zzc;
    }

    public final String toString() {
        return zzafe.zza(this, super.toString());
    }

    public final void zzcH(zzada zzadaVar) {
        zzafl.zza().zzb(getClass()).zzf(this, zzj.zza(zzadaVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzacb
    public final int zzcf(zzafp zzafpVar) {
        if (zzch()) {
            int zze2 = zzafpVar.zze(this);
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
        int zze3 = zzafpVar.zze(this);
        if (zze3 >= 0) {
            this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | zze3;
            return zze3;
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(zze3).length() + 42, zze3);
        return 0;
    }

    public final boolean zzch() {
        return (this.zzb & PKIFailureInfo.systemUnavail) != 0;
    }

    public final void zzci() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final zzadu zzck() {
        return (zzadu) zzg(4);
    }

    public final zzadp zzcn() {
        return (zzadp) zzg(5);
    }

    public final zzadp zzco() {
        zzadp zzadpVar = (zzadp) zzg(5);
        zzadpVar.zzbe(this);
        return zzadpVar;
    }

    public final void zzcp() {
        this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    public final int zzcq() {
        if (zzch()) {
            int zze2 = zzafl.zza().zzb(getClass()).zze(this);
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
        int zze3 = zzafl.zza().zzb(getClass()).zze(this);
        if (zze3 >= 0) {
            this.zzb = (this.zzb & PKIFailureInfo.systemUnavail) | zze3;
            return zze3;
        }
        TransportImpl$$ExternalSyntheticLambda0.m$1(String.valueOf(zze3).length() + 42, zze3);
        return 0;
    }

    public abstract Object zzg(int i);
}
