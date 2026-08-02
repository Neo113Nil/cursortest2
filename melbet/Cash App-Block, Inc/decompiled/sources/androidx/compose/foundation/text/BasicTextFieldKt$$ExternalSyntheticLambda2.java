package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewEvent;
import com.squareup.cash.work.views.clockin.ClockInSheetMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class BasicTextFieldKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ MutableState f$2;

    public /* synthetic */ BasicTextFieldKt$$ExternalSyntheticLambda2(int i, MutableState mutableState, MutableState mutableState2, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = mutableState;
        this.f$2 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String obj2;
        int i = this.$r8$classId;
        MutableState mutableState = this.f$2;
        MutableState mutableState2 = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                TextFieldValue textFieldValue = (TextFieldValue) obj;
                mutableState2.setValue(textFieldValue);
                boolean areEqual = Intrinsics.areEqual((String) mutableState.getValue(), textFieldValue.annotatedString.text);
                AnnotatedString annotatedString = textFieldValue.annotatedString;
                mutableState.setValue(annotatedString.text);
                if (!areEqual) {
                    function1.invoke(annotatedString.text);
                }
                break;
            case 1:
                TextFieldValue textFieldValue2 = (TextFieldValue) obj;
                textFieldValue2.getClass();
                mutableState2.setValue(textFieldValue2);
                String str = (String) mutableState.getValue();
                AnnotatedString annotatedString2 = textFieldValue2.annotatedString;
                boolean areEqual2 = Intrinsics.areEqual(str, annotatedString2.text);
                String str2 = annotatedString2.text;
                mutableState.setValue(str2);
                if (!areEqual2) {
                    function1.invoke(str2);
                }
                break;
            case 2:
                ((KeyboardActionScope) obj).getClass();
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    String str3 = ((TextFieldValue) mutableState.getValue()).annotatedString.text;
                    String str4 = "";
                    if (str3 != null && (obj2 = str3.toString()) != null) {
                        str4 = StringsKt__StringsJVMKt.replace$default(obj2, "-", "");
                    }
                    function1.invoke(new BankAccountLinkingViewEvent.Submit(str4));
                }
                break;
            case 3:
                LocationIdentifier locationIdentifier = (LocationIdentifier) obj;
                locationIdentifier.getClass();
                mutableState2.setValue(locationIdentifier);
                function1.invoke(new ClockInBottomSheetViewEvent.LocationSelectionChanged(locationIdentifier));
                mutableState.setValue(ClockInSheetMode.Main);
                break;
            default:
                JobIdentifier jobIdentifier = (JobIdentifier) obj;
                jobIdentifier.getClass();
                mutableState2.setValue(jobIdentifier);
                function1.invoke(new ClockInBottomSheetViewEvent.JobSelectionChanged(jobIdentifier));
                mutableState.setValue(ClockInSheetMode.Main);
                break;
        }
        return Unit.INSTANCE;
    }
}
