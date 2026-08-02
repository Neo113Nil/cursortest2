package com.google.android.gms.internal.mlkit_genai_prompt;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class zzals extends zzakg {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzano zzc;
    private int zzd;

    public zzals() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = zzano.zza;
    }

    public static zzals zzk(Class cls) {
        Map map = zzb;
        zzals zzalsVar = (zzals) map.get(cls);
        if (zzalsVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzalsVar = (zzals) map.get(cls);
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzalsVar != null) {
            return zzalsVar;
        }
        zzals zzalsVar2 = (zzals) ((zzals) zzanu.zze(cls)).zzb(6);
        if (zzalsVar2 != null) {
            map.put(cls, zzalsVar2);
            return zzalsVar2;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static zzals zzm(zzals zzalsVar, byte[] bArr, zzalf zzalfVar) {
        int length = bArr.length;
        if (length != 0) {
            zzals zzalsVar2 = (zzals) zzalsVar.zzb(4);
            try {
                zzanb zzb2 = zzamy.zza.zzb(zzalsVar2.getClass());
                com.google.android.gms.internal.measurement.zzacg zzacgVar = new com.google.android.gms.internal.measurement.zzacg();
                zzalfVar.getClass();
                zzb2.zzg(zzalsVar2, bArr, 0, length, zzacgVar);
                zzb2.zze(zzalsVar2);
                zzalsVar = zzalsVar2;
            } catch (zzaly e) {
                throw e;
            } catch (zzanm e2) {
                throw new zzaly(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzaly) {
                    throw ((zzaly) e3.getCause());
                }
                throw new zzaly(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzaly("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (zzalsVar != null) {
            boolean z = true;
            byte byteValue = ((Byte) zzalsVar.zzb(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = zzamy.zza.zzb(zzalsVar.getClass()).zzi(zzalsVar);
                    zzalsVar.zzb(2);
                }
            }
            if (!z) {
                throw new zzaly(new zzanm("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
            }
        }
        return zzalsVar;
    }

    public static Object zzp(Method method, zzals zzalsVar, Object... objArr) {
        try {
            return method.invoke(zzalsVar, objArr);
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

    public static void zzt(Class cls, zzals zzalsVar) {
        zzalsVar.zzs();
        zzb.put(cls, zzalsVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzamy.zza.zzb(getClass()).zzh(this, (zzals) obj);
    }

    public final int hashCode() {
        if (zzw()) {
            return zzamy.zza.zzb(getClass()).zza(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = zzamy.zza.zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = zzamt.zza;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        zzamt.zzd(this, sb, 0);
        return sb.toString();
    }

    public abstract Object zzb(int i);

    public final void zzs() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzu() {
        this.zzd = (this.zzd & PKIFailureInfo.systemUnavail) | Integer.MAX_VALUE;
    }

    public final boolean zzw() {
        return (this.zzd & PKIFailureInfo.systemUnavail) != 0;
    }
}
