package c0;

import a0.a0;
import a0.l;
import a0.u;
import ac.o;
import android.view.View;
import bd.c0;
import bd.e0;
import bd.t;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.display.impl.n;
import hc.j;
import i0.p;
import m0.a2;
import m0.d2;
import m0.t1;
import m0.u2;
import org.fortheloss.st.R;
import r1.r;
import rd.d0;
import u.l0;
import w0.q;
import x.h0;
import x.k1;
import x.s0;
import x.v;
import y.i;
import y1.h1;
import y1.x1;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1182g;

    /* renamed from: h, reason: collision with root package name */
    public int f1183h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1184i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1185j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1182g = i10;
        this.f1185j = obj;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f1182g) {
            case 0:
                return new d((f) this.f1184i, (l) this.f1185j, dVar, 0);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d dVar2 = new d((bd.f) this.f1185j, dVar, 1);
                dVar2.f1184i = obj;
                return dVar2;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new d((d2.d) this.f1184i, (Runnable) this.f1185j, dVar, 2);
            case 3:
                d dVar3 = new d((p) this.f1185j, dVar, 3);
                dVar3.f1184i = obj;
                return dVar3;
            case 4:
                return new d((u) this.f1184i, (v.h) this.f1185j, dVar, 4);
            case 5:
                return new d((i) this.f1184i, (q) this.f1185j, dVar, 5);
            case 6:
                return new d((bd.e) this.f1184i, (t1) this.f1185j, dVar, 6);
            case 7:
                return new d((d0) this.f1184i, (qd.l) this.f1185j, dVar, 7);
            case 8:
                return new d((vd.q) this.f1184i, (qd.l) this.f1185j, dVar, 8);
            case 9:
                return new d((i) this.f1184i, (y.f) this.f1185j, dVar, 9);
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return new d((i) this.f1184i, (y.g) this.f1185j, dVar, 10);
            case 11:
                d dVar4 = new d((w.q) this.f1185j, dVar, 11);
                dVar4.f1184i = obj;
                return dVar4;
            case 12:
                d dVar5 = new d((w.g) this.f1185j, dVar, 12);
                dVar5.f1184i = obj;
                return dVar5;
            case 13:
                d dVar6 = new d((s0) this.f1185j, dVar, 13);
                dVar6.f1184i = obj;
                return dVar6;
            case 14:
                return new d((d2) this.f1184i, (View) this.f1185j, dVar, 14);
            default:
                return new d((c0) this.f1184i, (h1) this.f1185j, dVar, 15);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1182g) {
            case 0:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((d) create(obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 3:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 4:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 5:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 6:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 7:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 8:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 9:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 11:
                return ((d) create((r) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 12:
                return ((d) create((r) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 13:
                return ((d) create((r) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            case 14:
                return ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
            default:
                ((d) create((y) obj, (fc.d) obj2)).invokeSuspend(o.f277a);
                return gc.a.f2559g;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        Object i10;
        int i11 = this.f1182g;
        int i12 = 0;
        int i13 = 2;
        a aVar = null;
        Object[] objArr = 0;
        o oVar = o.f277a;
        Object obj2 = this.f1185j;
        gc.a aVar2 = gc.a.f2559g;
        int i14 = 1;
        switch (i11) {
            case 0:
                f fVar = (f) this.f1184i;
                int i15 = this.f1183h;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                if (!fVar.f8456t) {
                    return oVar;
                }
                if (fVar.f8443g.f8456t && (aVar = (a) x1.f.j(fVar, f.f1191w)) == null) {
                    aVar = new g(fVar);
                }
                if (aVar == null) {
                    return oVar;
                }
                this.f1183h = 1;
                return aVar.E(x1.f.u(fVar), (l) obj2, this) == aVar2 ? aVar2 : oVar;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i16 = this.f1183h;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                Object obj3 = this.f1184i;
                this.f1183h = 1;
                return ((bd.f) obj2).a(obj3, this) == aVar2 ? aVar2 : oVar;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d2.d dVar = (d2.d) this.f1184i;
                int i17 = this.f1183h;
                if (i17 == 0) {
                    v6.a.W(obj);
                    d2.h hVar = dVar.f1640f;
                    this.f1183h = 1;
                    Object a6 = hVar.a(0.0f - hVar.f1648c, this);
                    if (a6 != aVar2) {
                        a6 = oVar;
                    }
                    if (a6 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                dVar.f1637c.f1649a.setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return oVar;
            case 3:
                int i18 = this.f1183h;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                y yVar = (y) this.f1184i;
                p pVar = (p) obj2;
                t tVar = pVar.f2987u.f8412a;
                bd.c cVar = new bd.c(pVar, yVar, 3);
                this.f1183h = 1;
                tVar.getClass();
                t.j(tVar, cVar, this);
                return aVar2;
            case 4:
                int i19 = this.f1183h;
                if (i19 == 0) {
                    v6.a.W(obj);
                    this.f1183h = 1;
                    return v.c.c((v.c) ((u) this.f1184i).f137c, new Float(0.0f), (v.h) obj2, null, this, 12) == aVar2 ? aVar2 : oVar;
                }
                if (i19 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return oVar;
            case 5:
                int i20 = this.f1183h;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                t tVar2 = ((i) this.f1184i).f8412a;
                j0.c cVar2 = new j0.c(i12, (q) obj2);
                this.f1183h = 1;
                tVar2.getClass();
                t.j(tVar2, cVar2, this);
                return aVar2;
            case 6:
                int i21 = this.f1183h;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                bd.e eVar = (bd.e) this.f1184i;
                u2 u2Var = new u2((t1) obj2, 1);
                this.f1183h = 1;
                return eVar.c(u2Var, this) == aVar2 ? aVar2 : oVar;
            case 7:
                qd.l lVar = (qd.l) obj2;
                d0 d0Var = (d0) this.f1184i;
                int i22 = this.f1183h;
                if (i22 == 0) {
                    v6.a.W(obj);
                    id.i iVar = d0Var.f6129b;
                    this.f1183h = 1;
                    i10 = iVar.i(lVar, this);
                    if (i10 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    i10 = obj;
                }
                if (!((Boolean) i10).booleanValue()) {
                    return oVar;
                }
                pd.a aVar3 = d0Var.f6130c;
                aVar3.getClass();
                pc.j.e(lVar, n.EVENT_TYPE_KEY);
                e0 e0Var = aVar3.f5687b;
                qd.h hVar2 = (qd.h) e0Var.getValue();
                if (hVar2.f5856l) {
                    return oVar;
                }
                long currentTimeMillis = System.currentTimeMillis();
                int ordinal = lVar.ordinal();
                if (ordinal == 0) {
                    e0Var.h(null, qd.h.a(hVar2, 0, 0, 0, 0, false, new qd.a(lVar, currentTimeMillis, 5000L), false, 191));
                    return oVar;
                }
                if (ordinal == 1) {
                    e0Var.h(null, qd.h.a(hVar2, 0, 0, 0, 0, false, null, true, 127));
                    return oVar;
                }
                if (ordinal != 2) {
                    throw new ac.d();
                }
                e0Var.h(null, qd.h.a(hVar2, 0, 0, 0, 0, false, new qd.a(lVar, currentTimeMillis, 10000L), false, 191));
                return oVar;
            case 8:
                int i23 = this.f1183h;
                if (i23 == 0) {
                    v6.a.W(obj);
                    this.f1183h = 1;
                    return ((vd.q) this.f1184i).f7357b.g((qd.l) obj2, this) == aVar2 ? aVar2 : oVar;
                }
                if (i23 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return oVar;
            case 9:
                int i24 = this.f1183h;
                if (i24 == 0) {
                    v6.a.W(obj);
                    this.f1183h = 1;
                    return ((i) this.f1184i).a((y.f) obj2, this) == aVar2 ? aVar2 : oVar;
                }
                if (i24 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return oVar;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                int i25 = this.f1183h;
                if (i25 == 0) {
                    v6.a.W(obj);
                    this.f1183h = 1;
                    return ((i) this.f1184i).a((y.g) obj2, this) == aVar2 ? aVar2 : oVar;
                }
                if (i25 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                return oVar;
            case 11:
                int i26 = this.f1183h;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                r rVar = (r) this.f1184i;
                w.q qVar = (w.q) obj2;
                this.f1183h = 1;
                w.p pVar2 = new w.p(qVar, null);
                a0 a0Var = new a0(28, qVar);
                x.a0 a0Var2 = k1.f7836a;
                Object e10 = yc.a0.e(new a2(rVar, pVar2, a0Var, new h0(rVar), null, 2), this);
                if (e10 != aVar2) {
                    e10 = oVar;
                }
                if (e10 != aVar2) {
                    e10 = oVar;
                }
                return e10 == aVar2 ? aVar2 : oVar;
            case 12:
                int i27 = this.f1183h;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                r rVar2 = (r) this.f1184i;
                w.f fVar2 = new w.f((w.g) obj2, null);
                this.f1183h = 1;
                return l0.c(rVar2, fVar2, this) == aVar2 ? aVar2 : oVar;
            case 13:
                int i28 = this.f1183h;
                if (i28 != 0) {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                r rVar3 = (r) this.f1184i;
                s1.c cVar3 = new s1.c();
                s0 s0Var = (s0) obj2;
                x.t tVar3 = new x.t(s0Var, rVar3, new v(s0Var, i12), new b0.l0(17, cVar3, s0Var), new x.u(s0Var, i12), new x.u(s0Var, i14), new a1.f(10, cVar3, s0Var), null);
                this.f1183h = 1;
                return yc.a0.e(tVar3, this) == aVar2 ? aVar2 : oVar;
            case 14:
                d2 d2Var = (d2) this.f1184i;
                View view = (View) obj2;
                int i29 = this.f1183h;
                try {
                    if (i29 == 0) {
                        v6.a.W(obj);
                        this.f1183h = 1;
                        Object e11 = bd.u.e(d2Var.f4568t, new bd.a0(i13, i14, objArr == true ? 1 : 0), this);
                        if (e11 != aVar2) {
                            e11 = oVar;
                        }
                        if (e11 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i29 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    if (x1.b(view) != d2Var) {
                        return oVar;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    return oVar;
                } finally {
                    if (x1.b(view) == d2Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                }
            default:
                int i30 = this.f1183h;
                if (i30 == 0) {
                    v6.a.W(obj);
                    c0 c0Var = (c0) this.f1184i;
                    j0.c cVar4 = new j0.c(i13, (h1) obj2);
                    this.f1183h = 1;
                    if (c0Var.c(cVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                throw new ac.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1182g = i10;
        this.f1184i = obj;
        this.f1185j = obj2;
    }
}
