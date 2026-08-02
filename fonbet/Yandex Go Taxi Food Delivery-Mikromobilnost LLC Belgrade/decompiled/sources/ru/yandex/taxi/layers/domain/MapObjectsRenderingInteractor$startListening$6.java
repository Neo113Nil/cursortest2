package ru.yandex.taxi.layers.domain;

import defpackage.byx;
import defpackage.fkp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zp00;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfkp;", "feature", "Lzy11;", "<anonymous>", "(Lfkp;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startListening$6", f = "MapObjectsRenderingInteractor.kt", l = {111, BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsRenderingInteractor$startListening$6 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRenderingInteractor$startListening$6(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsRenderingInteractor$startListening$6 mapObjectsRenderingInteractor$startListening$6 = new MapObjectsRenderingInteractor$startListening$6(this.this$0, continuation);
        mapObjectsRenderingInteractor$startListening$6.L$0 = obj;
        return mapObjectsRenderingInteractor$startListening$6;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsRenderingInteractor$startListening$6) create((fkp) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (ru.yandex.taxi.layers.domain.o.a(r0, (defpackage.fxe0) r11, r10) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        if (r11 == r1) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        fkp fkpVar = (fkp) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0;
            zp00 zp00Var = oVar.i;
            zp00Var.j = fkpVar != null;
            if (fkpVar != null && (str = fkpVar.a) != null && !zp00Var.i.contains(str)) {
                oVar.i.i.add(str);
            }
            o oVar2 = this.this$0;
            l lVar = oVar2.b;
            Map a = oVar2.i.a();
            o oVar3 = this.this$0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : a.entrySet()) {
                if (!oVar3.f(entry)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            byx a2 = this.this$0.i.a.a();
            this.L$0 = null;
            this.label = 1;
            obj = lVar.e(fkpVar, linkedHashMap, a2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        o oVar4 = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
