package defpackage;

import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes.dex */
public final class yby implements b03 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yby(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b03
    public final String getApplicationId() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((rs2) obj).getClass();
                break;
            default:
                ((TaxiApplication) obj).appCredentials().getClass();
                break;
        }
        return "ru.yandex.taxi";
    }
}
