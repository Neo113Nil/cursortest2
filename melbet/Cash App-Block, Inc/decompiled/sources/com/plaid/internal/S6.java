package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class S6 {
    public static final LinkEvent a(Common$SDKEvent common$SDKEvent) {
        LinkEventMetadata a;
        common$SDKEvent.getClass();
        if (common$SDKEvent.hasMetadata()) {
            String brandName = common$SDKEvent.getMetadata().getBrandName();
            String errorCode = common$SDKEvent.getMetadata().getErrorCode();
            String errorMessage = common$SDKEvent.getMetadata().getErrorMessage();
            String errorType = common$SDKEvent.getMetadata().getErrorType();
            String exitStatus = common$SDKEvent.getMetadata().getExitStatus();
            String institutionId = common$SDKEvent.getMetadata().getInstitutionId();
            String institutionName = common$SDKEvent.getMetadata().getInstitutionName();
            String institutionSearchQuery = common$SDKEvent.getMetadata().getInstitutionSearchQuery();
            String linkSessionId = common$SDKEvent.getMetadata().getLinkSessionId();
            String mfaType = common$SDKEvent.getMetadata().getMfaType();
            String requestId = common$SDKEvent.getMetadata().getRequestId();
            String selection = common$SDKEvent.getMetadata().getSelection();
            String timestamp = common$SDKEvent.getMetadata().getTimestamp();
            String viewName = common$SDKEvent.getMetadata().getViewName();
            errorCode.getClass();
            errorMessage.getClass();
            errorType.getClass();
            exitStatus.getClass();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(institutionId, institutionName, institutionSearchQuery, linkSessionId, mfaType);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(requestId, timestamp, viewName, brandName, selection);
            a = C0343z2.a((r33 & 1) != 0 ? "" : errorCode, (r33 & 2) != 0 ? "" : errorMessage, (r33 & 4) != 0 ? "" : errorType, (r33 & 8) != 0 ? "" : exitStatus, (r33 & 16) != 0 ? "" : institutionId, (r33 & 32) != 0 ? "" : institutionName, (r33 & 64) != 0 ? "" : institutionSearchQuery, "", linkSessionId, (r33 & 512) != 0 ? "" : mfaType, (r33 & 1024) != 0 ? "" : requestId, timestamp, (r33 & 4096) != 0 ? "" : viewName, brandName, (r33 & 16384) != 0 ? "" : selection, "{}");
        } else {
            String brandName2 = common$SDKEvent.getMetadata().getBrandName();
            brandName2.getClass();
            a = C0343z2.a((r33 & 1) != 0 ? "" : null, (r33 & 2) != 0 ? "" : null, (r33 & 4) != 0 ? "" : null, (r33 & 8) != 0 ? "" : null, (r33 & 16) != 0 ? "" : null, (r33 & 32) != 0 ? "" : null, (r33 & 64) != 0 ? "" : null, "", "", (r33 & 512) != 0 ? "" : null, (r33 & 1024) != 0 ? "" : null, "", (r33 & 4096) != 0 ? "" : null, brandName2, (r33 & 16384) != 0 ? "" : null, "{}");
        }
        String eventName = common$SDKEvent.getEventName();
        eventName.getClass();
        eventName.getClass();
        a.getClass();
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), a);
    }

    public static final LinkEvent a(Channel$Message.SDKEvent sDKEvent) {
        sDKEvent.getClass();
        String brandName = sDKEvent.getMetadata().getBrandName();
        String errorCode = sDKEvent.getMetadata().getErrorCode();
        String errorMessage = sDKEvent.getMetadata().getErrorMessage();
        String errorType = sDKEvent.getMetadata().getErrorType();
        String exitStatus = sDKEvent.getMetadata().getExitStatus();
        String institutionId = sDKEvent.getMetadata().getInstitutionId();
        String institutionName = sDKEvent.getMetadata().getInstitutionName();
        String institutionSearchQuery = sDKEvent.getMetadata().getInstitutionSearchQuery();
        String issueId = sDKEvent.getMetadata().getIssueId();
        String linkSessionId = sDKEvent.getMetadata().getLinkSessionId();
        String mfaType = sDKEvent.getMetadata().getMfaType();
        String requestId = sDKEvent.getMetadata().getRequestId();
        String selection = sDKEvent.getMetadata().getSelection();
        String timestamp = sDKEvent.getMetadata().getTimestamp();
        String viewName = sDKEvent.getMetadata().getViewName();
        String metadataJson = sDKEvent.getMetadataJson();
        if (StringsKt.isBlank(metadataJson)) {
            metadataJson = "{}";
        }
        BalanceFeedKt$$ExternalSyntheticOutline0.m(errorCode, errorMessage, errorType, exitStatus, institutionId);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(institutionName, institutionSearchQuery, issueId, linkSessionId, mfaType);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(requestId, timestamp, viewName, brandName, selection);
        LinkEventMetadata a = C0343z2.a(errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueId, linkSessionId, mfaType, requestId, timestamp, viewName, brandName, selection, metadataJson);
        String eventName = sDKEvent.getEventName();
        eventName.getClass();
        eventName.getClass();
        a.getClass();
        return new LinkEvent(LinkEventName.INSTANCE.fromString$link_sdk_release(eventName), a);
    }
}
