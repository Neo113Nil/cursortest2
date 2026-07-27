package com.zennvvarroo.pealkkk.ui.screens.items;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.zennvvarroo.pealkkk.data.model.StockState;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.components.EmptyStateKt;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import com.zennvvarroo.pealkkk.util.MappersKt;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ItemsScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"ItemsScreen", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "toast", "Lkotlin/Function1;", "", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "areas", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "shelves", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "items", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "bg", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemsScreenKt {
    public static final void ItemsScreen(final MainViewModel mainViewModel, final Function1<? super String, Unit> toast, Composer composer, final int i) {
        Object obj;
        Object obj2;
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(toast, "toast");
        Composer startRestartGroup = composer.startRestartGroup(1209218053);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1209218053, i, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen (ItemsScreen.kt:41)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(mainViewModel.getUiState(), null, startRestartGroup, 8, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(mainViewModel.getAreas(), null, startRestartGroup, 8, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(mainViewModel.getShelves(), null, startRestartGroup, 8, 1);
        State collectAsState4 = SnapshotStateKt.collectAsState(mainViewModel.getItems(), null, startRestartGroup, 8, 1);
        startRestartGroup.startReplaceableGroup(1734521186);
        if (ItemsScreen$lambda$2(collectAsState3).isEmpty()) {
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693656, "C79@3979L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            CommonKt.ScreenHeader("Items", "Items inside the selected shelf.", startRestartGroup, 54);
            Modifier m564paddingVpY3zN4$default = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(16), 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2937constructorimpl2 = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CommonKt.m6206GlassCard3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(startRestartGroup, 240594891, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$1$1$1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope GlassCard, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(GlassCard, "$this$GlassCard");
                    if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(240594891, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen.<anonymous>.<anonymous>.<anonymous> (ItemsScreen.kt:52)");
                        }
                        final MainViewModel mainViewModel2 = MainViewModel.this;
                        EmptyStateKt.EmptyState("No shelves yet", "Create a shelf first to add items.", "Add Shelf", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$1$1$1.1
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
                                MainViewModel.onOpenShelfDialog$default(MainViewModel.this, null, 1, null);
                            }
                        }, null, null, composer2, 438, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 384, 3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$2
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

                    public final void invoke(Composer composer2, int i2) {
                        ItemsScreenKt.ItemsScreen(MainViewModel.this, toast, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            return;
        }
        startRestartGroup.endReplaceableGroup();
        String selectedShelfId = ItemsScreen$lambda$0(collectAsState).getSelectedShelfId();
        if (selectedShelfId == null) {
            selectedShelfId = ((StorageShelf) CollectionsKt.first((List) ItemsScreen$lambda$2(collectAsState3))).getId();
        }
        Iterator<T> it = ItemsScreen$lambda$2(collectAsState3).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((StorageShelf) obj).getId(), selectedShelfId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StorageShelf storageShelf = (StorageShelf) obj;
        if (storageShelf == null) {
            storageShelf = (StorageShelf) CollectionsKt.first((List) ItemsScreen$lambda$2(collectAsState3));
        }
        Iterator<T> it2 = ItemsScreen$lambda$1(collectAsState2).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (Intrinsics.areEqual(((StorageArea) obj2).getId(), storageShelf.getAreaId())) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        StorageArea storageArea = (StorageArea) obj2;
        if (storageArea != null) {
            List<StorageShelf> ItemsScreen$lambda$2 = ItemsScreen$lambda$2(collectAsState3);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : ItemsScreen$lambda$2) {
                if (Intrinsics.areEqual(((StorageShelf) obj3).getAreaId(), storageArea.getId())) {
                    arrayList.add(obj3);
                }
            }
            emptyList = arrayList;
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<StoredItem> ItemsScreen$lambda$3 = ItemsScreen$lambda$3(collectAsState4);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : ItemsScreen$lambda$3) {
            if (Intrinsics.areEqual(((StoredItem) obj4).getShelfId(), storageShelf.getId())) {
                arrayList2.add(obj4);
            }
        }
        final ArrayList arrayList3 = arrayList2;
        final StorageShelf storageShelf2 = storageShelf;
        final List list = emptyList;
        final long areaColorToPaint = storageArea != null ? MappersKt.areaColorToPaint(storageArea.getColor()) : ColorKt.getPeakCyan();
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m559PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5734constructorimpl(40), 7, null), false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                invoke2(lazyListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LazyListScope LazyColumn) {
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                final StorageShelf storageShelf3 = storageShelf2;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(776907417, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.1
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                        invoke(lazyItemScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i2 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(776907417, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen.<anonymous>.<anonymous> (ItemsScreen.kt:78)");
                        }
                        CommonKt.ScreenHeader("Items", "Items for shelf: " + StorageShelf.this.getTitle(), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                final List<StorageShelf> list2 = list;
                final StorageShelf storageShelf4 = storageShelf2;
                final long j = areaColorToPaint;
                final MainViewModel mainViewModel2 = mainViewModel;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1676088016, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* compiled from: ItemsScreen.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1, reason: invalid class name */
                    static final class AnonymousClass1 extends Lambda implements Function1<LazyListScope, Unit> {
                        final /* synthetic */ long $accent;
                        final /* synthetic */ MainViewModel $mainViewModel;
                        final /* synthetic */ StorageShelf $selectedShelf;
                        final /* synthetic */ List<StorageShelf> $shelvesForArea;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(List<StorageShelf> list, StorageShelf storageShelf, long j, MainViewModel mainViewModel) {
                            super(1);
                            this.$shelvesForArea = list;
                            this.$selectedShelf = storageShelf;
                            this.$accent = j;
                            this.$mainViewModel = mainViewModel;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyRow) {
                            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                            final List<StorageShelf> list = this.$shelvesForArea;
                            final C00601 c00601 = new Function1<StorageShelf, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt.ItemsScreen.3.2.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(StorageShelf it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return it.getId();
                                }
                            };
                            final StorageShelf storageShelf = this.$selectedShelf;
                            final long j = this.$accent;
                            final MainViewModel mainViewModel = this.$mainViewModel;
                            final ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1 itemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1 = ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1.INSTANCE;
                            LazyRow.items(list.size(), c00601 != null ? 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: INVOKE 
                                  (r11v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                                  (wrap:int:0x0015: INVOKE (r2v0 'list' java.util.List<com.zennvvarroo.pealkkk.data.model.StorageShelf>) INTERFACE call: java.util.List.size():int A[MD:():int (c), WRAPPED] (LINE:161))
                                  (wrap:kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>:?: TERNARY null = ((r0v2 'c00601' com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1) != (null com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1)) ? (wrap:??:0x0020: CONSTRUCTOR 
                                  (r0v2 'c00601' com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1 A[DONT_INLINE])
                                  (r2v0 'list' java.util.List<com.zennvvarroo.pealkkk.data.model.StorageShelf> A[DONT_INLINE])
                                 A[MD:(kotlin.jvm.functions.Function1, java.util.List):void (m), WRAPPED] (LINE:160) call: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$2.<init>(kotlin.jvm.functions.Function1, java.util.List):void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>))
                                  (wrap:kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>:0x0026: CONSTRUCTOR 
                                  (r1v1 'itemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1' com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                                  (r2v0 'list' java.util.List<com.zennvvarroo.pealkkk.data.model.StorageShelf> A[DONT_INLINE])
                                 A[MD:(kotlin.jvm.functions.Function1, java.util.List):void (m), WRAPPED] call: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$3.<init>(kotlin.jvm.functions.Function1, java.util.List):void type: CONSTRUCTOR)
                                  (wrap:androidx.compose.runtime.internal.ComposableLambda:0x0035: INVOKE 
                                  (-632812321 int)
                                  true
                                  (wrap:kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x002e: CONSTRUCTOR 
                                  (r2v0 'list' java.util.List<com.zennvvarroo.pealkkk.data.model.StorageShelf> A[DONT_INLINE])
                                  (r3v0 'storageShelf' com.zennvvarroo.pealkkk.data.model.StorageShelf A[DONT_INLINE])
                                  (r4v0 'j' long A[DONT_INLINE])
                                  (r6v0 'mainViewModel' com.zennvvarroo.pealkkk.ui.MainViewModel A[DONT_INLINE])
                                 A[MD:(java.util.List, com.zennvvarroo.pealkkk.data.model.StorageShelf, long, com.zennvvarroo.pealkkk.ui.MainViewModel):void (m), WRAPPED] (LINE:164) call: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$4.<init>(java.util.List, com.zennvvarroo.pealkkk.data.model.StorageShelf, long, com.zennvvarroo.pealkkk.ui.MainViewModel):void type: CONSTRUCTOR)
                                 STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:164))
                                 INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.items(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4):void A[MD:(int, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:160) in method: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt.ItemsScreen.3.2.1.invoke(androidx.compose.foundation.lazy.LazyListScope):void, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$2, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 15 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "$this$LazyRow"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                                java.util.List<com.zennvvarroo.pealkkk.data.model.StorageShelf> r2 = r10.$shelvesForArea
                                com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1 r0 = new kotlin.jvm.functions.Function1<com.zennvvarroo.pealkkk.data.model.StorageShelf, java.lang.Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt.ItemsScreen.3.2.1.1
                                    static {
                                        /*
                                            com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1 r0 = new com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1
                                            r0.<init>()
                                            
                                            // error: 0x0005: SPUT (r0 I:com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1) com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt.ItemsScreen.3.2.1.1.INSTANCE com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$1
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.AnonymousClass2.AnonymousClass1.C00601.<clinit>():void");
                                    }

                                    {
                                        /*
                                            r1 = this;
                                            r0 = 1
                                            r1.<init>(r0)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.AnonymousClass2.AnonymousClass1.C00601.<init>():void");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(com.zennvvarroo.pealkkk.data.model.StorageShelf r2) {
                                        /*
                                            r1 = this;
                                            java.lang.String r0 = "it"
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                                            java.lang.String r2 = r2.getId()
                                            return r2
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.AnonymousClass2.AnonymousClass1.C00601.invoke(com.zennvvarroo.pealkkk.data.model.StorageShelf):java.lang.Object");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(com.zennvvarroo.pealkkk.data.model.StorageShelf r1) {
                                        /*
                                            r0 = this;
                                            com.zennvvarroo.pealkkk.data.model.StorageShelf r1 = (com.zennvvarroo.pealkkk.data.model.StorageShelf) r1
                                            java.lang.Object r1 = r0.invoke(r1)
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.AnonymousClass2.AnonymousClass1.C00601.invoke(java.lang.Object):java.lang.Object");
                                    }
                                }
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                com.zennvvarroo.pealkkk.data.model.StorageShelf r3 = r10.$selectedShelf
                                long r4 = r10.$accent
                                com.zennvvarroo.pealkkk.ui.MainViewModel r6 = r10.$mainViewModel
                                com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1 r1 = com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$1.INSTANCE
                                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                int r7 = r2.size()
                                if (r0 == 0) goto L23
                                com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$2 r8 = new com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$2
                                r8.<init>(r0, r2)
                                kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
                                goto L24
                            L23:
                                r8 = 0
                            L24:
                                com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$3 r0 = new com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$3
                                r0.<init>(r1, r2)
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$4 r9 = new com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$2$1$invoke$$inlined$items$default$4
                                r1 = r9
                                r1.<init>(r2, r3, r4, r6)
                                r1 = -632812321(0xffffffffda480cdf, float:-1.4077287E16)
                                r2 = 1
                                androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r9)
                                kotlin.jvm.functions.Function4 r1 = (kotlin.jvm.functions.Function4) r1
                                r11.items(r7, r8, r0, r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.AnonymousClass2.AnonymousClass1.invoke2(androidx.compose.foundation.lazy.LazyListScope):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final long invoke$lambda$2$lambda$0(State<Color> state) {
                            return state.getValue().m3417unboximpl();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                        invoke(lazyItemScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1676088016, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen.<anonymous>.<anonymous> (ItemsScreen.kt:80)");
                            }
                            LazyDslKt.LazyRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m557PaddingValuesYgX7TsA$default(Dp.m5734constructorimpl(16), 0.0f, 2, null), false, Arrangement.INSTANCE.m471spacedBy0680j_4(Dp.m5734constructorimpl(8)), null, null, false, new AnonymousClass1(list2, storageShelf4, j, mainViewModel2), composer2, 24966, 234);
                            SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(14)), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 3, null);
                final MainViewModel mainViewModel3 = mainViewModel;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-426365487, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.3
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                        invoke(lazyItemScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-426365487, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen.<anonymous>.<anonymous> (ItemsScreen.kt:106)");
                            }
                            Modifier m564paddingVpY3zN4$default2 = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(16), 0.0f, 2, null);
                            final MainViewModel mainViewModel4 = MainViewModel.this;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default2);
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
                            Updater.m2944setimpl(m2937constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl3.getInserting() || !Intrinsics.areEqual(m2937constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m2937constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m2937constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            CommonKt.PrimaryButton("Add Item", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$3$1$1
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
                                    MainViewModel.onOpenItemDialog$default(MainViewModel.this, null, 1, null);
                                }
                            }, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 390, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(12)), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 3, null);
                if (arrayList3.isEmpty()) {
                    final StorageShelf storageShelf5 = storageShelf2;
                    final MainViewModel mainViewModel4 = mainViewModel;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1630406900, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer2, Integer num) {
                            invoke(lazyItemScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer2, int i2) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1630406900, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen.<anonymous>.<anonymous> (ItemsScreen.kt:116)");
                                }
                                Modifier m564paddingVpY3zN4$default2 = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(16), 0.0f, 2, null);
                                final StorageShelf storageShelf6 = StorageShelf.this;
                                final MainViewModel mainViewModel5 = mainViewModel4;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default2);
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
                                Updater.m2944setimpl(m2937constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m2944setimpl(m2937constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m2937constructorimpl3.getInserting() || !Intrinsics.areEqual(m2937constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m2937constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m2937constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                CommonKt.m6206GlassCard3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composer2, -686352855, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$4$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                        invoke(columnScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(ColumnScope GlassCard, Composer composer3, int i3) {
                                        Intrinsics.checkNotNullParameter(GlassCard, "$this$GlassCard");
                                        if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-686352855, i3, -1, "com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ItemsScreen.kt:118)");
                                            }
                                            String str = "Add items to " + StorageShelf.this.getTitle() + ".";
                                            final MainViewModel mainViewModel6 = mainViewModel5;
                                            EmptyStateKt.EmptyState("No items yet", str, "Add Item", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$4$1$1.1
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
                                                    MainViewModel.onOpenItemDialog$default(MainViewModel.this, null, 1, null);
                                                }
                                            }, null, null, composer3, 390, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composer2, 384, 3);
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
                    }), 3, null);
                } else {
                    final List<StoredItem> list3 = arrayList3;
                    final AnonymousClass5 anonymousClass5 = new Function1<StoredItem, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3.5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(StoredItem it3) {
                            Intrinsics.checkNotNullParameter(it3, "it");
                            return it3.getId();
                        }
                    };
                    final MainViewModel mainViewModel5 = mainViewModel;
                    final Function1<String, Unit> function1 = toast;
                    final ItemsScreenKt$ItemsScreen$3$invoke$$inlined$items$default$1 itemsScreenKt$ItemsScreen$3$invoke$$inlined$items$default$1 = new Function1() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$invoke$$inlined$items$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Void invoke(StoredItem storedItem) {
                            return null;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                            return invoke((StoredItem) obj5);
                        }
                    };
                    LazyColumn.items(list3.size(), anonymousClass5 != null ? new Function1<Integer, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$invoke$$inlined$items$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(list3.get(i2));
                        }
                    } : null, new Function1<Integer, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$invoke$$inlined$items$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(list3.get(i2));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$invoke$$inlined$items$default$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                            invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer2, int i3) {
                            int i4;
                            ComposerKt.sourceInformation(composer2, "C148@6730L22:LazyDsl.kt#428nma");
                            if ((i3 & 14) == 0) {
                                i4 = (composer2.changed(lazyItemScope) ? 4 : 2) | i3;
                            } else {
                                i4 = i3;
                            }
                            if ((i3 & 112) == 0) {
                                i4 |= composer2.changed(i2) ? 32 : 16;
                            }
                            if ((i4 & 731) == 146 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                            }
                            final StoredItem storedItem = (StoredItem) list3.get(i2);
                            composer2.startReplaceableGroup(-1557480771);
                            Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(Modifier.INSTANCE, Dp.m5734constructorimpl(16), Dp.m5734constructorimpl(6));
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(m563paddingVpY3zN4);
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
                            Updater.m2944setimpl(m2937constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl3.getInserting() || !Intrinsics.areEqual(m2937constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m2937constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m2937constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            StockState stockState = MappersKt.getStockState(storedItem);
                            final MainViewModel mainViewModel6 = mainViewModel5;
                            final Function1 function12 = function1;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$6$1$1
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
                                    MainViewModel.this.changeQuantity(storedItem.getId(), -1);
                                    function12.invoke("Quantity updated");
                                }
                            };
                            final MainViewModel mainViewModel7 = mainViewModel5;
                            final Function1 function13 = function1;
                            Function0<Unit> function02 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$6$1$2
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
                                    MainViewModel.this.changeQuantity(storedItem.getId(), 1);
                                    function13.invoke("Quantity updated");
                                }
                            };
                            final MainViewModel mainViewModel8 = mainViewModel5;
                            Function0<Unit> function03 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$6$1$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    MainViewModel.this.onOpenItemDialog(storedItem.getId());
                                }
                            };
                            final MainViewModel mainViewModel9 = mainViewModel5;
                            ItemCardKt.ItemCard(storedItem, stockState, function0, function02, function03, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$3$6$1$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    MainViewModel.this.onInitiateDelete(storedItem);
                                }
                            }, composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }));
                }
            }
        }, startRestartGroup, 390, 250);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt$ItemsScreen$4
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

                public final void invoke(Composer composer2, int i2) {
                    ItemsScreenKt.ItemsScreen(MainViewModel.this, toast, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final AppUiState ItemsScreen$lambda$0(State<AppUiState> state) {
        return state.getValue();
    }

    private static final List<StorageArea> ItemsScreen$lambda$1(State<? extends List<StorageArea>> state) {
        return state.getValue();
    }

    private static final List<StorageShelf> ItemsScreen$lambda$2(State<? extends List<StorageShelf>> state) {
        return state.getValue();
    }

    private static final List<StoredItem> ItemsScreen$lambda$3(State<? extends List<StoredItem>> state) {
        return state.getValue();
    }
}
