package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.compose.ui.platform.AccessibilityIterators$WordTextSegmentIterator;
import com.squareup.cash.cdf.document.DocumentUploadReceiveError;
import com.squareup.cash.cdf.document.Trigger;
import com.squareup.cash.fileupload.api.FileError;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.onboarding.check.IntegrityChecker$Result;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public abstract class zzafb {
    public static final boolean allSuccess(List list) {
        list.getClass();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(((IntegrityChecker$Result) it.next()) instanceof IntegrityChecker$Result.Success)) {
                return false;
            }
        }
        return true;
    }

    public static final ArrayList failures(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof IntegrityChecker$Result.Failure) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final IntegrityChecker$Result.Failure firstFailure(List list) {
        list.getClass();
        return (IntegrityChecker$Result.Failure) CollectionsKt.first((List) failures(list));
    }

    public static AccessibilityIterators$WordTextSegmentIterator getInstance(Locale locale) {
        if (AccessibilityIterators$WordTextSegmentIterator.instance$1 == null) {
            AccessibilityIterators$WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator = new AccessibilityIterators$WordTextSegmentIterator(1);
            accessibilityIterators$WordTextSegmentIterator.impl = BreakIterator.getCharacterInstance(locale);
            AccessibilityIterators$WordTextSegmentIterator.instance$1 = accessibilityIterators$WordTextSegmentIterator;
        }
        AccessibilityIterators$WordTextSegmentIterator accessibilityIterators$WordTextSegmentIterator2 = AccessibilityIterators$WordTextSegmentIterator.instance$1;
        accessibilityIterators$WordTextSegmentIterator2.getClass();
        return accessibilityIterators$WordTextSegmentIterator2;
    }

    public static final void logDocumentUploadError(Analytics analytics, String str, FileError fileError, String str2, String str3, Trigger trigger) {
        String str4;
        str2.getClass();
        str3.getClass();
        int ordinal = fileError.ordinal();
        if (ordinal == 0) {
            str4 = "Invalid File";
        } else if (ordinal == 1) {
            str4 = "File Is Too Large";
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            str4 = "Unsupported Format";
        }
        analytics.track(new DocumentUploadReceiveError(str, null, str4, str2, str3, Boolean.FALSE, null, trigger, 66), null);
    }
}
