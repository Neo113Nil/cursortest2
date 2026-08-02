package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.c4i0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.k4o;
import defpackage.ndh0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s73;
import defpackage.t73;
import defpackage.u73;
import defpackage.w511;
import defpackage.xng0;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003QR\u001aB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0018J\u0011\u0010\u001b\u001a\u00060\u001aR\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0013¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u0013¢\u0006\u0004\b'\u0010%J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00132\b\b\u0001\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010\u0018J\u0017\u0010.\u001a\u00020\u00132\b\b\u0001\u0010,\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0018J\u0013\u00100\u001a\u0006\u0012\u0002\b\u00030/H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00132\u000e\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u000102¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020\u00132\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u000102¢\u0006\u0004\b7\u00105J!\u0010:\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\u00132\b\b\u0001\u0010<\u001a\u00020\bH\u0002¢\u0006\u0004\b=\u0010\u0018J\u000f\u0010>\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010%R\u0014\u0010?\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010@R\u0014\u0010F\u001a\u00020A8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010@R\u0018\u0010H\u001a\u00060\u001aR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010@R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010OR\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010OR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010P¨\u0006S"}, d2 = {"Lru/yandex/taxi/widget/ArrowsView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroidx/coordinatorlayout/widget/a;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "touchEventAction", "Lzy11;", "setTouchEventAction", "(Ljava/lang/Runnable;)V", "color", "setArrowDefaultColor", "(I)V", "setArrowEndColor", "Lu73;", "getDecorator", "()Lu73;", "Lru/yandex/taxi/widget/ArrowsView$State;", ClidProvider.STATE, "setState", "(Lru/yandex/taxi/widget/ArrowsView$State;)V", "Landroid/view/ViewPropertyAnimator;", "hideArrow", "()Landroid/view/ViewPropertyAnimator;", "showArrowUp", "()V", "showArrowDown", "showArrowPlain", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "attrId", "setDefaultColorAttr", "setEndColorAttr", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Ljava/util/function/Supplier;", "extraTopOffsetSupplier", "setExtraTopOffsetSupplier", "(Ljava/util/function/Supplier;)V", "insideTopOffsetSupplier", "setInsideTopOffsetSupplier", "Landroid/content/res/TypedArray;", "attributes", "resolveThemebleAttrs", "(Landroid/util/AttributeSet;Landroid/content/res/TypedArray;)V", "vectorDrawableRes", "startVectorAnimation", "invalidateColorFilter", "defaultColorStyle", CA20Status.STATUS_USER_I, "", "defaultColorAttr", "Ljava/lang/String;", "defaultColorTag", "endColorStyle", "endColorAttr", "endColorTag", "decorator", "Lu73;", "arrowDefaultColor", "arrowEndColor", "Lru/yandex/taxi/widget/ArrowsView$State;", "colorFilter", "Ljava/lang/Integer;", "Ljava/util/function/Supplier;", "Ljava/lang/Runnable;", "State", "t73", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class ArrowsView extends AppCompatImageView implements androidx.coordinatorlayout.widget.a, nwy0 {
    private int arrowDefaultColor;
    private int arrowEndColor;
    private Integer colorFilter;
    private final u73 decorator;
    private final String defaultColorAttr;
    private final int defaultColorStyle;
    private final int defaultColorTag;
    private final String endColorAttr;
    private final int endColorStyle;
    private final int endColorTag;
    private Supplier<Integer> extraTopOffsetSupplier;
    private Supplier<Integer> insideTopOffsetSupplier;
    private State state;
    private Runnable touchEventAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/widget/ArrowsView$State;", "", "UP", "PLAIN", "DOWN", "GONE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DOWN;
        public static final State GONE;
        public static final State PLAIN;
        public static final State UP;

        static {
            State state = new State("UP", 0);
            UP = state;
            State state2 = new State("PLAIN", 1);
            PLAIN = state2;
            State state3 = new State("DOWN", 2);
            DOWN = state3;
            State state4 = new State("GONE", 3);
            GONE = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public ArrowsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.defaultColorStyle = c4i0.ArrowsView_arrow_defaultColor;
        this.defaultColorAttr = "arrow_defaultColor";
        this.defaultColorTag = ndh0.arrow_default_color_id;
        this.endColorStyle = c4i0.ArrowsView_arrow_endColor;
        this.endColorAttr = "arrow_endColor";
        this.endColorTag = ndh0.arrow_end_color_id;
        this.decorator = new u73(this);
        this.state = State.GONE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.ArrowsView, i, 0);
        resolveThemebleAttrs(attributeSet, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private final void invalidateColorFilter() {
        Integer num = this.colorFilter;
        setColorFilter(num != null ? num.intValue() : 0, PorterDuff.Mode.SRC_IN);
    }

    private final void resolveThemebleAttrs(AttributeSet attrs, TypedArray attributes) {
        if (attrs == null) {
            setDefaultColorAttr(xng0.arrowDefaultColor);
            setEndColorAttr(xng0.arrowEndColor);
        } else {
            qje.S(attrs, attributes, this.defaultColorAttr, this.defaultColorStyle, xng0.arrowDefaultColor, new s73(this, 0), new s73(this, 1));
            qje.S(attrs, attributes, this.endColorAttr, this.endColorStyle, xng0.arrowEndColor, new s73(this, 2), new s73(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$0(ArrowsView arrowsView, Integer num) {
        arrowsView.setArrowDefaultColor(ru.yandex.taxi.design.utils.c.a(num.intValue(), arrowsView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resolveThemebleAttrs$lambda$1(ArrowsView arrowsView, Integer num) {
        arrowsView.setArrowEndColor(ru.yandex.taxi.design.utils.c.a(num.intValue(), arrowsView));
    }

    private final void startVectorAnimation(int vectorDrawableRes) {
        Drawable drawable = getContext().getDrawable(vectorDrawableRes);
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        setImageDrawable(animatedVectorDrawable);
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.start();
        }
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean allowTraverse() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        Object tag = getTag(this.defaultColorTag);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            setDefaultColorAttr(num.intValue());
        }
        Object tag2 = getTag(this.endColorTag);
        Integer num2 = tag2 instanceof Integer ? (Integer) tag2 : null;
        if (num2 != null) {
            setEndColorAttr(num2.intValue());
        }
        invalidateColorFilter();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (this.touchEventAction == null || event.getActionMasked() != 0) {
            return super.dispatchTouchEvent(event);
        }
        Runnable runnable = this.touchEventAction;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new t73(this);
    }

    public final u73 getDecorator() {
        return this.decorator;
    }

    public final ViewPropertyAnimator hideArrow() {
        State state = this.state;
        State state2 = State.GONE;
        if (state == state2) {
            return null;
        }
        this.state = state2;
        return cma1.M(this);
    }

    public final void setArrowDefaultColor(int color) {
        this.arrowDefaultColor = color;
        this.colorFilter = Integer.valueOf(color);
    }

    public final void setArrowEndColor(int color) {
        this.arrowEndColor = color;
    }

    public final void setDefaultColorAttr(int attrId) {
        setTag(this.defaultColorTag, Integer.valueOf(attrId));
        setArrowDefaultColor(qje.t(attrId, getContext()));
    }

    public final void setEndColorAttr(int attrId) {
        setTag(this.endColorTag, Integer.valueOf(attrId));
        setArrowEndColor(qje.t(attrId, getContext()));
    }

    public final void setExtraTopOffsetSupplier(Supplier<Integer> extraTopOffsetSupplier) {
        this.extraTopOffsetSupplier = extraTopOffsetSupplier;
    }

    public final void setInsideTopOffsetSupplier(Supplier<Integer> insideTopOffsetSupplier) {
        this.insideTopOffsetSupplier = insideTopOffsetSupplier;
    }

    public final void setState(State state) {
        int i = a.a[state.ordinal()];
        if (i == 1) {
            setVisibility(0);
            setImageResource(dzg0.arrow_up);
            invalidateColorFilter();
        } else if (i == 2) {
            setVisibility(0);
            setImageResource(dzg0.arrow_down);
            invalidateColorFilter();
        } else if (i == 3) {
            setVisibility(0);
            setImageResource(dzg0.arrow_plain_handler);
            invalidateColorFilter();
        } else if (i == 4) {
            setVisibility(4);
        } else {
            w511.b();
        }
    }

    public final void setTouchEventAction(Runnable touchEventAction) {
        this.touchEventAction = touchEventAction;
    }

    public final void showArrowDown() {
        State state = this.state;
        State state2 = State.DOWN;
        if (state == state2) {
            return;
        }
        if (state == State.GONE) {
            setImageResource(dzg0.arrow_down);
            cma1.J(this);
        } else {
            startVectorAnimation(dzg0.arrow_plain_to_down_animated);
        }
        invalidateColorFilter();
        this.state = state2;
    }

    public final void showArrowPlain() {
        State state = this.state;
        State state2 = State.PLAIN;
        if (state == state2) {
            return;
        }
        if (state == State.GONE) {
            setImageResource(dzg0.arrow_plain_handler);
            cma1.J(this);
        } else if (state == State.UP) {
            startVectorAnimation(dzg0.arrow_up_to_plain_animated);
        } else if (state == State.DOWN) {
            startVectorAnimation(dzg0.arrow_down_to_plain_animated);
        }
        invalidateColorFilter();
        this.state = state2;
    }

    public final void showArrowUp() {
        State state = this.state;
        State state2 = State.UP;
        if (state == state2) {
            return;
        }
        if (state == State.GONE) {
            setImageResource(dzg0.arrow_up);
            cma1.J(this);
        } else {
            startVectorAnimation(dzg0.arrow_plain_to_up_animated);
        }
        invalidateColorFilter();
        this.state = state2;
    }

    public ArrowsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ArrowsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ArrowsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
