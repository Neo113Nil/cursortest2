package ru.yandex.taxi.layers.presentation;

import defpackage.ap00;
import defpackage.bp00;
import defpackage.f4c0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lcv;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pp60;
import defpackage.r76;
import defpackage.sl6;
import defpackage.t090;
import defpackage.tls;
import defpackage.v35;
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
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$commit$1", f = "MapObjectsOverlay.kt", l = {186}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$commit$1 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, lm00> $nextMapObjects;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$commit$1(f fVar, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$nextMapObjects = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$commit$1(this.this$0, this.$nextMapObjects, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MapObjectsOverlay$commit$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set;
        Object obj2;
        ym00 ym00Var;
        Object obj3;
        Object obj4;
        Object obj5;
        Set set2;
        Object obj6;
        lm00 lm00Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            boolean isEmpty = fVar.N.isEmpty();
            Map<String, lm00> map = this.$nextMapObjects;
            if (!isEmpty) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                for (Map.Entry entry : this.this$0.N.entrySet()) {
                    String str = (String) entry.getKey();
                    if (((lm00) entry.getValue()).g && (lm00Var = (lm00) linkedHashMap.get(str)) != null) {
                        lm00Var.g = true;
                    }
                }
                f fVar2 = this.this$0;
                bp00 bp00Var = fVar2.D;
                xm00 xm00Var = fVar2.M;
                Map map2 = fVar2.N;
                bp00Var.getClass();
                Iterator it = xm00Var.n().iterator();
                while (it.hasNext()) {
                    ap00 ap00Var = (ap00) it.next();
                    Object obj7 = ap00Var.d;
                    if (!(obj7 instanceof pp60)) {
                        obj7 = null;
                    }
                    pp60 pp60Var = (pp60) obj7;
                    if (pp60Var == null) {
                        pp60Var = new pp60();
                        ap00Var.h(pp60Var);
                    }
                    ym00 d = pp60Var.d();
                    f4c0 f4c0Var = ap00Var instanceof f4c0 ? (f4c0) ap00Var : null;
                    if (f4c0Var == null || f4c0Var.p()) {
                        if (d == null) {
                            ap00Var.d();
                            g8e.A(jst.e, "Placemark does not have a MapObjectComponent");
                        } else {
                            String e = d.e();
                            lm00 lm00Var2 = (lm00) linkedHashMap.get(e);
                            lm00 lm00Var3 = (lm00) map2.get(e);
                            if (lm00Var2 != null) {
                                Set set3 = lm00Var2.f;
                                if (d instanceof r76) {
                                    Iterator it2 = set3.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj6 = null;
                                            break;
                                        }
                                        obj6 = it2.next();
                                        ym00 ym00Var2 = (ym00) obj6;
                                        if ((ym00Var2 instanceof r76) && jl40.l(((r76) d).i(), ((r76) ym00Var2).i())) {
                                            break;
                                        }
                                    }
                                    ym00Var = (ym00) obj6;
                                } else if (d instanceof sl6) {
                                    Iterator it3 = set3.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = it3.next();
                                        ym00 ym00Var3 = (ym00) obj5;
                                        if ((ym00Var3 instanceof sl6) && jl40.l(((sl6) d).k(), ((sl6) ym00Var3).k())) {
                                            break;
                                        }
                                    }
                                    ym00Var = (ym00) obj5;
                                } else if (d instanceof t090) {
                                    Iterator it4 = set3.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = it4.next();
                                        ym00 ym00Var4 = (ym00) obj4;
                                        if ((ym00Var4 instanceof t090) && jl40.l(((t090) d).i(), ((t090) ym00Var4).i())) {
                                            break;
                                        }
                                    }
                                    ym00Var = (ym00) obj4;
                                } else if (d instanceof lcv) {
                                    Iterator it5 = set3.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it5.next();
                                        ym00 ym00Var5 = (ym00) obj3;
                                        if ((ym00Var5 instanceof lcv) && jl40.l(((lcv) d).i(), ((lcv) ym00Var5).i())) {
                                            break;
                                        }
                                    }
                                    ym00Var = (ym00) obj3;
                                } else {
                                    Iterator it6 = set3.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it6.next();
                                        if (((v35) d).h() == ((v35) ((ym00) obj2)).h()) {
                                            break;
                                        }
                                    }
                                    ym00Var = (ym00) obj2;
                                }
                                if (ym00Var == null) {
                                    ap00Var.d();
                                    if (lm00Var3 != null && (set2 = lm00Var3.f) != null) {
                                        set2.remove(d);
                                    }
                                } else {
                                    f4c0 f4c0Var2 = (f4c0) ap00Var;
                                    f4c0Var2.o(ym00Var.g().m());
                                    ym00Var.d(f4c0Var2);
                                }
                            } else if (jl40.l(e, "selected_organizations_pin")) {
                                ap00Var.d();
                                if (lm00Var3 != null && (set = lm00Var3.f) != null) {
                                    set.remove(d);
                                }
                            } else if (lm00Var3 == null || !lm00Var3.g || lm00Var3.c == MapObjectType.DRIVE) {
                                ap00Var.d();
                            }
                        }
                    }
                }
                map = linkedHashMap;
            }
            fVar.N = map;
            if (!this.this$0.N.containsKey("selected_organizations_pin")) {
                f.Jg(this.this$0, "selected_organizations_pin");
            }
            f fVar3 = this.this$0;
            this.label = 1;
            if (f.Kg(fVar3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
