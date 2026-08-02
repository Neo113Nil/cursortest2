package com.datadog.trace.core.util;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.ContactClearDataReason;
import com.squareup.cash.cdf.ContactSkipReason;
import com.squareup.cash.cdf.ContactSyncResult;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.ContactSyncType;
import com.squareup.cash.cdf.contact.ContactEncryptedSyncClearData;
import com.squareup.cash.cdf.contact.ContactEncryptedSyncComplete;
import com.squareup.cash.cdf.contact.ContactEncryptedSyncSkip;
import com.squareup.cash.cdf.contact.ContactEncryptedSyncStart;
import com.squareup.cash.cdf.contact.ContactSyncClearData;
import com.squareup.cash.cdf.contact.ContactSyncComplete;
import com.squareup.cash.cdf.contact.ContactSyncCompleteFreshSync;
import com.squareup.cash.cdf.contact.ContactSyncNetworkError;
import com.squareup.cash.cdf.contact.ContactSyncPersistNonCustomers;
import com.squareup.cash.cdf.contact.ContactSyncReset;
import com.squareup.cash.cdf.contact.ContactSyncSendToServer;
import com.squareup.cash.cdf.contact.ContactSyncSkip;
import com.squareup.cash.cdf.contact.ContactSyncStart;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.integration.analytics.Analytics;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.exception.AppInitializationError;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.io.Serializable;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.collections.MapsKt__MapsKt;
import org.slf4j.Marker;

