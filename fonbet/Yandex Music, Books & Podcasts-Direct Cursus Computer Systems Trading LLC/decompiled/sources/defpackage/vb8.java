package defpackage;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.yandex.div.core.dagger.Div2Component;

/* loaded from: classes3.dex */
public final class vb8 extends ContextWrapper {
    public final ContextThemeWrapper a;
    public final Div2Component b;
    public final dzf c;
    public LayoutInflater d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb8(ContextThemeWrapper contextThemeWrapper, dt8 dt8Var, dzf dzfVar) {
        super(contextThemeWrapper);
        Div2Component.Builder b = p79.b.n(contextThemeWrapper).a.b();
        b.e(contextThemeWrapper);
        b.a(dt8Var);
        b.c();
        b.d(new su8(vp4.a()));
        b.b(dt8Var.n);
        Div2Component build = b.build();
        this.a = contextThemeWrapper;
        this.b = build;
        this.c = dzfVar;
        btf.b(new rs6(22, this));
        su8 d = build.d();
        if (d.a >= 0) {
            return;
        }
        d.a = vp4.a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        LayoutInflater layoutInflater;
        if (!"layout_inflater".equals(str)) {
            return this.a.getSystemService(str);
        }
        LayoutInflater layoutInflater2 = this.d;
        if (layoutInflater2 != null) {
            return layoutInflater2;
        }
        synchronized (this) {
            layoutInflater = this.d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(this.a).cloneInContext(this);
                layoutInflater.getClass();
                layoutInflater.setFactory2(new ub8(this));
                this.d = layoutInflater;
            }
        }
        return layoutInflater;
    }
}
