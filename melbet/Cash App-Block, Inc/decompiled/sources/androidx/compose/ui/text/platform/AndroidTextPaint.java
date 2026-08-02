package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.pools.applets.presenters.PoolIcon;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    public int backingBlendMode;
    public AndroidPaint backingComposePaint;
    public Brush brush;
    public Size brushSize;
    public DrawStyle drawStyle;
    public Color lastColor;
    public DerivedSnapshotState shaderState;
    public Shadow shadow;
    public TextDecoration textDecoration;

    public final Paint getComposePaint() {
        AndroidPaint androidPaint = this.backingComposePaint;
        if (androidPaint != null) {
            return androidPaint;
        }
        AndroidPaint androidPaint2 = new AndroidPaint(this);
        this.backingComposePaint = androidPaint2;
        return androidPaint2;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m1003setBlendModes9anfk8(int i) {
        if (i == this.backingBlendMode) {
            return;
        }
        ((AndroidPaint) getComposePaint()).m658setBlendModes9anfk8(i);
        this.backingBlendMode = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if ((r1 == null ? false : androidx.compose.ui.geometry.Size.m639equalsimpl0(r1.packedValue, r5)) == false) goto L19;
     */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1004setBrush12SF9DM(Brush brush, long j, float f) {
        if (brush == null) {
            this.shaderState = null;
            this.brush = null;
            this.brushSize = null;
            setShader(null);
            return;
        }
        if (brush instanceof SolidColor) {
            m1005setColor8_81llA(TextDrawStyleKt.m1015modulateDxMtmZc(((SolidColor) brush).value, f));
            return;
        }
        if (!(brush instanceof ShaderBrush)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        if (Intrinsics.areEqual(this.brush, brush)) {
            Size size = this.brushSize;
        }
        if (j != 9205357640488583168L) {
            this.brush = brush;
            this.brushSize = new Size(j);
            this.shaderState = Updater.derivedStateOf(new Http2Connection$$ExternalSyntheticLambda0(brush, j, 1));
        }
        Paint composePaint = getComposePaint();
        DerivedSnapshotState derivedSnapshotState = this.shaderState;
        ((AndroidPaint) composePaint).setShader(derivedSnapshotState != null ? (Shader) derivedSnapshotState.getValue() : null);
        this.lastColor = null;
        PoolIcon.setAlpha(this, f);
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m1005setColor8_81llA(long j) {
        Color color = this.lastColor;
        if ((color == null ? false : Color.m676equalsimpl0(color.value, j)) || j == 16) {
            return;
        }
        this.lastColor = new Color(j);
        setColor(ColorKt.m694toArgb8_81llA(j));
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (drawStyle.equals(Fill.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof Stroke)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ((AndroidPaint) getComposePaint()).m663setStylek9PVt8s(1);
        Stroke stroke = (Stroke) drawStyle;
        ((AndroidPaint) getComposePaint()).setStrokeWidth(stroke.width);
        androidx.compose.ui.graphics.Paint composePaint = getComposePaint();
        ((AndroidPaint) composePaint).internalPaint.setStrokeMiter(stroke.miter);
        ((AndroidPaint) getComposePaint()).m662setStrokeJoinWw9F2mQ(stroke.join);
        ((AndroidPaint) getComposePaint()).m661setStrokeCapBeK7IIE(stroke.cap);
        ((AndroidPaint) getComposePaint()).setPathEffect(stroke.pathEffect);
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (shadow.equals(Shadow.None)) {
            clearShadowLayer();
            return;
        }
        Shadow shadow2 = this.shadow;
        float f = shadow2.blurRadius;
        if (f == RecyclerView.DECELERATION_RATE) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (shadow2.offset >> 32)), Float.intBitsToFloat((int) (this.shadow.offset & BodyPartID.bodyIdMax)), ColorKt.m694toArgb8_81llA(this.shadow.color));
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        int i = textDecoration.mask;
        setUnderlineText((i | 1) == i);
        int i2 = this.textDecoration.mask;
        setStrikeThruText((i2 | 2) == i2);
    }
}
