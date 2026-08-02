package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class by7 implements vdr {
    public final /* synthetic */ int a;
    public final Function0 b;
    public final pjc c;

    public /* synthetic */ by7(Function0 function0, pjc pjcVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = pjcVar;
    }

    @Override // defpackage.u0q
    public final List b() {
        switch (this.a) {
        }
        return t75.c(this.b.invoke());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        ay7 ay7Var;
        int i;
        k7t k7tVar;
        int i2;
        switch (this.a) {
            case 0:
                if (continuation instanceof ay7) {
                    ay7Var = (ay7) continuation;
                    int i3 = ay7Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ay7Var.l = i3 - Integer.MIN_VALUE;
                        Object obj = ay7Var.j;
                        nm6 nm6Var = nm6.a;
                        i = ay7Var.l;
                        if (i != 0) {
                            qgg.h0(obj);
                            j57 j57Var = new j57(this, rjcVar, (Continuation) null, 10);
                            ay7Var.l = 1;
                            if (gld.Q(j57Var, ay7Var) == nm6Var) {
                                return nm6Var;
                            }
                        } else {
                            if (i != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                        }
                        rj7.f();
                        return null;
                    }
                }
                ay7Var = new ay7(this, continuation);
                Object obj2 = ay7Var.j;
                nm6 nm6Var2 = nm6.a;
                i = ay7Var.l;
                if (i != 0) {
                }
                rj7.f();
                return null;
            default:
                if (continuation instanceof k7t) {
                    k7tVar = (k7t) continuation;
                    int i4 = k7tVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        k7tVar.l = i4 - Integer.MIN_VALUE;
                        Object obj3 = k7tVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = k7tVar.l;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            k7tVar.l = 1;
                            if (this.c.collect(rjcVar, k7tVar) == nm6Var3) {
                                return nm6Var3;
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj3);
                        }
                        throw new CancellationException();
                    }
                }
                k7tVar = new k7t(this, continuation);
                Object obj32 = k7tVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = k7tVar.l;
                if (i2 != 0) {
                }
                throw new CancellationException();
        }
    }

    @Override // defpackage.vdr
    public final Object getValue() {
        switch (this.a) {
        }
        return this.b.invoke();
    }
}
