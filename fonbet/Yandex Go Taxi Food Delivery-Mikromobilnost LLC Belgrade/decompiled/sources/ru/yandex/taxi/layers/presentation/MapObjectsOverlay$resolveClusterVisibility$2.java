package ru.yandex.taxi.layers.presentation;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.VisibleRegionUtils;
import defpackage.ah00;
import defpackage.dn00;
import defpackage.g6u;
import defpackage.gh00;
import defpackage.jse;
import defpackage.lm00;
import defpackage.lp00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qn00;
import defpackage.rn00;
import defpackage.tdp;
import defpackage.tls;
import defpackage.tm00;
import defpackage.tse;
import defpackage.um00;
import defpackage.vm00;
import defpackage.wls;
import defpackage.xm00;
import defpackage.ym00;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$resolveClusterVisibility$2", f = "MapObjectsOverlay.kt", l = {789, 778}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MapObjectsOverlay$resolveClusterVisibility$2 extends SuspendLambda implements wls {
    final /* synthetic */ CameraPosition $cameraPosition;
    final /* synthetic */ Set<String> $intersectedObjects;
    final /* synthetic */ Map<String, Set<String>> $mapObjectOverlaps;
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.layers.presentation.MapObjectsOverlay$resolveClusterVisibility$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            qn00 qn00Var = (qn00) ((rn00) this.receiver).a.get((MapObjectType) obj);
            if (qn00Var != null) {
                return qn00Var.b();
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.layers.presentation.MapObjectsOverlay$resolveClusterVisibility$2$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return f.Pg((f) this.receiver, (MapObjectType) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$resolveClusterVisibility$2(CameraPosition cameraPosition, Map map, Set set, Continuation continuation, f fVar) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$cameraPosition = cameraPosition;
        this.$mapObjectOverlaps = map;
        this.$intersectedObjects = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsOverlay$resolveClusterVisibility$2(this.$cameraPosition, this.$mapObjectOverlaps, this.$intersectedObjects, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsOverlay$resolveClusterVisibility$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ff, code lost:
    
        if (ru.yandex.taxi.layers.presentation.a.f(r11, r1, r2, r3, r0, r5, r6, r7, r8, r9, r10, r4, r17) == r13) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [tls] */
    /* JADX WARN: Type inference failed for: r5v22, types: [wls] */
    /* JADX WARN: Type inference failed for: r7v14, types: [jse] */
    /* JADX WARN: Type inference failed for: r9v5, types: [tls] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        AnonymousClass2 anonymousClass2;
        Object b;
        float f;
        BoundingBox boundingBox;
        c cVar;
        lp00 lp00Var;
        Map<String, Set<String>> map2;
        AnonymousClass1 anonymousClass1;
        boolean z;
        g6u g6uVar;
        xm00 xm00Var;
        ym00 b2;
        ym00 ym00Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.O.isEmpty()) {
                map = this.this$0.N;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(1, this.this$0.y, rn00.class, "getVisibleZoomRange", "getVisibleZoomRange(Lru/yandex/taxi/common_models/net/map_object/MapObjectType;)Lcom/yandex/go/layers/api/model/ZoomRange;", 0);
                float zoom = this.$cameraPosition.getZoom();
                f fVar = this.this$0;
                anonymousClass2 = new AnonymousClass2(1, fVar, f.class, "getOverrideIconScale", "getOverrideIconScale(Lru/yandex/taxi/common_models/net/map_object/MapObjectType;Lcom/yandex/mapkit/map/CameraPosition;)Ljava/lang/Float;", 0);
                BoundingBox bounds = VisibleRegionUtils.getBounds(((gh00) ((ah00) fVar.b)).e.f());
                f fVar2 = this.this$0;
                g6u g6uVar2 = fVar2.H;
                boolean z2 = fVar2.R;
                xm00 xm00Var2 = fVar2.M;
                c cVar2 = fVar2.c0;
                lp00 lp00Var2 = fVar2.w;
                Map<String, Set<String>> map3 = this.$mapObjectOverlaps;
                ru.yandex.taxi.favorites.address.api.experiment.a aVar = fVar2.E;
                this.L$0 = map;
                this.L$1 = anonymousClass12;
                this.L$2 = anonymousClass2;
                this.L$3 = bounds;
                this.L$4 = g6uVar2;
                this.L$5 = xm00Var2;
                this.L$6 = cVar2;
                this.L$7 = lp00Var2;
                this.L$8 = map3;
                this.F$0 = zoom;
                this.Z$0 = z2;
                this.label = 1;
                b = aVar.a.b(this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                f = zoom;
                boundingBox = bounds;
                cVar = cVar2;
                lp00Var = lp00Var2;
                map2 = map3;
                anonymousClass1 = anonymousClass12;
                z = z2;
                g6uVar = g6uVar2;
                xm00Var = xm00Var2;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f fVar3 = this.this$0;
            LinkedHashMap linkedHashMap = fVar3.O;
            Set<String> set = this.$intersectedObjects;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                lm00 lm00Var = (lm00) entry.getValue();
                lm00 lm00Var2 = (lm00) fVar3.N.get(str);
                if (lm00Var2 == null || (b2 = dn00.b(lm00Var2, MapObjectComponentType.BODY)) == null || !b2.g().b || set.contains(str) || !fVar3.N.keySet().contains(str)) {
                    Iterator it = lm00Var.f.iterator();
                    while (it.hasNext()) {
                        dn00.d((ym00) it.next());
                    }
                } else {
                    Set<ym00> set2 = lm00Var.f;
                    boolean z3 = (kotlin.collections.a.Q(set2) == null || (ym00Var = (ym00) kotlin.collections.a.Q(set2)) == null || !ym00Var.g().b) ? false : true;
                    for (ym00 ym00Var2 : set2) {
                        if (z3) {
                            Animation animation = dn00.a;
                            ym00Var2.g().i(true);
                        } else {
                            Animation animation2 = dn00.a;
                            vm00 animation3 = ym00Var2.getAnimation();
                            if (animation3 instanceof tm00) {
                                ym00Var2.g().j(true, dn00.a, null);
                            } else if (animation3 instanceof um00) {
                                dn00.f(ym00Var2.g(), true, (um00) ym00Var2.getAnimation());
                            } else {
                                ym00Var2.g().i(true);
                            }
                        }
                    }
                }
            }
            return zy11.a;
        }
        boolean z4 = this.Z$0;
        f = this.F$0;
        Map<String, Set<String>> map4 = (Map) this.L$8;
        lp00 lp00Var3 = (lp00) this.L$7;
        ?? r5 = (wls) this.L$6;
        xm00 xm00Var3 = (xm00) this.L$5;
        ?? r7 = (jse) this.L$4;
        BoundingBox boundingBox2 = (BoundingBox) this.L$3;
        ?? r9 = (tls) this.L$2;
        ?? r10 = (tls) this.L$1;
        map = (Map) this.L$0;
        kotlin.b.b(obj);
        z = z4;
        boundingBox = boundingBox2;
        cVar = r5;
        g6uVar = r7;
        xm00Var = xm00Var3;
        anonymousClass1 = r10;
        map2 = map4;
        anonymousClass2 = r9;
        lp00Var = lp00Var3;
        b = obj;
        boolean z5 = ((tdp) b).b;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.label = 2;
    }
}
