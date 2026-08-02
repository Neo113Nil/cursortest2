package defpackage;

import ru.yandex.taxi.ChangeOrderSourceAddressFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class ub9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChangeOrderSourceAddressFragment b;

    public /* synthetic */ ub9(ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment, int i) {
        this.a = i;
        this.b = changeOrderSourceAddressFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment = this.b;
        switch (i) {
            case 0:
                ChangeOrderSourceAddressFragment._get_porchButton_$lambda$0(changeOrderSourceAddressFragment);
                break;
            case 1:
                ChangeOrderSourceAddressFragment.bindViewsInFields$lambda$0(changeOrderSourceAddressFragment);
                break;
            default:
                ChangeOrderSourceAddressFragment.bindViewsInFields$lambda$2$0(changeOrderSourceAddressFragment);
                break;
        }
    }
}
