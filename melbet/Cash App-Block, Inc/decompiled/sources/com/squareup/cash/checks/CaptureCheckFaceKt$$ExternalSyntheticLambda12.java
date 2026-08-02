package com.squareup.cash.checks;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.text.TextUtilsCompat;
import androidx.core.view.HapticFeedbackConstantsCompat;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.TransactionWrapper;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.Extras;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.mlkit.common.internal.zzc;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.card.onboarding.PdpPanelState;
import com.squareup.cash.card.onboarding.core.ContouredTextMaterial;
import com.squareup.cash.card.onboarding.graphics.ContouredTextRing;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.HoloEffectState;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.clientrouting.routers.savings.SavingsRouter;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.SyncRangeQueries$selectAll$2;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.ShadowedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.clientsync.pipeline.SearchPaymentSyncEntityStorageObserver;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarState;
import com.squareup.cash.common.composeui.animations.RegularShaker;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.db.CryptoStatementQueries$ForTokenQuery;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db2.payment.OfflineQueries$PendingQuery;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.wire.GrpcMethod;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import squareup.cash.savings.SavingsConfig;
import squareup.cash.savings.bespoke_elements.Card;

/* loaded from: classes6.dex */
public final /* synthetic */ class CaptureCheckFaceKt$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda12(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 17;
        SyncRangeQueries$selectAll$2 syncRangeQueries$selectAll$2 = SyncRangeQueries$selectAll$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 24;
        int i3 = 25;
        float f = RecyclerView.DECELERATION_RATE;
        int i4 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                MiSnapState miSnapState = (MiSnapState) obj2;
                MiSnapView miSnapView = (MiSnapView) obj;
                miSnapView.getClass();
                MiSnapView.setTorchEnabled$default(miSnapView, ((Boolean) miSnapState.torchEnabled$delegate.getValue()).booleanValue(), null, 2, null);
                if (((Boolean) miSnapState.takePictureManually$delegate.getValue()).booleanValue()) {
                    miSnapView.takePicture();
                }
                return Unit.INSTANCE;
            case 1:
                ((PaymentDeviceCustomizationPresenter) obj2).cardStudioQueries.delete$2();
                return Unit.INSTANCE;
            case 2:
                ((PdpPanelState) obj2).overlayHeight$delegate.setValue(new Dp(((Dp) obj).value));
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj;
                str.getClass();
                return (CharSequence) ((EnumListAdapter$encode$1) obj2).invoke(str);
            case 4:
                float floatValue = ((Float) obj).floatValue();
                ContouredTextMaterial contouredTextMaterial = (ContouredTextMaterial) ((WriteOperation) obj2).onSuccess;
                contouredTextMaterial.textureOffset = floatValue;
                SharedFlowImpl sharedFlowImpl = contouredTextMaterial._dirty;
                Unit unit = Unit.INSTANCE;
                sharedFlowImpl.tryEmit(unit);
                return unit;
            case 5:
                float floatValue2 = ((Float) obj).floatValue();
                ContouredTextMaterial contouredTextMaterial2 = ((ContouredTextRing) obj2).material;
                contouredTextMaterial2.textureOffset = floatValue2;
                SharedFlowImpl sharedFlowImpl2 = contouredTextMaterial2._dirty;
                Unit unit2 = Unit.INSTANCE;
                sharedFlowImpl2.tryEmit(unit2);
                return unit2;
            case 6:
                Entity entity = (Entity) obj;
                entity.getClass();
                ((HeartScene) obj2).addEntity(entity);
                return Unit.INSTANCE;
            case 7:
                ((Throwable) obj).getClass();
                ((HoloEffectState) obj2).error$delegate.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                Entity entity2 = (Entity) obj;
                entity2.getClass();
                ((MiniCardScene) obj2).addEntity(entity2);
                return Unit.INSTANCE;
            case 9:
                CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj;
                cardSpendingInsightsConfig.getClass();
                return zzahh.toSpendingInsightsConfig((SelectCustomerPresenter) obj2, cardSpendingInsightsConfig);
            case 10:
                CardSpendingInsightsConfig cardSpendingInsightsConfig2 = (CardSpendingInsightsConfig) obj;
                cardSpendingInsightsConfig2.getClass();
                return zzahh.toSpendingInsightsConfig((MusicPresenter) obj2, cardSpendingInsightsConfig2);
            case 11:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                ErrorMessaging errorMessaging = TextUtilsCompat.errorMessaging((AndroidStringManager) disclosurePresenter.stringManager, (ApiResult.Failure) obj, null);
                ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(new FailureMessageScreen(errorMessaging.title, errorMessaging.message, null, (SpendingInsightDetailScreen) disclosurePresenter.analytics, null, 20));
                return Unit.INSTANCE;
            case 12:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((StackedBarChartViewModel.Bar) obj2).accessibilityLabel);
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((EarningsBarViewModel) obj2).contentDescription);
                return Unit.INSTANCE;
            case 14:
                SavingsRouter savingsRouter = (SavingsRouter) obj2;
                SavingsConfig savingsConfig = (SavingsConfig) obj;
                savingsConfig.getClass();
                Card card = savingsConfig.get_cash_card_to_start_earning_card_element;
                if (card != null) {
                    return HapticFeedbackConstantsCompat.toCard(savingsRouter, card);
                }
                return null;
            case 15:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 16:
                OfflineQueries$PendingQuery offlineQueries$PendingQuery = (OfflineQueries$PendingQuery) obj2;
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(offlineQueries$PendingQuery.max_recipients));
                androidStatement2.bindLong(1, Long.valueOf(offlineQueries$PendingQuery.limit));
                return Unit.INSTANCE;
            case 17:
                SyncRangeQueries$selectAll$2 syncRangeQueries$selectAll$2 = SyncRangeQueries$selectAll$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                ((zzc) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).getClass();
                Long l = androidCursor.getLong(0);
                l.getClass();
                SyncTopic syncTopic = new SyncTopic((int) l.longValue());
                byte[] bytes = androidCursor.getBytes(1);
                bytes.getClass();
                return syncRangeQueries$selectAll$2.invoke(syncTopic, bytes);
            case 18:
                BootstrappedSyncEntityStore bootstrappedSyncEntityStore = (BootstrappedSyncEntityStore) obj2;
                bootstrappedSyncEntityStore.destinationStore.deleteAllEntities();
                long j = 0;
                while (true) {
                    List allEntities = bootstrappedSyncEntityStore.sourceStore.getAllEntities(j);
                    Iterator it = allEntities.iterator();
                    while (it.hasNext()) {
                        bootstrappedSyncEntityStore.destinationStore.insertEntity((SyncEntity) it.next());
                    }
                    if (allEntities.size() != 100) {
                        return Unit.INSTANCE;
                    }
                    j += 100;
                }
            case 19:
                BootstrappedSyncRangeStore bootstrappedSyncRangeStore = (BootstrappedSyncRangeStore) obj2;
                List allRanges = bootstrappedSyncRangeStore.sourceStore.getAllRanges();
                bootstrappedSyncRangeStore.auditLog.appendMessage("Bootstrapping with " + allRanges.size() + " ranges from the source store");
                SyncRangeStore syncRangeStore = bootstrappedSyncRangeStore.destinationStore;
                syncRangeStore.deleteAllRanges();
                syncRangeStore.replaceRanges(EmptyList.INSTANCE, allRanges);
                return Unit.INSTANCE;
            case 20:
                ShadowedSyncRangeStore shadowedSyncRangeStore = (ShadowedSyncRangeStore) obj2;
                int i5 = shadowedSyncRangeStore.operationIdGenerator;
                shadowedSyncRangeStore.operationIdGenerator = i5 + 1;
                return CollectionsKt.toList(shadowedSyncRangeStore.audit(i5, "getAllRanges"));
            case 21:
                ((TransactionWrapper) obj).getClass();
                LocalTabContentQueries localTabContentQueries = ((SearchPaymentSyncEntityStorageObserver) obj2).searchQueries;
                localTabContentQueries.driver.execute(-1956341911, "DELETE FROM entity_lookup", null);
                localTabContentQueries.notifyQueries(-1956341911, new SyncRangeQueries$$ExternalSyntheticLambda1(i3));
                localTabContentQueries.driver.execute(-1512702506, "DELETE FROM entity_fts", null);
                localTabContentQueries.notifyQueries(-1512702506, new SyncRangeQueries$$ExternalSyntheticLambda1(i2));
                return Unit.INSTANCE;
            case 22:
                ((TransactionWrapper) obj).getClass();
                LocalTabContentQueries localTabContentQueries2 = ((SearchPaymentSyncEntityStorageObserver) obj2).searchQueries;
                localTabContentQueries2.driver.execute(-1956341911, "DELETE FROM entity_lookup", null);
                localTabContentQueries2.notifyQueries(-1956341911, new SyncRangeQueries$$ExternalSyntheticLambda1(i3));
                localTabContentQueries2.driver.execute(-1512702506, "DELETE FROM entity_fts", null);
                localTabContentQueries2.notifyQueries(-1512702506, new SyncRangeQueries$$ExternalSyntheticLambda1(i2));
                return Unit.INSTANCE;
            case 23:
                CollapsingToolbarState collapsingToolbarState = (CollapsingToolbarState) obj2;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = collapsingToolbarState.height$delegate;
                float floatValue3 = ((Float) obj).floatValue();
                float max = floatValue3 < RecyclerView.DECELERATION_RATE ? Math.max(collapsingToolbarState.minHeightState$delegate.getIntValue() - parcelableSnapshotMutableIntState.getIntValue(), floatValue3) : Math.min(collapsingToolbarState.maxHeightState$delegate.getIntValue() - parcelableSnapshotMutableIntState.getIntValue(), floatValue3);
                float f2 = collapsingToolbarState.deferredConsumption + max;
                int i6 = (int) f2;
                if (Math.abs(f2) > RecyclerView.DECELERATION_RATE) {
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + i6);
                    collapsingToolbarState.deferredConsumption = f2 - i6;
                }
                return Float.valueOf(max);
            case 24:
                RegularShaker regularShaker = (RegularShaker) obj2;
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpec.KeyframesSpecConfig) obj;
                keyframesSpecConfig.durationMillis = 200;
                int i7 = -1;
                while (i4 < 9) {
                    int i8 = i4 + 1;
                    int i9 = i8 * 23;
                    float f3 = regularShaker.distance;
                    float f4 = i4 < 3 ? f3 * i7 : (f3 * i7) / i8;
                    if (((int) f4) != 0) {
                        keyframesSpecConfig.at(Float.valueOf(f4), i9).easing = new CubicBezierEasing(f, f, f4, f4);
                        i7 *= -1;
                        f = f4;
                    }
                    i4 = i8;
                }
                return Unit.INSTANCE;
            case 25:
                ((Density) obj).getClass();
                return new IntOffset(((int) ((Shaker) obj2).getCurrentOffset()) << 32);
            case 26:
                AndroidPath androidPath = (AndroidPath) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                GrpcMethod grpcMethod = layoutNodeDrawScope.canvasDrawScope.drawContext;
                long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                grpcMethod.getCanvas().save();
                try {
                    ((Extras.Key) grpcMethod.path).m1434clipPathmtrdDE(androidPath, 0);
                    layoutNodeDrawScope.drawContent();
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    throw th;
                }
            case 27:
                SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setAlpha(TabToolbarsKt.swipeToolbarControlAlpha(RangesKt___RangesKt.coerceIn(((Number) sharedToolbarSwipeScope.transitionProgress.invoke()).floatValue(), RecyclerView.DECELERATION_RATE, 1.0f), ((Boolean) sharedToolbarSwipeScope.isSourceToolbar.invoke()).booleanValue()));
                return Unit.INSTANCE;
            case 28:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, ((CryptoStatementQueries$ForTokenQuery) obj2).token);
                return Unit.INSTANCE;
            default:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, ((CryptoStatementQueries$ForTokenQuery) obj2).token);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CaptureCheckFaceKt$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
