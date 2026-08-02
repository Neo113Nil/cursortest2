package defpackage;

import com.yandex.div.core.expression.triggers.a;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes.dex */
public final class xe11 implements s1b0 {
    public final /* synthetic */ Div2View a;
    public final /* synthetic */ a b;

    public xe11(a aVar, Div2View div2View) {
        this.a = div2View;
        this.b = aVar;
    }

    @Override // defpackage.s1b0
    public final void a() {
        this.a.removePersistentDivDataObserver$div_release(this);
        this.b.c();
    }
}
