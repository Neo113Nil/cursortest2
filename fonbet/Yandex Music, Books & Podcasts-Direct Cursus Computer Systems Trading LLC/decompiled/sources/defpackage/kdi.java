package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.compose.ui.draw.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class kdi {
    public static final long a = d85.b(d85.f, 0.5f, 0.0f, 0.0f, 0.0f, 14);

    public static yci a(yci yciVar, dup dupVar) {
        yciVar.getClass();
        dupVar.getClass();
        return yciVar.f(a.c(vci.a, new j8a(dupVar, a, 1)));
    }

    public static yci b(yci yciVar, final BlurMaskFilter blurMaskFilter, final float f) {
        final long b = d85.b(d85.f, 0.9f, 0.0f, 0.0f, 0.0f, 14);
        final float f2 = 0;
        yciVar.getClass();
        return a.c(yciVar, new Function1() { // from class: hdi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                ou3 ou3Var = opfVar.a;
                ynn d = ywf.d(0L, ou3Var.e());
                gh0 p = hld.p();
                mu3 s = ou3Var.b.s();
                p.e(b);
                Paint paint = p.a;
                paint.setAntiAlias(true);
                s.m(d, p);
                float f3 = d.a;
                float f4 = d.b;
                float f5 = d.c;
                float f6 = d.d;
                float f7 = f;
                s.f(f3, f4, f5, f6, opfVar.n0(f7), opfVar.n0(f7), p);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                paint.setMaskFilter(blurMaskFilter);
                p.e(d85.b);
                float f8 = d.a;
                float f9 = f2;
                float f10 = 2;
                s.f(f8 + (opfVar.n0(f9) / f10), (opfVar.n0(f9) / f10) + d.b, d.c - (opfVar.n0(f9) / f10), d.d - (opfVar.n0(f9) / f10), opfVar.n0(f7), opfVar.n0(f7), p);
                paint.setXfermode(null);
                paint.setMaskFilter(null);
                return Unit.a;
            }
        });
    }
}
