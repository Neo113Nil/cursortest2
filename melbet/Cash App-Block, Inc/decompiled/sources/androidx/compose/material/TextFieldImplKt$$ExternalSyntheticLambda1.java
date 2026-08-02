package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import com.stripe.android.uicore.elements.compat.CompatTextFieldKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldImplKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ MutableInteractionSourceImpl f$11;
    public final /* synthetic */ PaddingValues f$12;
    public final /* synthetic */ Shape f$13;
    public final /* synthetic */ TextFieldColors f$14;
    public final /* synthetic */ Object f$15;
    public final /* synthetic */ int f$16;
    public final /* synthetic */ int f$17;
    public final /* synthetic */ Function2 f$2;
    public final /* synthetic */ Function2 f$5;
    public final /* synthetic */ Function2 f$6;
    public final /* synthetic */ Function2 f$7;
    public final /* synthetic */ boolean f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda1(TextFieldType textFieldType, String str, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z, boolean z2, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, PaddingValues paddingValues, Shape shape, TextFieldColors textFieldColors, Function2 function25, int i, int i2) {
        this.f$0 = textFieldType;
        this.f$1 = str;
        this.f$2 = function2;
        this.f$5 = function22;
        this.f$6 = function23;
        this.f$7 = function24;
        this.f$8 = z;
        this.f$9 = z2;
        this.f$10 = z3;
        this.f$11 = mutableInteractionSourceImpl;
        this.f$12 = paddingValues;
        this.f$13 = shape;
        this.f$14 = textFieldColors;
        this.f$15 = function25;
        this.f$16 = i;
        this.f$17 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$17;
        int i3 = this.f$16;
        Object obj3 = this.f$15;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                CardKt.CommonDecorationBox((TextFieldType) obj4, this.f$1, this.f$2, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, (Function2) obj3, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(i2);
                CompatTextFieldKt.CommonDecorationBox(this.f$1, (ComposableLambdaImpl) obj4, (VisualTransformation) obj3, this.f$2, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, (PaddingValuesImpl) this.f$12, this.f$13, this.f$14, (Composer) obj, updateChangedFlags3, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextFieldImplKt$$ExternalSyntheticLambda1(String str, ComposableLambdaImpl composableLambdaImpl, VisualTransformation visualTransformation, Function2 function2, Function2 function22, Function2 function23, Function2 function24, boolean z, boolean z2, boolean z3, MutableInteractionSourceImpl mutableInteractionSourceImpl, PaddingValuesImpl paddingValuesImpl, Shape shape, TextFieldColors textFieldColors, int i, int i2) {
        this.f$1 = str;
        this.f$0 = composableLambdaImpl;
        this.f$15 = visualTransformation;
        this.f$2 = function2;
        this.f$5 = function22;
        this.f$6 = function23;
        this.f$7 = function24;
        this.f$8 = z;
        this.f$9 = z2;
        this.f$10 = z3;
        this.f$11 = mutableInteractionSourceImpl;
        this.f$12 = paddingValuesImpl;
        this.f$13 = shape;
        this.f$14 = textFieldColors;
        this.f$16 = i;
        this.f$17 = i2;
    }
}
