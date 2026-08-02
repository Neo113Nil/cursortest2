package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wns {
    public final cc7 a;
    public final jyr b = btf.b(new wfs(5, this));
    public final hmm.a c = new hmm.a("token key");
    public final hmm.a d = new hmm.a("uid key");

    public wns(cc7 cc7Var) {
        this.a = cc7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        uns unsVar;
        int i;
        hmm hmmVar;
        if (cg6Var instanceof uns) {
            unsVar = (uns) cg6Var;
            int i2 = unsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unsVar.m = i2 - Integer.MIN_VALUE;
                Object obj = unsVar.k;
                nm6 nm6Var = nm6.a;
                i = unsVar.m;
                jyr jyrVar = this.b;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc data = ((wb7) jyrVar.getValue()).getData();
                    unsVar.j = str;
                    unsVar.m = 1;
                    obj = zsd.i0(data, unsVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return null;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = unsVar.j;
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    if (Intrinsics.d(hmmVar.a(this.d), str)) {
                        return hmmVar.a(this.c);
                    }
                    unsVar.j = null;
                    unsVar.m = 2;
                    Object a = lmm.a((wb7) jyrVar.getValue(), new z0i(i3, 28, continuation), unsVar);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                }
                return null;
            }
        }
        unsVar = new uns(this, cg6Var);
        Object obj2 = unsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = unsVar.m;
        jyr jyrVar2 = this.b;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
        return null;
    }

    public final Object b(String str, String str2, cg6 cg6Var) {
        Object a = lmm.a((wb7) this.b.getValue(), new vns(this, str2, str, null), cg6Var);
        return a == nm6.a ? a : Unit.a;
    }
}
