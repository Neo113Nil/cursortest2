package com.squareup.cash.activity.backend.loader;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityOffset;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityPageThreadedFeedResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import com.squareup.protos.cash.activity.api.v1.PaymentHistoryInputsRow;
import com.squareup.protos.cash.activity.api.v1.SearchOffset;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.paychecks.Paycheck;

/* loaded from: classes.dex */
public interface ActivitiesManager {

    public interface ActivityPageHandler {
        Object requestPage(ActivityContext activityContext, ActivityPage.PageOffset pageOffset, Continuation continuation);
    }

    public interface Factory {
        ActivitiesManager create(ActivityContext activityContext, ActivitiesCache activitiesCache);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class LoadMode {
        public static final /* synthetic */ LoadMode[] $VALUES;
        public static final LoadMode LOAD_NEXT_PAGE;
        public static final LoadMode RELOAD_FIRST_PAGE;

        static {
            LoadMode loadMode = new LoadMode("RELOAD_FIRST_PAGE", 0);
            RELOAD_FIRST_PAGE = loadMode;
            LoadMode loadMode2 = new LoadMode("LOAD_NEXT_PAGE", 1);
            LOAD_NEXT_PAGE = loadMode2;
            $VALUES = new LoadMode[]{loadMode, loadMode2};
        }

        public static LoadMode valueOf(String str) {
            return (LoadMode) Enum.valueOf(LoadMode.class, str);
        }

        public static LoadMode[] values() {
            return (LoadMode[]) $VALUES.clone();
        }
    }

    Flow activities();

    void clear();

    default Flow firstServerPages() {
        return EmptyFlow.INSTANCE;
    }

    Object load(LoadMode loadMode, Continuation continuation);

    public final class ActivityContext {
        public final ActivityScope activityScope;
        public final ActivityToken activityToken;
        public final KeysetHandle getRequestHandler;
        public final ActivityPageHandler requestHandler;

        public ActivityContext(ActivityToken activityToken, ActivityScope activityScope, ActivityPageHandler activityPageHandler, ReceiptGetRequestHandler receiptGetRequestHandler) {
            activityToken.getClass();
            activityScope.getClass();
            this.activityToken = activityToken;
            this.activityScope = activityScope;
            this.requestHandler = activityPageHandler;
            this.getRequestHandler = receiptGetRequestHandler;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityContext)) {
                return false;
            }
            ActivityContext activityContext = (ActivityContext) obj;
            return Intrinsics.areEqual(this.activityToken, activityContext.activityToken) && this.activityScope == activityContext.activityScope && Intrinsics.areEqual(this.requestHandler, activityContext.requestHandler) && Intrinsics.areEqual(this.getRequestHandler, activityContext.getRequestHandler);
        }

        public final int hashCode() {
            int hashCode = (this.activityScope.hashCode() + (this.activityToken.hashCode() * 31)) * 31;
            ActivityPageHandler activityPageHandler = this.requestHandler;
            int hashCode2 = (hashCode + (activityPageHandler == null ? 0 : activityPageHandler.hashCode())) * 31;
            KeysetHandle keysetHandle = this.getRequestHandler;
            return hashCode2 + (keysetHandle != null ? keysetHandle.hashCode() : 0);
        }

        public final String toString() {
            return "ActivityContext(activityToken=" + this.activityToken + ", activityScope=" + this.activityScope + ", requestHandler=" + this.requestHandler + ", getRequestHandler=" + this.getRequestHandler + ")";
        }

