package com.squareup.cash.clientrouting.routers.profile;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.profile.screens.DocumentsScreen;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final class DocumentsRouter {
    public final RealAfterpayStatementManager afterpayStatementManager;
    public final RealDocumentEntitiesMapper documentEntitiesMapper;
    public final Navigator navigator;
    public final CoroutineScope scope;

    public DocumentsRouter(RealDocumentEntitiesMapper realDocumentEntitiesMapper, RealAfterpayStatementManager realAfterpayStatementManager, Navigator navigator, CoroutineScope coroutineScope) {
        navigator.getClass();
        this.documentEntitiesMapper = realDocumentEntitiesMapper;
        this.afterpayStatementManager = realAfterpayStatementManager;
        this.navigator = navigator;
        this.scope = coroutineScope;
    }

    public final void route(ClientRoute.ViewDocumentBtcTaxForm viewDocumentBtcTaxForm) {
        viewDocumentBtcTaxForm.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE);
        JobKt.launch$default(this.scope, null, null, new EntitySyncerKt$hasSyncedFlow$1(this, viewDocumentBtcTaxForm, (Continuation) null, 12), 3);
    }

    public final void route(ClientRoute.ViewDocumentStock viewDocumentStock, RoutingParams routingParams) {
        viewDocumentStock.getClass();
        routingParams.getClass();
        boolean z = routingParams.origin instanceof FamilyHome;
        DocumentsScreen.DocumentsScreenStockDocumentTypeSelection documentsScreenStockDocumentTypeSelection = DocumentsScreen.DocumentsScreenStockDocumentTypeSelection.INSTANCE;
        Navigator navigator = this.navigator;
        if (z) {
            navigator.goTo(documentsScreenStockDocumentTypeSelection);
        } else {
            navigator.goTo(Account.INSTANCE);
            navigator.goTo(documentsScreenStockDocumentTypeSelection);
        }
    }

    public final void route(ClientRoute.ViewDocumentAllBtcTaxForms viewDocumentAllBtcTaxForms, RoutingParams routingParams) {
        viewDocumentAllBtcTaxForms.getClass();
        routingParams.getClass();
        boolean z = routingParams.origin instanceof FamilyHome;
        DocumentsScreen.DocumentsScreenBitcoinTaxDocument documentsScreenBitcoinTaxDocument = DocumentsScreen.DocumentsScreenBitcoinTaxDocument.INSTANCE;
        Navigator navigator = this.navigator;
        if (z) {
            navigator.goTo(documentsScreenBitcoinTaxDocument);
        } else {
            navigator.goTo(Account.INSTANCE);
            navigator.goTo(documentsScreenBitcoinTaxDocument);
        }
    }

    public final void route(ClientRoute.ViewDocumentStockTaxForm viewDocumentStockTaxForm) {
        viewDocumentStockTaxForm.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE);
    }

    public final void route(ClientRoute.ViewDocumentStockTaxFormList viewDocumentStockTaxFormList) {
        viewDocumentStockTaxFormList.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(DocumentsScreen.DocumentsScreenStockTaxDocument.INSTANCE);
    }

    public final void route(ClientRoute.ViewDocumentStockMonthlyStatement viewDocumentStockMonthlyStatement) {
        viewDocumentStockMonthlyStatement.getClass();
        this.navigator.goTo(Account.INSTANCE);
        JobKt.launch$default(this.scope, null, null, new EntitySyncerKt$hasSyncedFlow$1(this, viewDocumentStockMonthlyStatement, (Continuation) null, 13), 3);
    }

    public final void route(ClientRoute.ViewDocumentStockMonthlyStatementList viewDocumentStockMonthlyStatementList) {
        viewDocumentStockMonthlyStatementList.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(DocumentsScreen.DocumentsScreenStockMonthlyForYear.INSTANCE);
    }

    public final void route(ClientRoute.ViewDocumentAfterpayStatements viewDocumentAfterpayStatements) {
        viewDocumentAfterpayStatements.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE);
    }

    public final void route(ClientRoute.ViewDocumentAfterpayMonthlyStatement viewDocumentAfterpayMonthlyStatement) {
        viewDocumentAfterpayMonthlyStatement.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(DocumentsScreen.DocumentsScreenAfterpayStatements.INSTANCE);
        JobKt.launch$default(this.scope, null, null, new EntitySyncerKt$hasSyncedFlow$1(this, viewDocumentAfterpayMonthlyStatement, (Continuation) null, 14), 3);
    }

    public final void route(ClientRoute.ViewDocumentAllSavingsTaxForms viewDocumentAllSavingsTaxForms) {
        viewDocumentAllSavingsTaxForms.getClass();
        Account account = Account.INSTANCE;
        Navigator navigator = this.navigator;
        navigator.goTo(account);
        navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(null));
        navigator.goTo(DocumentsScreen.DocumentsScreenMultiSavingsAccount.INSTANCE);
        navigator.goTo(DocumentsScreen.DocumentsScreenSavingsTaxDocuments.INSTANCE);
    }
}
