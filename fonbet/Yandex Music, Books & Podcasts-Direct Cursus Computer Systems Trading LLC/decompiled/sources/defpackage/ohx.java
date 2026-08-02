package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class ohx extends jmx {
    private static final ohx zzb;
    private rmx zzA;
    private rmx zzB;
    private rmx zzC;
    private xjx zzD;
    private int zzE;
    private int zzF;
    private mix zzG;
    private int zzH;
    private mhx zzI;
    private rmx zzJ;
    private mix zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private skx zzR;
    private ihx zzS;
    private whx zzT;
    private sgx zzU;
    private djx zzV;
    private wjx zzW;
    private fjx zzX;
    private rmx zzY;
    private ejx zzZ;
    private int zzaa;
    private kjx zzab;
    private rmx zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private ugx zzag;
    private ojx zzah;
    private uix zzai;
    private hix zzaj;
    private ijx zzak;
    private ckx zzal;
    private iix zzam;
    private int zzan;
    private int zzao;
    private int zzap;
    private rmx zzaq;
    private vkx zzar;
    private dkx zzas;
    private bkx zzat;
    private khx zzau;
    private gkx zzav;
    private ujx zzaw;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private six zzi;
    private njx zzj;
    private rix zzk;
    private pix zzl;
    private lhx zzm;
    private mjx zzn;
    private wgx zzo;
    private rkx zzp;
    private oix zzr;
    private zdx zzs;
    private int zzv;
    private hjx zzw;
    private rmx zzz;
    private byte zzax = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private pmx zzy = kmx.d;

    static {
        ohx ohxVar = new ohx();
        zzb = ohxVar;
        jmx.f(ohx.class, ohxVar);
    }

    public ohx() {
        inx inxVar = inx.d;
        this.zzz = inxVar;
        this.zzA = inxVar;
        this.zzB = inxVar;
        this.zzC = inxVar;
        this.zzJ = inxVar;
        this.zzY = inxVar;
        this.zzac = inxVar;
        this.zzaq = inxVar;
    }

    public static /* synthetic */ void A(ohx ohxVar, long j) {
        ohxVar.zzd |= 2;
        ohxVar.zzg = j;
    }

    public static nhx n() {
        return (nhx) zzb.k();
    }

    public static nhx o(ohx ohxVar) {
        imx k = zzb.k();
        jmx jmxVar = k.a;
        if (!jmxVar.equals(ohxVar)) {
            if (!k.b.h()) {
                jmx jmxVar2 = (jmx) jmxVar.i(4, null);
                hnx.c.a(jmxVar2.getClass()).d(jmxVar2, k.b);
                k.b = jmxVar2;
            }
            jmx jmxVar3 = k.b;
            hnx.c.a(jmxVar3.getClass()).d(jmxVar3, ohxVar);
        }
        return (nhx) k;
    }

    public static void p(ohx ohxVar, ygx ygxVar) {
        rmx rmxVar = ohxVar.zzY;
        if (!((tlx) rmxVar).a) {
            ohxVar.zzY = jmx.c(rmxVar);
        }
        ohxVar.zzY.add(ygxVar);
    }

    public static /* synthetic */ void q(ohx ohxVar, ugx ugxVar) {
        ohxVar.zzag = ugxVar;
        ohxVar.zze |= RemoteCameraConfig.Notification.ID;
    }

    public static /* synthetic */ void r(ohx ohxVar, ihx ihxVar) {
        ohxVar.zzS = ihxVar;
        ohxVar.zze |= 2;
    }

    public static /* synthetic */ void s(ohx ohxVar, String str) {
        str.getClass();
        ohxVar.zzd |= SQLiteDatabase.OPEN_NOMUTEX;
        ohxVar.zzu = str;
    }

    public static /* synthetic */ void t(ohx ohxVar, String str) {
        str.getClass();
        ohxVar.zzd |= 2048;
        ohxVar.zzq = str;
    }

    public static /* synthetic */ void u(ohx ohxVar, int i) {
        ohxVar.zzd |= Integer.MIN_VALUE;
        ohxVar.zzQ = i;
    }

    public static /* synthetic */ void v(ohx ohxVar, int i) {
        ohxVar.zzd |= SQLiteDatabase.OPEN_FULLMUTEX;
        ohxVar.zzv = i;
    }

    public static /* synthetic */ void w(ohx ohxVar, bkx bkxVar) {
        ohxVar.zzat = bkxVar;
        ohxVar.zze |= 33554432;
    }

    public static /* synthetic */ void x(ohx ohxVar, String str) {
        ohxVar.zzd |= SQLiteDatabase.OPEN_PRIVATECACHE;
        ohxVar.zzx = str;
    }

    public static /* synthetic */ void y(ohx ohxVar, String str) {
        str.getClass();
        ohxVar.zzd |= 16384;
        ohxVar.zzt = str;
    }

    public static /* synthetic */ void z(ohx ohxVar, whx whxVar) {
        ohxVar.zzT = whxVar;
        ohxVar.zze |= 4;
    }

    @Override // defpackage.jmx
    public final Object i(int i, jmx jmxVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzax);
        }
        if (i2 == 2) {
            return new jnx(zzb, "\u0001F\u0000\u0002\u0001FF\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌(*ဉ)+\u001b,᠌\u001a-ဇ*.ဇ+/᠌,0ဉ-1င\u00172ဉ.3ဉ/4ဉ15ဉ26ဉ37᠌48᠌59᠌6:\u001b;ဈ\u000f<ဉ7=ဉ0>ဉ\u0013?ဉ\"@င\u0010Aဉ8Bဉ'Cဉ9Dဉ:Eဉ;Fဉ<", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", ofc.n, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", tix.class, "zzA", bjx.class, "zzB", jix.class, "zzC", yjx.class, "zzE", i9w.j, "zzI", "zzJ", mix.class, "zzK", "zzM", ovn.l, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", gos.o, "zzG", "zzV", "zzW", "zzX", "zzY", ygx.class, "zzaa", ehv.k, "zzab", "zzac", jhx.class, "zzL", mvn.l, "zzad", "zzae", "zzaf", x2i.m, "zzag", "zzH", "zzah", "zzai", "zzak", "zzal", "zzam", "zzan", y9w.i, "zzao", l48.l, "zzap", i9w.i, "zzaq", hkx.class, "zzu", "zzar", "zzaj", "zzD", "zzT", "zzv", "zzas", "zzZ", "zzat", "zzau", "zzav", "zzaw"});
        }
        if (i2 == 3) {
            return new ohx();
        }
        if (i2 == 4) {
            return new nhx(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzax = jmxVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final ihx m() {
        ihx ihxVar = this.zzS;
        return ihxVar == null ? ihx.o() : ihxVar;
    }
}
