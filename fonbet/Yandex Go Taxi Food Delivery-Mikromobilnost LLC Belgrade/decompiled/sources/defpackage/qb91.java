package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.masstransit.design.compose.route.Ellipse$Size;
import com.ybsdk.core.common.data.network.dto.Me2MeInfo;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import com.ybsdk.core.common.data.network.dto.SavingsAccountInfo;
import com.ybsdk.core.common.data.network.dto.YandexAccountInfo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class qb91 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, zrm zrmVar, float f, Float f2, ldc ldcVar, fid fidVar, int i, int i2) {
        Float f3;
        int i3;
        ldc ldcVar2;
        int i4;
        Float f4;
        float f5;
        aii0 v;
        float w;
        bts btsVar = (bts) fidVar;
        btsVar.g0(437279431);
        int i5 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(zrmVar) ? 32 : 16);
        int i6 = i5 | 3456;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i5 | 28032;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            f3 = f2;
            i6 |= btsVar.k(f3) ? 16384 : 8192;
            i3 = i2 & 32;
            if (i3 == 0) {
                i6 |= ImageMetadata.EDGE_MODE;
            } else if ((196608 & i) == 0) {
                ldcVar2 = ldcVar;
                i6 |= btsVar.k(ldcVar2) ? 131072 : 65536;
                i4 = i6 | 1572864;
                if (btsVar.V(i4 & 1, (599187 & i4) != 599186)) {
                    if (i7 != 0) {
                        f3 = null;
                    }
                    if (i3 != 0) {
                        ldcVar2 = null;
                    }
                    Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
                    if (f3 != null) {
                        w = tje.x(context, f3.floatValue());
                    } else {
                        int i8 = lrn.a[((Ellipse$Size) zrmVar.b).ordinal()];
                        if (i8 == 1) {
                            w = tje.w(2, context);
                        } else {
                            if (i8 != 2) {
                                w511.b();
                                return;
                            }
                            w = tje.w(4, context);
                        }
                    }
                    long d = ldcVar2 != null ? ldcVar2.a : rzo.d(s8o.m((kdc) zrmVar.c, context));
                    float w2 = tje.w(2, context);
                    uo5 uo5Var = x4c.y;
                    z910 d2 = pi6.d(uo5Var, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d3 = b.d(btsVar, f530Var);
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
                    qje.W(btsVar, d.f, d2);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d3);
                    f530 a = cj6.a.a(ljs0.c, uo5Var);
                    boolean b = btsVar.b(w) | btsVar.d(d) | btsVar.b(w2);
                    Object Q = btsVar.Q();
                    if (b || Q == did.a) {
                        yvd yvdVar = new yvd(d, w, 1.0f, w2);
                        btsVar.o0(yvdVar);
                        Q = yvdVar;
                    }
                    qeb1.a(0, btsVar, (tls) Q, a);
                    btsVar.t(true);
                    f4 = f3;
                    f5 = 1.0f;
                } else {
                    btsVar.Y();
                    f4 = f3;
                    f5 = f;
                }
                ldc ldcVar3 = ldcVar2;
                v = btsVar.v();
                if (v != null) {
                    v.d = new utm(f530Var, zrmVar, f5, f4, ldcVar3, i, i2);
                    return;
                }
                return;
            }
            ldcVar2 = ldcVar;
            i4 = i6 | 1572864;
            if (btsVar.V(i4 & 1, (599187 & i4) != 599186)) {
            }
            ldc ldcVar32 = ldcVar2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f3 = f2;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        ldcVar2 = ldcVar;
        i4 = i6 | 1572864;
        if (btsVar.V(i4 & 1, (599187 & i4) != 599186)) {
        }
        ldc ldcVar322 = ldcVar2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final kdc b(k911 k911Var) {
        kdc kdcVar;
        gdc gdcVar = new gdc(mqg0.transparent);
        if (k911Var instanceof h911) {
            kdcVar = ((h911) k911Var).a;
        } else if (k911Var instanceof i911) {
            kdcVar = ((i911) k911Var).a;
        } else {
            if (!jl40.l(k911Var, f911.a) && !jl40.l(k911Var, g911.a) && !jl40.l(k911Var, j911.a)) {
                w511.b();
                return null;
            }
            kdcVar = null;
        }
        return kdcVar == null ? gdcVar : kdcVar;
    }

    public static nxi c(jwi jwiVar) {
        return new nxi(0L, jwiVar.f(rzo.a0(0L)));
    }

    public static ca31 d(String str) {
        String group;
        if (str == null || evu0.J(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 != null) {
            return new ca31(parseInt, parseInt2, Integer.parseInt(group3), matcher.group(4) != null ? matcher.group(4) : "");
        }
        return null;
    }

    public static final PaymentMethodInfoDto e(h5a0 h5a0Var) {
        PaymentMethodTypeDto paymentMethodTypeDto;
        if (h5a0Var instanceof c5a0) {
            paymentMethodTypeDto = PaymentMethodTypeDto.CARD;
        } else if (h5a0Var instanceof e5a0) {
            paymentMethodTypeDto = PaymentMethodTypeDto.ME2ME;
        } else if (h5a0Var instanceof g5a0) {
            paymentMethodTypeDto = PaymentMethodTypeDto.YANDEX_ACCOUNT;
        } else {
            if (!(h5a0Var instanceof f5a0)) {
                w511.b();
                return null;
            }
            paymentMethodTypeDto = PaymentMethodTypeDto.SAVINGS_ACCOUNT;
        }
        e5a0 e5a0Var = h5a0Var instanceof e5a0 ? (e5a0) h5a0Var : null;
        Me2MeInfo me2MeInfo = e5a0Var != null ? new Me2MeInfo(e5a0Var.f) : null;
        f5a0 f5a0Var = h5a0Var instanceof f5a0 ? (f5a0) h5a0Var : null;
        SavingsAccountInfo savingsAccountInfo = f5a0Var != null ? new SavingsAccountInfo(f5a0Var.e) : null;
        g5a0 g5a0Var = h5a0Var instanceof g5a0 ? (g5a0) h5a0Var : null;
        return new PaymentMethodInfoDto(paymentMethodTypeDto, me2MeInfo, savingsAccountInfo, g5a0Var != null ? new YandexAccountInfo(g5a0Var.h) : null);
    }

    public static Parcelable f(Bundle bundle, String str) {
        ClassLoader classLoader = qb91.class.getClassLoader();
        cvw.l(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void g(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable f = f(bundle, "MapOptions");
        if (f != null) {
            h(bundle2, "MapOptions", f);
        }
        Parcelable f2 = f(bundle, "StreetViewPanoramaOptions");
        if (f2 != null) {
            h(bundle2, "StreetViewPanoramaOptions", f2);
        }
        Parcelable f3 = f(bundle, "camera");
        if (f3 != null) {
            h(bundle2, "camera", f3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void h(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = qb91.class.getClassLoader();
        cvw.l(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
