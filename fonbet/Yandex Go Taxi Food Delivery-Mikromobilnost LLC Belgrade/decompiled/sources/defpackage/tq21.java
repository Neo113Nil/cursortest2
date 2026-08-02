package defpackage;

import com.yandex.go.data.api.UserPhotoUploadingApi;
import com.yandex.go.payments.cards.data.UserCardProfileApiV4;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes.dex */
public final /* synthetic */ class tq21 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ on2 b;

    public /* synthetic */ tq21(on2 on2Var, int i) {
        this.a = i;
        this.b = on2Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        on2 on2Var = this.b;
        switch (i) {
            case 0:
                on2Var.getClass();
                return (UserPhotoUploadingApi) on2Var.a(GoApiName.TaxiV4, UserPhotoUploadingApi.class);
            default:
                on2Var.getClass();
                return (UserCardProfileApiV4) on2Var.a(GoApiName.TaxiV4, UserCardProfileApiV4.class);
        }
    }
}
