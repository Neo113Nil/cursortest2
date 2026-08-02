package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.applets.presenters.PoolIcon;

/* loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public final float alpha;
    public final ShaderBrush shaderBrush;
    public final ParcelableSnapshotMutableState size$delegate = Updater.mutableStateOf$default(new Size(9205357640488583168L));
    public final DerivedSnapshotState shaderState = Updater.derivedStateOf(new Worker$$ExternalSyntheticLambda0(this, 8));

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        this.shaderBrush = shaderBrush;
        this.alpha = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        PoolIcon.setAlpha(textPaint, this.alpha);
        textPaint.setShader((Shader) this.shaderState.getValue());
    }
}
