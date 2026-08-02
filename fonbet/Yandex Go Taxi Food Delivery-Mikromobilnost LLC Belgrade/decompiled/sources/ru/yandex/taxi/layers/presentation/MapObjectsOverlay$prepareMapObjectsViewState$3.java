package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.dn00;
import defpackage.f4c0;
import defpackage.lm00;
import defpackage.lp00;
import defpackage.muw;
import defpackage.mvg;
import defpackage.np00;
import defpackage.ny61;
import defpackage.pp00;
import defpackage.s5r;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xm00;
import defpackage.ym00;
import defpackage.ym91;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.intersection.Participant;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$prepareMapObjectsViewState$3", f = "MapObjectsOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$prepareMapObjectsViewState$3 extends SuspendLambda implements wls {
    final /* synthetic */ CameraPosition $cameraPosition;
    final /* synthetic */ Map<String, lm00> $mapObjects;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$prepareMapObjectsViewState$3(f fVar, Map map, CameraPosition cameraPosition, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$mapObjects = map;
        this.$cameraPosition = cameraPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$prepareMapObjectsViewState$3(this.this$0, this.$mapObjects, this.$cameraPosition, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MapObjectsOverlay$prepareMapObjectsViewState$3 mapObjectsOverlay$prepareMapObjectsViewState$3 = (MapObjectsOverlay$prepareMapObjectsViewState$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mapObjectsOverlay$prepareMapObjectsViewState$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean containsKey;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        Map<String, lm00> map = this.$mapObjects;
        float zoom = this.$cameraPosition.getZoom();
        fVar.getClass();
        s5r s5rVar = new s5r(dn00.c(map.values()));
        while (s5rVar.hasNext()) {
            ym00 ym00Var = (ym00) s5rVar.next();
            lm00 lm00Var = map.get(ym00Var.e());
            if (lm00Var != null) {
                f4c0 g = ym00Var.g();
                if (g.f == null) {
                    xm00 xm00Var = fVar.M;
                    xm00Var.getClass();
                    g.b(xm00Var);
                    ym91.f(g, dn00.a(zoom, ym00Var, lm00Var.d.e()), lm00Var.g, null);
                    g.i(true);
                    g.A(0.0f);
                    fVar.W.add(g);
                }
            }
        }
        f fVar2 = this.this$0;
        lp00 lp00Var = fVar2.w;
        for (Map.Entry entry : fVar2.I.entrySet()) {
            Participant participant = (Participant) entry.getKey();
            for (Participant participant2 : (Participant[]) ((Pair) entry.getValue()).f()) {
                ru.yandex.taxi.map_common.map.intersection.a aVar = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
                synchronized (aVar) {
                    containsKey = aVar.b.containsKey(participant.name() + ":" + participant2.name());
                }
                if (containsKey) {
                    ru.yandex.taxi.map_common.map.intersection.a aVar2 = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var;
                    HashMap hashMap = aVar2.b;
                    if (!hashMap.isEmpty()) {
                        np00 np00Var = (np00) hashMap.get(participant.name() + ":" + participant2.name());
                        if (np00Var != null) {
                            muw muwVar = np00Var.b;
                            muw muwVar2 = np00Var.a;
                            int i = pp00.a[np00Var.c.ordinal()];
                            if (i == 1) {
                                aVar2.f(np00Var, muwVar2.a(), muwVar.a());
                            } else if (i == 2) {
                                aVar2.e(muwVar2.a(), np00Var, muwVar.b(), participant2);
                            } else if (i == 3) {
                                aVar2.d(muwVar.a(), np00Var, muwVar2.b(), participant);
                            } else {
                                if (i != 4) {
                                    w511.b();
                                    return null;
                                }
                                aVar2.c(np00Var, participant, participant2, muwVar2.b(), muwVar.b());
                            }
                        }
                    }
                }
            }
        }
        return zy11.a;
    }
}
