package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ljj {
    public final g0c a;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(cg6 cg6Var) {
        kjj kjjVar;
        int i;
        ljj ljjVar;
        if (cg6Var instanceof kjj) {
            kjjVar = (kjj) cg6Var;
            int i2 = kjjVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kjjVar.m = i2 - Integer.MIN_VALUE;
                Object obj = kjjVar.k;
                Object obj2 = nm6.a;
                i = kjjVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    e8w e8wVar = e8w.a;
                    kjjVar.j = this;
                    kjjVar.m = 1;
                    e8w.c();
                    obj = y0q.b(0, 0, null, 7);
                    if (obj == obj2) {
                        return obj2;
                    }
                    ljjVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ljjVar = kjjVar.j;
                    qgg.h0(obj);
                }
                return new ub7(12, (pjc) obj, new seg(ljjVar, continuation, 9));
            }
        }
        kjjVar = new kjj(this, cg6Var);
        Object obj3 = kjjVar.k;
        Object obj22 = nm6.a;
        i = kjjVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return new ub7(12, (pjc) obj3, new seg(ljjVar, continuation2, 9));
    }

    public void b(rfk rfkVar, boolean z) {
        qne j1;
        rfkVar.getClass();
        boolean z2 = rfkVar instanceof ffk;
        g0c g0cVar = this.a;
        if (z2) {
            j1 = gut.j1(yfk.EXISTING_CARD, z);
        } else if (rfkVar instanceof mfk) {
            j1 = gut.j1(yfk.SBP_TOKEN, z);
        } else if (rfkVar instanceof pfk) {
            j1 = gut.j1(yfk.YANDEX_BANK, z);
        } else if (rfkVar.equals(gfk.a)) {
            j1 = gut.j1(yfk.CASH, z);
        } else if (rfkVar.equals(ifk.a)) {
            j1 = gut.j1(yfk.GOOGLE_PAY, z);
        } else if (rfkVar.equals(jfk.a)) {
            j1 = gut.j1(yfk.NEW_CARD, z);
        } else if (rfkVar.equals(lfk.a)) {
            j1 = gut.j1(yfk.SBP, z);
        } else {
            if (!rfkVar.equals(kfk.a)) {
                if (rfkVar.equals(ofk.a)) {
                    xq0.q("TinkoffCredit not supported");
                    return;
                }
                if (rfkVar.equals(nfk.a)) {
                    ((x60) g0cVar).a(gut.i1("Split not supported", null, null, null, null));
                    xq0.q("Split not supported");
                    return;
                } else if (rfkVar.equals(hfk.a)) {
                    xq0.q("ChallengePollingMethod not supported");
                    return;
                } else {
                    b6e.s();
                    return;
                }
            }
            j1 = gut.j1(yfk.NEW_SBP_TOKEN, z);
        }
        ((x60) g0cVar).a(j1);
    }
}
