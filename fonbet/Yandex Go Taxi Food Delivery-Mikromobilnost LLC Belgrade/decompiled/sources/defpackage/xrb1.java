package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.slot.SlotSize;
import com.ybsdk.core.utils.ui.core.CoreOutlineProvider;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class xrb1 {
    public static final void a(e47 e47Var, e47 e47Var2, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1158171437);
        int i2 = i | (btsVar.k(e47Var) ? 4 : 2) | (btsVar.k(e47Var2) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        int i3 = 0;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 m = an91.m(c530.a, 8.0f, 0.0f, 2);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            int i5 = ((i2 >> 6) & 14) | 12607488;
            float f = 1.0f;
            vcb1.a(slsVar, an91.l(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 4.0f, 8.0f), e47Var.b, null, ButtonStyle.Minor, null, null, wwg.S(1374469575, true, new vj50(e47Var, i3), btsVar), null, null, null, btsVar, i5, 0, 3944);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            vcb1.a(slsVar2, an91.l(new x2y(f, true), 4.0f, 8.0f), e47Var2.b, null, ButtonStyle.Main, null, null, wwg.S(-1051800272, true, new vj50(e47Var2, i4), btsVar), null, null, null, btsVar, ((i2 >> 9) & 14) | 12607488, 0, 3944);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(e47Var, e47Var2, slsVar, slsVar2, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ibp0 ibp0Var, int i, f530 f530Var, fid fidVar, int i2, int i3) {
        int i4;
        f530 f530Var2;
        int i5;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-664171533);
        if ((i2 & 6) == 0) {
            i4 = (btsVar.k(ibp0Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.c(i) ? 32 : 16;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f530Var2 = f530Var;
            i4 |= btsVar.k(f530Var2) ? 256 : 128;
            i5 = i4 | 27648;
            if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
                btsVar.Y();
                f530Var3 = f530Var2;
            } else {
                c530 c530Var = c530.a;
                f530Var3 = i6 != 0 ? c530Var : f530Var2;
                int i7 = i5 >> 3;
                SlotSize c = ibp0Var.c();
                f530 b = ljs0.b(f530Var3, 0.0f, c.getSize(), 1);
                z910 d = pi6.d(x4c.y, false);
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
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d2);
                o4b1.b(vfc.k(i, i7 & 14, -1411607277, btsVar, false), null, an91.o(c530Var, deb1.b(c) ? 8.0f : 16.0f, 0.0f, 0.0f, 0.0f, 14), null, null, 0.0f, null, btsVar, 8 | (((i7 & 8078) >> 3) & 112), 56);
                btsVar.t(true);
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new bn1(ibp0Var, i, f530Var3, i2, i3, 3);
                return;
            }
            return;
        }
        f530Var2 = f530Var;
        i5 = i4 | 27648;
        if (btsVar.V(i5 & 1, (i5 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ibp0 ibp0Var, au2 au2Var, f530 f530Var, String str, wp2 wp2Var, fid fidVar, int i, int i2) {
        int i3;
        au2 au2Var2;
        String str2;
        int i4;
        wp2 wp2Var2;
        String str3;
        wp2 wp2Var3;
        aii0 v;
        Throwable th;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1296795522);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            au2Var2 = au2Var;
            i3 |= btsVar.k(au2Var2) ? 32 : 16;
        } else {
            au2Var2 = au2Var;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.k(f530Var) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            str2 = str;
            i3 |= btsVar.k(str2) ? 2048 : 1024;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                wp2Var2 = wp2Var;
                i3 |= btsVar.k(wp2Var2) ? 16384 : 8192;
                if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                    String str4 = null;
                    if (i5 != 0) {
                        th = null;
                    } else {
                        th = null;
                        str4 = str2;
                    }
                    wp2 wp2Var4 = i4 != 0 ? tp2.a : wp2Var2;
                    int i6 = i3 >> 3;
                    SlotSize c = ibp0Var.c();
                    f530 b = ljs0.b(f530Var, 0.0f, c.getSize(), 1);
                    z910 d = pi6.d(x4c.y, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    Throwable th2 = th;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw th2;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    sya1.a(au2Var2, an91.o(c530.a, deb1.b(c) ? 8.0f : 16.0f, 0.0f, 0.0f, 0.0f, 14), str4, wp2Var4, btsVar, i6 & 8078, 0);
                    btsVar.t(true);
                    str3 = str4;
                    wp2Var3 = wp2Var4;
                } else {
                    btsVar.Y();
                    str3 = str2;
                    wp2Var3 = wp2Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new xg0(ibp0Var, au2Var, f530Var, str3, wp2Var3, i, i2, 19);
                    return;
                }
                return;
            }
            wp2Var2 = wp2Var;
            if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        str2 = str;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        wp2Var2 = wp2Var;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final float[] d(float f) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return fArr;
    }

    public static final float[] e(View view) {
        float[] d = d(0.0f);
        try {
            if (view instanceof CardView) {
                return d(((CardView) view).getRadius());
            }
            ViewOutlineProvider outlineProvider = view.getOutlineProvider();
            CoreOutlineProvider coreOutlineProvider = outlineProvider instanceof CoreOutlineProvider ? (CoreOutlineProvider) outlineProvider : null;
            if (coreOutlineProvider != null) {
                return coreOutlineProvider.getCornerRadius();
            }
            Drawable background = view.getBackground();
            return background == null ? d : f(background);
        } catch (Exception e) {
            x4c.g("An error occurred on getCornerRadius", e, null, null, 12);
            return d;
        }
    }

    public static final float[] f(Drawable drawable) {
        float[] d = d(0.0f);
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                float[] f = f(layerDrawable.getDrawable(i));
                for (float f2 : f) {
                    if (f2 > 0.0f) {
                        return f;
                    }
                }
            }
        } else {
            if (!(drawable instanceof GradientDrawable)) {
                if (drawable instanceof RoundedBitmapDrawable) {
                    return d(((RoundedBitmapDrawable) drawable).getCornerRadius());
                }
                if (!(drawable instanceof VectorDrawable)) {
                    if (drawable instanceof CoreShapeDrawable) {
                        return ((CoreShapeDrawable) drawable).getRadius();
                    }
                    i5z0.a.a(qv10.l(drawable.getClass(), "No implementation of getting radius for drawable="), new Object[0]);
                    return d;
                }
                VectorDrawable vectorDrawable = (VectorDrawable) drawable;
                int intrinsicHeight = vectorDrawable.getIntrinsicHeight();
                int intrinsicWidth = vectorDrawable.getIntrinsicWidth();
                if (intrinsicHeight == intrinsicWidth) {
                    return d(vectorDrawable.getIntrinsicHeight() / 2.0f);
                }
                i5z0.a.a(oyr.h(intrinsicHeight, intrinsicWidth, "Couldn't get radius of VectorDrawable with height=", ", width="), new Object[0]);
                return d;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            float cornerRadius = gradientDrawable.getCornerRadius();
            Float valueOf = Float.valueOf(cornerRadius);
            if (cornerRadius == 0.0f) {
                valueOf = null;
            }
            if (valueOf != null) {
                return d(valueOf.floatValue());
            }
            float[] cornerRadii = gradientDrawable.getCornerRadii();
            if (cornerRadii != null) {
                return cornerRadii;
            }
        }
        return d;
    }
}
