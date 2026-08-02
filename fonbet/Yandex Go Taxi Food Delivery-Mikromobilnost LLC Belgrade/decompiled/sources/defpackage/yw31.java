package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.design.divider.CardDivider;
import ru.yandex.taxi.design.DividerWithColorView;

/* loaded from: classes14.dex */
public abstract class yw31 {
    public static final CardDivider a(Context context, CardDivider.Type type, int i) {
        CardDivider cardDivider = new CardDivider(context, null, 0, 6, null);
        cardDivider.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cardDivider.setType(type);
        cardDivider.setDividerHeight(i);
        cardDivider.setFocusable(false);
        cardDivider.setImportantForAccessibility(4);
        return cardDivider;
    }

    public static final DividerWithColorView b(int i, Context context) {
        DividerWithColorView dividerWithColorView = new DividerWithColorView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, tje.u(1, dividerWithColorView.getContext()));
        int u = tje.u(i, dividerWithColorView.getContext());
        int u2 = tje.u(16, dividerWithColorView.getContext());
        int i2 = marginLayoutParams.topMargin;
        int i3 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(u);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(u2);
        marginLayoutParams.bottomMargin = i3;
        dividerWithColorView.setLayoutParams(marginLayoutParams);
        dividerWithColorView.updateColor(new bdc(xng0.line));
        dividerWithColorView.setFocusable(false);
        dividerWithColorView.setImportantForAccessibility(4);
        return dividerWithColorView;
    }
}
