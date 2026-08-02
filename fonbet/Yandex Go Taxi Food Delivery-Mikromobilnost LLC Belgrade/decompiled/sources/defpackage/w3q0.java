package defpackage;

import android.view.ViewGroup;
import com.yandex.go.design.divider.CardDivider;

/* loaded from: classes13.dex */
public final class w3q0 implements tls {
    public static final w3q0 a = new w3q0();

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        CardDivider cardDivider = new CardDivider(((ViewGroup) obj).getContext(), null, 0, 6, null);
        cardDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cardDivider.setType(CardDivider.Type.BOTH);
        cardDivider.setFocusable(false);
        cardDivider.setImportantForAccessibility(4);
        cardDivider.setDividerHeight(tje.r(dug0.discovery_organizations_card_divider_height, cardDivider.getContext()));
        return cardDivider;
    }
}