        public /* synthetic */ ActivityContext(ActivityToken activityToken, ActivityScope activityScope, ActivityPageHandler activityPageHandler, int i) {
            this(activityToken, activityScope, (i & 4) != 0 ? null : activityPageHandler, (ReceiptGetRequestHandler) null);
        }
    }

    /* loaded from: classes5.dex */
    public final class ActivityPage {
        public final List activities;
        public final boolean hasNextPage;
        public final PageOffset nextPageCursor;

        /* loaded from: classes7.dex */
        public final class PageOffset {
            public final List offset;

            public PageOffset(List list) {
                list.getClass();
                this.offset = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PageOffset) && Intrinsics.areEqual(this.offset, ((PageOffset) obj).offset);
            }

            public final List getOffset() {
                return this.offset;
            }

            public final int hashCode() {
                return this.offset.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("PageOffset(offset=", ")", this.offset);
            }
        }

        public ActivityPage(List list, boolean z, PageOffset pageOffset) {
            list.getClass();
            this.activities = list;
            this.hasNextPage = z;
            this.nextPageCursor = pageOffset;
        }

        public static ActivityPage copy$default(ActivityPage activityPage, List list) {
            boolean z = activityPage.hasNextPage;
            PageOffset pageOffset = activityPage.nextPageCursor;
            activityPage.getClass();
            activityPage.getClass();
            list.getClass();
            return new ActivityPage(list, z, pageOffset);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityPage)) {
                return false;
            }
            ActivityPage activityPage = (ActivityPage) obj;
            return Intrinsics.areEqual(this.activities, activityPage.activities) && this.hasNextPage == activityPage.hasNextPage && Intrinsics.areEqual(this.nextPageCursor, activityPage.nextPageCursor);
        }

        public final List getActivities() {
            return this.activities;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final PageOffset getNextPageCursor() {
            return this.nextPageCursor;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.activities.hashCode() * 31, 31, this.hasNextPage);
            PageOffset pageOffset = this.nextPageCursor;
            return (m + (pageOffset == null ? 0 : pageOffset.offset.hashCode())) * 31;
        }

        public final String toString() {
            return "ActivityPage(activities=" + this.activities + ", hasNextPage=" + this.hasNextPage + ", nextPageCursor=" + this.nextPageCursor + ", aggregations=null)";
        }

        /* loaded from: classes7.dex */
        public abstract class Companion {
            public static ActivityData toActivityData(ActivityRow activityRow) {
                long longValue;
                activityRow.getClass();
                ActivityRow.Body body = activityRow.body;
                if (body instanceof ActivityRow.Body.PaymentHistoryInputsRow) {
                    PaymentHistoryInputsRow value = ((ActivityRow.Body.PaymentHistoryInputsRow) body).getValue();
                    UiPayment uiPayment = value.payment;
                    uiPayment.getClass();
                    UiCustomer uiCustomer = value.sender;
                    uiCustomer.getClass();
                    UiCustomer uiCustomer2 = value.recipient;
                    uiCustomer2.getClass();
                    ActivityItemGlobalId activityItemGlobalId = activityRow.activity_item_global_id;
                    activityItemGlobalId.getClass();
                    Boolean bool = activityRow.is_badged;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    Long l = activityRow.version;
                    longValue = l != null ? l.longValue() : 0L;
                    ActivityRowSection activityRowSection = activityRow.activity_row_section;
                    String str = activityRow.row_id;
                    str.getClass();
                    return new PaymentHistoryActivityData(longValue, activityItemGlobalId, activityRow.reference_activity_item_global_id, activityRowSection, uiCustomer, uiCustomer2, uiPayment, str, CollectionsKt.toSet(activityRow.product_classifiers), booleanValue);
                }
                if (body instanceof ActivityRow.Body.PaycheckRow) {
                    Paycheck paycheck = ((ActivityRow.Body.PaycheckRow) body).getValue().paycheck;
                    paycheck.getClass();
                    ActivityItemGlobalId activityItemGlobalId2 = activityRow.activity_item_global_id;
                    activityItemGlobalId2.getClass();
                    Long l2 = activityRow.version;
                    longValue = l2 != null ? l2.longValue() : 0L;
                    ActivityRowSection activityRowSection2 = activityRow.activity_row_section;
                    String str2 = activityRow.row_id;
                    str2.getClass();
                    return new PaycheckActivityData(paycheck, activityItemGlobalId2, longValue, null, str2, activityRowSection2, CollectionsKt.toSet(activityRow.product_classifiers), activityRow.reference_activity_item_global_id);
                }
                if (!(body instanceof ActivityRow.Body.OrderRow)) {
                    if (body == null) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ActivityRow.Body.OrderRow orderRow = (ActivityRow.Body.OrderRow) body;
                CashAppPayOrderRenderData cashAppPayOrderRenderData = orderRow.getValue().order;
                cashAppPayOrderRenderData.getClass();
                OrderRow.OrderRowLoanUiState orderRowLoanUiState = orderRow.getValue().loan_ui_state;
                orderRowLoanUiState.getClass();
                Long l3 = activityRow.display_date_epoch_ms;
                l3.getClass();
                long longValue2 = l3.longValue();
                ActivityItemGlobalId activityItemGlobalId3 = activityRow.activity_item_global_id;
                activityItemGlobalId3.getClass();
                Long l4 = activityRow.version;
                long longValue3 = l4 != null ? l4.longValue() : 0L;
                ActivityRowSection activityRowSection3 = activityRow.activity_row_section;
                String str3 = activityRow.row_id;
                str3.getClass();
                return new OrderActivityData(cashAppPayOrderRenderData, orderRowLoanUiState, longValue2, activityItemGlobalId3, longValue3, str3, activityRowSection3, CollectionsKt.toSet(activityRow.product_classifiers), orderRow.getValue().recipient, orderRow.getValue().sender_id, orderRow.getValue().recipient_id, orderRow.getValue().recipient, orderRow.getValue().sender, activityRow.reference_activity_item_global_id);
            }

            public static ActivityPage toActivityPage(ActivityPageResponse activityPageResponse) {
                activityPageResponse.getClass();
                ArrayList activityData = toActivityData(activityPageResponse.activity_rows);
                ActivityOffset activityOffset = activityPageResponse.activity_offset;
                PageOffset pageOffset = activityOffset != null ? new PageOffset(activityOffset.known_cursors) : null;
                Boolean bool = activityPageResponse.has_more;
                return new ActivityPage(activityData, bool != null ? bool.booleanValue() : false, pageOffset);
            }

            public static ActivityPage toActivityPage(ActivitySearchResponse activitySearchResponse) {
                ArrayList activityData = toActivityData(activitySearchResponse.activity_rows);
                SearchOffset searchOffset = activitySearchResponse.search_offset;
                PageOffset pageOffset = searchOffset != null ? new PageOffset(searchOffset.offsets) : null;
                Boolean bool = activitySearchResponse.has_more;
                return new ActivityPage(activityData, bool != null ? bool.booleanValue() : false, pageOffset);
            }

            public static ActivityPage toActivityPage(ActivityPageThreadedFeedResponse activityPageThreadedFeedResponse) {
                ArrayList activityData = toActivityData(activityPageThreadedFeedResponse.activity_rows);
                ActivityOffset activityOffset = activityPageThreadedFeedResponse.activity_offset;
                PageOffset pageOffset = activityOffset != null ? new PageOffset(activityOffset.known_cursors) : null;
                Boolean bool = activityPageThreadedFeedResponse.has_more;
                return new ActivityPage(activityData, bool != null ? bool.booleanValue() : false, pageOffset);
            }

            public static ArrayList toActivityData(List list) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ActivityData activityData = toActivityData((ActivityRow) it.next());
                    if (activityData != null) {
                        arrayList.add(activityData);
                    }
                }
                return arrayList;
            }
        }
    }
}
