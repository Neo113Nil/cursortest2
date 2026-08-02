package defpackage;

import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceSelectorWithHeaderView;

/* loaded from: classes6.dex */
public final class taj0 implements v7p {
    public final /* synthetic */ int a;
    public final tgb0 b;

    public /* synthetic */ taj0(tgb0 tgb0Var, int i) {
        this.a = i;
        this.b = tgb0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        tgb0 tgb0Var = this.b;
        switch (i) {
            case 0:
                return new aye0(14, tgb0Var);
            default:
                return new uaj0((RequiredAltChoiceSelectorWithHeaderView) tgb0Var.get());
        }
    }
}
