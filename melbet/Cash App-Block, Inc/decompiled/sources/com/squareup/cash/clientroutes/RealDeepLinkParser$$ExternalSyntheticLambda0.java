package com.squareup.cash.clientroutes;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final /* synthetic */ class RealDeepLinkParser$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Uri f$0;

    public /* synthetic */ RealDeepLinkParser$$ExternalSyntheticLambda0(Uri uri, int i) {
        this.$r8$classId = i;
        this.f$0 = uri;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Uri uri = this.f$0;
        switch (i) {
            case 0:
                Matcher matcher = (Matcher) obj;
                matcher.getClass();
                return (ClientRoute) matcher.match.invoke(uri);
            case 1:
                Matcher matcher2 = (Matcher) obj;
                matcher2.getClass();
                Function1 function1 = matcher2.match;
                uri.getClass();
                return (ClientRoute) function1.invoke(uri);
            default:
                FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
                financialConnectionsSheetState.getClass();
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = financialConnectionsSheetState.manifest;
                financialConnectionsSessionManifest.getClass();
                return FinancialConnectionsSheetState.copy$default(financialConnectionsSheetState, false, null, FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK, new FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl(Recorder$$ExternalSyntheticOutline2.m(financialConnectionsSessionManifest.hostedAuthUrl, "&startPolling=true&", uri.getFragment())), 5);
        }
    }
}
