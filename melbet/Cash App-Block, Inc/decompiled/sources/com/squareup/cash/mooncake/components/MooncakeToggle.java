package com.squareup.cash.mooncake.components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.PaintDrawable;
import android.util.SizeF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.OvershootInterpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.zzo;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.mooncake.drawables.MooncakeButtonDrawable;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.theming.PressKt;
import com.squareup.contour.ContourLayout;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import nl.dionsegijn.konfetti.core.emitter.PartyEmitter;

/* loaded from: classes6.dex */
public final class MooncakeToggle extends ContourLayout {
    public static final OvershootInterpolator ANIM_INTERPOLATOR = new OvershootInterpolator(1.0f);
    public final ColorPalette colorPalette;
    public final boolean isDarkThemed;
    public boolean isPrimaryActivated;
    public final zzo leftOption;
    public Function1 onToggle;
    public final PartyEmitter primary;
    public final zzo rightOption;
    public final PartyEmitter secondary;
    public final Thumb thumb;
    public final ThumbDragTouchListener thumbDragTouchListener;
    public final boolean trackInternalToggleState;

    public final class PassthroughView extends View {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassthroughView(Context context) {
            super(context);
            context.getClass();
            setClickable(true);
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public final class Thumb {
        public final WandScene$ring$3 invalidate;
        public ValueAnimator locationAnimator;
        public final int margins;
        public final Paint paint;
        public final Path shapePath;
        public SizeF size;
        public float xLocation;

        public Thumb(int i, int i2, int i3, EnumListAdapter$encode$1 enumListAdapter$encode$1, WandScene$ring$3 wandScene$ring$3) {
            this.margins = i3;
            this.invalidate = wandScene$ring$3;
            Paint paint = new Paint(1);
            paint.setColor(i);
            paint.setShadowLayer(((Number) enumListAdapter$encode$1.invoke(Float.valueOf(12.0f))).floatValue(), RecyclerView.DECELERATION_RATE, ((Number) enumListAdapter$encode$1.invoke(Float.valueOf(4.0f))).floatValue(), i2);
            this.paint = paint;
            this.size = new SizeF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            this.shapePath = new Path();
        }

        public final void moveTo(float f, boolean z) {
            ValueAnimator valueAnimator = this.locationAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (!z) {
                this.xLocation = f;
                recreatePathFromLocation();
                return;
            }
            float f2 = this.xLocation;
            OvershootInterpolator overshootInterpolator = MooncakeToggle.ANIM_INTERPOLATOR;
            MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1 mooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1 = new MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1(this, 0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.setStartDelay(0L);
            ofFloat.setDuration(300L);
            ofFloat.setRepeatCount(0);
            ofFloat.setRepeatMode(1);
            if (overshootInterpolator != null) {
                ofFloat.setInterpolator(overshootInterpolator);
            }
            ofFloat.addUpdateListener(mooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1);
            ofFloat.addListener(mooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1);
            ofFloat.start();
            this.locationAnimator = ofFloat;
        }

        public final void recreatePathFromLocation() {
            Path path = this.shapePath;
            path.rewind();
            float f = this.xLocation;
            float f2 = this.margins;
            path.addRoundRect(f + f2, RecyclerView.DECELERATION_RATE + f2, (this.size.getWidth() + f) - f2, this.size.getHeight() - f2, this.size.getHeight() / 2.0f, this.size.getHeight() / 2.0f, Path.Direction.CW);
            this.invalidate.invoke();
        }
    }

    public final class ThumbDragTouchListener {
        public float lastTouchedAtX;
        public final MooncakeToggle toggle;
        public final int touchSlop;
        public PointF touchStartedAt;
        public boolean touchStartedOnThumb;

        public ThumbDragTouchListener(MooncakeToggle mooncakeToggle) {
            this.toggle = mooncakeToggle;
            this.touchSlop = ViewConfiguration.get(mooncakeToggle.getContext()).getScaledTouchSlop();
        }
    }

    public MooncakeToggle(Context context, zzo zzoVar, zzo zzoVar2) {
        super(context);
        this.leftOption = zzoVar;
        this.rightOption = zzoVar2;
        this.trackInternalToggleState = true;
        this.primary = new PartyEmitter(context);
        this.secondary = new PartyEmitter(context);
        this.isPrimaryActivated = true;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        final int i = 0;
        this.isDarkThemed = ThemeHelpersKt.themeInfo(this).theme == Theme.MooncakeDark;
        PassthroughView passthroughView = new PassthroughView(context);
        passthroughView.setContentDescription("Placeholder");
        PassthroughView passthroughView2 = new PassthroughView(context);
        passthroughView2.setContentDescription("Placeholder");
        int i2 = colorPalette.segmentedControlForeground;
        int i3 = colorPalette.segmentedControlBackground;
        final int i4 = 2;
        this.thumb = new Thumb(i2, ColorUtils.setAlphaComponent(-16777216, 10), Views.dip((View) this, 2), new EnumListAdapter$encode$1(1, context, Views.class, "dip", "dip(Landroid/content/Context;F)F", 1, 29), new WandScene$ring$3(0, this, MooncakeToggle.class, "invalidate", "invalidate()V", 0, 22));
        this.thumbDragTouchListener = new ThumbDragTouchListener(this);
        setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.mooncake.components.MooncakeToggle$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeToggle f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i;
                MooncakeToggle mooncakeToggle = this.f$0;
                switch (i5) {
                    case 0:
                        mooncakeToggle.setPrimaryActivated(!mooncakeToggle.isPrimaryActivated, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                    case 1:
                        mooncakeToggle.setPrimaryActivated(false, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                    default:
                        mooncakeToggle.setPrimaryActivated(true, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                }
            }
        });
        int i5 = MooncakeButtonDrawable.$r8$clinit;
        int pressColor$default = PressKt.pressColor$default(ThemeHelpersKt.themeInfo(this), Integer.valueOf(i3), 2);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.getPaint().setColor(i3);
        setBackground(new MooncakeButtonDrawable(pressColor$default, paintDrawable, new PaintDrawable()));
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new SplitButtons$$ExternalSyntheticLambda0(23));
        leftTo.widthOf(1, new SplitButtons$$ExternalSyntheticLambda0(24));
        ByteArrayProtoReader32 centerVerticallyTo = ContourLayout.centerVerticallyTo(new SplitButtons$$ExternalSyntheticLambda0(25));
        centerVerticallyTo.heightOf(1, new SplitButtons$$ExternalSyntheticLambda0(26));
        ContourLayout.layoutBy$default(this, passthroughView, leftTo, centerVerticallyTo);
        passthroughView.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.mooncake.components.MooncakeToggle$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeToggle f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52 = i4;
                MooncakeToggle mooncakeToggle = this.f$0;
                switch (i52) {
                    case 0:
                        mooncakeToggle.setPrimaryActivated(!mooncakeToggle.isPrimaryActivated, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                    case 1:
                        mooncakeToggle.setPrimaryActivated(false, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                    default:
                        mooncakeToggle.setPrimaryActivated(true, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                }
            }
        });
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new SplitButtons$$ExternalSyntheticLambda0(27));
        final int i6 = 1;
        rightTo.widthOf(1, new SplitButtons$$ExternalSyntheticLambda0(28));
        ByteArrayProtoReader32 centerVerticallyTo2 = ContourLayout.centerVerticallyTo(new SplitButtons$$ExternalSyntheticLambda0(29));
        centerVerticallyTo2.heightOf(1, new SplitButtons$$ExternalSyntheticLambda0(22));
        ContourLayout.layoutBy$default(this, passthroughView2, rightTo, centerVerticallyTo2);
        passthroughView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.mooncake.components.MooncakeToggle$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeToggle f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52 = i6;
                MooncakeToggle mooncakeToggle = this.f$0;
                switch (i52) {
                    case 0:
                        mooncakeToggle.setPrimaryActivated(!mooncakeToggle.isPrimaryActivated, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                    case 1:
                        mooncakeToggle.setPrimaryActivated(false, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                    default:
                        mooncakeToggle.setPrimaryActivated(true, true, true, mooncakeToggle.trackInternalToggleState);
                        break;
                }
            }
        });
    }

