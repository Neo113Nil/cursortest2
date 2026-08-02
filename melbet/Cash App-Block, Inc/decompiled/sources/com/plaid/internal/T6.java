package com.plaid.internal;

import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import com.plaid.link.result.LinkAccount;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountVerificationStatus;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkExitMetadata;
import com.plaid.link.result.LinkExitMetadataStatus;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.plaid.link.result.LinkSuccessMetadata;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class T6 {
    public static final LinkResult a(Channel$Message.SDKResult sDKResult) {
        sDKResult.getClass();
        LinkInstitution linkInstitution = null;
        if (sDKResult.getCallback() != SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_SUCCESS) {
            if (sDKResult.getCallback() != SdkResult$SDKResult.b.SDK_RESULT_CALLBACK_ERROR) {
                return null;
            }
            String linkSessionId = sDKResult.getMetadata().getLinkSessionId();
            String institutionId = sDKResult.getMetadata().getInstitution().getInstitutionId();
            String name = sDKResult.getMetadata().getInstitution().getName();
            String requestId = sDKResult.getMetadata().getRequestId();
            LinkExitMetadataStatus fromString = LinkExitMetadataStatus.INSTANCE.fromString(sDKResult.getMetadata().getStatus());
            String metadataJson = sDKResult.getMetadataJson();
            if (name != null && name.length() != 0 && institutionId != null && institutionId.length() != 0) {
                linkInstitution = new LinkInstitution(name, institutionId);
            }
            LinkExitMetadata linkExitMetadata = new LinkExitMetadata(fromString, linkInstitution, linkSessionId, requestId, metadataJson);
            String errorCode = sDKResult.getError().getErrorCode();
            errorCode.getClass();
            String errorMessage = sDKResult.getError().getErrorMessage();
            errorMessage.getClass();
            String displayMessage = sDKResult.getError().getDisplayMessage();
            displayMessage.getClass();
            String errorJson = sDKResult.getErrorJson();
            errorJson.getClass();
            errorCode.getClass();
            errorMessage.getClass();
            displayMessage.getClass();
            errorJson.getClass();
            return new LinkExit(new LinkError(LinkErrorCode.INSTANCE.convert(errorCode), errorMessage, displayMessage, errorJson), linkExitMetadata);
        }
        ArrayList arrayList = new ArrayList();
        List<SdkResult$SDKResult.Metadata.Account> accountsList = sDKResult.getMetadata().getAccountsList();
        accountsList.getClass();
        for (SdkResult$SDKResult.Metadata.Account account : accountsList) {
            account.getClass();
            String id = account.getId();
            id.getClass();
            arrayList.add(new LinkAccount(id, account.getName(), account.getMask(), LinkAccountSubtype.INSTANCE.convert(account.getSubtype(), account.getType()), LinkAccountVerificationStatus.INSTANCE.convert(account.getVerificationStatus()), null, 32, null));
        }
        String institutionId2 = sDKResult.getMetadata().getInstitution().getInstitutionId();
        String name2 = sDKResult.getMetadata().getInstitution().getName();
        String linkSessionId2 = sDKResult.getMetadata().getLinkSessionId();
        linkSessionId2.getClass();
        String metadataJson2 = sDKResult.getMetadataJson();
        metadataJson2.getClass();
        linkSessionId2.getClass();
        metadataJson2.getClass();
        if (institutionId2 != null && institutionId2.length() != 0 && name2 != null && name2.length() != 0) {
            linkInstitution = new LinkInstitution(institutionId2, name2);
        }
        LinkSuccessMetadata linkSuccessMetadata = new LinkSuccessMetadata(linkInstitution, arrayList, linkSessionId2, metadataJson2);
        String publicToken = sDKResult.getPublicToken();
        publicToken.getClass();
        publicToken.getClass();
        return new LinkSuccess(publicToken, linkSuccessMetadata);
    }
}