/* loaded from: classes6.dex */
public abstract class Matchers {
    public static ExactMatcher compileGlob(String str) {
        if (str.equals(Marker.ANY_MARKER)) {
            return null;
        }
        if (str.indexOf(42) == -1 && str.indexOf(63) == -1) {
            return new ExactMatcher(0, str);
        }
        return new ExactMatcher(1, GlobPattern.globToRegexPattern(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void logError(FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, String str, Throwable th, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, FinancialConnectionsSessionManifest.Pane pane) {
        StripeError stripeError;
        Map map;
        String str2;
        financialConnectionsAnalyticsTrackerImpl.getClass();
        th.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        pane.getClass();
        String str3 = ((th instanceof FinancialConnectionsError) || (th instanceof WebAuthFlowFailedException) || (th instanceof ConfirmVerification.OTPError)) ? "error.expected" : "error.unexpected";
        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.plus(Thread$State$EnumUnboxingLocalUtility.m("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), JsonObjectUtils.toEventParams(str, th))), str3, true));
        logger$Companion$NOOP_LOGGER$1.error(str, th);
        String str4 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
        if (stripeException == null || (stripeError = stripeException.stripeError) == null || (map = stripeError.extraFields) == null || (str2 = (String) map.get("events_to_emit")) == null || str2.length() <= 0) {
            boolean z = th instanceof AppInitializationError;
            int i = 3;
            if (z) {
                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ERROR, new FinancialConnectionsEvent.Metadata(str4, objArr3 == true ? 1 : 0, FinancialConnectionsEvent.ErrorCode.WEB_BROWSER_UNAVAILABLE, i));
            } else {
                FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.ERROR, new FinancialConnectionsEvent.Metadata(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, FinancialConnectionsEvent.ErrorCode.UNEXPECTED_ERROR, i));
            }
        }
    }

    public static final void trackContactEncryptedSyncClearData(Analytics analytics, ContactClearDataReason contactClearDataReason) {
        analytics.track(new ContactEncryptedSyncClearData(contactClearDataReason), null);
    }

    public static final void trackContactEncryptedSyncComplete(Analytics analytics, ContactSyncTriggerReason contactSyncTriggerReason, ContactSyncType contactSyncType, ContactSyncResult contactSyncResult, String str, Double d) {
        analytics.track(new ContactEncryptedSyncComplete(contactSyncTriggerReason, contactSyncType, contactSyncResult, str, d), null);
    }

    public static final void trackContactEncryptedSyncSkip(Analytics analytics, ContactSyncType contactSyncType) {
        ContactSkipReason contactSkipReason = ContactSkipReason.EMPTY_CONTACTS;
        analytics.track(new ContactEncryptedSyncSkip(contactSyncType), null);
    }

    public static final void trackContactEncryptedSyncStart(Analytics analytics, ContactSyncTriggerReason contactSyncTriggerReason, Integer num, Integer num2, ContactSyncType contactSyncType) {
        analytics.track(new ContactEncryptedSyncStart(contactSyncTriggerReason, num, num2, contactSyncType), null);
    }

    public static final void trackContactSyncClearData(Analytics analytics, ContactClearDataReason contactClearDataReason) {
        analytics.track(new ContactSyncClearData(contactClearDataReason), null);
    }

    public static final void trackContactSyncComplete(Analytics analytics, ContactSyncTriggerReason contactSyncTriggerReason, ContactSyncType contactSyncType, ContactSyncResult contactSyncResult, String str, Double d) {
        analytics.track(new ContactSyncComplete(contactSyncTriggerReason, contactSyncType, contactSyncResult, str, d), null);
    }

    public static final void trackContactSyncCompleteFreshSync(Analytics analytics, Boolean bool) {
        analytics.track(new ContactSyncCompleteFreshSync(bool), null);
    }

    public static final void trackContactSyncNetworkError(Analytics analytics, ContactSyncTriggerReason contactSyncTriggerReason, String str, ContactSyncType contactSyncType) {
        analytics.track(new ContactSyncNetworkError(contactSyncTriggerReason, str, contactSyncType), null);
    }

    public static final void trackContactSyncPersistNonCustomers(Analytics analytics, Boolean bool) {
        analytics.track(new ContactSyncPersistNonCustomers(bool), null);
    }

    public static final void trackContactSyncReset(Analytics analytics, ContactSyncReset.ResetReason resetReason, Boolean bool, Boolean bool2) {
        analytics.getClass();
        analytics.track(new ContactSyncReset(resetReason, bool, bool2), null);
    }

    public static final void trackContactSyncSendToServer(Analytics analytics, Boolean bool, Integer num, Integer num2, Double d, ContactSyncSendToServer.ServerResponse serverResponse, ContactSyncSendToServer.SyncLogicType syncLogicType, String str) {
        ContactSyncSendToServer.SyncLogicType syncLogicType2 = ContactSyncSendToServer.SyncLogicType.LEGACY;
        analytics.track(new ContactSyncSendToServer(bool, num, num2, d, serverResponse, syncLogicType, str), null);
    }

    public static final void trackContactSyncSkip(Analytics analytics, ContactSyncType contactSyncType) {
        ContactSkipReason contactSkipReason = ContactSkipReason.EMPTY_CONTACTS;
        analytics.track(new ContactSyncSkip(contactSyncType), null);
    }

    public static final void trackContactSyncStart(Analytics analytics, ContactSyncTriggerReason contactSyncTriggerReason, Integer num, Integer num2, ContactSyncType contactSyncType) {
        analytics.track(new ContactSyncStart(contactSyncTriggerReason, num, num2, contactSyncType), null);
    }

    /* loaded from: classes4.dex */
    public final class ExactMatcher {
        public final /* synthetic */ int $r8$classId;
        public final Serializable exact;

        public /* synthetic */ ExactMatcher(int i, Serializable serializable) {
            this.$r8$classId = i;
            this.exact = serializable;
        }

        public final boolean matches(CharSequence charSequence) {
            int i = this.$r8$classId;
            Serializable serializable = this.exact;
            switch (i) {
                case 0:
                    return ((String) serializable).contentEquals(charSequence);
                default:
                    return ((Pattern) serializable).matcher(charSequence).matches();
            }
        }

        public final boolean matches(String str) {
            int i = this.$r8$classId;
            Serializable serializable = this.exact;
            switch (i) {
                case 0:
                    return ((String) serializable).equals(str);
                default:
                    return ((Pattern) serializable).matcher(str).matches();
            }
        }
    }
}
