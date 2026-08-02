package defpackage;

import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;

/* loaded from: classes6.dex */
public final /* synthetic */ class se30 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MtCollapsedRoutesView b;

    public /* synthetic */ se30(MtCollapsedRoutesView mtCollapsedRoutesView, int i) {
        this.a = i;
        this.b = mtCollapsedRoutesView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 communicationsDelegate$lambda$0;
        boolean _init_$lambda$0;
        int i = this.a;
        MtCollapsedRoutesView mtCollapsedRoutesView = this.b;
        switch (i) {
            case 0:
                communicationsDelegate$lambda$0 = MtCollapsedRoutesView.communicationsDelegate$lambda$0(mtCollapsedRoutesView, (dd30) obj);
                return communicationsDelegate$lambda$0;
            default:
                _init_$lambda$0 = MtCollapsedRoutesView._init_$lambda$0(mtCollapsedRoutesView, (t1w) obj);
                return Boolean.valueOf(_init_$lambda$0);
        }
    }
}
