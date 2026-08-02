package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.s;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.c;
import com.yandex.alicekit.core.views.AbstractModeBarView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$CloseReason;
import com.yandex.go.payments.shared.members.list.b;
import com.yandex.go.taxi.order.comment.FeedbackCommentModalView$makeInputScrollable$1;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView;
import com.yandex.plus.pay.ui.common.api.log.PlusPayLogLayoutInflaterFactory;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersBannerView;
import com.ybsdk.widgets.common.PinCodeDotsView;
import com.ybsdk.widgets.common.SmsCodeEditText;
import ru.rt.ebs.cryptosdk.presentation.customView.CustomizableHeader;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes15.dex */
public final /* synthetic */ class t8 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean _init_$lambda$2;
        boolean onAttachedToWindow$lambda$1;
        boolean lambda$6$lambda$5;
        boolean lambda$0$0;
        boolean z;
        boolean onViewAttachedToWindow$lambda$0;
        boolean disallowParentInterceptTouchEventsOnScroll$lambda$0;
        boolean _init_$lambda$1;
        boolean onTouch;
        boolean _init_$lambda$22;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        View.OnTouchListener onTouchListener3;
        View.OnTouchListener onTouchListener4;
        boolean initEditText$lambda$16;
        boolean addClickLogging$lambda$2;
        s sVar;
        boolean lambda$setUpContentOnTouchListener$4;
        boolean _init_$lambda$12;
        boolean _init_$lambda$23;
        boolean onTouchCover;
        boolean handleTouchEvents$lambda$11;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                _init_$lambda$2 = AbstractModeBarView._init_$lambda$2((AbstractModeBarView) obj, view, motionEvent);
                return _init_$lambda$2;
            case 1:
                EditText editText = (EditText) obj;
                if ((motionEvent == null || motionEvent.getAction() == 1) && editText != null) {
                    editText.post(new ce0(editText, 15));
                }
                return false;
            case 2:
                onAttachedToWindow$lambda$1 = AnimatedListItemInputComponent.onAttachedToWindow$lambda$1((AnimatedListItemInputComponent) obj, view, motionEvent);
                return onAttachedToWindow$lambda$1;
            case 3:
                ((e) obj).y0.a.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if (action == 0) {
                    view.setPressed(true);
                } else if (action == 1 || action == 3) {
                    view.setPressed(false);
                }
                return true;
            case 4:
                lambda$6$lambda$5 = CardInputMainView.lambda$6$lambda$5((CardInputMainView) obj, view, motionEvent);
                return lambda$6$lambda$5;
            case 5:
                lambda$0$0 = CardInputView.lambda$0$0((CardInputView) obj, view, motionEvent);
                return lambda$0$0;
            case 6:
                z = CustomizableHeader.setupActionButtonClickAnimation$lambda$0((CustomizableHeader) obj, view, motionEvent);
                return z;
            case 7:
                c cVar = (c) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - cVar.o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        cVar.m = false;
                    }
                    cVar.t();
                    cVar.m = true;
                    cVar.o = SystemClock.uptimeMillis();
                }
                return false;
            case 8:
                onViewAttachedToWindow$lambda$0 = FeedbackCommentModalView$makeInputScrollable$1.onViewAttachedToWindow$lambda$0((KeyboardAwareRobotoEditText) obj, view, motionEvent);
                return onViewAttachedToWindow$lambda$0;
            case 9:
                disallowParentInterceptTouchEventsOnScroll$lambda$0 = ListItemInputComponent.disallowParentInterceptTouchEventsOnScroll$lambda$0((ListItemInputComponent) obj, view, motionEvent);
                return disallowParentInterceptTouchEventsOnScroll$lambda$0;
            case 10:
                b bVar = (b) obj;
                if (motionEvent.getAction() == 1) {
                    bVar.B.r(SharedPaymentAnalytics$CloseReason.OUT_ALERT);
                }
                view.performClick();
                return false;
            case 11:
                _init_$lambda$1 = MerchantOffersBannerView._init_$lambda$1((MerchantOffersBannerView) obj, view, motionEvent);
                return _init_$lambda$1;
            case 12:
                onTouch = ((Mesix) obj).onTouch(view, motionEvent);
                return onTouch;
            case 13:
                _init_$lambda$22 = MtMainFlexModalView._init_$lambda$2((MtMainFlexModalView) obj, view, motionEvent);
                return _init_$lambda$22;
            case 14:
                com.yandex.messaging.internal.view.timeline.overlay.b bVar2 = (com.yandex.messaging.internal.view.timeline.overlay.b) obj;
                lg m = bVar2.w.m();
                if (m != null && (onTouchListener4 = (View.OnTouchListener) m.d) != null && onTouchListener4.onTouch(view, motionEvent)) {
                    return true;
                }
                lg lgVar = bVar2.x.M;
                if (lgVar != null && (onTouchListener3 = (View.OnTouchListener) lgVar.d) != null && onTouchListener3.onTouch(view, motionEvent)) {
                    return true;
                }
                lg lgVar2 = bVar2.y.G;
                if (lgVar2 != null && (onTouchListener2 = (View.OnTouchListener) lgVar2.d) != null && onTouchListener2.onTouch(view, motionEvent)) {
                    return true;
                }
                lg lgVar3 = bVar2.z.P;
                if (lgVar3 != null && (onTouchListener = (View.OnTouchListener) lgVar3.d) != null && onTouchListener.onTouch(view, motionEvent)) {
                    return true;
                }
                View.OnTouchListener onTouchListener5 = bVar2.A;
                if (onTouchListener5 != null) {
                    return onTouchListener5.onTouch(view, motionEvent);
                }
                return false;
            case 15:
                initEditText$lambda$16 = PinCodeDotsView.initEditText$lambda$16((PinCodeDotsView) obj, view, motionEvent);
                return initEditText$lambda$16;
            case 16:
                addClickLogging$lambda$2 = PlusPayLogLayoutInflaterFactory.addClickLogging$lambda$2((PlusPayLogLayoutInflaterFactory) obj, view, motionEvent);
                return addClickLogging$lambda$2;
            case 17:
                cel0 cel0Var = (cel0) obj;
                if (motionEvent.getActionMasked() == 0 && (sVar = cel0Var.V) != null) {
                    sVar.p(cel0Var);
                }
                return false;
            case 18:
                lambda$setUpContentOnTouchListener$4 = ((SearchView) obj).lambda$setUpContentOnTouchListener$4(view, motionEvent);
                return lambda$setUpContentOnTouchListener$4;
            case 19:
                _init_$lambda$12 = SliderButtonView._init_$lambda$1((SliderButtonView) obj, view, motionEvent);
                return _init_$lambda$12;
            case 20:
                _init_$lambda$23 = SmsCodeEditText._init_$lambda$2((SmsCodeEditText) obj, view, motionEvent);
                return _init_$lambda$23;
            case 21:
                onTouchCover = ((SolidSummaryView) obj).onTouchCover(view, motionEvent);
                return onTouchCover;
            default:
                handleTouchEvents$lambda$11 = StoriesComponentView.handleTouchEvents$lambda$11((StoriesComponentView) obj, view, motionEvent);
                return handleTouchEvents$lambda$11;
        }
    }
}
