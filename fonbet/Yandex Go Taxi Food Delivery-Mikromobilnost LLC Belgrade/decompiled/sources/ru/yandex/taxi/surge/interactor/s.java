package ru.yandex.taxi.surge.interactor;

import defpackage.dru;
import defpackage.ny61;
import defpackage.tvw0;
import defpackage.uvw0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class s {
    public final ru.yandex.taxi.surge.repository.c a;

    public s(ru.yandex.taxi.surge.repository.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dru druVar, ContinuationImpl continuationImpl) {
        SurgeShortcutModalShowPolicyInteractor$needShowModal$1 surgeShortcutModalShowPolicyInteractor$needShowModal$1;
        int i;
        Integer num;
        if (continuationImpl instanceof SurgeShortcutModalShowPolicyInteractor$needShowModal$1) {
            surgeShortcutModalShowPolicyInteractor$needShowModal$1 = (SurgeShortcutModalShowPolicyInteractor$needShowModal$1) continuationImpl;
            int i2 = surgeShortcutModalShowPolicyInteractor$needShowModal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeShortcutModalShowPolicyInteractor$needShowModal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = surgeShortcutModalShowPolicyInteractor$needShowModal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeShortcutModalShowPolicyInteractor$needShowModal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uvw0 uvw0Var = druVar.e;
                    if (uvw0Var == null) {
                        return Boolean.FALSE;
                    }
                    tvw0.a aVar = uvw0Var.c;
                    if ((aVar != null ? aVar.a : null) == null) {
                        return Boolean.TRUE;
                    }
                    Integer num2 = aVar.a;
                    String str = druVar.a;
                    surgeShortcutModalShowPolicyInteractor$needShowModal$1.L$0 = null;
                    surgeShortcutModalShowPolicyInteractor$needShowModal$1.L$1 = num2;
                    surgeShortcutModalShowPolicyInteractor$needShowModal$1.label = 1;
                    Object a = this.a.a(str, surgeShortcutModalShowPolicyInteractor$needShowModal$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    num = num2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    num = (Integer) surgeShortcutModalShowPolicyInteractor$needShowModal$1.L$1;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() < num.intValue());
            }
        }
        surgeShortcutModalShowPolicyInteractor$needShowModal$1 = new SurgeShortcutModalShowPolicyInteractor$needShowModal$1(this, continuationImpl);
        Object obj2 = surgeShortcutModalShowPolicyInteractor$needShowModal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeShortcutModalShowPolicyInteractor$needShowModal$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() < num.intValue());
    }
}
