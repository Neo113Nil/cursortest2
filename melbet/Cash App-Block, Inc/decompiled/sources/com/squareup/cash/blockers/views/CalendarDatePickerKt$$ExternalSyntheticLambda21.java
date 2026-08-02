package com.squareup.cash.blockers.views;

import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class CalendarDatePickerKt$$ExternalSyntheticLambda21 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ CalendarDatePickerKt$$ExternalSyntheticLambda21(String str, boolean z, boolean z2) {
        this.$r8$classId = 2;
        this.f$1 = z;
        this.f$2 = z2;
        this.f$0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        boolean z = this.f$2;
        boolean z2 = this.f$1;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                String format2 = CalendarDatePickerKt.accessibilityDateTimeFormatter.format((LocalDate) obj2);
                format2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, format2);
                if (!z2) {
                    SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                }
                break;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                long mo345provideF1C5BW0 = ((OffsetProvider) obj2).mo345provideF1C5BW0();
                semanticsPropertyReceiver2.set(SelectionHandlesKt.SelectionHandleInfoKey, new SelectionHandleInfo(z2 ? Handle.SelectionStart : Handle.SelectionEnd, mo345provideF1C5BW0, z ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (9223372034707292159L & mo345provideF1C5BW0) != 9205357640488583168L ? 1 : 0));
                break;
            default:
                String str = (String) obj2;
                View view = (View) obj;
                view.getClass();
                if (view instanceof WebView) {
                    if (!z2) {
                        ((WebView) view).getSettings().setForceDark(z ? 0 : 2);
                    }
                    ((WebView) view).loadDataWithBaseURL("file:///android_res/", str, "text/html; charset=utf-8", "utf-8", null);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CalendarDatePickerKt$$ExternalSyntheticLambda21(int i, Object obj, boolean z, boolean z2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = z2;
    }
}
