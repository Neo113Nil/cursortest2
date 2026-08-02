package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.core.widget.EdgeEffectCompat;
import androidx.room.Room;
import com.google.mlkit.vision.common.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormMoneyInput$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeFormMoneyInput f$0;

    public /* synthetic */ ArcadeFormMoneyInput$$ExternalSyntheticLambda0(ArcadeFormMoneyInput arcadeFormMoneyInput, int i) {
        this.$r8$classId = 1;
        this.f$0 = arcadeFormMoneyInput;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String symbol;
        int i = this.$r8$classId;
        ArcadeFormMoneyInput arcadeFormMoneyInput = this.f$0;
        boolean z = false;
        int i2 = 2;
        switch (i) {
            case 0:
                ArcadeFormMoneyInput arcadeFormMoneyInput2 = this.f$0;
                FormBlocker.Element.MoneyInputElement moneyInputElement = arcadeFormMoneyInput2.element;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CurrencyConfig currencyConfig = arcadeFormMoneyInput2.currencyConfig;
                    Object[] objArr = {moneyInputElement.prefill_amount};
                    boolean changedInstance = gapComposer.changedInstance(arcadeFormMoneyInput2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Object obj3 = rememberedValue;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0 = new RealGooglePayer$$ExternalSyntheticLambda0(arcadeFormMoneyInput2, 2);
                        gapComposer.updateRememberedValue(realGooglePayer$$ExternalSyntheticLambda0);
                        obj3 = realGooglePayer$$ExternalSyntheticLambda0;
                    }
                    MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj3, gapComposer, 0);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    ComposableLambdaImpl composableLambdaImpl = null;
                    boolean z2 = false;
                    Object obj4 = rememberedValue2;
                    if (rememberedValue2 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(mutableStateOf$default);
                        obj4 = mutableStateOf$default;
                    }
                    MutableState mutableState2 = (MutableState) obj4;
                    String str = (String) mutableState.getValue();
                    boolean changedInstance2 = gapComposer.changedInstance(arcadeFormMoneyInput2) | gapComposer.changed(mutableState);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1((Object) arcadeFormMoneyInput2, (Object) mutableState, (Object) mutableState2, (Continuation) (z2 ? 1 : 0), 22);
                        gapComposer.updateRememberedValue(realFidesmoClient$observeDeviceState$1);
                        rememberedValue3 = realFidesmoClient$observeDeviceState$1;
                    }
                    Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue3);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    String str2 = (String) mutableState.getValue();
                    String str3 = moneyInputElement.hint_text;
                    String str4 = moneyInputElement.label_text;
                    if (str4 == null) {
                        gapComposer.startReplaceGroup(-665198660);
                    } else {
                        gapComposer.startReplaceGroup(-665198659);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(729753874, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str4, 19), gapComposer);
                    }
                    gapComposer.end(false);
                    boolean changed = gapComposer.changed((String) mutableState.getValue());
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    Object obj5 = rememberedValue4;
                    if (changed || rememberedValue4 == neverEqualPolicy) {
                        MaskVisualTransformation maskVisualTransformation = new MaskVisualTransformation(EdgeEffectCompat.moneyFormatMask(currencyConfig, (String) mutableState.getValue()), new zzb(currencyConfig));
                        gapComposer.updateRememberedValue(maskVisualTransformation);
                        obj5 = maskVisualTransformation;
                    }
                    MaskVisualTransformation maskVisualTransformation2 = (MaskVisualTransformation) obj5;
                    KeyboardOptions keyboardOptions = KeyboardOptions.Default;
                    KeyboardOptions m359copyINvB4aQ$default = KeyboardOptions.m359copyINvB4aQ$default(3, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
                    InputState inputState = ((String) mutableState2.getValue()) != null ? InputState.ERROR : InputState.DEFAULT;
                    boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changedInstance(arcadeFormMoneyInput2);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    Object obj6 = rememberedValue5;
                    if (changed2 || rememberedValue5 == neverEqualPolicy) {
                        GLSceneScope$$ExternalSyntheticLambda10 gLSceneScope$$ExternalSyntheticLambda10 = new GLSceneScope$$ExternalSyntheticLambda10(9, arcadeFormMoneyInput2, mutableState);
                        gapComposer.updateRememberedValue(gLSceneScope$$ExternalSyntheticLambda10);
                        obj6 = gLSceneScope$$ExternalSyntheticLambda10;
                    }
                    InputFieldKt.InputField(str2, (Function1) obj6, fillMaxWidth, inputState, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-1313852389, new ArcadeFormMoneyInput$$ExternalSyntheticLambda0(arcadeFormMoneyInput2, i2, z ? 1 : 0), gapComposer), Expect_jvmKt.rememberComposableLambda(829631772, new HeroTagViewKt$$ExternalSyntheticLambda12(17, mutableState2), gapComposer), Expect_jvmKt.rememberComposableLambda(615303621, new HeroCardViewKt$$ExternalSyntheticLambda28(4, mutableState2), gapComposer), str3, m359copyINvB4aQ$default, (KeyboardActions) null, maskVisualTransformation2, gapComposer, 14352768, 0, 1024);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                arcadeFormMoneyInput.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (arcadeFormMoneyInput.denominationOption == FormBlocker.Element.MoneyInputElement.DenominationOption.CENTS) {
                        symbol = arcadeFormMoneyInput.fractionalValuePrefix;
                    } else {
                        CurrencyCode currencyCode = arcadeFormMoneyInput.element.currency_code;
                        currencyCode.getClass();
                        symbol = Moneys.symbol(currencyCode);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, symbol, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeFormMoneyInput$$ExternalSyntheticLambda0(ArcadeFormMoneyInput arcadeFormMoneyInput, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = arcadeFormMoneyInput;
    }
}
