package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class BoringLayoutFactory33$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ BoringLayout m(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, RecyclerView.DECELERATION_RATE, metrics, z, truncateAt, i2, true);
    }
}
