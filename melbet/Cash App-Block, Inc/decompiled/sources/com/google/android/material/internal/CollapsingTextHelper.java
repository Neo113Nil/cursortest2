package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.DisplayCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes4.dex */
public final class CollapsingTextHelper {
    public boolean alignBaselineAtBottom;
    public boolean boundsChanged;
    public final Rect collapsedBounds;
    public Rect collapsedBoundsForPlacement;
    public float collapsedDrawX;
    public float collapsedDrawY;
    public CancelableFontCallback collapsedFontCallback;
    public float collapsedLetterSpacing;
    public ColorStateList collapsedShadowColor;
    public float collapsedShadowDx;
    public float collapsedShadowDy;
    public float collapsedShadowRadius;
    public float collapsedTextBlend;
    public ColorStateList collapsedTextColor;
    public float collapsedTextWidth;
    public Typeface collapsedTypeface;
    public Typeface collapsedTypefaceBold;
    public Typeface collapsedTypefaceDefault;
    public final RectF currentBounds;
    public float currentDrawX;
    public float currentDrawY;
    public float currentLetterSpacing;
    public int currentMaxLines;
    public int currentOffsetY;
    public int currentShadowColor;
    public float currentShadowDx;
    public float currentShadowDy;
    public float currentShadowRadius;
    public float currentTextSize;
    public Typeface currentTypeface;
    public final Rect expandedBounds;
    public float expandedDrawX;
    public float expandedDrawY;
    public CancelableFontCallback expandedFontCallback;
    public float expandedFraction;
    public float expandedLetterSpacing;
    public int expandedLineCount;
    public ColorStateList expandedShadowColor;
    public float expandedShadowDx;
    public float expandedShadowDy;
    public float expandedShadowRadius;
    public float expandedTextBlend;
    public ColorStateList expandedTextColor;
    public Typeface expandedTypeface;
    public Typeface expandedTypefaceBold;
    public Typeface expandedTypefaceDefault;
    public boolean fadeModeEnabled;
    public float fadeModeStartFraction;
    public float fadeModeThresholdFraction;
    public boolean isRtl;
    public TimeInterpolator positionInterpolator;
    public float scale;
    public int[] state;
    public CharSequence text;
    public StaticLayout textLayout;
    public final TextPaint textPaint;
    public TimeInterpolator textSizeInterpolator;
    public CharSequence textToDraw;
    public CharSequence textToDrawCollapsed;
    public final TextPaint tmpPaint;
    public final ViewGroup view;
    public int expandedTextGravity = 16;
    public int collapsedTextGravity = 16;
    public float expandedTextSize = 15.0f;
    public float collapsedTextSize = 15.0f;
    public TextUtils.TruncateAt titleTextEllipsize = TextUtils.TruncateAt.END;
    public boolean isRtlTextDirectionHeuristicsEnabled = true;
    public int expandedMaxLines = 1;
    public int collapsedMaxLines = 1;
    public float lineSpacingAdd = RecyclerView.DECELERATION_RATE;
    public float lineSpacingMultiplier = 1.0f;
    public int hyphenationFrequency = 1;
    public int collapsedHeight = -1;
    public int expandedHeight = -1;

