package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.apj0;
import defpackage.cqj0;
import defpackage.dhu;
import defpackage.ehu;
import defpackage.lx8;
import defpackage.ny61;
import defpackage.qwz0;
import defpackage.w511;
import defpackage.wgj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class j {
    public final ehu a;

    public j(ehu ehuVar) {
        this.a = ehuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        HiddenRequirementsInteractor$filterHiddenRequirementGroups$1 hiddenRequirementsInteractor$filterHiddenRequirementGroups$1;
        int i;
        Collection<wgj0> collection;
        List list;
        wgj0 qwz0Var;
        if (continuationImpl instanceof HiddenRequirementsInteractor$filterHiddenRequirementGroups$1) {
            hiddenRequirementsInteractor$filterHiddenRequirementGroups$1 = (HiddenRequirementsInteractor$filterHiddenRequirementGroups$1) continuationImpl;
            int i2 = hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.L$0 = arrayList;
                    hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.label = 1;
                    obj = this.a.b.b(hiddenRequirementsInteractor$filterHiddenRequirementGroups$1);
                    collection = arrayList;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Collection collection2 = (List) hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.L$0;
                    kotlin.b.b(obj);
                    collection = collection2;
                }
                list = ((dhu) obj).c;
                if (!list.isEmpty()) {
                    return collection;
                }
                ArrayList arrayList2 = new ArrayList();
                for (wgj0 wgj0Var : collection) {
                    if (wgj0Var instanceof cqj0) {
                        cqj0 cqj0Var = (cqj0) wgj0Var;
                        List list2 = cqj0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : list2) {
                            if (!list.contains(((apj0) obj2).a)) {
                                arrayList3.add(obj2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            qwz0Var = new cqj0(cqj0Var.a, arrayList3);
                            if (qwz0Var == null) {
                                arrayList2.add(qwz0Var);
                            }
                        }
                        qwz0Var = null;
                        if (qwz0Var == null) {
                        }
                    } else if (wgj0Var instanceof lx8) {
                        lx8 lx8Var = (lx8) wgj0Var;
                        List list3 = lx8Var.b;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list3) {
                            if (!list.contains(((apj0) obj3).a)) {
                                arrayList4.add(obj3);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            qwz0Var = new lx8(lx8Var.a, arrayList4);
                            if (qwz0Var == null) {
                            }
                        }
                        qwz0Var = null;
                        if (qwz0Var == null) {
                        }
                    } else {
                        if (!(wgj0Var instanceof qwz0)) {
                            w511.b();
                            return null;
                        }
                        ArrayList arrayList5 = ((qwz0) wgj0Var).a;
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj4 : arrayList5) {
                            if (!list.contains(((apj0) obj4).a)) {
                                arrayList6.add(obj4);
                            }
                        }
                        if (!arrayList6.isEmpty()) {
                            qwz0Var = new qwz0(arrayList6);
                            if (qwz0Var == null) {
                            }
                        }
                        qwz0Var = null;
                        if (qwz0Var == null) {
                        }
                    }
                }
                return arrayList2;
            }
        }
        hiddenRequirementsInteractor$filterHiddenRequirementGroups$1 = new HiddenRequirementsInteractor$filterHiddenRequirementGroups$1(this, continuationImpl);
        Object obj5 = hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hiddenRequirementsInteractor$filterHiddenRequirementGroups$1.label;
        if (i != 0) {
        }
        list = ((dhu) obj5).c;
        if (!list.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        HiddenRequirementsInteractor$filterHiddenRequirementsList$1 hiddenRequirementsInteractor$filterHiddenRequirementsList$1;
        int i;
        dhu dhuVar;
        if (continuationImpl instanceof HiddenRequirementsInteractor$filterHiddenRequirementsList$1) {
            hiddenRequirementsInteractor$filterHiddenRequirementsList$1 = (HiddenRequirementsInteractor$filterHiddenRequirementsList$1) continuationImpl;
            int i2 = hiddenRequirementsInteractor$filterHiddenRequirementsList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hiddenRequirementsInteractor$filterHiddenRequirementsList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hiddenRequirementsInteractor$filterHiddenRequirementsList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hiddenRequirementsInteractor$filterHiddenRequirementsList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hiddenRequirementsInteractor$filterHiddenRequirementsList$1.L$0 = list;
                    hiddenRequirementsInteractor$filterHiddenRequirementsList$1.label = 1;
                    obj = this.a.b.b(hiddenRequirementsInteractor$filterHiddenRequirementsList$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) hiddenRequirementsInteractor$filterHiddenRequirementsList$1.L$0;
                    kotlin.b.b(obj);
                }
                dhuVar = (dhu) obj;
                if (!dhuVar.c.isEmpty()) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!dhuVar.c.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        hiddenRequirementsInteractor$filterHiddenRequirementsList$1 = new HiddenRequirementsInteractor$filterHiddenRequirementsList$1(this, continuationImpl);
        Object obj3 = hiddenRequirementsInteractor$filterHiddenRequirementsList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hiddenRequirementsInteractor$filterHiddenRequirementsList$1.label;
        if (i != 0) {
        }
        dhuVar = (dhu) obj3;
        if (!dhuVar.c.isEmpty()) {
        }
    }
}
