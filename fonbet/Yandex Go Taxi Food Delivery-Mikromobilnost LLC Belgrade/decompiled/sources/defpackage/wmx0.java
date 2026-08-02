package defpackage;

import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class wmx0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ pav b;
    public final /* synthetic */ qmx0 c;
    public final /* synthetic */ tls w;

    public /* synthetic */ wmx0(pav pavVar, qmx0 qmx0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = pavVar;
        this.c = qmx0Var;
        this.w = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        tls tlsVar = this.w;
        qmx0 qmx0Var = this.c;
        pav pavVar = this.b;
        ListItemComponent listItemComponent = (ListItemComponent) obj;
        switch (i) {
            case 0:
                return new xmx0(listItemComponent, pavVar, qmx0Var, tlsVar);
            default:
                return new ymx0(listItemComponent, pavVar, qmx0Var, tlsVar);
        }
    }
}
