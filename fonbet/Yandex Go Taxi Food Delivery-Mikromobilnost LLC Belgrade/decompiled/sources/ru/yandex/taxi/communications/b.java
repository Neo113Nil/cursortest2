package ru.yandex.taxi.communications;

import defpackage.ny61;
import defpackage.t9s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes9.dex */
public final class b {
    public final ru.yandex.taxi.communications.data.a a;

    public b(ru.yandex.taxi.communications.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Set set, ContinuationImpl continuationImpl) {
        CommunicationsShowPolicyInteractor$filterByShowPolicy$1 communicationsShowPolicyInteractor$filterByShowPolicy$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof CommunicationsShowPolicyInteractor$filterByShowPolicy$1) {
            communicationsShowPolicyInteractor$filterByShowPolicy$1 = (CommunicationsShowPolicyInteractor$filterByShowPolicy$1) continuationImpl;
            int i2 = communicationsShowPolicyInteractor$filterByShowPolicy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                communicationsShowPolicyInteractor$filterByShowPolicy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = communicationsShowPolicyInteractor$filterByShowPolicy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = communicationsShowPolicyInteractor$filterByShowPolicy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    CommunicationItem communicationItem = (CommunicationItem) communicationsShowPolicyInteractor$filterByShowPolicy$1.L$7;
                    Object obj2 = communicationsShowPolicyInteractor$filterByShowPolicy$1.L$6;
                    it = (Iterator) communicationsShowPolicyInteractor$filterByShowPolicy$1.L$5;
                    collection = (Collection) communicationsShowPolicyInteractor$filterByShowPolicy$1.L$4;
                    Set set2 = (Set) communicationsShowPolicyInteractor$filterByShowPolicy$1.L$1;
                    kotlin.b.b(obj);
                    Object obj3 = obj2;
                    set = set2;
                    Object b = obj;
                    if (((t9s0) b).a(communicationItem.h, set)) {
                        collection.add(obj3);
                    }
                    if (it.hasNext()) {
                        Object next = it.next();
                        CommunicationItem communicationItem2 = (CommunicationItem) next;
                        String str = communicationItem2.a;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$0 = null;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$1 = set;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$2 = null;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$3 = null;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$4 = collection;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$5 = it;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$6 = next;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.L$7 = communicationItem2;
                        communicationsShowPolicyInteractor$filterByShowPolicy$1.label = 1;
                        b = this.a.b(str, communicationsShowPolicyInteractor$filterByShowPolicy$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj3 = next;
                        communicationItem = communicationItem2;
                        if (((t9s0) b).a(communicationItem.h, set)) {
                        }
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        communicationsShowPolicyInteractor$filterByShowPolicy$1 = new CommunicationsShowPolicyInteractor$filterByShowPolicy$1(this, continuationImpl);
        Object obj4 = communicationsShowPolicyInteractor$filterByShowPolicy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = communicationsShowPolicyInteractor$filterByShowPolicy$1.label;
        if (i != 0) {
        }
    }
}
