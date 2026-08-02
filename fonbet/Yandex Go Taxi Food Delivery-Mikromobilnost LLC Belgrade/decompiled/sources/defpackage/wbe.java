package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class wbe implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oae b;

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        oae oaeVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    c.a(oaeVar, btsVar, 0);
                    break;
                }
            default:
                num.getClass();
                c.a(oaeVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
