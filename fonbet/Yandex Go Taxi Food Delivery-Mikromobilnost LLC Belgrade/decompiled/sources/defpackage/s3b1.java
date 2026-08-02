package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.scooters.photocontrol.api.ScootersExamStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class s3b1 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(zh4 zh4Var, f530 f530Var, String str, a aVar, fid fidVar, int i, int i2) {
        int i3;
        String str2;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2087681904);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(zh4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            str2 = str;
            i3 |= btsVar.k(str2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.e(aVar) ? 2048 : 1024;
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
            } else {
                if (i4 != 0) {
                    str2 = null;
                }
                int i5 = i3 >> 3;
                z910 d = pi6.d(x4c.b, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = b.d(btsVar, f530Var);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, d);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d2);
                List list = zh4Var != null ? zh4Var.a : null;
                if (list == null) {
                    btsVar.e0(-1759698452);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-1759698451);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        b(str2, (xg4) it.next(), zh4Var.b, btsVar, (i5 & 112) | 6);
                    }
                    btsVar.t(false);
                }
                aVar.invoke(cj6.a, btsVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
                btsVar.t(true);
            }
            String str3 = str2;
            v = btsVar.v();
            if (v == null) {
                v.d = new p91(zh4Var, f530Var, str3, aVar, i, i2, 2);
                return;
            }
            return;
        }
        str2 = str;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        String str32 = str2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(String str, xg4 xg4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1391803140);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cj6.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(xg4Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(j690Var) ? 2048 : 1024;
        }
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (xg4Var instanceof ug4) {
            btsVar.e0(1787995276);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            i((ug4) xg4Var, j690Var, btsVar, (i4 & 896) | i3 | (i4 & 112));
            btsVar.t(false);
        } else if (xg4Var instanceof rg4) {
            btsVar.e0(1787999439);
            int i5 = i2 & 14;
            int i6 = i2 >> 3;
            e((rg4) xg4Var, j690Var, btsVar, (i6 & 896) | i5 | (i6 & 112));
            btsVar.t(false);
        } else if (xg4Var instanceof sg4) {
            btsVar.e0(1788003596);
            int i7 = i2 & 14;
            int i8 = i2 >> 3;
            g((sg4) xg4Var, j690Var, btsVar, (i8 & 896) | i7 | (i8 & 112));
            btsVar.t(false);
        } else if (xg4Var instanceof tg4) {
            btsVar.e0(1788007660);
            int i9 = i2 & 14;
            int i10 = i2 >> 3;
            h((tg4) xg4Var, j690Var, btsVar, (i10 & 896) | i9 | (i10 & 112));
            btsVar.t(false);
        } else {
            if (!(xg4Var instanceof wg4)) {
                throw unr0.y(1787993720, btsVar, false);
            }
            btsVar.e0(1788011756);
            j(str, (wg4) xg4Var, j690Var, btsVar, i2 & 8190);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(str, xg4Var, j690Var, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(v4v v4vVar, f530 f530Var, boolean z, String str, boolean z2, jt1 jt1Var, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        boolean z3;
        int i5;
        String str2;
        int i6;
        boolean z4;
        int i7;
        jt1 jt1Var2;
        sls slsVar2;
        int i8;
        bts btsVar;
        f530 f530Var3;
        boolean z5;
        String str3;
        aii0 v;
        jrv jrvVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1516652112);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(v4vVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= btsVar2.a(z3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    str2 = str;
                    i3 |= btsVar2.k(str2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        z4 = z2;
                        i3 |= btsVar2.a(z4) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ImageMetadata.EDGE_MODE;
                        } else if ((196608 & i) == 0) {
                            jt1Var2 = jt1Var;
                            i3 |= btsVar2.k(jt1Var2) ? 131072 : 65536;
                            if ((1572864 & i) != 0) {
                                slsVar2 = slsVar;
                                i3 |= btsVar2.e(slsVar2) ? 1048576 : 524288;
                            } else {
                                slsVar2 = slsVar;
                            }
                            i8 = i3;
                            if (btsVar2.V(i8 & 1, (599187 & i3) == 599186)) {
                                btsVar2.Y();
                                btsVar = btsVar2;
                                f530Var3 = f530Var2;
                                z5 = z3;
                                str3 = str2;
                            } else {
                                c530 c530Var = c530.a;
                                f530 f530Var4 = i9 != 0 ? c530Var : f530Var2;
                                boolean z6 = i4 != 0 ? true : z3;
                                String str4 = i5 != 0 ? null : str2;
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                if (i7 != 0) {
                                    jt1Var2 = x4c.y;
                                }
                                f530 l = ymb1.l(c530Var, ((YandexShapes) btsVar2.m(qm51.a)).e());
                                if (z4) {
                                    btsVar2.e0(-1508748841);
                                    jrv jrvVar2 = (jrv) btsVar2.m(lrv.a);
                                    btsVar2.t(false);
                                    jrvVar = jrvVar2;
                                } else {
                                    btsVar2.e0(473438989);
                                    btsVar2.t(false);
                                    jrvVar = null;
                                }
                                Object Q = btsVar2.Q();
                                if (Q == did.a) {
                                    Q = ly3.i(btsVar2);
                                }
                                f530 k = q791.a(l, (zx40) Q, jrvVar, z6, str4, new awk0(0), slsVar2).k(f530Var4);
                                z910 d = pi6.d(jt1Var2, false);
                                int hashCode = Long.hashCode(btsVar2.T);
                                r1b0 o = btsVar2.o();
                                f530 d2 = b.d(btsVar2, k);
                                ohd.G1.getClass();
                                sls slsVar3 = d.b;
                                if (btsVar2.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar2.i0();
                                if (btsVar2.S) {
                                    btsVar2.n(slsVar3);
                                } else {
                                    btsVar2.r0();
                                }
                                qje.W(btsVar2, d.f, d);
                                qje.W(btsVar2, d.e, o);
                                wls wlsVar = d.g;
                                if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar2, hashCode, wlsVar);
                                }
                                qje.W(btsVar2, d.d, d2);
                                f(v4vVar, null, null, btsVar2, i8 & 14, 6);
                                btsVar2.t(true);
                                btsVar = btsVar2;
                                f530Var3 = f530Var4;
                                z5 = z6;
                                str3 = str4;
                            }
                            boolean z7 = z4;
                            jt1 jt1Var3 = jt1Var2;
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new up5(v4vVar, f530Var3, z5, str3, z7, jt1Var3, slsVar, i, i2);
                                return;
                            }
                            return;
                        }
                        jt1Var2 = jt1Var;
                        if ((1572864 & i) != 0) {
                        }
                        i8 = i3;
                        if (btsVar2.V(i8 & 1, (599187 & i3) == 599186)) {
                        }
                        boolean z72 = z4;
                        jt1 jt1Var32 = jt1Var2;
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    z4 = z2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    jt1Var2 = jt1Var;
                    if ((1572864 & i) != 0) {
                    }
                    i8 = i3;
                    if (btsVar2.V(i8 & 1, (599187 & i3) == 599186)) {
                    }
                    boolean z722 = z4;
                    jt1 jt1Var322 = jt1Var2;
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                str2 = str;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z4 = z2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                jt1Var2 = jt1Var;
                if ((1572864 & i) != 0) {
                }
                i8 = i3;
                if (btsVar2.V(i8 & 1, (599187 & i3) == 599186)) {
                }
                boolean z7222 = z4;
                jt1 jt1Var3222 = jt1Var2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z4 = z2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            jt1Var2 = jt1Var;
            if ((1572864 & i) != 0) {
            }
            i8 = i3;
            if (btsVar2.V(i8 & 1, (599187 & i3) == 599186)) {
            }
            boolean z72222 = z4;
            jt1 jt1Var32222 = jt1Var2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z4 = z2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        jt1Var2 = jt1Var;
        if ((1572864 & i) != 0) {
        }
        i8 = i3;
        if (btsVar2.V(i8 & 1, (599187 & i3) == 599186)) {
        }
        boolean z722222 = z4;
        jt1 jt1Var322222 = jt1Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void d(tg4 tg4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1361868403);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(tg4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        int i4 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
            f530 b = cj6Var.b(an91.j(c530.a, j690Var));
            boolean c = btsVar.c(layoutDirection.ordinal()) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (c || Q == did.a) {
                Q = new w04(5, tg4Var, layoutDirection);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, b);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lh4(tg4Var, j690Var, i, i4);
        }
    }

    public static final void e(rg4 rg4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bjy bjyVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1701920681);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(rg4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            if (((Boolean) btsVar.m(qti.e)).booleanValue()) {
                bjyVar = rg4Var.b;
                if (bjyVar == null) {
                    bjyVar = rg4Var.a;
                }
            } else {
                bjyVar = rg4Var.a;
            }
            xab1.a(cj6Var.b(c530.a), null, wwg.S(-1856246463, true, new u5(28, j690Var, bjyVar), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(rg4Var, j690Var, i, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(v4v v4vVar, f530 f530Var, nhe nheVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        nhe nheVar2;
        f530 f530Var3;
        nhe nheVar3;
        aii0 v;
        f530 f530Var4;
        pa90 a;
        pa90 m;
        btz atzVar;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1344319079);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(v4vVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                nheVar2 = nheVar;
                i3 |= btsVar.k(nheVar2) ? 256 : 128;
                if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
                    f530 f530Var5 = i5 != 0 ? c530.a : f530Var2;
                    nhe nheVar4 = i4 != 0 ? mhe.b : nheVar2;
                    c36 c36Var = null;
                    btz btzVar = null;
                    if (v4vVar instanceof ztz) {
                        btsVar.e0(1960573991);
                        ztz ztzVar = (ztz) v4vVar;
                        if (ztzVar instanceof iuj0) {
                            Integer num = ((iuj0) ztzVar).a;
                            if (num != null) {
                                atzVar = new zsz(num.intValue());
                            }
                            if (btzVar != null) {
                                btsVar.e0(1960573990);
                                btsVar.t(false);
                                f530Var4 = f530Var5;
                                z = false;
                            } else {
                                btsVar.e0(1960573991);
                                f530Var4 = f530Var5;
                                z = false;
                                com.airbnb.lottie.compose.a.b((nsz) com.airbnb.lottie.compose.a.f(btzVar, btsVar, 0).getValue(), f530Var4, false, false, 0.0f, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, nheVar4, false, false, null, false, null, btsVar, (i3 & 112) | 1572864, (i3 << 12) & 3670016, 0, 4128700);
                                btsVar = btsVar;
                                btsVar.t(false);
                            }
                            btsVar.t(z);
                        } else {
                            if (!(ztzVar instanceof uvi0)) {
                                w511.b();
                                return;
                            }
                            atzVar = new atz(((uvi0) ztzVar).a);
                        }
                        btzVar = atzVar;
                        if (btzVar != null) {
                        }
                        btsVar.t(z);
                    } else {
                        f530Var4 = f530Var5;
                        if (v4vVar instanceof ra90) {
                            btsVar.e0(1960996304);
                            ra90 ra90Var = (ra90) v4vVar;
                            if (ra90Var instanceof cuj0) {
                                btsVar.e0(-1500786153);
                                a = mt71.m(((cuj0) ra90Var).a, 0, btsVar);
                                btsVar.t(false);
                            } else if (ra90Var instanceof lvi0) {
                                btsVar.e0(720354889);
                                lvi0 lvi0Var = (lvi0) ra90Var;
                                String str = lvi0Var.a;
                                if (str == null) {
                                    btsVar.e0(720354888);
                                    btsVar.t(false);
                                    a = null;
                                } else {
                                    btsVar.e0(720354889);
                                    kvi0 kvi0Var = lvi0Var.b;
                                    if (kvi0Var == null) {
                                        btsVar.e0(1315858849);
                                        btsVar.t(false);
                                        m = null;
                                    } else {
                                        btsVar.e0(1315858850);
                                        if (!(kvi0Var instanceof kvi0)) {
                                            throw unr0.y(-1497414897, btsVar, false);
                                        }
                                        btsVar.e0(-1497413869);
                                        m = mt71.m(kvi0Var.a, 0, btsVar);
                                        btsVar.t(false);
                                        btsVar.t(false);
                                    }
                                    a = ua3.b(str, m, null, btsVar, 10);
                                    btsVar.t(false);
                                }
                                btsVar.t(false);
                            } else {
                                if (!(ra90Var instanceof j4z)) {
                                    throw unr0.y(-1500786592, btsVar, false);
                                }
                                btsVar.e0(-1500761360);
                                a = kbm.a((Drawable) ((j4z) ra90Var).a.invoke(btsVar.m(AndroidCompositionLocals_androidKt.b)), btsVar);
                                btsVar.t(false);
                            }
                            if (a == null) {
                                btsVar.e0(1960996303);
                                btsVar.t(false);
                            } else {
                                btsVar.e0(1960996304);
                                String a2 = v4vVar.a();
                                btsVar.e0(959402274);
                                bfz0 c = v4vVar.c();
                                if (c == null) {
                                    btsVar.e0(-1454132211);
                                    btsVar.t(false);
                                    Boolean b = v4vVar.b();
                                    if (b != null ? b.booleanValue() : false) {
                                        btsVar.e0(-1453869981);
                                        c36Var = tse0.e(((el51) btsVar.m(gl51.a)).j(), 5, btsVar, false);
                                    } else {
                                        btsVar.e0(-1453804788);
                                        btsVar.t(false);
                                    }
                                } else {
                                    btsVar.e0(-1454132210);
                                    if (c instanceof afz0) {
                                        btsVar.e0(-1496003231);
                                        c36Var = tse0.e(rx21.a(((afz0) c).a, btsVar), 5, btsVar, false);
                                        btsVar.t(false);
                                    } else {
                                        if (!(c instanceof zez0)) {
                                            throw unr0.y(1891402958, btsVar, false);
                                        }
                                        btsVar.e0(-1495909487);
                                        c36Var = tse0.e(((zez0) c).a, 5, btsVar, false);
                                        btsVar.t(false);
                                    }
                                }
                                btsVar.t(false);
                                o4b1.b(a, a2, f530Var4, ra90Var.d(), nheVar4, 0.0f, c36Var, btsVar, ((i3 << 3) & 896) | ((i3 << 6) & HProv.ALG_CLASS_ALL), 32);
                                f530Var4 = f530Var4;
                                btsVar.t(false);
                            }
                            btsVar.t(false);
                        } else {
                            if (!(v4vVar instanceof xun)) {
                                throw unr0.y(894526106, btsVar, false);
                            }
                            btsVar.e0(1961390407);
                            btsVar.t(false);
                        }
                    }
                    f530Var3 = f530Var4;
                    nheVar3 = nheVar4;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    nheVar3 = nheVar2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new v4(v4vVar, f530Var3, nheVar3, i, i2, 14);
                    return;
                }
                return;
            }
            nheVar2 = nheVar;
            if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        nheVar2 = nheVar;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void g(sg4 sg4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2060659097);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(sg4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            lvi0 lvi0Var = sg4Var.a;
            f530 j = an91.j(c530.a, j690Var);
            Float f = sg4Var.b;
            f(lvi0Var, cj6Var.b(tra1.b(j, f != null ? f.floatValue() : 1.0f)), sg4Var.c, btsVar, 0, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(sg4Var, j690Var, i, 25);
        }
    }

    public static final void h(tg4 tg4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(545027109);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(tg4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = cj6Var.b(c530.a);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            d(tg4Var, j690Var, btsVar, (i2 & 896) | (i2 & 112) | 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lh4(tg4Var, j690Var, i, i4);
        }
    }

    public static final void i(ug4 ug4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-8080327);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(ug4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 j2 = an91.j(c530.a, j690Var);
            ldc ldcVar = ug4Var.a;
            if (ldcVar == null) {
                btsVar.e0(824749344);
                j = ((el51) btsVar.m(gl51.a)).d();
                btsVar.t(false);
            } else {
                btsVar.e0(824748290);
                btsVar.t(false);
                j = ldcVar.a;
            }
            pi6.a(cj6Var.b(m4m0.b(j2, j, qke.q)), btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(ug4Var, j690Var, i, 24);
        }
    }

    public static final void j(String str, wg4 wg4Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1795650634);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(wg4Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(j690Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            vg4 vg4Var = wg4Var.a;
            xg4 xg4Var = wg4Var.b;
            if (xg4Var == null || (xg4Var instanceof wg4)) {
                btsVar.e0(410833048);
                btsVar.t(false);
            } else {
                btsVar.e0(410713884);
                b(str, xg4Var, j690Var, btsVar, i2 & 7294);
                btsVar.t(false);
            }
            ru.yandex.taxi.logistics.sdk.ui.form.background.video.a.a(str, vg4Var, cj6Var.b(c530.a), j690Var, btsVar, (i2 & 7168) | ((i2 >> 3) & 14));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(str, wg4Var, j690Var, i, 13);
        }
    }

    public static final Set k(ajo0 ajo0Var) {
        List list = ajo0Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((rkn0) obj).b != ScootersExamStatus.NOT_REQUIRED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((rkn0) it.next()).a);
        }
        return kotlin.collections.a.N0(arrayList2);
    }
}
