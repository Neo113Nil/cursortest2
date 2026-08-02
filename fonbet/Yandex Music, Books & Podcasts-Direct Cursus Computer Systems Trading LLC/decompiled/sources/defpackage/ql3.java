package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ql3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ql3(geh gehVar, geh gehVar2, long j) {
        this.a = 4;
        this.c = gehVar;
        this.d = gehVar2;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                drh drhVar = (drh) obj3;
                Context context = (Context) obj;
                context.getClass();
                int U = c3x.U(j);
                pl3 pl3Var = new pl3(1, (Function1) obj2);
                mph mphVar = new mph(context);
                Drawable drawable = null;
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(context, R.style.Theme_MediaRouter).obtainStyledAttributes(null, hen.a, R.attr.mediaRouteButtonStyle, 0);
                obtainStyledAttributes.getClass();
                Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
                obtainStyledAttributes.recycle();
                if (drawable2 != null) {
                    drawable2.setTint(U);
                    drawable2.setState(mphVar.getDrawableState());
                    drawable = drawable2;
                }
                mphVar.setRemoteIndicatorDrawable(drawable);
                mphVar.setClickable(false);
                mphVar.setRouteSelector(drhVar.a);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                frameLayout.setOnClickListener(new fq2(3, pl3Var, mphVar));
                frameLayout.addView(mphVar);
                return frameLayout;
            case 1:
                amr amrVar = (amr) obj3;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float f = 2;
                float f2 = amrVar.a / f;
                float d = nmq.d(jpaVar.e()) - (f * f2);
                jpaVar.V(this.b, -90.0f, ((Number) ((sdr) obj2).getValue()).floatValue(), false, swf.i(f2, f2), a4g.i(d, d), (r26 & 64) != 0 ? 1.0f : 0.0f, (r26 & 128) != 0 ? dbc.a : amrVar);
                return Unit.a;
            case 2:
                String str = (String) obj3;
                String str2 = (String) obj2;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("UPDATE playlist SET position=? WHERE uid=? AND original_id=?");
                try {
                    D0.bindLong(1, j);
                    D0.E(2, str);
                    D0.E(3, str2);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            case 3:
                jpa jpaVar2 = (jpa) obj;
                jpaVar2.getClass();
                float f3 = 2;
                long i2 = swf.i(nmq.d(jpaVar2.e()) / f3, nmq.b(jpaVar2.e()));
                float d2 = nmq.d(jpaVar2.e()) / f3;
                float J = fxf.J(((Number) ((sdr) obj3).getValue()).floatValue(), 0.0f, 1.0f, d2 / 4.0f, d2);
                long b = d85.b(this.b, ((Number) ((sdr) obj2).getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14);
                long i3 = swf.i(enj.e(i2) - J, enj.f(i2) - J);
                float f4 = J * f3;
                jpaVar2.V(b, 180.0f, 180.0f, true, i3, a4g.i(f4, f4), (r26 & 64) != 0 ? 1.0f : 0.0f, (r26 & 128) != 0 ? dbc.a : null);
                return Unit.a;
            default:
                geh gehVar = (geh) obj3;
                geh gehVar2 = (geh) obj2;
                jx7 jx7Var = (jx7) obj;
                jx7Var.getClass();
                gehVar2.getClass();
                long t = xv.t(gehVar.a - gehVar2.a, gehVar.b - gehVar2.b);
                return new wpe(xv.t(eeh.b(jx7Var.n0(fma.c(j)) * ((int) (t >> 32))), eeh.b(jx7Var.n0(fma.b(j)) * ((int) (t & 4294967295L)))));
        }
    }

    public /* synthetic */ ql3(int i, long j, Object obj, Object obj2) {
        this.a = i;
        this.b = j;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ql3(amr amrVar, long j, sdr sdrVar) {
        this.a = 1;
        this.c = amrVar;
        this.b = j;
        this.d = sdrVar;
    }
}
