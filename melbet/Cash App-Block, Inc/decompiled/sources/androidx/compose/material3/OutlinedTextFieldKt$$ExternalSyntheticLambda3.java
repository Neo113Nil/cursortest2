package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.emoji2.text.MetadataRepo;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.presentation.Async;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class OutlinedTextFieldKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ Function f$12;
    public final /* synthetic */ Object f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ int f$15;
    public final /* synthetic */ int f$16;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda3(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Function0 function02, String str, SearchBarKeyboardState searchBarKeyboardState, Modifier modifier, PaddingValues paddingValues, ShowNavigationBack showNavigationBack, Function0 function03, Function0 function04, String str2, Function0 function05, boolean z, MetadataRepo metadataRepo, int i, int i2) {
        this.f$12 = composableLambdaImpl;
        this.f$1 = function0;
        this.f$3 = function02;
        this.f$4 = str;
        this.f$5 = searchBarKeyboardState;
        this.f$6 = modifier;
        this.f$14 = paddingValues;
        this.f$7 = showNavigationBack;
        this.f$13 = function03;
        this.f$2 = function04;
        this.f$9 = str2;
        this.f$10 = function05;
        this.f$8 = z;
        this.f$11 = metadataRepo;
        this.f$15 = i;
        this.f$16 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$16;
        int i3 = this.f$15;
        Object obj3 = this.f$14;
        Function function = this.f$12;
        Object obj4 = this.f$10;
        Object obj5 = this.f$9;
        Object obj6 = this.f$11;
        Object obj7 = this.f$2;
        Object obj8 = this.f$13;
        Object obj9 = this.f$7;
        Object obj10 = this.f$6;
        Object obj11 = this.f$5;
        Object obj12 = this.f$4;
        Object obj13 = this.f$3;
        Object obj14 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                MenuKt.OutlinedTextFieldLayout((Function2) obj14, (Function3) obj7, (Function2) obj13, (Function2) obj12, (Function2) obj11, (Function2) obj10, (Function2) obj9, this.f$8, (TextFieldLabelPosition$Attached) obj5, (TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0) obj4, (Function1) obj6, (ComposableLambdaImpl) function, (Function2) obj8, (PaddingValues) obj3, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(i2);
                SearchBarKt.InternalSearchBar((ComposableLambdaImpl) function, (Function0) obj14, (Function0) obj13, (String) obj12, (SearchBarKeyboardState) obj11, (Modifier) obj10, (PaddingValues) obj3, (ShowNavigationBack) obj9, (Function0) obj8, (Function0) obj7, (String) obj5, (Function0) obj4, this.f$8, (MetadataRepo) obj6, (Composer) obj, updateChangedFlags3, updateChangedFlags4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags6 = Updater.updateChangedFlags(i2);
                ManualEntryScreenKt.ManualEntryLoaded((ManualEntryState.Payload) obj14, (Async) obj13, (String) obj12, (Integer) obj11, (String) obj10, (Integer) obj9, (String) obj8, (Integer) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, this.f$8, (Function0) function, (Function0) obj3, (Composer) obj, updateChangedFlags5, updateChangedFlags6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda3(ManualEntryState.Payload payload, Async async, String str, Integer num, String str2, Integer num2, String str3, Integer num3, Function1 function1, Function1 function12, Function1 function13, boolean z, Function0 function0, Function0 function02, int i, int i2) {
        this.f$1 = payload;
        this.f$3 = async;
        this.f$4 = str;
        this.f$5 = num;
        this.f$6 = str2;
        this.f$7 = num2;
        this.f$13 = str3;
        this.f$2 = num3;
        this.f$11 = function1;
        this.f$9 = function12;
        this.f$10 = function13;
        this.f$8 = z;
        this.f$12 = function0;
        this.f$14 = function02;
        this.f$15 = i;
        this.f$16 = i2;
    }

    public /* synthetic */ OutlinedTextFieldKt$$ExternalSyntheticLambda3(Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, TextFieldLabelPosition$Attached textFieldLabelPosition$Attached, TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Function2 function27, PaddingValues paddingValues, int i, int i2) {
        this.f$1 = function2;
        this.f$2 = function3;
        this.f$3 = function22;
        this.f$4 = function23;
        this.f$5 = function24;
        this.f$6 = function25;
        this.f$7 = function26;
        this.f$8 = z;
        this.f$9 = textFieldLabelPosition$Attached;
        this.f$10 = textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
        this.f$11 = function1;
        this.f$12 = composableLambdaImpl;
        this.f$13 = function27;
        this.f$14 = paddingValues;
        this.f$15 = i;
        this.f$16 = i2;
    }
}
