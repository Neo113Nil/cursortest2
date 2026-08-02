package androidx.compose.ui.text.style;

import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.room.TransactorKt;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.preferences.BooleanPreference;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class TextDrawStyleKt {
    public static final float access$takeOrElse(float f, Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0) {
        return Float.isNaN(f) ? ((Number) worker$$ExternalSyntheticLambda0.invoke()).floatValue() : f;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedUpdateDiscover.deepLinkSpecs;
    }

    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        boolean z = textForegroundStyle instanceof BrushStyle;
        TextForegroundStyle.Unspecified unspecified = TextForegroundStyle.Unspecified.INSTANCE;
        if (!z && !(textForegroundStyle2 instanceof BrushStyle)) {
            long m689lerpjxsXWHM = ColorKt.m689lerpjxsXWHM(f, textForegroundStyle.mo1007getColor0d7_KjU(), textForegroundStyle2.mo1007getColor0d7_KjU());
            return m689lerpjxsXWHM != 16 ? new ColorStyle(m689lerpjxsXWHM) : unspecified;
        }
        if (!z || !(textForegroundStyle2 instanceof BrushStyle)) {
            return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
        }
        BrushStyle brushStyle = (BrushStyle) textForegroundStyle;
        BrushStyle brushStyle2 = (BrushStyle) textForegroundStyle2;
        Brush brush = (Brush) SpanStyleKt.lerpDiscrete(brushStyle.value, brushStyle2.value, f);
        float lerp = TransactorKt.lerp(brushStyle.alpha, brushStyle2.alpha, f);
        if (brush == null) {
            return unspecified;
        }
        if (brush instanceof SolidColor) {
            long m1015modulateDxMtmZc = m1015modulateDxMtmZc(((SolidColor) brush).value, lerp);
            return m1015modulateDxMtmZc != 16 ? new ColorStyle(m1015modulateDxMtmZc) : unspecified;
        }
        if (brush instanceof ShaderBrush) {
            return new BrushStyle((ShaderBrush) brush, lerp);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* renamed from: modulate-DxMtmZc, reason: not valid java name */
    public static final long m1015modulateDxMtmZc(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : Color.m675copywmQWz5c$default(Color.m677getAlphaimpl(j) * f, j, 14);
    }

    public static BooleanPreference provideShownFirstPurchase(SharedPreferences sharedPreferences) {
        return new BooleanPreference(sharedPreferences, "investing_shown_first_purchase", false);
    }
}
