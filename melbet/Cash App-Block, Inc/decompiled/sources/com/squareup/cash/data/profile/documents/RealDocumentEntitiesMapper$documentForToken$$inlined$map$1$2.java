package com.squareup.cash.data.profile.documents;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.crypto.db.Crypto_statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ RealDocumentEntitiesMapper this$0;

    /* renamed from: com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public FlowCollector L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2(FlowCollector flowCollector, RealDocumentEntitiesMapper realDocumentEntitiesMapper, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = realDocumentEntitiesMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r2.emit(r5, r0) == r15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r2.emit(r13, r0) != r15) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        if (r13 == r15) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009f -> B:18:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        RealDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1 realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        int i6 = this.$r8$classId;
        RealDocumentEntitiesMapper realDocumentEntitiesMapper = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        int i7 = 0;
        switch (i6) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i8 = anonymousClass1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            anonymousClass1.L$4 = flowCollector;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            obj2 = RealDocumentEntitiesMapper.access$toProfileDocumentModel(realDocumentEntitiesMapper, (Crypto_statement) obj, anonymousClass1);
                            break;
                        } else if (i == 1) {
                            i7 = anonymousClass1.I$0;
                            flowCollector = anonymousClass1.L$4;
                            SafeTrace.throwOnFailure(obj2);
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                            break;
                        }
                        anonymousClass1.L$4 = null;
                        anonymousClass1.I$0 = i7;
                        anonymousClass1.label = 2;
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                anonymousClass1.L$4 = null;
                anonymousClass1.I$0 = i7;
                anonymousClass1.label = 2;
            default:
                if (continuation instanceof RealDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1) {
                    realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1 = (RealDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1) continuation;
                    int i9 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            List list = (List) obj;
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            it = list.iterator();
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                            if (it.hasNext()) {
                            }
                        } else if (i2 == 1) {
                            int i10 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$3;
                            int i11 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$2;
                            int i12 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$1;
                            int i13 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$0;
                            Collection collection = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$13;
                            Iterator it2 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$10;
                            Collection collection2 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$9;
                            FlowCollector flowCollector2 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj3);
                            int i14 = i10;
                            i4 = i11;
                            flowCollector = flowCollector2;
                            Iterator it3 = it2;
                            ArrayList arrayList2 = collection;
                            int i15 = i13;
                            ArrayList arrayList3 = collection2;
                            arrayList2.add((ProfileDocumentModel) obj3);
                            i3 = i12;
                            i5 = i14;
                            i7 = i15;
                            arrayList = arrayList3;
                            it = it3;
                            if (it.hasNext()) {
                                Crypto_statement crypto_statement = (Crypto_statement) it.next();
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$4 = flowCollector;
                                ArrayList arrayList4 = arrayList;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$9 = arrayList4;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$10 = it;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$13 = arrayList4;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$0 = i7;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$1 = i3;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$2 = i4;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$3 = i5;
                                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.label = 1;
                                Object access$toProfileDocumentModel = RealDocumentEntitiesMapper.access$toProfileDocumentModel(realDocumentEntitiesMapper, crypto_statement, realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1);
                                if (access$toProfileDocumentModel != coroutineSingletons3) {
                                    it3 = it;
                                    arrayList2 = arrayList;
                                    i15 = i7;
                                    i14 = i5;
                                    i12 = i3;
                                    obj3 = access$toProfileDocumentModel;
                                    arrayList3 = arrayList2;
                                    arrayList2.add((ProfileDocumentModel) obj3);
                                    i3 = i12;
                                    i5 = i14;
                                    i7 = i15;
                                    arrayList = arrayList3;
                                    it = it3;
                                    if (it.hasNext()) {
                                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$4 = null;
                                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$9 = null;
                                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$10 = null;
                                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.L$13 = null;
                                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.I$0 = i7;
                                        realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.label = 2;
                                        break;
                                    }
                                }
                            }
                            break;
                        } else if (i2 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                            break;
                        }
                    }
                }
                realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1 = new RealDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realDocumentEntitiesMapper$documentsForCategory$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
