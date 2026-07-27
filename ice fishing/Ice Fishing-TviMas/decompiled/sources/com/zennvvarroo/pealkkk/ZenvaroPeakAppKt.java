package com.zennvvarroo.pealkkk;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.data.model.StorageShelf;
import com.zennvvarroo.pealkkk.data.model.StoredItem;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.BottomNavBarKt;
import com.zennvvarroo.pealkkk.ui.components.DeleteConfirmationDialogKt;
import com.zennvvarroo.pealkkk.ui.components.PremiumBackgroundKt;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.model.ZenvaroTab;
import com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt;
import com.zennvvarroo.pealkkk.ui.screens.areas.AreasScreenKt;
import com.zennvvarroo.pealkkk.ui.screens.items.ItemDialogKt;
import com.zennvvarroo.pealkkk.ui.screens.items.ItemsScreenKt;
import com.zennvvarroo.pealkkk.ui.screens.overview.OverviewScreenKt;
import com.zennvvarroo.pealkkk.ui.screens.shelves.ShelfDialogKt;
import com.zennvvarroo.pealkkk.ui.screens.shelves.ShelvesScreenKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ZenvaroPeakApp.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u008a\u0084\u0002"}, d2 = {"ZenvaroPeakApp", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "shelves", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageShelf;", "items", "Lcom/zennvvarroo/pealkkk/data/model/StoredItem;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroPeakAppKt {
    /* JADX WARN: Removed duplicated region for block: B:138:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ZenvaroPeakApp(MainViewModel mainViewModel, Composer composer, final int i, final int i2) {
        CreationExtras.Empty empty;
        final MainViewModel mainViewModel2;
        final State collectAsState;
        Object rememberedValue;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m2937constructorimpl;
        Composer composer2;
        final SnackbarHostState snackbarHostState;
        final CoroutineScope coroutineScope;
        final MainViewModel mainViewModel3;
        int i3;
        StorageArea areaToDelete;
        int i4;
        int i5;
        String str;
        StorageShelf shelfToDelete;
        StoredItem itemToDelete;
        Composer startRestartGroup = composer.startRestartGroup(830972355);
        int i6 = i2 & 1;
        int i7 = i6 != 0 ? i | 2 : i;
        if (i6 != 1 || (i7 & 11) != 2 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if (i6 != 0) {
                    i7 &= -15;
                }
            } else if (i6 != 0) {
                startRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MainViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, empty, startRestartGroup, 0, 0);
                startRestartGroup.endReplaceableGroup();
                i7 &= -15;
                mainViewModel2 = (MainViewModel) viewModel;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(830972355, i7, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp (ZenvaroPeakApp.kt:35)");
                }
                collectAsState = SnapshotStateKt.collectAsState(mainViewModel2.getUiState(), null, startRestartGroup, 8, 1);
                State collectAsState2 = SnapshotStateKt.collectAsState(mainViewModel2.getShelves(), null, startRestartGroup, 8, 1);
                State collectAsState3 = SnapshotStateKt.collectAsState(mainViewModel2.getItems(), null, startRestartGroup, 8, 1);
                startRestartGroup.startReplaceableGroup(221141695);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new SnackbarHostState();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final SnackbarHostState snackbarHostState2 = (SnackbarHostState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                }
                startRestartGroup.endReplaceableGroup();
                final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxSize$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
                Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                PremiumBackgroundKt.PremiumBackground(startRestartGroup, 0);
                int i8 = 0;
                MainViewModel mainViewModel4 = mainViewModel2;
                ScaffoldKt.m1780ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, -207668136, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        AppUiState ZenvaroPeakApp$lambda$0;
                        if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-207668136, i9, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp.<anonymous>.<anonymous> (ZenvaroPeakApp.kt:65)");
                            }
                            ZenvaroPeakApp$lambda$0 = ZenvaroPeakAppKt.ZenvaroPeakApp$lambda$0(collectAsState);
                            BottomNavBarKt.BottomNavBar(ZenvaroPeakApp$lambda$0.getSelectedTab(), new AnonymousClass1(MainViewModel.this), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* compiled from: ZenvaroPeakApp.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$1$1, reason: invalid class name */
                    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ZenvaroTab, Unit> {
                        AnonymousClass1(Object obj) {
                            super(1, obj, MainViewModel.class, "selectTab", "selectTab(Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ZenvaroTab zenvaroTab) {
                            invoke2(zenvaroTab);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ZenvaroTab p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            ((MainViewModel) this.receiver).selectTab(p0);
                        }
                    }
                }), ComposableLambdaKt.composableLambda(startRestartGroup, 1478231799, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$2
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1478231799, i9, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp.<anonymous>.<anonymous> (ZenvaroPeakApp.kt:60)");
                            }
                            SnackbarHostKt.SnackbarHost(SnackbarHostState.this, null, null, composer3, 6, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), null, 0, Color.INSTANCE.m3442getTransparent0d7_KjU(), 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambdaKt.composableLambda(startRestartGroup, -15066674, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$3

                    /* compiled from: ZenvaroPeakApp.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[ZenvaroTab.values().length];
                            try {
                                iArr[ZenvaroTab.OVERVIEW.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[ZenvaroTab.AREAS.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[ZenvaroTab.SHELVES.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[ZenvaroTab.ITEMS.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues innerPadding, Composer composer3, int i9) {
                        AppUiState ZenvaroPeakApp$lambda$0;
                        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                        if ((i9 & 14) == 0) {
                            i9 |= composer3.changed(innerPadding) ? 4 : 2;
                        }
                        if ((i9 & 91) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-15066674, i9, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp.<anonymous>.<anonymous> (ZenvaroPeakApp.kt:72)");
                            }
                            Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding));
                            MainViewModel mainViewModel5 = MainViewModel.this;
                            State<AppUiState> state = collectAsState;
                            CoroutineScope coroutineScope3 = coroutineScope2;
                            SnackbarHostState snackbarHostState3 = snackbarHostState2;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(statusBarsPadding);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer3);
                            Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ZenvaroPeakApp$lambda$0 = ZenvaroPeakAppKt.ZenvaroPeakApp$lambda$0(state);
                            int i10 = WhenMappings.$EnumSwitchMapping$0[ZenvaroPeakApp$lambda$0.getSelectedTab().ordinal()];
                            if (i10 == 1) {
                                composer3.startReplaceableGroup(401134950);
                                OverviewScreenKt.OverviewScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$1(coroutineScope3, snackbarHostState3), composer3, 8);
                                composer3.endReplaceableGroup();
                            } else if (i10 == 2) {
                                composer3.startReplaceableGroup(401366985);
                                AreasScreenKt.AreasScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$2(coroutineScope3, snackbarHostState3), composer3, 8);
                                composer3.endReplaceableGroup();
                            } else if (i10 == 3) {
                                composer3.startReplaceableGroup(401598183);
                                ShelvesScreenKt.ShelvesScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$3(coroutineScope3, snackbarHostState3), composer3, 8);
                                composer3.endReplaceableGroup();
                            } else if (i10 == 4) {
                                composer3.startReplaceableGroup(401829257);
                                ItemsScreenKt.ItemsScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$4(coroutineScope3, snackbarHostState3), composer3, 8);
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(402028742);
                                composer3.endReplaceableGroup();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, 806882694, 178);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(221210159);
                if (ZenvaroPeakApp$lambda$0(collectAsState).getShowAreaDialog()) {
                    snackbarHostState = snackbarHostState2;
                    coroutineScope = coroutineScope2;
                    mainViewModel3 = mainViewModel4;
                    i3 = 8;
                } else {
                    mainViewModel3 = mainViewModel4;
                    snackbarHostState = snackbarHostState2;
                    coroutineScope = coroutineScope2;
                    i3 = 8;
                    AreaDialogKt.AreaDialog(mainViewModel3, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$2
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
                            MainViewModel.this.onDialogDismiss();
                        }
                    }, new Function1<Boolean, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            String str2;
                            MainViewModel.this.onDialogDismiss();
                            CoroutineScope coroutineScope3 = coroutineScope;
                            SnackbarHostState snackbarHostState3 = snackbarHostState;
                            if (z) {
                                str2 = "Area created";
                            } else {
                                str2 = "Changes saved";
                            }
                            ZenvaroPeakAppKt.ZenvaroPeakApp$toast(coroutineScope3, snackbarHostState3, str2);
                        }
                    }, composer2, 8);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(221226226);
                if (ZenvaroPeakApp$lambda$0(collectAsState).getShowShelfDialog()) {
                    ShelfDialogKt.ShelfDialog(mainViewModel3, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$4
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
                            MainViewModel.this.onDialogDismiss();
                        }
                    }, new Function1<Boolean, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            String str2;
                            MainViewModel.this.onDialogDismiss();
                            CoroutineScope coroutineScope3 = coroutineScope;
                            SnackbarHostState snackbarHostState3 = snackbarHostState;
                            if (z) {
                                str2 = "Shelf created";
                            } else {
                                str2 = "Changes saved";
                            }
                            ZenvaroPeakAppKt.ZenvaroPeakApp$toast(coroutineScope3, snackbarHostState3, str2);
                        }
                    }, composer2, i3);
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(221242383);
                if (ZenvaroPeakApp$lambda$0(collectAsState).getShowItemDialog()) {
                    ItemDialogKt.ItemDialog(mainViewModel3, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$6
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
                            MainViewModel.this.onDialogDismiss();
                        }
                    }, new Function1<Boolean, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            String str2;
                            MainViewModel.this.onDialogDismiss();
                            CoroutineScope coroutineScope3 = coroutineScope;
                            SnackbarHostState snackbarHostState3 = snackbarHostState;
                            if (z) {
                                str2 = "Item created";
                            } else {
                                str2 = "Changes saved";
                            }
                            ZenvaroPeakAppKt.ZenvaroPeakApp$toast(coroutineScope3, snackbarHostState3, str2);
                        }
                    }, composer2, i3);
                }
                composer2.endReplaceableGroup();
                areaToDelete = ZenvaroPeakApp$lambda$0(collectAsState).getAreaToDelete();
                composer2.startReplaceableGroup(221259338);
                if (areaToDelete != null) {
                    str = "Delete ";
                } else {
                    List<StorageShelf> ZenvaroPeakApp$lambda$1 = ZenvaroPeakApp$lambda$1(collectAsState2);
                    if ((ZenvaroPeakApp$lambda$1 instanceof Collection) && ZenvaroPeakApp$lambda$1.isEmpty()) {
                        i4 = 0;
                    } else {
                        Iterator<T> it = ZenvaroPeakApp$lambda$1.iterator();
                        i4 = 0;
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((StorageShelf) it.next()).getAreaId(), areaToDelete.getId()) && (i4 = i4 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    List<StoredItem> ZenvaroPeakApp$lambda$2 = ZenvaroPeakApp$lambda$2(collectAsState3);
                    if ((ZenvaroPeakApp$lambda$2 instanceof Collection) && ZenvaroPeakApp$lambda$2.isEmpty()) {
                        i5 = 0;
                    } else {
                        Iterator it2 = ZenvaroPeakApp$lambda$2.iterator();
                        i5 = 0;
                        while (it2.hasNext()) {
                            StoredItem storedItem = (StoredItem) it2.next();
                            Iterator it3 = it2;
                            List<StorageShelf> ZenvaroPeakApp$lambda$12 = ZenvaroPeakApp$lambda$1(collectAsState2);
                            if (!(ZenvaroPeakApp$lambda$12 instanceof Collection) || !ZenvaroPeakApp$lambda$12.isEmpty()) {
                                Iterator it4 = ZenvaroPeakApp$lambda$12.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        StorageShelf storageShelf = (StorageShelf) it4.next();
                                        Iterator it5 = it4;
                                        if (Intrinsics.areEqual(storageShelf.getId(), storedItem.getShelfId()) && Intrinsics.areEqual(storageShelf.getAreaId(), areaToDelete.getId())) {
                                            i5++;
                                            if (i5 < 0) {
                                                CollectionsKt.throwCountOverflow();
                                            }
                                        } else {
                                            it4 = it5;
                                        }
                                    }
                                }
                            }
                            it2 = it3;
                        }
                    }
                    str = "Delete ";
                    DeleteConfirmationDialogKt.DeleteConfirmationDialog("Delete " + areaToDelete.getTitle() + "?", "This will also delete " + i4 + " shelves and " + i5 + " items.", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$8$1
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
                            MainViewModel.this.onConfirmDelete();
                            ZenvaroPeakAppKt.ZenvaroPeakApp$toast(coroutineScope, snackbarHostState, "Data deleted");
                        }
                    }, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$8$2
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
                            MainViewModel.this.onDismissDelete();
                        }
                    }, composer2, 0);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceableGroup();
                shelfToDelete = ZenvaroPeakApp$lambda$0(collectAsState).getShelfToDelete();
                composer2.startReplaceableGroup(221281923);
                if (shelfToDelete != null) {
                    List<StoredItem> ZenvaroPeakApp$lambda$22 = ZenvaroPeakApp$lambda$2(collectAsState3);
                    if (!(ZenvaroPeakApp$lambda$22 instanceof Collection) || !ZenvaroPeakApp$lambda$22.isEmpty()) {
                        Iterator<T> it6 = ZenvaroPeakApp$lambda$22.iterator();
                        while (it6.hasNext()) {
                            if (Intrinsics.areEqual(((StoredItem) it6.next()).getShelfId(), shelfToDelete.getId()) && (i8 = i8 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    DeleteConfirmationDialogKt.DeleteConfirmationDialog(str + shelfToDelete.getTitle() + "?", "This will also delete " + i8 + " items.", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$9$1
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
                            MainViewModel.this.onConfirmDelete();
                            ZenvaroPeakAppKt.ZenvaroPeakApp$toast(coroutineScope, snackbarHostState, "Data deleted");
                        }
                    }, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$9$2
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
                            MainViewModel.this.onDismissDelete();
                        }
                    }, composer2, 0);
                    Unit unit3 = Unit.INSTANCE;
                    Unit unit4 = Unit.INSTANCE;
                }
                composer2.endReplaceableGroup();
                itemToDelete = ZenvaroPeakApp$lambda$0(collectAsState).getItemToDelete();
                if (itemToDelete != null) {
                    DeleteConfirmationDialogKt.DeleteConfirmationDialog(str + itemToDelete.getTitle() + "?", "This item will be removed.", new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$10$1
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
                            MainViewModel.this.onConfirmDelete();
                            ZenvaroPeakAppKt.ZenvaroPeakApp$toast(coroutineScope, snackbarHostState, "Data deleted");
                        }
                    }, new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$10$2
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
                            MainViewModel.this.onDismissDelete();
                        }
                    }, composer2, 48);
                    Unit unit5 = Unit.INSTANCE;
                    Unit unit6 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            mainViewModel2 = mainViewModel;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            collectAsState = SnapshotStateKt.collectAsState(mainViewModel2.getUiState(), null, startRestartGroup, 8, 1);
            State collectAsState22 = SnapshotStateKt.collectAsState(mainViewModel2.getShelves(), null, startRestartGroup, 8, 1);
            State collectAsState32 = SnapshotStateKt.collectAsState(mainViewModel2.getItems(), null, startRestartGroup, 8, 1);
            startRestartGroup.startReplaceableGroup(221141695);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final SnackbarHostState snackbarHostState22 = (SnackbarHostState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2937constructorimpl = Updater.m2937constructorimpl(startRestartGroup);
            Updater.m2944setimpl(m2937constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m2937constructorimpl.getInserting()) {
            }
            m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            PremiumBackgroundKt.PremiumBackground(startRestartGroup, 0);
            int i82 = 0;
            MainViewModel mainViewModel42 = mainViewModel2;
            ScaffoldKt.m1780ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableLambdaKt.composableLambda(startRestartGroup, -207668136, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    AppUiState ZenvaroPeakApp$lambda$0;
                    if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-207668136, i9, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp.<anonymous>.<anonymous> (ZenvaroPeakApp.kt:65)");
                        }
                        ZenvaroPeakApp$lambda$0 = ZenvaroPeakAppKt.ZenvaroPeakApp$lambda$0(collectAsState);
                        BottomNavBarKt.BottomNavBar(ZenvaroPeakApp$lambda$0.getSelectedTab(), new AnonymousClass1(MainViewModel.this), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* compiled from: ZenvaroPeakApp.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$1$1, reason: invalid class name */
                /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ZenvaroTab, Unit> {
                    AnonymousClass1(Object obj) {
                        super(1, obj, MainViewModel.class, "selectTab", "selectTab(Lcom/zennvvarroo/pealkkk/ui/model/ZenvaroTab;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ZenvaroTab zenvaroTab) {
                        invoke2(zenvaroTab);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ZenvaroTab p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        ((MainViewModel) this.receiver).selectTab(p0);
                    }
                }
            }), ComposableLambdaKt.composableLambda(startRestartGroup, 1478231799, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 11) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1478231799, i9, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp.<anonymous>.<anonymous> (ZenvaroPeakApp.kt:60)");
                        }
                        SnackbarHostKt.SnackbarHost(SnackbarHostState.this, null, null, composer3, 6, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), null, 0, Color.INSTANCE.m3442getTransparent0d7_KjU(), 0L, WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambdaKt.composableLambda(startRestartGroup, -15066674, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$1$3

                /* compiled from: ZenvaroPeakApp.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ZenvaroTab.values().length];
                        try {
                            iArr[ZenvaroTab.OVERVIEW.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ZenvaroTab.AREAS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ZenvaroTab.SHELVES.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ZenvaroTab.ITEMS.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues innerPadding, Composer composer3, int i9) {
                    AppUiState ZenvaroPeakApp$lambda$0;
                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                    if ((i9 & 14) == 0) {
                        i9 |= composer3.changed(innerPadding) ? 4 : 2;
                    }
                    if ((i9 & 91) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-15066674, i9, -1, "com.zennvvarroo.pealkkk.ZenvaroPeakApp.<anonymous>.<anonymous> (ZenvaroPeakApp.kt:72)");
                        }
                        Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding));
                        MainViewModel mainViewModel5 = MainViewModel.this;
                        State<AppUiState> state = collectAsState;
                        CoroutineScope coroutineScope3 = coroutineScope22;
                        SnackbarHostState snackbarHostState3 = snackbarHostState22;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(statusBarsPadding);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor22);
                        } else {
                            composer3.useNode();
                        }
                        Composer m2937constructorimpl2 = Updater.m2937constructorimpl(composer3);
                        Updater.m2944setimpl(m2937constructorimpl2, rememberBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m2944setimpl(m2937constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m2937constructorimpl2.getInserting() || !Intrinsics.areEqual(m2937constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m2937constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m2937constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        }
                        modifierMaterializerOf22.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        ZenvaroPeakApp$lambda$0 = ZenvaroPeakAppKt.ZenvaroPeakApp$lambda$0(state);
                        int i10 = WhenMappings.$EnumSwitchMapping$0[ZenvaroPeakApp$lambda$0.getSelectedTab().ordinal()];
                        if (i10 == 1) {
                            composer3.startReplaceableGroup(401134950);
                            OverviewScreenKt.OverviewScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$1(coroutineScope3, snackbarHostState3), composer3, 8);
                            composer3.endReplaceableGroup();
                        } else if (i10 == 2) {
                            composer3.startReplaceableGroup(401366985);
                            AreasScreenKt.AreasScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$2(coroutineScope3, snackbarHostState3), composer3, 8);
                            composer3.endReplaceableGroup();
                        } else if (i10 == 3) {
                            composer3.startReplaceableGroup(401598183);
                            ShelvesScreenKt.ShelvesScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$3(coroutineScope3, snackbarHostState3), composer3, 8);
                            composer3.endReplaceableGroup();
                        } else if (i10 == 4) {
                            composer3.startReplaceableGroup(401829257);
                            ItemsScreenKt.ItemsScreen(mainViewModel5, new ZenvaroPeakAppKt$ZenvaroPeakApp$1$3$1$4(coroutineScope3, snackbarHostState3), composer3, 8);
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(402028742);
                            composer3.endReplaceableGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, 806882694, 178);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(221210159);
            if (ZenvaroPeakApp$lambda$0(collectAsState).getShowAreaDialog()) {
            }
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(221226226);
            if (ZenvaroPeakApp$lambda$0(collectAsState).getShowShelfDialog()) {
            }
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(221242383);
            if (ZenvaroPeakApp$lambda$0(collectAsState).getShowItemDialog()) {
            }
            composer2.endReplaceableGroup();
            areaToDelete = ZenvaroPeakApp$lambda$0(collectAsState).getAreaToDelete();
            composer2.startReplaceableGroup(221259338);
            if (areaToDelete != null) {
            }
            composer2.endReplaceableGroup();
            shelfToDelete = ZenvaroPeakApp$lambda$0(collectAsState).getShelfToDelete();
            composer2.startReplaceableGroup(221281923);
            if (shelfToDelete != null) {
            }
            composer2.endReplaceableGroup();
            itemToDelete = ZenvaroPeakApp$lambda$0(collectAsState).getItemToDelete();
            if (itemToDelete != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            mainViewModel3 = mainViewModel;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ZenvaroPeakAppKt$ZenvaroPeakApp$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i9) {
                    ZenvaroPeakAppKt.ZenvaroPeakApp(MainViewModel.this, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ZenvaroPeakApp$toast(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, String str) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ZenvaroPeakAppKt$ZenvaroPeakApp$toast$1(snackbarHostState, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppUiState ZenvaroPeakApp$lambda$0(State<AppUiState> state) {
        return state.getValue();
    }

    private static final List<StorageShelf> ZenvaroPeakApp$lambda$1(State<? extends List<StorageShelf>> state) {
        return state.getValue();
    }

    private static final List<StoredItem> ZenvaroPeakApp$lambda$2(State<? extends List<StoredItem>> state) {
        return state.getValue();
    }
}
