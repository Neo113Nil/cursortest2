package defpackage;

import com.yandex.music.shared.wavefortwo.data.MultiwaveGroupDuplicationDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class squ {
    public final yqu a;

    public squ(yqu yquVar) {
        this.a = yquVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        mqu mquVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof mqu) {
            mquVar = (mqu) cg6Var;
            int i2 = mquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mquVar.j;
                nm6 nm6Var = nm6.a;
                i = mquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    mquVar.l = 1;
                    obj = this.a.a(mquVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new ur6(wdg.G(((fhi) ((qj6) rj6Var).a).a));
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                pj6 pj6Var = (pj6) rj6Var;
                boolean z = pj6Var instanceof kj6;
                sr6 sr6Var = sr6.a;
                if (z) {
                    kj6 kj6Var = (kj6) pj6Var;
                    return (kj6Var.a == 400 && Intrinsics.d(kj6Var.b, "ROOM_LIMIT_EXCEEDED")) ? tr6.a : sr6Var;
                }
                if ((pj6Var instanceof lj6) || (pj6Var instanceof oj6) || (pj6Var instanceof nj6)) {
                    return sr6Var;
                }
                b6e.s();
                return null;
            }
        }
        mquVar = new mqu(this, cg6Var);
        Object obj2 = mquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mquVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        nqu nquVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof nqu) {
            nquVar = (nqu) cg6Var;
            int i2 = nquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = nquVar.j;
                nm6 nm6Var = nm6.a;
                i = nquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    nquVar.l = 1;
                    obj = this.a.c(str, nquVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new b9b((fhi) ((qj6) rj6Var).a);
                }
                if (!(rj6Var instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                pj6 pj6Var = (pj6) rj6Var;
                boolean z = pj6Var instanceof kj6;
                z8b z8bVar = z8b.a;
                if (z) {
                    kj6 kj6Var = (kj6) pj6Var;
                    String str2 = kj6Var.b;
                    int i3 = kj6Var.a;
                    gfb gfbVar = kj6Var.c;
                    return (i3 == 400 && Intrinsics.d(str2, "ROOM_DUPLICATION") && (gfbVar instanceof MultiwaveGroupDuplicationDetails)) ? new y8b(((MultiwaveGroupDuplicationDetails) gfbVar).getCorrectRoomId()) : (i3 == 400 && Intrinsics.d(str2, "ROOM_LIMIT_EXCEEDED")) ? a9b.a : z8bVar;
                }
                if ((pj6Var instanceof lj6) || (pj6Var instanceof oj6) || (pj6Var instanceof nj6)) {
                    return z8bVar;
                }
                b6e.s();
                return null;
            }
        }
        nquVar = new nqu(this, cg6Var);
        Object obj2 = nquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = nquVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        oqu oquVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof oqu) {
            oquVar = (oqu) cg6Var;
            int i2 = oquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = oquVar.j;
                nm6 nm6Var = nm6.a;
                i = oquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    oquVar.l = 1;
                    obj = this.a.e(str, oquVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new q9d((fhi) ((qj6) rj6Var).a);
                }
                if (rj6Var instanceof pj6) {
                    return p9d.a;
                }
                b6e.s();
                return null;
            }
        }
        oquVar = new oqu(this, cg6Var);
        Object obj2 = oquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = oquVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        pqu pquVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof pqu) {
            pquVar = (pqu) cg6Var;
            int i2 = pquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = pquVar.j;
                nm6 nm6Var = nm6.a;
                i = pquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pquVar.l = 1;
                    obj = this.a.f(pquVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new n9d((List) ((qj6) rj6Var).a);
                }
                if (rj6Var instanceof pj6) {
                    return m9d.a;
                }
                b6e.s();
                return null;
            }
        }
        pquVar = new pqu(this, cg6Var);
        Object obj2 = pquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = pquVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        qqu qquVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof qqu) {
            qquVar = (qqu) cg6Var;
            int i2 = qquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qquVar.j;
                nm6 nm6Var = nm6.a;
                i = qquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    qquVar.l = 1;
                    obj = uwf.h(this.a.d().c(str), qquVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return iwf.a;
                }
                if (rj6Var instanceof pj6) {
                    return hwf.a;
                }
                b6e.s();
                return null;
            }
        }
        qquVar = new qqu(this, cg6Var);
        Object obj2 = qquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qquVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, cg6 cg6Var) {
        rqu rquVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof rqu) {
            rquVar = (rqu) cg6Var;
            int i2 = rquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rquVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rquVar.j;
                nm6 nm6Var = nm6.a;
                i = rquVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rquVar.l = 1;
                    obj = this.a.b(str, str2, rquVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return new nwn((fhi) ((qj6) rj6Var).a);
                }
                if (rj6Var instanceof pj6) {
                    return mwn.a;
                }
                b6e.s();
                return null;
            }
        }
        rquVar = new rqu(this, cg6Var);
        Object obj2 = rquVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rquVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
