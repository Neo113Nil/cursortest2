package com.emeraldpulse.kyra;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$AddCostDialog$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $amount$delegate;
    final /* synthetic */ MutableState<String> $area$delegate;
    final /* synthetic */ MutableState<String> $note$delegate;
    final /* synthetic */ Function1<CostNote, Unit> $onSave;
    final /* synthetic */ MutableState<String> $title$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MainActivityKt$AddCostDialog$1(Function1<? super CostNote, Unit> function1, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4) {
        this.$onSave = function1;
        this.$title$delegate = mutableState;
        this.$area$delegate = mutableState2;
        this.$amount$delegate = mutableState3;
        this.$note$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ColumnScope EntryDialog, Composer composer, int i) {
        String AddCostDialog$lambda$127;
        String AddCostDialog$lambda$130;
        String AddCostDialog$lambda$133;
        String AddCostDialog$lambda$136;
        String AddCostDialog$lambda$1272;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String AddCostDialog$lambda$1332;
        Intrinsics.checkNotNullParameter(EntryDialog, "$this$EntryDialog");
        ComposerKt.sourceInformation(composer, "C768@32925L14,768@32903L36,769@32968L13,769@32948L33,770@33022L72,770@32990L104,771@33123L13,771@33103L33,772@33209L251,772@33145L315:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(616373289, i, -1, "com.emeraldpulse.kyra.AddCostDialog.<anonymous> (MainActivity.kt:768)");
        }
        AddCostDialog$lambda$127 = MainActivityKt.AddCostDialog$lambda$127(this.$title$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState = this.$title$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddCostDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MainActivityKt$AddCostDialog$1.invoke$lambda$1$lambda$0(MutableState.this, (String) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Title", AddCostDialog$lambda$127, (Function1) rememberedValue2, composer, 390);
        AddCostDialog$lambda$130 = MainActivityKt.AddCostDialog$lambda$130(this.$area$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState2 = this.$area$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddCostDialog$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = MainActivityKt$AddCostDialog$1.invoke$lambda$3$lambda$2(MutableState.this, (String) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Area", AddCostDialog$lambda$130, (Function1) rememberedValue3, composer, 390);
        AddCostDialog$lambda$133 = MainActivityKt.AddCostDialog$lambda$133(this.$amount$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState3 = this.$amount$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddCostDialog$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = MainActivityKt$AddCostDialog$1.invoke$lambda$6$lambda$5(MutableState.this, (String) obj);
                    return invoke$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Amount dollars", AddCostDialog$lambda$133, (Function1) rememberedValue4, composer, 390);
        AddCostDialog$lambda$136 = MainActivityKt.AddCostDialog$lambda$136(this.$note$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState4 = this.$note$delegate;
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddCostDialog$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = MainActivityKt$AddCostDialog$1.invoke$lambda$8$lambda$7(MutableState.this, (String) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Note", AddCostDialog$lambda$136, (Function1) rememberedValue5, composer, 390);
        AddCostDialog$lambda$1272 = MainActivityKt.AddCostDialog$lambda$127(this.$title$delegate);
        if (!StringsKt.isBlank(AddCostDialog$lambda$1272)) {
            AddCostDialog$lambda$1332 = MainActivityKt.AddCostDialog$lambda$133(this.$amount$delegate);
            if (!StringsKt.isBlank(AddCostDialog$lambda$1332)) {
                z = true;
                composer.startReplaceGroup(-1224400529);
                ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
                changed = composer.changed(this.$onSave);
                final Function1<CostNote, Unit> function1 = this.$onSave;
                final MutableState<String> mutableState5 = this.$amount$delegate;
                final MutableState<String> mutableState6 = this.$title$delegate;
                final MutableState<String> mutableState7 = this.$area$delegate;
                final MutableState<String> mutableState8 = this.$note$delegate;
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddCostDialog$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$12$lambda$11;
                            invoke$lambda$12$lambda$11 = MainActivityKt$AddCostDialog$1.invoke$lambda$12$lambda$11(Function1.this, mutableState5, mutableState6, mutableState7, mutableState8);
                            return invoke$lambda$12$lambda$11;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                MainActivityKt.SaveButton(z, (Function0) rememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        z = false;
        composer.startReplaceGroup(-1224400529);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        changed = composer.changed(this.$onSave);
        final Function1 function12 = this.$onSave;
        final MutableState mutableState52 = this.$amount$delegate;
        final MutableState mutableState62 = this.$title$delegate;
        final MutableState mutableState72 = this.$area$delegate;
        final MutableState mutableState82 = this.$note$delegate;
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddCostDialog$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$12$lambda$11;
                invoke$lambda$12$lambda$11 = MainActivityKt$AddCostDialog$1.invoke$lambda$12$lambda$11(Function1.this, mutableState52, mutableState62, mutableState72, mutableState82);
                return invoke$lambda$12$lambda$11;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        MainActivityKt.SaveButton(z, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        String AddCostDialog$lambda$133;
        String AddCostDialog$lambda$127;
        String AddCostDialog$lambda$130;
        String AddCostDialog$lambda$136;
        String str;
        AddCostDialog$lambda$133 = MainActivityKt.AddCostDialog$lambda$133(mutableState);
        Float floatOrNull = StringsKt.toFloatOrNull(AddCostDialog$lambda$133);
        int roundToInt = MathKt.roundToInt((floatOrNull != null ? floatOrNull.floatValue() : 0.0f) * 100);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        AddCostDialog$lambda$127 = MainActivityKt.AddCostDialog$lambda$127(mutableState2);
        String obj = StringsKt.trim((CharSequence) AddCostDialog$lambda$127).toString();
        AddCostDialog$lambda$130 = MainActivityKt.AddCostDialog$lambda$130(mutableState3);
        String str2 = AddCostDialog$lambda$130;
        if (StringsKt.isBlank(str2)) {
            str2 = "General";
        }
        String str3 = str2;
        AddCostDialog$lambda$136 = MainActivityKt.AddCostDialog$lambda$136(mutableState4);
        String str4 = AddCostDialog$lambda$136;
        if (StringsKt.isBlank(str4)) {
            str4 = "Saved maintenance expense.";
        }
        str = MainActivityKt.today();
        function1.invoke(new CostNote(uuid, obj, str3, roundToInt, str4, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        mutableState.setValue(StringsKt.take(sb.toString(), 8));
        return Unit.INSTANCE;
    }
}
