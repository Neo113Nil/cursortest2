package ru.yandex.taxi.address.design;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ax1;
import defpackage.bms;
import defpackage.dv31;
import defpackage.g18;
import defpackage.hg;
import defpackage.kyh0;
import defpackage.nwy0;
import defpackage.pav;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0012J\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\u001d\u0010\u001e\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010!\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b\"\u0010\u001fJ\u001d\u0010#\u001a\u00020\u000b2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b#\u0010\u001fJ5\u0010(\u001a\u00020\u000b2&\u0010'\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000b¢\u0006\u0004\b*\u0010\u000fJ\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010\u000fJ5\u0010,\u001a\u00020\u000b2&\u0010'\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000b0$¢\u0006\u0004\b,\u0010)J\u001d\u0010.\u001a\u00020\u000b2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b.\u0010\u001fJ\u001d\u0010/\u001a\u00020\u000b2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b/\u0010\u001fJ\u001d\u00101\u001a\u00020\u000b2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b1\u0010\u001fJ\u001d\u00102\u001a\u00020\u000b2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b2\u0010\u001fJ\u0017\u00105\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000108¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000108¢\u0006\u0004\b;\u0010:J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020<¢\u0006\u0004\b?\u0010>J\r\u0010@\u001a\u00020\u000b¢\u0006\u0004\b@\u0010\u000fJ\r\u0010A\u001a\u00020\u000b¢\u0006\u0004\bA\u0010\u000fJ\r\u0010B\u001a\u00020\u000b¢\u0006\u0004\bB\u0010\u000fJ\r\u0010C\u001a\u00020\u000b¢\u0006\u0004\bC\u0010\u000fR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010M¨\u0006O"}, d2 = {"Lru/yandex/taxi/address/design/SourceDestinationComponentV2;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onDetachedFromWindow", "()V", "", "hasFocus", "()Z", "Lru/yandex/taxi/address/experiment/r;", ClidProvider.STATE, "render", "(Lru/yandex/taxi/address/experiment/r;)V", "visible", "updateBottomDivider", "(Z)V", "hasSourceFocus", "hasDestinationFocus", "Lkotlin/Function0;", "onClick", "setOnSourceClickListener", "(Lsls;)V", "setOnSourceButtonClickListener", "setOnDestinationClickListener", "setOnDestinationButtonClickListener", "setDestinationTrailButtonListener", "Lkotlin/Function4;", "", "", "onTextChanged", "setOnSourceTextChangeListener", "(Lbms;)V", "removeOnSourceTextChangeListener", "removeOnDestinationTextChangeListener", "setOnDestinationTextChangeListener", "onClear", "setOnSourceClearListener", "setOnDestinationClearListener", "onClose", "setSourceOnCloseOnKeyboardCloseListener", "setDestinationOnCloseOnKeyboardCloseListener", "Landroid/widget/TextView$OnEditorActionListener;", "listener", "setSourceOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "setDestinationOnEditorActionListener", "Landroid/view/View$OnFocusChangeListener;", "setOnSourceFocusChangedListener", "(Landroid/view/View$OnFocusChangeListener;)V", "setOnDestinationFocusChangedListener", "Landroid/widget/EditText;", "sourceInput", "()Landroid/widget/EditText;", "destinationInput", "closeSourceKeyboard", "closeDestinationKeyboard", "requestSourceFocus", "requestDestinationFocus", "Lru/yandex/taxi/address/design/AddressInputView;", "sourceAddress", "Lru/yandex/taxi/address/design/AddressInputView;", "destinationAddress", "Ldv31;", "stateHolder", "Ldv31;", "Lg18;", "sourceTextChangedCancellable", "Lg18;", "destinationTextChangedCancellable", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SourceDestinationComponentV2 extends LinearLayout implements nwy0 {
    private final AddressInputView destinationAddress;
    private g18 destinationTextChangedCancellable;
    private final AddressInputView sourceAddress;
    private g18 sourceTextChangedCancellable;
    private final dv31 stateHolder;

    public SourceDestinationComponentV2(Context context, pav pavVar) {
        super(context);
        AddressInputView addressInputView = new AddressInputView(context, pavVar);
        this.sourceAddress = addressInputView;
        AddressInputView addressInputView2 = new AddressInputView(context, pavVar);
        this.destinationAddress = addressInputView2;
        ax1 ax1Var = new ax1(this, new r(0), this, 6);
        this.stateHolder = ax1Var;
        ax1Var.e();
        setOrientation(1);
        addView(addressInputView, -1, -2);
        addView(addressInputView2, -1, -2);
        hg.a(addressInputView);
        hg.a(addressInputView2);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        dv31 dv31Var = this.stateHolder;
        dv31Var.g(dv31Var.d, false, false);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void closeDestinationKeyboard() {
        this.destinationAddress.closeKeyboard();
    }

    public final void closeSourceKeyboard() {
        this.sourceAddress.closeKeyboard();
    }

    public final EditText destinationInput() {
        return this.destinationAddress.inputView();
    }

    public final boolean hasDestinationFocus() {
        return this.destinationAddress.hasFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.sourceAddress.hasFocus() || this.destinationAddress.hasFocus();
    }

    public final boolean hasSourceFocus() {
        return this.sourceAddress.hasFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.sourceTextChangedCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        g18 g18Var2 = this.destinationTextChangedCancellable;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
        super.onDetachedFromWindow();
    }

    public final void removeOnDestinationTextChangeListener() {
        g18 g18Var = this.destinationTextChangedCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    public final void removeOnSourceTextChangeListener() {
        g18 g18Var = this.sourceTextChangedCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    public final void render(r state) {
        this.stateHolder.g(state, false, false);
    }

    public final void requestDestinationFocus() {
        this.destinationAddress.requestFocus();
    }

    public final void requestSourceFocus() {
        this.sourceAddress.requestFocus();
    }

    public final void setDestinationOnCloseOnKeyboardCloseListener(sls onClose) {
        this.destinationAddress.setOnKeyboardCloseListener(onClose);
    }

    public final void setDestinationOnEditorActionListener(TextView.OnEditorActionListener listener) {
        this.destinationAddress.setOnEditorActionListener(listener);
    }

    public final void setDestinationTrailButtonListener(sls onClick) {
        this.destinationAddress.changeTrailButtonVisibility(onClick != null);
        this.destinationAddress.setTrailButtonClickListener(onClick);
        this.destinationAddress.setTrailContentDescription(kyh0.add_route_stop);
    }

    public final void setOnDestinationButtonClickListener(sls onClick) {
        this.destinationAddress.setOnButtonClickListener(onClick);
    }

    public final void setOnDestinationClearListener(sls onClear) {
        this.destinationAddress.setOnClearListener(onClear);
    }

    public final void setOnDestinationClickListener(sls onClick) {
        c.z(onClick, this.destinationAddress);
    }

    public final void setOnDestinationFocusChangedListener(View.OnFocusChangeListener listener) {
        this.destinationAddress.setOnFocusChangeListener(listener);
    }

    public final void setOnDestinationTextChangeListener(bms onTextChanged) {
        g18 g18Var = this.destinationTextChangedCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.destinationTextChangedCancellable = this.destinationAddress.setOnTextChangedListener(onTextChanged);
    }

    public final void setOnSourceButtonClickListener(sls onClick) {
        this.sourceAddress.setOnButtonClickListener(onClick);
    }

    public final void setOnSourceClearListener(sls onClear) {
        this.sourceAddress.setOnClearListener(onClear);
    }

    public final void setOnSourceClickListener(sls onClick) {
        c.z(onClick, this.sourceAddress);
    }

    public final void setOnSourceFocusChangedListener(View.OnFocusChangeListener listener) {
        this.sourceAddress.setOnFocusChangeListener(listener);
    }

    public final void setOnSourceTextChangeListener(bms onTextChanged) {
        g18 g18Var = this.sourceTextChangedCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.sourceTextChangedCancellable = this.sourceAddress.setOnTextChangedListener(onTextChanged);
    }

    public final void setSourceOnCloseOnKeyboardCloseListener(sls onClose) {
        this.sourceAddress.setOnKeyboardCloseListener(onClose);
    }

    public final void setSourceOnEditorActionListener(TextView.OnEditorActionListener listener) {
        this.sourceAddress.setOnEditorActionListener(listener);
    }

    public final EditText sourceInput() {
        return this.sourceAddress.inputView();
    }

    public final void updateBottomDivider(boolean visible) {
        AddressInputView addressInputView = this.destinationAddress;
        if (visible) {
            addressInputView.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        } else {
            addressInputView.setDividers(DividerPosition.NONE, DividerType.NONE);
        }
    }
}
