package androidx.compose.material;

import android.util.Log;
import androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.core.CameraIdentifier;
import androidx.datastore.core.Data;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1;
import androidx.datastore.core.Final;
import androidx.datastore.core.ReadException;
import androidx.datastore.core.State;
import androidx.datastore.core.UnInitialized;
import androidx.viewpager.widget.ViewPager;
import app.cash.local.backend.real.BuyerIntentSyncManager$observeSelections$$inlined$map$1$2$1;
import app.cash.local.backend.real.CalculateLineItemsManager$observeSelections$$inlined$map$1$2$1;
import app.cash.local.backend.real.RealMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1;
import app.cash.local.db.Local_brand_collection;
import app.cash.local.google.pay.payments.RealLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1;
import app.cash.local.presenters.LocalCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1;
import app.cash.local.presenters.LocalEditorialPresenter$models$lambda$10$$inlined$map$1$2$1;
import app.cash.local.presenters.RealBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1;
import app.cash.local.presenters.RealBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1;
import app.cash.local.presenters.brand.profile.ResolvedCustomerProfile;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1;
import app.cash.local.presenters.home.LocalHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1;
import app.cash.local.presenters.map.LocalBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1;
import app.cash.local.presenters.pos.LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1;
import app.cash.local.presenters.wallet.LocalHomePresenter$models$lambda$7$$inlined$map$1$2$1;
import app.cash.local.presenters.wallet.TabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1;
import app.cash.local.presenters.wallet.TabContentPresenter$models$lambda$25$$inlined$filter$1$2$1;
import app.cash.local.primitives.BrandCardDetailsKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.CartEntryKt;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.store.real.RealLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1$2$1;
import app.cash.local.store.real.RealLocalInstalledStore$posCheckIn$$inlined$map$1$2$1;
import app.cash.local.store.real.RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1;
import app.cash.local.store.real.RealLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1;
import app.cash.local.store.real.RealLocalInstalledStore$showGeoTab$$inlined$map$1$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.api.Aliases;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager$select$$inlined$map$1$2;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$lambda$0$$inlined$map$1$2;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.protos.cash.local.client.app.v1.card.BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard$TypeDetails$BrandCardDetails;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.GetBrandCollectionResponse;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.android.ActivityResult;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SwipeableState$special$$inlined$filter$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SafeFlow $this_unsafeTransform$inlined;

    /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object emit$app$cash$local$store$real$RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2(Object obj, Continuation continuation) {
            RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1;
            int i;
            if (continuation instanceof RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1) {
                realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1) continuation;
                int i2 = realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        Local_brand_collection local_brand_collection = (Local_brand_collection) obj;
                        GetBrandCollectionResponse getBrandCollectionResponse = local_brand_collection != null ? local_brand_collection.response : null;
                        if (getBrandCollectionResponse != null) {
                            realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.label = 1;
                            if (this.$this_unsafeFlow.emit(getBrandCollectionResponse, realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
            realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1(this, continuation);
            Object obj22 = realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:193:0x0289  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x030a  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x0314  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0395  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x039f  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x03d1  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x03db  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x0412  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x041c  */
        /* JADX WARN: Removed duplicated region for block: B:335:0x0453  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x045d  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x04ae  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x04b8  */
        /* JADX WARN: Removed duplicated region for block: B:383:0x04ef  */
        /* JADX WARN: Removed duplicated region for block: B:389:0x04f9  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:405:0x0530  */
        /* JADX WARN: Removed duplicated region for block: B:411:0x053a  */
        /* JADX WARN: Removed duplicated region for block: B:442:0x05a1  */
        /* JADX WARN: Removed duplicated region for block: B:448:0x05ab  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:463:0x05e6  */
        /* JADX WARN: Removed duplicated region for block: B:469:0x05f2  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x0687  */
        /* JADX WARN: Removed duplicated region for block: B:511:0x0691  */
        /* JADX WARN: Removed duplicated region for block: B:527:0x06c8  */
        /* JADX WARN: Removed duplicated region for block: B:533:0x06d2  */
        /* JADX WARN: Removed duplicated region for block: B:564:0x073d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:570:0x0747  */
        /* JADX WARN: Removed duplicated region for block: B:584:0x077e  */
        /* JADX WARN: Removed duplicated region for block: B:590:0x0788  */
        /* JADX WARN: Removed duplicated region for block: B:622:0x07e7  */
        /* JADX WARN: Removed duplicated region for block: B:628:0x07f1  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:656:0x086f  */
        /* JADX WARN: Removed duplicated region for block: B:662:0x0879  */
        /* JADX WARN: Removed duplicated region for block: B:690:0x08f7  */
        /* JADX WARN: Removed duplicated region for block: B:696:0x0901  */
        /* JADX WARN: Removed duplicated region for block: B:722:0x0955  */
        /* JADX WARN: Removed duplicated region for block: B:728:0x095f  */
        /* JADX WARN: Removed duplicated region for block: B:756:0x09c8  */
        /* JADX WARN: Removed duplicated region for block: B:762:0x09d2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0121  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1;
            int i2;
            CameraIdentifier cameraIdentifier;
            DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1;
            int i3;
            BuyerIntentSyncManager$observeSelections$$inlined$map$1$2$1 buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1;
            int i4;
            CalculateLineItemsManager$observeSelections$$inlined$map$1$2$1 calculateLineItemsManager$observeSelections$$inlined$map$1$2$1;
            int i5;
            RealMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1 realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1;
            int i6;
            RealLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1 realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1;
            int i7;
            LocalAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1 localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1;
            int i8;
            String str;
            BrandCardDetails brandCardDetails;
            LocalCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1 localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1;
            int i9;
            LocalEditorialPresenter$models$lambda$10$$inlined$map$1$2$1 localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1;
            int i10;
            RealBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1 realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1;
            int i11;
            RealBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1 realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1;
            int i12;
            String str2;
            BrandCardDetails brandCardDetails2;
            LocalBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1 localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1;
            int i13;
            LocalBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1 localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1;
            int i14;
            LocalBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1 localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1;
            int i15;
            LocalBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1 localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1;
            int i16;
            LocalHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1 localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1;
            int i17;
            LocalBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1 localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1;
            int i18;
            LocalPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1 localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1;
            int i19;
            LocalPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1 localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1;
            int i20;
            LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1 localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1;
            int i21;
            LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1 localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1;
            int i22;
            LocalHomePresenter$models$lambda$7$$inlined$map$1$2$1 localHomePresenter$models$lambda$7$$inlined$map$1$2$1;
            int i23;
            TabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1;
            int i24;
            TabContentPresenter$models$lambda$25$$inlined$filter$1$2$1 tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1;
            int i25;
            RealLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1;
            int i26;
            RealLocalInstalledStore$hideBrands$$inlined$map$1$2$1 realLocalInstalledStore$hideBrands$$inlined$map$1$2$1;
            int i27;
            Boolean bool;
            RealLocalInstalledStore$posCheckIn$$inlined$map$1$2$1 realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1;
            int i28;
            RealLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1 realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1;
            int i29;
            GetBrandCollectionResponse getBrandCollectionResponse;
            Long l;
            int i30 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i30) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i31 = anonymousClass1.label;
                        if ((i31 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i31 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                if (!((Map) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == obj3) {
                                        return obj3;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                case 1:
                    if (continuation instanceof PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1) {
                        pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 = (PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1) continuation;
                        int i32 = pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.label;
                        if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                            pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.label = i32 - PKIFailureInfo.systemUnavail;
                            Object obj4 = pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.result;
                            Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                ArrayList arrayList = new ArrayList();
                                Iterator it = ((List) obj).iterator();
                                while (it.hasNext()) {
                                    String str3 = ((CameraId) it.next()).value;
                                    try {
                                        cameraIdentifier = Aliases.create(str3, null, null);
                                    } catch (Exception e) {
                                        Log.w("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str3, e);
                                        cameraIdentifier = null;
                                    }
                                    if (cameraIdentifier != null) {
                                        arrayList.add(cameraIdentifier);
                                    }
                                }
                                pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList, pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1) == obj5) {
                                    return obj5;
                                }
                            } else {
                                if (i2 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj4);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 = new PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1(this, continuation);
                    Object obj42 = pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.result;
                    Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = pipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    if (continuation instanceof DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1) {
                        dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i33 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                            dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                            Object obj6 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                State state = (State) obj;
                                if (state instanceof ReadException) {
                                    throw ((ReadException) state).readException;
                                }
                                if (!(state instanceof Data)) {
                                    if (state instanceof Final ? true : state instanceof UnInitialized) {
                                        a$$ExternalSyntheticBUOutline0.m$1("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                        return null;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                Object obj8 = ((Data) state).value;
                                dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj8, dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1) == obj7) {
                                    return obj7;
                                }
                            } else {
                                if (i3 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj6);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj62 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                    return Unit.INSTANCE;
                case 3:
                    if (continuation instanceof BuyerIntentSyncManager$observeSelections$$inlined$map$1$2$1) {
                        buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1 = (BuyerIntentSyncManager$observeSelections$$inlined$map$1$2$1) continuation;
                        int i34 = buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj9 = buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.result;
                            Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj9);
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj11 : (List) obj) {
                                    if (((CartEntryWithQuantity) obj11).getQuantity() > 0) {
                                        arrayList2.add(obj11);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    CartEntryWithQuantity cartEntryWithQuantity = (CartEntryWithQuantity) it2.next();
                                    cartEntryWithQuantity.getClass();
                                    arrayList3.add(CartEntryKt.toSelection(cartEntryWithQuantity.getCartEntry(), cartEntryWithQuantity.getQuantity()));
                                }
                                buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList3, buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1) == obj10) {
                                    return obj10;
                                }
                            } else {
                                if (i4 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj9);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1 = new BuyerIntentSyncManager$observeSelections$$inlined$map$1$2$1(this, continuation);
                    Object obj92 = buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.result;
                    Object obj102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = buyerIntentSyncManager$observeSelections$$inlined$map$1$2$1.label;
                    if (i4 != 0) {
                    }
                    return Unit.INSTANCE;
                case 4:
                    if (continuation instanceof CalculateLineItemsManager$observeSelections$$inlined$map$1$2$1) {
                        calculateLineItemsManager$observeSelections$$inlined$map$1$2$1 = (CalculateLineItemsManager$observeSelections$$inlined$map$1$2$1) continuation;
                        int i35 = calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj12 = calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.result;
                            Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj12);
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj14 : (List) obj) {
                                    if (((CartEntryWithQuantity) obj14).getQuantity() > 0) {
                                        arrayList4.add(obj14);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                                Iterator it3 = arrayList4.iterator();
                                while (it3.hasNext()) {
                                    CartEntryWithQuantity cartEntryWithQuantity2 = (CartEntryWithQuantity) it3.next();
                                    cartEntryWithQuantity2.getClass();
                                    arrayList5.add(CartEntryKt.toSelection(cartEntryWithQuantity2.getCartEntry(), cartEntryWithQuantity2.getQuantity()));
                                }
                                calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList5, calculateLineItemsManager$observeSelections$$inlined$map$1$2$1) == obj13) {
                                    return obj13;
                                }
                            } else {
                                if (i5 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj12);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    calculateLineItemsManager$observeSelections$$inlined$map$1$2$1 = new CalculateLineItemsManager$observeSelections$$inlined$map$1$2$1(this, continuation);
                    Object obj122 = calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.result;
                    Object obj132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = calculateLineItemsManager$observeSelections$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    if (continuation instanceof RealMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1) {
                        realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1 = (RealMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1) continuation;
                        int i36 = realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj15 = realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.result;
                            Object obj16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                List list = (List) obj;
                                if (list != null) {
                                    List list2 = list;
                                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                        Iterator it4 = list2.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                MarketingMessageData.Badge badge = ((MarketingMessageData) it4.next()).badge;
                                                if (badge != null && !badge.isViewed) {
                                                    r1 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                Object valueOf = Boolean.valueOf(r1);
                                realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1) == obj16) {
                                    return obj16;
                                }
                            } else {
                                if (i6 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj15);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1 = new RealMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1(this, continuation);
                    Object obj152 = realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.result;
                    Object obj162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realMarketingMessageRepository$hasUnviewedMessages$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                    return Unit.INSTANCE;
                case 6:
                    if (continuation instanceof RealLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1) {
                        realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1 = (RealLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1) continuation;
                        int i37 = realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj17 = realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.result;
                            Object obj18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                if (((ActivityResult) obj).requestCode == 11) {
                                    realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1) == obj18) {
                                        return obj18;
                                    }
                                }
                            } else {
                                if (i7 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj17);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1 = new RealLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1(this, continuation);
                    Object obj172 = realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.result;
                    Object obj182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realLocalGooglePayPaymentsClient$loadPaymentData$$inlined$filter$1$2$1.label;
                    if (i7 != 0) {
                    }
                    return Unit.INSTANCE;
                case 7:
                    if (continuation instanceof LocalAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1) {
                        localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1 = (LocalAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1) continuation;
                        int i38 = localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj19 = localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                            Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it5 = ((List) obj).iterator();
                                while (it5.hasNext()) {
                                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails = ((LocalCard) it5.next()).type_details;
                                    if (localCard$TypeDetails$BrandCardDetails == null || (brandCardDetails = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails)) == null) {
                                        str = null;
                                    } else {
                                        str = brandCardDetails.brand_token;
                                        str.getClass();
                                    }
                                    BrandToken brandToken = str != null ? new BrandToken(str) : null;
                                    if (brandToken != null) {
                                        arrayList6.add(brandToken);
                                    }
                                }
                                Object set = CollectionsKt.toSet(arrayList6);
                                localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(set, localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1) == obj20) {
                                    return obj20;
                                }
                            } else {
                                if (i8 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj19);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1 = new LocalAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1(this, continuation);
                    Object obj192 = localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.result;
                    Object obj202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = localAddBrandsPresenter$models$lambda$9$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                    return Unit.INSTANCE;
                case 8:
                    if (continuation instanceof LocalCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1) {
                        localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1 = (LocalCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1) continuation;
                        int i39 = localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj21 = localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.result;
                            Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj21);
                                LocalCashBalance localCashBalance = (LocalCashBalance) obj;
                                if ((localCashBalance != null ? localCashBalance.amount : null) != null) {
                                    localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1) == obj23) {
                                        return obj23;
                                    }
                                }
                            } else {
                                if (i9 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj21);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1 = new LocalCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1(this, continuation);
                    Object obj212 = localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.result;
                    Object obj232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = localCashBalancePresenter$models$lambda$18$$inlined$filter$1$2$1.label;
                    if (i9 != 0) {
                    }
                    return Unit.INSTANCE;
                case 9:
                    if (continuation instanceof LocalEditorialPresenter$models$lambda$10$$inlined$map$1$2$1) {
                        localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1 = (LocalEditorialPresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                        int i40 = localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj24 = localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                            Object obj25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj26 : (List) obj) {
                                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails2 = ((LocalCard) obj26).type_details;
                                    if ((localCard$TypeDetails$BrandCardDetails2 != null ? BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails2) : null) != null) {
                                        arrayList7.add(obj26);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                                Iterator it6 = arrayList7.iterator();
                                while (it6.hasNext()) {
                                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails3 = ((LocalCard) it6.next()).type_details;
                                    localCard$TypeDetails$BrandCardDetails3.getClass();
                                    BrandCardDetails brandCardDetails3 = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails3);
                                    brandCardDetails3.getClass();
                                    String str4 = brandCardDetails3.brand_token;
                                    str4.getClass();
                                    String str5 = brandCardDetails3.location_token;
                                    if (str5 == null) {
                                        str5 = null;
                                    }
                                    arrayList8.add(new BrandSpot(str4, str5));
                                }
                                Object set2 = CollectionsKt.toSet(arrayList8);
                                localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(set2, localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1) == obj25) {
                                    return obj25;
                                }
                            } else {
                                if (i10 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj24);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1 = new LocalEditorialPresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                    Object obj242 = localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.result;
                    Object obj252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = localEditorialPresenter$models$lambda$10$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                case 10:
                    if (continuation instanceof RealBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1) {
                        realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1 = (RealBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1) continuation;
                        int i41 = realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj27 = realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.result;
                            Object obj28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj27);
                                Object valueOf2 = Boolean.valueOf(((LocalBrand) obj).banner == LocalBrand.Banner.BANNER_ADD_BRAND_OR_REMOVE);
                                realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1) == obj28) {
                                    return obj28;
                                }
                            } else {
                                if (i11 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj27);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1 = new RealBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1(this, continuation);
                    Object obj272 = realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.result;
                    Object obj282 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realBrandFollowPresenter$models$lambda$11$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                    return Unit.INSTANCE;
                case 11:
                    if (continuation instanceof RealBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1) {
                        realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1 = (RealBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1) continuation;
                        int i42 = realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj29 = realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                            Object obj30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj29);
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it7 = ((List) obj).iterator();
                                while (it7.hasNext()) {
                                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails4 = ((LocalCard) it7.next()).type_details;
                                    if (localCard$TypeDetails$BrandCardDetails4 == null || (brandCardDetails2 = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails4)) == null) {
                                        str2 = null;
                                    } else {
                                        str2 = brandCardDetails2.brand_token;
                                        str2.getClass();
                                    }
                                    BrandToken brandToken2 = str2 != null ? new BrandToken(str2) : null;
                                    if (brandToken2 != null) {
                                        arrayList9.add(brandToken2);
                                    }
                                }
                                realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList9, realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1) == obj30) {
                                    return obj30;
                                }
                            } else {
                                if (i12 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj29);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1 = new RealBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1(this, continuation);
                    Object obj292 = realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.result;
                    Object obj302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realBrandFollowPresenter$models$lambda$3$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                    return Unit.INSTANCE;
                case 12:
                    if (continuation instanceof LocalBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1) {
                        localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1 = (LocalBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1) continuation;
                        int i43 = localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj31 = localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.result;
                            Object obj33 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj31);
                                LocalCashBalance localCashBalance2 = (LocalCashBalance) obj;
                                if ((localCashBalance2 != null ? localCashBalance2.amount : null) != null) {
                                    localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1) == obj33) {
                                        return obj33;
                                    }
                                }
                            } else {
                                if (i13 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj31);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1 = new LocalBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1(this, continuation);
                    Object obj312 = localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.result;
                    Object obj332 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = localBrandLocationCheckoutPresenter$models$lambda$7$$inlined$filter$1$2$1.label;
                    if (i13 != 0) {
                    }
                    return Unit.INSTANCE;
                case 13:
                    if (continuation instanceof LocalBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1) {
                        localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1 = (LocalBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1) continuation;
                        int i44 = localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj34 = localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.result;
                            Object obj35 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj34);
                                LocalCashBalance localCashBalance3 = (LocalCashBalance) obj;
                                if ((localCashBalance3 != null ? localCashBalance3.amount : null) != null) {
                                    localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1) == obj35) {
                                        return obj35;
                                    }
                                }
                            } else {
                                if (i14 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj34);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1 = new LocalBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1(this, continuation);
                    Object obj342 = localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.result;
                    Object obj352 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = localBrandProfilePresenter$models$lambda$21$$inlined$filter$1$2$1.label;
                    if (i14 != 0) {
                    }
                    return Unit.INSTANCE;
                case 14:
                    if (continuation instanceof LocalBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1) {
                        localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1 = (LocalBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1) continuation;
                        int i45 = localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj36 = localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.result;
                            Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj36);
                                PublicProfile publicProfile = (PublicProfile) obj;
                                String str6 = publicProfile.photoUrl;
                                if (str6 == null || StringsKt.isBlank(str6)) {
                                    str6 = null;
                                }
                                Character monogram = FillrWidget.WidgetType.AnonymousClass1.getMonogram(publicProfile);
                                Object resolvedCustomerProfile = new ResolvedCustomerProfile(publicProfile.accentColor, str6, monogram != null ? String.valueOf(monogram.charValue()) : null);
                                localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(resolvedCustomerProfile, localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1) == obj37) {
                                    return obj37;
                                }
                            } else {
                                if (i15 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj36);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1 = new LocalBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1(this, continuation);
                    Object obj362 = localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.result;
                    Object obj372 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = localBrandProfilePresenter$models$lambda$23$$inlined$map$1$2$1.label;
                    if (i15 != 0) {
                    }
                    return Unit.INSTANCE;
                case 15:
                    if (continuation instanceof LocalBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1) {
                        localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1 = (LocalBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1) continuation;
                        int i46 = localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj38 = localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.result;
                            Object obj39 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj38);
                                LocalCashBalance localCashBalance4 = (LocalCashBalance) obj;
                                if ((localCashBalance4 != null ? localCashBalance4.amount : null) != null) {
                                    localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1) == obj39) {
                                        return obj39;
                                    }
                                }
                            } else {
                                if (i16 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj38);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1 = new LocalBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1(this, continuation);
                    Object obj382 = localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.result;
                    Object obj392 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = localBrandLocationCartPresenter$models$lambda$27$$inlined$filter$1$2$1.label;
                    if (i16 != 0) {
                    }
                    return Unit.INSTANCE;
                case 16:
                    if (continuation instanceof LocalHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1) {
                        localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1 = (LocalHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1) continuation;
                        int i47 = localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj40 = localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.result;
                            Object obj41 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj40);
                                LocalCashBalance localCashBalance5 = (LocalCashBalance) obj;
                                if ((localCashBalance5 != null ? localCashBalance5.amount : null) != null) {
                                    localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1) == obj41) {
                                        return obj41;
                                    }
                                }
                            } else {
                                if (i17 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj40);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1 = new LocalHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1(this, continuation);
                    Object obj402 = localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.result;
                    Object obj412 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = localHomeGeoPresenter$models$lambda$6$$inlined$filter$1$2$1.label;
                    if (i17 != 0) {
                    }
                    return Unit.INSTANCE;
                case 17:
                    if (continuation instanceof LocalBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1) {
                        localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1 = (LocalBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1) continuation;
                        int i48 = localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj43 = localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                            Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj43);
                                Object obj45 = ((GetBrandCollectionResponse) obj).brand_collection;
                                localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj45, localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1) == obj44) {
                                    return obj44;
                                }
                            } else {
                                if (i18 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj43);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1 = new LocalBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1(this, continuation);
                    Object obj432 = localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.result;
                    Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = localBrandCollectionMapPresenter$models$lambda$4$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                    return Unit.INSTANCE;
                case 18:
                    if (continuation instanceof LocalPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1) {
                        localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1 = (LocalPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1) continuation;
                        int i49 = localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj46 = localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.result;
                            Object obj47 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj46);
                                LocalCashBalance localCashBalance6 = (LocalCashBalance) obj;
                                if ((localCashBalance6 != null ? localCashBalance6.amount : null) != null) {
                                    localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1) == obj47) {
                                        return obj47;
                                    }
                                }
                            } else {
                                if (i19 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj46);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1 = new LocalPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1(this, continuation);
                    Object obj462 = localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.result;
                    Object obj472 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = localPosCheckInPresenter$models$lambda$0$$inlined$filter$1$2$1.label;
                    if (i19 != 0) {
                    }
                    return Unit.INSTANCE;
                case 19:
                    if (continuation instanceof LocalPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1) {
                        localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1 = (LocalPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                        int i50 = localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj48 = localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                            Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj48);
                                LocalCashBalance localCashBalance7 = (LocalCashBalance) obj;
                                localCashBalance7.getClass();
                                Long l2 = localCashBalance7.amount;
                                Object l3 = new Long(l2 != null ? l2.longValue() : 0L);
                                localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(l3, localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1) == obj49) {
                                    return obj49;
                                }
                            } else {
                                if (i20 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj48);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1 = new LocalPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                    Object obj482 = localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.result;
                    Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = localPosCheckInPresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                    return Unit.INSTANCE;
                case 20:
                    if (continuation instanceof LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1) {
                        localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1 = (LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1) continuation;
                        int i51 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj50 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.result;
                            Object obj51 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj50);
                                LocalCashBalance localCashBalance8 = (LocalCashBalance) obj;
                                if ((localCashBalance8 != null ? localCashBalance8.amount : null) != null) {
                                    localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1) == obj51) {
                                        return obj51;
                                    }
                                }
                            } else {
                                if (i21 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj50);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1 = new LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1(this, continuation);
                    Object obj502 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.result;
                    Object obj512 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$filter$1$2$1.label;
                    if (i21 != 0) {
                    }
                    return Unit.INSTANCE;
                case 21:
                    if (continuation instanceof LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1) {
                        localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1 = (LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1) continuation;
                        int i52 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj53 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                            Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj53);
                                LocalCashBalance localCashBalance9 = (LocalCashBalance) obj;
                                localCashBalance9.getClass();
                                Long l4 = localCashBalance9.amount;
                                Object l5 = new Long(l4 != null ? l4.longValue() : 0L);
                                localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(l5, localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1) == obj54) {
                                    return obj54;
                                }
                            } else {
                                if (i22 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj53);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1 = new LocalPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1(this, continuation);
                    Object obj532 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.result;
                    Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = localPosLocalCashRedemptionPresenter$models$lambda$2$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                    return Unit.INSTANCE;
                case 22:
                    if (continuation instanceof LocalHomePresenter$models$lambda$7$$inlined$map$1$2$1) {
                        localHomePresenter$models$lambda$7$$inlined$map$1$2$1 = (LocalHomePresenter$models$lambda$7$$inlined$map$1$2$1) continuation;
                        int i53 = localHomePresenter$models$lambda$7$$inlined$map$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            localHomePresenter$models$lambda$7$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj55 = localHomePresenter$models$lambda$7$$inlined$map$1$2$1.result;
                            Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = localHomePresenter$models$lambda$7$$inlined$map$1$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj55);
                                Object obj57 = (Boolean) obj;
                                obj57.getClass();
                                localHomePresenter$models$lambda$7$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj57, localHomePresenter$models$lambda$7$$inlined$map$1$2$1) == obj56) {
                                    return obj56;
                                }
                            } else {
                                if (i23 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj55);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    localHomePresenter$models$lambda$7$$inlined$map$1$2$1 = new LocalHomePresenter$models$lambda$7$$inlined$map$1$2$1(this, continuation);
                    Object obj552 = localHomePresenter$models$lambda$7$$inlined$map$1$2$1.result;
                    Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = localHomePresenter$models$lambda$7$$inlined$map$1$2$1.label;
                    if (i23 != 0) {
                    }
                    return Unit.INSTANCE;
                case 23:
                    if (continuation instanceof TabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) {
                        tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 = (TabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i54 = tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj58 = tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj59 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj58);
                                ArrayList arrayList10 = new ArrayList();
                                for (Object obj60 : (List) obj) {
                                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails5 = ((LocalCard) obj60).type_details;
                                    if ((localCard$TypeDetails$BrandCardDetails5 != null ? BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails5) : null) != null) {
                                        arrayList10.add(obj60);
                                    }
                                }
                                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList10, 10));
                                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                                Iterator it8 = arrayList10.iterator();
                                while (it8.hasNext()) {
                                    Object next = it8.next();
                                    LocalCard$TypeDetails$BrandCardDetails localCard$TypeDetails$BrandCardDetails6 = ((LocalCard) next).type_details;
                                    localCard$TypeDetails$BrandCardDetails6.getClass();
                                    BrandCardDetails brandCardDetails4 = BrandCardDetailsKt.getBrandCardDetails(localCard$TypeDetails$BrandCardDetails6);
                                    brandCardDetails4.getClass();
                                    String str7 = brandCardDetails4.brand_token;
                                    str7.getClass();
                                    String str8 = brandCardDetails4.location_token;
                                    if (str8 == null) {
                                        str8 = null;
                                    }
                                    linkedHashMap.put(new BrandSpot(str7, str8), next);
                                }
                                tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(linkedHashMap, tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1) == obj59) {
                                    return obj59;
                                }
                            } else {
                                if (i24 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj58);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1 = new TabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj582 = tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj592 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = tabContentPresenter$models$6$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                    return Unit.INSTANCE;
                case 24:
                    if (continuation instanceof TabContentPresenter$models$lambda$25$$inlined$filter$1$2$1) {
                        tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1 = (TabContentPresenter$models$lambda$25$$inlined$filter$1$2$1) continuation;
                        int i55 = tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj61 = tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.result;
                            Object obj63 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj61);
                                LocalCashBalance localCashBalance10 = (LocalCashBalance) obj;
                                if ((localCashBalance10 != null ? localCashBalance10.amount : null) != null) {
                                    tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1) == obj63) {
                                        return obj63;
                                    }
                                }
                            } else {
                                if (i25 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj61);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1 = new TabContentPresenter$models$lambda$25$$inlined$filter$1$2$1(this, continuation);
                    Object obj612 = tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.result;
                    Object obj632 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = tabContentPresenter$models$lambda$25$$inlined$filter$1$2$1.label;
                    if (i25 != 0) {
                    }
                    return Unit.INSTANCE;
                case 25:
                    if (continuation instanceof RealLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1) {
                        realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1) continuation;
                        int i56 = realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj64 = realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.result;
                            Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj64);
                                FullCashtag fullCashtag = ((PublicProfile) obj).fullCashtag;
                                Object cashtagWithCurrencySymbol = fullCashtag != null ? FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag) : null;
                                if (cashtagWithCurrencySymbol != null) {
                                    realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(cashtagWithCurrencySymbol, realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1) == obj65) {
                                        return obj65;
                                    }
                                }
                            } else {
                                if (i26 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj64);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj642 = realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.result;
                    Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realLocalInstalledStore$cashtag$$inlined$mapNotNull$1$2$1.label;
                    if (i26 != 0) {
                    }
                    return Unit.INSTANCE;
                case 26:
                    if (continuation instanceof RealLocalInstalledStore$hideBrands$$inlined$map$1$2$1) {
                        realLocalInstalledStore$hideBrands$$inlined$map$1$2$1 = (RealLocalInstalledStore$hideBrands$$inlined$map$1$2$1) continuation;
                        int i57 = realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj66 = realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.result;
                            Object obj67 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj66);
                                LocalAccount localAccount = (LocalAccount) obj;
                                Object valueOf3 = Boolean.valueOf((localAccount == null || (bool = localAccount.hide_brand_discovery) == null) ? true : bool.booleanValue());
                                realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf3, realLocalInstalledStore$hideBrands$$inlined$map$1$2$1) == obj67) {
                                    return obj67;
                                }
                            } else {
                                if (i27 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj66);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocalInstalledStore$hideBrands$$inlined$map$1$2$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1$2$1(this, continuation);
                    Object obj662 = realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.result;
                    Object obj672 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realLocalInstalledStore$hideBrands$$inlined$map$1$2$1.label;
                    if (i27 != 0) {
                    }
                    return Unit.INSTANCE;
                case 27:
                    if (continuation instanceof RealLocalInstalledStore$posCheckIn$$inlined$map$1$2$1) {
                        realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1 = (RealLocalInstalledStore$posCheckIn$$inlined$map$1$2$1) continuation;
                        int i58 = realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj68 = realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.result;
                            Object obj69 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj68);
                                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) CollectionsKt.sortedWith((List) obj, new ViewPager.AnonymousClass1(16)));
                                realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull, realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1) == obj69) {
                                    return obj69;
                                }
                            } else {
                                if (i28 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj68);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1 = new RealLocalInstalledStore$posCheckIn$$inlined$map$1$2$1(this, continuation);
                    Object obj682 = realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.result;
                    Object obj692 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realLocalInstalledStore$posCheckIn$$inlined$map$1$2$1.label;
                    if (i28 != 0) {
                    }
                    return Unit.INSTANCE;
                case 28:
                    return emit$app$cash$local$store$real$RealLocalInstalledStore$selectBrandCollection$$inlined$mapNotNull$1$2(obj, continuation);
                default:
                    if (continuation instanceof RealLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1) {
                        realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1 = (RealLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1) continuation;
                        int i59 = realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj70 = realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.result;
                            Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj70);
                                Local_brand_collection local_brand_collection = (Local_brand_collection) obj;
                                if (local_brand_collection != null && (getBrandCollectionResponse = local_brand_collection.response) != null && (l = getBrandCollectionResponse.expires_at) != null) {
                                    r3 = l.longValue();
                                }
                                Object l6 = new Long(r3);
                                realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(l6, realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1) == obj71) {
                                    return obj71;
                                }
                            } else {
                                if (i29 != 1) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj70);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1 = new RealLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj702 = realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.result;
                    Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = realLocalInstalledStore$selectBrandCollectionExpiresAt$$inlined$mapNotNull$1$2$1.label;
                    if (i29 != 0) {
                    }
                    return Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ SwipeableState$special$$inlined$filter$1(SafeFlow safeFlow, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = safeFlow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 16;
        int i3 = 23;
        int i4 = 24;
        int i5 = 28;
        int i6 = 29;
        int i7 = 4;
        int i8 = 1;
        int i9 = 2;
        SafeFlow safeFlow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = safeFlow.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = safeFlow.collect(new RealLocalInstalledStore$showGeoTab$$inlined$map$1$2(flowCollector, 9), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = safeFlow.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = safeFlow.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, i7), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = safeFlow.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = safeFlow.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 20), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = safeFlow.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, i3), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = safeFlow.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = safeFlow.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i5), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = safeFlow.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(flowCollector, i6), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i9), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 7), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 8), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = safeFlow.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i4), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = safeFlow.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 12), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = safeFlow.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, 22), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = safeFlow.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, i3), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = safeFlow.collect(new RealP2pSettingsManager$select$$inlined$map$1$2(flowCollector, i4), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = safeFlow.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, 6), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object collect21 = safeFlow.collect(new RealTabProvider$setup$lambda$0$$inlined$map$1$2(flowCollector, i9), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = safeFlow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 26), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = safeFlow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, 27), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = safeFlow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i5), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = safeFlow.collect(new RealDrawerOpener$getDrawerScreen$$inlined$map$1.AnonymousClass2(flowCollector, i6), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, i8), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, i9), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 3), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, i7), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = safeFlow.collect(new AssignedJobProviderKt$jobs$$inlined$map$1.AnonymousClass2(flowCollector, 5), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
