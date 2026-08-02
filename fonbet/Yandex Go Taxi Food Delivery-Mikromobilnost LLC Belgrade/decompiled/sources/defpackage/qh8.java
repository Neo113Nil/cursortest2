package defpackage;

import com.yandex.payment.divkit.bind.view.DKCardInputViewImpl;
import com.yandex.payment.sdk.ui.CardInputMode;
import com.yandex.payment.sdk.ui.view.card.CardInputViewImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class qh8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rwo b;
    public final /* synthetic */ CardInputMode c;

    public /* synthetic */ qh8(rwo rwoVar, CardInputMode cardInputMode, int i) {
        this.a = i;
        this.b = rwoVar;
        this.c = cardInputMode;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        CardInputMode cardInputMode = this.c;
        rwo rwoVar = this.b;
        czv czvVar = (czv) obj;
        switch (i) {
            case 0:
                zy11Var = CardInputViewImpl.setup$lambda$0(rwoVar, cardInputMode, czvVar);
                return zy11Var;
            default:
                zy11Var2 = DKCardInputViewImpl.setup$lambda$0(rwoVar, cardInputMode, czvVar);
                return zy11Var2;
        }
    }
}
