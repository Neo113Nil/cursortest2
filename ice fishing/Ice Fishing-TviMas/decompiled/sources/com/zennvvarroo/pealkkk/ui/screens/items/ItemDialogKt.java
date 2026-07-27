package com.zennvvarroo.pealkkk.ui.screens.items;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldImplKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.zennvvarroo.pealkkk.data.model.ItemCategory;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import com.zennvvarroo.pealkkk.util.MappersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ItemDialog.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0015X\u008a\u008e\u0002"}, d2 = {"ItemDialog", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "onDismiss", "Lkotlin/Function0;", "onSaved", "Lkotlin/Function1;", "", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "shelves", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "items", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "shelfIdx", "", "title", "", "qty", "minQ", "catIdx", "container", "note"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemDialogKt {
    public static final void ItemDialog(final MainViewModel mainViewModel, final Function0<Unit> onDismiss, final Function1<? super Boolean, Unit> onSaved, Composer composer, final int i) {
        Object obj;
        String selectedShelfId;
        String note;
        String str;
        ItemCategory itemCategory;
        String str2;
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSaved, "onSaved");
        Composer startRestartGroup = composer.startRestartGroup(-296021173);
        int i2 = -1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-296021173, i, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemDialog (ItemDialog.kt:42)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(mainViewModel.getUiState(), null, startRestartGroup, 8, 1);
        final State collectAsState2 = SnapshotStateKt.collectAsState(mainViewModel.getShelves(), null, startRestartGroup, 8, 1);
        Iterator<T> it = ItemDialog$lambda$2(SnapshotStateKt.collectAsState(mainViewModel.getItems(), null, startRestartGroup, 8, 1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((StoredItem) obj).getId(), ItemDialog$lambda$0(collectAsState).getEditingItemId())) {
                    break;
                }
            }
        }
        final StoredItem storedItem = (StoredItem) obj;
        String str3 = "";
        if ((storedItem == null || (selectedShelfId = storedItem.getShelfId()) == null) && (selectedShelfId = ItemDialog$lambda$0(collectAsState).getSelectedShelfId()) == null) {
            StorageShelf storageShelf = (StorageShelf) CollectionsKt.firstOrNull((List) ItemDialog$lambda$1(collectAsState2));
            selectedShelfId = storageShelf != null ? storageShelf.getId() : null;
            if (selectedShelfId == null) {
                selectedShelfId = "";
            }
        }
        startRestartGroup.startReplaceableGroup(507001246);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            Iterator<StorageShelf> it2 = ItemDialog$lambda$1(collectAsState2).iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(it2.next().getId(), selectedShelfId)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(RangesKt.coerceAtLeast(i2, 0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507004723);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            if (storedItem == null || (str2 = storedItem.getTitle()) == null) {
                str2 = "";
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507006818);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(storedItem != null ? storedItem.getQuantity() : 1), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState3 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507009417);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(storedItem != null ? storedItem.getMinimumQuantity() : 0), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        final MutableState mutableState4 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507012325);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            ItemCategory[] values = ItemCategory.values();
            if (storedItem == null || (itemCategory = storedItem.getCategory()) == null) {
                itemCategory = ItemCategory.OTHER;
            }
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(ArraysKt.indexOf(values, itemCategory)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        final MutableState mutableState5 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507016151);
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            if (storedItem == null || (str = storedItem.getContainer()) == null) {
                str = "";
            }
            rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        final MutableState mutableState6 = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507018386);
        Object rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            if (storedItem != null && (note = storedItem.getNote()) != null) {
                str3 = note;
            }
            rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str3, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue7);
        }
        final MutableState mutableState7 = (MutableState) rememberedValue7;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(507020457);
        if (ItemDialog$lambda$1(collectAsState2).isEmpty()) {
            AndroidAlertDialog_androidKt.m1225AlertDialogOix01E0(onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, 2133876318, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2133876318, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemDialog.<anonymous> (ItemDialog.kt:63)");
                    }
                    ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ItemDialogKt.INSTANCE.m6216getLambda1$app_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, null, null, ComposableSingletons$ItemDialogKt.INSTANCE.m6217getLambda2$app_release(), ComposableSingletons$ItemDialogKt.INSTANCE.m6218getLambda3$app_release(), null, ColorKt.getPeakPanel(), 0L, 0L, 0L, 0.0f, null, startRestartGroup, ((i >> 3) & 14) | 102432816, 0, 16028);
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ItemDialogKt.ItemDialog(MainViewModel.this, onDismiss, onSaved, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            return;
        }
        startRestartGroup.endReplaceableGroup();
        AndroidAlertDialog_androidKt.m1225AlertDialogOix01E0(onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -1622195197, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1622195197, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemDialog.<anonymous> (ItemDialog.kt:149)");
                    }
                    final StoredItem storedItem2 = StoredItem.this;
                    final MainViewModel mainViewModel2 = mainViewModel;
                    final Function1<Boolean, Unit> function1 = onSaved;
                    final State<List<StorageShelf>> state = collectAsState2;
                    final MutableState<Integer> mutableState8 = mutableState;
                    final MutableState<String> mutableState9 = mutableState3;
                    final MutableState<String> mutableState10 = mutableState4;
                    final MutableState<Integer> mutableState11 = mutableState5;
                    final MutableState<String> mutableState12 = mutableState2;
                    final MutableState<String> mutableState13 = mutableState6;
                    final MutableState<String> mutableState14 = mutableState7;
                    ButtonKt.TextButton(new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            List ItemDialog$lambda$1;
                            int ItemDialog$lambda$6;
                            List ItemDialog$lambda$12;
                            String ItemDialog$lambda$122;
                            String ItemDialog$lambda$15;
                            int ItemDialog$lambda$18;
                            String ItemDialog$lambda$9;
                            String ItemDialog$lambda$21;
                            String ItemDialog$lambda$24;
                            String ItemDialog$lambda$92;
                            String ItemDialog$lambda$212;
                            String ItemDialog$lambda$242;
                            ItemDialog$lambda$1 = ItemDialogKt.ItemDialog$lambda$1(state);
                            ItemDialog$lambda$6 = ItemDialogKt.ItemDialog$lambda$6(mutableState8);
                            ItemDialog$lambda$12 = ItemDialogKt.ItemDialog$lambda$1(state);
                            String id = ((StorageShelf) ItemDialog$lambda$1.get(RangesKt.coerceIn(ItemDialog$lambda$6, 0, ItemDialog$lambda$12.size() - 1))).getId();
                            ItemDialog$lambda$122 = ItemDialogKt.ItemDialog$lambda$12(mutableState9);
                            Integer intOrNull = StringsKt.toIntOrNull(ItemDialog$lambda$122);
                            int intValue = intOrNull != null ? intOrNull.intValue() : 0;
                            ItemDialog$lambda$15 = ItemDialogKt.ItemDialog$lambda$15(mutableState10);
                            Integer intOrNull2 = StringsKt.toIntOrNull(ItemDialog$lambda$15);
                            int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                            ItemCategory[] values2 = ItemCategory.values();
                            ItemDialog$lambda$18 = ItemDialogKt.ItemDialog$lambda$18(mutableState11);
                            ItemCategory itemCategory2 = values2[RangesKt.coerceIn(ItemDialog$lambda$18, 0, ItemCategory.values().length - 1)];
                            StoredItem storedItem3 = StoredItem.this;
                            if (storedItem3 == null) {
                                MainViewModel mainViewModel3 = mainViewModel2;
                                ItemDialog$lambda$92 = ItemDialogKt.ItemDialog$lambda$9(mutableState12);
                                ItemDialog$lambda$212 = ItemDialogKt.ItemDialog$lambda$21(mutableState13);
                                ItemDialog$lambda$242 = ItemDialogKt.ItemDialog$lambda$24(mutableState14);
                                mainViewModel3.addItem(id, ItemDialog$lambda$92, intValue, intValue2, itemCategory2, ItemDialog$lambda$212, ItemDialog$lambda$242);
                                function1.invoke(true);
                                return;
                            }
                            MainViewModel mainViewModel4 = mainViewModel2;
                            String id2 = storedItem3.getId();
                            ItemDialog$lambda$9 = ItemDialogKt.ItemDialog$lambda$9(mutableState12);
                            ItemDialog$lambda$21 = ItemDialogKt.ItemDialog$lambda$21(mutableState13);
                            ItemDialog$lambda$24 = ItemDialogKt.ItemDialog$lambda$24(mutableState14);
                            mainViewModel4.updateItem(id2, id, ItemDialog$lambda$9, intValue, intValue2, itemCategory2, ItemDialog$lambda$21, ItemDialog$lambda$24);
                            function1.invoke(false);
                        }
                    }, null, false, null, null, null, null, null, null, ComposableSingletons$ItemDialogKt.INSTANCE.m6219getLambda4$app_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1204306495, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1204306495, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemDialog.<anonymous> (ItemDialog.kt:164)");
                }
                ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ItemDialogKt.INSTANCE.m6220getLambda5$app_release(), composer2, 805306368, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), null, ComposableLambdaKt.composableLambda(startRestartGroup, -786417793, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$5
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-786417793, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemDialog.<anonymous> (ItemDialog.kt:73)");
                }
                TextKt.m2125Text4IGK_g(StoredItem.this == null ? "New Item" : "Edit Item", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), ComposableLambdaKt.composableLambda(startRestartGroup, 1570010206, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                List ItemDialog$lambda$1;
                int ItemDialog$lambda$6;
                String ItemDialog$lambda$9;
                String ItemDialog$lambda$12;
                String ItemDialog$lambda$15;
                int ItemDialog$lambda$18;
                String ItemDialog$lambda$21;
                String ItemDialog$lambda$24;
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1570010206, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemDialog.<anonymous> (ItemDialog.kt:75)");
                    }
                    Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null));
                    State<List<StorageShelf>> state = collectAsState2;
                    final MutableState<Integer> mutableState8 = mutableState;
                    final MutableState<String> mutableState9 = mutableState2;
                    final MutableState<String> mutableState10 = mutableState3;
                    final MutableState<String> mutableState11 = mutableState4;
                    final MutableState<Integer> mutableState12 = mutableState5;
                    final MutableState<String> mutableState13 = mutableState6;
                    final MutableState<String> mutableState14 = mutableState7;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(imePadding);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    CommonKt.FieldLabel("Shelf", composer2, 6);
                    ItemDialog$lambda$1 = ItemDialogKt.ItemDialog$lambda$1(state);
                    List list = ItemDialog$lambda$1;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((StorageShelf) it3.next()).getTitle());
                    }
                    ArrayList arrayList2 = arrayList;
                    ItemDialog$lambda$6 = ItemDialogKt.ItemDialog$lambda$6(mutableState8);
                    long peakCyan = ColorKt.getPeakCyan();
                    composer2.startReplaceableGroup(888643793);
                    Object rememberedValue8 = composer2.rememberedValue();
                    if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = (Function1) new Function1<Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i5) {
                                ItemDialogKt.ItemDialog$lambda$7(mutableState8, i5);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    composer2.endReplaceableGroup();
                    CommonKt.m6204EnumChipsFNF3uiM(arrayList2, ItemDialog$lambda$6, peakCyan, (Function1) rememberedValue8, composer2, 3464);
                    float f = 10;
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    CommonKt.FieldLabel("Title", composer2, 6);
                    ItemDialog$lambda$9 = ItemDialogKt.ItemDialog$lambda$9(mutableState9);
                    composer2.startReplaceableGroup(888650990);
                    Object rememberedValue9 = composer2.rememberedValue();
                    if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                invoke2(str4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                mutableState9.setValue(it4);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    composer2.endReplaceableGroup();
                    float f2 = 12;
                    OutlinedTextFieldKt.OutlinedTextField(ItemDialog$lambda$9, (Function1<? super String, Unit>) rememberedValue9, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2)), (TextFieldColors) null, composer2, 432, 12582912, 0, 6160376);
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    Arrangement.HorizontalOrVertical m471spacedBy0680j_4 = Arrangement.INSTANCE.m471spacedBy0680j_4(Dp.m5734constructorimpl(f));
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m471spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(weight$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl3 = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl3.getInserting() || !Intrinsics.areEqual(m2937constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m2937constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m2937constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    CommonKt.FieldLabel("Quantity", composer2, 6);
                    ItemDialog$lambda$12 = ItemDialogKt.ItemDialog$lambda$12(mutableState10);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m5460getNumberPjHm6EE(), 0, null, 27, null);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    RoundedCornerShape m832RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2));
                    composer2.startReplaceableGroup(-18383662);
                    Object rememberedValue10 = composer2.rememberedValue();
                    if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$4$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                invoke2(str4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String str4) {
                                Intrinsics.checkNotNullParameter(str4, "new");
                                MutableState<String> mutableState15 = mutableState10;
                                String str5 = str4;
                                StringBuilder sb = new StringBuilder();
                                int length = str5.length();
                                for (int i5 = 0; i5 < length; i5++) {
                                    char charAt = str5.charAt(i5);
                                    if (Character.isDigit(charAt)) {
                                        sb.append(charAt);
                                    }
                                }
                                String sb2 = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                                mutableState15.setValue(StringsKt.take(sb2, 6));
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(ItemDialog$lambda$12, (Function1<? super String, Unit>) rememberedValue10, fillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m832RoundedCornerShape0680j_4, (TextFieldColors) null, composer2, 432, 12779520, 0, 6127608);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(weight$default2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl4 = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl4.getInserting() || !Intrinsics.areEqual(m2937constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m2937constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m2937constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    modifierMaterializerOf4.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    CommonKt.FieldLabel("Minimum", composer2, 6);
                    ItemDialog$lambda$15 = ItemDialogKt.ItemDialog$lambda$15(mutableState11);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m5460getNumberPjHm6EE(), 0, null, 27, null);
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    RoundedCornerShape m832RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2));
                    composer2.startReplaceableGroup(-18364493);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$4$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                invoke2(str4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String str4) {
                                Intrinsics.checkNotNullParameter(str4, "new");
                                MutableState<String> mutableState15 = mutableState11;
                                String str5 = str4;
                                StringBuilder sb = new StringBuilder();
                                int length = str5.length();
                                for (int i5 = 0; i5 < length; i5++) {
                                    char charAt = str5.charAt(i5);
                                    if (Character.isDigit(charAt)) {
                                        sb.append(charAt);
                                    }
                                }
                                String sb2 = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                                mutableState15.setValue(StringsKt.take(sb2, 6));
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(ItemDialog$lambda$15, (Function1<? super String, Unit>) rememberedValue11, fillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions2, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) m832RoundedCornerShape0680j_42, (TextFieldColors) null, composer2, 432, 12779520, 0, 6127608);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    CommonKt.FieldLabel("Category", composer2, 6);
                    ItemCategory[] values2 = ItemCategory.values();
                    ArrayList arrayList3 = new ArrayList(values2.length);
                    for (ItemCategory itemCategory2 : values2) {
                        arrayList3.add(MappersKt.categoryLabel(itemCategory2));
                    }
                    ArrayList arrayList4 = arrayList3;
                    ItemDialog$lambda$18 = ItemDialogKt.ItemDialog$lambda$18(mutableState12);
                    long peakCyan2 = ColorKt.getPeakCyan();
                    composer2.startReplaceableGroup(888709487);
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = (Function1) new Function1<Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i5) {
                                ItemDialogKt.ItemDialog$lambda$19(mutableState12, i5);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    composer2.endReplaceableGroup();
                    CommonKt.m6204EnumChipsFNF3uiM(arrayList4, ItemDialog$lambda$18, peakCyan2, (Function1) rememberedValue12, composer2, 3464);
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    CommonKt.FieldLabel(TextFieldImplKt.ContainerId, composer2, 6);
                    ItemDialog$lambda$21 = ItemDialogKt.ItemDialog$lambda$21(mutableState13);
                    composer2.startReplaceableGroup(888716882);
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$7$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                invoke2(str4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                mutableState13.setValue(it4);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(ItemDialog$lambda$21, (Function1<? super String, Unit>) rememberedValue13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2)), (TextFieldColors) null, composer2, 432, 12582912, 0, 6160376);
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    CommonKt.FieldLabel("Note", composer2, 6);
                    ItemDialog$lambda$24 = ItemDialogKt.ItemDialog$lambda$24(mutableState14);
                    composer2.startReplaceableGroup(888728845);
                    Object rememberedValue14 = composer2.rememberedValue();
                    if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$6$1$8$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                invoke2(str4);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                mutableState14.setValue(it4);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(ItemDialog$lambda$24, (Function1<? super String, Unit>) rememberedValue14, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2)), (TextFieldColors) null, composer2, 432, 0, 0, 6291448);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ColorKt.getPeakPanel(), 0L, ColorKt.getPeakWhite(), ColorKt.getPeakWhite(), 0.0f, null, startRestartGroup, ((i >> 3) & 14) | 102435888, 54, 12948);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt$ItemDialog$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    ItemDialogKt.ItemDialog(MainViewModel.this, onDismiss, onSaved, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ItemDialog$lambda$6(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemDialog$lambda$7(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ItemDialog$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ItemDialog$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ItemDialog$lambda$15(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ItemDialog$lambda$18(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemDialog$lambda$19(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ItemDialog$lambda$21(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ItemDialog$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final AppUiState ItemDialog$lambda$0(State<AppUiState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StorageShelf> ItemDialog$lambda$1(State<? extends List<StorageShelf>> state) {
        return state.getValue();
    }

    private static final List<StoredItem> ItemDialog$lambda$2(State<? extends List<StoredItem>> state) {
        return state.getValue();
    }
}
