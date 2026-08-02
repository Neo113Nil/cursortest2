package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class vc8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardDeletionFragment b;

    public /* synthetic */ vc8(CardDeletionFragment cardDeletionFragment, int i) {
        this.a = i;
        this.b = cardDeletionFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$4;
        zy11 viewBinding$lambda$3$lambda$1;
        zy11 viewBinding$lambda$3$lambda$2;
        int i = this.a;
        CardDeletionFragment cardDeletionFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$4 = CardDeletionFragment.onViewCreated$lambda$4(cardDeletionFragment);
                return onViewCreated$lambda$4;
            case 1:
                viewBinding$lambda$3$lambda$1 = CardDeletionFragment.getViewBinding$lambda$3$lambda$1(cardDeletionFragment);
                return viewBinding$lambda$3$lambda$1;
            default:
                viewBinding$lambda$3$lambda$2 = CardDeletionFragment.getViewBinding$lambda$3$lambda$2(cardDeletionFragment);
                return viewBinding$lambda$3$lambda$2;
        }
    }
}
