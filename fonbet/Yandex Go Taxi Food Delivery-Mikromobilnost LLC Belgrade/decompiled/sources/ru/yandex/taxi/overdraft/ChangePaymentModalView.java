package ru.yandex.taxi.overdraft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.b;
import defpackage.agh0;
import defpackage.dn7;
import defpackage.p8h0;
import defpackage.rp31;
import defpackage.tdj;
import defpackage.zi;
import defpackage.zkh0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.overdraft.ChangePaymentModalView;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lru/yandex/taxi/overdraft/ChangePaymentModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ltdj;", Constants.KEY_DATA, "withData", "(Ltdj;)Lru/yandex/taxi/overdraft/ChangePaymentModalView;", "Ljava/lang/Runnable;", "onAnimationEnd", "Lzy11;", "dismissInternal", "(Ljava/lang/Runnable;)V", "onPayLater", "withOnPayLater", "(Ljava/lang/Runnable;)Lru/yandex/taxi/overdraft/ChangePaymentModalView;", "onPaymentChanged", "withOnPaymentChanged", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "content", "Landroid/view/View;", "Lru/yandex/taxi/design/ButtonComponent;", "negativeButton", "Lru/yandex/taxi/design/ButtonComponent;", "positiveButton", "Lru/yandex/taxi/design/ListHeaderComponent;", "header", "Lru/yandex/taxi/design/ListHeaderComponent;", "Lru/yandex/taxi/design/ListTextComponent;", "text", "Lru/yandex/taxi/design/ListTextComponent;", "onPayLaterRunnable", "Ljava/lang/Runnable;", "onPaymentChangedRunnable", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangePaymentModalView extends ModalView {
    public static final int $stable = 8;
    private final View content;
    private final ListHeaderComponent header;
    private final ButtonComponent negativeButton;
    private Runnable onPayLaterRunnable;
    private Runnable onPaymentChangedRunnable;
    private final ButtonComponent positiveButton;
    private final ListTextComponent text;

    public ChangePaymentModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPayLaterRunnable = new zi(28);
        this.onPaymentChangedRunnable = new zi(29);
        final int i2 = 1;
        c.q(this, zkh0.overdraft_offer_modal_view, true);
        final int i3 = 0;
        setDismissOnTouchOutside(false);
        int i4 = agh0.content;
        WeakHashMap weakHashMap = b.a;
        this.content = (View) rp31.d(this, i4);
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, p8h0.negative_button));
        this.negativeButton = buttonComponent;
        ButtonComponent buttonComponent2 = (ButtonComponent) ((View) rp31.d(this, p8h0.positive_button));
        this.positiveButton = buttonComponent2;
        this.header = (ListHeaderComponent) ((View) rp31.d(this, p8h0.header_component));
        this.text = (ListTextComponent) ((View) rp31.d(this, p8h0.text_component));
        buttonComponent.setOnClickListener(new View.OnClickListener(this) { // from class: wd9
            public final /* synthetic */ ChangePaymentModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i3;
                ChangePaymentModalView changePaymentModalView = this.b;
                switch (i5) {
                    case 0:
                        ChangePaymentModalView._init_$lambda$0(changePaymentModalView, view);
                        break;
                    default:
                        ChangePaymentModalView._init_$lambda$1(changePaymentModalView, view);
                        break;
                }
            }
        });
        buttonComponent2.setOnClickListener(new View.OnClickListener(this) { // from class: wd9
            public final /* synthetic */ ChangePaymentModalView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                ChangePaymentModalView changePaymentModalView = this.b;
                switch (i5) {
                    case 0:
                        ChangePaymentModalView._init_$lambda$0(changePaymentModalView, view);
                        break;
                    default:
                        ChangePaymentModalView._init_$lambda$1(changePaymentModalView, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChangePaymentModalView changePaymentModalView, View view) {
        changePaymentModalView.onPayLaterRunnable.run();
        changePaymentModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ChangePaymentModalView changePaymentModalView, View view) {
        changePaymentModalView.dismissInternal(new dn7(21, changePaymentModalView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(ChangePaymentModalView changePaymentModalView) {
        changePaymentModalView.onPaymentChangedRunnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPayLaterRunnable$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPaymentChangedRunnable$lambda$0() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(onAnimationEnd);
        this.negativeButton.setOnClickListener((View.OnClickListener) null);
        this.positiveButton.setOnClickListener((View.OnClickListener) null);
    }

    public final ChangePaymentModalView withData(tdj data) {
        this.header.setTitle(data.b);
        this.text.setText(data.c);
        this.negativeButton.setText(data.h);
        this.positiveButton.setText(data.g);
        return this;
    }

    public final ChangePaymentModalView withOnPayLater(Runnable onPayLater) {
        this.onPayLaterRunnable = onPayLater;
        return this;
    }

    public final ChangePaymentModalView withOnPaymentChanged(Runnable onPaymentChanged) {
        this.onPaymentChangedRunnable = onPaymentChanged;
        return this;
    }

    public ChangePaymentModalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChangePaymentModalView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChangePaymentModalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