    public static /* synthetic */ void setPrimaryActivated$default(MooncakeToggle mooncakeToggle, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        mooncakeToggle.setPrimaryActivated(z, z2, z3, z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.thumb.locationAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int height = getHeight();
        ColorPalette colorPalette = this.colorPalette;
        int i = colorPalette.secondaryLabel;
        PartyEmitter partyEmitter = this.primary;
        partyEmitter.draw(canvas, height, i);
        int height2 = getHeight();
        int i2 = colorPalette.secondaryLabel;
        PartyEmitter partyEmitter2 = this.secondary;
        partyEmitter2.draw(canvas, height2, i2);
        Thumb thumb = this.thumb;
        thumb.getClass();
        canvas.drawPath(thumb.shapePath, thumb.paint);
        int save = canvas.save();
        try {
            canvas.clipPath(thumb.shapePath);
            Integer valueOf = this.isDarkThemed ? Integer.valueOf(colorPalette.label) : null;
            partyEmitter.draw(canvas, canvas.getHeight(), valueOf != null ? valueOf.intValue() : this.leftOption.zza);
            partyEmitter2.draw(canvas, canvas.getHeight(), valueOf != null ? valueOf.intValue() : this.rightOption.zza);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    @Override // com.squareup.contour.ContourLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = !(getLayoutParams() instanceof ContourLayout.LayoutSpec) && getLayoutParams().width == -2;
        PartyEmitter partyEmitter = this.secondary;
        PartyEmitter partyEmitter2 = this.primary;
        float min = z ? Math.min(Math.max(partyEmitter2.elapsedTime, partyEmitter.elapsedTime), getMeasuredWidth() / 2.0f) : getMeasuredWidth() / 2.0f;
        int i3 = (int) min;
        int generateLayoutAndGetHeight = partyEmitter2.generateLayoutAndGetHeight(RecyclerView.DECELERATION_RATE, i3);
        int generateLayoutAndGetHeight2 = partyEmitter.generateLayoutAndGetHeight(min, i3);
        if (z) {
            i = View.MeasureSpec.makeMeasureSpec(i3 * 2, 1073741824);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(generateLayoutAndGetHeight, generateLayoutAndGetHeight2), 1073741824));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        SizeF sizeF = new SizeF(i / 2.0f, i2);
        Thumb thumb = this.thumb;
        thumb.getClass();
        thumb.size = sizeF;
        thumb.recreatePathFromLocation();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        ThumbDragTouchListener thumbDragTouchListener = this.thumbDragTouchListener;
        int i = thumbDragTouchListener.touchSlop;
        MooncakeToggle mooncakeToggle = thumbDragTouchListener.toggle;
        PartyEmitter partyEmitter = mooncakeToggle.secondary;
        PartyEmitter partyEmitter2 = mooncakeToggle.primary;
        Thumb thumb = mooncakeToggle.thumb;
        if (motionEvent.getAction() == 0) {
            thumbDragTouchListener.touchStartedAt = new PointF(motionEvent.getX(), motionEvent.getY());
            thumb.getClass();
            float f = thumb.xLocation;
            RectF rectF = new RectF(f, RecyclerView.DECELERATION_RATE, thumb.size.getWidth() + f, thumb.size.getHeight());
            PointF pointF = thumbDragTouchListener.touchStartedAt;
            if (pointF == null) {
                Intrinsics.throwUninitializedPropertyAccessException("touchStartedAt");
                throw null;
            }
            thumbDragTouchListener.touchStartedOnThumb = rectF.contains(pointF.x, pointF.y);
        }
        if (!thumbDragTouchListener.touchStartedOnThumb) {
            return super.onTouchEvent(motionEvent);
        }
        PointF pointF2 = thumbDragTouchListener.touchStartedAt;
        if (pointF2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("touchStartedAt");
            throw null;
        }
        float abs = Math.abs(pointF2.x - motionEvent.getX());
        PointF pointF3 = thumbDragTouchListener.touchStartedAt;
        if (pointF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("touchStartedAt");
            throw null;
        }
        if (abs > Math.abs(pointF3.y - motionEvent.getY()) && abs > i) {
            mooncakeToggle.requestDisallowInterceptTouchEvent(true);
        }
        if (abs > i && motionEvent.getAction() == 2) {
            thumb.moveTo(RangesKt___RangesKt.coerceIn(thumb.xLocation + (motionEvent.getX() - thumbDragTouchListener.lastTouchedAtX), partyEmitter2.createParticleMs, partyEmitter.createParticleMs), false);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            boolean z = Math.abs(thumb.xLocation - partyEmitter2.createParticleMs) <= Math.abs(thumb.xLocation - partyEmitter.createParticleMs);
            if (z != mooncakeToggle.isPrimaryActivated) {
                mooncakeToggle.setPrimaryActivated(z, true, true, mooncakeToggle.trackInternalToggleState);
            } else {
                if (z) {
                    partyEmitter = partyEmitter2;
                }
                thumb.moveTo(partyEmitter.createParticleMs, true);
            }
        }
        thumbDragTouchListener.lastTouchedAtX = motionEvent.getX();
        return true;
    }

    public final void setOnToggle(Function1<? super Boolean, Unit> function1) {
        this.onToggle = function1;
    }

    public final void setPrimaryActivated(boolean z, final boolean z2, boolean z3, boolean z4) {
        Function1 function1;
        if (this.isPrimaryActivated == z) {
            return;
        }
        if (z4) {
            this.isPrimaryActivated = z;
        }
        if (z3 && (function1 = this.onToggle) != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.squareup.cash.mooncake.components.MooncakeToggle$setPrimaryActivated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    MooncakeToggle mooncakeToggle = MooncakeToggle.this;
                    mooncakeToggle.thumb.moveTo((mooncakeToggle.isPrimaryActivated ? mooncakeToggle.primary : mooncakeToggle.secondary).createParticleMs, z2);
                }
            });
        } else {
            this.thumb.moveTo((this.isPrimaryActivated ? this.primary : this.secondary).createParticleMs, z2);
        }
    }
}
