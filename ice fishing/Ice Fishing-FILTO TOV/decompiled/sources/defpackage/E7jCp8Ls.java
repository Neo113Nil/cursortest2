package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.combinations.level.experts.XenoloopApplication;
import com.combinations.level.experts.core.domain.model.GameProgress;
import com.combinations.level.experts.core.domain.model.LevelResult;
import com.combinations.level.experts.core.domain.model.LevelSpec;
import com.combinations.level.experts.core.domain.model.Sector;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class E7jCp8Ls implements hv {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ E7jCp8Ls(kz0 kz0Var, GameProgress gameProgress) {
        this.OOA6hdeuvCS = 18;
        this.EljAMC1QTz = gameProgress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0696  */
    /* JADX WARN: Type inference failed for: r0v11, types: [sr] */
    @Override // defpackage.hv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mOu10nynGul(Object obj) {
        s6 s6Var;
        int i;
        long j;
        f00 f00Var;
        boolean z;
        t41 t41Var;
        u9 u9Var;
        f4 f4Var;
        float f;
        float f2;
        long mOu10nynGul;
        p80 p80Var;
        boolean isToggle;
        boolean toggleValue;
        int i2 = 2;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z2 = false;
        p80 p80Var2 = null;
        Boolean bool = null;
        int i4 = 1;
        switch (this.OOA6hdeuvCS) {
            case 0:
                return obj == ((XnEVoBF0td1l) this.EljAMC1QTz) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                dp0 dp0Var = (dp0) this.EljAMC1QTz;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == dp0Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != dp0Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                d7 d7Var = (d7) this.EljAMC1QTz;
                e9 e9Var = (e9) obj;
                if (e9Var.Yi7zF1RB1() * d7Var.cilMamHF < 0.0f || t21.Yi7zF1RB1(e9Var.OOA6hdeuvCS.xqGvceK5x()) <= 0.0f) {
                    return e9Var.GWasM1elztuh(new bCsSzSHkbaQ(9));
                }
                final float min = Math.min(cn.Yi7zF1RB1(d7Var.cilMamHF, 0.0f) ? 1.0f : (float) Math.ceil(e9Var.Yi7zF1RB1() * d7Var.cilMamHF), (float) Math.ceil(t21.Yi7zF1RB1(e9Var.OOA6hdeuvCS.xqGvceK5x()) / 2.0f));
                final float f4 = min / 2.0f;
                final long floatToRawIntBits = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (e9Var.OOA6hdeuvCS.xqGvceK5x() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (e9Var.OOA6hdeuvCS.xqGvceK5x() & 4294967295L)) - min) & 4294967295L);
                float f5 = min * 2.0f;
                final boolean z3 = f5 > t21.Yi7zF1RB1(e9Var.OOA6hdeuvCS.xqGvceK5x());
                z50 GWasM1elztuh = d7Var.WdrkLMV3xh.GWasM1elztuh(e9Var.OOA6hdeuvCS.xqGvceK5x(), e9Var.OOA6hdeuvCS.getLayoutDirection(), e9Var);
                if (!(GWasM1elztuh instanceof zm0)) {
                    if (!(GWasM1elztuh instanceof bn0)) {
                        if (!(GWasM1elztuh instanceof an0)) {
                            o4.xqGvceK5x();
                            return null;
                        }
                        final t41 t41Var2 = d7Var.lv06NcmrQ;
                        if (z3) {
                            floatToRawIntBits = 0;
                        }
                        final long j2 = floatToRawIntBits;
                        if (z3) {
                            floatToRawIntBits2 = e9Var.OOA6hdeuvCS.xqGvceK5x();
                        }
                        final long j3 = floatToRawIntBits2;
                        final j61 j61Var = z3 ? sr.Mjvvu5DE : new j61(min, 0.0f, 0, 0, 30);
                        return e9Var.GWasM1elztuh(new hv() { // from class: a7
                            @Override // defpackage.hv
                            public final Object mOu10nynGul(Object obj2) {
                                i60 i60Var = (i60) obj2;
                                i60Var.GWasM1elztuh();
                                ho.WIEu4Ya2g8(i60Var, t41Var2, j2, j3, 0.0f, j61Var, 104);
                                return kc1.GWasM1elztuh;
                            }
                        });
                    }
                    final t41 t41Var3 = d7Var.lv06NcmrQ;
                    sv0 sv0Var = ((bn0) GWasM1elztuh).Yi7zF1RB1;
                    if (n4.iwATDS1i01k(sv0Var)) {
                        final long j4 = sv0Var.OOA6hdeuvCS;
                        final j61 j61Var2 = new j61(min, 0.0f, 0, 0, 30);
                        return e9Var.GWasM1elztuh(new hv() { // from class: b7
                            @Override // defpackage.hv
                            public final Object mOu10nynGul(Object obj2) {
                                long j5;
                                i60 i60Var = (i60) obj2;
                                i60Var.GWasM1elztuh();
                                u9 u9Var2 = i60Var.OOA6hdeuvCS;
                                boolean z4 = z3;
                                qj qjVar = t41Var3;
                                long j6 = j4;
                                if (z4) {
                                    ho.Fm8W7vP7q(i60Var, qjVar, 0L, 0L, j6, null, 246);
                                } else {
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f6 = f4;
                                    if (intBitsToFloat < f6) {
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (u9Var2.xqGvceK5x() >> 32));
                                        float f7 = min;
                                        float f8 = intBitsToFloat2 - f7;
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (u9Var2.xqGvceK5x() & 4294967295L)) - f7;
                                        f4 f4Var2 = u9Var2.EljAMC1QTz;
                                        long mOu10nynGul2 = f4Var2.mOu10nynGul();
                                        f4Var2.EljAMC1QTz().E7jCp8Ls();
                                        try {
                                            ((f4) ((j6IIN2O8eOU) f4Var2.Yi7zF1RB1).EljAMC1QTz).EljAMC1QTz().EljAMC1QTz(f7, f7, f8, intBitsToFloat3, 0);
                                            j5 = mOu10nynGul2;
                                            try {
                                                ho.Fm8W7vP7q(i60Var, qjVar, 0L, 0L, j6, null, 246);
                                                f4Var2.EljAMC1QTz().JFJ3QoxA();
                                                f4Var2.jivtDDk9H(j5);
                                            } catch (Throwable th) {
                                                th = th;
                                                f4Var2.EljAMC1QTz().JFJ3QoxA();
                                                f4Var2.jivtDDk9H(j5);
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j5 = mOu10nynGul2;
                                        }
                                    } else {
                                        ho.Fm8W7vP7q(i60Var, qjVar, floatToRawIntBits, floatToRawIntBits2, o30.VeqTn1PQw7(f6, j6), j61Var2, 208);
                                    }
                                }
                                return kc1.GWasM1elztuh;
                            }
                        });
                    }
                    if (d7Var.Y6hRI1cF8 == null) {
                        d7Var.Y6hRI1cF8 = new z6();
                    }
                    z6 z6Var = d7Var.Y6hRI1cF8;
                    z6Var.getClass();
                    h1 h1Var = z6Var.xqGvceK5x;
                    if (h1Var == null) {
                        h1Var = j1.GWasM1elztuh();
                        z6Var.xqGvceK5x = h1Var;
                    }
                    h1Var.OOA6hdeuvCS();
                    h1.Yi7zF1RB1(h1Var, sv0Var);
                    if (!z3) {
                        h1 GWasM1elztuh2 = j1.GWasM1elztuh();
                        h1.Yi7zF1RB1(GWasM1elztuh2, new sv0(min, min, (sv0Var.X1lG3V04pd - sv0Var.GWasM1elztuh) - min, (sv0Var.xqGvceK5x - sv0Var.Yi7zF1RB1) - min, o30.VeqTn1PQw7(min, sv0Var.OOA6hdeuvCS), o30.VeqTn1PQw7(min, sv0Var.EljAMC1QTz), o30.VeqTn1PQw7(min, sv0Var.AvO7iQsrTN), o30.VeqTn1PQw7(min, sv0Var.encWxUiV2)));
                        h1Var.xqGvceK5x(h1Var, GWasM1elztuh2, 0);
                    }
                    return e9Var.GWasM1elztuh(new X1lG3V04pd(i2, h1Var, t41Var3));
                }
                t41 t41Var4 = d7Var.lv06NcmrQ;
                zm0 zm0Var = (zm0) GWasM1elztuh;
                h1 h1Var2 = zm0Var.Yi7zF1RB1;
                if (z3) {
                    return e9Var.GWasM1elztuh(new X1lG3V04pd(3, zm0Var, t41Var4));
                }
                if (t41Var4 != null) {
                    s6Var = new s6(5, yb.Yi7zF1RB1(1.0f, t41Var4.Mjvvu5DE));
                    i = 1;
                } else {
                    s6Var = null;
                    i = 0;
                }
                final kt0 X1lG3V04pd = h1Var2.X1lG3V04pd();
                float f6 = X1lG3V04pd.Yi7zF1RB1;
                float f7 = X1lG3V04pd.GWasM1elztuh;
                if (d7Var.Y6hRI1cF8 == null) {
                    d7Var.Y6hRI1cF8 = new z6();
                }
                z6 z6Var2 = d7Var.Y6hRI1cF8;
                z6Var2.getClass();
                h1 h1Var3 = z6Var2.xqGvceK5x;
                if (h1Var3 == null) {
                    h1Var3 = j1.GWasM1elztuh();
                    z6Var2.xqGvceK5x = h1Var3;
                }
                h1Var3.OOA6hdeuvCS();
                float f8 = X1lG3V04pd.GWasM1elztuh;
                float f9 = X1lG3V04pd.xqGvceK5x;
                float f10 = X1lG3V04pd.X1lG3V04pd;
                float f11 = X1lG3V04pd.Yi7zF1RB1;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    j1.Yi7zF1RB1("Invalid rectangle, make sure no value is NaN");
                }
                if (h1Var3.Yi7zF1RB1 == null) {
                    h1Var3.Yi7zF1RB1 = new RectF();
                }
                RectF rectF = h1Var3.Yi7zF1RB1;
                rectF.getClass();
                rectF.set(f8, f11, f10, f9);
                Path path = h1Var3.GWasM1elztuh;
                RectF rectF2 = h1Var3.Yi7zF1RB1;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                h1Var3.xqGvceK5x(h1Var3, h1Var2, 0);
                final rt0 rt0Var = new rt0();
                long ceil = (((int) Math.ceil(X1lG3V04pd.X1lG3V04pd - f7)) << 32) | (((int) Math.ceil(X1lG3V04pd.xqGvceK5x - f6)) & 4294967295L);
                z6 z6Var3 = d7Var.Y6hRI1cF8;
                z6Var3.getClass();
                w0 w0Var = z6Var3.GWasM1elztuh;
                Jz7YUlEP53 jz7YUlEP53 = z6Var3.Yi7zF1RB1;
                if (w0Var != null) {
                    j = ceil;
                    f00Var = new f00(w0Var.GWasM1elztuh());
                } else {
                    j = ceil;
                    f00Var = null;
                }
                try {
                    try {
                        if (f00Var == null || f00Var.GWasM1elztuh != 0) {
                            f00 f00Var2 = w0Var != null ? new f00(w0Var.GWasM1elztuh()) : null;
                            if (f00Var2 == null || i != f00Var2.GWasM1elztuh) {
                                z = false;
                                if (w0Var != null) {
                                    Bitmap bitmap = w0Var.GWasM1elztuh;
                                    if (jz7YUlEP53 != null && Float.intBitsToFloat((int) (e9Var.OOA6hdeuvCS.xqGvceK5x() >> 32)) <= bitmap.getWidth() && Float.intBitsToFloat((int) (e9Var.OOA6hdeuvCS.xqGvceK5x() & 4294967295L)) <= bitmap.getHeight() && z) {
                                        t41Var = t41Var4;
                                        u9Var = z6Var3.X1lG3V04pd;
                                        if (u9Var == null) {
                                            u9Var = new u9();
                                            z6Var3.X1lG3V04pd = u9Var;
                                        }
                                        f4Var = u9Var.EljAMC1QTz;
                                        t9 t9Var = u9Var.OOA6hdeuvCS;
                                        u9 u9Var2 = u9Var;
                                        t41 t41Var5 = t41Var;
                                        long CMh55RymNfS = o30.CMh55RymNfS(j);
                                        p50 layoutDirection = e9Var.OOA6hdeuvCS.getLayoutDirection();
                                        el elVar = t9Var.GWasM1elztuh;
                                        p50 p50Var = t9Var.Yi7zF1RB1;
                                        h1 h1Var4 = h1Var3;
                                        s9 s9Var = t9Var.X1lG3V04pd;
                                        final s6 s6Var2 = s6Var;
                                        long j5 = t9Var.xqGvceK5x;
                                        t9Var.GWasM1elztuh = e9Var;
                                        t9Var.Yi7zF1RB1 = layoutDirection;
                                        t9Var.X1lG3V04pd = jz7YUlEP53;
                                        t9Var.xqGvceK5x = CMh55RymNfS;
                                        jz7YUlEP53.E7jCp8Ls();
                                        ho.k8h8IjolWQ(u9Var2, yb.Yi7zF1RB1, CMh55RymNfS, 58);
                                        f = -f7;
                                        f2 = -f6;
                                        ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(f, f2);
                                        ho.YTyqgZhdF(u9Var2, zm0Var.Yi7zF1RB1, t41Var5, 0.0f, new j61(f5, 0.0f, 0, 0, 30), 52);
                                        float intBitsToFloat = (Float.intBitsToFloat((int) (u9Var2.xqGvceK5x() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (u9Var2.xqGvceK5x() >> 32));
                                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (u9Var2.xqGvceK5x() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (u9Var2.xqGvceK5x() & 4294967295L));
                                        long z19UFEN2I = u9Var2.z19UFEN2I();
                                        mOu10nynGul = f4Var.mOu10nynGul();
                                        f4Var.EljAMC1QTz().E7jCp8Ls();
                                        Jz7YUlEP53 jz7YUlEP532 = jz7YUlEP53;
                                        ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).jivtDDk9H(intBitsToFloat, intBitsToFloat2, z19UFEN2I);
                                        ho.YTyqgZhdF(u9Var2, h1Var4, t41Var5, 0.0f, null, 28);
                                        ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(-f, -f2);
                                        jz7YUlEP532.JFJ3QoxA();
                                        t9Var.GWasM1elztuh = elVar;
                                        t9Var.Yi7zF1RB1 = p50Var;
                                        t9Var.X1lG3V04pd = s9Var;
                                        t9Var.xqGvceK5x = j5;
                                        w0Var.GWasM1elztuh.prepareToDraw();
                                        rt0Var.OOA6hdeuvCS = w0Var;
                                        final long j6 = j;
                                        return e9Var.GWasM1elztuh(new hv() { // from class: c7
                                            @Override // defpackage.hv
                                            public final Object mOu10nynGul(Object obj2) {
                                                rt0 rt0Var2 = rt0Var;
                                                long j7 = j6;
                                                s6 s6Var3 = s6Var2;
                                                i60 i60Var = (i60) obj2;
                                                i60Var.GWasM1elztuh();
                                                kt0 kt0Var = kt0.this;
                                                float f12 = kt0Var.GWasM1elztuh;
                                                float f13 = kt0Var.Yi7zF1RB1;
                                                u9 u9Var3 = i60Var.OOA6hdeuvCS;
                                                ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(f12, f13);
                                                try {
                                                    ho.mE4lRynR(i60Var, (w0) rt0Var2.OOA6hdeuvCS, j7, 0.0f, s6Var3, 890);
                                                    ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f12, -f13);
                                                    return kc1.GWasM1elztuh;
                                                } catch (Throwable th) {
                                                    ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f12, -f13);
                                                    throw th;
                                                }
                                            }
                                        });
                                    }
                                }
                                t41Var = t41Var4;
                                w0Var = o30.OOA6hdeuvCS((int) (j >> 32), (int) (j & 4294967295L), i);
                                z6Var3.GWasM1elztuh = w0Var;
                                Canvas canvas = ddkiCTz5mZ.GWasM1elztuh;
                                jz7YUlEP53 = new Jz7YUlEP53();
                                jz7YUlEP53.GWasM1elztuh = new Canvas(w0Var.GWasM1elztuh);
                                z6Var3.Yi7zF1RB1 = jz7YUlEP53;
                                u9Var = z6Var3.X1lG3V04pd;
                                if (u9Var == null) {
                                }
                                f4Var = u9Var.EljAMC1QTz;
                                t9 t9Var2 = u9Var.OOA6hdeuvCS;
                                u9 u9Var22 = u9Var;
                                t41 t41Var52 = t41Var;
                                long CMh55RymNfS2 = o30.CMh55RymNfS(j);
                                p50 layoutDirection2 = e9Var.OOA6hdeuvCS.getLayoutDirection();
                                el elVar2 = t9Var2.GWasM1elztuh;
                                p50 p50Var2 = t9Var2.Yi7zF1RB1;
                                h1 h1Var42 = h1Var3;
                                s9 s9Var2 = t9Var2.X1lG3V04pd;
                                final s6 s6Var22 = s6Var;
                                long j52 = t9Var2.xqGvceK5x;
                                t9Var2.GWasM1elztuh = e9Var;
                                t9Var2.Yi7zF1RB1 = layoutDirection2;
                                t9Var2.X1lG3V04pd = jz7YUlEP53;
                                t9Var2.xqGvceK5x = CMh55RymNfS2;
                                jz7YUlEP53.E7jCp8Ls();
                                ho.k8h8IjolWQ(u9Var22, yb.Yi7zF1RB1, CMh55RymNfS2, 58);
                                f = -f7;
                                f2 = -f6;
                                ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(f, f2);
                                ho.YTyqgZhdF(u9Var22, zm0Var.Yi7zF1RB1, t41Var52, 0.0f, new j61(f5, 0.0f, 0, 0, 30), 52);
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() >> 32));
                                float intBitsToFloat22 = (Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() & 4294967295L));
                                long z19UFEN2I2 = u9Var22.z19UFEN2I();
                                mOu10nynGul = f4Var.mOu10nynGul();
                                f4Var.EljAMC1QTz().E7jCp8Ls();
                                Jz7YUlEP53 jz7YUlEP5322 = jz7YUlEP53;
                                ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).jivtDDk9H(intBitsToFloat3, intBitsToFloat22, z19UFEN2I2);
                                ho.YTyqgZhdF(u9Var22, h1Var42, t41Var52, 0.0f, null, 28);
                                ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(-f, -f2);
                                jz7YUlEP5322.JFJ3QoxA();
                                t9Var2.GWasM1elztuh = elVar2;
                                t9Var2.Yi7zF1RB1 = p50Var2;
                                t9Var2.X1lG3V04pd = s9Var2;
                                t9Var2.xqGvceK5x = j52;
                                w0Var.GWasM1elztuh.prepareToDraw();
                                rt0Var.OOA6hdeuvCS = w0Var;
                                final long j62 = j;
                                return e9Var.GWasM1elztuh(new hv() { // from class: c7
                                    @Override // defpackage.hv
                                    public final Object mOu10nynGul(Object obj2) {
                                        rt0 rt0Var2 = rt0Var;
                                        long j7 = j62;
                                        s6 s6Var3 = s6Var22;
                                        i60 i60Var = (i60) obj2;
                                        i60Var.GWasM1elztuh();
                                        kt0 kt0Var = kt0.this;
                                        float f12 = kt0Var.GWasM1elztuh;
                                        float f13 = kt0Var.Yi7zF1RB1;
                                        u9 u9Var3 = i60Var.OOA6hdeuvCS;
                                        ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(f12, f13);
                                        try {
                                            ho.mE4lRynR(i60Var, (w0) rt0Var2.OOA6hdeuvCS, j7, 0.0f, s6Var3, 890);
                                            ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f12, -f13);
                                            return kc1.GWasM1elztuh;
                                        } catch (Throwable th) {
                                            ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f12, -f13);
                                            throw th;
                                        }
                                    }
                                });
                            }
                        }
                        ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).jivtDDk9H(intBitsToFloat3, intBitsToFloat22, z19UFEN2I2);
                        ho.YTyqgZhdF(u9Var22, h1Var42, t41Var52, 0.0f, null, 28);
                        ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(-f, -f2);
                        jz7YUlEP5322.JFJ3QoxA();
                        t9Var2.GWasM1elztuh = elVar2;
                        t9Var2.Yi7zF1RB1 = p50Var2;
                        t9Var2.X1lG3V04pd = s9Var2;
                        t9Var2.xqGvceK5x = j52;
                        w0Var.GWasM1elztuh.prepareToDraw();
                        rt0Var.OOA6hdeuvCS = w0Var;
                        final long j622 = j;
                        return e9Var.GWasM1elztuh(new hv() { // from class: c7
                            @Override // defpackage.hv
                            public final Object mOu10nynGul(Object obj2) {
                                rt0 rt0Var2 = rt0Var;
                                long j7 = j622;
                                s6 s6Var3 = s6Var22;
                                i60 i60Var = (i60) obj2;
                                i60Var.GWasM1elztuh();
                                kt0 kt0Var = kt0.this;
                                float f12 = kt0Var.GWasM1elztuh;
                                float f13 = kt0Var.Yi7zF1RB1;
                                u9 u9Var3 = i60Var.OOA6hdeuvCS;
                                ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(f12, f13);
                                try {
                                    ho.mE4lRynR(i60Var, (w0) rt0Var2.OOA6hdeuvCS, j7, 0.0f, s6Var3, 890);
                                    ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f12, -f13);
                                    return kc1.GWasM1elztuh;
                                } catch (Throwable th) {
                                    ((j6IIN2O8eOU) u9Var3.EljAMC1QTz.Yi7zF1RB1).lv06NcmrQ(-f12, -f13);
                                    throw th;
                                }
                            }
                        });
                    } finally {
                        f4Var.EljAMC1QTz().JFJ3QoxA();
                        f4Var.jivtDDk9H(mOu10nynGul);
                    }
                    ho.YTyqgZhdF(u9Var22, zm0Var.Yi7zF1RB1, t41Var52, 0.0f, new j61(f5, 0.0f, 0, 0, 30), 52);
                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() >> 32));
                    float intBitsToFloat222 = (Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (u9Var22.xqGvceK5x() & 4294967295L));
                    long z19UFEN2I22 = u9Var22.z19UFEN2I();
                    mOu10nynGul = f4Var.mOu10nynGul();
                    f4Var.EljAMC1QTz().E7jCp8Ls();
                    Jz7YUlEP53 jz7YUlEP53222 = jz7YUlEP53;
                } catch (Throwable th) {
                    ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(-f, -f2);
                    throw th;
                }
                z = true;
                if (w0Var != null) {
                }
                t41Var = t41Var4;
                w0Var = o30.OOA6hdeuvCS((int) (j >> 32), (int) (j & 4294967295L), i);
                z6Var3.GWasM1elztuh = w0Var;
                Canvas canvas2 = ddkiCTz5mZ.GWasM1elztuh;
                jz7YUlEP53 = new Jz7YUlEP53();
                jz7YUlEP53.GWasM1elztuh = new Canvas(w0Var.GWasM1elztuh);
                z6Var3.Yi7zF1RB1 = jz7YUlEP53;
                u9Var = z6Var3.X1lG3V04pd;
                if (u9Var == null) {
                }
                f4Var = u9Var.EljAMC1QTz;
                t9 t9Var22 = u9Var.OOA6hdeuvCS;
                u9 u9Var222 = u9Var;
                t41 t41Var522 = t41Var;
                long CMh55RymNfS22 = o30.CMh55RymNfS(j);
                p50 layoutDirection22 = e9Var.OOA6hdeuvCS.getLayoutDirection();
                el elVar22 = t9Var22.GWasM1elztuh;
                p50 p50Var22 = t9Var22.Yi7zF1RB1;
                h1 h1Var422 = h1Var3;
                s9 s9Var22 = t9Var22.X1lG3V04pd;
                final s6 s6Var222 = s6Var;
                long j522 = t9Var22.xqGvceK5x;
                t9Var22.GWasM1elztuh = e9Var;
                t9Var22.Yi7zF1RB1 = layoutDirection22;
                t9Var22.X1lG3V04pd = jz7YUlEP53;
                t9Var22.xqGvceK5x = CMh55RymNfS22;
                jz7YUlEP53.E7jCp8Ls();
                ho.k8h8IjolWQ(u9Var222, yb.Yi7zF1RB1, CMh55RymNfS22, 58);
                f = -f7;
                f2 = -f6;
                ((j6IIN2O8eOU) f4Var.Yi7zF1RB1).lv06NcmrQ(f, f2);
                break;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                fj fjVar = (fj) this.EljAMC1QTz;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    fjVar.AvO7iQsrTN.WdrkLMV3xh(new wr(th2));
                }
                if (fjVar.mOu10nynGul.EljAMC1QTz != k61.encWxUiV2) {
                    ((pr) fjVar.mOu10nynGul.getValue()).close();
                }
                return kc1.GWasM1elztuh;
            case 4:
                sb1 sb1Var = (sb1) obj;
                return ((zt) this.EljAMC1QTz).GWasM1elztuh(new sb1(null, sb1Var.Yi7zF1RB1, sb1Var.X1lG3V04pd, sb1Var.xqGvceK5x, sb1Var.OOA6hdeuvCS)).OOA6hdeuvCS;
            case 5:
                kx kxVar = (kx) this.EljAMC1QTz;
                x90 x90Var = (x90) obj;
                x90Var.getClass();
                kxVar.EljAMC1QTz.mE4lRynR(qw.GWasM1elztuh);
                return new bx(x90Var, kxVar);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return new z(i2, (n70) this.EljAMC1QTz);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                return new z(4, (u70) this.EljAMC1QTz);
            case 8:
                u80 u80Var = (u80) this.EljAMC1QTz;
                float f12 = -((Float) obj).floatValue();
                if ((f12 >= 0.0f || u80Var.X1lG3V04pd()) && (f12 <= 0.0f || u80Var.GWasM1elztuh())) {
                    if (Math.abs(u80Var.encWxUiV2) > 0.5f) {
                        w10.X1lG3V04pd("entered drag with non-zero pending scroll");
                    }
                    u80Var.xqGvceK5x = true;
                    float f13 = u80Var.encWxUiV2 + f12;
                    u80Var.encWxUiV2 = f13;
                    if (Math.abs(f13) > 0.5f) {
                        float f14 = u80Var.encWxUiV2;
                        int round = Math.round(f14);
                        p80 EljAMC1QTz = ((p80) u80Var.EljAMC1QTz.getValue()).EljAMC1QTz(round, !u80Var.Yi7zF1RB1);
                        if (EljAMC1QTz != null && (p80Var = u80Var.X1lG3V04pd) != null) {
                            p80 EljAMC1QTz2 = p80Var.EljAMC1QTz(round, true);
                            if (EljAMC1QTz2 != null) {
                                u80Var.X1lG3V04pd = EljAMC1QTz2;
                            }
                            if (p80Var2 == null) {
                                u80Var.EljAMC1QTz(p80Var2, u80Var.Yi7zF1RB1, true);
                                u80Var.cilMamHF.setValue(kc1.GWasM1elztuh);
                                u80Var.encWxUiV2(f14 - u80Var.encWxUiV2, p80Var2);
                            } else {
                                g60 g60Var = u80Var.rQPn8YBR;
                                if (g60Var != null) {
                                    g60Var.rQPn8YBR();
                                }
                                u80Var.encWxUiV2(f14 - u80Var.encWxUiV2, u80Var.AvO7iQsrTN());
                            }
                        }
                        p80Var2 = EljAMC1QTz;
                        if (p80Var2 == null) {
                        }
                    }
                    if (Math.abs(u80Var.encWxUiV2) > 0.5f) {
                        f12 -= u80Var.encWxUiV2;
                        u80Var.encWxUiV2 = 0.0f;
                    }
                    f3 = f12;
                }
                return Float.valueOf(-f3);
            case 9:
                kw0 kw0Var = (kw0) this.EljAMC1QTz;
                return Boolean.valueOf(kw0Var != null ? kw0Var.xqGvceK5x(obj) : true);
            case 10:
                return ((tc0) this.EljAMC1QTz).Yi7zF1RB1(((Integer) obj).intValue());
            case 11:
                ((bh0) this.EljAMC1QTz).AvO7iQsrTN(null);
                return kc1.GWasM1elztuh;
            case 12:
                ej0 ej0Var = (ej0) this.EljAMC1QTz;
                fh0 fh0Var = (fh0) obj;
                fh0Var.getClass();
                hh0 hh0Var = fh0Var.E7jCp8Ls;
                xh0 xh0Var = fh0Var.EljAMC1QTz;
                if (xh0Var == null) {
                    xh0Var = null;
                }
                if (xh0Var == null) {
                    return null;
                }
                hh0Var.GWasM1elztuh();
                xh0 X1lG3V04pd2 = ej0Var.X1lG3V04pd(xh0Var);
                if (X1lG3V04pd2 == null) {
                    return null;
                }
                return X1lG3V04pd2.equals(xh0Var) ? fh0Var : ej0Var.Yi7zF1RB1().Yi7zF1RB1(X1lG3V04pd2, X1lG3V04pd2.GWasM1elztuh(hh0Var.GWasM1elztuh()));
            case 13:
                ((df) this.EljAMC1QTz).WRKkgoJXwDn(obj);
                return kc1.GWasM1elztuh;
            case 14:
                gt0 gt0Var = (gt0) this.EljAMC1QTz;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                synchronized (gt0Var.X1lG3V04pd) {
                    try {
                        f40 f40Var = gt0Var.xqGvceK5x;
                        if (f40Var != null) {
                            p51 p51Var = gt0Var.Y6hRI1cF8;
                            dt0 dt0Var = dt0.EljAMC1QTz;
                            p51Var.getClass();
                            p51Var.JFJ3QoxA(null, dt0Var);
                            f40Var.GWasM1elztuh(cancellationException);
                            gt0Var.Mjvvu5DE = null;
                            f40Var.Mjvvu5DE(new X1lG3V04pd(22, gt0Var, th3));
                        } else {
                            gt0Var.OOA6hdeuvCS = cancellationException;
                            p51 p51Var2 = gt0Var.Y6hRI1cF8;
                            dt0 dt0Var2 = dt0.OOA6hdeuvCS;
                            p51Var2.getClass();
                            p51Var2.JFJ3QoxA(null, dt0Var2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return kc1.GWasM1elztuh;
            case Side.ALL /* 15 */:
                kw0 kw0Var2 = ((jw0) this.EljAMC1QTz).AvO7iQsrTN;
                return Boolean.valueOf(kw0Var2 != null ? kw0Var2.xqGvceK5x(obj) : true);
            case 16:
                by0 by0Var = (by0) this.EljAMC1QTz;
                float floatValue = ((Float) obj).floatValue();
                co0 co0Var = by0Var.GWasM1elztuh;
                float AvO7iQsrTN = co0Var.AvO7iQsrTN() + floatValue + by0Var.EljAMC1QTz;
                float AvO7iQsrTN2 = o50.AvO7iQsrTN(AvO7iQsrTN, 0.0f, by0Var.OOA6hdeuvCS.AvO7iQsrTN());
                boolean z4 = AvO7iQsrTN == AvO7iQsrTN2;
                float AvO7iQsrTN3 = AvO7iQsrTN2 - co0Var.AvO7iQsrTN();
                int round2 = Math.round(AvO7iQsrTN3);
                co0Var.encWxUiV2(co0Var.AvO7iQsrTN() + round2);
                by0Var.EljAMC1QTz = AvO7iQsrTN3 - round2;
                if (!z4) {
                    floatValue = AvO7iQsrTN3;
                }
                return Float.valueOf(floatValue);
            case 17:
                wy0 wy0Var = (wy0) this.EljAMC1QTz;
                return new uk0(wy0Var.X1lG3V04pd(wy0Var.rQPn8YBR, ((uk0) obj).GWasM1elztuh, wy0Var.JFJ3QoxA));
            case 18:
                GameProgress gameProgress = (GameProgress) this.EljAMC1QTz;
                ((jz0) obj).getClass();
                int totalStars = gameProgress.getTotalStars();
                int maxStars = gameProgress.getMaxStars();
                List<Sector> list = h90.GWasM1elztuh;
                int i5 = 10;
                ArrayList arrayList = new ArrayList(sb.dcDmLGVhzWm(list, 10));
                for (Sector sector : list) {
                    int id = sector.getId();
                    String name = sector.getName();
                    int starsInSector = gameProgress.starsInSector(sector);
                    int levelCount = sector.getLevelCount() * 3;
                    boolean isUnlocked = gameProgress.isUnlocked(sector.getFirstLevel());
                    x20 x20Var = new x20(sector.getFirstLevel(), sector.getLastLevel(), i4);
                    ArrayList arrayList2 = new ArrayList(sb.dcDmLGVhzWm(x20Var, i5));
                    Iterator it = x20Var.iterator();
                    while (((w20) it).AvO7iQsrTN) {
                        int nextInt = ((q20) it).nextInt();
                        LevelSpec Yi7zF1RB1 = h90.Yi7zF1RB1(nextInt);
                        int i6 = nextInt + 1;
                        LevelResult resultFor = gameProgress.resultFor(nextInt);
                        int stars = resultFor != null ? resultFor.getStars() : i3;
                        arrayList2.add(new i90(nextInt, i6, stars, gameProgress.isUnlocked(nextInt), Yi7zF1RB1.getWidth() + "x" + Yi7zF1RB1.getHeight()));
                        i3 = 0;
                    }
                    arrayList.add(new yy0(id, name, starsInSector, levelCount, isUnlocked, arrayList2));
                    i3 = 0;
                    i5 = 10;
                    i4 = 1;
                }
                return new jz0(false, totalStars, maxStars, arrayList);
            case 19:
                s21 s21Var = (s21) this.EljAMC1QTz;
                t01 t01Var = s21Var.EljAMC1QTz;
                t01Var.getClass();
                if (!o30.rQPn8YBR(s21Var.EljAMC1QTz, t01Var)) {
                    tq0.Yi7zF1RB1("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                ig0 ig0Var = s21Var.OOA6hdeuvCS;
                Object obj2 = s21Var.X1lG3V04pd;
                if (ig0Var != null) {
                    if (obj2 != null) {
                        tq0.Yi7zF1RB1("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    ig0Var.GWasM1elztuh(obj);
                } else if (obj2 == null) {
                    s21Var.X1lG3V04pd = obj;
                } else {
                    ig0 ig0Var2 = lx0.GWasM1elztuh;
                    ig0 ig0Var3 = new ig0();
                    ig0Var3.GWasM1elztuh(obj2);
                    ig0Var3.GWasM1elztuh(obj);
                    s21Var.OOA6hdeuvCS = ig0Var3;
                    s21Var.X1lG3V04pd = null;
                }
                return kc1.GWasM1elztuh;
            case 20:
                r41 r41Var = (r41) this.EljAMC1QTz;
                synchronized (r41Var.AvO7iQsrTN) {
                    q41 q41Var = r41Var.mOu10nynGul;
                    q41Var.getClass();
                    Object obj3 = q41Var.Yi7zF1RB1;
                    obj3.getClass();
                    int i7 = q41Var.xqGvceK5x;
                    zf0 zf0Var = q41Var.X1lG3V04pd;
                    if (zf0Var == null) {
                        zf0Var = new zf0();
                        q41Var.X1lG3V04pd = zf0Var;
                        q41Var.EljAMC1QTz.XnEVoBF0td1l(obj3, zf0Var);
                    }
                    q41Var.Yi7zF1RB1(obj, i7, obj3, zf0Var);
                }
                return kc1.GWasM1elztuh;
            case 21:
                k3 k3Var = (k3) obj;
                ((lv) this.EljAMC1QTz).EljAMC1QTz(k3Var.OOA6hdeuvCS.getValue(), vc0.mOu10nynGul.Yi7zF1RB1.mOu10nynGul(k3Var.EljAMC1QTz));
                return kc1.GWasM1elztuh;
            case 22:
                l01 l01Var = (l01) this.EljAMC1QTz;
                p0 p0Var = (p0) obj;
                isToggle = p0Var.GWasM1elztuh.isToggle();
                if (isToggle) {
                    toggleValue = p0Var.GWasM1elztuh.getToggleValue();
                    bool = Boolean.valueOf(toggleValue);
                }
                if (bool != null) {
                    w91 w91Var = bool.booleanValue() ? w91.OOA6hdeuvCS : w91.EljAMC1QTz;
                    u40[] u40VarArr = j01.GWasM1elztuh;
                    k01 k01Var = h01.A1EKNP6CxJ;
                    u40 u40Var = j01.GWasM1elztuh[26];
                    l01Var.GWasM1elztuh(k01Var, w91Var);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 23:
                return new z(6, (qa1) this.EljAMC1QTz);
            default:
                XenoloopApplication xenoloopApplication = (XenoloopApplication) this.EljAMC1QTz;
                a50 a50Var = (a50) obj;
                int i8 = XenoloopApplication.OOA6hdeuvCS;
                a50Var.getClass();
                g90 g90Var = g90.mOu10nynGul;
                v5 v5Var = a50Var.GWasM1elztuh;
                y0 y0Var = new y0(i3);
                v5Var.getClass();
                v5Var.GWasM1elztuh = y0Var;
                g90 g90Var2 = g90.EljAMC1QTz;
                if (g90Var.compareTo(g90Var2) <= 0) {
                    w60 w60Var = (w60) v5Var.GWasM1elztuh;
                    w60Var.getClass();
                    w60Var.Mjvvu5DE(g90Var2, "[init] declare Android Context");
                }
                c50 c50Var = new c50(xenoloopApplication, i3);
                ne0 ne0Var = new ne0();
                c50Var.mOu10nynGul(ne0Var);
                v5Var.JFJ3QoxA(fb1.HFYAaqMd6(ne0Var), true);
                ne0 ne0Var2 = g4.GWasM1elztuh;
                ne0Var2.getClass();
                List HFYAaqMd6 = fb1.HFYAaqMd6(ne0Var2);
                boolean z5 = a50Var.Yi7zF1RB1;
                ((w60) v5Var.GWasM1elztuh).getClass();
                if (g90Var.compareTo(g90Var2) <= 0) {
                    long GWasM1elztuh3 = oe0.GWasM1elztuh();
                    v5Var.JFJ3QoxA(HFYAaqMd6, z5);
                    long GWasM1elztuh4 = p91.GWasM1elztuh(GWasM1elztuh3);
                    int size = ((ConcurrentHashMap) ((f4) v5Var.xqGvceK5x).X1lG3V04pd).size();
                    w60 w60Var2 = (w60) v5Var.GWasM1elztuh;
                    StringBuilder rQPn8YBR = mr0.rQPn8YBR("Started ", size, " definitions in ");
                    k61 k61Var = jo.OOA6hdeuvCS;
                    rQPn8YBR.append(jo.Yi7zF1RB1(GWasM1elztuh4, mo.MICROSECONDS) / 1000.0d);
                    rQPn8YBR.append(" ms");
                    w60Var2.mOu10nynGul(g90Var2, rQPn8YBR.toString());
                } else {
                    v5Var.JFJ3QoxA(HFYAaqMd6, z5);
                }
                return kc1.GWasM1elztuh;
        }
    }

    public /* synthetic */ E7jCp8Ls(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    public /* synthetic */ E7jCp8Ls(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }
}
