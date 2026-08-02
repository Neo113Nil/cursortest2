package androidx.compose.ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class TextLayout_androidKt {
    public static final ThreadLocal SharedTextAndroidCanvas = new ThreadLocal();
    public static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

    public static final long VerticalPaddings(int i, int i2) {
        return (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
