package com.squareup.cash.account.presenters.documents;

import androidx.emoji2.text.MetadataRepo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$StandardPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.db2.profile.documents.LegalDocument;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountDocumentsPresenter$legalDocumentViewModel$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $title;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AccountDocumentsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountDocumentsPresenter$legalDocumentViewModel$1(AccountDocumentsPresenter accountDocumentsPresenter, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = accountDocumentsPresenter;
        this.$title = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$title;
        AccountDocumentsPresenter accountDocumentsPresenter = this.this$0;
        switch (i) {
            case 0:
                AccountDocumentsPresenter$legalDocumentViewModel$1 accountDocumentsPresenter$legalDocumentViewModel$1 = new AccountDocumentsPresenter$legalDocumentViewModel$1(accountDocumentsPresenter, str, continuation, 0);
                accountDocumentsPresenter$legalDocumentViewModel$1.L$0 = obj;
                return accountDocumentsPresenter$legalDocumentViewModel$1;
            default:
                AccountDocumentsPresenter$legalDocumentViewModel$1 accountDocumentsPresenter$legalDocumentViewModel$12 = new AccountDocumentsPresenter$legalDocumentViewModel$1(accountDocumentsPresenter, str, continuation, 1);
                accountDocumentsPresenter$legalDocumentViewModel$12.L$0 = obj;
                return accountDocumentsPresenter$legalDocumentViewModel$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AccountDocumentsPresenter$legalDocumentViewModel$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (r9.emit(r11, r17) == r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r4 == r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
    
        if (r1.emit(r10, r17) == r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (r4 == r9) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        Object afterpayStatements;
        int i = this.$r8$classId;
        AccountDocumentsPresenter accountDocumentsPresenter = this.this$0;
        switch (i) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        withContext = obj;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    MetadataRepo metadataRepo = accountDocumentsPresenter.legalDocumentManager;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    withContext = JobKt.withContext((CoroutineContext) metadataRepo.mRootNode, new RealProfileManager$profileOrNull$2(metadataRepo, null, 1), this);
                    break;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(accountDocumentsPresenter.stringManager.get(R.string.documents_category_header)));
                for (LegalDocument legalDocument : (List) withContext) {
                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(legalDocument.title, new AccountDocumentsViewEvent$RecordPayload$StandardPayload(legalDocument.token, legalDocument.url, false, null)));
                }
                AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel(this.$title, arrayList, (StatementType) null, (String) null, 28);
                this.L$0 = null;
                this.label = 2;
                break;
            default:
                RealAfterpayStatementManager realAfterpayStatementManager = accountDocumentsPresenter.afterpayStatementManager;
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            break;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        afterpayStatements = obj;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = flowCollector2;
                    this.label = 1;
                    afterpayStatements = realAfterpayStatementManager.getAfterpayStatements(this);
                    break;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(accountDocumentsPresenter.stringManager.get(R.string.documents_category_header)));
                for (Document document : (List) afterpayStatements) {
                    String str = document.token;
                    String str2 = document.title;
                    str.getClass();
                    HttpUrl.Builder newBuilder = realAfterpayStatementManager.retrofit.baseUrl.newBuilder();
                    newBuilder.addPathSegments("cash-app/afterpay-statements/monthly-statement", false);
                    newBuilder.addQueryParameter("token", str);
                    String str3 = newBuilder.build().url;
                    str2.getClass();
                    String str4 = document.token;
                    str4.getClass();
                    arrayList2.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(str2, new AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload(str3, str2, str4)));
                }
                AccountDocumentsViewModel accountDocumentsViewModel2 = new AccountDocumentsViewModel(this.$title, arrayList2, (StatementType) null, (String) null, 28);
                this.L$0 = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}
