package com.squareup.cash.moneybot.views.history;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda9;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public abstract class MoneybotChatHistoryViewKt {

    /* renamed from: lambda$-467157843, reason: not valid java name */
    public static final ComposableLambdaImpl f481lambda$467157843 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(13), false, -467157843);

    /* renamed from: lambda$-269802467, reason: not valid java name */
    public static final ComposableLambdaImpl f480lambda$269802467 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(14), false, -269802467);
    public static final ComposableLambdaImpl lambda$1381550448 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(15), false, 1381550448);

    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.datastore.core.SimpleActor, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public static final void ChatHistory(MoneybotChatHistoryViewModel.Content content, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        int i3;
        Object realKeyStoreProvider$setEntry$2;
        MutableState mutableState;
        String str;
        SnapshotStateMap snapshotStateMap;
        Object realKeyStoreProvider$setEntry$22;
        NestedScrollConnection nestedScrollConnection;
        Boolean bool;
        Boolean bool2;
        MutableState mutableState2;
        Continuation continuation;
        MutableState mutableState3;
        ?? r10;
        LazyListState lazyListState;
        String m;
        MoneybotChatHistoryViewModel.Content content2 = content;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2045843053);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(content2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            final LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState4 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState5 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = new SnapshotStateMap();
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState6 = (MutableState) rememberedValue4;
            String str2 = content2.deleteConfirmationSessionId;
            boolean z = content2.hasMoreSessions;
            boolean changedInstance = gapComposer2.changedInstance(content2);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue5 == obj) {
                mutableState = mutableState5;
                str = str2;
                realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(content2, snapshotStateMap2, mutableState6, (Continuation) null, 13);
                snapshotStateMap = snapshotStateMap2;
                gapComposer2.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            } else {
                snapshotStateMap = snapshotStateMap2;
                mutableState = mutableState5;
                realKeyStoreProvider$setEntry$2 = rememberedValue5;
                str = str2;
            }
            Updater.LaunchedEffect(gapComposer2, str, (Function2) realKeyStoreProvider$setEntry$2);
            int i5 = i4 & 112;
            boolean changedInstance2 = gapComposer2.changedInstance(content2) | (i5 == 32);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue6 == obj) {
                rememberedValue6 = new BasicShieetScope$$ExternalSyntheticLambda10(5, content2, function1, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MutableState rememberUpdatedState = Updater.rememberUpdatedState((Function0) rememberedValue6, gapComposer2);
            boolean changed = gapComposer2.changed(rememberLazyListState);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed || rememberedValue7 == obj) {
                final CashMapViewKt$$ExternalSyntheticLambda2 cashMapViewKt$$ExternalSyntheticLambda2 = new CashMapViewKt$$ExternalSyntheticLambda2(22, rememberUpdatedState);
                rememberedValue7 = new NestedScrollConnection() { // from class: com.squareup.cash.moneybot.views.history.MoneybotChatHistoryViewKt$overscrollAtBottomConnection$1
                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* renamed from: onPostScroll-DzOQY0M */
                    public final long mo242onPostScrollDzOQY0M(int i6, long j, long j2) {
                        if (Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j2)) >= RecyclerView.DECELERATION_RATE || LazyListState.this.getCanScrollForward()) {
                            return 0L;
                        }
                        cashMapViewKt$$ExternalSyntheticLambda2.invoke();
                        return 0L;
                    }

                    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
                    /* renamed from: onPreScroll-OzD1aCk */
                    public final long mo326onPreScrollOzD1aCk(int i6, long j) {
                        if (Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) >= RecyclerView.DECELERATION_RATE || !LazyListState.this.getLayoutInfo().visibleItemsInfo.isEmpty()) {
                            return 0L;
                        }
                        cashMapViewKt$$ExternalSyntheticLambda2.invoke();
                        return 0L;
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            NestedScrollConnection nestedScrollConnection2 = (NestedScrollConnection) rememberedValue7;
            Boolean valueOf = Boolean.valueOf(content2.loadingNextPage);
            Boolean valueOf2 = Boolean.valueOf(z);
            boolean changedInstance3 = gapComposer2.changedInstance(content2);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue8 == obj) {
                MutableState mutableState7 = mutableState;
                nestedScrollConnection = nestedScrollConnection2;
                bool = valueOf2;
                bool2 = valueOf;
                mutableState2 = mutableState4;
                continuation = null;
                realKeyStoreProvider$setEntry$22 = new RealKeyStoreProvider$setEntry$2(content2, mutableState7, mutableState2, continuation, 14);
                mutableState3 = mutableState7;
                gapComposer2.updateRememberedValue(realKeyStoreProvider$setEntry$22);
            } else {
                bool2 = valueOf;
                bool = valueOf2;
                realKeyStoreProvider$setEntry$22 = rememberedValue8;
                mutableState3 = mutableState;
                mutableState2 = mutableState4;
                continuation = null;
                nestedScrollConnection = nestedScrollConnection2;
            }
            Updater.LaunchedEffect(bool2, bool, (Function2) realKeyStoreProvider$setEntry$22, gapComposer2);
            Boolean valueOf3 = Boolean.valueOf(z);
            boolean changed2 = gapComposer2.changed(rememberLazyListState) | gapComposer2.changedInstance(content2) | gapComposer2.changed(rememberUpdatedState);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue9 == obj) {
                r10 = continuation;
                Object musicPresenter$models$1$1 = new MusicPresenter$models$1$1(rememberLazyListState, content2, mutableState2, rememberUpdatedState, null, 17);
                lazyListState = rememberLazyListState;
                content2 = content2;
                gapComposer2.updateRememberedValue(musicPresenter$models$1$1);
                rememberedValue9 = musicPresenter$models$1$1;
            } else {
                r10 = continuation;
                lazyListState = rememberLazyListState;
            }
            Updater.LaunchedEffect(lazyListState, valueOf3, (Function2) rememberedValue9, gapComposer2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw r10;
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
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxHeight(companion, 1.0f), nestedScrollConnection, r10);
            boolean changedInstance4 = gapComposer2.changedInstance(content2) | (i5 == 32);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue10 == obj) {
                function12 = function1;
                Object bankingConfigQueries$$ExternalSyntheticLambda0 = new BankingConfigQueries$$ExternalSyntheticLambda0(content2, snapshotStateMap, function12, mutableState3, 22);
                gapComposer2.updateRememberedValue(bankingConfigQueries$$ExternalSyntheticLambda0);
                rememberedValue10 = bankingConfigQueries$$ExternalSyntheticLambda0;
            } else {
                function12 = function1;
            }
            i3 = 18;
            LazyDslKt.LazyColumn(nestedScroll, lazyListState, null, null, null, null, false, null, (Function1) rememberedValue10, gapComposer2, 0, 508);
            gapComposer = gapComposer2;
            MoneybotChatHistoryViewModel.Content.Error error = content2.error;
            if (error == null) {
                gapComposer.startReplaceGroup(1156899516);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1156899517);
                if (error.equals(MoneybotChatHistoryViewModel.Content.Error.LoadingNextPage.INSTANCE)) {
                    m = re$$ExternalSyntheticOutline0.m(gapComposer, -1735914599, R.string.moneybot_chat_history_load_next_page_error, gapComposer, false);
                } else {
                    if (!error.equals(MoneybotChatHistoryViewModel.Content.Error.Delete.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1735916673, false);
                    }
                    m = re$$ExternalSyntheticOutline0.m(gapComposer, -1735911351, R.string.moneybot_delete_chat_error, gapComposer, false);
                }
                String str3 = m;
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ModalKt.m3381ToastBAHpl2s(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7), null, str3, f481lambda$467157843, null, null, null, gapComposer, 3072, 498);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            i3 = 18;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(content2, function12, i, i3);
        }
    }

    public static final void DeleteChatConfirmationDialog(Function0 function0, Function0 function02, Composer composer, int i) {
        Function0 function03;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1317147797);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changedInstance(function02) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            function03 = function02;
            ModalKt.Dimmer(null, function03, null, Expect_jvmKt.rememberComposableLambda(1326022674, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function0, function02, i2), gapComposer), gapComposer, (i3 & 112) | 3072, 5);
        } else {
            function03 = function02;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActivityTabViewKt$$ExternalSyntheticLambda19(function0, function03, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x020a, code lost:
    
        if (r9 == r8) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ef  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneybotChatHistoryView(MoneybotChatHistoryViewModel moneybotChatHistoryViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        boolean z;
        ?? r1;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        Function1 function13;
        char c;
        NeverEqualPolicy neverEqualPolicy2;
        String str;
        moneybotChatHistoryViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(541551705);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(moneybotChatHistoryViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
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
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
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
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy3) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda21(15, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            GapComposer gapComposer3 = gapComposer2;
            boolean z3 = moneybotChatHistoryViewModel instanceof MoneybotChatHistoryViewModel.Content;
            if (z3) {
                gapComposer3.startReplaceGroup(-1701105814);
                ChatHistory((MoneybotChatHistoryViewModel.Content) moneybotChatHistoryViewModel, function1, gapComposer3, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer3.end(false);
            } else if (moneybotChatHistoryViewModel instanceof MoneybotChatHistoryViewModel.Loading) {
                gapComposer3.startReplaceGroup(-1194601256);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize2);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer3, SizeKt.m285size3ABfNKs(companion, 24.0f));
                gapComposer3.end(true);
                gapComposer3.end(false);
            } else {
                if (moneybotChatHistoryViewModel.equals(MoneybotChatHistoryViewModel.Error.INSTANCE)) {
                    gapComposer3.startReplaceGroup(-1701094596);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    String stringResource = Room.stringResource(gapComposer3, R.string.something_went_wrong);
                    String stringResource2 = Room.stringResource(gapComposer3, R.string.chat_history_load_error_subtitle);
                    String stringResource3 = Room.stringResource(gapComposer3, R.string.try_again);
                    i3 = i5;
                    boolean z4 = i3 == 32;
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (z4) {
                        neverEqualPolicy2 = neverEqualPolicy3;
                    } else {
                        neverEqualPolicy2 = neverEqualPolicy3;
                    }
                    rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda21(16, function1);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                    Function0 function0 = (Function0) rememberedValue2;
                    String stringResource4 = Room.stringResource(gapComposer3, R.string.close);
                    boolean z5 = i3 == 32;
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (z5 || rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda21(17, function1);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    z = z3;
                    r1 = 0;
                    neverEqualPolicy = neverEqualPolicy2;
                    UtilsKt.m3636FullscreenNotice6RhP_wg(fillMaxSize3, stringResource, stringResource2, stringResource3, function0, stringResource4, (Function0) rememberedValue3, 0L, gapComposer3, 6, 518);
                    gapComposer3.end(false);
                    function12 = function1;
                } else {
                    z = z3;
                    r1 = 0;
                    i3 = i5;
                    neverEqualPolicy = neverEqualPolicy3;
                    if (!moneybotChatHistoryViewModel.equals(MoneybotChatHistoryViewModel.Empty.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1701105481, false);
                    }
                    gapComposer3.startReplaceGroup(-1701074365);
                    Modifier fillMaxSize4 = SizeKt.fillMaxSize(companion, 1.0f);
                    String stringResource5 = Room.stringResource(gapComposer3, R.string.chat_history_empty_title);
                    String stringResource6 = Room.stringResource(gapComposer3, R.string.chat_history_empty_subtitle);
                    String stringResource7 = Room.stringResource(gapComposer3, R.string.chat_history_start_chat);
                    boolean z6 = i3 == 32;
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (z6 || rememberedValue4 == neverEqualPolicy) {
                        function13 = function1;
                        rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda21(18, function13);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    } else {
                        function13 = function1;
                    }
                    Function0 function02 = (Function0) rememberedValue4;
                    String stringResource8 = Room.stringResource(gapComposer3, R.string.close);
                    boolean z7 = i3 == 32;
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (z7 || rememberedValue5 == neverEqualPolicy) {
                        c = 19;
                        rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda21(19, function13);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    } else {
                        c = 19;
                    }
                    function12 = function1;
                    UtilsKt.m3636FullscreenNotice6RhP_wg(fillMaxSize4, stringResource5, stringResource6, stringResource7, function02, stringResource8, (Function0) rememberedValue5, 0L, gapComposer3, 6, 518);
                    gapComposer3.end(false);
                }
                gapComposer3.end(true);
                MoneybotChatHistoryViewModel.Content content = !z ? (MoneybotChatHistoryViewModel.Content) moneybotChatHistoryViewModel : null;
                str = content == null ? content.deleteConfirmationSessionId : null;
                if (str != null) {
                    gapComposer3.startReplaceGroup(42354086);
                    gapComposer3.end(r1);
                } else {
                    gapComposer3.startReplaceGroup(42354087);
                    boolean changed = gapComposer3.changed(str) | (i3 == 32 ? true : r1);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new P2PListViewKt$$ExternalSyntheticLambda13(function12, str, 15);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function03 = (Function0) rememberedValue6;
                    boolean z8 = i3 == 32 ? true : r1;
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (z8 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda21(20, function12);
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    DeleteChatConfirmationDialog(function03, (Function0) rememberedValue7, gapComposer3, r1);
                    gapComposer3.end(r1);
                }
                gapComposer3.end(true);
                gapComposer = gapComposer3;
            }
            function12 = function1;
            z = z3;
            r1 = 0;
            i3 = i5;
            neverEqualPolicy = neverEqualPolicy3;
            gapComposer3.end(true);
            if (!z) {
            }
            if (content == null) {
            }
            if (str != null) {
            }
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            function12 = function1;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(moneybotChatHistoryViewModel, function12, i, 19);
        }
    }
}
