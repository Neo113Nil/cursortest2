package app.cash.local.sharedui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.overlays.Overlay;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$matchParent$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Huffman;

/* loaded from: classes3.dex */
public final class LocalLoadingOverlay extends ContourLayout implements Overlay {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalLoadingOverlay(Context context) {
        super(context);
        context.getClass();
        contourWidthMatchParent();
        Huffman.Node node = this.heightConfig;
        node.getClass();
        node.children = SizeConfigSmartLambdas$matchParent$1.INSTANCE;
        setBackgroundColor(ColorKt.m694toArgb8_81llA(Color.m675copywmQWz5c$default(0.5f, ColorsLightKt.colorsLight.base.grey50, 14)));
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final View getAsView() {
        return this;
    }

    @Override // com.squareup.cash.overlays.Overlay
    public final OnBackListener getBackListener() {
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setOnClickOutsideListener(Function0<Unit> function0) {
        function0.getClass();
    }
}
