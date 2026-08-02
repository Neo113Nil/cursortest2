package defpackage;

import com.yandex.media.ynison.service.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class bo4 extends lg3 {
    public final /* synthetic */ int y = 1;
    public final Object z;

    public bo4(pjc pjcVar) {
        pjcVar.getClass();
        this.z = pjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    @Override // defpackage.lg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s0(vn4 vn4Var, jtc jtcVar, Continuation continuation) {
        ao4 ao4Var;
        nm6 nm6Var;
        int i;
        bo4 bo4Var;
        pjc pjcVar;
        gl glVar;
        switch (this.y) {
            case 0:
                if (continuation instanceof ao4) {
                    ao4Var = (ao4) continuation;
                    int i2 = ao4Var.o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ao4Var.o = i2 - Integer.MIN_VALUE;
                        Object obj = ao4Var.m;
                        nm6Var = nm6.a;
                        i = ao4Var.o;
                        if (i != 0) {
                            qgg.h0(obj);
                            ao4Var.j = this;
                            ao4Var.k = vn4Var;
                            ao4Var.l = jtcVar;
                            ao4Var.o = 1;
                            if (jtcVar.E(ao4Var) != nm6Var) {
                                bo4Var = this;
                            }
                        } else if (i == 1) {
                            jtcVar = ao4Var.l;
                            vn4Var = ao4Var.k;
                            bo4Var = ao4Var.j;
                            qgg.h0(obj);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj);
                            break;
                        }
                        pjcVar = (pjc) bo4Var.z;
                        glVar = new gl(22, vn4Var, jtcVar);
                        ao4Var.j = null;
                        ao4Var.k = null;
                        ao4Var.l = null;
                        ao4Var.o = 2;
                        if (pjcVar.collect(glVar, ao4Var) == nm6Var) {
                        }
                    }
                }
                ao4Var = new ao4(this, (cg6) continuation);
                Object obj2 = ao4Var.m;
                nm6Var = nm6.a;
                i = ao4Var.o;
                if (i != 0) {
                }
                pjcVar = (pjc) bo4Var.z;
                glVar = new gl(22, vn4Var, jtcVar);
                ao4Var.j = null;
                ao4Var.k = null;
                ao4Var.l = null;
                ao4Var.o = 2;
                if (pjcVar.collect(glVar, ao4Var) == nm6Var) {
                }
                break;
            default:
                vn4Var.e(this.z);
                break;
        }
        return Unit.a;
    }

    public bo4(f0 f0Var) {
        this.z = f0Var;
    }
}
