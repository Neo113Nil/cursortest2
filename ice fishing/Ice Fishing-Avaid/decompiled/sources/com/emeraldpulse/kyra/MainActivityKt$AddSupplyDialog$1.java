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
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$AddSupplyDialog$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $area$delegate;
    final /* synthetic */ MutableState<String> $minimum$delegate;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ Function1<Supply, Unit> $onSave;
    final /* synthetic */ MutableState<String> $quantity$delegate;
    final /* synthetic */ MutableState<String> $unit$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MainActivityKt$AddSupplyDialog$1(Function1<? super Supply, Unit> function1, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5) {
        this.$onSave = function1;
        this.$name$delegate = mutableState;
        this.$area$delegate = mutableState2;
        this.$quantity$delegate = mutableState3;
        this.$minimum$delegate = mutableState4;
        this.$unit$delegate = mutableState5;
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
    public static final Unit invoke$lambda$10$lambda$9(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope EntryDialog, Composer composer, int i) {
        String AddSupplyDialog$lambda$98;
        String AddSupplyDialog$lambda$101;
        String AddSupplyDialog$lambda$104;
        String AddSupplyDialog$lambda$107;
        String AddSupplyDialog$lambda$110;
        String AddSupplyDialog$lambda$982;
        Intrinsics.checkNotNullParameter(EntryDialog, "$this$EntryDialog");
        ComposerKt.sourceInformation(composer, "C733@31192L13,733@31165L40,734@31234L13,734@31214L33,735@31284L47,735@31256L75,736@31366L46,736@31340L72,737@31441L13,737@31421L33,738@31503L190,738@31463L230:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1053103563, i, -1, "com.emeraldpulse.kyra.AddSupplyDialog.<anonymous> (MainActivity.kt:733)");
        }
        AddSupplyDialog$lambda$98 = MainActivityKt.AddSupplyDialog$lambda$98(this.$name$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState = this.$name$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddSupplyDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MainActivityKt$AddSupplyDialog$1.invoke$lambda$1$lambda$0(MutableState.this, (String) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Supply name", AddSupplyDialog$lambda$98, (Function1) rememberedValue, composer, 390);
        AddSupplyDialog$lambda$101 = MainActivityKt.AddSupplyDialog$lambda$101(this.$area$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState2 = this.$area$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddSupplyDialog$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = MainActivityKt$AddSupplyDialog$1.invoke$lambda$3$lambda$2(MutableState.this, (String) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Area", AddSupplyDialog$lambda$101, (Function1) rememberedValue2, composer, 390);
        AddSupplyDialog$lambda$104 = MainActivityKt.AddSupplyDialog$lambda$104(this.$quantity$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState3 = this.$quantity$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddSupplyDialog$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = MainActivityKt$AddSupplyDialog$1.invoke$lambda$5$lambda$4(MutableState.this, (String) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Quantity", AddSupplyDialog$lambda$104, (Function1) rememberedValue3, composer, 390);
        AddSupplyDialog$lambda$107 = MainActivityKt.AddSupplyDialog$lambda$107(this.$minimum$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState4 = this.$minimum$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddSupplyDialog$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = MainActivityKt$AddSupplyDialog$1.invoke$lambda$8$lambda$7(MutableState.this, (String) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Minimum", AddSupplyDialog$lambda$107, (Function1) rememberedValue4, composer, 390);
        AddSupplyDialog$lambda$110 = MainActivityKt.AddSupplyDialog$lambda$110(this.$unit$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState5 = this.$unit$delegate;
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddSupplyDialog$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = MainActivityKt$AddSupplyDialog$1.invoke$lambda$10$lambda$9(MutableState.this, (String) obj);
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Unit", AddSupplyDialog$lambda$110, (Function1) rememberedValue5, composer, 390);
        AddSupplyDialog$lambda$982 = MainActivityKt.AddSupplyDialog$lambda$98(this.$name$delegate);
        boolean z = !StringsKt.isBlank(AddSupplyDialog$lambda$982);
        composer.startReplaceGroup(-1224400529);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        boolean changed = composer.changed(this.$onSave);
        final Function1<Supply, Unit> function1 = this.$onSave;
        final MutableState<String> mutableState6 = this.$name$delegate;
        final MutableState<String> mutableState7 = this.$area$delegate;
        final MutableState<String> mutableState8 = this.$quantity$delegate;
        final MutableState<String> mutableState9 = this.$minimum$delegate;
        final MutableState<String> mutableState10 = this.$unit$delegate;
        Object rememberedValue6 = composer.rememberedValue();
        if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddSupplyDialog$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$13;
                    invoke$lambda$14$lambda$13 = MainActivityKt$AddSupplyDialog$1.invoke$lambda$14$lambda$13(Function1.this, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10);
                    return invoke$lambda$14$lambda$13;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        MainActivityKt.SaveButton(z, (Function0) rememberedValue6, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String AddSupplyDialog$lambda$98;
        String AddSupplyDialog$lambda$101;
        String AddSupplyDialog$lambda$104;
        String AddSupplyDialog$lambda$107;
        String AddSupplyDialog$lambda$110;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        AddSupplyDialog$lambda$98 = MainActivityKt.AddSupplyDialog$lambda$98(mutableState);
        String obj = StringsKt.trim((CharSequence) AddSupplyDialog$lambda$98).toString();
        AddSupplyDialog$lambda$101 = MainActivityKt.AddSupplyDialog$lambda$101(mutableState2);
        String str = AddSupplyDialog$lambda$101;
        if (StringsKt.isBlank(str)) {
            str = "General";
        }
        String str2 = str;
        AddSupplyDialog$lambda$104 = MainActivityKt.AddSupplyDialog$lambda$104(mutableState3);
        Integer intOrNull = StringsKt.toIntOrNull(AddSupplyDialog$lambda$104);
        int intValue = intOrNull != null ? intOrNull.intValue() : 0;
        AddSupplyDialog$lambda$107 = MainActivityKt.AddSupplyDialog$lambda$107(mutableState4);
        Integer intOrNull2 = StringsKt.toIntOrNull(AddSupplyDialog$lambda$107);
        int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : 1;
        AddSupplyDialog$lambda$110 = MainActivityKt.AddSupplyDialog$lambda$110(mutableState5);
        String str3 = AddSupplyDialog$lambda$110;
        if (StringsKt.isBlank(str3)) {
            str3 = "pcs";
        }
        function1.invoke(new Supply(uuid, obj, str2, intValue, intValue2, str3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        mutableState.setValue(StringsKt.take(sb.toString(), 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        mutableState.setValue(StringsKt.take(sb.toString(), 3));
        return Unit.INSTANCE;
    }
}
