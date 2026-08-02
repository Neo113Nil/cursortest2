package ru.yandex.taxi.map_common;

import defpackage.a4e0;
import defpackage.ah00;
import defpackage.aj0;
import defpackage.axy;
import defpackage.ayx;
import defpackage.b1c;
import defpackage.b3e0;
import defpackage.b8w;
import defpackage.c4e0;
import defpackage.c660;
import defpackage.c8w;
import defpackage.cnt;
import defpackage.cp00;
import defpackage.dnc;
import defpackage.ee;
import defpackage.etx;
import defpackage.f5e0;
import defpackage.g3p;
import defpackage.g970;
import defpackage.gb0;
import defpackage.gd;
import defpackage.gh00;
import defpackage.hyx;
import defpackage.i5e0;
import defpackage.i5m;
import defpackage.i6r;
import defpackage.icc0;
import defpackage.ike;
import defpackage.isu;
import defpackage.jk0;
import defpackage.jm00;
import defpackage.jqz0;
import defpackage.lcw;
import defpackage.m2g;
import defpackage.m9a0;
import defpackage.md1;
import defpackage.mvg;
import defpackage.my0;
import defpackage.n2g;
import defpackage.n3w;
import defpackage.n6o0;
import defpackage.nf;
import defpackage.nup0;
import defpackage.ny61;
import defpackage.ove;
import defpackage.pl;
import defpackage.pl00;
import defpackage.pq00;
import defpackage.pw;
import defpackage.q3e0;
import defpackage.ql00;
import defpackage.qsn;
import defpackage.qzb;
import defpackage.r10;
import defpackage.tje;
import defpackage.tr3;
import defpackage.tse;
import defpackage.tt00;
import defpackage.u4e0;
import defpackage.v7p;
import defpackage.wls;
import defpackage.x4;
import defpackage.xcz;
import defpackage.xsd0;
import defpackage.xsi;
import defpackage.xvf0;
import defpackage.xyd0;
import defpackage.y2r0;
import defpackage.ysd0;
import defpackage.zp60;
import defpackage.zw30;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.domain.o;
import ru.yandex.taxi.layers.domain.z;
import ru.yandex.taxi.layers.e;
import ru.yandex.taxi.layers.presentation.MapObjectsPresenter$attachView$$inlined$safeCollectIn$1;
import ru.yandex.taxi.layers.presentation.PolygonsPresenter$attachView$$inlined$collectIn$1;
import ru.yandex.taxi.layers.presentation.f;
import ru.yandex.taxi.layers.presentation.g;
import ru.yandex.taxi.layers.presentation.h;
import ru.yandex.taxi.layers.presentation.i;
import ru.yandex.taxi.layers.presentation.mapnotification.d;
import ru.yandex.taxi.map_common.map.MapViewInflateStrategy;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.LayersActivityLifecycleListener$onFirstContentfulPaint$1", f = "LayersActivityLifecycleListener.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LayersActivityLifecycleListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActivityLifecycleListener$onFirstContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LayersActivityLifecycleListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActivityLifecycleListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        LayersActivityLifecycleListener$onFirstContentfulPaint$1 layersActivityLifecycleListener$onFirstContentfulPaint$1 = this;
        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = layersActivityLifecycleListener$onFirstContentfulPaint$1.label;
        Object obj5 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj5;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.layers.b bVar = (ru.yandex.taxi.layers.b) layersActivityLifecycleListener$onFirstContentfulPaint$1.this$0.d.get();
        r0 r0Var = bVar.j;
        while (true) {
            Object value = r0Var.getValue();
            if (((Boolean) value).booleanValue()) {
                obj2 = obj4;
                obj3 = obj5;
                break;
            }
            i6r i6rVar = bVar.b;
            ysd0 ysd0Var = bVar.a;
            e eVar = (e) bVar.c.get();
            i6rVar.getClass();
            ysd0Var.getClass();
            eVar.getClass();
            m2g m2gVar = new m2g(i6rVar, 6);
            n2g n2gVar = new n2g(i6rVar, 8);
            m2g m2gVar2 = new m2g(i6rVar, 0);
            m2g m2gVar3 = new m2g(i6rVar, 19);
            xvf0 b = i5m.b(new gd(new m2g(i6rVar, 20), 12));
            aj0 aj0Var = new aj0(new n2g(i6rVar, 19), new m2g(i6rVar, 12), m2gVar3, 4);
            m2g m2gVar4 = new m2g(i6rVar, 1);
            m2g m2gVar5 = new m2g(i6rVar, 11);
            n2g n2gVar2 = new n2g(i6rVar, 18);
            gd gdVar = new gd(new nf(m2gVar2, m2gVar, 23), 29);
            qzb qzbVar = new qzb(b1c.a, 1);
            m2g m2gVar6 = new m2g(i6rVar, 23);
            ove oveVar = new ove((xvf0) n2gVar2, (xvf0) gdVar, (xvf0) qzbVar, (xvf0) m2gVar6, (xvf0) new g970(new n2g(i6rVar, 17), 1), 26);
            m2g m2gVar7 = new m2g(i6rVar, 8);
            m2g m2gVar8 = new m2g(i6rVar, 13);
            m2g m2gVar9 = new m2g(i6rVar, 17);
            n2g n2gVar3 = new n2g(i6rVar, 14);
            n2g n2gVar4 = new n2g(i6rVar, 13);
            m2g m2gVar10 = new m2g(i6rVar, 3);
            m2g m2gVar11 = new m2g(i6rVar, 21);
            n3w a = n3w.a(eVar);
            zp60 zp60Var = new zp60(m2gVar8, m2gVar9, n2gVar3, n2gVar4, m2gVar10, n2gVar2, m2gVar11, m2gVar2, a, 0);
            m2g m2gVar12 = new m2g(i6rVar, 26);
            m2g m2gVar13 = new m2g(i6rVar, 2);
            m2g m2gVar14 = new m2g(i6rVar, 9);
            xvf0 b2 = i5m.b(new ru.yandex.taxi.layers.di.a(m2gVar13, new ayx(m2gVar14, 2)));
            xvf0 b3 = i5m.b(new zw30((v7p) zp60Var, (xvf0) m2gVar12, b2, 7));
            n2g n2gVar5 = new n2g(i6rVar, 10);
            m2g m2gVar15 = new m2g(i6rVar, 5);
            n2g n2gVar6 = new n2g(i6rVar, 9);
            m2g m2gVar16 = new m2g(i6rVar, 15);
            etx etxVar = new etx(m2gVar16, new n2g(i6rVar, 15), 2);
            m2g m2gVar17 = new m2g(i6rVar, 4);
            x4 x4Var = new x4((xvf0) m2gVar15, (xvf0) m2gVar2, (xvf0) n2gVar6, (xvf0) etxVar, (xvf0) new nf(m2gVar15, m2gVar17, 21), (xvf0) n2gVar2, 12);
            n2g n2gVar7 = new n2g(i6rVar, 11);
            c660 c660Var = new c660(m2gVar15, 5);
            c8w c8wVar = new c8w((xvf0) m2gVar15, (xvf0) m2gVar2, (xvf0) n2gVar6, (xvf0) n2gVar7, (xvf0) c660Var, (xvf0) new m2g(i6rVar, 18), 1);
            m2g m2gVar18 = new m2g(i6rVar, 10);
            md1 md1Var = new md1(m2gVar15, m2gVar2, m2gVar18, etxVar, n2gVar6, n2gVar2, m2gVar17);
            pw pwVar = new pw(m2gVar15, m2gVar2, n2gVar6, m2gVar18, etxVar, new r10(m2gVar15, m2gVar17, n2gVar7, new n2g(i6rVar, 5), c660Var, 13), n2gVar2, 8);
            obj2 = obj4;
            obj3 = obj5;
            r0 r0Var2 = r0Var;
            zw30 zw30Var = new zw30(m2gVar15, n2gVar6, m2gVar18, 11);
            xsi xsiVar = new xsi(m2gVar2, etxVar, n2gVar6, 23);
            n3w n3wVar = y2r0.c;
            ArrayList arrayList = new ArrayList(6);
            List list = Collections.EMPTY_LIST;
            arrayList.add(x4Var);
            arrayList.add(c8wVar);
            arrayList.add(md1Var);
            arrayList.add(pwVar);
            arrayList.add(zw30Var);
            arrayList.add(xsiVar);
            xvf0 b4 = i5m.b(new axy(n2gVar5, m2gVar8, m2gVar2, new b8w(new y2r0(arrayList, list), new ayx(m2gVar14, 1), 22), new n2g(i6rVar, 20), 10));
            nup0 nup0Var = new nup0(new n2g(i6rVar, 12), 3);
            n2g n2gVar8 = new n2g(i6rVar, 4);
            m2g m2gVar19 = new m2g(i6rVar, 22);
            g3p g3pVar = new g3p(n2gVar8, m2gVar19, 29);
            n2g n2gVar9 = new n2g(i6rVar, 7);
            pl plVar = new pl(m2gVar2, m2gVar4, m2gVar5, oveVar, m2gVar6, gdVar, m2gVar7, b3, b4, nup0Var, b2, g3pVar, n2gVar9, m2gVar19);
            m2g m2gVar20 = new m2g(i6rVar, 14);
            n2g n2gVar10 = new n2g(i6rVar, 16);
            m2g m2gVar21 = new m2g(i6rVar, 27);
            jqz0 jqz0Var = new jqz0(m2gVar14, 23);
            xvf0 b5 = i5m.b(new cnt(new m2g(i6rVar, 24), 29));
            xvf0 b6 = i5m.b(new qsn(new m2g(i6rVar, 25), 2));
            ArrayList arrayList2 = new ArrayList(2);
            List list2 = Collections.EMPTY_LIST;
            arrayList2.add(isu.a);
            arrayList2.add(dnc.a);
            tr3 tr3Var = new tr3(new y2r0(arrayList2, list2), 2);
            n2g n2gVar11 = new n2g(i6rVar, 6);
            xvf0 b7 = i5m.b(new my0(m2gVar, n2gVar, m2gVar2, new c8w(m2gVar3, b, aj0Var, new pl(m2gVar3, plVar, n2gVar8, m2gVar20, nup0Var, n2gVar10, m2gVar21, jqz0Var, b5, b6, tr3Var, m2gVar7, n2gVar11, n2gVar2), n2gVar11, new n2g(i6rVar, 0)), new m2g(i6rVar, 16), b2, new m2g(i6rVar, 29), new md1(m2gVar15, m2gVar2, m2gVar18, etxVar, m2gVar17, n2gVar6, n2gVar2), new ee(m2gVar15, m2gVar17, n2gVar6, n2gVar2, 10), new ayx(m2gVar14, 0), new gd(n2gVar6, 7), cp00.a, new n2g(i6rVar, 21)));
            xvf0 b8 = i5m.b(new zw30(m2gVar, n2gVar, new zw30(new gb0(m2gVar4, m2gVar5, oveVar, m2gVar6, gdVar, m2gVar7, m2gVar2, new m9a0(m2gVar15, new n2g(i6rVar, 2), new n2g(i6rVar, 1), m2gVar18, b2), i5m.b(new icc0(new zp60(m2gVar8, n2gVar3, m2gVar9, n2gVar4, m2gVar10, n2gVar2, m2gVar11, m2gVar2, a), b2, 9, false)), i5m.b(b3e0.a)), i5m.b(new icc0(m2gVar2, n3w.a(ysd0Var), 8)), i5m.b(q3e0.a), 27, false), 26));
            xvf0 b9 = i5m.b(new jk0(m2gVar4, m2gVar5, oveVar, m2gVar6, gdVar, m2gVar7, m2gVar2, new xyd0(b2, 1), i5m.b(new icc0(new zp60(m2gVar8, m2gVar9, n2gVar3, n2gVar4, m2gVar10, n2gVar2, m2gVar11, m2gVar2, a, 2), b2, 11, false)), f5e0.a, n2gVar9));
            xvf0 b10 = i5m.b(new icc0(m2gVar, new xyd0(b9, 2), 10));
            xvf0 b11 = i5m.b(new xcz((xvf0) m2gVar15, (xvf0) new m2g(i6rVar, 7), (xvf0) new n2g(i6rVar, 3), i5m.b(new axy(m2gVar2, new b8w(m2gVar16, m2gVar18, 21), m2gVar12, new m2g(i6rVar, 28), i5m.b(jm00.a))), 5, false));
            lcw lcwVar = new lcw(n2gVar5, m2gVar, b3, b9, m2gVar3, new n6o0(m2gVar14, 18), u4e0.a);
            f fVar = (f) b7.get();
            g gVar = fVar.c;
            gVar.Bg(fVar);
            o oVar = gVar.A;
            tje.N(gVar.Jg(), null, null, new MapObjectsPresenter$attachView$$inlined$safeCollectIn$1(oVar.i.d, null, gVar), 3);
            oVar.g((ike) gVar.Jg());
            ru.yandex.taxi.layers.domain.a aVar = gVar.z;
            aVar.a.c(aVar.b.a);
            ((gh00) ((ah00) fVar.b)).e(fVar.b0);
            fVar.K.a();
            bVar.f = fVar;
            a4e0 a4e0Var = (a4e0) b8.get();
            c4e0 c4e0Var = a4e0Var.c;
            c4e0Var.Bg(new h(a4e0Var));
            tje.N(c4e0Var.Jg(), null, null, new PolygonsPresenter$attachView$$inlined$collectIn$1(c4e0Var.y.c, null, c4e0Var), 3);
            ((gh00) ((ah00) a4e0Var.b)).e(a4e0Var.A);
            a4e0Var.x.g(a4e0Var.B);
            bVar.g = a4e0Var;
            i iVar = (i) b10.get();
            iVar.c.Bg(new i5e0(iVar));
            ((gh00) ((ah00) iVar.b)).e(iVar.y);
            bVar.h = iVar;
            d dVar = (d) b11.get();
            dVar.a();
            bVar.i = dVar;
            ((z) bVar.e.get()).a();
            hyx hyxVar = (hyx) bVar.d.get();
            Iterator it = ((Iterable) hyxVar.g.get()).iterator();
            while (it.hasNext()) {
                ((pq00) it.next()).d(lcwVar);
            }
            for (Map.Entry entry : ((Map) hyxVar.f.get()).entrySet()) {
                ((b) ((ysd0) hyxVar.d.get())).a((Class) entry.getKey(), (xsd0) entry.getValue());
            }
            ql00 ql00Var = (ql00) hyxVar.b.get();
            ((gh00) ((ah00) ql00Var.b)).c(ql00Var.w);
            ql00Var.c.Bg(new pl00());
            if (r0Var2.k(value, Boolean.TRUE)) {
                layersActivityLifecycleListener$onFirstContentfulPaint$1 = this;
                break;
            }
            layersActivityLifecycleListener$onFirstContentfulPaint$1 = this;
            r0Var = r0Var2;
            obj4 = obj2;
            obj5 = obj3;
        }
        tt00 tt00Var = (tt00) layersActivityLifecycleListener$onFirstContentfulPaint$1.this$0.e.get();
        MapViewInflateStrategy mapViewInflateStrategy = MapViewInflateStrategy.OnCreate;
        layersActivityLifecycleListener$onFirstContentfulPaint$1.label = 1;
        tt00Var.a(mapViewInflateStrategy);
        Object obj6 = obj2;
        Object obj7 = obj3;
        return obj7 == obj6 ? obj6 : obj7;
    }
}
