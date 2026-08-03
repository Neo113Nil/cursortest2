package o6;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5304b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5305c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, w wVar, m6.b bVar) {
        super(wVar);
        this.f5306d = oVar;
        this.f5305c = bVar;
    }

    @Override // o6.x
    public final void a() {
        p6.g e0Var;
        int i10 = this.f5304b;
        Object obj = this.f5306d;
        Object obj2 = this.f5305c;
        switch (i10) {
            case 0:
                ((o) obj).f5313j.j((m6.b) obj2);
                break;
            default:
                s sVar = (s) obj2;
                e7.h hVar = (e7.h) obj;
                if (sVar.m(0)) {
                    m6.b bVar = hVar.f2129h;
                    if (!bVar.b()) {
                        if (sVar.f5337r && !bVar.a()) {
                            sVar.a();
                            sVar.l();
                            break;
                        } else {
                            sVar.j(bVar);
                            break;
                        }
                    } else {
                        p6.q qVar = hVar.f2130i;
                        p6.u.g(qVar);
                        m6.b bVar2 = qVar.f5633i;
                        if (!bVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            sVar.j(bVar2);
                            break;
                        } else {
                            sVar.f5339t = true;
                            IBinder iBinder = qVar.f5632h;
                            if (iBinder == null) {
                                e0Var = null;
                            } else {
                                int i11 = p6.a.f5538d;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                e0Var = queryLocalInterface instanceof p6.g ? (p6.g) queryLocalInterface : new p6.e0(iBinder);
                            }
                            p6.u.g(e0Var);
                            sVar.f5340u = e0Var;
                            sVar.f5341v = qVar.f5634j;
                            sVar.f5342w = qVar.f5635k;
                            sVar.l();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, s sVar2, e7.h hVar) {
        super(sVar);
        this.f5305c = sVar2;
        this.f5306d = hVar;
    }
}
