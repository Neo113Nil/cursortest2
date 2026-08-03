package com.emeraldpulse.kyra;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class MainActivityKt$AddRoomDialog$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $checks$delegate;
    final /* synthetic */ MutableState<String> $focus$delegate;
    final /* synthetic */ Function1<RoomChecklist, Unit> $onSave;
    final /* synthetic */ MutableState<String> $room$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MainActivityKt$AddRoomDialog$1(Function1<? super RoomChecklist, Unit> function1, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3) {
        this.$onSave = function1;
        this.$room$delegate = mutableState;
        this.$focus$delegate = mutableState2;
        this.$checks$delegate = mutableState3;
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
    public static final Unit invoke$lambda$5$lambda$4(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ColumnScope EntryDialog, Composer composer, int i) {
        String AddRoomDialog$lambda$88;
        String AddRoomDialog$lambda$91;
        String AddRoomDialog$lambda$94;
        String AddRoomDialog$lambda$882;
        boolean z;
        boolean changed;
        Object rememberedValue;
        String AddRoomDialog$lambda$942;
        Intrinsics.checkNotNullParameter(EntryDialog, "$this$EntryDialog");
        ComposerKt.sourceInformation(composer, "C716@30351L13,716@30326L38,717@30395L14,717@30373L36,718@30459L15,718@30418L56,719@30546L215,719@30483L278:MainActivity.kt#f5odrr");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(926321847, i, -1, "com.emeraldpulse.kyra.AddRoomDialog.<anonymous> (MainActivity.kt:716)");
        }
        AddRoomDialog$lambda$88 = MainActivityKt.AddRoomDialog$lambda$88(this.$room$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState = this.$room$delegate;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddRoomDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MainActivityKt$AddRoomDialog$1.invoke$lambda$1$lambda$0(MutableState.this, (String) obj);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Room name", AddRoomDialog$lambda$88, (Function1) rememberedValue2, composer, 390);
        AddRoomDialog$lambda$91 = MainActivityKt.AddRoomDialog$lambda$91(this.$focus$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState2 = this.$focus$delegate;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddRoomDialog$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = MainActivityKt$AddRoomDialog$1.invoke$lambda$3$lambda$2(MutableState.this, (String) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Focus", AddRoomDialog$lambda$91, (Function1) rememberedValue3, composer, 390);
        AddRoomDialog$lambda$94 = MainActivityKt.AddRoomDialog$lambda$94(this.$checks$delegate);
        composer.startReplaceGroup(5004770);
        ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
        final MutableState<String> mutableState3 = this.$checks$delegate;
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddRoomDialog$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = MainActivityKt$AddRoomDialog$1.invoke$lambda$5$lambda$4(MutableState.this, (String) obj);
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        MainActivityKt.Field("Checks, comma separated", AddRoomDialog$lambda$94, (Function1) rememberedValue4, composer, 390);
        AddRoomDialog$lambda$882 = MainActivityKt.AddRoomDialog$lambda$88(this.$room$delegate);
        if (!StringsKt.isBlank(AddRoomDialog$lambda$882)) {
            AddRoomDialog$lambda$942 = MainActivityKt.AddRoomDialog$lambda$94(this.$checks$delegate);
            if (!StringsKt.isBlank(AddRoomDialog$lambda$942)) {
                z = true;
                composer.startReplaceGroup(-1224400529);
                ComposerKt.sourceInformation(composer, "CC(remember):MainActivity.kt#9igjgp");
                changed = composer.changed(this.$onSave);
                final Function1<RoomChecklist, Unit> function1 = this.$onSave;
                final MutableState<String> mutableState4 = this.$room$delegate;
                final MutableState<String> mutableState5 = this.$focus$delegate;
                final MutableState<String> mutableState6 = this.$checks$delegate;
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddRoomDialog$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$10$lambda$9;
                            invoke$lambda$10$lambda$9 = MainActivityKt$AddRoomDialog$1.invoke$lambda$10$lambda$9(Function1.this, mutableState4, mutableState5, mutableState6);
                            return invoke$lambda$10$lambda$9;
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
        final MutableState mutableState42 = this.$room$delegate;
        final MutableState mutableState52 = this.$focus$delegate;
        final MutableState mutableState62 = this.$checks$delegate;
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function0() { // from class: com.emeraldpulse.kyra.MainActivityKt$AddRoomDialog$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$10$lambda$9;
                invoke$lambda$10$lambda$9 = MainActivityKt$AddRoomDialog$1.invoke$lambda$10$lambda$9(Function1.this, mutableState42, mutableState52, mutableState62);
                return invoke$lambda$10$lambda$9;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        MainActivityKt.SaveButton(z, (Function0) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        String AddRoomDialog$lambda$88;
        String AddRoomDialog$lambda$91;
        String AddRoomDialog$lambda$94;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        AddRoomDialog$lambda$88 = MainActivityKt.AddRoomDialog$lambda$88(mutableState);
        String obj = StringsKt.trim((CharSequence) AddRoomDialog$lambda$88).toString();
        AddRoomDialog$lambda$91 = MainActivityKt.AddRoomDialog$lambda$91(mutableState2);
        String str = AddRoomDialog$lambda$91;
        if (StringsKt.isBlank(str)) {
            str = "Weekly upkeep";
        }
        String str2 = str;
        AddRoomDialog$lambda$94 = MainActivityKt.AddRoomDialog$lambda$94(mutableState3);
        List split$default = StringsKt.split$default((CharSequence) AddRoomDialog$lambda$94, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(new RoomCheckItem(StringsKt.trim((CharSequence) it.next()).toString(), false));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!StringsKt.isBlank(((RoomCheckItem) obj2).getLabel())) {
                arrayList2.add(obj2);
            }
        }
        function1.invoke(new RoomChecklist(uuid, obj, str2, arrayList2));
        return Unit.INSTANCE;
    }
}
