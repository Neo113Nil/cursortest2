package com.squareup.cash.activity.views;

import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.network.NetworkFetcher$doFetch$2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityGrouping;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.viewmodels.fixtures.ActivityFixturesKt;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$2$1;
import com.squareup.cash.overlays.OverlayKt;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class ActivityTabViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        new ActivityTabViewModel(TabToolbarInternalViewModel.EMPTY, null, false, false, false, new InputFieldText.Simple(""), CollectionsKt__CollectionsKt.listOf((Object[]) new ActivityFeedEntry[]{new ActivityFeedEntry.Header(ActivityGrouping.ByToday.INSTANCE, "Today", null), new ActivityFeedEntry.Item(ActivityFixturesKt.activityItemFixture$default(null, 7, (char) 0))}), ActivityTabViewModel.ScrollToTop.Initial, null, null, false, false);
    }

    public static final void ActivityFeed(Modifier modifier, ActivityTabViewModel activityTabViewModel, Function1 function1, LazyListState lazyListState, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1192740513);
        int i2 = i | (gapComposer.changedInstance(activityTabViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(lazyListState) ? 2048 : 1024) | (gapComposer.changedInstance(realScrollPerformanceTrackerFactory) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startReplaceGroup(-532625494);
            Modifier testTag = TestTagKt.testTag(modifier, "ActivityFeed");
            boolean z = activityTabViewModel.attachScrollLogging;
            Object obj = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-532624138);
                PerformanceMeasureScrollPerformance.Element element = PerformanceMeasureScrollPerformance.Element.ACTIVITY_MAIN;
                float refreshRate = ((View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView)).getDisplay().getRefreshRate();
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier trackScrollPerformance = realScrollPerformanceTrackerFactory.trackScrollPerformance(element, lazyListState, refreshRate, (CoroutineScope) rememberedValue);
                gapComposer.end(false);
                testTag = testTag.then(trackScrollPerformance);
            }
            gapComposer.end(false);
            InsetsPaddingValues asPaddingValues = SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer.consume(CashInsetsKt.LocalCashInsets)).floatingBottomNavigation, gapComposer);
            int i3 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(activityTabViewModel) | (i3 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new CombinedModifier$$ExternalSyntheticLambda0(21, activityTabViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LazyDslKt.LazyColumn(testTag, lazyListState, asPaddingValues, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, (i2 >> 6) & 112, 504);
            InlineAppMessageV2ViewModel.Ready ready = activityTabViewModel.dismissedInlineMessage;
            if (ready == null) {
                gapComposer.startReplaceGroup(677025044);
                gapComposer.end(false);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(677025045);
                boolean changedInstance2 = gapComposer.changedInstance(ready) | (i3 == 256);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue3 == obj) {
                    function12 = function1;
                    rememberedValue3 = new ActivityTabViewKt$$ExternalSyntheticLambda12(function12, ready, 0);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    function12 = function1;
                }
                Function0 function0 = (Function0) rememberedValue3;
                boolean changedInstance3 = gapComposer.changedInstance(ready) | (i3 == 256);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue4 == obj) {
                    rememberedValue4 = new ActivityTabViewKt$$ExternalSyntheticLambda12(function12, ready, 1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                UndoMessageToast(function0, (Function0) rememberedValue4, gapComposer, 0);
                gapComposer.end(false);
            }
            CardAppMessageViewModel.Ready ready2 = activityTabViewModel.dismissedCardMessage;
            if (ready2 == null) {
                gapComposer.startReplaceGroup(677450147);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(677450148);
                boolean changedInstance4 = gapComposer.changedInstance(ready2) | (i3 == 256);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance4 || rememberedValue5 == obj) {
                    rememberedValue5 = new ActivityTabViewKt$$ExternalSyntheticLambda14(function12, ready2, 0);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Function0 function02 = (Function0) rememberedValue5;
                boolean changedInstance5 = gapComposer.changedInstance(ready2) | (i3 == 256);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance5 || rememberedValue6 == obj) {
                    rememberedValue6 = new ActivityTabViewKt$$ExternalSyntheticLambda14(function12, ready2, 1);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                AvatarsKt.MessageDismissModal(function02, (Function0) rememberedValue6, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(modifier, (Object) activityTabViewModel, (Object) function12, (Object) lazyListState, (Object) realScrollPerformanceTrackerFactory, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityTab(ActivityTabViewModel activityTabViewModel, Function1 function1, RealCashVibrator realCashVibrator, RealImageLoader realImageLoader, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, boolean z, Composer composer, int i, int i2) {
        int i3;
        RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory2;
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        activityTabViewModel.getClass();
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1584937066);
        int i4 = 4;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(activityTabViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(realCashVibrator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(realImageLoader) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            realScrollPerformanceTrackerFactory2 = realScrollPerformanceTrackerFactory;
            i3 |= gapComposer.changedInstance(realScrollPerformanceTrackerFactory2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            realScrollPerformanceTrackerFactory2 = realScrollPerformanceTrackerFactory;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                if (i5 != 0) {
                    z2 = false;
                }
                SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer);
                LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
                Boolean valueOf = Boolean.valueOf(activityTabViewModel.isRefreshing);
                int i6 = i3 & 112;
                boolean changedInstance = gapComposer.changedInstance(activityTabViewModel) | (i6 == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                Continuation continuation = null;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SearchBarBinding$Content$1$1(activityTabViewModel, function1, continuation, i4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue);
                Boolean valueOf2 = Boolean.valueOf(rememberLazyListState.scrollableState.isScrollInProgress());
                boolean changedInstance2 = gapComposer.changedInstance(activityTabViewModel) | gapComposer.changed(rememberSearchBarKeyboardState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SearchBarBinding$Content$1$1(activityTabViewModel, rememberSearchBarKeyboardState, continuation, 5);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue2);
                ActivityTabViewModel.ScrollToTop scrollToTop = activityTabViewModel.scrollToTopCounter;
                boolean changedInstance3 = gapComposer.changedInstance(activityTabViewModel) | gapComposer.changed(rememberLazyListState);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new NetworkFetcher$doFetch$2(activityTabViewModel, rememberLazyListState, continuation, 25);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, scrollToTop, (Function2) rememberedValue3);
                Unit unit = Unit.INSTANCE;
                boolean changed = gapComposer.changed(rememberLazyListState) | (i6 == 32);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new SearchBarBinding$Content$1$1(rememberLazyListState, function1, continuation, 6);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(activityTabViewModel.feedEntries, gapComposer);
                boolean changed2 = gapComposer.changed(rememberUpdatedState) | gapComposer.changed(rememberLazyListState);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new MoneyTabUIKt$MoneyTabLoaded$4$2$1(rememberUpdatedState, rememberLazyListState, null);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
                boolean z4 = z2;
                Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(-1236042666, new ActivityTabViewKt$$ExternalSyntheticLambda0(activityTabViewModel, function1, z4, rememberLazyListState, realScrollPerformanceTrackerFactory2, 0), gapComposer), gapComposer, 56);
                z3 = z4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(activityTabViewModel, function1, realCashVibrator, realImageLoader, realScrollPerformanceTrackerFactory, z3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void NewUserExperience(ActivityFeedEntry.NewUserExperience newUserExperience, Function1 function1, Composer composer, int i) {
        ActivityFeedEntry.NewUserExperience newUserExperience2;
        Function1 function12;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1067268755);
        int i2 = i | (gapComposer2.changedInstance(newUserExperience) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, 16.0f, 32.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ImageKt.Image(Countries.painterResource(R.drawable.nux_fish_bowl, 0, gapComposer2), null, SizeKt.m277height3ABfNKs(companion, 180.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer2, Painter.$stable | 432, 120);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            String stringResource = Room.stringResource(gapComposer2, R.string.activity_nux_title);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).labelMedium, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.activity_nux_description), (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            newUserExperience2 = newUserExperience;
            String str = newUserExperience2.inviteFriendsText;
            if (str == null) {
                gapComposer.startReplaceGroup(-309545312);
                gapComposer.end(false);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-309545311);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    function12 = function1;
                    rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(17, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    function12 = function1;
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-285059053, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 11), gapComposer), gapComposer, 1572864, 62);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            newUserExperience2 = newUserExperience;
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(newUserExperience2, function12, i, 21);
        }
    }

    public static final void UndoMessageToast(Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2021546816);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changedInstance(function02) ? 32 : 16);
        int i3 = 0;
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MotionKt$$ExternalSyntheticLambda0(14);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OverlayKt.Overlay((Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1742944388, new ActivityTabViewKt$$ExternalSyntheticLambda19(function02, function0, i3), gapComposer), gapComposer, 54);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActivityTabViewKt$$ExternalSyntheticLambda19(function0, function02, i, i4);
        }
    }

    public static final AvatarEntry createInviteFriendsAvatar(GapComposer gapComposer) {
        return new AvatarEntry(Marker.ANY_NON_NULL_MARKER, Strings.getColors(gapComposer).semantic.background.f1047app, null, new AvatarImage.LocalIcon(Icons.Add32, Strings.getColors(gapComposer).semantic.icon.standard, 4), null, null, new Color(Strings.getColors(gapComposer).semantic.border.subtle), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
    }
}
