package coil3.network;

import android.content.Context;
import androidx.camera.camera2.pipe.graph.GraphLoop$processingQueue$1;
import androidx.camera.core.ImageAnalysis;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.ContentInfoCompat;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.arcade.protocol.host.arcade.SwitchHostProtocol;
import app.cash.arcade.protocol.host.arcade.SwitchProtocolNode$OnCheckedChange;
import app.cash.arcade.protocol.host.arcade.TextFieldHostProtocol;
import app.cash.arcade.protocol.host.arcade.TextFieldProtocolNode$OnChange;
import app.cash.arcade.protocol.host.arcade.TextHostProtocol;
import app.cash.arcade.protocol.host.arcade.TextProtocolNode;
import app.cash.arcade.protocol.host.arcade.ToggleHostProtocol;
import app.cash.arcade.protocol.host.arcade.ToggleProtocolNode$OnChange;
import app.cash.arcade.protocol.host.redwoodlayout.ColumnProtocolNode$OnScroll;
import app.cash.arcade.protocol.host.redwoodlayout.RowHostProtocol;
import app.cash.arcade.protocol.host.redwoodlayout.RowProtocolNode$OnScroll;
import app.cash.arcade.values.BooleanState;
import app.cash.arcade.values.PasscodeInputStatus;
import app.cash.arcade.values.TextFieldState;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.ui.Ui;
import app.cash.redwood.ui.Px;
import com.caverock.androidsvg.SVG;
import com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.collections.MarkerManager;
import com.squareup.cash.activity.presenters.ActivityFeedCallbackEvent$RefreshFeed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemSelected;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneyChanged;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$MoneySubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$PercentSubmitted;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.arcade.treehouse.LegacyAmountPickerBinding;
import com.squareup.cash.arcade.treehouse.LegacyPasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.PasscodeInputBinding;
import com.squareup.cash.arcade.treehouse.TextBinding;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewEvent;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonImpl;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class NetworkFetcher$fetch$2 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$fetch$2(Object obj) {
        super(1, 0, Ui.EventReceiver.class, obj, "sendEvent", "sendEvent(Ljava/lang/Object;)V");
        this.$r8$classId = 9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        List split$default;
        String str;
        Long longOrNull;
        ULong uLong = null;
        switch (this.$r8$classId) {
            case 0:
                return NetworkFetcher.access$doFetch((NetworkFetcher) this.receiver, (Continuation) obj);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                SwitchProtocolNode$OnCheckedChange switchProtocolNode$OnCheckedChange = (SwitchProtocolNode$OnCheckedChange) this.receiver;
                SVG svg = switchProtocolNode$OnCheckedChange.eventSink;
                int i = switchProtocolNode$OnCheckedChange.id;
                SwitchHostProtocol switchHostProtocol = switchProtocolNode$OnCheckedChange.protocol;
                BooleanSerializer booleanSerializer = (BooleanSerializer) switchHostProtocol.serializer_0;
                booleanSerializer.getClass();
                svg.sendEvent(new ContentInfoCompat.CompatImpl(i, 2, (JsonImpl) switchHostProtocol.json, new Object[]{bool}, new KSerializer[]{booleanSerializer}));
                return Unit.INSTANCE;
            case 2:
                TextFieldState textFieldState = (TextFieldState) obj;
                textFieldState.getClass();
                TextFieldProtocolNode$OnChange textFieldProtocolNode$OnChange = (TextFieldProtocolNode$OnChange) this.receiver;
                textFieldProtocolNode$OnChange.getClass();
                SVG svg2 = textFieldProtocolNode$OnChange.eventSink;
                int i2 = textFieldProtocolNode$OnChange.id;
                TextFieldHostProtocol textFieldHostProtocol = textFieldProtocolNode$OnChange.protocol;
                KSerializer kSerializer = textFieldHostProtocol.serializer_0;
                kSerializer.getClass();
                svg2.sendEvent(new ContentInfoCompat.CompatImpl(i2, 3, (JsonImpl) textFieldHostProtocol.json, new Object[]{textFieldState}, new KSerializer[]{kSerializer}));
                return Unit.INSTANCE;
            case 3:
                ((Boolean) obj).getClass();
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(this.receiver);
                throw null;
            case 4:
                ((TextFieldState) obj).getClass();
                JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(this.receiver);
                throw null;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                TextProtocolNode.UrlHandler urlHandler = (TextProtocolNode.UrlHandler) this.receiver;
                urlHandler.getClass();
                SVG svg3 = urlHandler.eventSink;
                int i3 = urlHandler.id;
                TextHostProtocol textHostProtocol = urlHandler.protocol;
                StringSerializer stringSerializer = textHostProtocol.serializer_8;
                stringSerializer.getClass();
                svg3.sendEvent(new ContentInfoCompat.CompatImpl(i3, 9, textHostProtocol.json, new Object[]{str2}, new KSerializer[]{stringSerializer}));
                return Unit.INSTANCE;
            case 6:
                BooleanState booleanState = (BooleanState) obj;
                booleanState.getClass();
                ToggleProtocolNode$OnChange toggleProtocolNode$OnChange = (ToggleProtocolNode$OnChange) this.receiver;
                toggleProtocolNode$OnChange.getClass();
                SVG svg4 = toggleProtocolNode$OnChange.eventSink;
                int i4 = toggleProtocolNode$OnChange.id;
                ToggleHostProtocol toggleHostProtocol = toggleProtocolNode$OnChange.protocol;
                KSerializer kSerializer2 = toggleHostProtocol.serializer_0;
                kSerializer2.getClass();
                svg4.sendEvent(new ContentInfoCompat.CompatImpl(i4, 3, toggleHostProtocol.json, new Object[]{booleanState}, new KSerializer[]{kSerializer2}));
                return Unit.INSTANCE;
            case 7:
                double d = ((Px) obj).value;
                ColumnProtocolNode$OnScroll columnProtocolNode$OnScroll = (ColumnProtocolNode$OnScroll) this.receiver;
                SVG svg5 = columnProtocolNode$OnScroll.eventSink;
                int i5 = columnProtocolNode$OnScroll.id;
                RowHostProtocol rowHostProtocol = columnProtocolNode$OnScroll.protocol;
                JsonImpl jsonImpl = rowHostProtocol.json;
                Object[] objArr = {new Px(d)};
                KSerializer kSerializer3 = rowHostProtocol.serializer_6;
                kSerializer3.getClass();
                svg5.sendEvent(new ContentInfoCompat.CompatImpl(i5, 7, jsonImpl, objArr, new KSerializer[]{kSerializer3}));
                return Unit.INSTANCE;
            case 8:
                double d2 = ((Px) obj).value;
                RowProtocolNode$OnScroll rowProtocolNode$OnScroll = (RowProtocolNode$OnScroll) this.receiver;
                SVG svg6 = rowProtocolNode$OnScroll.eventSink;
                int i6 = rowProtocolNode$OnScroll.id;
                RowHostProtocol rowHostProtocol2 = rowProtocolNode$OnScroll.protocol;
                JsonImpl jsonImpl2 = rowHostProtocol2.json;
                Object[] objArr2 = {new Px(d2)};
                KSerializer kSerializer4 = rowHostProtocol2.serializer_6;
                kSerializer4.getClass();
                svg6.sendEvent(new ContentInfoCompat.CompatImpl(i6, 7, jsonImpl2, objArr2, new KSerializer[]{kSerializer4}));
                return Unit.INSTANCE;
            case 9:
                ((Ui.EventReceiver) this.receiver).sendEvent(obj);
                return Unit.INSTANCE;
            case 10:
                int intValue = ((Number) obj).intValue();
                ImageAnalysis imageAnalysis = (ImageAnalysis) this.receiver;
                if (imageAnalysis.setTargetRotationInternal(intValue)) {
                    imageAnalysis.tryUpdateRelativeRotation();
                }
                return Unit.INSTANCE;
            case 11:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 12:
                DatadogSpan datadogSpan = (DatadogSpan) obj;
                datadogSpan.getClass();
                ((SpanSamplingIdProvider) this.receiver).getClass();
                DatadogSpanContext context = datadogSpan.context();
                Object obj2 = context.getTags().get("session_id");
                String str3 = obj2 instanceof String ? (String) obj2 : null;
                if (str3 != null && (split$default = StringsKt.split$default(str3, new char[]{'-'}, 6)) != null && (str = (String) CollectionsKt.lastOrNull(split$default)) != null && (longOrNull = StringsKt.toLongOrNull(16, str)) != null) {
                    uLong = new ULong(longOrNull.longValue());
                }
                if (uLong != null) {
                    j = uLong.data;
                } else {
                    j = context.getTraceId().toLong();
                    ULong.Companion companion = ULong.Companion;
                }
                return new ULong(j);
            case 13:
                Marker marker = (Marker) obj;
                marker.getClass();
                return Boolean.valueOf(((MarkerManager) this.receiver).onMarkerClick(marker));
            case 14:
                Marker marker2 = (Marker) obj;
                marker2.getClass();
                ((MarkerManager) this.receiver).onInfoWindowClick(marker2);
                return Unit.INSTANCE;
            case 15:
                Marker marker3 = (Marker) obj;
                marker3.getClass();
                ((MarkerManager) this.receiver).onInfoWindowLongClick(marker3);
                return Unit.INSTANCE;
            case 16:
                Marker marker4 = (Marker) obj;
                marker4.getClass();
                ((MarkerManager) this.receiver).onMarkerDrag(marker4);
                return Unit.INSTANCE;
            case 17:
                Marker marker5 = (Marker) obj;
                marker5.getClass();
                ((MarkerManager) this.receiver).onMarkerDragEnd(marker5);
                return Unit.INSTANCE;
            case 18:
                Marker marker6 = (Marker) obj;
                marker6.getClass();
                ((MarkerManager) this.receiver).onMarkerDragStart(marker6);
                return Unit.INSTANCE;
            case 19:
                return ((Context) this.receiver).getString(((Number) obj).intValue());
            case 20:
                ActivityFeedCallbackEvent$RefreshFeed activityFeedCallbackEvent$RefreshFeed = (ActivityFeedCallbackEvent$RefreshFeed) obj;
                activityFeedCallbackEvent$RefreshFeed.getClass();
                StateFlowKt.emitOrThrow((MutableSharedFlow) this.receiver, activityFeedCallbackEvent$RefreshFeed);
                return Unit.INSTANCE;
            case 21:
                ActivityFeedCallbackEvent$RefreshFeed activityFeedCallbackEvent$RefreshFeed2 = (ActivityFeedCallbackEvent$RefreshFeed) obj;
                activityFeedCallbackEvent$RefreshFeed2.getClass();
                StateFlowKt.emitOrThrow((MutableSharedFlow) this.receiver, activityFeedCallbackEvent$RefreshFeed2);
                return Unit.INSTANCE;
            case 22:
                AmountPickerViewEvent amountPickerViewEvent = (AmountPickerViewEvent) obj;
                amountPickerViewEvent.getClass();
                LegacyAmountPickerBinding legacyAmountPickerBinding = (LegacyAmountPickerBinding) this.receiver;
                int i7 = LegacyAmountPickerBinding.$r8$clinit;
                legacyAmountPickerBinding.getClass();
                if (amountPickerViewEvent.equals(AmountPickerViewEvent$Full$Close.INSTANCE)) {
                    legacyAmountPickerBinding.onCloseClicked.invoke();
                } else if (amountPickerViewEvent.equals(AmountPickerViewEvent$Full$SystemBack.INSTANCE)) {
                    Function0 function0 = legacyAmountPickerBinding.onBackClicked;
                    if (function0 == null) {
                        function0 = legacyAmountPickerBinding.onCloseClicked;
                    }
                    function0.invoke();
                } else if (amountPickerViewEvent.equals(AmountPickerViewEvent$Full$HelpClicked.INSTANCE)) {
                    PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3 = legacyAmountPickerBinding.onHelpClicked;
                    if (pageFetcher$generateNewPagingSource$3 != null) {
                        pageFetcher$generateNewPagingSource$3.invoke();
                    }
                } else {
                    if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneyChanged) {
                        Function1 function1 = legacyAmountPickerBinding.onAmountChanged;
                        Long l = ((AmountPickerViewEvent$Full$MoneyChanged) amountPickerViewEvent).amount.amount;
                        function1.invoke(Long.valueOf(l != null ? l.longValue() : 0L));
                    } else if (amountPickerViewEvent instanceof AmountPickerViewEvent$Full$MoneySubmitted) {
                        Function1 function12 = legacyAmountPickerBinding.onAmountSubmitted;
                        Long l2 = ((AmountPickerViewEvent$Full$MoneySubmitted) amountPickerViewEvent).amount.amount;
                        function12.invoke(Long.valueOf(l2 != null ? l2.longValue() : 0L));
                    } else if (!(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Condensed$ItemSelected) && !(amountPickerViewEvent instanceof AmountPickerViewEvent$Full$PercentSubmitted)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return Unit.INSTANCE;
            case 23:
                int intValue2 = ((Number) obj).intValue();
                LegacyPasscodeInputBinding legacyPasscodeInputBinding = (LegacyPasscodeInputBinding) this.receiver;
                int i8 = LegacyPasscodeInputBinding.$r8$clinit;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyPasscodeInputBinding.inputEnabled$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = legacyPasscodeInputBinding.shakeTrigger$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = legacyPasscodeInputBinding.passcodeLength$delegate;
                if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                    if (legacyPasscodeInputBinding.getPasscode().length() >= parcelableSnapshotMutableIntState2.getIntValue()) {
                        parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                    } else {
                        legacyPasscodeInputBinding.passcode$delegate.setValue(legacyPasscodeInputBinding.getPasscode() + intValue2);
                        if (legacyPasscodeInputBinding.getPasscode().length() == parcelableSnapshotMutableIntState2.getIntValue()) {
                            legacyPasscodeInputBinding.latestStatus = PasscodeInputStatus.NONE;
                            legacyPasscodeInputBinding.inputEnabled$delegate.setValue(Boolean.FALSE);
                            legacyPasscodeInputBinding.onFullyFilled.invoke(legacyPasscodeInputBinding.getPasscode());
                        }
                    }
                }
                return Unit.INSTANCE;
            case 24:
                int intValue3 = ((Number) obj).intValue();
                PasscodeInputBinding passcodeInputBinding = (PasscodeInputBinding) this.receiver;
                int i9 = PasscodeInputBinding.$r8$clinit;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = passcodeInputBinding.inputEnabled$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = passcodeInputBinding.shakeTrigger$delegate;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = passcodeInputBinding.passcodeLength$delegate;
                if (((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue()) {
                    if (passcodeInputBinding.getPasscode$1().length() >= parcelableSnapshotMutableIntState4.getIntValue()) {
                        parcelableSnapshotMutableIntState3.setIntValue(parcelableSnapshotMutableIntState3.getIntValue() + 1);
                    } else {
                        passcodeInputBinding.passcode$delegate.setValue(passcodeInputBinding.getPasscode$1() + intValue3);
                        if (passcodeInputBinding.getPasscode$1().length() == parcelableSnapshotMutableIntState4.getIntValue()) {
                            passcodeInputBinding.inputEnabled$delegate.setValue(Boolean.FALSE);
                            GraphLoop$processingQueue$1 graphLoop$processingQueue$1 = passcodeInputBinding.onChangeCallback;
                            if (graphLoop$processingQueue$1 != null) {
                                graphLoop$processingQueue$1.invoke(new TextFieldState(passcodeInputBinding.getPasscode$1(), passcodeInputBinding.getPasscode$1().length(), passcodeInputBinding.getPasscode$1().length(), 8));
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 25:
                String str4 = (String) obj;
                str4.getClass();
                NetworkFetcher$fetch$2 networkFetcher$fetch$2 = ((TextBinding) this.receiver).urlHandler;
                if (networkFetcher$fetch$2 != null) {
                    networkFetcher$fetch$2.invoke(str4);
                }
                return Unit.INSTANCE;
            case 26:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                ((Ui.EventReceiver) this.receiver).sendEvent(tabToolbarInternalViewEvent);
                return Unit.INSTANCE;
            case 27:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 28:
                Navigator navigator = (Navigator) obj;
                navigator.getClass();
                BalanceAppletTilePresenter$Factory$Impl balanceAppletTilePresenter$Factory$Impl = (BalanceAppletTilePresenter$Factory$Impl) this.receiver;
                balanceAppletTilePresenter$Factory$Impl.getClass();
                Profile.Adapter adapter = balanceAppletTilePresenter$Factory$Impl.delegateFactory;
                Analytics analytics = (Analytics) ((Provider) adapter.nearby_visibilityAdapter).invoke();
                BalanceAppletTileRepository balanceAppletTileRepository = (BalanceAppletTileRepository) ((Provider) adapter.rate_planAdapter).invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) adapter.deposit_preferenceAdapter).invoke();
                RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl = (RealBankingOutboundNavigator$Factory$Impl) ((Provider) adapter.country_codeAdapter).invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) ((Provider) adapter.default_currencyAdapter).invoke();
                RealBalancePrivacy realBalancePrivacy = (RealBalancePrivacy) ((Provider) adapter.incoming_request_policyAdapter).invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) adapter.regionAdapter).invoke();
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
                SyncValueReader syncValueReader = (SyncValueReader) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) adapter.addressAdapter).invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) adapter.deposit_preference_dataAdapter).invoke();
                CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) adapter.available_p2p_target_regionsAdapter).value;
                analytics.getClass();
                balanceAppletTileRepository.getClass();
                androidStringManager.getClass();
                realBankingOutboundNavigator$Factory$Impl.getClass();
                moneyAnalyticsService.getClass();
                realBalancePrivacy.getClass();
                featureFlagManager.getClass();
                realFamilyProfileManager.getClass();
                syncValueReader.getClass();
                factory.getClass();
                realRouter$Factory$Impl.getClass();
                coroutineScope.getClass();
                return new TapToPayPresenter(analytics, balanceAppletTileRepository, androidStringManager, realBankingOutboundNavigator$Factory$Impl, moneyAnalyticsService, realBalancePrivacy, featureFlagManager, realFamilyProfileManager, syncValueReader, factory, realRouter$Factory$Impl, coroutineScope, navigator);
            default:
                BalanceAppletTileViewEvent balanceAppletTileViewEvent = (BalanceAppletTileViewEvent) obj;
                balanceAppletTileViewEvent.getClass();
                ((Presenter.Binding) this.receiver).sendEvent(balanceAppletTileViewEvent);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$fetch$2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
