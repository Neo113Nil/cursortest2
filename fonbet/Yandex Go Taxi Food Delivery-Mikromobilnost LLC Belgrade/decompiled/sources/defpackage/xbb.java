package defpackage;

import com.yandex.messaging.internal.view.timeline.i;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes15.dex */
public final /* synthetic */ class xbb implements e9e, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xbb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    @Override // defpackage.e9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        boolean z;
        k7q0 k7q0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j3b j3bVar = (j3b) obj;
                boolean z2 = j3bVar.D;
                boolean z3 = j3bVar.I;
                i iVar = (i) obj2;
                iVar.U = j3bVar;
                iVar.T = !j3bVar.M;
                qaz0 qaz0Var = iVar.B;
                boolean z4 = j3bVar.C;
                qaz0Var.b0 = !(z4 || z3) || z2;
                hab habVar = iVar.z;
                j3b j3bVar2 = habVar.C;
                habVar.C = j3bVar;
                boolean z5 = !j3bVar.J && xf4.b(habVar.z.a.a().getThreadsConfig().getRestrictions(), j3bVar);
                if (!j3bVar.m) {
                    wbz0 wbz0Var = s8b.c;
                    int i2 = j3bVar.i;
                    wbz0Var.getClass();
                    if (new s8b(i2).l()) {
                        z = true;
                        habVar.A.getClass();
                        boolean z6 = (z4 && !z3) || z2;
                        boolean z7 = j3bVar.D;
                        habVar.D = new ub5(false, z5, z, false, true, true, z6, true, z7);
                        habVar.E = new ub5(true, false, false, false, false, true, false, false, z7);
                        if (habVar.c.g == null || habVar.b.g != null) {
                            if (j3bVar2 == null) {
                                if (!j3bVar2.equals(j3bVar)) {
                                    habVar.notifyItemRangeChanged(0, habVar.getItemCount());
                                    break;
                                }
                            } else {
                                habVar.notifyItemRangeInserted(0, habVar.getItemCount());
                                break;
                            }
                        }
                    }
                }
                z = false;
                habVar.A.getClass();
                if (z4) {
                }
                boolean z72 = j3bVar.D;
                habVar.D = new ub5(false, z5, z, false, true, true, z6, true, z72);
                habVar.E = new ub5(true, false, false, false, false, true, false, false, z72);
                if (habVar.c.g == null) {
                }
                if (j3bVar2 == null) {
                }
                break;
            case 1:
                i iVar2 = (i) obj2;
                if (((Boolean) obj).booleanValue() && (k7q0Var = iVar2.O) != null) {
                    long j = k7q0Var.d;
                    if (j != -1) {
                        k7q0Var.c.c(new abz0(j));
                        break;
                    }
                }
                break;
            default:
                ((tls) obj2).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof e9e) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof e9e) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof e9e) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(1, (i) obj, i.class, "onChatInfoAvailable", "onChatInfoAvailable(Lcom/yandex/messaging/internal/ChatInfo;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, (i) obj, i.class, "onMembershipChange", "onMembershipChange(Z)V", 0);
            default:
                return (tls) obj;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
