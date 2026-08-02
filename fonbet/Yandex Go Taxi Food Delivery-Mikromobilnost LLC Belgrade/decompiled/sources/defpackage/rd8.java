package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class rd8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardDetailsFragment b;

    public /* synthetic */ rd8(CardDetailsFragment cardDetailsFragment, int i) {
        this.a = i;
        this.b = cardDetailsFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 renderPromoInfo$lambda$40;
        zy11 viewBinding$lambda$27$lambda$23;
        int i = this.a;
        CardDetailsFragment cardDetailsFragment = this.b;
        switch (i) {
            case 0:
                renderPromoInfo$lambda$40 = CardDetailsFragment.renderPromoInfo$lambda$40(cardDetailsFragment, (String) obj);
                return renderPromoInfo$lambda$40;
            default:
                viewBinding$lambda$27$lambda$23 = CardDetailsFragment.getViewBinding$lambda$27$lambda$23(cardDetailsFragment, (k5x0) obj);
                return viewBinding$lambda$27$lambda$23;
        }
    }
}
