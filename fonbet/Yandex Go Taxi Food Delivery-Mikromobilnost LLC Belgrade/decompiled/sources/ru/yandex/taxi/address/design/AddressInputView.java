package ru.yandex.taxi.address.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import defpackage.adh0;
import defpackage.bdc;
import defpackage.bk;
import defpackage.bms;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.evu0;
import defpackage.fph0;
import defpackage.g18;
import defpackage.h60;
import defpackage.i3y;
import defpackage.j0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.l30;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pw0;
import defpackage.qw0;
import defpackage.s8o;
import defpackage.sls;
import defpackage.sw0;
import defpackage.tf;
import defpackage.tje;
import defpackage.tw0;
import defpackage.uw0;
import defpackage.vw0;
import defpackage.w511;
import defpackage.ww0;
import defpackage.xng0;
import defpackage.y4;
import defpackage.yw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.experiment.AddressItemMode;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 t2\u00020\u0001:\u0001uB\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\r2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\r2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\u0017J5\u0010&\u001a\u00020%2&\u0010$\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\"¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\r2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010+\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J\r\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\r¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\r2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010A\u001a\u00020\r*\u00020>2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\r2\u0006\u0010C\u001a\u00020\bH\u0002¢\u0006\u0004\bD\u0010\u001fJ\u001f\u0010F\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010K\u001a\u00020\r2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020HH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\rH\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\rH\u0002¢\u0006\u0004\bN\u00109J\u001b\u0010Q\u001a\u00020\r*\u00020O2\u0006\u0010P\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010V\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001b\u0010d\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010`R\u001b\u0010h\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u0010gR\u001b\u0010k\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010^\u001a\u0004\bj\u0010gR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010YR\u0016\u0010p\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010[R\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00100q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s¨\u0006v"}, d2 = {"Lru/yandex/taxi/address/design/AddressInputView;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "", "hasFocus", "()Z", "Landroid/view/View$OnClickListener;", "listener", "Lzy11;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lru/yandex/taxi/address/experiment/a;", ClidProvider.STATE, "render", "(Lru/yandex/taxi/address/experiment/a;)V", "Lkotlin/Function0;", "onClick", "setOnButtonClickListener", "(Lsls;)V", "setTrailButtonClickListener", "", "descriptionId", "setTrailContentDescription", "(I)V", "visible", "changeTrailButtonVisibility", "(Z)V", "onClear", "setOnClearListener", "Lkotlin/Function4;", "", "onTextChanged", "Lg18;", "setOnTextChangedListener", "(Lbms;)Lg18;", "onClose", "setOnKeyboardCloseListener", "Landroid/widget/TextView$OnEditorActionListener;", "setOnEditorActionListener", "(Landroid/widget/TextView$OnEditorActionListener;)V", "Landroid/view/View$OnFocusChangeListener;", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "requestFocus", "(ILandroid/graphics/Rect;)Z", "Landroid/widget/EditText;", "inputView", "()Landroid/widget/EditText;", "closeKeyboard", "()V", "Lru/yandex/taxi/address/experiment/AddressItemMode;", "mode", "updateMode", "(Lru/yandex/taxi/address/experiment/AddressItemMode;)V", "Lww0;", "Lru/yandex/taxi/address/experiment/NewbiesRedesignPointsABExperiment$SummaryAddressStyle;", "style", "updateLayout", "(Lww0;Lru/yandex/taxi/address/experiment/NewbiesRedesignPointsABExperiment$SummaryAddressStyle;)V", "editable", "setEditable", "isTextChanged", "updateAddress", "(Lru/yandex/taxi/address/experiment/a;Z)V", "Lyw0;", "oldIcon", "newIcon", "updateIcon", "(Lyw0;Lyw0;)V", "checkClearTextVisible", "initAddressInput", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "animate", "updateAnimation", "(Lru/yandex/taxi/widget/ShimmeringRobotoTextView;Z)V", "buttonColor", "(Lru/yandex/taxi/address/experiment/a;)I", "Lpav;", "binding", "Lww0;", "onClearListener", "Lsls;", "canWatchText", "Z", "", "maxTextSize$delegate", "Li3y;", "getMaxTextSize", "()F", "maxTextSize", "minTextSize$delegate", "getMinTextSize", "minTextSize", "minorStyleButtonColor$delegate", "getMinorStyleButtonColor", "()I", "minorStyleButtonColor", "mainStyleButtonColor$delegate", "getMainStyleButtonColor", "mainStyleButtonColor", "Lkdc;", "hintTextColor", "Lkdc;", "defaultOnClickListener", "firstInit", "Ldv31;", "stateHolder", "Ldv31;", "Companion", "sw0", "sourcedestination"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressInputView extends DividerAwareComponent {
    public static final sw0 Companion = new sw0();
    private static final int INPUT_MAX_LINES = 2;
    private static final int SHIMMERING_ANIMATION_DURATION = 900;
    private final ww0 binding;
    private boolean canWatchText;
    private final sls defaultOnClickListener;
    private boolean firstInit;
    private final kdc hintTextColor;
    private final pav imageLoader;

    /* renamed from: mainStyleButtonColor$delegate, reason: from kotlin metadata */
    private final i3y mainStyleButtonColor;

    /* renamed from: maxTextSize$delegate, reason: from kotlin metadata */
    private final i3y maxTextSize;

    /* renamed from: minTextSize$delegate, reason: from kotlin metadata */
    private final i3y minTextSize;

    /* renamed from: minorStyleButtonColor$delegate, reason: from kotlin metadata */
    private final i3y minorStyleButtonColor;
    private sls onClearListener;
    private final dv31 stateHolder;

    public AddressInputView(Context context, pav pavVar) {
        super(context, null, 0, 6, null);
        View O;
        this.imageLoader = pavVar;
        LayoutInflater.from(context).inflate(fph0.address_input_view, this);
        int i = adh0.address;
        ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i, this);
        if (shimmeringRobotoTextView != null) {
            i = adh0.address_input;
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = (KeyboardAwareRobotoEditText) cma1.O(i, this);
            if (keyboardAwareRobotoEditText != null) {
                i = adh0.btn_barrier;
                if (((Barrier) cma1.O(i, this)) != null) {
                    i = adh0.btn_trail;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                    if (buttonComponent != null) {
                        i = adh0.button;
                        ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
                        if (buttonComponent2 != null) {
                            i = adh0.button_big;
                            ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, this);
                            if (constraintLayout != null) {
                                i = adh0.button_big_text;
                                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                                if (robotoTextView != null) {
                                    i = adh0.clear_text;
                                    ImageView imageView = (ImageView) cma1.O(i, this);
                                    if (imageView != null && (O = cma1.O((i = adh0.divider), this)) != null) {
                                        i = adh0.icon;
                                        ImageView imageView2 = (ImageView) cma1.O(i, this);
                                        if (imageView2 != null) {
                                            i = adh0.root_input;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) cma1.O(i, this);
                                            if (constraintLayout2 != null) {
                                                i = adh0.title;
                                                ShimmeringRobotoTextView shimmeringRobotoTextView2 = (ShimmeringRobotoTextView) cma1.O(i, this);
                                                if (shimmeringRobotoTextView2 != null) {
                                                    ww0 ww0Var = new ww0(this, shimmeringRobotoTextView, keyboardAwareRobotoEditText, buttonComponent, buttonComponent2, constraintLayout, robotoTextView, imageView, O, imageView2, constraintLayout2, shimmeringRobotoTextView2);
                                                    this.binding = ww0Var;
                                                    final int i2 = 1;
                                                    this.canWatchText = true;
                                                    final int i3 = 0;
                                                    this.maxTextSize = a.a(new sls(this) { // from class: rw0
                                                        public final /* synthetic */ AddressInputView b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // defpackage.sls
                                                        public final Object invoke() {
                                                            float maxTextSize_delegate$lambda$0;
                                                            float minTextSize_delegate$lambda$0;
                                                            int minorStyleButtonColor_delegate$lambda$0;
                                                            int mainStyleButtonColor_delegate$lambda$0;
                                                            zy11 defaultOnClickListener$lambda$0;
                                                            int i4 = i3;
                                                            AddressInputView addressInputView = this.b;
                                                            switch (i4) {
                                                                case 0:
                                                                    maxTextSize_delegate$lambda$0 = AddressInputView.maxTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(maxTextSize_delegate$lambda$0);
                                                                case 1:
                                                                    minTextSize_delegate$lambda$0 = AddressInputView.minTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(minTextSize_delegate$lambda$0);
                                                                case 2:
                                                                    minorStyleButtonColor_delegate$lambda$0 = AddressInputView.minorStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(minorStyleButtonColor_delegate$lambda$0);
                                                                case 3:
                                                                    mainStyleButtonColor_delegate$lambda$0 = AddressInputView.mainStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(mainStyleButtonColor_delegate$lambda$0);
                                                                default:
                                                                    defaultOnClickListener$lambda$0 = AddressInputView.defaultOnClickListener$lambda$0(addressInputView);
                                                                    return defaultOnClickListener$lambda$0;
                                                            }
                                                        }
                                                    });
                                                    this.minTextSize = a.a(new sls(this) { // from class: rw0
                                                        public final /* synthetic */ AddressInputView b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // defpackage.sls
                                                        public final Object invoke() {
                                                            float maxTextSize_delegate$lambda$0;
                                                            float minTextSize_delegate$lambda$0;
                                                            int minorStyleButtonColor_delegate$lambda$0;
                                                            int mainStyleButtonColor_delegate$lambda$0;
                                                            zy11 defaultOnClickListener$lambda$0;
                                                            int i4 = i2;
                                                            AddressInputView addressInputView = this.b;
                                                            switch (i4) {
                                                                case 0:
                                                                    maxTextSize_delegate$lambda$0 = AddressInputView.maxTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(maxTextSize_delegate$lambda$0);
                                                                case 1:
                                                                    minTextSize_delegate$lambda$0 = AddressInputView.minTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(minTextSize_delegate$lambda$0);
                                                                case 2:
                                                                    minorStyleButtonColor_delegate$lambda$0 = AddressInputView.minorStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(minorStyleButtonColor_delegate$lambda$0);
                                                                case 3:
                                                                    mainStyleButtonColor_delegate$lambda$0 = AddressInputView.mainStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(mainStyleButtonColor_delegate$lambda$0);
                                                                default:
                                                                    defaultOnClickListener$lambda$0 = AddressInputView.defaultOnClickListener$lambda$0(addressInputView);
                                                                    return defaultOnClickListener$lambda$0;
                                                            }
                                                        }
                                                    });
                                                    final int i4 = 2;
                                                    this.minorStyleButtonColor = a.a(new sls(this) { // from class: rw0
                                                        public final /* synthetic */ AddressInputView b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // defpackage.sls
                                                        public final Object invoke() {
                                                            float maxTextSize_delegate$lambda$0;
                                                            float minTextSize_delegate$lambda$0;
                                                            int minorStyleButtonColor_delegate$lambda$0;
                                                            int mainStyleButtonColor_delegate$lambda$0;
                                                            zy11 defaultOnClickListener$lambda$0;
                                                            int i42 = i4;
                                                            AddressInputView addressInputView = this.b;
                                                            switch (i42) {
                                                                case 0:
                                                                    maxTextSize_delegate$lambda$0 = AddressInputView.maxTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(maxTextSize_delegate$lambda$0);
                                                                case 1:
                                                                    minTextSize_delegate$lambda$0 = AddressInputView.minTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(minTextSize_delegate$lambda$0);
                                                                case 2:
                                                                    minorStyleButtonColor_delegate$lambda$0 = AddressInputView.minorStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(minorStyleButtonColor_delegate$lambda$0);
                                                                case 3:
                                                                    mainStyleButtonColor_delegate$lambda$0 = AddressInputView.mainStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(mainStyleButtonColor_delegate$lambda$0);
                                                                default:
                                                                    defaultOnClickListener$lambda$0 = AddressInputView.defaultOnClickListener$lambda$0(addressInputView);
                                                                    return defaultOnClickListener$lambda$0;
                                                            }
                                                        }
                                                    });
                                                    this.mainStyleButtonColor = a.a(new sls(this) { // from class: rw0
                                                        public final /* synthetic */ AddressInputView b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // defpackage.sls
                                                        public final Object invoke() {
                                                            float maxTextSize_delegate$lambda$0;
                                                            float minTextSize_delegate$lambda$0;
                                                            int minorStyleButtonColor_delegate$lambda$0;
                                                            int mainStyleButtonColor_delegate$lambda$0;
                                                            zy11 defaultOnClickListener$lambda$0;
                                                            int i42 = r2;
                                                            AddressInputView addressInputView = this.b;
                                                            switch (i42) {
                                                                case 0:
                                                                    maxTextSize_delegate$lambda$0 = AddressInputView.maxTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(maxTextSize_delegate$lambda$0);
                                                                case 1:
                                                                    minTextSize_delegate$lambda$0 = AddressInputView.minTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(minTextSize_delegate$lambda$0);
                                                                case 2:
                                                                    minorStyleButtonColor_delegate$lambda$0 = AddressInputView.minorStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(minorStyleButtonColor_delegate$lambda$0);
                                                                case 3:
                                                                    mainStyleButtonColor_delegate$lambda$0 = AddressInputView.mainStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(mainStyleButtonColor_delegate$lambda$0);
                                                                default:
                                                                    defaultOnClickListener$lambda$0 = AddressInputView.defaultOnClickListener$lambda$0(addressInputView);
                                                                    return defaultOnClickListener$lambda$0;
                                                            }
                                                        }
                                                    });
                                                    this.hintTextColor = new bdc(xng0.textMinor);
                                                    final int i5 = 4;
                                                    sls slsVar = new sls(this) { // from class: rw0
                                                        public final /* synthetic */ AddressInputView b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override // defpackage.sls
                                                        public final Object invoke() {
                                                            float maxTextSize_delegate$lambda$0;
                                                            float minTextSize_delegate$lambda$0;
                                                            int minorStyleButtonColor_delegate$lambda$0;
                                                            int mainStyleButtonColor_delegate$lambda$0;
                                                            zy11 defaultOnClickListener$lambda$0;
                                                            int i42 = i5;
                                                            AddressInputView addressInputView = this.b;
                                                            switch (i42) {
                                                                case 0:
                                                                    maxTextSize_delegate$lambda$0 = AddressInputView.maxTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(maxTextSize_delegate$lambda$0);
                                                                case 1:
                                                                    minTextSize_delegate$lambda$0 = AddressInputView.minTextSize_delegate$lambda$0(addressInputView);
                                                                    return Float.valueOf(minTextSize_delegate$lambda$0);
                                                                case 2:
                                                                    minorStyleButtonColor_delegate$lambda$0 = AddressInputView.minorStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(minorStyleButtonColor_delegate$lambda$0);
                                                                case 3:
                                                                    mainStyleButtonColor_delegate$lambda$0 = AddressInputView.mainStyleButtonColor_delegate$lambda$0(addressInputView);
                                                                    return Integer.valueOf(mainStyleButtonColor_delegate$lambda$0);
                                                                default:
                                                                    defaultOnClickListener$lambda$0 = AddressInputView.defaultOnClickListener$lambda$0(addressInputView);
                                                                    return defaultOnClickListener$lambda$0;
                                                            }
                                                        }
                                                    };
                                                    this.defaultOnClickListener = slsVar;
                                                    this.firstInit = true;
                                                    this.stateHolder = new vw0(this, new ru.yandex.taxi.address.experiment.a(null, null, null, null, null, null, null, null, null, false, false, null, null, 524287), this, context);
                                                    shimmeringRobotoTextView.setTextDirection(this.isRtl ? 4 : 3);
                                                    keyboardAwareRobotoEditText.setOnFocusChangeListener(new bk(i2, this));
                                                    keyboardAwareRobotoEditText.addTextChangedListener(new TextWatcher() { // from class: ru.yandex.taxi.address.design.AddressInputView$_init_$lambda$0$$inlined$addTextChangedListener$default$1
                                                        @Override // android.text.TextWatcher
                                                        public void afterTextChanged(Editable s) {
                                                            ww0 ww0Var2;
                                                            ww0Var2 = AddressInputView.this.binding;
                                                            ww0Var2.h.setVisibility((s == null || evu0.J(s)) ? 8 : 0);
                                                        }

                                                        @Override // android.text.TextWatcher
                                                        public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                                                        }

                                                        @Override // android.text.TextWatcher
                                                        public void onTextChanged(CharSequence text, int start, int before, int count) {
                                                        }
                                                    });
                                                    keyboardAwareRobotoEditText.setOnCloseListener(new pw0(i3, ww0Var));
                                                    c.z(new j0(12, this, ww0Var), imageView);
                                                    c.z(slsVar, this);
                                                    int r = tje.r(mrg0.go_design_s_space, getContext());
                                                    setPadding(r, r, r, r);
                                                    initAddressInput();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int buttonColor(ru.yandex.taxi.address.experiment.a state) {
        boolean z = state.i;
        if (z) {
            return getMinorStyleButtonColor();
        }
        if (!z) {
            return getMainStyleButtonColor();
        }
        w511.b();
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkClearTextVisible() {
        boolean z = ((ru.yandex.taxi.address.experiment.a) this.stateHolder.d).l == AddressItemMode.EDITABLE;
        Editable text = this.binding.c.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ww0 ww0Var = this.binding;
        ww0Var.h.setVisibility((ww0Var.c.hasFocus() && z && obj.length() > 0) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 defaultOnClickListener$lambda$0(AddressInputView addressInputView) {
        if (((ru.yandex.taxi.address.experiment.a) addressInputView.stateHolder.d).l == AddressItemMode.EDITABLE) {
            addressInputView.requestFocus();
        }
        return zy11.a;
    }

    private final int getMainStyleButtonColor() {
        return ((Number) this.mainStyleButtonColor.getValue()).intValue();
    }

    private final float getMaxTextSize() {
        return ((Number) this.maxTextSize.getValue()).floatValue();
    }

    private final float getMinTextSize() {
        return ((Number) this.minTextSize.getValue()).floatValue();
    }

    private final int getMinorStyleButtonColor() {
        return ((Number) this.minorStyleButtonColor.getValue()).intValue();
    }

    private final void initAddressInput() {
        ww0 ww0Var = this.binding;
        ww0Var.c.setImeOptions(3);
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = ww0Var.c;
        keyboardAwareRobotoEditText.setInputType(524401);
        keyboardAwareRobotoEditText.setHorizontallyScrolling(false);
        keyboardAwareRobotoEditText.setMaxLines(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$2(ww0 ww0Var) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = ww0Var.c;
        keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
        ww0Var.c.clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$3(AddressInputView addressInputView, ww0 ww0Var) {
        sls slsVar = addressInputView.onClearListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        ww0Var.c.setText("");
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int mainStyleButtonColor_delegate$lambda$0(AddressInputView addressInputView) {
        return c.c(xng0.controlMinor, addressInputView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float maxTextSize_delegate$lambda$0(AddressInputView addressInputView) {
        return c.d(mrg0.component_text_size_body, addressInputView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float minTextSize_delegate$lambda$0(AddressInputView addressInputView) {
        return c.d(mrg0.component_text_size_caption_secondary, addressInputView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minorStyleButtonColor_delegate$lambda$0(AddressInputView addressInputView) {
        return c.c(xng0.bgMain, addressInputView);
    }

    private final void setEditable(boolean editable) {
        this.binding.c.setVisibility(editable ? 0 : 8);
        this.binding.b.setVisibility(editable ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnClickListener$lambda$0(AddressInputView addressInputView, View view) {
        addressInputView.defaultOnClickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnFocusChangeListener$lambda$0(AddressInputView addressInputView, View.OnFocusChangeListener onFocusChangeListener, View view, boolean z) {
        if (z) {
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = addressInputView.binding.c;
            Editable text = keyboardAwareRobotoEditText.getText();
            keyboardAwareRobotoEditText.setSelection(text != null ? text.length() : 0);
        }
        addressInputView.checkClearTextVisible();
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnTextChangedListener$lambda$1(AddressInputView addressInputView, TextWatcher textWatcher) {
        addressInputView.binding.c.removeTextChangedListener(textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateAddress(ru.yandex.taxi.address.experiment.a state, boolean isTextChanged) {
        ww0 ww0Var = this.binding;
        ShimmeringRobotoTextView shimmeringRobotoTextView = ww0Var.b;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = ww0Var.c;
        String str = state.d;
        int i = 0;
        if (str != null && !evu0.J(str)) {
            CharSequence charSequence = state.b;
            int width = shimmeringRobotoTextView.getWidth();
            if (width == 0) {
                width = shimmeringRobotoTextView.getMeasuredWidth();
            }
            int paddingStart = (width - shimmeringRobotoTextView.getPaddingStart()) - shimmeringRobotoTextView.getPaddingEnd();
            if ((paddingStart <= 0 ? 0 : new StaticLayout(charSequence, shimmeringRobotoTextView.getPaint(), paddingStart, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount()) > shimmeringRobotoTextView.getMaxLines()) {
                shimmeringRobotoTextView.setText(state.d);
                this.binding.a.setContentDescription(state.k);
                shimmeringRobotoTextView.setTextSize(getMaxTextSize());
                shimmeringRobotoTextView.enableAutoSize(getMinTextSize(), getMaxTextSize(), 1);
                shimmeringRobotoTextView.setHint(state.e);
                shimmeringRobotoTextView.setHintTextColor(s8o.m(this.hintTextColor, getContext()));
                if (keyboardAwareRobotoEditText.hasFocus()) {
                    return;
                }
                if (isTextChanged) {
                    Editable text = keyboardAwareRobotoEditText.getText();
                    if (text != null) {
                        i = text.length();
                    }
                } else if (this.firstInit) {
                    this.firstInit = false;
                    Editable text2 = keyboardAwareRobotoEditText.getText();
                    if (text2 != null) {
                        i = text2.length();
                    }
                } else {
                    i = keyboardAwareRobotoEditText.getSelectionEnd();
                }
                keyboardAwareRobotoEditText.setSelection(i);
                return;
            }
        }
        shimmeringRobotoTextView.setText(state.b);
        this.binding.a.setContentDescription(state.j);
        shimmeringRobotoTextView.setTextSize(getMaxTextSize());
        shimmeringRobotoTextView.enableAutoSize(getMinTextSize(), getMaxTextSize(), 1);
        shimmeringRobotoTextView.setHint(state.e);
        shimmeringRobotoTextView.setHintTextColor(s8o.m(this.hintTextColor, getContext()));
        if (keyboardAwareRobotoEditText.hasFocus()) {
        }
    }

    private final void updateAnimation(ShimmeringRobotoTextView shimmeringRobotoTextView, boolean z) {
        if (!z) {
            shimmeringRobotoTextView.stopAnimation();
        } else {
            shimmeringRobotoTextView.setAnimationDuration(SHIMMERING_ANIMATION_DURATION);
            shimmeringRobotoTextView.startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIcon(yw0 oldIcon, yw0 newIcon) {
        String str = newIcon.a;
        if (str == null || str.length() == 0) {
            this.binding.j.setVisibility(4);
            return;
        }
        this.binding.j.setVisibility(0);
        if (!jl40.l(oldIcon.a, str)) {
            this.binding.j.setVisibility(4);
            nac nacVar = (nac) this.imageLoader.a(this.binding.j);
            nacVar.h = new y4(18, this);
            if (str == null) {
                str = "";
            }
            nacVar.c(str);
        }
        ImageView imageView = this.binding.j;
        kdc kdcVar = newIcon.b;
        imageView.setBackgroundTintList(kdcVar != null ? ColorStateList.valueOf(s8o.m(kdcVar, getContext())) : null);
        ImageView imageView2 = this.binding.j;
        kdc kdcVar2 = newIcon.c;
        imageView2.setImageTintList(kdcVar2 != null ? ColorStateList.valueOf(s8o.m(kdcVar2, getContext())) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateIcon$lambda$0(AddressInputView addressInputView, Drawable drawable) {
        cma1.J(addressInputView.binding.j);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayout(ww0 ww0Var, NewbiesRedesignPointsABExperiment.SummaryAddressStyle summaryAddressStyle) {
        if (summaryAddressStyle == NewbiesRedesignPointsABExperiment.SummaryAddressStyle.ONLY_CITY) {
            e eVar = new e();
            ConstraintLayout constraintLayout = ww0Var.k;
            ImageView imageView = ww0Var.j;
            ImageView imageView2 = ww0Var.h;
            KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = ww0Var.c;
            ShimmeringRobotoTextView shimmeringRobotoTextView = ww0Var.b;
            ShimmeringRobotoTextView shimmeringRobotoTextView2 = ww0Var.l;
            eVar.g(constraintLayout);
            eVar.i(shimmeringRobotoTextView2.getId(), 3, 0, 3);
            eVar.i(shimmeringRobotoTextView2.getId(), 7, imageView2.getId(), 6);
            eVar.i(shimmeringRobotoTextView2.getId(), 6, imageView.getId(), 7);
            eVar.i(keyboardAwareRobotoEditText.getId(), 7, imageView2.getId(), 6);
            eVar.i(keyboardAwareRobotoEditText.getId(), 6, imageView.getId(), 7);
            eVar.i(keyboardAwareRobotoEditText.getId(), 3, shimmeringRobotoTextView2.getId(), 4);
            eVar.i(keyboardAwareRobotoEditText.getId(), 4, shimmeringRobotoTextView.getId(), 3);
            eVar.i(shimmeringRobotoTextView.getId(), 7, imageView2.getId(), 6);
            eVar.i(shimmeringRobotoTextView.getId(), 6, imageView.getId(), 7);
            eVar.i(shimmeringRobotoTextView.getId(), 3, shimmeringRobotoTextView2.getId(), 4);
            eVar.i(shimmeringRobotoTextView.getId(), 4, 0, 4);
            eVar.b(ww0Var.k);
            return;
        }
        e eVar2 = new e();
        ConstraintLayout constraintLayout2 = ww0Var.k;
        ImageView imageView3 = ww0Var.j;
        ImageView imageView4 = ww0Var.h;
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText2 = ww0Var.c;
        ShimmeringRobotoTextView shimmeringRobotoTextView3 = ww0Var.b;
        ShimmeringRobotoTextView shimmeringRobotoTextView4 = ww0Var.l;
        eVar2.g(constraintLayout2);
        eVar2.i(shimmeringRobotoTextView3.getId(), 3, 0, 3);
        eVar2.i(shimmeringRobotoTextView3.getId(), 7, imageView4.getId(), 6);
        eVar2.i(shimmeringRobotoTextView3.getId(), 6, imageView3.getId(), 7);
        eVar2.i(shimmeringRobotoTextView3.getId(), 4, shimmeringRobotoTextView4.getId(), 3);
        eVar2.i(shimmeringRobotoTextView4.getId(), 7, imageView4.getId(), 6);
        eVar2.i(shimmeringRobotoTextView4.getId(), 6, imageView3.getId(), 7);
        eVar2.i(shimmeringRobotoTextView4.getId(), 3, shimmeringRobotoTextView3.getId(), 4);
        eVar2.i(shimmeringRobotoTextView4.getId(), 4, keyboardAwareRobotoEditText2.getId(), 3);
        eVar2.i(keyboardAwareRobotoEditText2.getId(), 7, imageView4.getId(), 6);
        eVar2.i(keyboardAwareRobotoEditText2.getId(), 6, imageView3.getId(), 7);
        eVar2.i(keyboardAwareRobotoEditText2.getId(), 3, shimmeringRobotoTextView4.getId(), 4);
        eVar2.i(keyboardAwareRobotoEditText2.getId(), 4, 0, 4);
        eVar2.b(ww0Var.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMode(AddressItemMode mode) {
        boolean z = mode == AddressItemMode.LOADING;
        updateAnimation(this.binding.b, z);
        updateAnimation(this.binding.l, z);
        int i = tw0.a[mode.ordinal()];
        if (i == 1) {
            setEditable(true);
            return;
        }
        if (i == 2) {
            setEditable(false);
        } else if (i == 3) {
            setEditable(false);
        } else {
            w511.b();
        }
    }

    public final void changeTrailButtonVisibility(boolean visible) {
        this.binding.d.setVisibility(visible ? 0 : 8);
    }

    public final void closeKeyboard() {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.binding.c;
        keyboardAwareRobotoEditText.post(new ce0(keyboardAwareRobotoEditText, 15));
        this.binding.c.clearFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.binding.c.hasFocus();
    }

    public final EditText inputView() {
        return this.binding.c;
    }

    public final void render(ru.yandex.taxi.address.experiment.a state) {
        this.stateHolder.g(state, false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        return this.binding.c.requestFocus(direction, previouslyFocusedRect);
    }

    public final void setOnButtonClickListener(sls onClick) {
        this.binding.e.setDebounceClickListener(onClick != null ? new h60(3, onClick) : null);
        c.z(onClick, this.binding.f);
    }

    public final void setOnClearListener(sls onClear) {
        this.onClearListener = onClear;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        if (listener != null) {
            super.setOnClickListener(listener);
        } else {
            super.setOnClickListener(new tf(5, this));
        }
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener listener) {
        this.binding.c.setOnEditorActionListener(listener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        this.binding.c.setOnFocusChangeListener(new qw0(this, listener, 0));
    }

    public final void setOnKeyboardCloseListener(sls onClose) {
        this.binding.c.setOnCloseListener(onClose != null ? new uw0(0, onClose) : null);
    }

    public final g18 setOnTextChangedListener(final bms onTextChanged) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText = this.binding.c;
        TextWatcher textWatcher = new TextWatcher() { // from class: ru.yandex.taxi.address.design.AddressInputView$setOnTextChangedListener$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                boolean z;
                z = AddressInputView.this.canWatchText;
                if (z) {
                    onTextChanged.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
                }
            }
        };
        keyboardAwareRobotoEditText.addTextChangedListener(textWatcher);
        return new l30(1, this, textWatcher);
    }

    public final void setTrailButtonClickListener(sls onClick) {
        this.binding.d.setDebounceClickListener(onClick != null ? new h60(2, onClick) : null);
    }

    public final void setTrailContentDescription(int descriptionId) {
        this.binding.d.setContentDescription(getContext().getString(descriptionId));
    }
}
