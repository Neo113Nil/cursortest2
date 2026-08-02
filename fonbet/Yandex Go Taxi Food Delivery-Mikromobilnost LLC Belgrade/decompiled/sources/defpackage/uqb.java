package defpackage;

import ru.yandex.taxi.design.ChipsComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class uqb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChipsComponent b;

    public /* synthetic */ uqb(ChipsComponent chipsComponent, int i) {
        this.a = i;
        this.b = chipsComponent;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        zy11 zy11Var5;
        zy11 zy11Var6;
        int i = this.a;
        ChipsComponent chipsComponent = this.b;
        switch (i) {
            case 0:
                zy11Var = ChipsComponent.setupActionViewForChevronAction$lambda$0(chipsComponent);
                return zy11Var;
            case 1:
                zy11Var2 = ChipsComponent.setupActionViewForPlusMinusAction$lambda$1(chipsComponent);
                return zy11Var2;
            case 2:
                zy11Var3 = ChipsComponent.setupActionViewForPlusMinusAction$lambda$2(chipsComponent);
                return zy11Var3;
            case 3:
                zy11Var4 = ChipsComponent.setupActionViewForCloseAction$lambda$0(chipsComponent);
                return zy11Var4;
            case 4:
                zy11Var5 = ChipsComponent.setupActionViewForCloseAction$lambda$1(chipsComponent);
                return zy11Var5;
            default:
                zy11Var6 = ChipsComponent.setupActionViewForCloseAction$lambda$2(chipsComponent);
                return zy11Var6;
        }
    }
}
