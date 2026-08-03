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
final class MainActivityKt$AddFixDialog$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $area$delegate;
    final /* synthetic */ MutableState<String> $due$delegate;
    final /* synthetic */ MutableState<String> $interval$delegate;
    final /* synthetic */ Function1<FixTask, Unit> $onSave;
    final /* synthetic */ MutableState<String> $title$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MainActivityKt$AddFixDialog$1(Function1<? super FixTask, Unit> function1, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4) {
        this.$onSave = function1;
        this.$title$delegate = mutableState;
        this.$area$delegate = mutableState2;
        this.$interval$delegate = mutableState3;
        this.$due$delegate = mutableState4;
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

    public final void invoke(ColumnScope EntryDialog, Composer composer, int i) {
        String AddFixDialog$lambda$114;
        String AddFixDialog$lambda$117;
        String AddFixDialog$lambda$120;
        String AddFixDialog$lambda$123;
        String AddFixDialog$lambda$1142;
        Intrinsics.checkNotNullParameter(EntryDialog, "$this$EntryDialog");
        ComposerKt.sourceInformation(composer, "C751@32075L14,751@32049L40,752@32118L13,752@32098L33,753@32177L47,753@32140L84,754@32259L69,754@32233L95,755@32378L175,755@32337L216:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1966900207, i, -1, "com.emeraldpulse.kyra.AddFixDialog.<anonymous> (MainActivity.kt:751)");
        }
        AddFixDialog$lambda$114 = MainActivityKt.AddFixDialog$lambda$114(this.$title$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState = this.$title$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddFixDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MainActivityKt$AddFixDialog$1.invoke$lambda$1$lambda$0(MutableState.this, (String) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Fix title", AddFixDialog$lambda$114, (Function1) rememberedValue, composer, 390);
        AddFixDialog$lambda$117 = MainActivityKt.AddFixDialog$lambda$117(this.$area$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState2 = this.$area$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddFixDialog$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = MainActivityKt$AddFixDialog$1.invoke$lambda$3$lambda$2(MutableState.this, (String) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Area", AddFixDialog$lambda$117, (Function1) rememberedValue2, composer, 390);
        AddFixDialog$lambda$120 = MainActivityKt.AddFixDialog$lambda$120(this.$interval$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState3 = this.$interval$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddFixDialog$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = MainActivityKt$AddFixDialog$1.invoke$lambda$5$lambda$4(MutableState.this, (String) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Repeat every days", AddFixDialog$lambda$120, (Function1) rememberedValue3, composer, 390);
        AddFixDialog$lambda$123 = MainActivityKt.AddFixDialog$lambda$123(this.$due$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState4 = this.$due$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddFixDialog$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = MainActivityKt$AddFixDialog$1.invoke$lambda$8$lambda$7(MutableState.this, (String) obj);
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Due in days", AddFixDialog$lambda$123, (Function1) rememberedValue4, composer, 390);
        AddFixDialog$lambda$1142 = MainActivityKt.AddFixDialog$lambda$114(this.$title$delegate);
        boolean z = !StringsKt.isBlank(AddFixDialog$lambda$1142);
        composer.startReplaceGroup(-1224400529);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        boolean changed = composer.changed(this.$onSave);
        final Function1<FixTask, Unit> function1 = this.$onSave;
        final MutableState<String> mutableState5 = this.$title$delegate;
        final MutableState<String> mutableState6 = this.$area$delegate;
        final MutableState<String> mutableState7 = this.$interval$delegate;
        final MutableState<String> mutableState8 = this.$due$delegate;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddFixDialog$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$11$lambda$10;
                    invoke$lambda$11$lambda$10 = MainActivityKt$AddFixDialog$1.invoke$lambda$11$lambda$10(Function1.this, mutableState5, mutableState6, mutableState7, mutableState8);
                    return invoke$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        MainActivityKt.SaveButton(z, (Function0) rememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        String AddFixDialog$lambda$114;
        String AddFixDialog$lambda$117;
        String AddFixDialog$lambda$120;
        String AddFixDialog$lambda$123;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        AddFixDialog$lambda$114 = MainActivityKt.AddFixDialog$lambda$114(mutableState);
        String obj = StringsKt.trim((CharSequence) AddFixDialog$lambda$114).toString();
        AddFixDialog$lambda$117 = MainActivityKt.AddFixDialog$lambda$117(mutableState2);
        String str = AddFixDialog$lambda$117;
        if (StringsKt.isBlank(str)) {
            str = "General";
        }
        String str2 = str;
        AddFixDialog$lambda$120 = MainActivityKt.AddFixDialog$lambda$120(mutableState3);
        Integer intOrNull = StringsKt.toIntOrNull(AddFixDialog$lambda$120);
        int intValue = intOrNull != null ? intOrNull.intValue() : 30;
        AddFixDialog$lambda$123 = MainActivityKt.AddFixDialog$lambda$123(mutableState4);
        Integer intOrNull2 = StringsKt.toIntOrNull(AddFixDialog$lambda$123);
        function1.invoke(new FixTask(uuid, obj, str2, intValue, intOrNull2 != null ? intOrNull2.intValue() : 7, "Custom"));
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
            if (Character.isDigit(charAt) || charAt == '-') {
                sb.append(charAt);
            }
        }
        mutableState.setValue(StringsKt.take(sb.toString(), 4));
        return Unit.INSTANCE;
    }
}