    public CollapsingTextHelper(ViewGroup viewGroup) {
        this.view = viewGroup;
        TextPaint textPaint = new TextPaint(EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        this.textPaint = textPaint;
        this.tmpPaint = new TextPaint(textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
        float f = this.fadeModeStartFraction;
        this.fadeModeThresholdFraction = CameraState$Type$EnumUnboxingLocalUtility.m(1.0f, f, 0.5f, f);
        maybeUpdateFontWeightAdjustment(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int blendARGB(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float lerp(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return AnimationUtils.lerp(f, f2, f3);
    }

    public static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public final void calculateCurrentOffsets() {
        float f;
        float f2 = this.expandedFraction;
        boolean z = this.fadeModeEnabled;
        Rect rect = this.collapsedBounds;
        Rect rect2 = this.expandedBounds;
        RectF rectF = this.currentBounds;
        if (z) {
            if (f2 < this.fadeModeThresholdFraction) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = lerp(rect2.left, rect.left, f2, this.positionInterpolator);
            rectF.top = lerp(this.expandedDrawY, this.collapsedDrawY, f2, this.positionInterpolator);
            rectF.right = lerp(rect2.right, rect.right, f2, this.positionInterpolator);
            rectF.bottom = lerp(rect2.bottom, rect.bottom, f2, this.positionInterpolator);
        }
        boolean z2 = this.fadeModeEnabled;
        ViewGroup viewGroup = this.view;
        TextPaint textPaint = this.textPaint;
        if (!z2) {
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f2, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f2, this.positionInterpolator);
            calculateUsingTextSize(f2, false);
            viewGroup.postInvalidateOnAnimation();
            float f3 = this.collapsedLetterSpacing;
            float f4 = this.expandedLetterSpacing;
            if (f3 != f4) {
                textPaint.setLetterSpacing(lerp(f4, f3, f2, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            f = f2;
        } else if (f2 < this.fadeModeThresholdFraction) {
            this.currentDrawX = this.expandedDrawX;
            this.currentDrawY = this.expandedDrawY;
            calculateUsingTextSize(RecyclerView.DECELERATION_RATE, false);
            viewGroup.postInvalidateOnAnimation();
            f = 0.0f;
        } else {
            this.currentDrawX = this.collapsedDrawX;
            this.currentDrawY = this.collapsedDrawY - Math.max(0, this.currentOffsetY);
            calculateUsingTextSize(1.0f, false);
            viewGroup.postInvalidateOnAnimation();
            f = 1.0f;
        }
        FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        this.collapsedTextBlend = 1.0f - lerp(RecyclerView.DECELERATION_RATE, 1.0f, 1.0f - f2, fastOutSlowInInterpolator);
        viewGroup.postInvalidateOnAnimation();
        this.expandedTextBlend = lerp(1.0f, RecyclerView.DECELERATION_RATE, f2, fastOutSlowInInterpolator);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.collapsedTextColor;
        ColorStateList colorStateList2 = this.expandedTextColor;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(blendARGB(f, getCurrentColor(colorStateList2), getCurrentColor(this.collapsedTextColor)));
        } else {
            textPaint.setColor(getCurrentColor(colorStateList));
        }
        this.currentShadowRadius = AnimationUtils.lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f2);
        this.currentShadowDx = AnimationUtils.lerp(this.expandedShadowDx, this.collapsedShadowDx, f2);
        this.currentShadowDy = AnimationUtils.lerp(this.expandedShadowDy, this.collapsedShadowDy, f2);
        int blendARGB = blendARGB(f2, getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor));
        this.currentShadowColor = blendARGB;
        textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, blendARGB);
        if (this.fadeModeEnabled) {
            int alpha = textPaint.getAlpha();
            float f5 = this.fadeModeThresholdFraction;
            textPaint.setAlpha((int) ((f2 <= f5 ? AnimationUtils.lerp(1.0f, RecyclerView.DECELERATION_RATE, this.fadeModeStartFraction, f5, f2) : AnimationUtils.lerp(RecyclerView.DECELERATION_RATE, 1.0f, f5, 1.0f, f2)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final boolean calculateIsRtl(CharSequence charSequence) {
        boolean z = this.view.getLayoutDirection() == 1;
        if (this.isRtlTextDirectionHeuristicsEnabled) {
            return (z ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void calculateUsingTextSize(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.text == null) {
            return;
        }
        float width = this.collapsedBounds.width();
        float width2 = this.expandedBounds.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = shouldTruncateCollapsedToSingleLine() ? this.collapsedTextSize : this.expandedTextSize;
            f3 = shouldTruncateCollapsedToSingleLine() ? this.collapsedLetterSpacing : this.expandedLetterSpacing;
            this.scale = shouldTruncateCollapsedToSingleLine() ? 1.0f : lerp(this.expandedTextSize, this.collapsedTextSize, f, this.textSizeInterpolator) / this.expandedTextSize;
            if (!shouldTruncateCollapsedToSingleLine()) {
                width = width2;
            }
            typeface = this.collapsedTypeface;
            width2 = width;
        } else {
            f2 = this.expandedTextSize;
            float f4 = this.expandedLetterSpacing;
            typeface = this.expandedTypeface;
            if (Math.abs(f - RecyclerView.DECELERATION_RATE) < 1.0E-5f) {
                this.scale = 1.0f;
            } else {
                this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f, this.textSizeInterpolator) / this.expandedTextSize;
            }
            float f5 = this.collapsedTextSize / this.expandedTextSize;
            float f6 = width2 * f5;
            if (!z && !this.fadeModeEnabled && f6 > width && shouldTruncateCollapsedToSingleLine()) {
                width2 = Math.min(width / f5, width2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.expandedMaxLines : this.collapsedMaxLines;
        TextPaint textPaint = this.textPaint;
        if (width2 > RecyclerView.DECELERATION_RATE) {
            boolean z2 = this.currentTextSize != f2;
            boolean z3 = this.currentLetterSpacing != f3;
            boolean z4 = this.currentTypeface != typeface;
            StaticLayout staticLayout = this.textLayout;
            boolean z5 = z2 || z3 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.currentMaxLines != i) || this.boundsChanged;
            this.currentTextSize = f2;
            this.currentLetterSpacing = f3;
            this.currentTypeface = typeface;
            this.boundsChanged = false;
            this.currentMaxLines = i;
            textPaint.setLinearText(this.scale != 1.0f);
            r7 = z5;
        }
        if (this.textToDraw == null || r7) {
            textPaint.setTextSize(this.currentTextSize);
            textPaint.setTypeface(this.currentTypeface);
            textPaint.setLetterSpacing(this.currentLetterSpacing);
            boolean calculateIsRtl = calculateIsRtl(this.text);
            this.isRtl = calculateIsRtl;
            StaticLayout createStaticLayout = createStaticLayout(((this.expandedMaxLines > 1 || this.collapsedMaxLines > 1) && (!calculateIsRtl || this.fadeModeEnabled)) ? i : 1, textPaint, this.text, width2 * (shouldTruncateCollapsedToSingleLine() ? 1.0f : this.scale), this.isRtl);
            this.textLayout = createStaticLayout;
            this.textToDraw = createStaticLayout.getText();
        }
    }

    public final StaticLayout createStaticLayout(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        try {
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.isRtl;
                    alignment = absoluteGravity != 5 ? z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(charSequence, textPaint, (int) f);
            staticLayoutBuilderCompat.ellipsize = this.titleTextEllipsize;
            staticLayoutBuilderCompat.isRtl = z;
            staticLayoutBuilderCompat.alignment = alignment;
            staticLayoutBuilderCompat.includePad = false;
            staticLayoutBuilderCompat.maxLines = i;
            float f2 = this.lineSpacingAdd;
            float f3 = this.lineSpacingMultiplier;
            staticLayoutBuilderCompat.lineSpacingAdd = f2;
            staticLayoutBuilderCompat.lineSpacingMultiplier = f3;
            staticLayoutBuilderCompat.hyphenationFrequency = this.hyphenationFrequency;
            staticLayoutBuilderCompat.staticLayoutBuilderConfigurer = null;
            staticLayout = staticLayoutBuilderCompat.build();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        staticLayout.getClass();
        return staticLayout;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        if (this.textToDraw != null) {
            RectF rectF = this.currentBounds;
            if (rectF.width() <= RecyclerView.DECELERATION_RATE || rectF.height() <= RecyclerView.DECELERATION_RATE) {
                return;
            }
            float f = this.currentTextSize;
            TextPaint textPaint = this.textPaint;
            textPaint.setTextSize(f);
            float f2 = this.currentDrawX;
            float f3 = this.currentDrawY;
            float f4 = this.scale;
            if (f4 != 1.0f && !this.fadeModeEnabled) {
                canvas.scale(f4, f4, f2, f3);
            }
            if ((this.expandedMaxLines > 1 || this.collapsedMaxLines > 1) && ((!this.isRtl || this.fadeModeEnabled) && shouldTruncateCollapsedToSingleLine() && (!this.fadeModeEnabled || this.expandedFraction > this.fadeModeThresholdFraction))) {
                float lineStart = this.currentDrawX - this.textLayout.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f3);
                if (!this.fadeModeEnabled) {
                    textPaint.setAlpha((int) (this.expandedTextBlend * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
                    }
                    this.textLayout.draw(canvas);
                }
                if (!this.fadeModeEnabled) {
                    textPaint.setAlpha((int) (this.collapsedTextBlend * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
                }
                int lineBaseline = this.textLayout.getLineBaseline(0);
                CharSequence charSequence = this.textToDrawCollapsed;
                float f5 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.DECELERATION_RATE, f5, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
                }
                if (!this.fadeModeEnabled) {
                    String trim = this.textToDrawCollapsed.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = Boxes$$ExternalSyntheticOutline1.m1148m(1, 0, trim);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.textLayout.getLineEnd(0), str.length()), RecyclerView.DECELERATION_RATE, f5, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f2, f3);
                this.textLayout.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final float getCollapsedTextHeight() {
        int i = this.collapsedHeight;
        if (i != -1) {
            return i;
        }
        float f = this.collapsedTextSize;
        TextPaint textPaint = this.tmpPaint;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.collapsedTypeface);
        textPaint.setLetterSpacing(this.collapsedLetterSpacing);
        return -textPaint.ascent();
    }

    public final int getCurrentColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float getExpandedTextFullSingleLineHeight() {
        float f = this.expandedTextSize;
        TextPaint textPaint = this.tmpPaint;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.expandedTypeface);
        textPaint.setLetterSpacing(this.expandedLetterSpacing);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final void maybeUpdateFontWeightAdjustment(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = DisplayCompat.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.expandedTypefaceDefault;
            if (typeface2 != null) {
                this.expandedTypefaceBold = DisplayCompat.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.collapsedTypefaceBold;
            if (typeface3 == null) {
                typeface3 = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface3;
            Typeface typeface4 = this.expandedTypefaceBold;
            if (typeface4 == null) {
                typeface4 = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface4;
            recalculate(true);
        }
    }

    public final void recalculate(boolean z) {
        float measureText;
        ViewGroup viewGroup = this.view;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
            return;
        }
        calculateUsingTextSize(1.0f, z);
        CharSequence charSequence = this.textToDraw;
        TextPaint textPaint = this.textPaint;
        if (charSequence != null && this.textLayout != null) {
            boolean shouldTruncateCollapsedToSingleLine = shouldTruncateCollapsedToSingleLine();
            CharSequence charSequence2 = this.textToDraw;
            if (shouldTruncateCollapsedToSingleLine) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint, this.textLayout.getWidth(), this.titleTextEllipsize);
            }
            this.textToDrawCollapsed = charSequence2;
        }
        CharSequence charSequence3 = this.textToDrawCollapsed;
        float f = RecyclerView.DECELERATION_RATE;
        if (charSequence3 != null) {
            this.collapsedTextWidth = textPaint.measureText(charSequence3, 0, charSequence3.length());
        } else {
            this.collapsedTextWidth = RecyclerView.DECELERATION_RATE;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        Rect rect = this.collapsedBoundsForPlacement;
        Rect rect2 = this.collapsedBounds;
        if (rect == null) {
            rect = rect2;
        }
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.collapsedDrawY = rect.top;
        } else if (i != 80) {
            this.collapsedDrawY = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.collapsedDrawY = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.collapsedDrawX = rect.centerX() - (this.collapsedTextWidth / 2.0f);
        } else if (i2 != 5) {
            this.collapsedDrawX = rect.left;
        } else {
            this.collapsedDrawX = rect.right - this.collapsedTextWidth;
        }
        if (this.collapsedTextWidth <= rect2.width()) {
            float f2 = this.collapsedDrawX;
            float max = Math.max(RecyclerView.DECELERATION_RATE, rect2.left - f2) + f2;
            this.collapsedDrawX = max;
            this.collapsedDrawX = Math.min(RecyclerView.DECELERATION_RATE, rect2.right - (this.collapsedTextWidth + max)) + max;
        }
        float f3 = this.collapsedTextSize;
        TextPaint textPaint2 = this.tmpPaint;
        textPaint2.setTextSize(f3);
        textPaint2.setTypeface(this.collapsedTypeface);
        textPaint2.setLetterSpacing(this.collapsedLetterSpacing);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect2.height()) {
            float f4 = this.collapsedDrawY;
            float max2 = Math.max(RecyclerView.DECELERATION_RATE, rect2.top - f4) + f4;
            this.collapsedDrawY = max2;
            this.collapsedDrawY = Math.min(RecyclerView.DECELERATION_RATE, rect2.bottom - (getCollapsedTextHeight() + max2)) + max2;
        }
        calculateUsingTextSize(RecyclerView.DECELERATION_RATE, z);
        float height = this.textLayout != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout == null || this.expandedMaxLines <= 1) {
            CharSequence charSequence4 = this.textToDraw;
            measureText = charSequence4 != null ? textPaint.measureText(charSequence4, 0, charSequence4.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.textLayout;
        this.expandedLineCount = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect3 = this.expandedBounds;
        if (i3 == 48) {
            this.expandedDrawY = rect3.top;
        } else if (i3 != 80) {
            this.expandedDrawY = rect3.centerY() - (height / 2.0f);
        } else {
            float f5 = rect3.bottom - height;
            if (this.alignBaselineAtBottom) {
                f = textPaint.descent();
            }
            this.expandedDrawY = f5 + f;
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.expandedDrawX = rect3.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.expandedDrawX = rect3.left;
        } else {
            this.expandedDrawX = rect3.right - measureText;
        }
        calculateUsingTextSize(this.expandedFraction, false);
        viewGroup.postInvalidateOnAnimation();
        calculateCurrentOffsets();
    }

    public final void setCollapsedAndExpandedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor == colorStateList && this.expandedTextColor == colorStateList) {
            return;
        }
        this.collapsedTextColor = colorStateList;
        this.expandedTextColor = colorStateList;
        recalculate(false);
    }

    public final void setCollapsedBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.collapsedBounds;
        if (rectEquals(rect, i, i2, i3, i4)) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.boundsChanged = true;
    }

    public final void setCollapsedBoundsForOffsets(int i, int i2, int i3, int i4) {
        if (this.collapsedBoundsForPlacement == null) {
            this.collapsedBoundsForPlacement = new Rect(i, i2, i3, i4);
            this.boundsChanged = true;
        }
        if (rectEquals(this.collapsedBoundsForPlacement, i, i2, i3, i4)) {
            return;
        }
        this.collapsedBoundsForPlacement.set(i, i2, i3, i4);
        this.boundsChanged = true;
    }

    public final void setCollapsedTextAppearance(int i) {
        ViewGroup viewGroup = this.view;
        TextAppearance textAppearance = new TextAppearance(viewGroup.getContext(), i);
        ColorStateList colorStateList = textAppearance.textColor;
        if (colorStateList != null) {
            this.collapsedTextColor = colorStateList;
        }
        float f = textAppearance.textSize;
        if (f != RecyclerView.DECELERATION_RATE) {
            this.collapsedTextSize = f;
        }
        ColorStateList colorStateList2 = textAppearance.shadowColor;
        if (colorStateList2 != null) {
            this.collapsedShadowColor = colorStateList2;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancelled = true;
        }
        zzb zzbVar = new zzb(this);
        textAppearance.createFallbackFont();
        this.collapsedFontCallback = new CancelableFontCallback(zzbVar, textAppearance.font);
        textAppearance.getFontAsync(viewGroup.getContext(), this.collapsedFontCallback);
        recalculate(false);
    }

    public final void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate(false);
        }
    }

    public final void setCollapsedTextGravity(int i) {
        if (this.collapsedTextGravity != i) {
            this.collapsedTextGravity = i;
            recalculate(false);
        }
    }

    public final boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancelled = true;
        }
        if (this.collapsedTypefaceDefault == typeface) {
            return false;
        }
        this.collapsedTypefaceDefault = typeface;
        Typeface maybeCopyWithFontWeightAdjustment = DisplayCompat.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.collapsedTypefaceBold = maybeCopyWithFontWeightAdjustment;
        if (maybeCopyWithFontWeightAdjustment == null) {
            maybeCopyWithFontWeightAdjustment = this.collapsedTypefaceDefault;
        }
        this.collapsedTypeface = maybeCopyWithFontWeightAdjustment;
        return true;
    }

    public final void setExpandedBounds(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.expandedBounds;
        if (rectEquals(rect, i, i2, i3, i4) && z == this.alignBaselineAtBottom) {
            return;
        }
        rect.set(i, i2, i3, i4);
        this.boundsChanged = true;
        this.alignBaselineAtBottom = z;
    }

    public final void setExpandedMaxLines(int i) {
        if (i != this.expandedMaxLines) {
            this.expandedMaxLines = i;
            recalculate(false);
        }
    }

    public final void setExpandedTextAppearance(int i) {
        ViewGroup viewGroup = this.view;
        TextAppearance textAppearance = new TextAppearance(viewGroup.getContext(), i);
        ColorStateList colorStateList = textAppearance.textColor;
        if (colorStateList != null) {
            this.expandedTextColor = colorStateList;
        }
        float f = textAppearance.textSize;
        if (f != RecyclerView.DECELERATION_RATE) {
            this.expandedTextSize = f;
        }
        ColorStateList colorStateList2 = textAppearance.shadowColor;
        if (colorStateList2 != null) {
            this.expandedShadowColor = colorStateList2;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        int i2 = 1;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancelled = true;
        }
        JCAContext jCAContext = new JCAContext(this, i2);
        textAppearance.createFallbackFont();
        this.expandedFontCallback = new CancelableFontCallback(jCAContext, textAppearance.font);
        textAppearance.getFontAsync(viewGroup.getContext(), this.expandedFontCallback);
        recalculate(false);
    }

    public final void setExpandedTextGravity(int i) {
        if (this.expandedTextGravity != i) {
            this.expandedTextGravity = i;
            recalculate(false);
        }
    }

    public final void setExpandedTextSize(float f) {
        if (this.expandedTextSize != f) {
            this.expandedTextSize = f;
            recalculate(false);
        }
    }

    public final boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancelled = true;
        }
        if (this.expandedTypefaceDefault == typeface) {
            return false;
        }
        this.expandedTypefaceDefault = typeface;
        Typeface maybeCopyWithFontWeightAdjustment = DisplayCompat.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.expandedTypefaceBold = maybeCopyWithFontWeightAdjustment;
        if (maybeCopyWithFontWeightAdjustment == null) {
            maybeCopyWithFontWeightAdjustment = this.expandedTypefaceDefault;
        }
        this.expandedTypeface = maybeCopyWithFontWeightAdjustment;
        return true;
    }

    public final void setExpansionFraction(float f) {
        float clamp = MathUtils.clamp(f, RecyclerView.DECELERATION_RATE, 1.0f);
        if (clamp != this.expandedFraction) {
            this.expandedFraction = clamp;
            calculateCurrentOffsets();
        }
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            recalculate(false);
        }
    }

    public final boolean shouldTruncateCollapsedToSingleLine() {
        return this.collapsedMaxLines == 1;
    }
}
