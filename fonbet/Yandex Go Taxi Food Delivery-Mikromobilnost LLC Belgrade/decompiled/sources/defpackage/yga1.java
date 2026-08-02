package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.WindowInsetsController;
import coil.view.Scale;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

/* loaded from: classes5.dex */
public abstract class yga1 {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = r1.getInsetsController();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = r0.getInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Dialog dialog) {
        Activity a;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        int systemBarsAppearance;
        if (!xga1.b(30) || (a = tb71.a()) == null || (r0 = a.getWindow()) == null || (r1 = dialog.getWindow()) == null || insetsController == null || insetsController2 == null) {
            return;
        }
        systemBarsAppearance = insetsController.getSystemBarsAppearance();
        insetsController2.setSystemBarsAppearance(systemBarsAppearance, 24);
    }

    public static final int b(float f, int i) {
        return (y6i0.d(m810.b(Color.alpha(i) * f), 0, 255) << 24) | (i & 16777215);
    }

    public static final boolean c(fz60 fz60Var, k7z k7zVar, k7z k7zVar2, TimestampSelector timestampSelector) {
        double d;
        double d2 = fz60Var.d;
        if (fz60Var.c) {
            u1k u1kVar = k7zVar.b.b;
            double d3 = u1kVar != null ? u1kVar.a : d2;
            u1k u1kVar2 = k7zVar2.b.b;
            if (u1kVar2 != null) {
                d2 = u1kVar2.a;
            }
            d = d3 + d2;
        } else {
            d = 0.0d;
        }
        p6z p6zVar = k7zVar.b;
        p6z p6zVar2 = k7zVar2.b;
        yzs yzsVar = p6zVar.a;
        yzs yzsVar2 = p6zVar2.a;
        double h = nwa1.h(yzsVar.a);
        double h2 = nwa1.h(yzsVar.b);
        double h3 = nwa1.h(yzsVar2.a);
        double abs = Math.abs(nwa1.h(yzsVar2.b) - h2);
        if (abs > 3.141592653589793d) {
            abs = 6.283185307179586d - abs;
        }
        double cos = Math.cos((h + h3) / 2.0d) * abs;
        double d4 = h3 - h;
        double d5 = ((u1k) y6i0.a(new u1k((Math.sqrt((d4 * d4) + (cos * cos)) * 6371008.0d) + (-d)), new u1k(0.0d))).a;
        long a = timestampSelector.a(k7zVar2.a, k7zVar.a);
        if (a < 0) {
            a = e3n.q(a);
        } else {
            o430 o430Var = e3n.b;
        }
        return Double.compare(d5, e3n.m(((e3n) y6i0.a(new e3n(a), new e3n(fz60Var.b))).a, DurationUnit.SECONDS) * fz60Var.a) <= 0;
    }

    public static final float d(jh91 jh91Var, Scale scale) {
        if (jh91Var instanceof lkj) {
            return ((lkj) jh91Var).a;
        }
        int i = k.a[scale.ordinal()];
        if (i == 1) {
            return Float.MIN_VALUE;
        }
        if (i == 2) {
            return Float.MAX_VALUE;
        }
        w511.b();
        return 0.0f;
    }
}
