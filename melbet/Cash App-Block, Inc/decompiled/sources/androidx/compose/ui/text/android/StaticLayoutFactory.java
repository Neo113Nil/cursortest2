package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.camera.camera2.compat.Api35Compat;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.EventStore$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class StaticLayoutFactory {
    public static final EventStore$$ExternalSyntheticLambda0 IntRangeComparator = new EventStore$$ExternalSyntheticLambda0(3);

    public static StaticLayout create(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid end value");
        }
        if (i3 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid maxLines value");
        }
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid width value");
        }
        if (i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(RecyclerView.DECELERATION_RATE, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        obtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            BoringLayoutFactory33.setLineBreakConfig(obtain, i7, i8);
        }
        if (i10 >= 35) {
            Api35Compat.disableUseBoundsForWidth(obtain);
        }
        return obtain.build();
    }

    public static final boolean hasSpan(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
