package defpackage;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class t4s extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ c5s l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4s(c5s c5sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = c5sVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new t4s(this.l, continuation, 0);
            default:
                return new t4s(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((t4s) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object L;
        int i = 0;
        int i2 = 1;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    l4s l4sVar = (l4s) this.l.l.getValue();
                    this.k = 1;
                    o4s o4sVar = l4sVar.b;
                    Parcelable.Creator<zh5> creator = zh5.CREATOR;
                    zh5 zh5Var = (zh5) zh5.d.get("music-take-charge");
                    if (zh5Var == null) {
                        L = Unit.a;
                    } else {
                        Activity activity = (Activity) CollectionsKt.Z(frc.a.c);
                        hn5 hn5Var = activity != null ? (hn5) vq2.Q(activity) : null;
                        if (hn5Var == null) {
                            L = Unit.a;
                        } else {
                            jyr jyrVar = k3j.e;
                            if (ixf.x()) {
                                L = tyf.L(ixf.y(), new fpq(l4sVar, zh5Var, hn5Var, null, 16), this);
                                if (L != obj2) {
                                    L = Unit.a;
                                }
                            } else {
                                l4sVar.a.f(zh5Var, hn5Var, false, null);
                                L = Unit.a;
                            }
                        }
                    }
                    if (L == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                l18 l18Var = l18.b;
                c5s c5sVar = this.l;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    if (!o4s.b()) {
                        bdt I = hag.I(m4s.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        break;
                    } else {
                        t5s t5sVar = c5sVar.g;
                        this.k = 1;
                        obj = x97.V(dm6.b, new o5s(t5sVar, null), this);
                        if (obj == nm6Var) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    if (!c5sVar.n.getAndSet(true)) {
                        bdt I2 = hag.I(m4s.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        c5sVar.a.getApplicationContext().registerReceiver(c5sVar.f, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        ox6.B(new mpq(7, new p6o((pjc) c5sVar.c.f.getValue(), 29), c5sVar), c5sVar.m, new s4s(c5sVar, 3));
                        ox6.B(new mpq(8, new y4s((pjc) c5sVar.b.f.getValue(), 0), c5sVar), c5sVar.m, new s4s(c5sVar, i));
                        ox6.B(new y4s((pjc) c5sVar.e.f.getValue(), 1), c5sVar.m, new s4s(c5sVar, i2));
                        ox6.B(new y4s((pjc) c5sVar.d.f.getValue(), 2), c5sVar.m, new s4s(c5sVar, 2));
                        break;
                    } else {
                        bdt I3 = hag.I(m4s.class);
                        qdc qdcVar3 = l18Var.a;
                        qdcVar3.getClass();
                        break;
                    }
                } else {
                    bdt I4 = hag.I(m4s.class);
                    qdc qdcVar4 = l18Var.a;
                    qdcVar4.getClass();
                    break;
                }
        }
        return Unit.a;
    }
}
