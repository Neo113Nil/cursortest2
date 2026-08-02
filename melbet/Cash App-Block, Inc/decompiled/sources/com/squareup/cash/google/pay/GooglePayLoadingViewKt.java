package com.squareup.cash.google.pay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.data.profile.documents.RealLegalDocumentManager$MetroFactory;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5;

/* loaded from: classes6.dex */
public abstract class GooglePayLoadingViewKt {

    /* renamed from: lambda$-2062117272, reason: not valid java name */
    public static final ComposableLambdaImpl f428lambda$2062117272 = new ComposableLambdaImpl(new CashMapViewKt$$ExternalSyntheticLambda1(3), false, -2062117272);
    public static final ComposableLambdaImpl lambda$1818560934 = new ComposableLambdaImpl(new ComposableSingletons$MoneyTabUIKt$$ExternalSyntheticLambda5(18), false, 1818560934);

    public static final void GooglePayLoadingView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1715543469);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, f428lambda$2062117272, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda1(i, 4);
        }
    }

    public static GooglePayProvisioningGateway provideGooglePayProvisioningGateway$presenters(RealLegalDocumentManager$MetroFactory realLegalDocumentManager$MetroFactory, CashLiteGooglePayProvisioningGateway$MetroFactory cashLiteGooglePayProvisioningGateway$MetroFactory, CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0) {
        return (GooglePayProvisioningGateway) (cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? cashLiteGooglePayProvisioningGateway$MetroFactory.invoke() : realLegalDocumentManager$MetroFactory.invoke());
    }
}
