package h5;

import android.os.Bundle;
import androidx.lifecycle.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Map;
import m0.k0;
import pc.k;
import s.g0;
import u.m;
import v0.h;
import w0.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2847d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f2844a = i10;
        this.f2845b = obj;
        this.f2846c = obj2;
        this.f2847d = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [oc.a, pc.k] */
    @Override // m0.k0
    public final void a() {
        switch (this.f2844a) {
            case 0:
                ((k) this.f2845b).invoke();
                d dVar = (d) this.f2846c;
                dVar.f2861k.i((Bundle) this.f2847d);
                for (o oVar : d.f2855o) {
                    d.j(dVar.f2857g, oVar);
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                q qVar = (q) this.f2845b;
                Object obj = this.f2846c;
                qVar.remove(obj);
                ((m) this.f2847d).f6619c.k(obj);
                break;
            default:
                v0.d dVar2 = (v0.d) this.f2845b;
                g0 g0Var = dVar2.f7037h;
                Object obj2 = this.f2846c;
                Object k3 = g0Var.k(obj2);
                h hVar = (h) this.f2847d;
                if (k3 == hVar) {
                    Map map = dVar2.f7036g;
                    Map d10 = hVar.d();
                    if (d10.isEmpty()) {
                        map.remove(obj2);
                        break;
                    } else {
                        map.put(obj2, d10);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(oc.a aVar, d dVar, Bundle bundle) {
        this.f2844a = 0;
        this.f2845b = (k) aVar;
        this.f2846c = dVar;
        this.f2847d = bundle;
    }
}
