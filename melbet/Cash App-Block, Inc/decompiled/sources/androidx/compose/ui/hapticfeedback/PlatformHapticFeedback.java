package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.core.view.HapticFeedbackConstantsCompat;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class PlatformHapticFeedback {
    public final View view;

    public PlatformHapticFeedback(View view) {
        this.view = view;
    }

    /* renamed from: performHapticFeedback-CdsT49E, reason: not valid java name */
    public final void m769performHapticFeedbackCdsT49E(int i) {
        int i2 = 16;
        if (!HapticFeedbackType.m767equalsimpl0(i, 16)) {
            i2 = 6;
            if (!HapticFeedbackType.m767equalsimpl0(i, 6)) {
                i2 = 13;
                if (!HapticFeedbackType.m767equalsimpl0(i, 13)) {
                    i2 = 23;
                    if (!HapticFeedbackType.m767equalsimpl0(i, 23)) {
                        i2 = 3;
                        if (!HapticFeedbackType.m767equalsimpl0(i, 3)) {
                            i2 = 0;
                            if (!HapticFeedbackType.m767equalsimpl0(i, 0)) {
                                i2 = 17;
                                if (!HapticFeedbackType.m767equalsimpl0(i, 17)) {
                                    i2 = 27;
                                    if (!HapticFeedbackType.m767equalsimpl0(i, 27)) {
                                        i2 = 26;
                                        if (!HapticFeedbackType.m767equalsimpl0(i, 26)) {
                                            i2 = 9;
                                            if (!HapticFeedbackType.m767equalsimpl0(i, 9)) {
                                                i2 = 22;
                                                if (!HapticFeedbackType.m767equalsimpl0(i, 22)) {
                                                    i2 = 21;
                                                    if (!HapticFeedbackType.m767equalsimpl0(i, 21)) {
                                                        i2 = 1;
                                                        if (!HapticFeedbackType.m767equalsimpl0(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        int feedbackConstantOrFallback = HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(i2);
        if (feedbackConstantOrFallback == -1) {
            return;
        }
        this.view.performHapticFeedback(feedbackConstantOrFallback);
    }
}
