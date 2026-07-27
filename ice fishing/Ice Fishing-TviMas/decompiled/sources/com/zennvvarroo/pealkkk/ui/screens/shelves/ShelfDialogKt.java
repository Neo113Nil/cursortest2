package com.zennvvarroo.pealkkk.ui.screens.shelves;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
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
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ShelfDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0015X\u008a\u008e\u0002"}, d2 = {"ShelfDialog", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "onDismiss", "Lkotlin/Function0;", "onSaved", "Lkotlin/Function1;", "", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "areas", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "shelves", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "areaIdx", "", "title", "", "note"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShelfDialogKt {
    public static final void ShelfDialog(final MainViewModel mainViewModel, final Function0<Unit> onDismiss, final Function1<? super Boolean, Unit> onSaved, Composer composer, final int i) {
        Object obj;
        String selectedAreaId;
        String note;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSaved, "onSaved");
        Composer startRestartGroup = composer.startRestartGroup(-1721204295);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1721204295, i, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialog (ShelfDialog.kt:36)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(mainViewModel.getUiState(), null, startRestartGroup, 8, 1);
        final State collectAsState2 = SnapshotStateKt.collectAsState(mainViewModel.getAreas(), null, startRestartGroup, 8, 1);
        Iterator<T> it = ShelfDialog$lambda$2(SnapshotStateKt.collectAsState(mainViewModel.getShelves(), null, startRestartGroup, 8, 1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((StorageShelf) obj).getId(), ShelfDialog$lambda$0(collectAsState).getEditingShelfId())) {
                    break;
                }
            }
        }
        final StorageShelf storageShelf = (StorageShelf) obj;
        String str2 = "";
        if ((storageShelf == null || (selectedAreaId = storageShelf.getAreaId()) == null) && (selectedAreaId = ShelfDialog$lambda$0(collectAsState).getSelectedAreaId()) == null) {
            StorageArea storageArea = (StorageArea) CollectionsKt.firstOrNull((List) ShelfDialog$lambda$1(collectAsState2));
            selectedAreaId = storageArea != null ? storageArea.getId() : null;
            if (selectedAreaId == null) {
                selectedAreaId = "";
            }
        }
        startRestartGroup.startReplaceableGroup(20117612);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            Iterator<StorageArea> it2 = ShelfDialog$lambda$1(collectAsState2).iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (Intrinsics.areEqual(it2.next().getId(), selectedAreaId)) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(RangesKt.coerceAtLeast(i2, 0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(20120996);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            if (storageShelf == null || (str = storageShelf.getTitle()) == null) {
                str = "";
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(20123107);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            if (storageShelf != null && (note = storageShelf.getNote()) != null) {
                str2 = note;
            }
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState3 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(20125174);
        if (ShelfDialog$lambda$1(collectAsState2).isEmpty()) {
            AndroidAlertDialog_androidKt.m1225AlertDialogOix01E0(onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -643036340, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$1
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
                        ComposerKt.traceEventStart(-643036340, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialog.<anonymous> (ShelfDialog.kt:53)");
                    }
                    ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ShelfDialogKt.INSTANCE.m6228getLambda1$app_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), null, null, null, ComposableSingletons$ShelfDialogKt.INSTANCE.m6229getLambda2$app_release(), ComposableSingletons$ShelfDialogKt.INSTANCE.m6230getLambda3$app_release(), null, ColorKt.getPeakPanel(), 0L, 0L, 0L, 0.0f, null, startRestartGroup, ((i >> 3) & 14) | 102432816, 0, 16028);
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$2
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
                        ShelfDialogKt.ShelfDialog(MainViewModel.this, onDismiss, onSaved, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            return;
        }
        startRestartGroup.endReplaceableGroup();
        AndroidAlertDialog_androidKt.m1225AlertDialogOix01E0(onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, 1592104561, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$3
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
                        ComposerKt.traceEventStart(1592104561, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialog.<anonymous> (ShelfDialog.kt:97)");
                    }
                    final StorageShelf storageShelf2 = StorageShelf.this;
                    final MainViewModel mainViewModel2 = mainViewModel;
                    final Function1<Boolean, Unit> function1 = onSaved;
                    final State<List<StorageArea>> state = collectAsState2;
                    final MutableState<Integer> mutableState4 = mutableState;
                    final MutableState<String> mutableState5 = mutableState2;
                    final MutableState<String> mutableState6 = mutableState3;
                    ButtonKt.TextButton(new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$3.1
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
                            List ShelfDialog$lambda$1;
                            int ShelfDialog$lambda$6;
                            List ShelfDialog$lambda$12;
                            String ShelfDialog$lambda$9;
                            String ShelfDialog$lambda$122;
                            String ShelfDialog$lambda$92;
                            String ShelfDialog$lambda$123;
                            ShelfDialog$lambda$1 = ShelfDialogKt.ShelfDialog$lambda$1(state);
                            ShelfDialog$lambda$6 = ShelfDialogKt.ShelfDialog$lambda$6(mutableState4);
                            ShelfDialog$lambda$12 = ShelfDialogKt.ShelfDialog$lambda$1(state);
                            String id = ((StorageArea) ShelfDialog$lambda$1.get(RangesKt.coerceIn(ShelfDialog$lambda$6, 0, ShelfDialog$lambda$12.size() - 1))).getId();
                            StorageShelf storageShelf3 = StorageShelf.this;
                            if (storageShelf3 == null) {
                                MainViewModel mainViewModel3 = mainViewModel2;
                                ShelfDialog$lambda$92 = ShelfDialogKt.ShelfDialog$lambda$9(mutableState5);
                                ShelfDialog$lambda$123 = ShelfDialogKt.ShelfDialog$lambda$12(mutableState6);
                                mainViewModel3.addShelf(id, ShelfDialog$lambda$92, ShelfDialog$lambda$123);
                                function1.invoke(true);
                                return;
                            }
                            MainViewModel mainViewModel4 = mainViewModel2;
                            String id2 = storageShelf3.getId();
                            ShelfDialog$lambda$9 = ShelfDialogKt.ShelfDialog$lambda$9(mutableState5);
                            ShelfDialog$lambda$122 = ShelfDialogKt.ShelfDialog$lambda$12(mutableState6);
                            mainViewModel4.updateShelf(id2, id, ShelfDialog$lambda$9, ShelfDialog$lambda$122);
                            function1.invoke(false);
                        }
                    }, null, false, null, null, null, null, null, null, ComposableSingletons$ShelfDialogKt.INSTANCE.m6231getLambda4$app_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ComposableLambdaKt.composableLambda(startRestartGroup, 2002714927, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$4
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
                    ComposerKt.traceEventStart(2002714927, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialog.<anonymous> (ShelfDialog.kt:109)");
                }
                ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ShelfDialogKt.INSTANCE.m6232getLambda5$app_release(), composer2, 805306368, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1881642003, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$5
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
                    ComposerKt.traceEventStart(-1881642003, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialog.<anonymous> (ShelfDialog.kt:63)");
                }
                TextKt.m2125Text4IGK_g(StorageShelf.this == null ? "New Shelf" : "Edit Shelf", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), ComposableLambdaKt.composableLambda(startRestartGroup, 471146828, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$6
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
                List ShelfDialog$lambda$1;
                int ShelfDialog$lambda$6;
                String ShelfDialog$lambda$9;
                String ShelfDialog$lambda$12;
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(471146828, i4, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialog.<anonymous> (ShelfDialog.kt:65)");
                    }
                    Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null));
                    State<List<StorageArea>> state = collectAsState2;
                    final MutableState<Integer> mutableState4 = mutableState;
                    final MutableState<String> mutableState5 = mutableState2;
                    final MutableState<String> mutableState6 = mutableState3;
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
                    CommonKt.FieldLabel("Area", composer2, 6);
                    ShelfDialog$lambda$1 = ShelfDialogKt.ShelfDialog$lambda$1(state);
                    List list = ShelfDialog$lambda$1;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((StorageArea) it3.next()).getTitle());
                    }
                    ArrayList arrayList2 = arrayList;
                    ShelfDialog$lambda$6 = ShelfDialogKt.ShelfDialog$lambda$6(mutableState4);
                    long peakCyan = ColorKt.getPeakCyan();
                    composer2.startReplaceableGroup(1782713953);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function1) new Function1<Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$6$1$2$1
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
                                ShelfDialogKt.ShelfDialog$lambda$7(mutableState4, i5);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    CommonKt.m6204EnumChipsFNF3uiM(arrayList2, ShelfDialog$lambda$6, peakCyan, (Function1) rememberedValue4, composer2, 3464);
                    float f = 10;
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    CommonKt.FieldLabel("Title", composer2, 6);
                    ShelfDialog$lambda$9 = ShelfDialogKt.ShelfDialog$lambda$9(mutableState5);
                    composer2.startReplaceableGroup(1782721119);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$6$1$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                invoke2(str3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                mutableState5.setValue(it4);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    float f2 = 12;
                    OutlinedTextFieldKt.OutlinedTextField(ShelfDialog$lambda$9, (Function1<? super String, Unit>) rememberedValue5, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2)), (TextFieldColors) null, composer2, 432, 12582912, 0, 6160376);
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f)), composer2, 6);
                    CommonKt.FieldLabel("Note", composer2, 6);
                    ShelfDialog$lambda$12 = ShelfDialogKt.ShelfDialog$lambda$12(mutableState6);
                    composer2.startReplaceableGroup(1782732958);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$6$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                invoke2(str3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                mutableState6.setValue(it4);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(ShelfDialog$lambda$12, (Function1<? super String, Unit>) rememberedValue6, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f2)), (TextFieldColors) null, composer2, 432, 0, 0, 6291448);
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
            endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt$ShelfDialog$7
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
                    ShelfDialogKt.ShelfDialog(MainViewModel.this, onDismiss, onSaved, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ShelfDialog$lambda$6(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShelfDialog$lambda$7(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ShelfDialog$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ShelfDialog$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final AppUiState ShelfDialog$lambda$0(State<AppUiState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StorageArea> ShelfDialog$lambda$1(State<? extends List<StorageArea>> state) {
        return state.getValue();
    }

    private static final List<StorageShelf> ShelfDialog$lambda$2(State<? extends List<StorageShelf>> state) {
        return state.getValue();
    }
}
