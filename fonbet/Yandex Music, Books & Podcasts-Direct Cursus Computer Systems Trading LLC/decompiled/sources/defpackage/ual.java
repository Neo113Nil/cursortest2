package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class ual {
    public final a a;
    public final qyf b;
    public final cjl c;
    public final View d;
    public int e;
    public boolean f;
    public final xdr g;
    public rar h;
    public final jyr i;

    public ual(a aVar, qyf qyfVar, cjl cjlVar, View view) {
        cjlVar.getClass();
        view.getClass();
        this.a = aVar;
        this.b = qyfVar;
        this.c = cjlVar;
        this.d = view;
        this.g = ydr.a(0);
        this.i = btf.b(new d1j(25, this));
    }

    public final void a(int i) {
        View view = this.d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (marginLayoutParams.bottomMargin - this.e) + i;
        this.e = i;
        view.requestLayout();
        Integer valueOf = Integer.valueOf(i);
        xdr xdrVar = this.g;
        xdrVar.getClass();
        xdrVar.m(null, valueOf);
    }
}
