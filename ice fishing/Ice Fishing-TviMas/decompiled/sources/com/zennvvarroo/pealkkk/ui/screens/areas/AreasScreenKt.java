package com.zennvvarroo.pealkkk.ui.screens.areas;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.components.EmptyStateKt;
import com.zennvvarroo.pealkkk.ui.model.ZenvaroTab;
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

/* compiled from: AreasScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u008a\u0084\u0002²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u008a\u0084\u0002"}, d2 = {"AreasScreen", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "toast", "Lkotlin/Function1;", "", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "areas", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "shelves", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "items", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AreasScreenKt {
    public static final void AreasScreen(final MainViewModel mainViewModel, final Function1<? super String, Unit> toast, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(toast, "toast");
        Composer startRestartGroup = composer.startRestartGroup(640053899);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(640053899, i, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreen (AreasScreen.kt:24)");
        }
        final State collectAsState = SnapshotStateKt.collectAsState(mainViewModel.getAreas(), null, startRestartGroup, 8, 1);
        final State collectAsState2 = SnapshotStateKt.collectAsState(mainViewModel.getShelves(), null, startRestartGroup, 8, 1);
        final State collectAsState3 = SnapshotStateKt.collectAsState(mainViewModel.getItems(), null, startRestartGroup, 8, 1);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, PaddingKt.m559PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m5734constructorimpl(40), 7, null), false, null, null, null, false, new Function1<LazyListScope, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1
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
                List AreasScreen$lambda$0;
                final List AreasScreen$lambda$02;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AreasScreenKt.INSTANCE.m6213getLambda1$app_release(), 3, null);
                final MainViewModel mainViewModel2 = MainViewModel.this;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1106923862, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1.1
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
                                ComposerKt.traceEventStart(1106923862, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreen.<anonymous>.<anonymous> (AreasScreen.kt:35)");
                            }
                            Modifier m564paddingVpY3zN4$default = PaddingKt.m564paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m5734constructorimpl(16), 0.0f, 2, null);
                            final MainViewModel mainViewModel3 = MainViewModel.this;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default);
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
                            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CommonKt.PrimaryButton("Add Area", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$1$1$1
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
                            }, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer2, 390, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
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
                AreasScreen$lambda$0 = AreasScreenKt.AreasScreen$lambda$0(collectAsState);
                if (!AreasScreen$lambda$0.isEmpty()) {
                    AreasScreen$lambda$02 = AreasScreenKt.AreasScreen$lambda$0(collectAsState);
                    final AnonymousClass3 anonymousClass3 = new Function1<StorageArea, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1.3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(StorageArea it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getId();
                        }
                    };
                    final State<List<StorageShelf>> state = collectAsState2;
                    final State<List<StoredItem>> state2 = collectAsState3;
                    final MainViewModel mainViewModel3 = MainViewModel.this;
                    final AreasScreenKt$AreasScreen$1$invoke$$inlined$items$default$1 areasScreenKt$AreasScreen$1$invoke$$inlined$items$default$1 = new Function1() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$invoke$$inlined$items$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Void invoke(StorageArea storageArea) {
                            return null;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke((StorageArea) obj);
                        }
                    };
                    LazyColumn.items(AreasScreen$lambda$02.size(), anonymousClass3 != null ? new Function1<Integer, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$invoke$$inlined$items$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(AreasScreen$lambda$02.get(i2));
                        }
                    } : null, new Function1<Integer, Object>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$invoke$$inlined$items$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final Object invoke(int i2) {
                            return Function1.this.invoke(AreasScreen$lambda$02.get(i2));
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$invoke$$inlined$items$default$4
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
                            List AreasScreen$lambda$1;
                            int i4;
                            List AreasScreen$lambda$2;
                            List AreasScreen$lambda$12;
                            ComposerKt.sourceInformation(composer2, "C148@6730L22:LazyDsl.kt#428nma");
                            int i5 = (i3 & 14) == 0 ? (composer2.changed(lazyItemScope) ? 4 : 2) | i3 : i3;
                            if ((i3 & 112) == 0) {
                                i5 |= composer2.changed(i2) ? 32 : 16;
                            }
                            if ((i5 & 731) == 146 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                            }
                            final StorageArea storageArea = (StorageArea) AreasScreen$lambda$02.get(i2);
                            composer2.startReplaceableGroup(629415929);
                            Modifier m563paddingVpY3zN4 = PaddingKt.m563paddingVpY3zN4(Modifier.INSTANCE, Dp.m5734constructorimpl(16), Dp.m5734constructorimpl(6));
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            int i6 = 0;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m563paddingVpY3zN4);
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
                            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AreasScreen$lambda$1 = AreasScreenKt.AreasScreen$lambda$1(state);
                            List list = AreasScreen$lambda$1;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                i4 = 0;
                            } else {
                                Iterator it = list.iterator();
                                int i7 = 0;
                                while (it.hasNext()) {
                                    if (Intrinsics.areEqual(((StorageShelf) it.next()).getAreaId(), storageArea.getId()) && (i7 = i7 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                                i4 = i7;
                            }
                            AreasScreen$lambda$2 = AreasScreenKt.AreasScreen$lambda$2(state2);
                            List<StoredItem> list2 = AreasScreen$lambda$2;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                for (StoredItem storedItem : list2) {
                                    AreasScreen$lambda$12 = AreasScreenKt.AreasScreen$lambda$1(state);
                                    List list3 = AreasScreen$lambda$12;
                                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                        Iterator it2 = list3.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                StorageShelf storageShelf = (StorageShelf) it2.next();
                                                if (Intrinsics.areEqual(storageShelf.getId(), storedItem.getShelfId()) && Intrinsics.areEqual(storageShelf.getAreaId(), storageArea.getId())) {
                                                    i6++;
                                                    if (i6 < 0) {
                                                        CollectionsKt.throwCountOverflow();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            int i8 = i6;
                            final MainViewModel mainViewModel4 = mainViewModel3;
                            Function0<Unit> function0 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$4$1$3
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
                                    MainViewModel.this.selectArea(storageArea.getId());
                                    MainViewModel.this.selectTab(ZenvaroTab.SHELVES);
                                }
                            };
                            final MainViewModel mainViewModel5 = mainViewModel3;
                            Function0<Unit> function02 = new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$4$1$4
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
                                    MainViewModel.this.onOpenAreaDialog(storageArea.getId());
                                }
                            };
                            final MainViewModel mainViewModel6 = mainViewModel3;
                            AreaCardKt.AreaCard(storageArea, i4, i8, function0, function02, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$4$1$5
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
                                    MainViewModel.this.onInitiateDelete(storageArea);
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
                    return;
                }
                final MainViewModel mainViewModel4 = MainViewModel.this;
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1061242746, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1.2
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
                                ComposerKt.traceEventStart(1061242746, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreen.<anonymous>.<anonymous> (AreasScreen.kt:44)");
                            }
                            Modifier m564paddingVpY3zN4$default = PaddingKt.m564paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m5734constructorimpl(16), 0.0f, 2, null);
                            final MainViewModel mainViewModel5 = MainViewModel.this;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m564paddingVpY3zN4$default);
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
                            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            CommonKt.m6206GlassCard3IgeMak(null, 0L, ComposableLambdaKt.composableLambda(composer2, -1255517009, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$2$1$1
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
                                            ComposerKt.traceEventStart(-1255517009, i3, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AreasScreen.kt:46)");
                                        }
                                        final MainViewModel mainViewModel6 = MainViewModel.this;
                                        EmptyStateKt.EmptyState("No areas yet", "Create your first storage area.", "Add Area", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$1$2$1$1.1
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
                                        }, null, null, composer3, 438, 48);
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
            }
        }, startRestartGroup, 390, 250);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt$AreasScreen$2
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
                    AreasScreenKt.AreasScreen(MainViewModel.this, toast, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StorageArea> AreasScreen$lambda$0(State<? extends List<StorageArea>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StorageShelf> AreasScreen$lambda$1(State<? extends List<StorageShelf>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<StoredItem> AreasScreen$lambda$2(State<? extends List<StoredItem>> state) {
        return state.getValue();
    }
}
