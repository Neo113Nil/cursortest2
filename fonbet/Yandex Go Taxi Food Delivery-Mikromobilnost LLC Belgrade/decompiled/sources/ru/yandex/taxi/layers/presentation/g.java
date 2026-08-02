package ru.yandex.taxi.layers.presentation;

import android.util.LruCache;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import defpackage.ad5;
import defpackage.f4c0;
import defpackage.gcc0;
import defpackage.h3y;
import defpackage.ike;
import defpackage.j22;
import defpackage.jq00;
import defpackage.k22;
import defpackage.lm00;
import defpackage.pzt0;
import defpackage.r76;
import defpackage.sl6;
import defpackage.sm00;
import defpackage.tje;
import defpackage.v35;
import defpackage.w511;
import defpackage.ym00;
import defpackage.zy11;
import java.util.Iterator;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;
import ru.yandex.taxi.layers.domain.o;

/* loaded from: classes9.dex */
public final class g extends ad5 {
    public final o A;
    public final gcc0 B;
    public final h3y C;
    public final com.yandex.go.layers.domain.g x;
    public final k22 y;
    public final ru.yandex.taxi.layers.domain.a z;

    public g(com.yandex.go.layers.domain.g gVar, k22 k22Var, ru.yandex.taxi.layers.domain.a aVar, o oVar, gcc0 gcc0Var, h3y h3yVar) {
        super(jq00.class);
        this.x = gVar;
        this.y = k22Var;
        this.z = aVar;
        this.A = oVar;
        this.B = gcc0Var;
        this.C = h3yVar;
    }

    public static boolean Kg(lm00 lm00Var) {
        Object obj;
        f4c0 g;
        Iterator it = lm00Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ym00) obj) instanceof sl6) {
                break;
            }
        }
        ym00 ym00Var = (ym00) obj;
        return (ym00Var == null || (g = ym00Var.g()) == null || !g.b) ? false : true;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        o oVar = this.A;
        pzt0 pzt0Var = oVar.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        oVar.n = null;
        pzt0 pzt0Var2 = oVar.p;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        oVar.p = null;
        oVar.b();
    }

    @Override // defpackage.zc5
    public final void Gg() {
        this.A.h((ike) Jg());
    }

    public final void Lg(boolean z, ym00 ym00Var, lm00 lm00Var) {
        g gVar;
        lm00 lm00Var2;
        LruCache lruCache;
        sm00 sm00Var = lm00Var.h;
        boolean Kg = Kg(lm00Var);
        MapObjectType mapObjectType = lm00Var.c;
        Object obj = null;
        if (z) {
            sm00 a = sm00.a(sm00Var, Kg);
            k22 k22Var = this.y;
            k22Var.getClass();
            v35 v35Var = (v35) ym00Var;
            int i = j22.a[v35Var.h().ordinal()];
            if (i == 1) {
                lruCache = (LruCache) k22Var.b.getValue();
            } else if (i == 2) {
                lruCache = (LruCache) k22Var.c.getValue();
            } else if (i == 3) {
                lruCache = (LruCache) k22Var.d.getValue();
            } else if (i != 4) {
                if (i != 5) {
                    w511.b();
                    return;
                }
                gVar = this;
                lm00Var2 = lm00Var;
                tje.N(Jg(), null, null, new MapObjectsPresenter$onMapObjectComponentShown$1(ym00Var, gVar, lm00Var2, Kg, null), 3);
            } else {
                lruCache = (LruCache) k22Var.e.getValue();
            }
            String str = lm00Var.a;
            if (lruCache.get(str) == null) {
                LayersAnalyticEventEmmiter layersAnalyticEventEmmiter = k22Var.a;
                MapObjectComponentType h = v35Var.h();
                ru.yandex.taxi.layers.a aVar = (ru.yandex.taxi.layers.a) layersAnalyticEventEmmiter.a.get(mapObjectType);
                if (aVar != null) {
                    aVar.a(str, h, LayersAnalyticEventEmmiter.Event.SHOWN, a);
                }
                lruCache.put(str + sm00Var.d(), zy11.a);
            }
            gVar = this;
            lm00Var2 = lm00Var;
            tje.N(Jg(), null, null, new MapObjectsPresenter$onMapObjectComponentShown$1(ym00Var, gVar, lm00Var2, Kg, null), 3);
        } else {
            gVar = this;
            lm00Var2 = lm00Var;
            sl6 sl6Var = ym00Var instanceof sl6 ? (sl6) ym00Var : null;
            if (sl6Var != null && sl6Var.i() == Bubble$BubbleKind.ADVERT) {
                Iterator it = lm00Var2.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ym00) next) instanceof r76) {
                        obj = next;
                        break;
                    }
                }
                ym00 ym00Var2 = (ym00) obj;
                if (ym00Var2 != null && ym00Var2.g().b) {
                    gVar.Lg(true, ym00Var2, lm00Var2);
                }
            }
        }
        if (mapObjectType == MapObjectType.ADVERT) {
            gVar.z.a(z, lm00Var2);
        }
    }
}
