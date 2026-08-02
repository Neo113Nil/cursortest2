package com.squareup.cash.globalsearch.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.UnionInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.CashWindowInsets;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda4;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$Origin;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchBounds;
import com.squareup.cash.sharedElements.DiscoverTabSharedKey$SearchIcon;
import com.squareup.util.compose.TransitionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class GlobalSearchViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GlobalSearchViewModel f$1;
    public final /* synthetic */ UiScope f$2;
    public final /* synthetic */ FocusRequester f$3;
    public final /* synthetic */ TextFieldState f$4;
    public final /* synthetic */ SearchBarKeyboardState f$5;
    public final /* synthetic */ Function1 f$6;
    public final /* synthetic */ LazyListState f$7;

    public /* synthetic */ GlobalSearchViewKt$$ExternalSyntheticLambda2(GlobalSearchViewModel globalSearchViewModel, UiScope uiScope, FocusRequester focusRequester, TextFieldState textFieldState, SearchBarKeyboardState searchBarKeyboardState, Function1 function1, LazyListState lazyListState, int i) {
        this.$r8$classId = i;
        this.f$1 = globalSearchViewModel;
        this.f$2 = uiScope;
        this.f$3 = focusRequester;
        this.f$4 = textFieldState;
        this.f$5 = searchBarKeyboardState;
        this.f$6 = function1;
        this.f$7 = lazyListState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0275, code lost:
    
        if (r7 == r5) goto L56;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Continuation continuation;
        Object obj3;
        switch (this.$r8$classId) {
            case 0:
                boolean z = false;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, z)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1193683411, new GlobalSearchViewKt$$ExternalSyntheticLambda2(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, 1), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CashInsetsKt.LocalCashInsets;
                    m177backgroundbw27NRU.getClass();
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer2).ime;
                    AndroidWindowInsets androidWindowInsets2 = Arrangement$End$1.current(gapComposer2).systemBars;
                    ProvidableCompositionLocal providableCompositionLocal = CashInsetsKt.LocalCashInsets;
                    CashWindowInsets cashWindowInsets = ((CashComposeInsets) gapComposer2.consume(providableCompositionLocal)).floatingBottomNavigation;
                    CashWindowInsets cashWindowInsets2 = ((CashComposeInsets) gapComposer2.consume(providableCompositionLocal)).inlineBottomNavigation;
                    boolean changed = gapComposer2.changed(androidWindowInsets) | gapComposer2.changed(androidWindowInsets2) | gapComposer2.changed(cashWindowInsets) | gapComposer2.changed(cashWindowInsets2);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj4 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj4) {
                        rememberedValue = new UnionInsets(new UnionInsets(new UnionInsets(androidWindowInsets, androidWindowInsets2), cashWindowInsets), cashWindowInsets2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier clipToBounds = ClipKt.clipToBounds(OffsetKt.consumeWindowInsets(SpacerKt.padding(m177backgroundbw27NRU, SpacerKt.asPaddingValues((WindowInsets) rememberedValue, gapComposer2)), Arrangement$End$1.current(gapComposer2).systemBars));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, clipToBounds);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    FocusRequester focusRequester = this.f$3;
                    Modifier focusRequester2 = FocusTraversalKt.focusRequester(companion, focusRequester);
                    String stringResource = Room.stringResource(gapComposer2, R.string.search_placeholder);
                    ShowNavigationBack showNavigationBack = ShowNavigationBack.Always;
                    EnumEntriesList enumEntriesList = DiscoverTabSharedKey$Origin.$ENTRIES;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
                    Iterator it = enumEntriesList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new DiscoverTabSharedKey$SearchBounds((DiscoverTabSharedKey$Origin) it.next()));
                    }
                    EnumEntriesList enumEntriesList2 = DiscoverTabSharedKey$Origin.$ENTRIES;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList2, 10));
                    Iterator it2 = enumEntriesList2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new DiscoverTabSharedKey$SearchIcon((DiscoverTabSharedKey$Origin) it2.next()));
                    }
                    UiScope uiScope = this.f$2;
                    uiScope.getClass();
                    uiScope.getClass();
                    MetadataRepo metadataRepo = new MetadataRepo();
                    metadataRepo.mMetadataList = uiScope;
                    metadataRepo.mEmojiCharArray = uiScope;
                    metadataRepo.mRootNode = arrayList;
                    metadataRepo.mTypeface = arrayList2;
                    Function1 function1 = this.f$6;
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new ErrorView$$ExternalSyntheticLambda4(5, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    TextFieldState textFieldState = this.f$4;
                    SearchBarKeyboardState searchBarKeyboardState = this.f$5;
                    SearchBarKt.SearchBar(textFieldState, stringResource, searchBarKeyboardState, focusRequester2, null, showNavigationBack, (Function0) rememberedValue2, null, null, null, false, metadataRepo, gapComposer2, 196608, 64, 6032);
                    GlobalSearchViewModel globalSearchViewModel = this.f$1;
                    if (globalSearchViewModel.isLoading) {
                        gapComposer2.startReplaceGroup(73591349);
                        Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, fillMaxSize3);
                        ComposeUiNode.Companion.getClass();
                        Function0 function02 = ComposeUiNode.Companion.Constructor;
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(function02);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        continuation = null;
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer2, null);
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                        obj3 = obj4;
                    } else {
                        continuation = null;
                        if (globalSearchViewModel.sections.isEmpty()) {
                            obj3 = obj4;
                            gapComposer2.startReplaceGroup(73990195);
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(73788385);
                            boolean changed3 = gapComposer2.changed(searchBarKeyboardState);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (!changed3) {
                                obj3 = obj4;
                                break;
                            } else {
                                obj3 = obj4;
                            }
                            rememberedValue3 = new RealGooglePayer$$ExternalSyntheticLambda0(searchBarKeyboardState, 7);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                            QuickAccessBarKt.GlobalSearchFeed(globalSearchViewModel, this.f$7, function1, (Function0) rememberedValue3, gapComposer2, 0);
                            gapComposer2.end(false);
                        }
                    }
                    gapComposer2.end(true);
                    QuickAccessBarKt.ErrorToast(globalSearchViewModel.errorToast, gapComposer2, 6);
                    if (TransitionsKt.isVisibleAndSettled(uiScope.$$delegate_0.getTransition())) {
                        gapComposer2.startReplaceGroup(-2108562599);
                        Unit unit = Unit.INSTANCE;
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == obj3) {
                            rememberedValue4 = new SsnViewKt$SsnContent$3$1$1(focusRequester, continuation, 3);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue4);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-2108485719);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
