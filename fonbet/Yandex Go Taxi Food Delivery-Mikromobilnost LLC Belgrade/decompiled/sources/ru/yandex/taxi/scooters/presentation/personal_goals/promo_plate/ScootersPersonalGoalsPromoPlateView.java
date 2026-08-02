package ru.yandex.taxi.scooters.presentation.personal_goals.promo_plate;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.aho0;
import defpackage.cho0;
import defpackage.ci91;
import defpackage.dho0;
import defpackage.eho0;
import defpackage.evu0;
import defpackage.fcl0;
import defpackage.i3y;
import defpackage.kok0;
import defpackage.l8x;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.pav;
import defpackage.q0h0;
import defpackage.sls;
import defpackage.tje;
import defpackage.vng;
import defpackage.w511;
import defpackage.x7n0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y6i0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lpav;)V", "Laho0;", ClidProvider.STATE, "Lzy11;", "renderAvailable", "(Laho0;)V", "Ldho0;", "renderInProgress", "(Ldho0;)V", "Lcho0;", "renderCompleted", "(Lcho0;)V", "", "iconTag", "applyLeadIcon", "(Ljava/lang/String;)V", "Leho0;", "Lkotlin/Function0;", "onClick", "setState", "(Leho0;Lsls;)V", "Lpav;", "Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView$PersonalGoalsCircleProgressView;", "progressView", "Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView$PersonalGoalsCircleProgressView;", "Li3y;", "Lru/yandex/taxi/design/BadgeView;", "badgeViewLazy", "Li3y;", "Lcom/yandex/go/design/view/GoImageView;", "navigationIconImageView", "Lcom/yandex/go/design/view/GoImageView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "trailLinearLayout", "Lcom/yandex/go/design/view/GoLinearLayout;", "Ll8x;", "leadImageJob", "Ll8x;", "PersonalGoalsCircleProgressView", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersPersonalGoalsPromoPlateView extends ListItemComponent {
    private final i3y badgeViewLazy;
    private final pav imageLoader;
    private l8x leadImageJob;
    private final GoImageView navigationIconImageView;
    private final PersonalGoalsCircleProgressView progressView;
    private final GoLinearLayout trailLinearLayout;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/taxi/scooters/presentation/personal_goals/promo_plate/ScootersPersonalGoalsPromoPlateView$PersonalGoalsCircleProgressView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "currentProgress", "totalProgress", "Lzy11;", "setProgress", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "strokeWidth", CA20Status.STATUS_USER_I, "contentSize", "Landroid/graphics/RectF;", "segmentBounds", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/Paint;", "backgroundPaint", "Lru/yandex/taxi/widget/RobotoTextView;", "progressTextView", "Lru/yandex/taxi/widget/RobotoTextView;", "", "hasNumericProgress", "Z", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class PersonalGoalsCircleProgressView extends GoFrameLayout {
        private final Paint backgroundPaint;
        private final int contentSize;
        private int currentProgress;
        private boolean hasNumericProgress;
        private final Paint progressPaint;
        private final RobotoTextView progressTextView;
        private final RectF segmentBounds;
        private final int strokeWidth;
        private int totalProgress;

        public PersonalGoalsCircleProgressView(Context context) {
            super(context, null, 0, 0, 14, null);
            int u = tje.u(3, getContext());
            this.strokeWidth = u;
            int u2 = tje.u(40, getContext());
            this.contentSize = u2;
            this.segmentBounds = new RectF();
            Paint paint = new Paint(1);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint.Cap cap = Paint.Cap.BUTT;
            paint.setStrokeCap(cap);
            paint.setStrokeWidth(u);
            paint.setColor(getContext().getColor(mqg0.component_green_normal));
            this.progressPaint = paint;
            Paint paint2 = new Paint(1);
            paint2.setStyle(style);
            paint2.setStrokeCap(cap);
            paint2.setStrokeWidth(u);
            paint2.setColor(getContext().getColor(mqg0.component_gray_175));
            this.backgroundPaint = paint2;
            RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
            robotoTextView.setTextColorAttr(xng0.textMain);
            robotoTextView.setTextSize(tje.s(mrg0.component_text_size_caption, robotoTextView.getContext()));
            robotoTextView.setTextTypeface(3);
            robotoTextView.setGravity(17);
            this.progressTextView = robotoTextView;
            this.totalProgress = 1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(u2, u2);
            layoutParams.setMarginEnd(0);
            setLayoutParams(layoutParams);
            setWillNotDraw(false);
            addView(robotoTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            float f = this.strokeWidth / 2.0f;
            this.segmentBounds.set(f, f, getWidth() - f, getHeight() - f);
            canvas.drawArc(this.segmentBounds, -90.0f, 360.0f, false, this.backgroundPaint);
            if (this.hasNumericProgress) {
                float f2 = (this.currentProgress * 360.0f) / this.totalProgress;
                if (f2 > 0.0f) {
                    canvas.drawArc(this.segmentBounds, -90.0f, f2, false, this.progressPaint);
                }
            }
            super.onDraw(canvas);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            int i = this.contentSize;
            setMeasuredDimension(i, i);
        }

        public final void setProgress(Integer currentProgress, Integer totalProgress) {
            boolean z = (currentProgress == null || totalProgress == null || totalProgress.intValue() <= 0) ? false : true;
            this.hasNumericProgress = z;
            if (z) {
                int intValue = totalProgress.intValue();
                this.totalProgress = intValue >= 1 ? intValue : 1;
                int d = y6i0.d(currentProgress.intValue(), 0, this.totalProgress);
                this.currentProgress = d;
                this.progressTextView.setText(d + "/" + this.totalProgress);
                this.progressTextView.setVisibility(0);
            } else {
                this.currentProgress = 0;
                this.totalProgress = 1;
                this.progressTextView.setText("");
                this.progressTextView.setVisibility(8);
            }
            invalidate();
        }
    }

    public ScootersPersonalGoalsPromoPlateView(Context context, pav pavVar) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        PersonalGoalsCircleProgressView personalGoalsCircleProgressView = new PersonalGoalsCircleProgressView(context);
        this.progressView = personalGoalsCircleProgressView;
        this.badgeViewLazy = a.b(LazyThreadSafetyMode.NONE, new kok0(context, 8));
        int u = tje.u(32, getContext());
        int i = 0;
        GoImageView goImageView = new GoImageView(context, null, i, 6, null);
        goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(u, u));
        goImageView.setImageResource(ListItemComponent.DEFAULT_NAVIGATION_ICON);
        goImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        goImageView.setPaddingRelative(tje.u(4, goImageView.getContext()), 0, tje.u(12, goImageView.getContext()), 0);
        this.navigationIconImageView = goImageView;
        GoLinearLayout goLinearLayout = new GoLinearLayout(context, null, i, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        goLinearLayout.setOrientation(0);
        goLinearLayout.setGravity(16);
        goLinearLayout.addView(personalGoalsCircleProgressView);
        goLinearLayout.addView(goImageView);
        this.trailLinearLayout = goLinearLayout;
        setMinimumHeight(tje.u(56, getContext()));
        setTitleTextSizePx(tje.r(mrg0.component_text_size_body, getContext()));
        setFitTitleWordsEnabled(true);
        setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption, getContext()));
        setSubtitleColorAttr(xng0.textMinor);
        setSubtitleTypeface(0);
        setTrailView(goLinearLayout);
        setBackgroundResource(x7n0.a);
        setVisibility(8);
    }

    private final void applyLeadIcon(String iconTag) {
        l8x l8xVar = this.leadImageJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (iconTag == null || iconTag.length() == 0) {
            setLeadImage((Drawable) null);
        } else {
            this.leadImageJob = tje.N(ci91.c(this), null, null, new ScootersPersonalGoalsPromoPlateView$applyLeadIcon$1(this, iconTag, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BadgeView badgeViewLazy$lambda$0(Context context) {
        BadgeView badgeView = new BadgeView(context, null, 0, 6, null);
        badgeView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        xw31.I(badgeView, null, Integer.valueOf(tje.u(1, badgeView.getContext())), null, null);
        xw31.I(badgeView, null, null, null, Integer.valueOf(tje.u(2, badgeView.getContext())));
        xw31.F(badgeView, Integer.valueOf(tje.r(mrg0.go_design_s_space, badgeView.getContext())), null, null, null);
        int r = tje.r(mrg0.go_design_s_space, badgeView.getContext());
        xw31.E(badgeView, null, Integer.valueOf(r), null, Integer.valueOf(r));
        badgeView.setBackground(vng.t(q0h0.scooters_badge_bg, badgeView.getContext()));
        badgeView.setTintColor(badgeView.getContext().getColor(mqg0.component_green_normal));
        badgeView.setTextColor(badgeView.getContext().getColor(mqg0.white));
        badgeView.setTextSize(tje.b0(badgeView.getContext(), 14.0f));
        badgeView.setElevation(tje.x(badgeView.getContext(), 3.0f));
        return badgeView;
    }

    private final void renderAvailable(aho0 state) {
        this.progressView.setVisibility(8);
        String str = state.c;
        CharSequence charSequence = state.d;
        applyLeadIcon(str);
        BadgeView badgeView = (BadgeView) this.badgeViewLazy.getValue();
        if (badgeView.getParent() == null) {
            this.trailLinearLayout.addView(badgeView, 0);
        }
        badgeView.setVisibility(charSequence == null || evu0.J(charSequence) ? 8 : 0);
        if (charSequence == null || evu0.J(charSequence)) {
            return;
        }
        badgeView.setText(charSequence);
    }

    private final void renderCompleted(cho0 state) {
        this.progressView.setVisibility(8);
        applyLeadIcon(state.c);
        if (this.badgeViewLazy.isInitialized()) {
            ((View) this.badgeViewLazy.getValue()).setVisibility(8);
        }
        CharSequence charSequence = state.d;
        if (charSequence != null) {
            if (evu0.J(charSequence)) {
                charSequence = null;
            }
            if (charSequence != null) {
                BadgeView badgeView = (BadgeView) this.badgeViewLazy.getValue();
                if (badgeView.getParent() == null) {
                    this.trailLinearLayout.addView(badgeView, 0);
                }
                badgeView.setText(charSequence);
                badgeView.setVisibility(0);
            }
        }
    }

    private final void renderInProgress(dho0 state) {
        if (this.badgeViewLazy.isInitialized()) {
            ((View) this.badgeViewLazy.getValue()).setVisibility(8);
        }
        applyLeadIcon(state.c);
        this.progressView.setVisibility(0);
        this.progressView.setProgress(state.e, state.d);
    }

    public static /* synthetic */ void setState$default(ScootersPersonalGoalsPromoPlateView scootersPersonalGoalsPromoPlateView, eho0 eho0Var, sls slsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            slsVar = null;
        }
        scootersPersonalGoalsPromoPlateView.setState(eho0Var, slsVar);
    }

    public final void setState(eho0 state, sls onClick) {
        if (state == null) {
            setVisibility(8);
            setDebounceClickListener(null);
            return;
        }
        setTitle(state.getTitle());
        setSubtitle(state.getSubtitle());
        if (state instanceof aho0) {
            renderAvailable((aho0) state);
        } else if (state instanceof dho0) {
            renderInProgress((dho0) state);
        } else {
            if (!(state instanceof cho0)) {
                w511.b();
                return;
            }
            renderCompleted((cho0) state);
        }
        if (onClick != null) {
            setDebounceClickListener(new fcl0(12, onClick));
        } else {
            setDebounceClickListener(null);
        }
        setVisibility(0);
        invalidateComponent();
    }
}
