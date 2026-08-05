package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzdb;
import com.google.android.gms.internal.wearable.zzdg;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzdg<MessageType extends zzdg<MessageType, BuilderType>, BuilderType extends zzdb<MessageType, BuilderType>> extends zzbr<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzfj zzc = zzfj.zza();

    static zzdg zzU(Class cls) {
        Map map = zze;
        zzdg zzdgVar = (zzdg) map.get(cls);
        if (zzdgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzdgVar = (zzdg) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzdgVar == null) {
            zzdgVar = (zzdg) ((zzdg) zzfp.zzb(cls)).zzG(6, null, null);
            if (zzdgVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzdgVar);
        }
        return zzdgVar;
    }

    protected static void zzV(Class cls, zzdg zzdgVar) {
        zzdgVar.zzM();
        zze.put(cls, zzdgVar);
    }

    protected static Object zzW(zzel zzelVar, String str, Object[] objArr) {
        return new zzew(zzelVar, str, objArr);
    }

    static Object zzX(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static zzdo zzY() {
        return zzea.zzd();
    }

    protected static zzdm zzZ() {
        return zzcz.zzd();
    }

    protected static zzdp zzaa() {
        return zzev.zzd();
    }

    protected static zzdp zzab(zzdp zzdpVar) {
        int size = zzdpVar.size();
        return zzdpVar.zzg(size + size);
    }

    protected static zzdg zzac(zzdg zzdgVar, byte[] bArr) throws zzdv {
        int length = bArr.length;
        int i = zzcs.zzb;
        int i2 = zzbv.zza;
        zzdg zze2 = zze(zzdgVar, bArr, 0, length, zzcs.zza);
        zzf(zze2);
        return zze2;
    }

    protected static zzdg zzad(zzdg zzdgVar, byte[] bArr, zzcs zzcsVar) throws zzdv {
        zzdg zze2 = zze(zzdgVar, bArr, 0, bArr.length, zzcsVar);
        zzf(zze2);
        return zze2;
    }

    private final int zzc(zzey zzeyVar) {
        return zzeu.zza().zzb(getClass()).zze(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzd(zzdg zzdgVar, boolean z) {
        byte byteValue = ((Byte) zzdgVar.zzG(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzeu.zza().zzb(zzdgVar.getClass()).zzl(zzdgVar);
        if (z) {
            zzdgVar.zzG(2, true != zzl ? null : zzdgVar, null);
        }
        return zzl;
    }

    private static zzdg zze(zzdg zzdgVar, byte[] bArr, int i, int i2, zzcs zzcsVar) throws zzdv {
        if (i2 == 0) {
            return zzdgVar;
        }
        zzdg zzO = zzdgVar.zzO();
        try {
            zzey zzb = zzeu.zza().zzb(zzO.getClass());
            zzb.zzj(zzO, bArr, 0, i2, new zzbw(zzcsVar));
            zzb.zzk(zzO);
            return zzO;
        } catch (zzdv e) {
            throw e;
        } catch (zzfh e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzdv) {
                throw ((zzdv) e3.getCause());
            }
            throw new zzdv(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static zzdg zzf(zzdg zzdgVar) throws zzdv {
        if (zzdgVar == null || zzd(zzdgVar, true)) {
            return zzdgVar;
        }
        throw new zzfh(zzdgVar).zza();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzeu.zza().zzb(getClass()).zzb(this, (zzdg) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzP();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzP = zzP();
        this.zza = zzP;
        return zzP;
    }

    public final String toString() {
        return zzen.zza(this, super.toString());
    }

    protected abstract Object zzG(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.wearable.zzbr
    final int zzJ(zzey zzeyVar) {
        if (zzL()) {
            int zze2 = zzeyVar.zze(this);
            if (zze2 >= 0) {
                return zze2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(zze2).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(zze2);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zze3 = zzeyVar.zze(this);
        if (zze3 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | zze3;
            return zze3;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(zze3).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(zze3);
        throw new IllegalStateException(sb2.toString());
    }

    final boolean zzL() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void zzM() {
        this.zzb &= Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final zzes zzN() {
        return (zzes) zzG(7, null, null);
    }

    final zzdg zzO() {
        return (zzdg) zzG(4, null, null);
    }

    final int zzP() {
        return zzeu.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzQ() {
        zzeu.zza().zzb(getClass()).zzk(this);
        zzM();
    }

    protected final zzdb zzR() {
        return (zzdb) zzG(5, null, null);
    }

    final void zzS(int i) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final boolean zzaf() {
        return zzd(this, true);
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final void zzag(zzcn zzcnVar) throws IOException {
        zzeu.zza().zzb(getClass()).zzf(this, zzco.zza(zzcnVar));
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final /* synthetic */ zzek zzah() {
        return (zzdb) zzG(5, null, null);
    }

    @Override // com.google.android.gms.internal.wearable.zzem
    public final /* synthetic */ zzel zzai() {
        return (zzdg) zzG(6, null, null);
    }

    @Override // com.google.android.gms.internal.wearable.zzel
    public final int zzT() {
        int i;
        if (zzL()) {
            i = zzc(null);
            if (i < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
                sb.append("serialized size must be non-negative, was ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            i = this.zzb & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzc(null);
                if (i < 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
                    sb2.append("serialized size must be non-negative, was ");
                    sb2.append(i);
                    throw new IllegalStateException(sb2.toString());
                }
                this.zzb = (this.zzb & Integer.MIN_VALUE) | i;
            }
        }
        return i;
    }
}
