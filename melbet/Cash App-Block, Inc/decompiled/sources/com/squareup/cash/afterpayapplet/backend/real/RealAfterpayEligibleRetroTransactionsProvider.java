package com.squareup.cash.afterpayapplet.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.afterpayapplet.backend.AfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.cashsuggest.api.OrderRow;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.wire.GrpcStatus;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealAfterpayEligibleRetroTransactionsProvider implements AfterpayEligibleRetroTransactionsProvider {
    public final AndroidDateFormatManager dateFormatManager;
    public final Lazy formatter$delegate;
    public final CoroutineContext jsContext;
    public final Flow jsDataProcessor;
    public ArrayList transactionsCache;
    public final Lazy zoneId$delegate;

    /* loaded from: classes8.dex */
    public final class RetroActivityData {
        public final PaymentHistoryData paymentData;
        public final AnalyticsEvent tapEvent;
        public final AnalyticsEvent viewEvent;

        public RetroActivityData(PaymentHistoryData paymentHistoryData, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2) {
            paymentHistoryData.getClass();
            this.paymentData = paymentHistoryData;
            this.tapEvent = analyticsEvent;
            this.viewEvent = analyticsEvent2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetroActivityData)) {
                return false;
            }
            RetroActivityData retroActivityData = (RetroActivityData) obj;
            return Intrinsics.areEqual(this.paymentData, retroActivityData.paymentData) && Intrinsics.areEqual(this.tapEvent, retroActivityData.tapEvent) && Intrinsics.areEqual(this.viewEvent, retroActivityData.viewEvent);
        }

        public final PaymentHistoryData getPaymentData() {
            return this.paymentData;
        }

        public final AnalyticsEvent getTapEvent() {
            return this.tapEvent;
        }

        public final AnalyticsEvent getViewEvent() {
            return this.viewEvent;
        }

        public final int hashCode() {
            int hashCode = this.paymentData.hashCode() * 31;
            AnalyticsEvent analyticsEvent = this.tapEvent;
            int hashCode2 = (hashCode + (analyticsEvent == null ? 0 : analyticsEvent.hashCode())) * 31;
            AnalyticsEvent analyticsEvent2 = this.viewEvent;
            return hashCode2 + (analyticsEvent2 != null ? analyticsEvent2.hashCode() : 0);
        }

        public final String toString() {
            return "RetroActivityData(paymentData=" + this.paymentData + ", tapEvent=" + this.tapEvent + ", viewEvent=" + this.viewEvent + ")";
        }
    }

    public RealAfterpayEligibleRetroTransactionsProvider(Flow flow, CoroutineContext coroutineContext, AndroidDateFormatManager androidDateFormatManager, AndroidClock androidClock) {
        flow.getClass();
        coroutineContext.getClass();
        androidDateFormatManager.getClass();
        androidClock.getClass();
        this.jsDataProcessor = flow;
        this.jsContext = coroutineContext;
        this.dateFormatManager = androidDateFormatManager;
        this.formatter$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 1));
        this.zoneId$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(androidClock, 2));
        this.transactionsCache = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d7, code lost:
    
        if (r0 != r7) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00c2, code lost:
    
        if (r0 == r7) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable processTransactions(List list, ContinuationImpl continuationImpl) {
        RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1 realAfterpayEligibleRetroTransactionsProvider$processTransactions$1;
        int i;
        ArrayList arrayList;
        ActivityRow.Body body;
        PaymentHistoryInputsRow access$getPaymentHistoryInputsRow;
        RetroTransaction.Button button;
        StackedAvatarViewModel.Avatar avatar;
        List list2;
        List list3;
        String str;
        Icons icons;
        String str2;
        if (continuationImpl instanceof RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1) {
            realAfterpayEligibleRetroTransactionsProvider$processTransactions$1 = (RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1) continuationImpl;
            int i2 = realAfterpayEligibleRetroTransactionsProvider$processTransactions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayEligibleRetroTransactionsProvider$processTransactions$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1 realAfterpayEligibleRetroTransactionsProvider$processTransactions$12 = realAfterpayEligibleRetroTransactionsProvider$processTransactions$1;
                Object obj = realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.transactionsCache.isEmpty()) {
                        return this.transactionsCache;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        OrderRow orderRow = (OrderRow) it.next();
                        ActivityRow activityRow = orderRow.activity_row;
                        Triple triple = (activityRow == null || (body = activityRow.body) == null || (access$getPaymentHistoryInputsRow = RealAfterpayEligibleRetroTransactionsProviderKt.access$getPaymentHistoryInputsRow(body)) == null) ? null : new Triple(access$getPaymentHistoryInputsRow, orderRow.analytic_tap_event, orderRow.analytic_view_event);
                        if (triple != null) {
                            arrayList2.add(triple);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((PaymentHistoryInputsRow) ((Triple) next).component1()).entity_id != null) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList = !arrayList3.isEmpty() ? arrayList3 : null;
                    if (arrayList == null) {
                        return EmptyList.INSTANCE;
                    }
                    realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.L$1 = arrayList;
                    realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.label = 1;
                    obj = FlowKt.first(this.jsDataProcessor, realAfterpayEligibleRetroTransactionsProvider$processTransactions$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        ArrayList filterNotNull = CollectionsKt.filterNotNull((Iterable) obj);
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10));
                        Iterator it3 = filterNotNull.iterator();
                        while (it3.hasNext()) {
                            RetroActivityData retroActivityData = (RetroActivityData) it3.next();
                            String str3 = retroActivityData.getPaymentData().primary_label;
                            String str4 = (str3 == null && (str3 = retroActivityData.getPaymentData().title) == null) ? "" : str3;
                            String str5 = retroActivityData.getPaymentData().secondary_label;
                            String str6 = (str5 == null && (str5 = retroActivityData.getPaymentData().subtitle) == null) ? "" : str5;
                            String str7 = retroActivityData.getPaymentData().tertiary_label;
                            String str8 = str7 == null ? "" : str7;
                            PaymentHistoryButton paymentHistoryButton = retroActivityData.getPaymentData().inline_button;
                            if (paymentHistoryButton == null || (str = paymentHistoryButton.url) == null) {
                                button = null;
                            } else {
                                String str9 = paymentHistoryButton.text;
                                String str10 = str9 == null ? "" : str9;
                                Icon icon = paymentHistoryButton.arcade_icon;
                                if (icon == null || (str2 = icon.arcade_id) == null) {
                                    icons = null;
                                } else {
                                    Icons.Companion.getClass();
                                    icons = zzd.get(str2);
                                }
                                PaymentHistoryData.InlineButtonProminence inlineButtonProminence = retroActivityData.getPaymentData().inline_button_prominence;
                                if (inlineButtonProminence == null) {
                                    inlineButtonProminence = PaymentHistoryData.InlineButtonProminence.DEFAULT_STANDARD;
                                }
                                button = new RetroTransaction.Button(str10, icons, inlineButtonProminence, paymentHistoryButton.accessibility_text, str);
                            }
                            Long l = retroActivityData.getPaymentData().sort_priority;
                            String format2 = l != null ? ((DateTimeFormatter) this.formatter$delegate.getValue()).format(ZonedDateTime.ofInstant(Instant.ofEpochMilli(l.longValue()), (ZoneId) this.zoneId$delegate.getValue())) : null;
                            PaymentHistoryData paymentData = retroActivityData.getPaymentData();
                            String str11 = paymentData.avatar_overlay_icon_url;
                            Image image = str11 != null ? new Image(str11, paymentData.dark_theme_avatar_overlay_icon_url, 4) : null;
                            Avatar avatar2 = paymentData.avatar;
                            if (avatar2 != null) {
                                StackedAvatarViewModel.Avatar avatarModel = StackedAvatarViewModelKt.toAvatarModel(avatar2);
                                String str12 = paymentData.primary_label;
                                avatar = StackedAvatarViewModel.Avatar.copy$default(avatarModel, str12 != null ? GrpcStatus.Companion.monogram(str12) : null, null, 131069);
                            } else {
                                String str13 = paymentData.primary_label;
                                avatar = new StackedAvatarViewModel.Avatar(null, str13 != null ? GrpcStatus.Companion.monogram(str13) : null, null, null, null, null, null, null, false, false, null, false, null, null, 131069);
                            }
                            StackedAvatarViewModel single = (image == null || paymentData.icon_overlay_shape == PaymentHistoryData.IconOverlayShape.CIRCULAR_BADGE_SHAPE) ? new StackedAvatarViewModel.Single(avatar) : new StackedAvatarViewModel.Duo(new StackedAvatarViewModel.Avatar(null, null, null, image, null, null, null, null, false, false, null, false, null, null, 131063), avatar);
                            String str14 = retroActivityData.getPaymentData().amount_formatted_activity_list;
                            String str15 = str14 == null ? "" : str14;
                            String str16 = retroActivityData.getPaymentData().url_to_open;
                            AnalyticsEvent tapEvent = retroActivityData.getTapEvent();
                            if (tapEvent == null || (list2 = CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(tapEvent))) == null) {
                                list2 = EmptyList.INSTANCE;
                            }
                            List list4 = list2;
                            AnalyticsEvent viewEvent = retroActivityData.getViewEvent();
                            if (viewEvent == null || (list3 = CollectionsKt__CollectionsJVMKt.listOf(HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(viewEvent))) == null) {
                                list3 = EmptyList.INSTANCE;
                            }
                            arrayList4.add(new RetroTransaction(str4, str6, str8, button, format2, single, str15, list4, list3, str16));
                        }
                        this.transactionsCache.addAll(arrayList4);
                        return arrayList4;
                    }
                    arrayList = realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                zzmo zzmoVar = new zzmo(arrayList, this, (ZiplineHistoryDataJavaScripter) obj, continuation, 29);
                realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.L$1 = null;
                realAfterpayEligibleRetroTransactionsProvider$processTransactions$12.label = 2;
                obj = JobKt.supervisorScope(zzmoVar, realAfterpayEligibleRetroTransactionsProvider$processTransactions$12);
            }
        }
        realAfterpayEligibleRetroTransactionsProvider$processTransactions$1 = new RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1(this, continuationImpl);
        RealAfterpayEligibleRetroTransactionsProvider$processTransactions$1 realAfterpayEligibleRetroTransactionsProvider$processTransactions$122 = realAfterpayEligibleRetroTransactionsProvider$processTransactions$1;
        Object obj2 = realAfterpayEligibleRetroTransactionsProvider$processTransactions$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayEligibleRetroTransactionsProvider$processTransactions$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        zzmo zzmoVar2 = new zzmo(arrayList, this, (ZiplineHistoryDataJavaScripter) obj2, continuation2, 29);
        realAfterpayEligibleRetroTransactionsProvider$processTransactions$122.L$1 = null;
        realAfterpayEligibleRetroTransactionsProvider$processTransactions$122.label = 2;
        obj2 = JobKt.supervisorScope(zzmoVar2, realAfterpayEligibleRetroTransactionsProvider$processTransactions$122);
    }
}
