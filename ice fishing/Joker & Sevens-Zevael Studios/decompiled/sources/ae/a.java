package ae;

import ac.o;
import android.content.Context;
import bd.e0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.CancellationException;
import m0.d2;
import m0.l0;
import m0.y;
import m0.z1;
import pc.j;
import s.h0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f338i;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f336g = i10;
        this.f337h = obj;
        this.f338i = obj2;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f336g) {
            case 0:
                Context context = (Context) this.f337h;
                e eVar = (e) this.f338i;
                j.e((l0) obj, "$this$DisposableEffect");
                return new f(0, context, eVar);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                y yVar = (y) this.f337h;
                h0 h0Var = (h0) this.f338i;
                yVar.z(obj);
                if (h0Var != null) {
                    h0Var.a(obj);
                }
                return o.f277a;
            default:
                d2 d2Var = (d2) this.f337h;
                Throwable th = (Throwable) this.f338i;
                Throwable th2 = (Throwable) obj;
                synchronized (d2Var.f4550b) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                i7.b.k(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    d2Var.f4552d = th;
                    e0 e0Var = d2Var.f4568t;
                    z1 z1Var = z1.f4846g;
                    e0Var.getClass();
                    e0Var.h(null, z1Var);
                }
                return o.f277a;
        }
    }
}
