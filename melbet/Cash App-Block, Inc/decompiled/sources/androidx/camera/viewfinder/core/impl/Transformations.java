package androidx.camera.viewfinder.core.impl;

import android.graphics.RectF;
import android.util.Size;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.header.SheetHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.header.SheetHeaderKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.chat.ComposableSingletons$MoneybotChatViewKt;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda24;
import com.squareup.cash.moneybot.views.menu.DropdownItem;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.util.Strings;
import com.squareup.util.compose.TransitionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class Transformations {
    public static final void ChatHistoryAction(Modifier modifier, MoneybotChatViewModel moneybotChatViewModel, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1389067499);
        int i2 = i | (gapComposer2.changedInstance(moneybotChatViewModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            int i3 = i2 & 896;
            boolean changed = gapComposer2.changed(delegatingSoftwareKeyboardController) | (i3 == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, 10);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer2.startReplaceGroup(840975798);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder.add(new DropdownItem(R.string.moneybot_chat_header_item_chat_history, Icons.NavigationChatHistory, (Function0) rememberedValue, 4));
            boolean z = i3 == 256;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == obj) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda21(5, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            createListBuilder.add(new DropdownItem(R.string.moneybot_chat_overflow_item_terms, null, (Function0) rememberedValue2, 6));
            if (moneybotChatViewModel.getShowDebugMenu()) {
                gapComposer2.startReplaceGroup(561226344);
                boolean z2 = i3 == 256;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue3 == obj) {
                    rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda21(6, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                createListBuilder.add(new DropdownItem(R.string.moneybot_overflow_menu_debug_tools, null, (Function0) rememberedValue3, 6));
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(561414700);
                gapComposer2.end(false);
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer2.end(false);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState = (MutableState) rememberedValue4;
            zzd zzdVar = Icons.Companion;
            String stringResource = Room.stringResource(gapComposer2, R.string.moneybot_chat_header_item_overflow);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(Modifier.Companion.$$INSTANCE, 1.0f);
            int i4 = i2 & 7168;
            boolean z3 = i4 == 2048;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue5 == obj) {
                rememberedValue5 = new CashtagViewKt$$ExternalSyntheticLambda13(function12, mutableState, 13);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MenuKt.IconButton((Function0) rememberedValue5, fillMaxHeight, false, null, null, Expect_jvmKt.rememberComposableLambda(-288820751, new PoolCreateViewKt$$ExternalSyntheticLambda5(stringResource), gapComposer2), gapComposer2, 1572912, 60);
            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
            boolean z4 = i4 == 2048;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue6 == obj) {
                rememberedValue6 = new CashtagViewKt$$ExternalSyntheticLambda13(function12, mutableState, 14);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            ExpandableContentKt.m3634ExpandableContent0aeBpQE(build, booleanValue, 250.0f, null, (Function0) rememberedValue6, gapComposer2, MLKEMEngine.KyberPolyBytes, 8);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(modifier, i, moneybotChatViewModel, function1, function12, 27);
        }
    }

    public static final void ChatToolbar(MoneybotChatViewModel moneybotChatViewModel, Function1 function1, Function1 function12, MoneybotToolbarSharedElementConfig moneybotToolbarSharedElementConfig, Composer composer, int i) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(631562732);
        int i2 = i | (gapComposer.changedInstance(moneybotChatViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(moneybotToolbarSharedElementConfig) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(modifier, j, rectangleShapeKt$RectangleShape$1), 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            NavigationType navigationType = NavigationType.CLOSE;
            gapComposer.startReplaceGroup(1341429931);
            Object obj = Composer.Companion.Empty;
            if (moneybotToolbarSharedElementConfig != null) {
                gapComposer.startReplaceGroup(1341431688);
                SharedTransitionScope sharedTransitionScope = moneybotToolbarSharedElementConfig.sharedTransitionScope;
                SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(moneybotToolbarSharedElementConfig.leadingButtonKey, gapComposer, 0);
                AnimatedVisibilityScope animatedVisibilityScope = moneybotToolbarSharedElementConfig.animatedVisibilityScope;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj) {
                    rememberedValue = new SharedBoundsNode$$ExternalSyntheticLambda0(8);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, modifier, rememberSharedContentState, animatedVisibilityScope, null, null, (BoundsTransform) rememberedValue, null, null, 1004);
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
            }
            gapComposer.end(z);
            Modifier titleBarIconBackground = LazyGridKt.titleBarIconBackground(gapComposer, modifier);
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changedInstance(focusOwnerImpl);
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z2 = changed | z;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == obj) {
                rememberedValue2 = new MoneybotChatViewKt$$ExternalSyntheticLambda11(delegatingSoftwareKeyboardController, focusOwnerImpl, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub((String) null, navigationType, m302paddingqDBjuR0$default, (DynamicColorConfiguration) null, (Function0) rememberedValue2, titleBarIconBackground, Expect_jvmKt.rememberComposableLambda(-1007745651, new BasicShieetScope$$ExternalSyntheticLambda0(moneybotChatViewModel, moneybotToolbarSharedElementConfig, function1, function12, 3), gapComposer), gapComposer, 1572918, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyUiFactory$$ExternalSyntheticLambda1(moneybotChatViewModel, function1, function12, moneybotToolbarSharedElementConfig, i, 26);
        }
    }

    public static final void ErrorUI(MoneybotChatViewEvent moneybotChatViewEvent, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(350733968);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(moneybotChatViewEvent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            String stringResource = Room.stringResource(gapComposer, R.string.something_went_wrong);
            String stringResource2 = Room.stringResource(gapComposer, R.string.chat_load_error_subtitle);
            String stringResource3 = Room.stringResource(gapComposer, R.string.try_again);
            int i3 = i2 & 112;
            boolean changedInstance = gapComposer.changedInstance(moneybotChatViewEvent) | (i3 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(6, moneybotChatViewEvent, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            String stringResource4 = Room.stringResource(gapComposer, R.string.close);
            boolean z = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda21(8, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            UtilsKt.m3636FullscreenNotice6RhP_wg(fillMaxSize, stringResource, stringResource2, stringResource3, function0, stringResource4, (Function0) rememberedValue2, 0L, gapComposer, 6, 518);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotChatViewEvent, function1, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneybotChatView(MoneybotChatViewModel moneybotChatViewModel, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Function1 function1, boolean z, ClientRenderablePluginRegistry clientRenderablePluginRegistry, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        ClientRenderablePluginRegistry clientRenderablePluginRegistry2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        ClientRenderablePluginRegistry clientRenderablePluginRegistry3 = clientRenderablePluginRegistry;
        moneybotChatViewModel.getClass();
        realImageLoader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(680155310);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(moneybotChatViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(realImageLoader) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(realCashVibrator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            int i6 = 196608;
            if (i4 == 0) {
                if ((196608 & i) == 0) {
                    i6 = (262144 & i) == 0 ? gapComposer.changed(clientRenderablePluginRegistry3) : gapComposer.changedInstance(clientRenderablePluginRegistry3) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    boolean z4 = i5 == 0 ? z2 : true;
                    if (i4 != 0) {
                        clientRenderablePluginRegistry3 = null;
                    }
                    ClientRenderablePluginRegistry clientRenderablePluginRegistry4 = clientRenderablePluginRegistry3;
                    MoneybotThemeKt.MoneybotTheme(null, null, Expect_jvmKt.rememberComposableLambda(-1026341575, new TooltipKt$$ExternalSyntheticLambda2(z4, realImageLoader, realCashVibrator, clientRenderablePluginRegistry4, moneybotChatViewModel, function1), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes, 3);
                    z3 = z4;
                    clientRenderablePluginRegistry2 = clientRenderablePluginRegistry4;
                } else {
                    gapComposer.skipToGroupEnd();
                    clientRenderablePluginRegistry2 = clientRenderablePluginRegistry3;
                    z3 = z2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(moneybotChatViewModel, realImageLoader, realCashVibrator, function1, z3, clientRenderablePluginRegistry2, i, i2);
                    return;
                }
                return;
            }
            i3 |= i6;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 32;
        int i62 = 196608;
        if (i4 == 0) {
        }
        i3 |= i62;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OverflowMenuAction(int i, Composer composer, Modifier modifier, Function1 function1) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-920513682);
        int i2 = (gapComposer.changedInstance(function1) ? 32 : 16) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(7, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = modifier;
            MenuKt.IconButton((Function0) rememberedValue, modifier2, false, null, null, ComposableSingletons$MoneybotChatViewKt.lambda$1073465740, gapComposer, 1572912, 60);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda24(modifier2, function1, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SheetHeader(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, Function2 function22, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function2 function24;
        Modifier modifier3;
        Function2 function25;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1521592265);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                Function2 function26 = function2;
                i3 |= gapComposer.changedInstance(function26) ? 256 : 128;
                function23 = function26;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function24 = function22;
                    i3 |= gapComposer.changedInstance(function24) ? 2048 : 1024;
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier2;
                        function25 = function23;
                    } else {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (i6 != 0) {
                            modifier2 = companion;
                        }
                        if (i4 != 0) {
                            function23 = null;
                        }
                        if (i5 != 0) {
                            function24 = null;
                        }
                        Modifier modifier4 = modifier2;
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(modifier2, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
                        Strings.getSizes(gapComposer).getClass();
                        DefaultSizes.spacing.getClass();
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m177backgroundbw27NRU, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7);
                        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        int i7 = i3;
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        Strings.getSizes(gapComposer).getClass();
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        Function2 function27 = function24;
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        int i8 = 14;
                        int i9 = 6;
                        if (function23 != null) {
                            gapComposer.startReplaceGroup(158740537);
                            function23.invoke(gapComposer, Integer.valueOf((i7 >> 6) & 14));
                            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(158813573);
                            gapComposer.end(false);
                        }
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                        ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).pageTitle);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(851419037, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, i9), gapComposer), gapComposer, 56);
                        if (function27 != null) {
                            re$$ExternalSyntheticOutline0.m(gapComposer, 159054288, companion, 4.0f, gapComposer);
                            function24 = function27;
                            Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Strings.getTypography(gapComposer).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer).semantic.text.standard, staticProvidableCompositionLocal)}, Expect_jvmKt.rememberComposableLambda(117662603, new ToastKt$$ExternalSyntheticLambda11(i8, function24), gapComposer), gapComposer, 56);
                            gapComposer.end(false);
                        } else {
                            function24 = function27;
                            gapComposer.startReplaceGroup(159320485);
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        gapComposer.end(true);
                        modifier3 = modifier4;
                        function25 = function23;
                    }
                    Function2 function28 = function25;
                    Function2 function29 = function24;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SheetHeaderKt$$ExternalSyntheticLambda2(composableLambdaImpl, modifier3, function28, function29, i, i2, 0);
                        return;
                    }
                    return;
                }
                function24 = function22;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                }
                Function2 function282 = function25;
                Function2 function292 = function24;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
            }
            Function2 function2822 = function25;
            Function2 function2922 = function24;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        Function2 function28222 = function25;
        Function2 function29222 = function24;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void UI(MoneybotChatViewModel moneybotChatViewModel, boolean z, Function1 function1, Composer composer, int i) {
        Transition transition;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1814538031);
        int i2 = (gapComposer.changedInstance(moneybotChatViewModel) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
            boolean isVisibleAndSettled = (animatedVisibilityScope == null || (transition = animatedVisibilityScope.getTransition()) == null) ? true : TransitionsKt.isVisibleAndSettled(transition);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(isVisibleAndSettled, gapComposer);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Boolean valueOf = Boolean.valueOf(isVisibleAndSettled);
            boolean changed = gapComposer.changed(isVisibleAndSettled);
            Object rememberedValue3 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashMapViewKt$CashMapView$3$1(isVisibleAndSettled, mutableState2, continuation, 8);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-1236231818, new PoolToastKt$$ExternalSyntheticLambda0(14, moneybotChatViewModel, function1, mutableState), gapComposer), gapComposer, 6);
            if (moneybotChatViewModel instanceof MoneybotChatViewModel.Error) {
                gapComposer.startReplaceGroup(-1262900878);
                ErrorUI(((MoneybotChatViewModel.Error) moneybotChatViewModel).retryEvent, function1, gapComposer, (i2 >> 3) & 112);
                gapComposer.end(false);
            } else {
                if (!(moneybotChatViewModel instanceof MoneybotChatViewModel.Content)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1262904226, false);
                }
                gapComposer.startReplaceGroup(-495125886);
                MoneybotChatViewModel.Content content = (MoneybotChatViewModel.Content) moneybotChatViewModel;
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new CashMapViewKt$$ExternalSyntheticLambda2(16, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                CardViewApi21Impl.MoneybotLoadedContent(content, function1, booleanValue, z, booleanValue2, (Function0) rememberedValue4, gapComposer, (i2 & 14) | 196608 | ((i2 >> 3) & 112) | ((i2 << 6) & 7168));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotChatViewKt$$ExternalSyntheticLambda2(moneybotChatViewModel, z, function1, i);
        }
    }

    public static RectF cropRectFor(TransformationInfo transformationInfo, Size size) {
        float f = transformationInfo.cropRectLeft;
        boolean isNaN = Float.isNaN(f);
        float f2 = RecyclerView.DECELERATION_RATE;
        if (isNaN) {
            f = 0.0f;
        }
        float f3 = transformationInfo.cropRectTop;
        if (!Float.isNaN(f3)) {
            f2 = f3;
        }
        float f4 = transformationInfo.cropRectRight;
        if (Float.isNaN(f4)) {
            f4 = size.getWidth();
        }
        float f5 = transformationInfo.cropRectBottom;
        if (Float.isNaN(f5)) {
            f5 = size.getHeight();
        }
        return new RectF(f, f2, f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SheetHeader(String str, Modifier modifier, Function2 function2, String str2, Composer composer, int i, int i2) {
        int i3;
        String str3;
        Modifier modifier2;
        Function2 function22;
        String str4;
        RecomposeScopeImpl endRestartGroup;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1256564511);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str2;
            i3 |= gapComposer.changed(str3) ? 2048 : 1024;
            if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                if (i4 != 0) {
                    modifier = Modifier.Companion.$$INSTANCE;
                }
                Modifier modifier3 = modifier;
                ComposableLambdaImpl composableLambdaImpl = null;
                Function2 function23 = i5 != 0 ? null : function2;
                String str5 = i6 != 0 ? null : str3;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1744940066, new TransfersViewKt$$ExternalSyntheticLambda5(str, 10), gapComposer);
                if (str5 != null) {
                    gapComposer.startReplaceGroup(-621341853);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-202392708, new TransfersViewKt$$ExternalSyntheticLambda5(str5, 11), gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-621304467);
                    gapComposer.end(false);
                }
                SheetHeader(rememberComposableLambda, modifier3, function23, composableLambdaImpl, gapComposer, (i3 & 112) | 6 | (i3 & 896), 0);
                str4 = str5;
                modifier2 = modifier3;
                function22 = function23;
            } else {
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
                function22 = function2;
                str4 = str3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SheetHeaderKt$$ExternalSyntheticLambda5(str, modifier2, function22, str4, i, i2, 0);
                return;
            }
            return;
        }
        str3 = str2;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
