package ru.yandex.taxi.widgets.data.repository;

import defpackage.ny61;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Set b;

    public a(vpr vprVar, Set set) {
        this.b = set;
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LocalTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1 localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1;
        int i;
        vpr vprVar;
        Iterator it;
        if (continuation instanceof LocalTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1) {
            localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1 = (LocalTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1) continuation;
            int i2 = localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set entrySet = ((Map) obj).entrySet();
                    Set set = this.b;
                    Set g = v4r0.g(entrySet, set);
                    set.clear();
                    set.addAll(entrySet);
                    Iterator it2 = g.iterator();
                    vprVar = this.a;
                    it = it2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$7;
                    vprVar = (vpr) localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$3;
                    kotlin.b.b(obj2);
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Pair pair = new Pair(entry.getKey(), entry.getValue());
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$0 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$1 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$2 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$3 = vprVar;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$4 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$5 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$6 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$7 = it;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$8 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.L$9 = null;
                    localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.label = 1;
                    if (vprVar.emit(pair, localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1 = new LocalTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1(this, continuation);
        Object obj22 = localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = localTrackingDefermentsRepository$entriesAsFlow$$inlined$transform$1$1$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
