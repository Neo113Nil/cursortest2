package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.f;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.s;
import com.yandex.go.intentprocessor.k;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.Map;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.taxi.analytics.m;

/* loaded from: classes9.dex */
public final class t300 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final Object j;
    public Object k;

    public t300(es00 es00Var) {
        this.a = 1;
        this.b = es00Var;
        this.d = new ds00(this);
        this.e = new CameraListener() { // from class: bs00
            @Override // com.yandex.mapkit.map.CameraListener
            public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
                t300 t300Var = t300.this;
                ((es00) t300Var.b).c = cameraPosition;
                ((es00) t300Var.b).e = Long.valueOf(System.currentTimeMillis());
                Iterator it = ((CopyOnWriteArraySet) t300Var.i).iterator();
                while (it.hasNext()) {
                    ((hr7) it.next()).h(((es00) t300Var.b).c, cameraUpdateReason, z);
                }
            }
        };
        this.f = new ol00(1, this);
        this.g = new cs00(this);
        this.h = new CopyOnWriteArraySet();
        this.i = new CopyOnWriteArraySet();
        this.j = new CopyOnWriteArraySet();
        this.k = new CopyOnWriteArraySet();
    }

    public static final void a(t300 t300Var, e530 e530Var, s sVar) {
        for (e530 parent$ui = e530Var.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (parent$ui == ((yd60) t300Var.c)) {
                LayoutNode s = ((LayoutNode) t300Var.b).s();
                sVar.K = s != null ? (f) s.a0.d : null;
                t300Var.e = sVar;
                return;
            } else {
                if ((parent$ui.getKindSet$ui() & 2) != 0) {
                    return;
                }
                parent$ui.updateCoordinator$ui(sVar);
            }
        }
    }

    public static e530 b(d530 d530Var, e530 e530Var) {
        e530 e530Var2;
        if (d530Var instanceof j530) {
            e530Var2 = ((j530) d530Var).a();
            e530Var2.setKindSet$ui(ce60.g(e530Var2));
        } else {
            b bVar = new b();
            bVar.setKindSet$ui(ce60.e(d530Var));
            bVar.a = d530Var;
            bVar.b = new HashSet();
            e530Var2 = bVar;
        }
        if (e530Var2.isAttached()) {
            ixv.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        e530Var2.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        e530 child$ui = e530Var.getChild$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(e530Var2);
            e530Var2.setChild$ui(child$ui);
        }
        e530Var.setChild$ui(e530Var2);
        e530Var2.setParent$ui(e530Var);
        return e530Var2;
    }

    public static e530 d(e530 e530Var) {
        if (e530Var.isAttached()) {
            qy40 qy40Var = ce60.a;
            if (!e530Var.isAttached()) {
                ixv.b("autoInvalidateRemovedNode called on unattached node");
            }
            ce60.b(e530Var, -1, 2);
            e530Var.runDetachLifecycle$ui();
            e530Var.markAsDetached$ui();
        }
        e530 child$ui = e530Var.getChild$ui();
        e530 parent$ui = e530Var.getParent$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(parent$ui);
            e530Var.setChild$ui(null);
        }
        if (parent$ui != null) {
            parent$ui.setChild$ui(child$ui);
            e530Var.setParent$ui(null);
        }
        return parent$ui;
    }

    public static void i(d530 d530Var, d530 d530Var2, e530 e530Var) {
        if ((d530Var instanceof j530) && (d530Var2 instanceof j530)) {
            ((j530) d530Var2).f(e530Var);
            if (e530Var.isAttached()) {
                ce60.d(e530Var);
                return;
            } else {
                e530Var.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(e530Var instanceof b)) {
            ixv.b("Unknown Modifier.Node type");
            return;
        }
        b bVar = (b) e530Var;
        if (bVar.isAttached()) {
            bVar.F0();
        }
        bVar.a = d530Var2;
        bVar.setKindSet$ui(ce60.e(d530Var2));
        if (bVar.isAttached()) {
            bVar.E0(false);
        }
        if (e530Var.isAttached()) {
            ce60.d(e530Var);
        } else {
            e530Var.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    public void c() {
        Map map = (Map) this.c;
        if (map != null) {
            map.removeInertiaMoveListener((cs00) this.g);
        }
        Map map2 = (Map) this.c;
        if (map2 != null) {
            map2.removeCameraListener((bs00) this.e);
        }
        Map map3 = (Map) this.c;
        if (map3 != null) {
            map3.removeInputListener((ds00) this.d);
        }
        Map map4 = (Map) this.c;
        if (map4 != null) {
            map4.removeTapListener((ol00) this.f);
        }
        Map map5 = (Map) this.c;
        if (map5 != null) {
            map5.setMapLoadedListener(null);
        }
        this.c = null;
    }

    public boolean e(int i) {
        return (((e530) this.g).getAggregateChildKindSet$ui() & i) != 0;
    }

    public void f() {
        for (e530 e530Var = (e530) this.g; e530Var != null; e530Var = e530Var.getChild$ui()) {
            e530Var.runAttachLifecycle$ui();
            if (e530Var.getInsertedNodeAwaitingAttachForInvalidation$ui()) {
                ce60.a(e530Var);
            }
            if (e530Var.getUpdatedNodeAwaitingAttachForInvalidation$ui()) {
                ce60.d(e530Var);
            }
            e530Var.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            e530Var.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    public void g(int i, wz40 wz40Var, wz40 wz40Var2, e530 e530Var, boolean z) {
        t300 t300Var;
        int i2;
        wz40 wz40Var3;
        wz40 wz40Var4;
        qz40 qz40Var = (qz40) this.k;
        if (qz40Var == null) {
            t300Var = this;
            i2 = i;
            wz40Var3 = wz40Var;
            wz40Var4 = wz40Var2;
            qz40 qz40Var2 = new qz40(t300Var, e530Var, i2, wz40Var3, wz40Var4, z);
            t300Var.k = qz40Var2;
            qz40Var = qz40Var2;
        } else {
            t300Var = this;
            i2 = i;
            wz40Var3 = wz40Var;
            wz40Var4 = wz40Var2;
            qz40Var.p(e530Var);
            qz40Var.q(i2);
            qz40Var.n(wz40Var3);
            qz40Var.m(wz40Var4);
            qz40Var.r(z);
        }
        grb1.a(wz40Var3.c - i2, wz40Var4.c - i2, qz40Var);
        int i3 = 0;
        for (e530 parent$ui = ((v7x0) t300Var.f).getParent$ui(); parent$ui != null && parent$ui != ((yd60) t300Var.c); parent$ui = parent$ui.getParent$ui()) {
            i3 |= parent$ui.getKindSet$ui();
            parent$ui.setAggregateChildKindSet$ui(i3);
        }
    }

    public void h() {
        g gVar;
        LayoutNode layoutNode = (LayoutNode) this.b;
        s sVar = (f) this.d;
        for (e530 e530Var = ((v7x0) this.f).getParent$ui(); e530Var != null; e530Var = e530Var.getParent$ui()) {
            v0y d = qje.d(e530Var);
            if (d != null) {
                if (e530Var.getCoordinator$ui() != null) {
                    g gVar2 = (g) e530Var.getCoordinator$ui();
                    v0y v0yVar = gVar2.q0;
                    gVar2.E1(d);
                    gVar = gVar2;
                    if (v0yVar != e530Var) {
                        j390 j390Var = gVar2.h0;
                        gVar = gVar2;
                        if (j390Var != null) {
                            j390Var.invalidate();
                            gVar = gVar2;
                        }
                    }
                } else {
                    g gVar3 = new g(layoutNode, d);
                    e530Var.updateCoordinator$ui(gVar3);
                    gVar = gVar3;
                }
                sVar.K = gVar;
                gVar.J = sVar;
                sVar = gVar;
            } else {
                e530Var.updateCoordinator$ui(sVar);
            }
        }
        LayoutNode s = layoutNode.s();
        sVar.K = s != null ? (f) s.a0.d : null;
        this.e = sVar;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[");
                e530 e530Var = (e530) this.g;
                v7x0 v7x0Var = (v7x0) this.f;
                if (e530Var == v7x0Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (e530Var != null && e530Var != v7x0Var) {
                            sb.append(String.valueOf(e530Var));
                            if (e530Var.getChild$ui() == v7x0Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                e530Var = e530Var.getChild$ui();
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t300(tse tseVar, xw91 xw91Var, mhf mhfVar, h3y h3yVar, k kVar, azz0 azz0Var, ru.yandex.taxi.activity.g gVar, h3y h3yVar2, m mVar, x300 x300Var, w7j0 w7j0Var) {
        this.a = 0;
        this.b = tseVar;
        this.c = mhfVar;
        this.d = h3yVar;
        this.f = kVar;
        this.g = azz0Var;
        this.h = gVar;
        this.e = h3yVar2;
        this.i = mVar;
        this.j = x300Var;
        this.k = w7j0Var;
    }

    public t300(h3y h3yVar, h3y h3yVar2, sxr0 sxr0Var, pzr0 pzr0Var, v3w0 v3w0Var, dz70 dz70Var, zzr0 zzr0Var, h1s0 h1s0Var, p1s0 p1s0Var, s1s0 s1s0Var, e eVar) {
        this.a = 3;
        this.d = h3yVar;
        this.e = h3yVar2;
        this.b = sxr0Var;
        this.c = pzr0Var;
        this.f = v3w0Var;
        this.g = dz70Var;
        this.h = zzr0Var;
        this.i = h1s0Var;
        this.j = p1s0Var;
        this.k = s1s0Var;
    }

    public t300(LayoutNode layoutNode) {
        this.a = 2;
        this.b = layoutNode;
        yd60 yd60Var = new yd60();
        yd60Var.setAggregateChildKindSet$ui(-1);
        this.c = yd60Var;
        f fVar = new f(layoutNode);
        this.d = fVar;
        this.e = fVar;
        v7x0 v7x0Var = fVar.q0;
        this.f = v7x0Var;
        this.g = v7x0Var;
        this.j = new wz40(new f530[16]);
    }
}
