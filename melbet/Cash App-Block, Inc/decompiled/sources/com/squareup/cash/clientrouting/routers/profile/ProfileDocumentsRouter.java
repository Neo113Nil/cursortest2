package com.squareup.cash.clientrouting.routers.profile;

import app.cash.broadway.navigation.Navigator;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.profile.documents.DocumentCategory;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.DocumentsScreen;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.slf4j.Logger;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ProfileDocumentsRouter {
    public final Navigator navigator;

    public ProfileDocumentsRouter(Navigator navigator, RealDocumentsManager realDocumentsManager) {
        navigator.getClass();
        this.navigator = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewDocumentCategory viewDocumentCategory, ContinuationImpl continuationImpl) {
        ProfileDocumentsRouter$route$1 profileDocumentsRouter$route$1;
        int i;
        if (continuationImpl instanceof ProfileDocumentsRouter$route$1) {
            profileDocumentsRouter$route$1 = (ProfileDocumentsRouter$route$1) continuationImpl;
            int i2 = profileDocumentsRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                profileDocumentsRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = profileDocumentsRouter$route$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileDocumentsRouter$route$1.label;
                DocumentCategory.AccountStatements accountStatements = DocumentCategory.AccountStatements.INSTANCE;
                DocumentCategory.None none = DocumentCategory.None.INSTANCE;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = viewDocumentCategory.category;
                    profileDocumentsRouter$route$1.label = 1;
                    obj = CollectionsKt__CollectionsJVMKt.listOf(Intrinsics.areEqual(str, Logger.ROOT_LOGGER_NAME) ? none : StringsKt__StringsJVMKt.equals(str, "statements", true) ? accountStatements : new DocumentCategory.WithId(str));
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                for (DocumentCategory documentCategory : (Iterable) obj) {
                    boolean areEqual = Intrinsics.areEqual(documentCategory, none);
                    Navigator navigator = this.navigator;
                    if (areEqual) {
                        navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(null));
                    } else if (documentCategory instanceof DocumentCategory.WithId) {
                        navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(((DocumentCategory.WithId) documentCategory).id));
                    } else {
                        if (!Intrinsics.areEqual(documentCategory, accountStatements)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(null));
                        navigator.goTo(new DocumentsScreen.DocumentsScreenMultiStatementAccount(true));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        profileDocumentsRouter$route$1 = new ProfileDocumentsRouter$route$1(this, continuationImpl);
        Object obj3 = profileDocumentsRouter$route$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileDocumentsRouter$route$1.label;
        DocumentCategory.AccountStatements accountStatements2 = DocumentCategory.AccountStatements.INSTANCE;
        DocumentCategory.None none2 = DocumentCategory.None.INSTANCE;
        if (i != 0) {
        }
        while (r8.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewDocuments viewDocuments) {
        viewDocuments.getClass();
        this.navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(null));
    }

    public final void route(ClientRoute.ViewDocumentBankingStatements viewDocumentBankingStatements, RoutingParams routingParams) {
        viewDocumentBankingStatements.getClass();
        routingParams.getClass();
        boolean z = routingParams.origin instanceof FamilyHome;
        Navigator navigator = this.navigator;
        if (z) {
            navigator.goTo(new DocumentsScreen.DocumentsScreenMultiStatementAccount(true));
        } else {
            navigator.goTo(new DocumentsScreen.DocumentsScreenCategory(null));
            navigator.goTo(new DocumentsScreen.DocumentsScreenMultiStatementAccount(true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void route(ClientRoute.ViewDocumentBankingMonthlyStatement viewDocumentBankingMonthlyStatement) {
        viewDocumentBankingMonthlyStatement.getClass();
        DocumentsScreen.DocumentsScreenCategory documentsScreenCategory = new DocumentsScreen.DocumentsScreenCategory(null);
        Navigator navigator = this.navigator;
        navigator.goTo(documentsScreenCategory);
        navigator.goTo(new DocumentDownloaderScreen.AccountStatementDownloaderScreen((DocumentDownloaderScreen.DocumentData) null, (String) (0 == true ? 1 : 0), viewDocumentBankingMonthlyStatement.token, 7));
    }
}
