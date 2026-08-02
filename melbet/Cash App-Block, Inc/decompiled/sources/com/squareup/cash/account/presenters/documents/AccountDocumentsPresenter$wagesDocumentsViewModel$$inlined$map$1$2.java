package com.squareup.cash.account.presenters.documents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.work.data.api.EmployerTaxForms;
import com.squareup.cash.work.data.api.TaxFormData;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ String $title$inlined;
    public final /* synthetic */ AccountDocumentsPresenter this$0;

    /* renamed from: com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ AccountDocumentsPresenter$wagesDocumentsViewModel$$inlined$map$1$2(FlowCollector flowCollector, String str, AccountDocumentsPresenter accountDocumentsPresenter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$title$inlined = str;
        this.this$0 = accountDocumentsPresenter;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        String str;
        AccountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1 accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        AccountDocumentsPresenter accountDocumentsPresenter = this.this$0;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            ArrayList arrayList = new ArrayList();
                            for (EmployerTaxForms employerTaxForms : (List) obj) {
                                ArrayList<TaxFormData> arrayList2 = employerTaxForms.forms;
                                ArrayList arrayList3 = new ArrayList();
                                for (TaxFormData taxFormData : arrayList2) {
                                    String str2 = taxFormData.downloadUrl;
                                    AccountDocumentsViewModel.DocumentModel.RecordModel recordModel = (str2 == null || (str = taxFormData.displayTitle) == null) ? null : new AccountDocumentsViewModel.DocumentModel.RecordModel(str, new AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload(str2, str));
                                    if (recordModel != null) {
                                        arrayList3.add(recordModel);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(employerTaxForms.employerName));
                                    CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList);
                                }
                            }
                            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel(this.$title$inlined, arrayList, (StatementType) null, arrayList.isEmpty() ? accountDocumentsPresenter.stringManager.get(R.string.documents_wages_empty_message) : null, 12);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            default:
                if (continuation instanceof AccountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1 = (AccountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1) continuation;
                    int i5 = accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj4 : (List) obj) {
                                Calendar calendar = AccountDocumentsPresenter.cal;
                                Long l = ((Document) obj4).document_date;
                                l.getClass();
                                calendar.setTimeInMillis(l.longValue());
                                Integer num = new Integer(calendar.get(1));
                                Object obj5 = linkedHashMap.get(num);
                                if (obj5 == null) {
                                    obj5 = new ArrayList();
                                    linkedHashMap.put(num, obj5);
                                }
                                ((List) obj5).add(obj4);
                            }
                            TreeMap treeMap = new TreeMap(new b.C0008b(4));
                            treeMap.putAll(linkedHashMap);
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it = treeMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                Integer num2 = (Integer) entry.getKey();
                                List list = (List) entry.getValue();
                                List listOf = CollectionsKt__CollectionsJVMKt.listOf(new AccountDocumentsViewModel.DocumentModel.HeaderModel(String.valueOf(num2)));
                                list.getClass();
                                List<Document> list2 = list;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (Document document : list2) {
                                    String str3 = document.title;
                                    str3.getClass();
                                    Iterator it2 = it;
                                    String m = Recorder$$ExternalSyntheticOutline2.m(accountDocumentsPresenter.endpoint, "/cash-app/savings/download-1099-int-statement/", document.token);
                                    String str4 = document.title;
                                    str4.getClass();
                                    arrayList5.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(str3, new AccountDocumentsViewEvent$RecordPayload$ViewPdfPayload(m, str4)));
                                    it = it2;
                                }
                                CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus((Iterable) arrayList5, (Collection) listOf), arrayList4);
                                it = it;
                            }
                            AccountDocumentsViewModel accountDocumentsViewModel2 = new AccountDocumentsViewModel(this.$title$inlined, arrayList4, (StatementType) null, accountDocumentsPresenter.stringManager.get(R.string.documents_empty_state_description_savings_tax), 12);
                            accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel2, accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1 = new AccountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1(this, continuation);
                Object obj32 = accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = accountDocumentsPresenter$savingsTaxDocumentsViewModel$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
