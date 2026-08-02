package com.squareup.cash.family.requestsponsorship.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.LimitInsets;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.room.util.DBUtil;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$2$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SelectSponsorViewKt {
    public static final void SelectSponsor(SelectSponsorViewModel selectSponsorViewModel, Function1 function1, Composer composer, int i) {
        SelectSponsorViewModel selectSponsorViewModel2;
        selectSponsorViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(543207335);
        int i2 = (gapComposer.changedInstance(selectSponsorViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer, 0, 3);
            selectSponsorViewModel2 = selectSponsorViewModel;
            Strings.LoadableFullScreenContent(selectSponsorViewModel2, selectSponsorViewModel instanceof SelectSponsorViewModel.Submitting, null, null, null, Expect_jvmKt.rememberComposableLambda(1869757295, new LocalViewFactory$$ExternalSyntheticLambda4(25, ref$ObjectRef, function1), gapComposer), gapComposer, (i2 & 14) | 196608, 28);
            gapComposer = gapComposer;
        } else {
            selectSponsorViewModel2 = selectSponsorViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectSponsorView$$ExternalSyntheticLambda4(selectSponsorViewModel2, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b1  */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectSponsorContent(SelectSponsorViewModel.SelectSponsor selectSponsor, TextFieldState textFieldState, Modifier$$ExternalSyntheticLambda0 modifier$$ExternalSyntheticLambda0, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        int i3;
        Object gLSceneScopeProvider$SceneScope$2$1$1;
        FocusRequester focusRequester;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        Object obj;
        Boolean bool;
        Continuation continuation;
        boolean z;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2;
        Object obj2;
        FocusRequester focusRequester2;
        SelectSponsorViewModel.SelectSponsor selectSponsor2;
        LazyListState rememberLazyListState;
        boolean changed;
        Object rememberedValue;
        Colors colors;
        String str;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        SelectSponsorViewModel.SelectSponsor selectSponsor3 = selectSponsor;
        ?? r13 = (GapComposer) composer;
        r13.startRestartGroup(1617023431);
        Applier applier = r13.applier;
        if ((i & 6) == 0) {
            i2 = (r13.changedInstance(selectSponsor3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r13.changed(textFieldState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= r13.changedInstance(modifier$$ExternalSyntheticLambda0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= r13.changedInstance(function1) ? 2048 : 1024;
        }
        if (r13.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue2 = r13.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue2 == obj3) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m((GapComposer) r13);
            }
            FocusRequester focusRequester3 = (FocusRequester) rememberedValue2;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3 = (DelegatingSoftwareKeyboardController) r13.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Boolean valueOf = Boolean.valueOf(selectSponsor3.isShowingDialog);
            boolean changedInstance = r13.changedInstance(selectSponsor3) | r13.changed(delegatingSoftwareKeyboardController3);
            Object rememberedValue3 = r13.rememberedValue();
            if (changedInstance || rememberedValue3 == obj3) {
                i3 = i2;
                focusRequester = focusRequester3;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController3;
                obj = obj3;
                bool = valueOf;
                continuation = null;
                z = true;
                gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(selectSponsor3, delegatingSoftwareKeyboardController, focusRequester, (Continuation) null, 13);
                r13.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
            } else {
                i3 = i2;
                gLSceneScopeProvider$SceneScope$2$1$1 = rememberedValue3;
                focusRequester = focusRequester3;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController3;
                obj = obj3;
                bool = valueOf;
                continuation = null;
                z = true;
            }
            Updater.LaunchedEffect((Composer) r13, bool, (Function2) gLSceneScopeProvider$SceneScope$2$1$1);
            CharSequence charSequence = textFieldState.getValue$foundation().text;
            int i4 = i3 & 7168;
            boolean z2 = ((i3 & 896) == 256 ? z : false) | ((i3 & 112) == 32 ? z : false) | (i4 == 2048 ? z : false);
            Object rememberedValue4 = r13.rememberedValue();
            if (!z2) {
                Object obj4 = obj;
                if (rememberedValue4 == obj4) {
                    obj = obj4;
                } else {
                    selectSponsor2 = selectSponsor;
                    obj2 = obj4;
                    delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                    focusRequester2 = focusRequester;
                    Updater.LaunchedEffect((Composer) r13, charSequence, (Function2) rememberedValue4);
                    rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, r13);
                    List list = selectSponsor2.sections;
                    changed = r13.changed(rememberLazyListState);
                    rememberedValue = r13.rememberedValue();
                    if (!changed || rememberedValue == obj2) {
                        rememberedValue = new MoneyTabUIKt$MoneyTabLoaded$2$1(rememberLazyListState, continuation, 4);
                        r13.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect((Composer) r13, list, (Function2) rememberedValue);
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    LimitInsets limitInsets = new LimitInsets(Arrangement$End$1.current(r13).systemBars, OffsetKt.Horizontal | 16);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.imePadding(SpacerKt.navigationBarsPadding(OffsetKt.windowInsetsPadding(companion, limitInsets))), 1.0f);
                    ?? r18 = continuation;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    colors = (Colors) r13.consume(staticProvidableCompositionLocal);
                    if (colors != null) {
                        colors = re$$ExternalSyntheticOutline0.m((GapComposer) r13, -1762997026, (GapComposer) r13, false);
                    } else {
                        r13.startReplaceGroup(-1762997739);
                        r13.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r13, 0);
                    int hashCode = Long.hashCode(r13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = r13.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(r13, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                        Updater.invalidApplier();
                        throw r18;
                    }
                    r13.startReusableNode();
                    if (r13.inserting) {
                        r13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        r13.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(r13, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(r13, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(r13, valueOf2, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(r13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(r13, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    String str2 = selectSponsor.title;
                    int i5 = i3;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed2 = r13.changed(delegatingSoftwareKeyboardController2) | (i4 == 2048 ? z : false);
                    Object rememberedValue5 = r13.rememberedValue();
                    if (changed2 || rememberedValue5 == obj2) {
                        str = str2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        rememberedValue5 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController2, function1, 5);
                        r13.updateRememberedValue(rememberedValue5);
                    } else {
                        str = str2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    }
                    Object obj5 = obj2;
                    FocusRequester focusRequester4 = focusRequester2;
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, (Function3) null, (Composer) r13, 48, 108);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Colors colors2 = (Colors) r13.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m((GapComposer) r13, -1762997026, (GapComposer) r13, false);
                    } else {
                        r13.startReplaceGroup(-1762997739);
                        r13.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, r13, 48);
                    int hashCode2 = Long.hashCode(r13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r13.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(r13, m177backgroundbw27NRU2);
                    r13.startReusableNode();
                    if (r13.inserting) {
                        r13.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        r13.useNode();
                    }
                    Updater.m576setimpl(r13, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(r13, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, (GapComposer) r13, composeUiNode$Companion$SetModifier$14, (GapComposer) r13, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(r13, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                    Modifier focusRequester5 = FocusTraversalKt.focusRequester(companion, focusRequester4);
                    selectSponsor3 = selectSponsor;
                    SearchBarKt.SearchBar(textFieldState, selectSponsor3.hint, new SearchBarKeyboardState(!selectSponsor3.isShowingDialog), focusRequester5, null, ShowNavigationBack.Never, null, null, null, null, false, null, r13, ((i5 >> 3) & 14) | 196608, 0, 8144);
                    r13.end(true);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean changedInstance2 = r13.changedInstance(selectSponsor3) | (i4 == 2048);
                    Object rememberedValue6 = r13.rememberedValue();
                    if (changedInstance2 || rememberedValue6 == obj5) {
                        function12 = function1;
                        rememberedValue6 = new GLSceneScope$$ExternalSyntheticLambda10(4, selectSponsor3, function12);
                        r13.updateRememberedValue(rememberedValue6);
                    } else {
                        function12 = function1;
                    }
                    LazyDslKt.LazyColumn(layoutWeightElement, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue6, r13, 0, 508);
                    gapComposer = r13;
                    if (selectSponsor3.showSendInviteButton) {
                        gapComposer.startReplaceGroup(1469155225);
                        DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-2014238380, new ArcadeModal2Kt$$ExternalSyntheticLambda0(18, function12, selectSponsor3), gapComposer), gapComposer, 24576, 15);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1469332049);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                }
            }
            delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
            obj2 = obj;
            focusRequester2 = focusRequester;
            selectSponsor2 = selectSponsor;
            GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$12 = new GLSceneScopeProvider$SceneScope$2$1$1(textFieldState, modifier$$ExternalSyntheticLambda0, function1, continuation, 14);
            r13.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$12);
            rememberedValue4 = gLSceneScopeProvider$SceneScope$2$1$12;
            Updater.LaunchedEffect((Composer) r13, charSequence, (Function2) rememberedValue4);
            rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, r13);
            List list2 = selectSponsor2.sections;
            changed = r13.changed(rememberLazyListState);
            rememberedValue = r13.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new MoneyTabUIKt$MoneyTabLoaded$2$1(rememberLazyListState, continuation, 4);
            r13.updateRememberedValue(rememberedValue);
            Updater.LaunchedEffect((Composer) r13, list2, (Function2) rememberedValue);
            WeakHashMap weakHashMap2 = WindowInsetsHolder.viewMap;
            LimitInsets limitInsets2 = new LimitInsets(Arrangement$End$1.current(r13).systemBars, OffsetKt.Horizontal | 16);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(SpacerKt.imePadding(SpacerKt.navigationBarsPadding(OffsetKt.windowInsetsPadding(companion2, limitInsets2))), 1.0f);
            ?? r182 = continuation;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
            colors = (Colors) r13.consume(staticProvidableCompositionLocal2);
            if (colors != null) {
            }
            long j2 = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$12 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU3 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, j2, rectangleShapeKt$RectangleShape$12);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r13, 0);
            int hashCode3 = Long.hashCode(r13.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r13.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(r13, m177backgroundbw27NRU3);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            function12 = function1;
            gapComposer = r13;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(selectSponsor3, i, textFieldState, modifier$$ExternalSyntheticLambda0, function12, 11);
        }
    }
}
