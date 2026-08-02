package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class DropShadowRenderer {
    public long cornerRadius;
    public float generatedDensity;
    public LayoutDirection generatedLayoutDirection;
    public long generatedSize;
    public final ColorKt outline;
    public final AndroidPaint paint;
    public AndroidPath path;
    public final Shadow shadow;
    public AndroidImageBitmap shadowBitmap;
    public BlendModeColorFilter shadowTint;
    public long shadowTintColor;

    public DropShadowRenderer(Shadow shadow, ColorKt colorKt) {
        this.outline = colorKt;
        int i = Color.$r8$clinit;
        this.shadowTintColor = Color.Unspecified;
        this.cornerRadius = 0L;
        this.generatedSize = 9205357640488583168L;
        this.generatedLayoutDirection = LayoutDirection.Ltr;
        this.generatedDensity = 1.0f;
        this.shadow = shadow;
        this.paint = ColorKt.Paint();
    }

    /* renamed from: drawShadow-erFMhIw, reason: not valid java name */
    public final void m764drawShadowerFMhIw(DrawScope drawScope, ColorFilter colorFilter, long j, long j2, float f, int i) {
        ColorFilter colorFilter2;
        char c;
        long j3;
        AndroidImageBitmap androidImageBitmap;
        ColorKt colorKt = this.outline;
        if (colorKt instanceof Outline$Generic) {
            this.path = ((Outline$Generic) colorKt).path;
            this.cornerRadius = 0L;
        } else if (colorKt instanceof Outline$Rounded) {
            Outline$Rounded outline$Rounded = (Outline$Rounded) colorKt;
            RoundRect roundRect = outline$Rounded.roundRect;
            if (Strings.isSimple(roundRect)) {
                this.path = null;
                this.cornerRadius = roundRect.topLeftCornerRadius;
            } else {
                this.path = outline$Rounded.roundRectPath;
                this.cornerRadius = 0L;
            }
        } else if (!(colorKt instanceof Outline$Rectangle)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            this.path = null;
            this.cornerRadius = 0L;
        }
        if (colorFilter != null) {
            colorFilter2 = colorFilter;
        } else if (j2 != 16) {
            BlendModeColorFilter blendModeColorFilter = this.shadowTint;
            if (blendModeColorFilter == null || !Color.m676equalsimpl0(this.shadowTintColor, j2)) {
                blendModeColorFilter = new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                this.shadowTintColor = j2;
                this.shadowTint = blendModeColorFilter;
            }
            colorFilter2 = blendModeColorFilter;
        } else {
            colorFilter2 = null;
        }
        long j4 = this.generatedSize;
        if (j4 != 9205357640488583168L && Size.m639equalsimpl0(j4, j) && this.generatedLayoutDirection == drawScope.getLayoutDirection() && this.generatedDensity == drawScope.getDensity()) {
            c = ' ';
            j3 = BodyPartID.bodyIdMax;
        } else {
            long j5 = this.cornerRadius;
            AndroidPath androidPath = this.path;
            Shadow shadow = this.shadow;
            float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(shadow.radius);
            float mo236toPx0680j_42 = drawScope.mo236toPx0680j_4(shadow.spread);
            AndroidPaint androidPaint = this.paint;
            if (androidPath != null) {
                float f2 = mo236toPx0680j_42 * 2.0f;
                float f3 = (mo236toPx0680j_4 * 2.0f) + f2;
                c = ' ';
                j3 = BodyPartID.bodyIdMax;
                androidImageBitmap = ColorKt.m683ImageBitmapx__hDU$default((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f3), (int) Math.ceil(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + f3), 1);
                AndroidCanvas Canvas = ColorKt.Canvas(androidImageBitmap);
                if (mo236toPx0680j_42 > RecyclerView.DECELERATION_RATE) {
                    float f4 = mo236toPx0680j_4 + mo236toPx0680j_42;
                    Canvas.translate(f4, f4);
                    Canvas.drawPath(androidPath, BlurKt.m763configureShadowFoewPVk$default(androidPaint, mo236toPx0680j_4 > RecyclerView.DECELERATION_RATE ? new BlurMaskFilter(mo236toPx0680j_4, BlurMaskFilter.Blur.NORMAL) : null, 11));
                    AndroidPaint m763configureShadowFoewPVk$default = BlurKt.m763configureShadowFoewPVk$default(androidPaint, mo236toPx0680j_4 > RecyclerView.DECELERATION_RATE ? new BlurMaskFilter(mo236toPx0680j_4, BlurMaskFilter.Blur.NORMAL) : null, 3);
                    m763configureShadowFoewPVk$default.setStrokeWidth(f2);
                    Canvas.drawPath(androidPath, m763configureShadowFoewPVk$default);
                } else {
                    BlurKt.m763configureShadowFoewPVk$default(androidPaint, mo236toPx0680j_4 > RecyclerView.DECELERATION_RATE ? new BlurMaskFilter(mo236toPx0680j_4, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    Canvas.translate(mo236toPx0680j_4, mo236toPx0680j_4);
                    Canvas.drawPath(androidPath, androidPaint);
                }
            } else {
                c = ' ';
                j3 = BodyPartID.bodyIdMax;
                float f5 = (mo236toPx0680j_42 * 2.0f) + (mo236toPx0680j_4 * 2.0f);
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f5;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + f5;
                AndroidImageBitmap m683ImageBitmapx__hDU$default = ColorKt.m683ImageBitmapx__hDU$default((int) Math.ceil(intBitsToFloat), (int) Math.ceil(intBitsToFloat2), 1);
                ColorKt.Canvas(m683ImageBitmapx__hDU$default).drawRoundRect(mo236toPx0680j_4, mo236toPx0680j_4, intBitsToFloat - mo236toPx0680j_4, intBitsToFloat2 - mo236toPx0680j_4, Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & BodyPartID.bodyIdMax)), BlurKt.m763configureShadowFoewPVk$default(androidPaint, mo236toPx0680j_4 > RecyclerView.DECELERATION_RATE ? new BlurMaskFilter(mo236toPx0680j_4, BlurMaskFilter.Blur.NORMAL) : null, 11));
                androidImageBitmap = m683ImageBitmapx__hDU$default;
            }
            this.shadowBitmap = androidImageBitmap;
            this.generatedSize = j;
            this.generatedLayoutDirection = drawScope.getLayoutDirection();
            this.generatedDensity = drawScope.getDensity();
        }
        AndroidImageBitmap androidImageBitmap2 = this.shadowBitmap;
        if (androidImageBitmap2 != null) {
            Shadow shadow2 = this.shadow;
            float f6 = -(drawScope.mo236toPx0680j_4(shadow2.spread) + drawScope.mo236toPx0680j_4(shadow2.radius));
            DrawScope.m740drawImagegbVJVH8$default(drawScope, androidImageBitmap2, (Float.floatToRawIntBits(f6) << c) | (Float.floatToRawIntBits(f6) & j3), f, colorFilter2, i, 8);
        }
    }
}
