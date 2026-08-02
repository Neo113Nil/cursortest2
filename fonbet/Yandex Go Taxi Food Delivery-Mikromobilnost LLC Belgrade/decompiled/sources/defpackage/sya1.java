package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.feature.savings.internal.entities.SavingsDashboardPollStatus;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class sya1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(au2 au2Var, f530 f530Var, String str, wp2 wp2Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        String str2;
        int i4;
        wp2 wp2Var2;
        f530 f530Var3;
        String str3;
        wp2 wp2Var3;
        aii0 v;
        int i5;
        f530 f530Var4;
        f530 f530Var5;
        String str4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(676168405);
        int i6 = (i & 6) == 0 ? (btsVar.k(au2Var) ? 4 : 2) | i : i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i6 |= btsVar.k(f530Var2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i6 |= btsVar.k(str2) ? 256 : 128;
                i4 = i2 & 8;
                if (i4 != 0) {
                    i6 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    wp2Var2 = wp2Var;
                    i6 |= btsVar.k(wp2Var2) ? 2048 : 1024;
                    if (btsVar.V(i6 & 1, (i6 & 1171) == 1170)) {
                        btsVar.Y();
                        f530Var3 = f530Var2;
                        str3 = str2;
                        wp2Var3 = wp2Var2;
                    } else {
                        f530 f530Var6 = c530.a;
                        if (i7 != 0) {
                            i5 = i4;
                            f530Var4 = f530Var6;
                        } else {
                            i5 = i4;
                            f530Var4 = f530Var2;
                        }
                        if (i3 != 0) {
                            str2 = null;
                        }
                        wp2 wp2Var4 = i5 != 0 ? tp2.a : wp2Var2;
                        long n = tje.n(wp2Var4, btsVar);
                        List<iu2> list = au2Var.a;
                        if (list.size() == 1) {
                            btsVar.e0(336553140);
                            iu2 iu2Var = (iu2) a.P(list);
                            o4b1.a(iu2Var.a, str2, f530Var4, iu2Var.b ? new c36(n, 5) : null, btsVar, ((i6 >> 3) & 112) | ((i6 << 3) & 896), 56);
                            btsVar.t(false);
                            f530Var5 = f530Var4;
                            str4 = str2;
                        } else {
                            f530 f530Var7 = f530Var4;
                            String str5 = str2;
                            f530 f530Var8 = f530Var7;
                            btsVar.e0(336826343);
                            o430 o430Var = did.a;
                            if (str5 != null) {
                                btsVar.e0(336855855);
                                boolean z = (i6 & 896) == 256;
                                Object Q = btsVar.Q();
                                if (z || Q == o430Var) {
                                    Q = new h0(str5, 8);
                                    btsVar.o0(Q);
                                }
                                f530Var6 = fnq0.b(f530Var6, false, (tls) Q);
                                btsVar.t(false);
                            } else {
                                btsVar.e0(336983575);
                                btsVar.t(false);
                            }
                            f530 k = f530Var8.k(f530Var6);
                            Object Q2 = btsVar.Q();
                            if (Q2 == o430Var) {
                                Q2 = fu2.a;
                                btsVar.o0(Q2);
                            }
                            z910 z910Var = (z910) Q2;
                            int hashCode = Long.hashCode(btsVar.T);
                            r1b0 o = btsVar.o();
                            f530 d = b.d(btsVar, k);
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
                            qje.W(btsVar, d.f, z910Var);
                            qje.W(btsVar, d.e, o);
                            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                            qje.M(btsVar, d.h);
                            qje.W(btsVar, d.d, d);
                            btsVar.e0(-1152619955);
                            for (iu2 iu2Var2 : list) {
                                o4b1.a(iu2Var2.a, null, null, iu2Var2.b ? new c36(n, 5) : null, btsVar, 48, 60);
                                f530Var8 = f530Var8;
                                str5 = str5;
                            }
                            f530Var5 = f530Var8;
                            str4 = str5;
                            tse0.t(btsVar, false, true, false);
                        }
                        wp2Var3 = wp2Var4;
                        f530Var3 = f530Var5;
                        str3 = str4;
                    }
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new p91(au2Var, f530Var3, str3, wp2Var3, i, i2, 1);
                        return;
                    }
                    return;
                }
                wp2Var2 = wp2Var;
                if (btsVar.V(i6 & 1, (i6 & 1171) == 1170)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            str2 = str;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            wp2Var2 = wp2Var;
            if (btsVar.V(i6 & 1, (i6 & 1171) == 1170)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        wp2Var2 = wp2Var;
        if (btsVar.V(i6 & 1, (i6 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(final k1u k1uVar, final androidx.compose.runtime.internal.a aVar, fid fidVar, final int i) {
        int i2;
        aii0 aii0Var;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-359399834);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(k1uVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            n1u n1uVar = k1uVar.f;
            final int i5 = n1uVar.b;
            final int i6 = n1uVar.a;
            if (i5 <= 0 || i6 <= 0) {
                aii0Var = btsVar.v();
                if (aii0Var != null) {
                    wlsVar = new wls() { // from class: f1u
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i3;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            androidx.compose.runtime.internal.a aVar2 = aVar;
                            k1u k1uVar2 = k1uVar;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    sya1.b(k1uVar2, aVar2, fidVar2, vng.O(i8 | 1));
                                    break;
                                default:
                                    sya1.b(k1uVar2, aVar2, fidVar2, vng.O(i8 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    aii0Var.d = wlsVar;
                }
                return;
            }
            xab1.a(an91.j(ljs0.c(c530.a, 1.0f), k1uVar.g), null, wwg.S(235053392, true, new zls() { // from class: g1u
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    dj6 dj6Var = (dj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                    }
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                        float d = dj6Var.d();
                        k1u k1uVar2 = k1uVar;
                        float f = k1uVar2.e;
                        int i7 = i5;
                        float f2 = (d - (f * (i7 - 1))) / i7;
                        int i8 = i6;
                        f530 n = ljs0.n(c530.a, dj6Var.d(), (k1uVar2.d * (i8 - 1)) + (i8 * f2));
                        float f3 = k1uVar2.e;
                        boolean k = btsVar2.k(k1uVar2) | btsVar2.c(i7) | btsVar2.c(i8);
                        androidx.compose.runtime.internal.a aVar2 = aVar;
                        boolean k2 = btsVar2.k(aVar2) | k;
                        Object Q = btsVar2.Q();
                        if (k2 || Q == did.a) {
                            h1u h1uVar = new h1u(i7, i8, 0, k1uVar2, aVar2);
                            btsVar2.o0(h1uVar);
                            Q = h1uVar;
                        }
                        veb1.a(n, i7, i8, f2, f2, f3, k1uVar2, (tls) Q, btsVar2, 0, 0);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
        } else {
            btsVar.Y();
        }
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            wlsVar = new wls() { // from class: f1u
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i4;
                    zy11 zy11Var = zy11.a;
                    int i8 = i;
                    androidx.compose.runtime.internal.a aVar2 = aVar;
                    k1u k1uVar2 = k1uVar;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            sya1.b(k1uVar2, aVar2, fidVar2, vng.O(i8 | 1));
                            break;
                        default:
                            sya1.b(k1uVar2, aVar2, fidVar2, vng.O(i8 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            aii0Var.d = wlsVar;
        }
    }

    public static final boolean c(SavingsDashboardPollStatus savingsDashboardPollStatus) {
        int i = bbm0.a[savingsDashboardPollStatus.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            w511.b();
        }
        return false;
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String p;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                p = "null";
            } else {
                try {
                    p = obj.toString();
                } catch (Exception e) {
                    String p2 = g8e.p(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(p2), (Throwable) e);
                    p = unr0.p("<", p2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = p;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(Extension.FIX_SPACE);
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
