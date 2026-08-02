package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition$Attached;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import com.squareup.cash.moneybot.widgets.FloatingChatInputStatus;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldImplKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ boolean f$11;
    public final /* synthetic */ boolean f$12;
    public final /* synthetic */ boolean f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ Object f$15;
    public final /* synthetic */ Object f$16;
    public final /* synthetic */ Function f$17;
    public final /* synthetic */ int f$18;
    public final /* synthetic */ int f$19;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Function2 f$5;

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda4(CharSequence charSequence, Function2 function2, TextFieldLabelPosition$Attached textFieldLabelPosition$Attached, Function3 function3, Function2 function22, Function2 function23, boolean z, boolean z2, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, PaddingValues paddingValues, TextFieldColors textFieldColors, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        TextFieldType[] textFieldTypeArr = TextFieldType.$VALUES;
        this.f$1 = charSequence;
        this.f$2 = function2;
        this.f$3 = textFieldLabelPosition$Attached;
        this.f$4 = function3;
        this.f$5 = function22;
        this.f$10 = function23;
        this.f$11 = z;
        this.f$12 = z2;
        this.f$13 = z3;
        this.f$14 = mutableInteractionSourceImpl;
        this.f$15 = paddingValues;
        this.f$16 = textFieldColors;
        this.f$17 = composableLambdaImpl;
        this.f$18 = i;
        this.f$19 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$19;
        int i3 = this.f$18;
        Function function = this.f$17;
        Object obj3 = this.f$16;
        Object obj4 = this.f$15;
        Object obj5 = this.f$14;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$10;
        Object obj9 = this.f$1;
        switch (i) {
            case 0:
                TextFieldType[] textFieldTypeArr = TextFieldType.$VALUES;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                Icons$Filled.CommonDecorationBox((CharSequence) obj9, this.f$2, (TextFieldLabelPosition$Attached) obj7, (Function3) obj6, this.f$5, (Function2) obj8, this.f$11, this.f$12, this.f$13, (MutableInteractionSourceImpl) obj5, (PaddingValues) obj4, (TextFieldColors) obj3, (ComposableLambdaImpl) function, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(i2);
                UtilsKt.ExpandedChatInput((Modifier) obj9, (TextFieldValue) obj8, (FloatingChatInputStatus) obj7, this.f$11, this.f$12, this.f$13, (String) obj6, (Function1) obj5, (Function0) obj4, (Function0) obj3, (Function0) function, this.f$2, this.f$5, (Composer) obj, updateChangedFlags3, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda4(Modifier modifier, TextFieldValue textFieldValue, FloatingChatInputStatus floatingChatInputStatus, boolean z, boolean z2, boolean z3, String str, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function2 function22, int i, int i2) {
        this.f$1 = modifier;
        this.f$10 = textFieldValue;
        this.f$3 = floatingChatInputStatus;
        this.f$11 = z;
        this.f$12 = z2;
        this.f$13 = z3;
        this.f$4 = str;
        this.f$14 = function1;
        this.f$15 = function0;
        this.f$16 = function02;
        this.f$17 = function03;
        this.f$2 = function2;
        this.f$5 = function22;
        this.f$18 = i;
        this.f$19 = i2;
    }
}
