package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    public final boolean onClearTranslation(View view) {
        Function0 function0;
        view.getClass();
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).contentCaptureManager;
        androidContentCaptureManager.getClass();
        androidContentCaptureManager.translateStatus = AndroidContentCaptureManager.TranslateStatus.SHOW_ORIGINAL;
        MutableIntObjectMap currentSemanticsNodes$ui = androidContentCaptureManager.getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        MutableScatterMap mutableScatterMap = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().unmergedConfig.props;
                        Object obj = mutableScatterMap.get(SemanticsProperties.IsShowingTextSubstitution);
                        if (obj == null) {
                            obj = null;
                        }
                        if (obj != null) {
                            Object obj2 = mutableScatterMap.get(SemanticsActions.ClearTextSubstitution);
                            AccessibilityAction accessibilityAction = (AccessibilityAction) (obj2 != null ? obj2 : null);
                            if (accessibilityAction != null && (function0 = (Function0) accessibilityAction.action) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        view.getClass();
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).contentCaptureManager;
        androidContentCaptureManager.getClass();
        androidContentCaptureManager.translateStatus = AndroidContentCaptureManager.TranslateStatus.SHOW_ORIGINAL;
        MutableIntObjectMap currentSemanticsNodes$ui = androidContentCaptureManager.getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        MutableScatterMap mutableScatterMap = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().unmergedConfig.props;
                        Object obj = mutableScatterMap.get(SemanticsProperties.IsShowingTextSubstitution);
                        if (obj == null) {
                            obj = null;
                        }
                        if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                            Object obj2 = mutableScatterMap.get(SemanticsActions.ShowTextSubstitution);
                            AccessibilityAction accessibilityAction = (AccessibilityAction) (obj2 != null ? obj2 : null);
                            if (accessibilityAction != null && (function1 = (Function1) accessibilityAction.action) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        view.getClass();
        AndroidContentCaptureManager androidContentCaptureManager = ((AndroidComposeView) view).contentCaptureManager;
        androidContentCaptureManager.getClass();
        androidContentCaptureManager.translateStatus = AndroidContentCaptureManager.TranslateStatus.SHOW_TRANSLATED;
        MutableIntObjectMap currentSemanticsNodes$ui = androidContentCaptureManager.getCurrentSemanticsNodes$ui();
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        MutableScatterMap mutableScatterMap = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().unmergedConfig.props;
                        Object obj = mutableScatterMap.get(SemanticsProperties.IsShowingTextSubstitution);
                        if (obj == null) {
                            obj = null;
                        }
                        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                            Object obj2 = mutableScatterMap.get(SemanticsActions.ShowTextSubstitution);
                            AccessibilityAction accessibilityAction = (AccessibilityAction) (obj2 != null ? obj2 : null);
                            if (accessibilityAction != null && (function1 = (Function1) accessibilityAction.action) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
