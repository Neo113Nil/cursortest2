package com.squareup.cash.activity.backend;

import androidx.biometric.DeviceUtils;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.treehouse.ActivityTreehouseCompatibility$Method;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.treehouse.activity.FormattingResult;
import com.squareup.cash.treehouse.activity.HostActivityDataBridge;
import com.squareup.cash.treehouse.activity.SerializableActivityItem;
import com.squareup.cash.treehouse.activity.SerializableRenderedActivityItem;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.TransactionType;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.wire.ProtoAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ZiplineActivityItemFormatter {
    public final ActivityDataBridge activityDataBridge;
    public final HostActivityDataBridge activityTreehouseCompatibility;
    public final CoroutineContext computationDispatcher;
    public final ErrorReporter errorReporter;
    public final Lazy paymentHistoryDataAdapter$delegate;

    /* loaded from: classes5.dex */
    public final class DeserializedFormattedActivityItem implements FormattedPaymentHistoryActivityItem, PaymentHistoryActivityItem {
        public final /* synthetic */ PaymentHistoryActivityItem $$delegate_0;
        public final PaymentHistoryData paymentHistoryData;

        public DeserializedFormattedActivityItem(ZiplineActivityItemFormatter ziplineActivityItemFormatter, PaymentHistoryActivityItem paymentHistoryActivityItem, SerializableRenderedActivityItem serializableRenderedActivityItem) {
            paymentHistoryActivityItem.getClass();
            serializableRenderedActivityItem.getClass();
            this.$$delegate_0 = paymentHistoryActivityItem;
            Object fromJson = ((JsonAdapter) ziplineActivityItemFormatter.paymentHistoryDataAdapter$delegate.getValue()).fromJson(serializableRenderedActivityItem.paymentHistoryDataJson);
            fromJson.getClass();
            this.paymentHistoryData = (PaymentHistoryData) fromJson;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final ActivityItemGlobalId getActivityItemGlobalId() {
            return this.$$delegate_0.getActivityItemGlobalId();
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final Instant getDisplayInstant() {
            return this.$$delegate_0.getDisplayInstant();
        }

        @Override // com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem
        public final PaymentHistoryData getPaymentHistoryData() {
            return this.paymentHistoryData;
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final Set getProductClassifiers() {
            return this.$$delegate_0.getProductClassifiers();
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final ActivityItemGlobalId getReferenceItemId() {
            return this.$$delegate_0.getReferenceItemId();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final Role getRole() {
            return this.$$delegate_0.getRole();
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final String getRowId() {
            return this.$$delegate_0.getRowId();
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final ActivityRowSection getSection() {
            return this.$$delegate_0.getSection();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final PaymentState getState() {
            return this.$$delegate_0.getState();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final TransactionType getTransactionType() {
            return this.$$delegate_0.getTransactionType();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final UiPayment getUiPayment() {
            return this.$$delegate_0.getUiPayment();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final UiCustomer getUiRecipient() {
            return this.$$delegate_0.getUiRecipient();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final UiCustomer getUiSender() {
            return this.$$delegate_0.getUiSender();
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final long getVersion() {
            return this.$$delegate_0.getVersion();
        }

        @Override // com.squareup.cash.activity.backend.ActivityItem
        public final boolean isBadged() {
            return this.$$delegate_0.isBadged();
        }

        @Override // com.squareup.cash.activity.backend.PaymentHistoryActivityItem
        public final boolean isOffline() {
            return this.$$delegate_0.isOffline();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/cash/activity/backend/ZiplineActivityItemFormatter$ZiplineActivityFormattingException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    final class ZiplineActivityFormattingException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ZiplineActivityFormattingException(String str, String str2, String str3) {
            super(str2 + ": " + str + "\n" + str3);
            str.getClass();
        }
    }

    public ZiplineActivityItemFormatter(ActivityDataBridge activityDataBridge, HostActivityDataBridge hostActivityDataBridge, Moshi moshi, CoroutineContext coroutineContext, ErrorReporter errorReporter) {
        this.activityDataBridge = activityDataBridge;
        this.activityTreehouseCompatibility = hostActivityDataBridge;
        this.computationDispatcher = coroutineContext;
        this.errorReporter = errorReporter;
        this.paymentHistoryDataAdapter$delegate = LazyKt.lazy(new ZiplineActivityItemFormatter$$ExternalSyntheticLambda0(moshi, 0));
    }

    public static Object format$default(ZiplineActivityItemFormatter ziplineActivityItemFormatter, PaymentHistoryActivityItem paymentHistoryActivityItem, ContinuationImpl continuationImpl) {
        Continuation continuation = null;
        return JobKt.withContext(ziplineActivityItemFormatter.computationDispatcher, new EditProfilePresenter$models$2$1(ziplineActivityItemFormatter, paymentHistoryActivityItem, continuation, continuation, 9), continuationImpl);
    }

    public static SerializableActivityItem serializable(PaymentHistoryActivityItem paymentHistoryActivityItem) {
        String itemId = ActivityItemKt.getItemId(paymentHistoryActivityItem);
        String itemId2 = ActivityItemKt.getItemId(paymentHistoryActivityItem);
        ByteString encodeByteString = UiPayment.ADAPTER.encodeByteString(paymentHistoryActivityItem.getUiPayment());
        ProtoAdapter protoAdapter = UiCustomer.ADAPTER;
        ByteString encodeByteString2 = protoAdapter.encodeByteString(paymentHistoryActivityItem.getUiSender());
        ByteString encodeByteString3 = protoAdapter.encodeByteString(paymentHistoryActivityItem.getUiRecipient());
        ActivityItemType itemType = ActivityItemKt.getItemType(paymentHistoryActivityItem);
        ByteString encodeByteString4 = itemType != null ? ActivityItemType.ADAPTER.encodeByteString(itemType) : null;
        ActivityRowSection section = paymentHistoryActivityItem.getSection();
        ByteString encodeByteString5 = section != null ? ActivityRowSection.ADAPTER.encodeByteString(section) : null;
        boolean isBadged = paymentHistoryActivityItem.isBadged();
        boolean isOffline = paymentHistoryActivityItem.isOffline();
        long version = paymentHistoryActivityItem.getVersion();
        ActivityItemGlobalId referenceItemId = paymentHistoryActivityItem.getReferenceItemId();
        return new SerializableActivityItem(itemId, itemId2, encodeByteString, encodeByteString2, encodeByteString3, encodeByteString4, encodeByteString5, isBadged, isOffline, version, referenceItemId != null ? ActivityItemGlobalId.ADAPTER.encodeByteString(referenceItemId) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1 A[Catch: Exception -> 0x002e, CancellationException -> 0x00dd, TryCatch #2 {CancellationException -> 0x00dd, Exception -> 0x002e, blocks: (B:12:0x0029, B:13:0x00bb, B:14:0x00bd, B:16:0x00c1, B:17:0x00c7, B:24:0x0039, B:25:0x008b, B:30:0x0052, B:33:0x005e, B:37:0x008e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object dynamicFormat(FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem, ContinuationImpl continuationImpl) {
        ZiplineActivityItemFormatter$dynamicFormat$1 ziplineActivityItemFormatter$dynamicFormat$1;
        int i;
        FormattingResult formattingResult;
        try {
            if (continuationImpl instanceof ZiplineActivityItemFormatter$dynamicFormat$1) {
                ziplineActivityItemFormatter$dynamicFormat$1 = (ZiplineActivityItemFormatter$dynamicFormat$1) continuationImpl;
                int i2 = ziplineActivityItemFormatter$dynamicFormat$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    ziplineActivityItemFormatter$dynamicFormat$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = ziplineActivityItemFormatter$dynamicFormat$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = ziplineActivityItemFormatter$dynamicFormat$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        ActivityTreehouseCompatibility$Method activityTreehouseCompatibility$Method = ActivityTreehouseCompatibility$Method.ApplyDynamicFormatting;
                        HostActivityDataBridge hostActivityDataBridge = this.activityTreehouseCompatibility;
                        if (!hostActivityDataBridge.canUse(activityTreehouseCompatibility$Method) || formattedPaymentHistoryActivityItem.isOffline()) {
                            return formattedPaymentHistoryActivityItem;
                        }
                        boolean canUse = hostActivityDataBridge.canUse(ActivityTreehouseCompatibility$Method.LocaleAwareFormatting);
                        Lazy lazy = this.paymentHistoryDataAdapter$delegate;
                        ActivityDataBridge activityDataBridge = this.activityDataBridge;
                        if (canUse) {
                            SerializableActivityItem serializable = serializable(formattedPaymentHistoryActivityItem);
                            String rowId = formattedPaymentHistoryActivityItem.getRowId();
                            String itemId = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
                            String json = ((JsonAdapter) lazy.getValue()).toJson(formattedPaymentHistoryActivityItem.getPaymentHistoryData());
                            json.getClass();
                            SerializableRenderedActivityItem serializableRenderedActivityItem = new SerializableRenderedActivityItem(rowId, itemId, json);
                            ziplineActivityItemFormatter$dynamicFormat$1.L$0 = formattedPaymentHistoryActivityItem;
                            ziplineActivityItemFormatter$dynamicFormat$1.label = 1;
                            obj = activityDataBridge.applyDynamicFormatting(serializable, serializableRenderedActivityItem, null, ziplineActivityItemFormatter$dynamicFormat$1);
                            if (obj == coroutineSingletons) {
                            }
                            formattingResult = (FormattingResult) obj;
                        } else {
                            SerializableActivityItem serializable2 = serializable(formattedPaymentHistoryActivityItem);
                            String rowId2 = formattedPaymentHistoryActivityItem.getRowId();
                            String itemId2 = ActivityItemKt.getItemId(formattedPaymentHistoryActivityItem);
                            String json2 = ((JsonAdapter) lazy.getValue()).toJson(formattedPaymentHistoryActivityItem.getPaymentHistoryData());
                            json2.getClass();
                            SerializableRenderedActivityItem serializableRenderedActivityItem2 = new SerializableRenderedActivityItem(rowId2, itemId2, json2);
                            ziplineActivityItemFormatter$dynamicFormat$1.L$0 = formattedPaymentHistoryActivityItem;
                            ziplineActivityItemFormatter$dynamicFormat$1.label = 2;
                            obj = activityDataBridge.applyDynamicFormatting(serializable2, serializableRenderedActivityItem2, ziplineActivityItemFormatter$dynamicFormat$1);
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        formattedPaymentHistoryActivityItem = ziplineActivityItemFormatter$dynamicFormat$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        formattingResult = (FormattingResult) obj;
                    } else {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        formattedPaymentHistoryActivityItem = ziplineActivityItemFormatter$dynamicFormat$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        formattingResult = (FormattingResult) obj;
                    }
                    if (formattingResult instanceof FormattingResult.Failure) {
                        reportAsError((FormattingResult.Failure) formattingResult, formattedPaymentHistoryActivityItem);
                    }
                    return mapResult(formattedPaymentHistoryActivityItem, formattingResult);
                }
            }
            if (i != 0) {
            }
            if (formattingResult instanceof FormattingResult.Failure) {
            }
            return mapResult(formattedPaymentHistoryActivityItem, formattingResult);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.errorReporter.report(new ActivityFormattingError(e2, formattedPaymentHistoryActivityItem), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return DeviceUtils.FormattingFailedActivityItem(formattedPaymentHistoryActivityItem);
        }
        ziplineActivityItemFormatter$dynamicFormat$1 = new ZiplineActivityItemFormatter$dynamicFormat$1(this, continuationImpl);
        Object obj2 = ziplineActivityItemFormatter$dynamicFormat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ziplineActivityItemFormatter$dynamicFormat$1.label;
    }

    public final ActivityFormattingResult mapResult(PaymentHistoryActivityItem paymentHistoryActivityItem, FormattingResult formattingResult) {
        if (formattingResult instanceof FormattingResult.Failure) {
            return DeviceUtils.FormattingFailedActivityItem(paymentHistoryActivityItem);
        }
        if (formattingResult instanceof FormattingResult.Success) {
            return new DeserializedFormattedActivityItem(this, paymentHistoryActivityItem, ((FormattingResult.Success) formattingResult).getRenderedActivityItem());
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void reportAsError(FormattingResult.Failure failure, PaymentHistoryActivityItem paymentHistoryActivityItem) {
        this.errorReporter.report(new ActivityFormattingError(new ZiplineActivityFormattingException(failure.getReason(), failure.getExceptionName(), failure.getStacktrace()), paymentHistoryActivityItem), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }
}
