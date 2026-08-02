package androidx.compose.material;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.act;
import defpackage.af;
import defpackage.afg;
import defpackage.apo;
import defpackage.b2c;
import defpackage.bci;
import defpackage.bpo;
import defpackage.bxj;
import defpackage.cci;
import defpackage.dup;
import defpackage.dur;
import defpackage.es5;
import defpackage.g0g;
import defpackage.gld;
import defpackage.gq5;
import defpackage.grb;
import defpackage.hq5;
import defpackage.hyf;
import defpackage.ild;
import defpackage.ivp;
import defpackage.iz2;
import defpackage.jx7;
import defpackage.k9i;
import defpackage.ka0;
import defpackage.kai;
import defpackage.kb5;
import defpackage.kfh;
import defpackage.ksw;
import defpackage.kvp;
import defpackage.kya;
import defpackage.lbi;
import defpackage.mbi;
import defpackage.mm6;
import defpackage.nbi;
import defpackage.nfp;
import defpackage.o2g;
import defpackage.obi;
import defpackage.oq5;
import defpackage.ouj;
import defpackage.pa5;
import defpackage.pbi;
import defpackage.pk0;
import defpackage.pp0;
import defpackage.q5g;
import defpackage.qbi;
import defpackage.sdr;
import defpackage.tm0;
import defpackage.ug3;
import defpackage.vci;
import defpackage.vnj;
import defpackage.wn5;
import defpackage.wp5;
import defpackage.wxi;
import defpackage.xbi;
import defpackage.xce;
import defpackage.xmn;
import defpackage.xp3;
import defpackage.xp5;
import defpackage.y5;
import defpackage.yci;
import defpackage.zai;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a {
    public static final float a = 56;
    public static final float b = 125;
    public static final float c = 640;

    /* JADX WARN: Removed duplicated region for block: B:120:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(wn5 wn5Var, yci yciVar, bci bciVar, boolean z, dup dupVar, float f, long j, long j2, long j3, wn5 wn5Var2, hq5 hq5Var, int i, int i2) {
        int i3;
        boolean z2;
        dup dupVar2;
        int i4;
        boolean z3;
        dup dupVar3;
        long j4;
        xmn r;
        dup dupVar4;
        dup dupVar5;
        int i5;
        long b2;
        yci yciVar2;
        int i6;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-92970288);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(bciVar) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    dupVar2 = dupVar;
                    if (oq5Var.f(dupVar2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    dupVar2 = dupVar;
                }
                i6 = RemoteCameraConfig.Notification.ID;
                i3 |= i6;
            } else {
                dupVar2 = dupVar;
            }
            if ((196608 & i) == 0) {
                i3 |= oq5Var.c(f) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                i3 |= oq5Var.e(j) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= RemoteCameraConfig.Camera.BITRATE;
            }
            int i8 = i3;
            if ((100663296 & i) != 0) {
                i4 = i8 | (oq5Var.e(j3) ? 67108864 : 33554432);
            } else {
                i4 = i8;
            }
            if ((i & 805306368) == 0) {
                i4 |= oq5Var.h(wn5Var2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            if (oq5Var.P(i4 & 1, (306783379 & i4) == 306783378)) {
                oq5Var.S();
                z3 = z2;
                dupVar3 = dupVar2;
                j4 = j2;
            } else {
                oq5Var.U();
                if ((i & 1) == 0 || oq5Var.y()) {
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 16) != 0) {
                        dupVar4 = ((ivp) oq5Var.j(kvp.a)).c;
                        i4 &= -57345;
                    } else {
                        dupVar4 = dupVar2;
                    }
                    dupVar5 = dupVar4;
                    i5 = i4 & (-29360129);
                    b2 = pa5.b(j, oq5Var);
                } else {
                    oq5Var.S();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    b2 = j2;
                    i5 = i4 & (-29360129);
                    dupVar5 = dupVar2;
                }
                boolean z4 = z2;
                oq5Var.q();
                Object K = oq5Var.K();
                Object obj = gq5.a;
                if (K == obj) {
                    K = gld.R(g.a, oq5Var);
                    oq5Var.k0(K);
                }
                mm6 mm6Var = (mm6) K;
                bxj bxjVar = bxj.a;
                iz2 iz2Var = b2c.b;
                kfh d = ug3.d(iz2Var, false);
                int i9 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, yciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, d, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                yci yciVar3 = vci.a;
                yci c2 = d.c(yciVar3, 1.0f);
                kfh d2 = ug3.d(iz2Var, false);
                int i10 = oq5Var.P;
                dup dupVar6 = dupVar5;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, c2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, oq5Var, i10, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                wn5Var2.invoke(oq5Var, Integer.valueOf((i5 >> 27) & 14));
                boolean h = oq5Var.h(bciVar) | oq5Var.h(mm6Var);
                Object K2 = oq5Var.K();
                if (h || K2 == obj) {
                    K2 = new lbi(bciVar, mm6Var, 0);
                    oq5Var.k0(K2);
                }
                Function0 function0 = (Function0) K2;
                ka0 ka0Var = bciVar.b;
                Object value = ka0Var.h.getValue();
                cci cciVar = cci.a;
                b(j3, function0, value != cciVar, oq5Var, (i5 >> 24) & 14);
                oq5Var.p(true);
                yci d3 = d.d(d.t(b.a.a(yciVar3, b2c.c), 0.0f, c, 1), 1.0f);
                if (z4) {
                    oq5Var.Z(-892908339);
                    boolean f2 = oq5Var.f(ka0Var);
                    Object K3 = oq5Var.K();
                    if (f2 || K3 == obj) {
                        K3 = new zai(ka0Var);
                        oq5Var.k0(K3);
                    }
                    yciVar2 = androidx.compose.ui.input.nestedscroll.a.a(yciVar3, (wxi) K3, null);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-167335778);
                    oq5Var.p(false);
                    yciVar2 = yciVar3;
                }
                yci f3 = d3.f(yciVar2).f(new DraggableAnchorsElement(ka0Var, new y5(21, bciVar)));
                ka0 ka0Var2 = bciVar.b;
                yci o = xp3.o(f3, ka0Var2, bxjVar, z4 && ka0Var2.g.getValue() != cciVar, false, 56);
                if (z4) {
                    oq5Var.Z(-891907876);
                    boolean h2 = oq5Var.h(bciVar) | oq5Var.h(mm6Var);
                    Object K4 = oq5Var.K();
                    if (h2 || K4 == obj) {
                        K4 = new afg(3, bciVar, mm6Var);
                        oq5Var.k0(K4);
                    }
                    yciVar3 = nfp.b(yciVar3, false, (Function1) K4);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-167257346);
                    oq5Var.p(false);
                }
                dupVar3 = dupVar6;
                long j5 = b2;
                q5g.k(o.f(yciVar3), dupVar3, j, j5, null, f, ild.C(17396558, new pp0(wn5Var, 5), oq5Var), oq5Var, ((i5 >> 9) & 112) | ScreenMirroringConfig.Video.BITRATE_1_5MB | ((i5 >> 12) & 896) | (i5 & 458752), 16);
                oq5Var = oq5Var;
                oq5Var.p(true);
                j4 = j5;
                z3 = z4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mbi(wn5Var, yciVar, bciVar, z3, dupVar3, f, j, j4, j3, wn5Var2, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        int i82 = i3;
        if ((100663296 & i) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (oq5Var.P(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean, int] */
    public static final void b(long j, Function0 function0, boolean z, hq5 hq5Var, int i) {
        int i2;
        boolean z2;
        ?? r12;
        yci yciVar;
        yci f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-526532668);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if (!oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            oq5Var.S();
        } else if (j != 16) {
            oq5Var.Z(477792612);
            Continuation continuation = null;
            sdr b2 = pk0.b(z ? 1.0f : 0.0f, new act(0, (kya) null, 7), null, null, oq5Var, 48, 28);
            String I = hyf.I(2, oq5Var);
            vci vciVar = vci.a;
            Object obj = gq5.a;
            if (z) {
                oq5Var.Z(478010511);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object K = oq5Var.K();
                if (z3 || K == obj) {
                    K = new af(function0, continuation, 1);
                    oq5Var.k0(K);
                }
                f = vciVar.f(new SuspendPointerInputElement(function0, null, null, new dur((Function2) K), 6));
                boolean f2 = (i3 == 32) | oq5Var.f(I);
                Object K2 = oq5Var.K();
                if (f2 || K2 == obj) {
                    K2 = new pbi(I, function0, 0);
                    oq5Var.k0(K2);
                }
                z2 = true;
                yciVar = nfp.b(f, true, (Function1) K2);
                r12 = 0;
                oq5Var.p(false);
            } else {
                z2 = true;
                r12 = 0;
                oq5Var.Z(478374234);
                oq5Var.p(false);
                yciVar = vciVar;
            }
            yci f3 = d.c(vciVar, 1.0f).f(yciVar);
            if ((i2 & 14) != 4) {
                z2 = r12;
            }
            boolean f4 = oq5Var.f(b2) | z2;
            Object K3 = oq5Var.K();
            if (f4 || K3 == obj) {
                K3 = new nbi(j, b2, 1);
                oq5Var.k0(K3);
            }
            ksw.j(r12, oq5Var, f3, (Function1) K3);
            oq5Var.p(r12);
        } else {
            oq5Var.Z(478559490);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new obi(j, function0, z, i, 1);
        }
    }

    public static final bci c(cci cciVar, tm0 tm0Var, boolean z, hq5 hq5Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            tm0Var = kai.b;
        }
        Object obj = k9i.D;
        int i3 = 0;
        if ((i2 & 8) != 0) {
            z = false;
        }
        oq5 oq5Var = (oq5) hq5Var;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        oq5Var.W(976451635, cciVar);
        Object[] objArr = {cciVar, tm0Var, Boolean.valueOf(z), obj, jx7Var};
        xce xceVar = xce.H;
        xbi xbiVar = new xbi(jx7Var, tm0Var, z);
        apo apoVar = bpo.a;
        apo apoVar2 = new apo(i3, xceVar, xbiVar);
        boolean z2 = true;
        boolean f = ((((i & 14) ^ 6) > 4 && oq5Var.f(cciVar)) || (i & 6) == 4) | oq5Var.f(jx7Var) | oq5Var.f(obj) | oq5Var.h(tm0Var);
        if ((((i & 7168) ^ 3072) <= 2048 || !oq5Var.g(z)) && (i & 3072) != 2048) {
            z2 = false;
        }
        boolean z3 = f | z2;
        Object K = oq5Var.K();
        if (z3 || K == gq5.a) {
            K = new qbi(cciVar, jx7Var, tm0Var, z);
            oq5Var.k0(K);
        }
        bci bciVar = (bci) o2g.g0(objArr, apoVar2, (Function0) K, oq5Var, 0, 4);
        oq5Var.p(false);
        return bciVar;
    }
}
