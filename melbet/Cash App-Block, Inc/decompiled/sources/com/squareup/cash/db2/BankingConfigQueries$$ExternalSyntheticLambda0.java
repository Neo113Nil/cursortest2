package com.squareup.cash.db2;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zze;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.avatar.components.BadgedAvatarKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardMerchantQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardStudioError;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.card.onboarding.CardStyleItemViewModel;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.CardStyleSectionViewModel;
import com.squareup.cash.cdf.earnings.EarningsInteractSelectChartBar;
import com.squareup.cash.cdf.earnings.EarningsInteractSelectPeriod;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.clientsync.errors.IllegalSyncValueCardinality;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.pipeline.ReceiptSyncEntityObserver;
import com.squareup.cash.clientsync.readers.RealSyncValueReader;
import com.squareup.cash.clientsync.readers.SyncValueSpec;
import com.squareup.cash.common.cashsearch.EntityType;
import com.squareup.cash.common.composeui.SegmentedCircleInteractableState;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$ContactRow;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$FullDetails;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$LatestAndRow;
import com.squareup.cash.data.contacts.ContactDetailsSyncState$PrimaryKey;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.contacts.AliasSyncState;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.earnings.viewmodels.home.EarningsHeaderViewEvent;
import com.squareup.cash.encryption.RealClientSyncEntityDecryptor;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlDependencies;
import com.squareup.cash.family.familyhub.presenters.CashCardControlPresenter;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.investing.components.stock.details.SineWave;
import com.squareup.cash.investing.db.categories.Category$Adapter;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.views.menu.MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22;
import com.squareup.cash.moneybot.views.message.UserMessageUiKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.compose_ui.components.KeyPadChar;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.payments.views.coreflowsheet.AnimatedCornerShape;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.cash.work.views.shift.ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.LimitedAction;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.util.MathsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.YearMonth;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ConnectionPool;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class BankingConfigQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(String str, String str2, String str3, InstrumentQueries instrumentQueries) {
        this.$r8$classId = 9;
        AliasSyncState aliasSyncState = AliasSyncState.SYNCED;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v156, types: [androidx.media3.common.util.ListenerSet] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.squareup.cash.money.views.HypeWelcomeVideoKt$HypeWelcomeVideo$1$4$1$listener$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EarningsInteractSelectPeriod.EarningsPeriod earningsPeriod;
        char c;
        Offset offset;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 9;
        int i4 = 16;
        int i5 = 6;
        int i6 = 5;
        int i7 = 3;
        boolean z = false;
        int i8 = 1;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = (BankingConfig.RecurringDepositsDdaUpsell) obj3;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, (String) obj5, 1, (String) obj4);
                androidStatement.bindBytes(2, recurringDepositsDdaUpsell != null ? (byte[]) ((Local_tab_content.Adapter) localTabContentQueries.local_tab_contentAdapter).responseAdapter.encode(recurringDepositsDdaUpsell) : null);
                return Unit.INSTANCE;
            case 1:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, (String) obj5);
                androidStatement2.bindString(1, (String) ((Alias$Adapter) ((RewardSlotQueries) obj3).rewardSlotAdapter).sync_stateAdapter.encode((RewardSlotState) obj2));
                androidStatement2.bindString(2, (String) obj4);
                return Unit.INSTANCE;
            case 2:
                Function1 function1 = (Function1) obj5;
                Function1 function12 = (Function1) obj4;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj3;
                ErrorReporter errorReporter = (ErrorReporter) obj2;
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                try {
                    CardStudioViewKt.handleDialogEvents(dialogListenerEvent, function1, function12, snapshotStateList);
                } catch (Exception e) {
                    if (errorReporter != null) {
                        errorReporter.report(new CardStudioError(e), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                }
                return Unit.INSTANCE;
            case 3:
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj5;
                LazyListState lazyListState = (LazyListState) obj4;
                MutableState mutableState = (MutableState) obj3;
                Function1 function13 = (Function1) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                LazyListScope.item$default(lazyListScope, "title", null, new ComposableLambdaImpl(new CheckDepositAmountKt$$ExternalSyntheticLambda8(cardStylePickerViewModel, 8), true, 813826944), 2);
                if (!cardStylePickerViewModel.headers.isEmpty()) {
                    LazyListScope.item$default(lazyListScope, null, null, CanvasKt.lambda$1828089819, 3);
                    LazyListScope.stickyHeader$default(lazyListScope, "tabs", new ComposableLambdaImpl(new FirstTimeBorrowKt$$ExternalSyntheticLambda2(7, lazyListState, cardStylePickerViewModel, mutableState), true, 446548199), 2);
                }
                int i9 = 0;
                for (Object obj6 : cardStylePickerViewModel.sections) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CardStyleSectionViewModel cardStyleSectionViewModel = (CardStyleSectionViewModel) obj6;
                    if (cardStyleSectionViewModel.header != null) {
                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new CheckDepositAmountKt$$ExternalSyntheticLambda8(cardStyleSectionViewModel, i3), true, -1626402134), 3);
                    }
                    ?? r6 = z;
                    for (Object obj7 : cardStyleSectionViewModel.cards) {
                        int i11 = r6 + 1;
                        if (r6 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda21(r6, i7), true, -1560157602), 3);
                        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new SectionKt$$ExternalSyntheticLambda2(i4, (CardStyleItemViewModel) obj7, cardStylePickerViewModel, function13), true, -803064249), 3);
                        r6 = i11;
                    }
                    LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new BadgedAvatarKt$$ExternalSyntheticLambda4(i9, cardStylePickerViewModel, 5), true, -316933339), 3);
                    i9 = i10;
                    i3 = 9;
                    z = false;
                }
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj2;
                ((TransactionWrapper) obj).getClass();
                SessionQueries sessionQueries = (SessionQueries) ((ReceiptSyncEntityObserver) obj3).queries;
                sessionQueries.getClass();
                str.getClass();
                String str4 = (String) new OffersSheetQueries$ForSheetKeyQuery(sessionQueries, str, new PasswordInfoQueries$$ExternalSyntheticLambda0(i2)).executeAsOneOrNull();
                if (str4 != null) {
                    if (str4.equals(str2)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attempted to upsert receipt with token <", str2, "> for transaction <", str, "> but one with token <"), str4, "> already exists"));
                        return null;
                    }
                }
                sessionQueries.getClass();
                str2.getClass();
                str3.getClass();
                sessionQueries.driver.execute(1633448091, "INSERT OR REPLACE INTO itemizedReceipt\nVALUES(?, ?, ?)", new RewardMerchantQueries$$ExternalSyntheticLambda3(str2, str, str3, 1));
                sessionQueries.notifyQueries(1633448091, new PasswordInfoQueries$$ExternalSyntheticLambda0(i6));
                return Unit.INSTANCE;
            case 5:
                Function1 function14 = (Function1) obj4;
                RealSyncValueReader realSyncValueReader = (RealSyncValueReader) obj3;
                RealClientSyncEntityDecryptor realClientSyncEntityDecryptor = realSyncValueReader.entityDecryptor;
                SyncValueSpec syncValueSpec = (SyncValueSpec) obj2;
                List list = (List) obj;
                list.getClass();
                int size = list.size();
                if (size == 0) {
                    return obj5;
                }
                if (size == 1) {
                    return function14.invoke(syncValueSpec.getPayload(realClientSyncEntityDecryptor.decryptEntity((SyncEntity) list.get(0)).getEntityProto()));
                }
                int i12 = IllegalSyncValueCardinality.$r8$clinit;
                realSyncValueReader.errorReporter.reportNonFatal(MathsKt.create((String) syncValueSpec.valueName, list));
                return function14.invoke(syncValueSpec.getPayload(realClientSyncEntityDecryptor.decryptEntity((SyncEntity) list.get(0)).getEntityProto()));
            case 6:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement3, 0, (String) obj5, 1, (String) obj4);
                androidStatement3.bindLong(2, (Long) ((zze) ((ConnectionPool) ((LocalTabContentQueries) obj3).local_tab_contentAdapter).delegate).encode((EntityType) obj2));
                return Unit.INSTANCE;
            case 7:
                SessionQueries sessionQueries2 = ((RealContactDetailsSyncState) obj4).details;
                Map map = (Map) obj3;
                List list2 = (List) obj2;
                ((TransactionWrapper) obj).getClass();
                Iterator it = ((List) obj5).iterator();
                while (true) {
                    Object obj8 = null;
                    if (!it.hasNext()) {
                        for (Map.Entry entry : map.entrySet()) {
                            String str5 = ((ContactDetailsSyncState$PrimaryKey) entry.getKey()).key;
                            ContactDetailsSyncState$LatestAndRow contactDetailsSyncState$LatestAndRow = (ContactDetailsSyncState$LatestAndRow) entry.getValue();
                            str5.getClass();
                            contactDetailsSyncState$LatestAndRow.getClass();
                            String str6 = contactDetailsSyncState$LatestAndRow.latestLookupKey;
                            ContactDetailsSyncState$ContactRow contactDetailsSyncState$ContactRow = contactDetailsSyncState$LatestAndRow.row;
                            Long valueOf = contactDetailsSyncState$ContactRow != null ? Long.valueOf(contactDetailsSyncState$ContactRow.row) : null;
                            sessionQueries2.getClass();
                            str6.getClass();
                            sessionQueries2.driver.execute(1558295275, "UPDATE contact_detailed_sync_state\nSET latest_lookup_key = ?, row_id = ?\nWHERE primary_key = ?", new CaptureCheckFaceKt$$ExternalSyntheticLambda11(27, str6, valueOf, str5));
                            sessionQueries2.notifyQueries(1558295275, new WebLoginConfigQueries$$ExternalSyntheticLambda2(24, false));
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            String str7 = ((ContactDetailsSyncState$PrimaryKey) it2.next()).key;
                            str7.getClass();
                            sessionQueries2.getClass();
                            sessionQueries2.driver.execute(1532922539, "DELETE FROM contact_detailed_sync_state\nWHERE primary_key = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str7, 7));
                            sessionQueries2.notifyQueries(1532922539, new WebLoginConfigQueries$$ExternalSyntheticLambda2(25, false));
                        }
                        return Unit.INSTANCE;
                    }
                    ContactDetailsSyncState$FullDetails contactDetailsSyncState$FullDetails = (ContactDetailsSyncState$FullDetails) it.next();
                    contactDetailsSyncState$FullDetails.getClass();
                    String str8 = contactDetailsSyncState$FullDetails.primaryKey;
                    String str9 = contactDetailsSyncState$FullDetails.latestLookupKey;
                    String str10 = contactDetailsSyncState$FullDetails.hash;
                    sessionQueries2.getClass();
                    str8.getClass();
                    str9.getClass();
                    str10.getClass();
                    sessionQueries2.driver.execute(1629137750, "INSERT OR REPLACE\nINTO contact_detailed_sync_state\nVALUES (?, ?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0((Object) str8, (Object) str9, obj8, (Object) str10, 10));
                    sessionQueries2.notifyQueries(1629137750, new WebLoginConfigQueries$$ExternalSyntheticLambda2(26, false));
                }
            case 8:
                Money money = (Money) obj3;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj2;
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindBoolean(0, (Boolean) obj4);
                androidStatement4.bindString(1, (String) obj5);
                androidStatement4.bindBytes(2, money != null ? (byte[]) ((BlockersConfig.Adapter) localTabContentQueries2.local_tab_contentAdapter).target_balance_amountAdapter.encode(money) : null);
                return Unit.INSTANCE;
            case 9:
                AliasSyncState aliasSyncState = AliasSyncState.NEW;
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement5, 0, (String) obj5, 1, (String) obj4);
                androidStatement5.bindString(2, (String) obj3);
                androidStatement5.bindString(3, null);
                androidStatement5.bindString(4, (String) ((Alias$Adapter) ((InstrumentQueries) obj2).instrumentAdapter).sync_stateAdapter.encode(aliasSyncState));
                androidStatement5.bindString(5, null);
                return Unit.INSTANCE;
            case 10:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement6, 0, (String) obj5, 1, (String) obj4);
                androidStatement6.bindLong(2, (Long) obj3);
                androidStatement6.bindString(3, (String) obj2);
                return Unit.INSTANCE;
            case 11:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindLong(0, (Long) obj3);
                androidStatement7.bindLong(1, (Long) obj2);
                androidStatement7.bindString(2, (String) obj5);
                androidStatement7.bindString(3, (String) obj4);
                return Unit.INSTANCE;
            case 12:
                InstrumentQueries instrumentQueries = (InstrumentQueries) obj4;
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).client_scenarioAdapter.encode((LimitedAction) obj3));
                androidStatement8.bindBytes(1, (byte[]) ((ScenarioPlan.Adapter) instrumentQueries.instrumentAdapter).scenario_planAdapter.encode((Money) obj2));
                androidStatement8.bindString(2, (String) obj5);
                return Unit.INSTANCE;
            case 13:
                GetPaperCashDepositBarcodeResponse.Success success = (GetPaperCashDepositBarcodeResponse.Success) obj4;
                GetPaperCashDepositBarcodeResponse.Failure failure = (GetPaperCashDepositBarcodeResponse.Failure) obj3;
                GpsConfigQueries gpsConfigQueries = (GpsConfigQueries) obj2;
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindLong(0, (Long) obj5);
                androidStatement9.bindBytes(1, success != null ? (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries.gpsConfigAdapter).pay_dataAdapter.encode(success) : null);
                androidStatement9.bindBytes(2, failure != null ? (byte[]) ((RecipientConfig$Adapter) gpsConfigQueries.gpsConfigAdapter).request_dataAdapter.encode(failure) : null);
                return Unit.INSTANCE;
            case 14:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.items$default(lazyListScope2, (int) Math.ceil(r0.size() / ref$IntRef.element), null, new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda16(ref$IntRef, (List) obj5, (ComposableLambdaImpl) obj3, (LazyGridItemScopeImpl) obj2, 4), true, 813311070), 6);
                return Unit.INSTANCE;
            case 15:
                EarningsHeaderPresenter earningsHeaderPresenter = (EarningsHeaderPresenter) obj5;
                EarningsHomeAnalytics earningsHomeAnalytics = (EarningsHomeAnalytics) earningsHeaderPresenter.earningsHomeAnalytics;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                MutableState mutableState4 = (MutableState) obj2;
                EarningsHeaderViewEvent earningsHeaderViewEvent = (EarningsHeaderViewEvent) obj;
                earningsHeaderViewEvent.getClass();
                if (earningsHeaderViewEvent instanceof EarningsHeaderViewEvent.DateFilterChanged) {
                    DateFilter dateFilter = ((EarningsHeaderViewEvent.DateFilterChanged) earningsHeaderViewEvent).filter;
                    if (!Intrinsics.areEqual(dateFilter, (DateFilter) mutableState2.getValue())) {
                        mutableState2.setValue(dateFilter);
                        YearMonth yearMonth = (YearMonth) earningsHeaderPresenter.nowAtEntry;
                        dateFilter.getClass();
                        yearMonth.getClass();
                        if (dateFilter instanceof DateFilter.Monthly) {
                            DateFilter.Monthly monthly = (DateFilter.Monthly) dateFilter;
                            int monthValue = (yearMonth.getMonthValue() + (yearMonth.getYear() * 12)) - ((monthly.year * 12) + monthly.month);
                            earningsPeriod = monthValue != 0 ? monthValue != 1 ? monthValue != 2 ? null : EarningsInteractSelectPeriod.EarningsPeriod.TWO_MONTHS_AGO : EarningsInteractSelectPeriod.EarningsPeriod.LAST_MONTH : EarningsInteractSelectPeriod.EarningsPeriod.THIS_MONTH;
                        } else if (dateFilter instanceof DateFilter.Yearly) {
                            earningsPeriod = EarningsInteractSelectPeriod.EarningsPeriod.YEAR_TO_DATE;
                        } else {
                            if (!dateFilter.equals(DateFilter.AllTime.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            earningsPeriod = EarningsInteractSelectPeriod.EarningsPeriod.ALL_TIME;
                        }
                        if (earningsPeriod != null) {
                            earningsHomeAnalytics.analytics.track(new EarningsInteractSelectPeriod(earningsPeriod), null);
                        }
                    }
                } else if (earningsHeaderViewEvent.equals(EarningsHeaderViewEvent.TotalEarningsAnimationComplete.INSTANCE)) {
                    mutableState3.setValue(Boolean.TRUE);
                } else if (!earningsHeaderViewEvent.equals(EarningsHeaderViewEvent.ChartBarSelected.INSTANCE)) {
                    if (!earningsHeaderViewEvent.equals(EarningsHeaderViewEvent.ChartBarSelectionCleared.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState4.setValue(Boolean.FALSE);
                } else if (!((Boolean) mutableState4.getValue()).booleanValue()) {
                    mutableState4.setValue(Boolean.TRUE);
                    earningsHomeAnalytics.analytics.track(new EarningsInteractSelectChartBar(), null);
                }
                return Unit.INSTANCE;
            case 16:
                String str11 = (String) obj5;
                String str12 = (String) obj4;
                String str13 = (String) obj2;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                BaseDependentControlDependencies baseDependentControlDependencies = ((CashCardControlPresenter) obj3).deps;
                AndroidStringManager androidStringManager = baseDependentControlDependencies.stringManager;
                ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, str11, "tag_title", str11);
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.family_account_dependent_cash_app_tag_disabling_confirmation_dialog_title)).format(m);
                format2.getClass();
                AndroidStringManager androidStringManager2 = baseDependentControlDependencies.stringManager;
                str12.getClass();
                str13.getClass();
                ArrayMap arrayMap = new ArrayMap(2);
                arrayMap.put("form_factor", str13);
                arrayMap.put("first_name", str12);
                Resources resources2 = androidStringManager2.resources;
                resources2.getClass();
                String format3 = new MessageFormat(resources2.getString(R.string.family_account_dependent_cash_app_tag_disabling_confirmation_dialog_message)).format(arrayMap);
                format3.getClass();
                return new ControlDisablingConfirmationScreen(format2, format3, androidStringManager2.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_confirm_button_title), androidStringManager2.get(R.string.family_account_dependent_toggle_disabling_confirmation_dialog_cancel_button_title), ControlType.CASH_CARD, askedQuestion, 96);
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, (String) obj5);
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, CollectionsKt__CollectionsJVMKt.listOf(new CustomAccessibilityAction((String) obj4, new IntentLauncher$$ExternalSyntheticLambda0(i3, (Function0) obj3, (DragWidgetState) obj2))));
                return Unit.INSTANCE;
            case 18:
                SineWave sineWave = (SineWave) obj4;
                AndroidPath androidPath = (AndroidPath) obj3;
                Stroke stroke = (Stroke) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(125.0f) * ((Number) ((State) obj5).getValue()).floatValue();
                ((Extras.Key) drawScope.getDrawContext().path).translate(mo236toPx0680j_4, RecyclerView.DECELERATION_RATE);
                try {
                    DrawScope.m745drawPathLG529CI$default(drawScope, androidPath, sineWave.color, RecyclerView.DECELERATION_RATE, stroke, 52);
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-mo236toPx0680j_4, -0.0f);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ((Extras.Key) drawScope.getDrawContext().path).translate(-mo236toPx0680j_4, -0.0f);
                    throw th;
                }
            case 19:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                Category$Adapter category$Adapter = (Category$Adapter) ((RewardSlotQueries) obj5).rewardAdapter;
                androidStatement10.bindString(0, (String) category$Adapter.prefix_iconAdapter.encode((CurrencyCode) obj4));
                androidStatement10.bindString(1, (String) category$Adapter.typeAdapter.encode((HistoricalRange) obj3));
                androidStatement10.bindBytes(2, (byte[]) category$Adapter.category_colorAdapter.encode((PriceHistory) obj2));
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement11, 0, (String) obj5, 1, (String) obj4);
                androidStatement11.bindBytes(2, (byte[]) ((StampsConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).stampsAdapter.encode((List) obj2));
                return Unit.INSTANCE;
            case 21:
                final ExoPlayer exoPlayer = (ExoPlayer) obj5;
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) obj4;
                final MutableState mutableState5 = (MutableState) obj3;
                final MutableState mutableState6 = (MutableState) obj2;
                final DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
                disposableEffectScope.getClass();
                final ?? r62 = new Player.Listener() { // from class: com.squareup.cash.money.views.HypeWelcomeVideoKt$HypeWelcomeVideo$1$4$1$listener$1
                    @Override // androidx.media3.common.Player.Listener
                    public final void onPlayerError(PlaybackException playbackException) {
                        playbackException.getClass();
                        mutableState6.setValue(Boolean.TRUE);
                    }

                    @Override // androidx.media3.common.Player.Listener
                    public final void onRenderedFirstFrame() {
                        MutableState.this.setValue(Boolean.TRUE);
                    }
                };
                ((ExoPlayerImpl) exoPlayer).listeners.add(r62);
                final Lifecycle$$ExternalSyntheticLambda0 lifecycle$$ExternalSyntheticLambda0 = new Lifecycle$$ExternalSyntheticLambda0(exoPlayer, i6);
                lifecycleOwner.getLifecycle().addObserver(lifecycle$$ExternalSyntheticLambda0);
                return new DisposableEffectResult(lifecycle$$ExternalSyntheticLambda0, disposableEffectScope, exoPlayer, r62) { // from class: com.squareup.cash.money.views.HypeWelcomeVideoKt$HypeWelcomeVideo$lambda$0$11$0$$inlined$onDispose$1
                    public final /* synthetic */ ExoPlayer $exoPlayer$inlined;
                    public final /* synthetic */ Lifecycle$$ExternalSyntheticLambda0 $lifecycleObserver$inlined;
                    public final /* synthetic */ HypeWelcomeVideoKt$HypeWelcomeVideo$1$4$1$listener$1 $listener$inlined;

                    {
                        this.$exoPlayer$inlined = exoPlayer;
                        this.$listener$inlined = r62;
                    }

                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        ExoPlayer exoPlayer2 = this.$exoPlayer$inlined;
                        LifecycleOwner.this.getLifecycle().removeObserver(this.$lifecycleObserver$inlined);
                        try {
                            Result.Companion companion = Result.Companion;
                            ((ExoPlayerImpl) exoPlayer2).removeListener(this.$listener$inlined);
                        } catch (Throwable unused) {
                            Result.Companion companion2 = Result.Companion;
                        }
                        try {
                            ((ExoPlayerImpl) exoPlayer2).release();
                        } catch (Throwable unused2) {
                            Result.Companion companion3 = Result.Companion;
                        }
                    }
                };
            case 22:
                MoneybotChatHistoryViewModel.Content content = (MoneybotChatHistoryViewModel.Content) obj5;
                MutableState mutableState7 = (MutableState) obj2;
                LazyListScope lazyListScope3 = (LazyListScope) obj;
                lazyListScope3.getClass();
                List list3 = content.sessions;
                lazyListScope3.items(list3.size(), new VerifyCheckDepositPresenter$models$3$2(15, new MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22((SnapshotStateMap) obj4, 1), list3), new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list3, 1), new ComposableLambdaImpl(new ShiftListContentKt$ShiftListContent$lambda$4$0$$inlined$items$3(14, (Function1) obj3, list3), true, 802480018));
                if ((content.loadingNextPage || ((Boolean) mutableState7.getValue()).booleanValue()) && content.hasMoreSessions && !(content.error instanceof MoneybotChatHistoryViewModel.Content.Error.LoadingNextPage)) {
                    LazyListScope.item$default(lazyListScope3, null, null, new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda0(i4), true, -596225757), 3);
                }
                return Unit.INSTANCE;
            case 23:
                Placeable placeable = (Placeable) obj5;
                Placeable placeable2 = (Placeable) obj3;
                Placeable placeable3 = (Placeable) obj2;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, (Placeable) obj4, 0, 0, 10.0f, 8);
                if (placeable2 != null) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable2, 0, placeable.height - placeable2.height, 9.0f, 8);
                }
                Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable3, 0, placeable.height - placeable3.height, 10.0f, 8);
                return Unit.INSTANCE;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver2, CollectionsKt__CollectionsJVMKt.listOf(new CustomAccessibilityAction((String) obj5, new UserMessageUiKt$$ExternalSyntheticLambda5((CoroutineScope) obj3, (AndroidClipboard) obj2, (String) obj4, i8))));
                return Unit.INSTANCE;
            case 25:
                Resources resources3 = (Resources) obj3;
                Function0 function0 = (Function0) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver3, 0);
                if (Intrinsics.areEqual(((KeyPadChar) obj4).key, (String) obj5)) {
                    String string2 = resources3.getString(R.string.keypad_clear_custom_action);
                    string2.getClass();
                    SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver3, CollectionsKt__CollectionsJVMKt.listOf(new CustomAccessibilityAction(string2, new ComposeDialogKt$$ExternalSyntheticLambda10(29, function0))));
                }
                return Unit.INSTANCE;
            case 26:
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, (String) obj5);
                androidStatement12.bindLong(1, (Long) obj4);
                androidStatement12.bindBytes(2, (byte[]) ((Local_tab_content.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).responseAdapter.encode((OffersTabCollectionResponse) obj2));
                return Unit.INSTANCE;
            case 27:
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                androidStatement13.bindLong(0, (Long) obj5);
                androidStatement13.bindLong(1, (Long) obj4);
                androidStatement13.bindBytes(2, (byte[]) ((BlockersConfig.Adapter) ((GpsConfigQueries) obj3).gpsConfigAdapter).target_balance_amountAdapter.encode((OffersTabHomeResponse) obj2));
                return Unit.INSTANCE;
            case 28:
                SegmentedCircleInteractableState segmentedCircleInteractableState = (SegmentedCircleInteractableState) obj5;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                PointerInputScope pointerInputScope = (PointerInputScope) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                Offset offset2 = (Offset) obj;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = segmentedCircleInteractableState.center$delegate;
                Offset offset3 = (Offset) parcelableSnapshotMutableState.getValue();
                if (offset3 != null) {
                    long j = offset3.packedValue;
                    long j2 = offset2.packedValue;
                    c = ' ';
                    if (((float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (j >> 32)), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), 2.0d)))) < ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).getDensity() * ((Dp) segmentedCircleInteractableState.radius$delegate.getValue()).value) {
                        z = true;
                    }
                } else {
                    c = ' ';
                }
                ref$BooleanRef.element = z;
                if (z && (offset = (Offset) parcelableSnapshotMutableState.getValue()) != null) {
                    ref$ObjectRef.element = HelpSheetViewKt.m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k((int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize >> c), offset.packedValue).quadrant;
                }
                return Unit.INSTANCE;
            default:
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                placementScope2.getClass();
                Placeable.PlacementScope.m854place70tqf50$default(placementScope2, (Placeable) obj5, 0L);
                Placeable.PlacementScope.m856placeWithLayeraW9wM$default(placementScope2, (Placeable) obj4, 0L, new OpenSourceKt$$ExternalSyntheticLambda11(i5, (AnimatedCornerShape) obj3, (Density) obj2), 2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(InstrumentQueries instrumentQueries, LimitedAction limitedAction, Money money, String str) {
        this.$r8$classId = 12;
        this.f$1 = instrumentQueries;
        this.f$2 = limitedAction;
        this.f$3 = money;
        this.f$0 = str;
    }

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(Long l, Long l2, String str, String str2) {
        this.$r8$classId = 11;
        this.f$2 = l;
        this.f$3 = l2;
        this.f$0 = str;
        this.f$1 = str2;
    }

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(Object obj, String str, String str2, String str3, int i) {
        this.$r8$classId = i;
        this.f$2 = obj;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = str3;
    }

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(String str, Object obj, Object obj2, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$2 = obj;
        this.f$3 = obj2;
        this.f$1 = str2;
    }

    public /* synthetic */ BankingConfigQueries$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3, String str) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = str;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }
}
