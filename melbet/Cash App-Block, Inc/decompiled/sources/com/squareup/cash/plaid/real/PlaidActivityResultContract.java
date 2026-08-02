package com.squareup.cash.plaid.real;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.plaid.link.OpenPlaidLink;
import com.plaid.link.PlaidKotlinFunctionsKt;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkInstitution;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.plaid.api.Institution;
import com.squareup.cash.plaid.api.PlaidLinkParams;
import com.squareup.cash.plaid.api.PlaidLinkResult;
import kotlin.Metadata;
import okio.Path$$ExternalSyntheticBUOutline0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/plaid/real/PlaidActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/squareup/cash/plaid/api/PlaidLinkParams;", "Lcom/squareup/cash/plaid/api/PlaidLinkResult;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
final class PlaidActivityResultContract extends ActivityResultContract<PlaidLinkParams, PlaidLinkResult> {
    public final OpenPlaidLink openPlaidLink = new OpenPlaidLink();

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        PlaidLinkParams plaidLinkParams = (PlaidLinkParams) obj;
        plaidLinkParams.getClass();
        return this.openPlaidLink.createIntent(context, PlaidKotlinFunctionsKt.linkTokenConfiguration(new UtilsKt$$ExternalSyntheticLambda0(plaidLinkParams, 21)));
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        LinkResult parseResult = this.openPlaidLink.parseResult(i, intent);
        if (!(parseResult instanceof LinkSuccess)) {
            if (parseResult instanceof LinkExit) {
                LinkInstitution institution = ((LinkExit) parseResult).getMetadata().getInstitution();
                return new PlaidLinkResult.Exit(new Institution(institution != null ? institution.getId() : null, institution != null ? institution.getName() : null));
            }
            Path$$ExternalSyntheticBUOutline0.m$1(parseResult, "Unexpected link result: ");
            return null;
        }
        LinkSuccess linkSuccess = (LinkSuccess) parseResult;
        String publicToken = linkSuccess.getPublicToken();
        LinkInstitution institution2 = linkSuccess.getMetadata().getInstitution();
        String id = institution2 != null ? institution2.getId() : null;
        LinkInstitution institution3 = linkSuccess.getMetadata().getInstitution();
        return new PlaidLinkResult.Success(publicToken, new Institution(id, institution3 != null ? institution3.getName() : null), linkSuccess.getMetadata().getMetadataJson());
    }
}
