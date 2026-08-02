package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0317w3;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0344z3 implements A3 {
    public final Y7 a;

    public C0344z3(WorkflowDatabase workflowDatabase) {
        workflowDatabase.getClass();
        this.a = workflowDatabase.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:11:0x004d->B:13:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.plaid.internal.A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C0335y3 c0335y3;
        int i;
        Iterator it;
        if (continuationImpl instanceof C0335y3) {
            c0335y3 = (C0335y3) continuationImpl;
            int i2 = c0335y3.c;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                c0335y3.c = i2 - PKIFailureInfo.systemUnavail;
                Object obj = c0335y3.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c0335y3.c;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Y7 y7 = this.a;
                    c0335y3.c = 1;
                    obj = y7.a(c0335y3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(ClientEventOuterClass$ClientEvent.parseFrom(((h8) it.next()).c));
                }
                return arrayList;
            }
        }
        c0335y3 = new C0335y3(this, continuationImpl);
        Object obj2 = c0335y3.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c0335y3.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    @Override // com.plaid.internal.A3
    public final Object a(List list, C0299u3 c0299u3) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent = (ClientEventOuterClass$ClientEvent) it.next();
            String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
            workflowSessionId.getClass();
            String valueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
            byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
            byteArray.getClass();
            arrayList.add(new h8(workflowSessionId, valueOf, byteArray));
        }
        Object a = this.a.a(arrayList, c0299u3);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.A3
    public final Object a(ClientEventOuterClass$ClientEvent clientEventOuterClass$ClientEvent, C0317w3.a aVar) {
        Y7 y7 = this.a;
        String workflowSessionId = clientEventOuterClass$ClientEvent.getWorkflowSessionId();
        workflowSessionId.getClass();
        String valueOf = String.valueOf(clientEventOuterClass$ClientEvent.hashCode());
        byte[] byteArray = clientEventOuterClass$ClientEvent.toByteArray();
        byteArray.getClass();
        Object a = y7.a(workflowSessionId, valueOf, byteArray, aVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : Unit.INSTANCE;
    }
}
