package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardSkinView;

/* loaded from: classes3.dex */
public final class z161 implements zo31 {
    public final CardSkinView a;

    public z161(CardSkinView cardSkinView) {
        this.a = cardSkinView;
    }

    public static z161 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(anh0.ybsdk_item_card, viewGroup, false);
        if (inflate != null) {
            return new z161((CardSkinView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final CardSkinView o() {
        return this.a;
    }
}
