package ru.yandex.taxi.layers.domain;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.byx;
import defpackage.cq60;
import defpackage.fkp;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wp31;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.layers.analytics.LayersService;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "", "", "Llm00;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsInteractor$onResponse$1", f = "MapObjectsInteractor.kt", l = {145, BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsInteractor$onResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ cq60 $response;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsInteractor$onResponse$1(cq60 cq60Var, Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$response = cq60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsInteractor$onResponse$1 mapObjectsInteractor$onResponse$1 = new MapObjectsInteractor$onResponse$1(this.$response, continuation, this.this$0);
        mapObjectsInteractor$onResponse$1.L$0 = obj;
        return mapObjectsInteractor$onResponse$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsInteractor$onResponse$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x014d, code lost:
    
        if (r1.emit(r5, r23) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (r4 == r2) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        String a;
        Object a2;
        Map map;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            currentTimeMillis = System.currentTimeMillis();
            List h = scc.h(this.this$0.l.a.b.a.getValue());
            cq60 cq60Var = this.$response;
            List list = cq60Var.g;
            cq60 cq60Var2 = new cq60(cq60Var.a, cq60Var.b, cq60Var.c, cq60Var.d, cq60Var.e, cq60Var.f, list != null ? kotlin.collections.a.m0(h, list) : null, cq60Var.h, cq60Var.i, cq60Var.j, cq60Var.k, cq60Var.l);
            fkp fkpVar = (fkp) this.this$0.l.a.b.a.getValue();
            a = fkpVar != null ? fkpVar.getA() : null;
            ru.yandex.taxi.layers.source.e eVar = this.this$0.k;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = a;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            a2 = eVar.a(cq60Var2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            currentTimeMillis = this.J$0;
            a = (String) this.L$3;
            kotlin.b.b(obj);
            a2 = obj;
        }
        Map map2 = (Map) a2;
        if (a != null) {
            map = new LinkedHashMap(gw00.d(map2.size()));
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                lm00 lm00Var = (lm00) entry.getValue();
                if (jl40.l(str, a)) {
                    lm00Var = lm00.a(lm00Var, wp31.a(lm00Var.d), null, 247);
                }
                map.put(key, lm00Var);
            }
        } else {
            map = map2;
        }
        l lVar = this.this$0;
        byx byxVar = this.$response.n;
        lVar.m.d(byxVar != null ? byxVar : null, LayersService.MAP_OBJECTS, map2.size(), System.currentTimeMillis() - currentTimeMillis);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.J$0 = currentTimeMillis;
        this.label = 2;
    }
}
