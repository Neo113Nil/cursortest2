package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ArcadeFormSelectableInput$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ArcadeFormSelectableInput f$0;

    public /* synthetic */ ArcadeFormSelectableInput$$ExternalSyntheticLambda0(ArcadeFormSelectableInput arcadeFormSelectableInput) {
        this.f$0 = arcadeFormSelectableInput;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposableLambdaImpl rememberComposableLambda;
        int i = this.$r8$classId;
        ArcadeFormSelectableInput arcadeFormSelectableInput = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean changedInstance = gapComposer.changedInstance(arcadeFormSelectableInput);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new RealGooglePayer$$ExternalSyntheticLambda0(arcadeFormSelectableInput, 4);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue, 15);
                    FormBlocker.Element.SelectableInputElement selectableInputElement = arcadeFormSelectableInput.element;
                    String str = selectableInputElement.prefill_text;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    String str3 = selectableInputElement.hint_text;
                    String str4 = selectableInputElement.title_text;
                    if (str4 == null) {
                        gapComposer.startReplaceGroup(-1864728946);
                        gapComposer.end(false);
                        rememberComposableLambda = null;
                    } else {
                        gapComposer.startReplaceGroup(-1864728945);
                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(192585983, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str4, 22), gapComposer);
                        gapComposer.end(false);
                    }
                    ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
                    InputState inputState = InputState.DISABLED;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda1(12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    InputFieldKt.InputField(str2, (Function1) rememberedValue2, m183clickableoSLSa3U$default, inputState, composableLambdaImpl, (Function2) null, (Function2) null, (Function3) null, str3, (KeyboardOptions) null, (KeyboardActions) null, (VisualTransformation) null, gapComposer, 3120, 0, 3808);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                arcadeFormSelectableInput.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeFormSelectableInput$$ExternalSyntheticLambda0(ArcadeFormSelectableInput arcadeFormSelectableInput, int i) {
        this.f$0 = arcadeFormSelectableInput;
    }
}
