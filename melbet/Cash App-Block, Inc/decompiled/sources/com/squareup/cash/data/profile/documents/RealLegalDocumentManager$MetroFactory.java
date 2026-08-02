package com.squareup.cash.data.profile.documents;

import androidx.emoji2.text.MetadataRepo;
import com.fillr.n;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.protos.cash.librarian.api.LibrarianService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealLegalDocumentManager$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId = 1;
    public final DoubleCheck cashDatabase;
    public final LambdaProvider ioDispatcher;
    public final DoubleCheck regionProvider;
    public final DoubleCheck service;

    public RealLegalDocumentManager$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3) {
        this.ioDispatcher = lambdaProvider;
        this.service = doubleCheck;
        this.regionProvider = doubleCheck2;
        this.cashDatabase = doubleCheck3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DoubleCheck doubleCheck = this.cashDatabase;
        DoubleCheck doubleCheck2 = this.regionProvider;
        DoubleCheck doubleCheck3 = this.service;
        LambdaProvider lambdaProvider = this.ioDispatcher;
        switch (i) {
            case 0:
                LibrarianService librarianService = (LibrarianService) doubleCheck3.getValue();
                RealRegionProvider realRegionProvider = (RealRegionProvider) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext = (CoroutineContext) lambdaProvider.lambda.invoke();
                librarianService.getClass();
                realRegionProvider.getClass();
                cashAccountDatabaseImpl.getClass();
                coroutineContext.getClass();
                return new MetadataRepo(librarianService, realRegionProvider, cashAccountDatabaseImpl, coroutineContext);
            default:
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                GooglePayService googlePayService = (GooglePayService) doubleCheck3.getValue();
                Analytics analytics = (Analytics) doubleCheck2.getValue();
                IssuedCardManager issuedCardManager = (IssuedCardManager) doubleCheck.getValue();
                androidStringManager.getClass();
                googlePayService.getClass();
                analytics.getClass();
                issuedCardManager.getClass();
                return new n(androidStringManager, googlePayService, analytics, issuedCardManager);
        }
    }

    public RealLegalDocumentManager$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider) {
        this.service = doubleCheck;
        this.regionProvider = doubleCheck2;
        this.cashDatabase = doubleCheck3;
        this.ioDispatcher = lambdaProvider;
    }
}
