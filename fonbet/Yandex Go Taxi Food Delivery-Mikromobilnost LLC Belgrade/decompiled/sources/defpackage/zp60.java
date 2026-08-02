package defpackage;

import com.yandex.go.taxi.tariffs.repository.g;
import ru.yandex.taxi.layers.api.LayersApi;
import ru.yandex.taxi.layers.e;
import ru.yandex.taxi.layers.source.f;
import ru.yandex.taxi.layers.source.l;
import ru.yandex.taxi.layers.source.n;

/* loaded from: classes9.dex */
public final class zp60 implements v7p {
    public final /* synthetic */ int a;
    public final m2g b;
    public final n2g c;
    public final m2g d;
    public final n2g e;
    public final m2g f;
    public final n2g g;
    public final m2g h;
    public final m2g i;
    public final n3w j;

    public zp60(m2g m2gVar, n2g n2gVar, m2g m2gVar2, n2g n2gVar2, m2g m2gVar3, n2g n2gVar3, m2g m2gVar4, m2g m2gVar5, n3w n3wVar) {
        this.a = 1;
        this.b = m2gVar;
        this.c = n2gVar;
        this.d = m2gVar2;
        this.e = n2gVar2;
        this.f = m2gVar3;
        this.g = n2gVar3;
        this.h = m2gVar4;
        this.i = m2gVar5;
        this.j = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        n3w n3wVar = this.j;
        m2g m2gVar = this.i;
        m2g m2gVar2 = this.h;
        n2g n2gVar = this.g;
        m2g m2gVar3 = this.f;
        n2g n2gVar2 = this.e;
        n2g n2gVar3 = this.c;
        m2g m2gVar4 = this.d;
        m2g m2gVar5 = this.b;
        switch (i) {
            case 0:
                wnt wntVar = (wnt) m2gVar5.get();
                nmx nmxVar = (nmx) m2gVar4.get();
                wiq0 wiq0Var = (wiq0) n2gVar3.get();
                g gVar = (g) n2gVar2.get();
                return new f((tt2) m2gVar.get(), (wd7) m2gVar3.get(), wntVar, nmxVar, wiq0Var, (pwy0) n2gVar.get(), gVar, (e) n3wVar.a, (LayersApi) m2gVar2.get());
            case 1:
                wnt wntVar2 = (wnt) m2gVar5.get();
                wiq0 wiq0Var2 = (wiq0) n2gVar3.get();
                nmx nmxVar2 = (nmx) m2gVar4.get();
                g gVar2 = (g) n2gVar2.get();
                return new l((tt2) m2gVar.get(), (wd7) m2gVar3.get(), wntVar2, nmxVar2, wiq0Var2, (pwy0) n2gVar.get(), gVar2, (e) n3wVar.a, (LayersApi) m2gVar2.get());
            default:
                wnt wntVar3 = (wnt) m2gVar5.get();
                nmx nmxVar3 = (nmx) m2gVar4.get();
                wiq0 wiq0Var3 = (wiq0) n2gVar3.get();
                g gVar3 = (g) n2gVar2.get();
                return new n((tt2) m2gVar.get(), (wd7) m2gVar3.get(), wntVar3, nmxVar3, wiq0Var3, (pwy0) n2gVar.get(), gVar3, (e) n3wVar.a, (LayersApi) m2gVar2.get());
        }
    }

    public /* synthetic */ zp60(m2g m2gVar, m2g m2gVar2, n2g n2gVar, n2g n2gVar2, m2g m2gVar3, n2g n2gVar3, m2g m2gVar4, m2g m2gVar5, n3w n3wVar, int i) {
        this.a = i;
        this.b = m2gVar;
        this.d = m2gVar2;
        this.c = n2gVar;
        this.e = n2gVar2;
        this.f = m2gVar3;
        this.g = n2gVar3;
        this.h = m2gVar4;
        this.i = m2gVar5;
        this.j = n3wVar;
    }
}
