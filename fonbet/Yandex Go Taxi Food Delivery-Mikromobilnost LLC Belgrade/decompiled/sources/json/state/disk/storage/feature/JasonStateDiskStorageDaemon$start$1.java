package json.state.disk.storage.feature;

import defpackage.d6x;
import defpackage.gtq0;
import defpackage.i6x;
import defpackage.jl40;
import defpackage.k5x;
import defpackage.m5x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p6x;
import defpackage.q6x;
import defpackage.r6x;
import defpackage.s6x;
import defpackage.t6x;
import defpackage.tje;
import defpackage.tse;
import defpackage.v6x;
import defpackage.w6x;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "json.state.disk.storage.feature.JasonStateDiskStorageDaemon$start$1", f = "JasonStateDiskStorageDaemon.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class JasonStateDiskStorageDaemon$start$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JasonStateDiskStorageDaemon$start$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JasonStateDiskStorageDaemon$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        JasonStateDiskStorageDaemon$start$1 jasonStateDiskStorageDaemon$start$1 = (JasonStateDiskStorageDaemon$start$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        jasonStateDiskStorageDaemon$start$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final b bVar = this.this$0;
        if (bVar.e == null) {
            bVar.e = bVar.a.c(new i6x() { // from class: json.state.disk.storage.feature.a
                @Override // defpackage.i6x
                public final void a(d6x d6xVar) {
                    d6x d6xVar2;
                    q6x D;
                    Map map;
                    b bVar2 = b.this;
                    bVar2.getClass();
                    s6x s6xVar = d6xVar.b;
                    v6x m = gtq0.m(d6xVar, "save-on-disk");
                    v6x v6xVar = w6x.a;
                    m5x m5xVar = m.a;
                    m5x m5xVar2 = k5x.a;
                    if (m5xVar.a.isEmpty()) {
                        d6xVar2 = new d6x(w6x.a, t6x.a);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Map map2 = s6xVar.a;
                        q6x q6xVar = (q6x) map2.get("save-on-disk");
                        if (q6xVar != null) {
                            linkedHashMap.put("save-on-disk", q6xVar);
                        }
                        ArrayList arrayList = new ArrayList(map2.size());
                        for (Map.Entry entry : map2.entrySet()) {
                            if (!jl40.l(entry.getKey(), "save-on-disk") && (D = gtq0.D((q6x) entry.getValue(), (q6x) map2.get("save-on-disk"))) != null) {
                                r6x r6xVar = D instanceof r6x ? (r6x) D : null;
                                if (r6xVar == null || (map = r6xVar.a) == null || !(!map.isEmpty())) {
                                    p6x p6xVar = D instanceof p6x ? (p6x) D : null;
                                    if (p6xVar != null) {
                                        String str = p6xVar.a;
                                        if (str != null) {
                                            if (str.length() <= 0) {
                                            }
                                        }
                                    }
                                }
                                linkedHashMap.put(entry.getKey(), D);
                            }
                            arrayList.add(zy11.a);
                        }
                        d6xVar2 = new d6x(m, new s6x(linkedHashMap));
                    }
                    if (d6xVar2.a.a.a.isEmpty()) {
                        return;
                    }
                    tje.N(bVar2.d, null, null, new JasonStateDiskStorageDaemon$saveOnDiskState$1(bVar2, d6xVar2, null), 3);
                }
            });
        }
        return zy11.a;
    }
}
