package com.zennvvarroo.pealkkk.ui.screens.shelves;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.components.EmptyStateKt;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.model.ZenvaroTab;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import com.zennvvarroo.pealkkk.util.MappersKt;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.text.StringsKt;

/* compiled from: ShelvesScreen.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"ShelvesScreen", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "toast", "Lkotlin/Function1;", "", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "areas", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "shelves", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "items", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;", "bg", "Landroidx/compose/ui/graphics/Color;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShelvesScreenKt {
    public static final void ShelvesScreen(final MainViewModel mainViewModel, final Function1<? super String, Unit> toast, Composer composer, final int i) {
        Object obj;
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(toast, "toast");
        Composer startRestartGroup = composer.startRestartGroup(-1091635539);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1091635539, i, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen (ShelvesScreen.kt:43)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(mainViewModel.getUiState(), null, startRestartGroup, 8, 1);
        final State collectAsState2 = SnapshotStateKt.collectAsState(mainViewModel.getAreas(), null, startRestartGroup, 8, 1);
        State collectAsState3 = SnapshotStateKt.collectAsState(mainViewModel.getShelves(), null, startRestartGroup, 8, 1);
        final State collectAsState4 = SnapshotStateKt.collectAsState(mainViewModel.getItems(), null, startRestartGroup, 8, 1);
        startRestartGroup.startReplaceableGroup(-1910665359);
        if (ShelvesScreen$lambda$1(collectAsState2).isEmpty()) {
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
            CommonKt.ScreenHeader("Shelves", "Shelves inside the selected area.", startRestartGroup, 54);
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
            CommonKt.m6206GlassCard3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(startRestartGroup, 756844019, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$1$1$1
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
                            ComposerKt.traceEventStart(756844019, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen.<anonymous>.<anonymous>.<anonymous> (ShelvesScreen.kt:54)");
                        }
                        final MainViewModel mainViewModel2 = MainViewModel.this;
                        EmptyStateKt.EmptyState("No areas yet", "Create an area first to add shelves.", "Add Area", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$1$1$1.1
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
                                MainViewModel.onOpenAreaDialog$default(MainViewModel.this, null, 1, null);
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
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$2
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
                        ShelvesScreenKt.ShelvesScreen(MainViewModel.this, toast, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    }
                });
                return;
            }
            return;
        }
        startRestartGroup.endReplaceableGroup();
        String selectedAreaId = ShelvesScreen$lambda$0(collectAsState).getSelectedAreaId();
        if (selectedAreaId == null) {
            selectedAreaId = ((StorageArea) CollectionsKt.first((List) ShelvesScreen$lambda$1(collectAsState2))).getId();
        }
        Iterator<T> it = ShelvesScreen$lambda$1(collectAsState2).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((StorageArea) obj).getId(), selectedAreaId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        StorageArea storageArea = (StorageArea) obj;
        if (storageArea == null) {
            storageArea = (StorageArea) CollectionsKt.first((List) ShelvesScreen$lambda$1(collectAsState2));
        }
        List<StorageShelf> ShelvesScreen$lambda$2 = ShelvesScreen$lambda$2(collectAsState3);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : ShelvesScreen$lambda$2) {
            if (Intrinsics.areEqual(((StorageShelf) obj2).getAreaId(), storageArea.getId())) {
                arrayList.add(obj2);
            }
        }
        final ArrayList arrayList2 = arrayList;
        final StorageArea storageArea2 = storageArea;
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m559PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5734constructorimpl(40), 7, null), false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3
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
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ShelvesScreenKt.INSTANCE.m6233getLambda1$app_release(), 3, null);
                final State<List<StorageArea>> state = collectAsState2;
                final StorageArea storageArea3 = storageArea2;
                final MainViewModel mainViewModel2 = mainViewModel;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(175460664, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* compiled from: ShelvesScreen.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00611 extends Lambda implements Function1<LazyListScope, Unit> {
                        final /* synthetic */ State<List<StorageArea>> $areas$delegate;
                        final /* synthetic */ MainViewModel $mainViewModel;
                        final /* synthetic */ StorageArea $selectedArea;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C00611(State<? extends List<StorageArea>> state, StorageArea storageArea, MainViewModel mainViewModel) {
                            super(1);
                            this.$areas$delegate = state;
                            this.$selectedArea = storageArea;
                            this.$mainViewModel = mainViewModel;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyRow) {
                            final List ShelvesScreen$lambda$1;
                            Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                            ShelvesScreen$lambda$1 = ShelvesScreenKt.ShelvesScreen$lambda$1(this.$areas$delegate);
                            final C00621 c00621 = new Function1<StorageArea, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt.ShelvesScreen.3.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(StorageArea it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return it.getId();
                                }
                            };
                            final StorageArea storageArea = this.$selectedArea;
                            final MainViewModel mainViewModel = this.$mainViewModel;
                            final ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1 shelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1 = ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1.INSTANCE;
                            LazyRow.items(ShelvesScreen$lambda$1.size(), c00621 != null ? 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: INVOKE 
                                  (r8v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                                  (wrap:int:0x0017: INVOKE (r0v2 'ShelvesScreen$lambda$1' java.util.List) INTERFACE call: java.util.List.size():int A[MD:():int (c), WRAPPED] (LINE:170))
                                  (wrap:kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>:?: TERNARY null = ((r1v1 'c00621' com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1) != (null com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1)) ? (wrap:??:0x0022: CONSTRUCTOR 
                                  (r1v1 'c00621' com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1 A[DONT_INLINE])
                                  (r0v2 'ShelvesScreen$lambda$1' java.util.List A[DONT_INLINE])
                                 A[MD:(kotlin.jvm.functions.Function1, java.util.List):void (m), WRAPPED] (LINE:169) call: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$2.<init>(kotlin.jvm.functions.Function1, java.util.List):void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>))
                                  (wrap:kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>:0x0028: CONSTRUCTOR 
                                  (r4v1 'shelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1' com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                                  (r0v2 'ShelvesScreen$lambda$1' java.util.List A[DONT_INLINE])
                                 A[MD:(kotlin.jvm.functions.Function1, java.util.List):void (m), WRAPPED] call: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$3.<init>(kotlin.jvm.functions.Function1, java.util.List):void type: CONSTRUCTOR)
                                  (wrap:androidx.compose.runtime.internal.ComposableLambda:0x0036: INVOKE 
                                  (-632812321 int)
                                  true
                                  (wrap:kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x002f: CONSTRUCTOR 
                                  (r0v2 'ShelvesScreen$lambda$1' java.util.List A[DONT_INLINE])
                                  (r2v0 'storageArea' com.zennvvarroo.pealkkk.data.model.StorageArea A[DONT_INLINE])
                                  (r3v0 'mainViewModel' com.zennvvarroo.pealkkk.ui.MainViewModel A[DONT_INLINE])
                                 A[MD:(java.util.List, com.zennvvarroo.pealkkk.data.model.StorageArea, com.zennvvarroo.pealkkk.ui.MainViewModel):void (m), WRAPPED] (LINE:173) call: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$4.<init>(java.util.List, com.zennvvarroo.pealkkk.data.model.StorageArea, com.zennvvarroo.pealkkk.ui.MainViewModel):void type: CONSTRUCTOR)
                                 STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:173))
                                 INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.items(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4):void A[MD:(int, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object>, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:169) in method: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt.ShelvesScreen.3.1.1.invoke(androidx.compose.foundation.lazy.LazyListScope):void, file: classes3.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$2, state: NOT_LOADED
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
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                                androidx.compose.runtime.State<java.util.List<com.zennvvarroo.pealkkk.data.model.StorageArea>> r0 = r7.$areas$delegate
                                java.util.List r0 = com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt.access$ShelvesScreen$lambda$1(r0)
                                com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1 r1 = new kotlin.jvm.functions.Function1<com.zennvvarroo.pealkkk.data.model.StorageArea, java.lang.Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt.ShelvesScreen.3.1.1.1
                                    static {
                                        /*
                                            com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1 r0 = new com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1
                                            r0.<init>()
                                            
                                            // error: 0x0005: SPUT (r0 I:com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1) com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt.ShelvesScreen.3.1.1.1.INSTANCE com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$1
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.AnonymousClass1.C00611.C00621.<clinit>():void");
                                    }

                                    {
                                        /*
                                            r1 = this;
                                            r0 = 1
                                            r1.<init>(r0)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.AnonymousClass1.C00611.C00621.<init>():void");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(com.zennvvarroo.pealkkk.data.model.StorageArea r2) {
                                        /*
                                            r1 = this;
                                            java.lang.String r0 = "it"
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                                            java.lang.String r2 = r2.getId()
                                            return r2
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.AnonymousClass1.C00611.C00621.invoke(com.zennvvarroo.pealkkk.data.model.StorageArea):java.lang.Object");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Object invoke(com.zennvvarroo.pealkkk.data.model.StorageArea r1) {
                                        /*
                                            r0 = this;
                                            com.zennvvarroo.pealkkk.data.model.StorageArea r1 = (com.zennvvarroo.pealkkk.data.model.StorageArea) r1
                                            java.lang.Object r1 = r0.invoke(r1)
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.AnonymousClass1.C00611.C00621.invoke(java.lang.Object):java.lang.Object");
                                    }
                                }
                                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                com.zennvvarroo.pealkkk.data.model.StorageArea r2 = r7.$selectedArea
                                com.zennvvarroo.pealkkk.ui.MainViewModel r3 = r7.$mainViewModel
                                com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1 r4 = com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$1.INSTANCE
                                kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                                int r5 = r0.size()
                                if (r1 == 0) goto L25
                                com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$2 r6 = new com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$2
                                r6.<init>(r1, r0)
                                kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
                                goto L26
                            L25:
                                r6 = 0
                            L26:
                                com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$3 r1 = new com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$3
                                r1.<init>(r4, r0)
                                kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
                                com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$4 r4 = new com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$1$1$invoke$$inlined$items$default$4
                                r4.<init>(r0, r2, r3)
                                r0 = -632812321(0xffffffffda480cdf, float:-1.4077287E16)
                                r2 = 1
                                androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r0, r2, r4)
                                kotlin.jvm.functions.Function4 r0 = (kotlin.jvm.functions.Function4) r0
                                r8.items(r5, r6, r1, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.AnonymousClass1.C00611.invoke2(androidx.compose.foundation.lazy.LazyListScope):void");
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
                                ComposerKt.traceEventStart(175460664, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen.<anonymous>.<anonymous> (ShelvesScreen.kt:78)");
                            }
                            LazyDslKt.LazyRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m557PaddingValuesYgX7TsA$default(Dp.m5734constructorimpl(16), 0.0f, 2, null), false, Arrangement.INSTANCE.m471spacedBy0680j_4(Dp.m5734constructorimpl(8)), null, null, false, new C00611(state, storageArea3, mainViewModel2), composer2, 24966, 234);
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
                final StorageArea storageArea4 = storageArea2;
                final List<StorageShelf> list = arrayList2;
                final State<List<StoredItem>> state2 = collectAsState4;
                final MainViewModel mainViewModel3 = mainViewModel;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(185231225, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                                ComposerKt.traceEventStart(185231225, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen.<anonymous>.<anonymous> (ShelvesScreen.kt:104)");
                            }
                            float f = 16;
                            Modifier m564paddingVpY3zN4$default2 = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(f), 0.0f, 2, null);
                            final StorageArea storageArea5 = StorageArea.this;
                            final List<StorageShelf> list2 = list;
                            final State<List<StoredItem>> state3 = state2;
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
                            CommonKt.m6206GlassCard3IgeMak(null, MappersKt.areaColorToPaint(storageArea5.getColor()), ComposableLambdaKt.composableLambda(composer2, 1590640110, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope GlassCard, Composer composer3, int i3) {
                                    List ShelvesScreen$lambda$3;
                                    Intrinsics.checkNotNullParameter(GlassCard, "$this$GlassCard");
                                    if ((i3 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1590640110, i3, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShelvesScreen.kt:106)");
                                    }
                                    TextKt.m2125Text4IGK_g(StorageArea.this.getTitle(), (Modifier) null, ColorKt.getPeakWhite(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 0, 131026);
                                    composer3.startReplaceableGroup(277353399);
                                    if (!StringsKt.isBlank(StorageArea.this.getNote())) {
                                        SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(4)), composer3, 6);
                                        TextKt.m2125Text4IGK_g(StorageArea.this.getNote(), (Modifier) null, ColorKt.getPeakMuted(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3456, 0, 131058);
                                    }
                                    composer3.endReplaceableGroup();
                                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(10)), composer3, 6);
                                    Arrangement.HorizontalOrVertical m471spacedBy0680j_4 = Arrangement.INSTANCE.m471spacedBy0680j_4(Dp.m5734constructorimpl(8));
                                    List<StorageShelf> list3 = list2;
                                    StorageArea storageArea6 = StorageArea.this;
                                    State<List<StoredItem>> state4 = state3;
                                    composer3.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m471spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 6);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int i4 = 0;
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m2937constructorimpl4 = Updater.m2937constructorimpl(composer3);
                                    Updater.m2944setimpl(m2937constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m2944setimpl(m2937constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m2937constructorimpl4.getInserting() || !Intrinsics.areEqual(m2937constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        m2937constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        m2937constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    modifierMaterializerOf4.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    CommonKt.m6203ChipRPmYEkk(list3.size() + " shelves", MappersKt.areaColorToPaint(storageArea6.getColor()), composer3, 0);
                                    ShelvesScreen$lambda$3 = ShelvesScreenKt.ShelvesScreen$lambda$3(state4);
                                    List<StoredItem> list4 = ShelvesScreen$lambda$3;
                                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                        for (StoredItem storedItem : list4) {
                                            List<StorageShelf> list5 = list3;
                                            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                                Iterator<T> it2 = list5.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    if (Intrinsics.areEqual(((StorageShelf) it2.next()).getId(), storedItem.getShelfId())) {
                                                        i4++;
                                                        if (i4 < 0) {
                                                            CollectionsKt.throwCountOverflow();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    CommonKt.m6203ChipRPmYEkk(i4 + " items", ColorKt.getPeakMuted(), composer3, 48);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 384, 1);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            float f2 = 12;
                            SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f2)), composer2, 6);
                            Modifier m564paddingVpY3zN4$default3 = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(f), 0.0f, 2, null);
                            final MainViewModel mainViewModel4 = mainViewModel3;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default3);
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
                            Updater.m2944setimpl(m2937constructorimpl4, rememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl4.getInserting() || !Intrinsics.areEqual(m2937constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m2937constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m2937constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            modifierMaterializerOf4.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                            CommonKt.PrimaryButton("Add Shelf", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$2$2$1
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
                            }, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 390, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f2)), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), 3, null);
                if (arrayList2.isEmpty()) {
                    final StorageArea storageArea5 = storageArea2;
                    final MainViewModel mainViewModel4 = mainViewModel;
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(680270940, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.3
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
                                    ComposerKt.traceEventStart(680270940, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen.<anonymous>.<anonymous> (ShelvesScreen.kt:128)");
                                }
                                Modifier m564paddingVpY3zN4$default2 = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(16), 0.0f, 2, null);
                                final StorageArea storageArea6 = StorageArea.this;
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
                                CommonKt.m6206GlassCard3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composer2, 1885449681, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$3$1$1
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
                                                ComposerKt.traceEventStart(1885449681, i3, -1, "com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShelvesScreen.kt:130)");
                                            }
                                            String str = "Add your first shelf to " + StorageArea.this.getTitle() + ".";
                                            final MainViewModel mainViewModel6 = mainViewModel5;
                                            EmptyStateKt.EmptyState("No shelves yet", str, "Add Shelf", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$3$1$1.1
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
                    return;
                }
                final List<StorageShelf> list2 = arrayList2;
                final AnonymousClass4 anonymousClass4 = new Function1<StorageShelf, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3.4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(StorageShelf it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return it2.getId();
                    }
                };
                final StorageArea storageArea6 = storageArea2;
                final State<List<StoredItem>> state3 = collectAsState4;
                final MainViewModel mainViewModel5 = mainViewModel;
                final ShelvesScreenKt$ShelvesScreen$3$invoke$$inlined$items$default$1 shelvesScreenKt$ShelvesScreen$3$invoke$$inlined$items$default$1 = new Function1() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$invoke$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(StorageShelf storageShelf) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        return invoke((StorageShelf) obj3);
                    }
                };
                LazyColumn.items(list2.size(), anonymousClass4 != null ? new Function1<Integer, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$invoke$$inlined$items$default$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(list2.get(i2));
                    }
                } : null, new Function1<Integer, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$invoke$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i2) {
                        return Function1.this.invoke(list2.get(i2));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$invoke$$inlined$items$default$4
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
                        List ShelvesScreen$lambda$3;
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
                        final StorageShelf storageShelf = (StorageShelf) list2.get(i2);
                        composer2.startReplaceableGroup(-1568475490);
                        Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(Modifier.INSTANCE, Dp.m5734constructorimpl(16), Dp.m5734constructorimpl(6));
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        int i5 = 0;
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
                        ShelvesScreen$lambda$3 = ShelvesScreenKt.ShelvesScreen$lambda$3(state3);
                        List list3 = ShelvesScreen$lambda$3;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.areEqual(((StoredItem) it2.next()).getShelfId(), storageShelf.getId()) && (i5 = i5 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        int i6 = i5;
                        long areaColorToPaint = MappersKt.areaColorToPaint(storageArea6.getColor());
                        final MainViewModel mainViewModel6 = mainViewModel5;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$5$1$2
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
                                MainViewModel.this.selectShelf(storageShelf.getId());
                                MainViewModel.this.selectTab(ZenvaroTab.ITEMS);
                            }
                        };
                        final MainViewModel mainViewModel7 = mainViewModel5;
                        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$5$1$3
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
                                MainViewModel.this.onOpenShelfDialog(storageShelf.getId());
                            }
                        };
                        final MainViewModel mainViewModel8 = mainViewModel5;
                        ShelfCardKt.m6234ShelfCardT042LqI(storageShelf, i6, areaColorToPaint, function0, function02, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$3$5$1$4
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
                                MainViewModel.this.onInitiateDelete(storageShelf);
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
        }, startRestartGroup, 390, 250);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt$ShelvesScreen$4
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
                    ShelvesScreenKt.ShelvesScreen(MainViewModel.this, toast, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final AppUiState ShelvesScreen$lambda$0(State<AppUiState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StorageArea> ShelvesScreen$lambda$1(State<? extends List<StorageArea>> state) {
        return state.getValue();
    }

    private static final List<StorageShelf> ShelvesScreen$lambda$2(State<? extends List<StorageShelf>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StoredItem> ShelvesScreen$lambda$3(State<? extends List<StoredItem>> state) {
        return state.getValue();
    }
}
