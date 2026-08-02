package defpackage;

import android.view.View;
import com.yandex.go.payments.cards.ui.CardNumberPadView;
import com.ybsdk.widgets.common.MoneyInputEditView;

/* loaded from: classes13.dex */
public final /* synthetic */ class vk8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CardNumberPadView b;

    public /* synthetic */ vk8(CardNumberPadView cardNumberPadView, int i) {
        this.a = i;
        this.b = cardNumberPadView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        CardNumberPadView cardNumberPadView = this.b;
        switch (i) {
            case 0:
                cardNumberPadView.addCharToFocusedView('9');
                break;
            case 1:
                cardNumberPadView.onBackspaceClick();
                break;
            case 2:
                cardNumberPadView.addCharToFocusedView(MoneyInputEditView.DEFAULT_VALUE);
                break;
            case 3:
                cardNumberPadView.addCharToFocusedView('1');
                break;
            case 4:
                cardNumberPadView.addCharToFocusedView('2');
                break;
            case 5:
                cardNumberPadView.addCharToFocusedView('3');
                break;
            case 6:
                cardNumberPadView.addCharToFocusedView('4');
                break;
            case 7:
                cardNumberPadView.addCharToFocusedView('5');
                break;
            case 8:
                cardNumberPadView.addCharToFocusedView('6');
                break;
            case 9:
                cardNumberPadView.addCharToFocusedView('7');
                break;
            default:
                cardNumberPadView.addCharToFocusedView('8');
                break;
        }
    }
}
