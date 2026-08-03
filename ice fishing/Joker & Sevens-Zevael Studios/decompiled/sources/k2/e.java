package k2;

import androidx.lifecycle.m0;
import bc.a0;
import bd.e0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m0.d1;
import m0.d2;
import m0.y;
import m0.z1;
import s.h0;
import s.z;
import w0.w;
import yc.b1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3601h;

    public /* synthetic */ e(int i10, Object obj) {
        this.f3600g = i10;
        this.f3601h = obj;
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.util.List] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f3600g) {
            case 0:
                s sVar = (s) obj;
                return ((f) this.f3601h).a(new s(null, sVar.f3621b, sVar.f3622c, sVar.f3623d, sVar.f3624e)).f3625g;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((y) this.f3601h).y(obj);
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d2 d2Var = (d2) this.f3601h;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (d2Var.f4550b) {
                    try {
                        b1 b1Var = d2Var.f4551c;
                        if (b1Var != null) {
                            e0 e0Var = d2Var.f4568t;
                            z1 z1Var = z1.f4847h;
                            e0Var.getClass();
                            e0Var.h(null, z1Var);
                            b1Var.a(cancellationException);
                            d2Var.f4565q = null;
                            b1Var.k(new ae.a(2, d2Var, th));
                        } else {
                            d2Var.f4552d = cancellationException;
                            e0 e0Var2 = d2Var.f4568t;
                            z1 z1Var2 = z1.f4846g;
                            e0Var2.getClass();
                            e0Var2.h(null, z1Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return ac.o.f277a;
            case 3:
                h0 h0Var = (h0) this.f3601h;
                if (obj instanceof w) {
                    ((w) obj).f(4);
                }
                h0Var.a(obj);
                return ac.o.f277a;
            case 4:
                nd.f fVar = (nd.f) this.f3601h;
                g5.a aVar = (g5.a) obj;
                pc.j.e(aVar, "cursor");
                Long a6 = aVar.a(0);
                pc.j.b(a6);
                Long a8 = aVar.a(1);
                pc.j.b(a8);
                Long a10 = aVar.a(2);
                pc.j.b(a10);
                return fVar.b(a6, a8, a10);
            case 5:
                nd.c cVar = (nd.c) this.f3601h;
                g5.a aVar2 = (g5.a) obj;
                pc.j.e(aVar2, "cursor");
                String b2 = aVar2.b(0);
                pc.j.b(b2);
                String b10 = aVar2.b(1);
                pc.j.b(b10);
                String b11 = aVar2.b(2);
                pc.j.b(b11);
                Long a11 = aVar2.a(3);
                pc.j.b(a11);
                Long a12 = aVar2.a(4);
                pc.j.b(a12);
                return cVar.a(b2, b10, b11, a11, a12);
            case 6:
                nd.g gVar = (nd.g) this.f3601h;
                g5.a aVar3 = (g5.a) obj;
                pc.j.e(aVar3, "cursor");
                Long a13 = aVar3.a(0);
                pc.j.b(a13);
                Long a14 = aVar3.a(1);
                pc.j.b(a14);
                Long a15 = aVar3.a(2);
                pc.j.b(a15);
                Long a16 = aVar3.a(3);
                pc.j.b(a16);
                return gVar.d(a13, a14, a15, a16);
            case 7:
                nd.c cVar2 = (nd.c) this.f3601h;
                g5.a aVar4 = (g5.a) obj;
                pc.j.e(aVar4, "cursor");
                String b12 = aVar4.b(0);
                pc.j.b(b12);
                String b13 = aVar4.b(1);
                pc.j.b(b13);
                String b14 = aVar4.b(2);
                pc.j.b(b14);
                Long a17 = aVar4.a(3);
                pc.j.b(a17);
                Long a18 = aVar4.a(4);
                pc.j.b(a18);
                return cVar2.a(b12, b13, b14, a17, a18);
            case 8:
                nd.j jVar = (nd.j) this.f3601h;
                g5.k kVar = (g5.k) obj;
                pc.j.e(kVar, "$this$executeQuery");
                kVar.c(jVar.f5097b, 0);
                return ac.o.f277a;
            case 9:
                qd.b bVar = (qd.b) this.f3601h;
                pc.j.e((s2.c) obj, "$this$offset");
                qd.c cVar3 = bVar.f5827e;
                return new s2.i((a0.I(cVar3.f5830a) << 32) | (a0.I(cVar3.f5831b) & 4294967295L));
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                v0.e eVar = ((v0.d) this.f3601h).f7038i;
                return Boolean.valueOf(eVar != null ? eVar.c(obj) : true);
            case 11:
                vd.q qVar = (vd.q) this.f3601h;
                qd.l lVar = (qd.l) obj;
                pc.j.e(lVar, "powerUp");
                yc.a0.q(m0.h(qVar), null, new c0.d(qVar, lVar, null, 8), 3);
                return ac.o.f277a;
            case 12:
                w0.g gVar2 = (w0.g) ((oc.c) this.f3601h).invoke((w0.k) obj);
                synchronized (w0.m.f7580c) {
                    w0.m.f7581d = w0.m.f7581d.e(gVar2.g());
                }
                return gVar2;
            case 13:
                w0.t tVar = (w0.t) this.f3601h;
                synchronized (tVar.f7612g) {
                    w0.s sVar2 = tVar.f7614i;
                    pc.j.b(sVar2);
                    Object obj2 = sVar2.f7595b;
                    pc.j.b(obj2);
                    int i10 = sVar2.f7597d;
                    z zVar = sVar2.f7596c;
                    if (zVar == null) {
                        zVar = new z();
                        sVar2.f7596c = zVar;
                        sVar2.f7599f.m(obj2, zVar);
                    }
                    sVar2.c(obj, i10, obj2, zVar);
                }
                return ac.o.f277a;
            case 14:
                d1 d1Var = (d1) this.f3601h;
                pc.j.e((Map) obj, "<unused var>");
                d1Var.setValue(Boolean.TRUE);
                return ac.o.f277a;
            default:
                zd.e eVar2 = (zd.e) this.f3601h;
                a0.f fVar2 = (a0.f) obj;
                pc.j.e(fVar2, "$this$LazyColumn");
                ?? r02 = eVar2.f9191a;
                fVar2.a(r02.size(), new u.d(1, r02), new u0.d(-1091073711, new i4.b(3, r02), true));
                return ac.o.f277a;
        }
    }
}
