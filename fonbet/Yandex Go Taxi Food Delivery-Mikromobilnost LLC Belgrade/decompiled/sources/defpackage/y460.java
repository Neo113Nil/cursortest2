package defpackage;

import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class y460 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ NewBindFragment b;

    public /* synthetic */ y460(NewBindFragment newBindFragment, int i) {
        this.a = i;
        this.b = newBindFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 observeChanges$lambda$0;
        zy11 observeChanges$lambda$1;
        zy11 observeChanges$lambda$2;
        zy11 bindPersonalInfo$lambda$0$1;
        int i = this.a;
        NewBindFragment newBindFragment = this.b;
        switch (i) {
            case 0:
                observeChanges$lambda$0 = NewBindFragment.observeChanges$lambda$0(newBindFragment, (f98) obj);
                return observeChanges$lambda$0;
            case 1:
                observeChanges$lambda$1 = NewBindFragment.observeChanges$lambda$1(newBindFragment, (nn8) obj);
                return observeChanges$lambda$1;
            case 2:
                observeChanges$lambda$2 = NewBindFragment.observeChanges$lambda$2(newBindFragment, (nl41) obj);
                return observeChanges$lambda$2;
            default:
                bindPersonalInfo$lambda$0$1 = NewBindFragment.bindPersonalInfo$lambda$0$1(newBindFragment, ((Boolean) obj).booleanValue());
                return bindPersonalInfo$lambda$0$1;
        }
    }
}
