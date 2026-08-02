package com.squareup.cash.globalsearch.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.DebugUtils;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityCustomerModel;
import com.squareup.cash.activity.viewmodels.ActivityInviteItemViewModel;
import com.squareup.cash.activity.viewmodels.ContactHeaderViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel$Item$Accessory$ButtonAccessory;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class QuickAccessBarKt {
    public static final ComposableLambdaImpl lambda$452413528 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(3), false, 452413528);
    public static final ComposableLambdaImpl lambda$767857238 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(4), false, 767857238);

    /* renamed from: lambda$-182204128, reason: not valid java name */
    public static final ComposableLambdaImpl f426lambda$182204128 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(5), false, -182204128);

    /* renamed from: lambda$-46438653, reason: not valid java name */
    public static final ComposableLambdaImpl f427lambda$46438653 = new ComposableLambdaImpl(new GlobalSearchCellKt$$ExternalSyntheticLambda6(6), false, -46438653);

    public static final void ErrorToast(GlobalSearchViewModel.ErrorToast errorToast, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-626152428);
        int i2 = (gapComposer.changedInstance(errorToast) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Boolean bool = Boolean.FALSE;
            boolean changedInstance = gapComposer.changedInstance(errorToast);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new FormCashtag.AnonymousClass8.AnonymousClass2(errorToast, continuation, 27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedVisibility(((Boolean) Updater.produceState(bool, errorToast, (Function2) rememberedValue, gapComposer, (i2 & 112) | 6).getValue()).booleanValue(), BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.BottomCenter), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1361959148, new FormView$$ExternalSyntheticLambda0(errorToast, 4), gapComposer), (Composer) gapComposer, 200064, 16);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(errorToast, i, 25);
        }
    }

    public static final void GlobalSearch(Modifier modifier, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, GlobalSearchViewModel globalSearchViewModel, Function1 function1, Composer composer, int i) {
        RealImageLoader realImageLoader2;
        RealCashVibrator realCashVibrator2;
        Modifier modifier2;
        globalSearchViewModel.getClass();
        InputFieldText inputFieldText = globalSearchViewModel.query;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(673851675);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer.changedInstance(realImageLoader2) ? 32 : 16;
        } else {
            realImageLoader2 = realImageLoader;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realCashVibrator2 = realCashVibrator;
            i2 |= gapComposer.changedInstance(realCashVibrator2) ? 256 : 128;
        } else {
            realCashVibrator2 = realCashVibrator;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(globalSearchViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startMovableGroup(-968595132, inputFieldText);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(inputFieldText.getValue().toString(), 0L, gapComposer, 0, 2);
            gapComposer.end(false);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            Boolean valueOf = Boolean.valueOf(rememberLazyListState.scrollableState.isScrollInProgress());
            boolean changed = gapComposer.changed(rememberLazyListState) | gapComposer.changed(rememberSearchBarKeyboardState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new FormCashtag.AnonymousClass8.AnonymousClass2(rememberLazyListState, rememberSearchBarKeyboardState, continuation, 28);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            boolean changed2 = gapComposer.changed(m382rememberTextFieldStateLepunE) | ((i2 & 57344) == 16384);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function1, continuation, 7);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, m382rememberTextFieldStateLepunE, (Function2) rememberedValue3);
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-797959298, new GlobalSearchViewKt$$ExternalSyntheticLambda0(realImageLoader2, realCashVibrator2, globalSearchViewModel, focusRequester, m382rememberTextFieldStateLepunE, rememberSearchBarKeyboardState, function1, rememberLazyListState), gapComposer), gapComposer, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier2, realImageLoader, realCashVibrator, globalSearchViewModel, function1, i, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void GlobalSearchCell(final GlobalSearchViewModel.Item item, Modifier modifier, GlobalSearchFeedKt$$ExternalSyntheticLambda5 globalSearchFeedKt$$ExternalSyntheticLambda5, Composer composer, int i) {
        GapComposer gapComposer;
        item.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1539405864);
        final int i2 = 2;
        int i3 = i | (gapComposer2.changedInstance(item) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changedInstance(globalSearchFeedKt$$ExternalSyntheticLambda5) ? 256 : 128);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            String str = item.key;
            int i5 = i3 & 896;
            boolean changedInstance = (i5 == 256) | gapComposer2.changedInstance(item);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            CellDefaultAccessory.Label label = null;
            Object[] objArr = 0;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CheckStatusPresenter.AnonymousClass1.C00611(globalSearchFeedKt$$ExternalSyntheticLambda5, item, objArr == true ? 1 : 0, 18);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue);
            GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory = item.accessory;
            if (globalSearchViewModel$Item$Accessory$ButtonAccessory == null) {
                gapComposer2.startReplaceGroup(1222515592);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1222515593);
                label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(-1856167996, new FormRemoteImageKt$$ExternalSyntheticLambda0(29, globalSearchViewModel$Item$Accessory$ButtonAccessory, globalSearchFeedKt$$ExternalSyntheticLambda5, item), gapComposer2), 1);
                gapComposer2.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1962057990, new Function2() { // from class: com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    AvatarImage.Remote.Image image;
                    long j2;
                    int i6 = r2;
                    GlobalSearchViewModel.Item item2 = item;
                    int i7 = 0;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                GlobalSearchViewModel.Avatar avatar = item2.avatar;
                                if (avatar == null) {
                                    gapComposer3.startReplaceGroup(-1459611687);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1459611686);
                                    AvatarSize avatarSize = AvatarSize.Size48;
                                    String str2 = avatar.monogram;
                                    ColorModel.Accented accented = avatar.backgroundColor;
                                    gapComposer3.startReplaceGroup(940760174);
                                    Color forTheme = ThemablesKt.forTheme(accented, gapComposer3);
                                    gapComposer3.end(false);
                                    if (forTheme == null) {
                                        gapComposer3.startReplaceGroup(940761866);
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        j = colors.semantic.background.subtle;
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(940759479);
                                        gapComposer3.end(false);
                                        j = forTheme.value;
                                    }
                                    long j3 = j;
                                    Image image2 = avatar.photo;
                                    if (image2 == null) {
                                        gapComposer3.startReplaceGroup(-901090202);
                                        gapComposer3.end(false);
                                        image = null;
                                    } else {
                                        gapComposer3.startReplaceGroup(-901090201);
                                        AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer3), false, null, 0L, new GlobalSearchCellKt$$ExternalSyntheticLambda6(i7), 62);
                                        gapComposer3.end(false);
                                        image = image3;
                                    }
                                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j3, (String) null, (Modifier) null, (AvatarImage) image, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3078, 0, 2000);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Icons icons = item2.titleIcon;
                                String str3 = item2.title;
                                if ((icons == null ? -1 : GlobalSearchCellKt$WhenMappings.$EnumSwitchMapping$0[icons.ordinal()]) == -1) {
                                    gapComposer4.startReplaceGroup(-2121167152);
                                    gapComposer4.startReplaceGroup(-2121167152);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(901408804);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer4, 48);
                                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    gapComposer4.startReplaceGroup(-528448131);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) new LayoutWeightElement(1.0f, false), (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    Strings.getSizes(gapComposer4).getClass();
                                    DefaultSizes.spacing.getClass();
                                    Modifier m281requiredSize3ABfNKs = SizeKt.m281requiredSize3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
                                    int ordinal = icons.ordinal();
                                    if (ordinal == 0) {
                                        gapComposer4.startReplaceGroup(-1125412412);
                                        j2 = Strings.getColors(gapComposer4).semantic.icon.info;
                                        gapComposer4.end(false);
                                    } else if (ordinal != 104) {
                                        gapComposer4.startReplaceGroup(-1125408949);
                                        gapComposer4.end(false);
                                        j2 = Color.Unspecified;
                                    } else {
                                        gapComposer4.startReplaceGroup(-1125409979);
                                        j2 = Strings.getColors(gapComposer4).semantic.icon.brand;
                                        gapComposer4.end(false);
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, m281requiredSize3ABfNKs, j2, gapComposer4, 48, 0);
                                    gapComposer4.end(true);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str4 = item2.subtitle;
                                if (str4 == null) {
                                    gapComposer5.startReplaceGroup(-1795790480);
                                } else {
                                    gapComposer5.startReplaceGroup(-1795790479);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                }
                                gapComposer5.end(false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(398702907, new Function2() { // from class: com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    AvatarImage.Remote.Image image;
                    long j2;
                    int i6 = i4;
                    GlobalSearchViewModel.Item item2 = item;
                    int i7 = 0;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                GlobalSearchViewModel.Avatar avatar = item2.avatar;
                                if (avatar == null) {
                                    gapComposer3.startReplaceGroup(-1459611687);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1459611686);
                                    AvatarSize avatarSize = AvatarSize.Size48;
                                    String str2 = avatar.monogram;
                                    ColorModel.Accented accented = avatar.backgroundColor;
                                    gapComposer3.startReplaceGroup(940760174);
                                    Color forTheme = ThemablesKt.forTheme(accented, gapComposer3);
                                    gapComposer3.end(false);
                                    if (forTheme == null) {
                                        gapComposer3.startReplaceGroup(940761866);
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        j = colors.semantic.background.subtle;
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(940759479);
                                        gapComposer3.end(false);
                                        j = forTheme.value;
                                    }
                                    long j3 = j;
                                    Image image2 = avatar.photo;
                                    if (image2 == null) {
                                        gapComposer3.startReplaceGroup(-901090202);
                                        gapComposer3.end(false);
                                        image = null;
                                    } else {
                                        gapComposer3.startReplaceGroup(-901090201);
                                        AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer3), false, null, 0L, new GlobalSearchCellKt$$ExternalSyntheticLambda6(i7), 62);
                                        gapComposer3.end(false);
                                        image = image3;
                                    }
                                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j3, (String) null, (Modifier) null, (AvatarImage) image, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3078, 0, 2000);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Icons icons = item2.titleIcon;
                                String str3 = item2.title;
                                if ((icons == null ? -1 : GlobalSearchCellKt$WhenMappings.$EnumSwitchMapping$0[icons.ordinal()]) == -1) {
                                    gapComposer4.startReplaceGroup(-2121167152);
                                    gapComposer4.startReplaceGroup(-2121167152);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(901408804);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer4, 48);
                                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    gapComposer4.startReplaceGroup(-528448131);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) new LayoutWeightElement(1.0f, false), (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    Strings.getSizes(gapComposer4).getClass();
                                    DefaultSizes.spacing.getClass();
                                    Modifier m281requiredSize3ABfNKs = SizeKt.m281requiredSize3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
                                    int ordinal = icons.ordinal();
                                    if (ordinal == 0) {
                                        gapComposer4.startReplaceGroup(-1125412412);
                                        j2 = Strings.getColors(gapComposer4).semantic.icon.info;
                                        gapComposer4.end(false);
                                    } else if (ordinal != 104) {
                                        gapComposer4.startReplaceGroup(-1125408949);
                                        gapComposer4.end(false);
                                        j2 = Color.Unspecified;
                                    } else {
                                        gapComposer4.startReplaceGroup(-1125409979);
                                        j2 = Strings.getColors(gapComposer4).semantic.icon.brand;
                                        gapComposer4.end(false);
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, m281requiredSize3ABfNKs, j2, gapComposer4, 48, 0);
                                    gapComposer4.end(true);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str4 = item2.subtitle;
                                if (str4 == null) {
                                    gapComposer5.startReplaceGroup(-1795790480);
                                } else {
                                    gapComposer5.startReplaceGroup(-1795790479);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                }
                                gapComposer5.end(false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2);
            int i6 = (gapComposer2.changedInstance(item) ? 1 : 0) | (i5 == 256 ? 1 : 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (i6 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(28, item, globalSearchFeedKt$$ExternalSyntheticLambda5);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, modifier, (Function0) rememberedValue2, null, false, false, Expect_jvmKt.rememberComposableLambda(1678366401, new Function2() { // from class: com.squareup.cash.globalsearch.views.GlobalSearchCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long j;
                    AvatarImage.Remote.Image image;
                    long j2;
                    int i62 = i2;
                    GlobalSearchViewModel.Item item2 = item;
                    int i7 = 0;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                GlobalSearchViewModel.Avatar avatar = item2.avatar;
                                if (avatar == null) {
                                    gapComposer3.startReplaceGroup(-1459611687);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1459611686);
                                    AvatarSize avatarSize = AvatarSize.Size48;
                                    String str2 = avatar.monogram;
                                    ColorModel.Accented accented = avatar.backgroundColor;
                                    gapComposer3.startReplaceGroup(940760174);
                                    Color forTheme = ThemablesKt.forTheme(accented, gapComposer3);
                                    gapComposer3.end(false);
                                    if (forTheme == null) {
                                        gapComposer3.startReplaceGroup(940761866);
                                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                        if (colors == null) {
                                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1762997739);
                                            gapComposer3.end(false);
                                        }
                                        j = colors.semantic.background.subtle;
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(940759479);
                                        gapComposer3.end(false);
                                        j = forTheme.value;
                                    }
                                    long j3 = j;
                                    Image image2 = avatar.photo;
                                    if (image2 == null) {
                                        gapComposer3.startReplaceGroup(-901090202);
                                        gapComposer3.end(false);
                                        image = null;
                                    } else {
                                        gapComposer3.startReplaceGroup(-901090201);
                                        AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer3), false, null, 0L, new GlobalSearchCellKt$$ExternalSyntheticLambda6(i7), 62);
                                        gapComposer3.end(false);
                                        image = image3;
                                    }
                                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j3, (String) null, (Modifier) null, (AvatarImage) image, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer3, 3078, 0, 2000);
                                    gapComposer3.end(false);
                                }
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Icons icons = item2.titleIcon;
                                String str3 = item2.title;
                                if ((icons == null ? -1 : GlobalSearchCellKt$WhenMappings.$EnumSwitchMapping$0[icons.ordinal()]) == -1) {
                                    gapComposer4.startReplaceGroup(-2121167152);
                                    gapComposer4.startReplaceGroup(-2121167152);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.startReplaceGroup(901408804);
                                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer4, 48);
                                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    gapComposer4.startReplaceGroup(-528448131);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, (Modifier) new LayoutWeightElement(1.0f, false), (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                    Strings.getSizes(gapComposer4).getClass();
                                    DefaultSizes.spacing.getClass();
                                    Modifier m281requiredSize3ABfNKs = SizeKt.m281requiredSize3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 16.0f);
                                    int ordinal = icons.ordinal();
                                    if (ordinal == 0) {
                                        gapComposer4.startReplaceGroup(-1125412412);
                                        j2 = Strings.getColors(gapComposer4).semantic.icon.info;
                                        gapComposer4.end(false);
                                    } else if (ordinal != 104) {
                                        gapComposer4.startReplaceGroup(-1125408949);
                                        gapComposer4.end(false);
                                        j2 = Color.Unspecified;
                                    } else {
                                        gapComposer4.startReplaceGroup(-1125409979);
                                        j2 = Strings.getColors(gapComposer4).semantic.icon.brand;
                                        gapComposer4.end(false);
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, m281requiredSize3ABfNKs, j2, gapComposer4, 48, 0);
                                    gapComposer4.end(true);
                                    gapComposer4.end(false);
                                }
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str4 = item2.subtitle;
                                if (str4 == null) {
                                    gapComposer5.startReplaceGroup(-1795790480);
                                } else {
                                    gapComposer5.startReplaceGroup(-1795790479);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                }
                                gapComposer5.end(false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer2), null, label, 0L, null, gapComposer, ((i3 << 3) & 896) | 12582966, 0, 3440);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) item, (Object) modifier, (Function) globalSearchFeedKt$$ExternalSyntheticLambda5, i, 1);
        }
    }

    public static final void GlobalSearchFeed(GlobalSearchViewModel globalSearchViewModel, LazyListState lazyListState, Function1 function1, Function0 function0, Composer composer, int i) {
        globalSearchViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-229289224);
        int i2 = i | (gapComposer.changedInstance(globalSearchViewModel) ? 4 : 2) | (gapComposer.changed(lazyListState) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changedInstance = gapComposer.changedInstance(globalSearchViewModel) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(13, globalSearchViewModel, function0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(null, lazyListState, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, i2 & 112, 509);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(globalSearchViewModel, i, lazyListState, function1, function0, 9);
        }
    }

    public static final void QuickAccessBar(GlobalSearchViewModel.QabSection qabSection, Modifier modifier, Function1 function1, Composer composer, int i) {
        ContactHeaderViewModel contactHeaderViewModel = qabSection.model;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1341673998);
        int i2 = i | (gapComposer.changedInstance(qabSection) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ActivityInviteItemViewModel activityInviteItemViewModel = contactHeaderViewModel.inviteItemViewModel;
            gapComposer.startReplaceGroup(858530672);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (activityInviteItemViewModel instanceof ActivityInviteItemViewModel.Ready) {
                gapComposer.startReplaceGroup(-1331281158);
                createListBuilder.add(new AvatarCarouselEntry(((ActivityInviteItemViewModel.Ready) activityInviteItemViewModel).text, "invite_friends", new AvatarEntry(Marker.ANY_NON_NULL_MARKER, Strings.getColors(gapComposer).semantic.background.f1047app, null, new AvatarImage.LocalIcon(Icons.Add32, Strings.getColors(gapComposer).semantic.icon.standard, 4), null, null, new Color(Strings.getColors(gapComposer).semantic.border.subtle), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE), Room.stringResource(gapComposer, R.string.qab_view_offer), 8));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1331224459);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(858535748);
            List<ActivityCustomerModel> list = contactHeaderViewModel.recipients;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ActivityCustomerModel activityCustomerModel : list) {
                AvatarViewModel avatarViewModel = activityCustomerModel.avatar;
                String str = avatarViewModel.displayName;
                if (str == null) {
                    str = activityCustomerModel.displayName;
                }
                createListBuilder.add(new AvatarCarouselEntry(str, activityCustomerModel.customerId, AvatarsKt.toAvatarEntry(avatarViewModel, gapComposer), null, 24));
                arrayList.add(Boolean.TRUE);
            }
            gapComposer.end(false);
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.end(false);
            ImmutableList immutableList = Tags.toImmutableList(build);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(29, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DebugUtils.AvatarCarousel(immutableList, (Function1) rememberedValue, m302paddingqDBjuR0$default, null, gapComposer, 0, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) qabSection, (Object) modifier, (Function) function1, i, 0);
        }
    }

    public static final void SectionTrailer(LazyListScope lazyListScope, GlobalSearchViewModel.Section section) {
        GlobalSearchViewModel.SectionTrailer trailer = ((GlobalSearchViewModel.HasSectionTrailer) section).getTrailer();
        int i = 1;
        if (Intrinsics.areEqual(trailer, GlobalSearchViewModel.SectionTrailer.LoadMoreButton.INSTANCE)) {
            LazyListScope.item$default(lazyListScope, Recorder$$ExternalSyntheticOutline2.m$1(section.getKey(), " show more"), null, new ComposableLambdaImpl(new GlobalSearchFeedKt$$ExternalSyntheticLambda4(section, i), true, -1611829769), 2);
            return;
        }
        if (Intrinsics.areEqual(trailer, GlobalSearchViewModel.SectionTrailer.LoadingSpinner.INSTANCE)) {
            LazyListScope.item$default(lazyListScope, Recorder$$ExternalSyntheticOutline2.m$1(section.getKey(), " loading"), null, f426lambda$182204128, 2);
            return;
        }
        if (trailer instanceof GlobalSearchViewModel.SectionTrailer.WarningModal) {
            LazyListScope.item$default(lazyListScope, Recorder$$ExternalSyntheticOutline2.m$1(section.getKey(), " warning modal"), null, new ComposableLambdaImpl(new MoneyTabBookletKt$$ExternalSyntheticLambda4(7, (GlobalSearchViewModel.SectionTrailer.WarningModal) trailer, section), true, 1418961919), 2);
        } else {
            if (trailer == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public static final void ShowMore(LazyItemScopeImpl lazyItemScopeImpl, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-402738533);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(lazyItemScopeImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, function0, 15), 16.0f));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateItem$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.search_show_more), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            Trace.m1191Iconww6aTOc(Icons.SubtleExpand16, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, 54, 4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(lazyItemScopeImpl, function0, i, 3);
        }
    }

    public static final void ShowMoreLoading(LazyItemScopeImpl lazyItemScopeImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1176998817);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(lazyItemScopeImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateItem$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(lazyItemScopeImpl, i, 23);
        }
    }

    public static final void WarningModal(LazyItemScopeImpl lazyItemScopeImpl, String str, String str2, Function0 function0, Composer composer, int i) {
        int i2;
        String str3;
        Function0 function02;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1335218916);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(lazyItemScopeImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= gapComposer2.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer2.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, SizeKt.fillMaxWidth(companion, 1.0f));
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(animateItem$default, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer2).semantic.background.subtle, ColorKt.RectangleShape), false, null, null, function02, 15), 16.0f, 16.0f, 8.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4080, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-2016245128, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 0), gapComposer2), gapComposer2, ((i2 >> 9) & 14) | 1572864, 62);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda2(i, 13, lazyItemScopeImpl, str, str2, function0, false);
        }
    }

    public static final TransitionFactory.CustomTransition access$globalSearchToMainTab() {
        return new TransitionFactory.CustomTransition(EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, null, 5), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 1000.0f, null, 5), 2).plus(EnterExitTransitionKt.slideOutVertically(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, null, 5), GlobalSearchTransitionFactoryKt$globalSearchToMainTab$1.INSTANCE)), false);
    }

    public static final TransitionFactory.CustomTransition access$mainTabToGlobalSearch() {
        return new TransitionFactory.CustomTransition(EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, null, 5), 2).plus(EnterExitTransitionKt.slideInVertically(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 200.0f, null, 5), GlobalSearchTransitionFactoryKt$mainTabToGlobalSearch$1.INSTANCE)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 1000.0f, null, 5), 2), false);
    }
}
