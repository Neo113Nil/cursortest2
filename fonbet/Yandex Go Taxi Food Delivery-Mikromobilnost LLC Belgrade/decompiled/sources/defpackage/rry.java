package defpackage;

import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes9.dex */
public final /* synthetic */ class rry implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemComponent b;

    public /* synthetic */ rry(ListItemComponent listItemComponent, int i) {
        this.a = i;
        this.b = listItemComponent;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str;
        String str2;
        int i = this.a;
        ListItemComponent listItemComponent = this.b;
        switch (i) {
            case 0:
                str = listItemComponent.analyticsButtonName;
                return str;
            default:
                str2 = listItemComponent.analyticsButtonName;
                return str2;
        }
    }
}
