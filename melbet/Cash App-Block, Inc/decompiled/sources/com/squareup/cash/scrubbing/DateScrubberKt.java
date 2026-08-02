package com.squareup.cash.scrubbing;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.media3.ui.PlayerView;
import coil3.size.SizeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public abstract class DateScrubberKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.GetAppMessageByToken.deepLinkSpecs;
    }

    public static boolean isRequestFromAccessibilityTool(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return PlayerView.Api34.isRequestFromAccessibilityTool(accessibilityManager);
        }
        return true;
    }

    public static final TextFieldValue scrub(DateScrubber dateScrubber, TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        textFieldValue.getClass();
        textFieldValue2.getClass();
        String str = textFieldValue.annotatedString.text;
        AnnotatedString annotatedString = textFieldValue2.annotatedString;
        String scrub = dateScrubber.scrub(str, annotatedString.text);
        long j = textFieldValue2.selection;
        if (TextRange.m987getCollapsedimpl(j) && scrub.length() > annotatedString.text.length()) {
            int length = (scrub.length() - annotatedString.text.length()) + TextRange.m989getMaximpl(j);
            j = SizeKt.TextRange(length, length);
        }
        return TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue2, scrub, j, 4);
    }
}
