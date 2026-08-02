package ru.yandex.taxi.widget.map;

import android.content.Context;
import android.content.res.ColorStateList;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.agh0;
import defpackage.bdc;
import defpackage.bry0;
import defpackage.cma1;
import defpackage.dv31;
import defpackage.e0c0;
import defpackage.f0c0;
import defpackage.f1h0;
import defpackage.i1c0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.kdt0;
import defpackage.l2z;
import defpackage.ldt0;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.qje;
import defpackage.s8o;
import defpackage.smw0;
import defpackage.tje;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.usg0;
import defpackage.xng0;
import defpackage.zrh0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001MB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010&\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010<\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00140E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010I¨\u0006N"}, d2 = {"Lru/yandex/taxi/widget/map/SourceOnMapControl;", "Lru/yandex/taxi/widget/map/AddressOnMapControl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "resourceId", "Lzy11;", "setOverrideBgResource", "(Ljava/lang/Integer;)V", "Lkdc;", "textColor", "setOverrideTextColor", "(Lkdc;)V", "updateTextColor", "()V", "Landroid/transition/Transition;", "createStateChangeInterpolator", "()Landroid/transition/Transition;", "Lru/yandex/taxi/widget/map/SourceOnMapControl$a;", ClidProvider.STATE, "render", "(Lru/yandex/taxi/widget/map/SourceOnMapControl$a;)V", "Li1c0;", "style", "updateStyle", "(Li1c0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "", RemoteBioParameters.TIME, "setCustomAnimationTime", "(J)V", "Lkdt0;", "binding", "Lkdt0;", "Lldt0;", "trailButtonsBinding$delegate", "Li3y;", "getTrailButtonsBinding", "()Lldt0;", "trailButtonsBinding", "maxButtonsTrailWidth", CA20Status.STATUS_USER_I, "maxWidthSize", "Lbry0;", "hintHelper", "Lbry0;", "textHelper", "stateChangeTransition", "Landroid/transition/Transition;", "overrideBgResource", "Ljava/lang/Integer;", "overrideTextColor", "Lkdc;", "shouldSwapTexts", "Z", "buttonsTrailVisible", "Ldv31;", "stateHolder", "Ldv31;", "getMaxWidgetWidthWithTrail", "()I", "maxWidgetWidthWithTrail", "getItemsBg", "itemsBg", "a", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SourceOnMapControl extends AddressOnMapControl {
    public static final int $stable = 8;
    private final kdt0 binding;
    private boolean buttonsTrailVisible;
    private final bry0 hintHelper;
    private final int maxButtonsTrailWidth;
    private final int maxWidthSize;
    private Integer overrideBgResource;
    private kdc overrideTextColor;
    private boolean shouldSwapTexts;
    private final Transition stateChangeTransition;
    private final dv31 stateHolder;
    private final bry0 textHelper;

    /* renamed from: trailButtonsBinding$delegate, reason: from kotlin metadata */
    private final i3y trailButtonsBinding;

    public SourceOnMapControl(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(zrh0.source_on_map_control, this);
        int i = agh0.pin_slot;
        PinSlot pinSlot = (PinSlot) cma1.O(i, this);
        if (pinSlot != null) {
            i = agh0.source_on_map_hint;
            ShimmeringRobotoTextView shimmeringRobotoTextView = (ShimmeringRobotoTextView) cma1.O(i, this);
            if (shimmeringRobotoTextView != null) {
                i = agh0.source_on_map_text;
                ShimmeringRobotoTextView shimmeringRobotoTextView2 = (ShimmeringRobotoTextView) cma1.O(i, this);
                if (shimmeringRobotoTextView2 != null) {
                    this.binding = new kdt0(this, pinSlot, shimmeringRobotoTextView, shimmeringRobotoTextView2);
                    this.trailButtonsBinding = kotlin.a.a(new l2z(28, context, this));
                    int r = tje.r(usg0.address_on_map_buttons_trail_max_width, context);
                    this.maxButtonsTrailWidth = r;
                    this.maxWidthSize = this.maxWidgetSize + r;
                    this.hintHelper = new bry0(shimmeringRobotoTextView);
                    bry0 bry0Var = new bry0(shimmeringRobotoTextView2);
                    this.textHelper = bry0Var;
                    this.stateChangeTransition = createStateChangeInterpolator();
                    c cVar = new c(this, new a(null, null, null, false, false, null, null, 2047), this);
                    this.stateHolder = cVar;
                    if (!bry0Var.c) {
                        bry0Var.c = true;
                        bry0Var.g = 0;
                        shimmeringRobotoTextView2.requestLayout();
                    }
                    shimmeringRobotoTextView2.setTextDirection(this.isRtl ? 4 : 3);
                    cVar.e();
                    setFocusable(true);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final Transition createStateChangeInterpolator() {
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(1);
        Fade fade = new Fade(2);
        fade.setDuration(100L);
        fade.setInterpolator(accelerateDecelerateInterpolator);
        transitionSet.addTransition(fade);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(200L);
        changeBounds.setInterpolator(accelerateDecelerateInterpolator);
        transitionSet.addTransition(changeBounds);
        Fade fade2 = new Fade(1);
        fade2.setDuration(100L);
        fade2.setInterpolator(accelerateDecelerateInterpolator);
        transitionSet.addTransition(fade2);
        return transitionSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ldt0 getTrailButtonsBinding() {
        return (ldt0) this.trailButtonsBinding.getValue();
    }

    private final void setOverrideBgResource(Integer resourceId) {
        this.overrideBgResource = resourceId;
        updateBg();
    }

    private final void setOverrideTextColor(kdc textColor) {
        this.overrideTextColor = textColor;
        updateTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ldt0 trailButtonsBinding_delegate$lambda$0(Context context, SourceOnMapControl sourceOnMapControl) {
        return ldt0.p(LayoutInflater.from(context), sourceOnMapControl);
    }

    private final void updateTextColor() {
        bry0 bry0Var = this.hintHelper;
        kdc kdcVar = this.overrideTextColor;
        ShimmeringRobotoTextView shimmeringRobotoTextView = bry0Var.a;
        shimmeringRobotoTextView.setTextColor(kdcVar != null ? s8o.m(kdcVar, shimmeringRobotoTextView.getContext()) : qje.t(xng0.textOnPin, shimmeringRobotoTextView.getContext()));
        bry0 bry0Var2 = this.textHelper;
        kdc kdcVar2 = this.overrideTextColor;
        ShimmeringRobotoTextView shimmeringRobotoTextView2 = bry0Var2.a;
        shimmeringRobotoTextView2.setTextColor(kdcVar2 != null ? s8o.m(kdcVar2, shimmeringRobotoTextView2.getContext()) : qje.t(xng0.textOnPin, shimmeringRobotoTextView2.getContext()));
    }

    @Override // ru.yandex.taxi.widget.map.AddressOnMapControl
    public int getItemsBg() {
        Integer num = this.overrideBgResource;
        return num != null ? num.intValue() : f1h0.address_on_map_background;
    }

    /* renamed from: getMaxWidgetWidthWithTrail, reason: from getter */
    public final int getMaxWidthSize() {
        return this.maxWidthSize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int layoutVerticalCentred = layoutVerticalCentred(this.binding.b, true);
        int height = ((getHeight() - this.textsHeight) / 2) + this.textVerticalSpace;
        if (this.shouldSwapTexts) {
            if (this.textHelper.c()) {
                height = this.textHelper.e(getWidth(), layoutVerticalCentred, height, this.isRtl);
            }
            if (this.hintHelper.c()) {
                this.hintHelper.e(getWidth(), layoutVerticalCentred, height, this.isRtl);
            }
        } else {
            if (this.hintHelper.c()) {
                height = this.hintHelper.e(getWidth(), layoutVerticalCentred, height, this.isRtl);
            }
            if (this.textHelper.c()) {
                this.textHelper.e(getWidth(), layoutVerticalCentred, height, this.isRtl);
            }
        }
        if (this.buttonsTrailVisible) {
            layoutVerticalCentred(getTrailButtonsBinding().o(), false);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.binding.b.getLayoutParams();
        measureChildWithMargins(this.binding.b, widthMeasureSpec, 0, heightMeasureSpec, 0);
        int resolveSize = View.resolveSize(this.maxWidthSize, widthMeasureSpec);
        int measuredWidth = this.binding.b.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int measuredHeight = this.binding.b.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        boolean c = this.hintHelper.c();
        boolean c2 = this.textHelper.c();
        int i = 0;
        this.textsHeight = 0;
        if (c || c2) {
            int i2 = this.buttonsTrailVisible ? 0 : this.defaultHorizontalSpace;
            int max = Math.max((resolveSize - measuredWidth) - i2, 0);
            this.textsHeight = this.textVerticalSpace;
            if (c) {
                this.hintHelper.f(max, heightMeasureSpec);
                i = Math.max(0, this.hintHelper.d());
                this.textsHeight = this.hintHelper.b() + this.textsHeight;
            }
            if (c2) {
                this.textHelper.f(max, heightMeasureSpec);
                i = Math.max(i, this.textHelper.d());
                this.textsHeight = this.textHelper.b() + this.textsHeight;
            }
            int i3 = this.textsHeight + this.textVerticalSpace;
            this.textsHeight = i3;
            measuredWidth += i + i2;
            measuredHeight = Math.max(measuredHeight, i3);
        }
        int i4 = measuredWidth;
        int i5 = measuredHeight;
        if (this.buttonsTrailVisible) {
            measureChildWithMargins(getTrailButtonsBinding().o(), widthMeasureSpec, 0, heightMeasureSpec, 0);
            i4 += getTrailButtonsBinding().o().getMeasuredWidth();
        }
        setMeasuredDimension(View.resolveSize(i4, widthMeasureSpec), View.resolveSize(i5, heightMeasureSpec));
    }

    public final void render(a state) {
        a.C0122a c0122a = state.j;
        if (c0122a != null) {
            setOverrideBgResource(c0122a.a());
            setOverrideTextColor(c0122a.c());
        }
        this.stateHolder.g(state, false, false);
    }

    public final void setCustomAnimationTime(long time) {
        this.binding.b.setCustomAnimationTime(time);
    }

    public final void updateStyle(i1c0 style) {
        this.binding.b.updatePinStyle(style);
        updateTextColor();
        updateBg();
        Integer num = style.c;
        setBackgroundTintList(num != null ? ColorStateList.valueOf(num.intValue()) : null);
    }

    public static final class a {
        public final f0c0 a;
        public final CharSequence b;
        public final String c;
        public final boolean d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final b i;
        public final C0122a j;

        public /* synthetic */ a(f0c0 f0c0Var, CharSequence charSequence, String str, boolean z, boolean z2, b bVar, C0122a c0122a, int i) {
            this((i & 1) != 0 ? e0c0.a : f0c0Var, (i & 2) != 0 ? "" : charSequence, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, "", (i & 64) != 0 ? false : z2, true, (i & 256) == 0, (i & 512) != 0 ? null : bVar, (i & 1024) != 0 ? null : c0122a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.CharSequence] */
        public static a a(a aVar, f0c0 f0c0Var, String str, String str2, boolean z, String str3, boolean z2, boolean z3, b bVar, int i) {
            if ((i & 1) != 0) {
                f0c0Var = aVar.a;
            }
            f0c0 f0c0Var2 = f0c0Var;
            String str4 = str;
            if ((i & 2) != 0) {
                str4 = aVar.b;
            }
            String str5 = str4;
            String str6 = (i & 4) != 0 ? aVar.c : str2;
            boolean z4 = (i & 8) != 0 ? aVar.d : z;
            aVar.getClass();
            String str7 = (i & 32) != 0 ? aVar.e : str3;
            boolean z5 = (i & 64) != 0 ? aVar.f : z2;
            boolean z6 = (i & 128) != 0 ? aVar.g : z3;
            boolean z7 = aVar.h;
            b bVar2 = (i & 512) != 0 ? aVar.i : bVar;
            C0122a c0122a = aVar.j;
            aVar.getClass();
            return new a(f0c0Var2, str5, str6, z4, str7, z5, z6, z7, bVar2, c0122a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && this.d == aVar.d && jl40.l(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && jl40.l(this.i, aVar.i) && jl40.l(this.j, aVar.j);
        }

        public final int hashCode() {
            int e = unr0.e(unr0.e(unr0.e(unr0.b(unr0.e(unr0.e(unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            b bVar = this.i;
            int hashCode = (e + (bVar == null ? 0 : bVar.hashCode())) * 31;
            C0122a c0122a = this.j;
            return hashCode + (c0122a != null ? c0122a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(pinState=");
            sb.append(this.a);
            sb.append(", hint=");
            sb.append((Object) this.b);
            sb.append(", text=");
            tse0.y(this.c, ", textWithChevron=", ", shimmering=false, contentDescription=", sb, this.d);
            tse0.y(this.e, ", shouldSwapTexts=", ", isClickable=", sb, this.f);
            nnm.v(", isClicksBelowViewDisabled=", ", buttonsTrail=", sb, this.g, this.h);
            sb.append(this.i);
            sb.append(", contentColorState=");
            sb.append(this.j);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        /* renamed from: ru.yandex.taxi.widget.map.SourceOnMapControl$a$a, reason: collision with other inner class name */
        /* loaded from: classes12.dex */
        public static final class C0122a {
            public final Integer a;
            public final kdc b;
            public final kdc c;

            public C0122a(Integer num, bdc bdcVar, bdc bdcVar2) {
                this.a = num;
                this.b = bdcVar;
                this.c = bdcVar2;
            }

            public final Integer a() {
                return this.a;
            }

            public final kdc b() {
                return this.c;
            }

            public final kdc c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0122a)) {
                    return false;
                }
                C0122a c0122a = (C0122a) obj;
                return jl40.l(this.a, c0122a.a) && jl40.l(this.b, c0122a.b) && jl40.l(this.c, c0122a.c);
            }

            public final int hashCode() {
                Integer num = this.a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                kdc kdcVar = this.b;
                int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
                kdc kdcVar2 = this.c;
                return hashCode2 + (kdcVar2 != null ? kdcVar2.hashCode() : 0);
            }

            public final String toString() {
                return "ContentColorState(overrideBgResource=" + this.a + ", textColor=" + this.b + ", pointerColor=" + this.c + Extension.C_BRAKE;
            }

            public C0122a() {
                this(null, null, null);
            }
        }

        public a(f0c0 f0c0Var, CharSequence charSequence, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4, b bVar, C0122a c0122a) {
            this.a = f0c0Var;
            this.b = charSequence;
            this.c = str;
            this.d = z;
            this.e = str2;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = bVar;
            this.j = c0122a;
        }

        public a() {
            this(null, null, null, false, false, null, null, 2047);
        }
    }
}
