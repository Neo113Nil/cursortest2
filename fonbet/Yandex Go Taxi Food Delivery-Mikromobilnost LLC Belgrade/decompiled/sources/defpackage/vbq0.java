package defpackage;

import com.yandex.payment.sdk.ui.payment.select.SelectFragment;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class vbq0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectFragment b;

    public /* synthetic */ vbq0(SelectFragment selectFragment, int i) {
        this.a = i;
        this.b = selectFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 observeChanges$lambda$0;
        zy11 observeChanges$lambda$1;
        zy11 observeChanges$lambda$2;
        zy11 observeChanges$lambda$3;
        zy11 observeChanges$lambda$4;
        zy11 onViewCreated$lambda$1;
        int i = this.a;
        SelectFragment selectFragment = this.b;
        switch (i) {
            case 0:
                observeChanges$lambda$0 = SelectFragment.observeChanges$lambda$0(selectFragment, (uv90) obj);
                return observeChanges$lambda$0;
            case 1:
                observeChanges$lambda$1 = SelectFragment.observeChanges$lambda$1(selectFragment, (Pair) obj);
                return observeChanges$lambda$1;
            case 2:
                observeChanges$lambda$2 = SelectFragment.observeChanges$lambda$2(selectFragment, (keq0) obj);
                return observeChanges$lambda$2;
            case 3:
                observeChanges$lambda$3 = SelectFragment.observeChanges$lambda$3(selectFragment, (z27) obj);
                return observeChanges$lambda$3;
            case 4:
                observeChanges$lambda$4 = SelectFragment.observeChanges$lambda$4(selectFragment, (i4p) obj);
                return observeChanges$lambda$4;
            default:
                onViewCreated$lambda$1 = SelectFragment.onViewCreated$lambda$1(selectFragment, ((Boolean) obj).booleanValue());
                return onViewCreated$lambda$1;
        }
    }
}
