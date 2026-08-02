package ru.yandex.taxi.location.zerokm.datasource;

import defpackage.avj0;
import defpackage.gc61;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qcx;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.xwh0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "Lgc61;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.location.zerokm.datasource.ZeroKmDefaultSource$getAll$2", f = "ZeroKmDefaultSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ZeroKmDefaultSource$getAll$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZeroKmDefaultSource$getAll$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZeroKmDefaultSource$getAll$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroKmDefaultSource$getAll$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        wnt wntVar = bVar.b;
        zuj0 zuj0Var = bVar.a;
        xnt xntVar = (xnt) wntVar;
        c cVar = (c) xntVar.b(((avj0) zuj0Var).a.getResources().openRawResource(xwh0.zero_km), c.Companion.serializer());
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : cVar.a.entrySet()) {
            String str = (String) entry.getKey();
            c m = qcx.m((kotlinx.serialization.json.b) entry.getValue());
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) m.get("lon");
            if (bVar2 == null) {
                ny61.r("Missing lon field in ZeroKmDefaultSource");
                return null;
            }
            double h = qcx.h(qcx.n(bVar2));
            kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) m.get("lat");
            if (bVar3 == null) {
                ny61.r("Missing lat field in ZeroKmDefaultSource");
                return null;
            }
            mapBuilder.put(str, new gc61(str, h, qcx.h(qcx.n(bVar3))));
        }
        return mapBuilder.j();
    }
}
