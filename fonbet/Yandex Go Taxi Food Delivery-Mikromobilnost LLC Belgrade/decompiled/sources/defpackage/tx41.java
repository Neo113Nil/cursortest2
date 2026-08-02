package defpackage;

import ru.yandex.taxi.widget.wheel.WheelView;

/* loaded from: classes6.dex */
public final class tx41 implements ky41 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h2r b;
    public final /* synthetic */ ux41 c;

    public tx41(ux41 ux41Var, h2r h2rVar) {
        this.c = ux41Var;
        this.b = h2rVar;
    }

    @Override // defpackage.ky41
    public final void e() {
        int i = this.a;
        ux41 ux41Var = this.c;
        switch (i) {
            case 0:
                ux41Var.b.block();
                ux41Var.c.block();
                break;
            default:
                ux41Var.a.block();
                ux41Var.b.block();
                break;
        }
    }

    @Override // defpackage.ky41
    public final void g(int i, boolean z) {
        int i2 = this.a;
        ux41 ux41Var = this.c;
        h2r h2rVar = this.b;
        switch (i2) {
            case 0:
                vd11 currentSubtree = ux41Var.a.getCurrentSubtree();
                int size = currentSubtree.b.size();
                WheelView wheelView = ux41Var.b;
                if (size != 0) {
                    wheelView.setVisibility(0);
                    wheelView.setAdapter(new wd11(currentSubtree));
                    int selectedItem = wheelView.getSelectedItem();
                    if (selectedItem >= wheelView.getItemsCount()) {
                        selectedItem = wheelView.getItemsCount() - 1;
                    }
                    wheelView.setCurrentItem(selectedItem);
                    ux41Var.d.g(wheelView.getSelectedItem(), z);
                    break;
                } else {
                    wheelView.setVisibility(8);
                    ux41Var.c.setVisibility(8);
                    h2rVar.l(i, -1, -1, z);
                    break;
                }
            default:
                h2rVar.l(ux41Var.a.getSelectedItem(), ux41Var.b.getSelectedItem(), ux41Var.c.getSelectedItem(), z);
                break;
        }
    }

    @Override // defpackage.ky41
    public final void i() {
        int i = this.a;
        ux41 ux41Var = this.c;
        switch (i) {
            case 0:
                ux41Var.b.unblock();
                ux41Var.c.unblock();
                break;
            default:
                ux41Var.a.unblock();
                ux41Var.b.unblock();
                break;
        }
    }

    public tx41(h2r h2rVar, ux41 ux41Var) {
        this.b = h2rVar;
        this.c = ux41Var;
    }
}
