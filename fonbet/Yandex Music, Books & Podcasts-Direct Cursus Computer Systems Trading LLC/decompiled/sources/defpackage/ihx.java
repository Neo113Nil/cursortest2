package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes.dex */
public final class ihx extends jmx {
    private static final ihx zzb;
    private int zzd;
    private mix zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private vjx zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        ihx ihxVar = new ihx();
        zzb = ihxVar;
        jmx.f(ihx.class, ihxVar);
    }

    public static hhx m() {
        return (hhx) zzb.k();
    }

    public static hhx n(ihx ihxVar) {
        imx k = zzb.k();
        jmx jmxVar = k.a;
        if (!jmxVar.equals(ihxVar)) {
            if (!k.b.h()) {
                jmx jmxVar2 = (jmx) jmxVar.i(4, null);
                hnx.c.a(jmxVar2.getClass()).d(jmxVar2, k.b);
                k.b = jmxVar2;
            }
            jmx jmxVar3 = k.b;
            hnx.c.a(jmxVar3.getClass()).d(jmxVar3, ihxVar);
        }
        return (hhx) k;
    }

    public static ihx o() {
        return zzb;
    }

    public static /* synthetic */ void p(ihx ihxVar, mix mixVar) {
        ihxVar.zze = mixVar;
        ihxVar.zzd |= 1;
    }

    public static /* synthetic */ void q(ihx ihxVar, int i) {
        ihxVar.zzd |= 1024;
        ihxVar.zzo = i;
    }

    public static /* synthetic */ void r(ihx ihxVar, int i) {
        ihxVar.zzd |= 128;
        ihxVar.zzl = i;
    }

    public static /* synthetic */ void s(ihx ihxVar, boolean z) {
        ihxVar.zzd |= 2048;
        ihxVar.zzp = z;
    }

    public static /* synthetic */ void t(ihx ihxVar, boolean z) {
        ihxVar.zzd |= 16384;
        ihxVar.zzs = z;
    }

    public static /* synthetic */ void u(ihx ihxVar, boolean z) {
        ihxVar.zzd |= 2;
        ihxVar.zzf = z;
    }

    public static /* synthetic */ void v(ihx ihxVar, int i) {
        ihxVar.zzd |= 64;
        ihxVar.zzk = i;
    }

    public static /* synthetic */ void w(ihx ihxVar, long j) {
        ihxVar.zzd |= 4;
        ihxVar.zzg = j;
    }

    public static /* synthetic */ void x(ihx ihxVar, int i) {
        ihxVar.zzd |= RemoteCameraConfig.Notification.ID;
        ihxVar.zzr = i;
    }

    public static /* synthetic */ void y(ihx ihxVar, int i) {
        ihxVar.zzd |= 4096;
        ihxVar.zzq = i;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", wvo.j, "zzj", kjn.j, "zzk", "zzl", "zzm", "zzn", qee.m, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new ihx();
        }
        if (i2 == 4) {
            return new hhx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
