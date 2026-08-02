package ru.yandex.taxi.requirements.storage;

import defpackage.am2;
import defpackage.eex;
import defpackage.h6z;
import defpackage.ny61;
import defpackage.p53;
import defpackage.qh2;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class a {
    public final com.yandex.go.utils.storage.json.a a;

    public a(eex eexVar) {
        am2 am2Var = new am2("requirements_storage", "locally_persistent", EmptyList.a);
        KSerializer serializer = h6z.Companion.serializer();
        eexVar.getClass();
        this.a = eexVar.a(am2Var, new p53(serializer, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        LocallyPersistentRequirementsStorage$remove$1 locallyPersistentRequirementsStorage$remove$1;
        int i;
        if (continuationImpl instanceof LocallyPersistentRequirementsStorage$remove$1) {
            locallyPersistentRequirementsStorage$remove$1 = (LocallyPersistentRequirementsStorage$remove$1) continuationImpl;
            int i2 = locallyPersistentRequirementsStorage$remove$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locallyPersistentRequirementsStorage$remove$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locallyPersistentRequirementsStorage$remove$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locallyPersistentRequirementsStorage$remove$1.label;
                com.yandex.go.utils.storage.json.a aVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    locallyPersistentRequirementsStorage$remove$1.L$0 = list;
                    locallyPersistentRequirementsStorage$remove$1.label = 1;
                    obj = aVar.a(locallyPersistentRequirementsStorage$remove$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    list = (List) locallyPersistentRequirementsStorage$remove$1.L$0;
                    b.b(obj);
                }
                ArrayList arrayList = new ArrayList((Collection) obj);
                ycc.w(arrayList, new qh2(list, 9), true);
                locallyPersistentRequirementsStorage$remove$1.L$0 = null;
                locallyPersistentRequirementsStorage$remove$1.L$1 = null;
                locallyPersistentRequirementsStorage$remove$1.label = 2;
                Object d = aVar.d(arrayList, locallyPersistentRequirementsStorage$remove$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        locallyPersistentRequirementsStorage$remove$1 = new LocallyPersistentRequirementsStorage$remove$1(this, continuationImpl);
        Object obj2 = locallyPersistentRequirementsStorage$remove$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locallyPersistentRequirementsStorage$remove$1.label;
        com.yandex.go.utils.storage.json.a aVar2 = this.a;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList((Collection) obj2);
        ycc.w(arrayList2, new qh2(list, 9), true);
        locallyPersistentRequirementsStorage$remove$1.L$0 = null;
        locallyPersistentRequirementsStorage$remove$1.L$1 = null;
        locallyPersistentRequirementsStorage$remove$1.label = 2;
        Object d2 = aVar2.d(arrayList2, locallyPersistentRequirementsStorage$remove$1);
        if (d2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        LocallyPersistentRequirementsStorage$store$1 locallyPersistentRequirementsStorage$store$1;
        int i;
        if (continuationImpl instanceof LocallyPersistentRequirementsStorage$store$1) {
            locallyPersistentRequirementsStorage$store$1 = (LocallyPersistentRequirementsStorage$store$1) continuationImpl;
            int i2 = locallyPersistentRequirementsStorage$store$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locallyPersistentRequirementsStorage$store$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locallyPersistentRequirementsStorage$store$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locallyPersistentRequirementsStorage$store$1.label;
                com.yandex.go.utils.storage.json.a aVar = this.a;
                if (i != 0) {
                    b.b(obj);
                    locallyPersistentRequirementsStorage$store$1.L$0 = list;
                    locallyPersistentRequirementsStorage$store$1.label = 1;
                    obj = aVar.a(locallyPersistentRequirementsStorage$store$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    list = (List) locallyPersistentRequirementsStorage$store$1.L$0;
                    b.b(obj);
                }
                ArrayList arrayList = new ArrayList((Collection) obj);
                ycc.w(arrayList, new qh2(list, 8), true);
                arrayList.addAll(list);
                locallyPersistentRequirementsStorage$store$1.L$0 = null;
                locallyPersistentRequirementsStorage$store$1.L$1 = null;
                locallyPersistentRequirementsStorage$store$1.label = 2;
                Object d = aVar.d(arrayList, locallyPersistentRequirementsStorage$store$1);
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        locallyPersistentRequirementsStorage$store$1 = new LocallyPersistentRequirementsStorage$store$1(this, continuationImpl);
        Object obj2 = locallyPersistentRequirementsStorage$store$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locallyPersistentRequirementsStorage$store$1.label;
        com.yandex.go.utils.storage.json.a aVar2 = this.a;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList((Collection) obj2);
        ycc.w(arrayList2, new qh2(list, 8), true);
        arrayList2.addAll(list);
        locallyPersistentRequirementsStorage$store$1.L$0 = null;
        locallyPersistentRequirementsStorage$store$1.L$1 = null;
        locallyPersistentRequirementsStorage$store$1.label = 2;
        Object d2 = aVar2.d(arrayList2, locallyPersistentRequirementsStorage$store$1);
        if (d2 != coroutineSingletons2) {
        }
    }
}
