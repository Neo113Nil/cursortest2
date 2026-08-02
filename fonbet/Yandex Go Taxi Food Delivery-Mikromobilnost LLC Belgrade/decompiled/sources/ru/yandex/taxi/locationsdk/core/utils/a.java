package ru.yandex.taxi.locationsdk.core.utils;

import defpackage.bm00;
import defpackage.e2r;
import defpackage.igz;
import defpackage.p0u;
import defpackage.qrq0;
import defpackage.rcz;
import defpackage.s5r;
import defpackage.tpr;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;

/* loaded from: classes9.dex */
public abstract class a {
    public static final o a(tpr tprVar, igz igzVar, String str) {
        return new o(tprVar, new FlowLoggingKt$catchLogging$1(igzVar, str, null));
    }

    public static final o b(g gVar, rcz rczVar, Pair... pairArr) {
        return new o(gVar, new FlowLoggingKt$catchLogging$2(rczVar, "SourceLocationProviderOrchestrator/requestFromSources", pairArr, null));
    }

    public static final LinkedHashMap c(qrq0 qrq0Var) {
        InputSourcePriorityKt$mergeActivePriorities$1 inputSourcePriorityKt$mergeActivePriorities$1 = InputSourcePriorityKt$mergeActivePriorities$1.b;
        e2r l = kotlin.sequences.b.l(qrq0Var, new p0u(22));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s5r s5rVar = new s5r(l);
        while (s5rVar.hasNext()) {
            Map.Entry entry = (Map.Entry) s5rVar.next();
            linkedHashMap.merge(entry.getKey(), entry.getValue(), new bm00(inputSourcePriorityKt$mergeActivePriorities$1, 0));
        }
        return linkedHashMap;
    }

    public static final void d(Object obj, igz igzVar, String str, Pair... pairArr) {
        Throwable a = Result.a(obj);
        if (a != null) {
            ((rcz) igzVar).b(str, a, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
