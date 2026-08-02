package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.compose.ui.node.d;
import androidx.media3.common.ParserException;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.loading.b;
import io.flutter.plugins.camerax.CameraXError;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class zk91 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1710619314);
        if (btsVar.V(i & 1, i != 0)) {
            b.a(ljs0.e(ljs0.c(an91.m(c530.a, 16.0f, 0.0f, 2), 1.0f), 56.0f), cyk0.c(16.0f), false, null, null, null, false, btsVar, 6, 252);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 15);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(211055443);
        if (btsVar.V(i & 1, i != 0)) {
            byk0 c = cyk0.c(100.0f);
            c530 c530Var = c530.a;
            b.a(ljs0.e(ljs0.q(an91.m(c530Var, 16.0f, 0.0f, 2), 118.0f), 19.0f), c, false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            f530 o = an91.o(c530Var, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            ButtonSize buttonSize = ButtonSize.S;
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new bgc(12);
                btsVar.o0(Q);
            }
            u8d.a.getClass();
            d17.c(o, false, buttonSize, buttonStyle, null, (sls) Q, u8d.d, btsVar, 1772982, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 14);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-547206568);
        if (btsVar.V(i & 1, i != 0)) {
            b.a(ljs0.e(ljs0.q(an91.m(c530.a, 16.0f, 0.0f, 2), 311.0f), 19.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 6, 252);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 12);
        }
    }

    public static final void d(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(881916136);
        if (btsVar.V(i & 1, i != 0)) {
            u8d.a.getClass();
            ydb1.a(null, null, u8d.c, null, null, null, null, false, btsVar, 384, 251);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 13);
        }
    }

    public static final void e(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1303554811);
        if (btsVar.V(i & 1, i != 0)) {
            f530 d = i9a1.d(i9a1.f(ljs0.c));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            u8d.a.getClass();
            crb1.c(null, u8d.b, null, null, null, null, null, btsVar, 48, HProv.PP_DELETE_KEYSET);
            d(btsVar, 0);
            c(btsVar, 0);
            c530 c530Var = c530.a;
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            a(btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 32.0f));
            b(btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 11);
        }
    }

    public static boolean f(c5p c5pVar) {
        ef90 ef90Var = new ef90(8);
        int i = h0n.d(c5pVar, ef90Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        c5pVar.g(0, 4, ef90Var.a);
        ef90Var.K(0);
        int k = ef90Var.k();
        if (k == 1463899717) {
            return true;
        }
        lk91.e("WavHeaderReader", "Unsupported form type: " + k);
        return false;
    }

    public static boolean g(double d) {
        if (bl91.d(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(bl91.c(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean h(double d) {
        if (d > 0.0d && bl91.d(d)) {
            long c = bl91.c(d);
            if ((c & (c - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(double d) {
        boolean h;
        RoundingMode roundingMode = RoundingMode.CEILING;
        ffx.l("x must be positive and finite", d > 0.0d && bl91.d(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return i(d * 4.503599627370496E15d) - 52;
        }
        switch (u5m.a[roundingMode.ordinal()]) {
            case 1:
                if (!h(d)) {
                    w511.w("mode was UNNECESSARY, but rounding was necessary");
                    break;
                }
                if (!r2) {
                    break;
                }
                break;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !h(d);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                h = h(d);
                r2 &= !h;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                h = h(d);
                r2 &= !h;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                ny61.w();
                break;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (java.lang.Math.abs(r10 - r0) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long j(double d, RoundingMode roundingMode) {
        double d2;
        long j;
        long j2;
        if (!bl91.d(d)) {
            w511.w("input is infinite or NaN");
            return 0L;
        }
        long j3 = 1;
        switch (u5m.a[roundingMode.ordinal()]) {
            case 1:
                if (!g(d)) {
                    w511.w("mode was UNNECESSARY, but rounding was necessary");
                    return 0L;
                }
                d2 = d;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + roundingMode);
            case 2:
                if (d < 0.0d && !g(d)) {
                    j = ((long) d) - 1;
                    d2 = j;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d > 0.0d && !g(d)) {
                    j2 = (long) d;
                    j = j2 + j3;
                    d2 = j;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!g(d)) {
                    j2 = (long) d;
                    j3 = d > 0.0d ? 1 : -1;
                    j = j2 + j3;
                    d2 = j;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d);
                if (Math.abs(d - d2) == 0.5d) {
                    d2 = Math.copySign(0.5d, d) + d;
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d);
                break;
            default:
                ny61.w();
                return 0L;
        }
    }

    public static void k(tt5 tt5Var, final v83 v83Var) {
        rs10 j = v83Var != null ? v83Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.pigeon_defaultConstructor", j, obj);
        if (v83Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: atb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i2 = i;
                    v83 v83Var2 = v83Var;
                    switch (i2) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new v3x0(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            v3x0 v3x0Var = (v3x0) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 9);
                            v83Var2.getClass();
                            n2v0 n2v0Var = new n2v0(8, wrb0Var);
                            pbj pbjVar = v3x0Var.b.a;
                            Context context = (Context) pbjVar.A;
                            if (!(context instanceof Activity)) {
                                ny61.r("Activity must be set to request camera permissions.");
                                break;
                            } else {
                                cs7 cs7Var = v3x0Var.a;
                                Activity activity = (Activity) context;
                                m6 m6Var = (m6) pbjVar.a;
                                n2v0 n2v0Var2 = new n2v0(7, n2v0Var);
                                if (!cs7Var.a) {
                                    if (qke.h(activity, "android.permission.CAMERA") == 0 && (!booleanValue || qke.h(activity, "android.permission.RECORD_AUDIO") == 0)) {
                                        n2v0Var2.h(null);
                                        break;
                                    } else {
                                        ((wrr) ((l40) m6Var.b)).b(new bs7(new e90(6, cs7Var, n2v0Var2)));
                                        cs7Var.a = true;
                                        androidx.core.app.b.J(activity, booleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                                        break;
                                    }
                                } else {
                                    n2v0Var2.h(new as7("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once."));
                                    break;
                                }
                            }
                        default:
                            List list2 = (List) obj2;
                            v3x0 v3x0Var2 = (v3x0) list2.get(0);
                            String str = (String) list2.get(1);
                            String str2 = (String) list2.get(2);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(v83.a(v3x0Var2, str, str2));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.requestCameraPermissions", j, obj);
        if (v83Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: atb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i22 = i2;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new v3x0(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            v3x0 v3x0Var = (v3x0) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 9);
                            v83Var2.getClass();
                            n2v0 n2v0Var = new n2v0(8, wrb0Var);
                            pbj pbjVar = v3x0Var.b.a;
                            Context context = (Context) pbjVar.A;
                            if (!(context instanceof Activity)) {
                                ny61.r("Activity must be set to request camera permissions.");
                                break;
                            } else {
                                cs7 cs7Var = v3x0Var.a;
                                Activity activity = (Activity) context;
                                m6 m6Var = (m6) pbjVar.a;
                                n2v0 n2v0Var2 = new n2v0(7, n2v0Var);
                                if (!cs7Var.a) {
                                    if (qke.h(activity, "android.permission.CAMERA") == 0 && (!booleanValue || qke.h(activity, "android.permission.RECORD_AUDIO") == 0)) {
                                        n2v0Var2.h(null);
                                        break;
                                    } else {
                                        ((wrr) ((l40) m6Var.b)).b(new bs7(new e90(6, cs7Var, n2v0Var2)));
                                        cs7Var.a = true;
                                        androidx.core.app.b.J(activity, booleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                                        break;
                                    }
                                } else {
                                    n2v0Var2.h(new as7("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once."));
                                    break;
                                }
                            }
                        default:
                            List list2 = (List) obj2;
                            v3x0 v3x0Var2 = (v3x0) list2.get(0);
                            String str = (String) list2.get(1);
                            String str2 = (String) list2.get(2);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(v83.a(v3x0Var2, str, str2));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.getTempFilePath", j, obj);
        if (v83Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: atb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i22 = i3;
                    v83 v83Var2 = v83Var;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) v83Var2.a.w).j(((Long) ((List) obj2).get(0)).longValue(), new v3x0(v83Var2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            v3x0 v3x0Var = (v3x0) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            wrb0 wrb0Var = new wrb0(ce5Var, 9);
                            v83Var2.getClass();
                            n2v0 n2v0Var = new n2v0(8, wrb0Var);
                            pbj pbjVar = v3x0Var.b.a;
                            Context context = (Context) pbjVar.A;
                            if (!(context instanceof Activity)) {
                                ny61.r("Activity must be set to request camera permissions.");
                                break;
                            } else {
                                cs7 cs7Var = v3x0Var.a;
                                Activity activity = (Activity) context;
                                m6 m6Var = (m6) pbjVar.a;
                                n2v0 n2v0Var2 = new n2v0(7, n2v0Var);
                                if (!cs7Var.a) {
                                    if (qke.h(activity, "android.permission.CAMERA") == 0 && (!booleanValue || qke.h(activity, "android.permission.RECORD_AUDIO") == 0)) {
                                        n2v0Var2.h(null);
                                        break;
                                    } else {
                                        ((wrr) ((l40) m6Var.b)).b(new bs7(new e90(6, cs7Var, n2v0Var2)));
                                        cs7Var.a = true;
                                        androidx.core.app.b.J(activity, booleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                                        break;
                                    }
                                } else {
                                    n2v0Var2.h(new as7("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once."));
                                    break;
                                }
                            }
                        default:
                            List list2 = (List) obj2;
                            v3x0 v3x0Var2 = (v3x0) list2.get(0);
                            String str = (String) list2.get(1);
                            String str2 = (String) list2.get(2);
                            try {
                                v83Var2.getClass();
                                g2 = Collections.singletonList(v83.a(v3x0Var2, str, str2));
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                    }
                }
            });
        }
    }

    public static h0n l(int i, c5p c5pVar, ef90 ef90Var) {
        h0n d = h0n.d(c5pVar, ef90Var);
        while (true) {
            int i2 = d.a;
            if (i2 == i) {
                return d;
            }
            xvz.v(i2, "Ignoring unknown WAV chunk: ");
            long j = d.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            c5pVar.O((int) j2);
            d = h0n.d(c5pVar, ef90Var);
        }
    }
}
