package com.google.android.gms.common;

import android.net.Uri;
import android.util.Base64;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public abstract class zzz {
    /* renamed from: fromUri-IoAF18A, reason: not valid java name */
    public static Object m2000fromUriIoAF18A(Uri uri) {
        uri.getClass();
        try {
            Result.Companion companion = Result.Companion;
            String queryParameter = uri.getQueryParameter("payment_method");
            if (queryParameter == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            byte[] decode = Base64.decode(queryParameter, 0);
            decode.getClass();
            return new InstantDebitsResult(new String(decode, Charsets.UTF_8), uri.getQueryParameter("last4"), uri.getQueryParameter("bank_name"), Boolean.parseBoolean(uri.getQueryParameter("incentive_eligible")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return new Result.Failure(th);
        }
    }

    public static final void sectionItemsIndexed(LazyGridIntervalContent lazyGridIntervalContent, List list, Section.Layout layout, ComposableLambdaImpl composableLambdaImpl) {
        lazyGridIntervalContent.getClass();
        list.getClass();
        layout.getClass();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        switch (layout) {
            case ONE_ROW:
                ref$IntRef2.element = 1;
                break;
            case ONE_COLUMN:
                ref$IntRef.element = 1;
                break;
            case TWO_ROWS:
                ref$IntRef2.element = 2;
                break;
            case TWO_COLUMNS:
                ref$IntRef.element = 2;
                break;
            case THREE_ROWS:
                ref$IntRef2.element = 3;
                break;
            case THREE_COLUMNS:
                ref$IntRef.element = 3;
                break;
            case FOUR_ROWS:
                ref$IntRef2.element = 4;
                break;
            case FOUR_COLUMNS:
                ref$IntRef.element = 4;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        int i = 0;
        if (ref$IntRef.element >= 1) {
            lazyGridIntervalContent.items(list.size(), null, new ButtonKt$Button$2.AnonymousClass1(14, new ArcadeModal$$ExternalSyntheticLambda3(ref$IntRef, 6), list), new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 0), new ComposableLambdaImpl(new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$4(list, composableLambdaImpl, ref$IntRef, i), true, -1942245546));
        } else if (ref$IntRef2.element >= 1) {
            LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new ComposeDialogKt$$ExternalSyntheticLambda14(19), new ComposableLambdaImpl(new SectionKt$$ExternalSyntheticLambda2(i, list, ref$IntRef2, composableLambdaImpl), true, 1112801418), 5);
        }
    }

    public static int zza(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }
}
