package defpackage;

import com.yandex.music.shared.network.repositories.retrofit.AccountApi;
import kotlin.Unit;
import kotlin.coroutines.e;

/* loaded from: classes6.dex */
public final class gst {
    public final jyr a;
    public final jyr b;
    public final tf6 c;

    public gst(jyr jyrVar, jyr jyrVar2) {
        this.a = jyrVar;
        this.b = jyrVar2;
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        this.c = gld.e(e.c(n, mn7.d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (((defpackage.iv0) r9).b(r1) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r9.b(r1) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (((defpackage.iv0) r9).a.a(r1) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (r10 == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gst gstVar, do4 do4Var, cg6 cg6Var) {
        est estVar;
        int i;
        Object m;
        jyr jyrVar = gstVar.a;
        if (cg6Var instanceof est) {
            estVar = (est) cg6Var;
            int i2 = estVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                estVar.l = i2 - Integer.MIN_VALUE;
                Object obj = estVar.j;
                Object obj2 = nm6.a;
                i = estVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "UserErrorHandler", "handleError " + do4Var, null);
                    int ordinal = do4Var.ordinal();
                    if (ordinal == 0) {
                        av0 av0Var = (av0) jyrVar.getValue();
                        estVar.l = 1;
                        m = ((iv0) av0Var).m(estVar);
                    } else {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                return Unit.a;
                            }
                            b6e.s();
                            return null;
                        }
                        av0 av0Var2 = (av0) jyrVar.getValue();
                        estVar.l = 4;
                    }
                    return obj2;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    m = ((z7o) obj).a;
                    r7o r7oVar = z7o.b;
                    if (m instanceof t7o) {
                        ssg.a(3, null, "Could not update token", null);
                        av0 av0Var3 = (av0) jyrVar.getValue();
                        estVar.l = 2;
                    } else {
                        estVar.l = 3;
                    }
                    return obj2;
                }
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                if (i == 4) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        estVar = new est(gstVar, cg6Var);
        Object obj3 = estVar.j;
        Object obj22 = nm6.a;
        i = estVar.l;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (((defpackage.iv0) r11).b(r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        fst fstVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof fst) {
            fstVar = (fst) cg6Var;
            int i2 = fstVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fstVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fstVar.j;
                nm6 nm6Var = nm6.a;
                i = fstVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ssg.a(3, "UserErrorHandler", "try validatedToken", null);
                    tc tcVar = (tc) this.b.getValue();
                    fstVar.l = 1;
                    tcVar.getClass();
                    obj = kg5.k(((AccountApi) tcVar.a.getValue()).a(yqq.a), fstVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof mj6) {
                    if (rj6Var instanceof pj6) {
                        ssg.a(3, "UserErrorHandler", "Error on test token request: " + rj6Var + ", but token is valid", null);
                    } else {
                        if (!(rj6Var instanceof qj6)) {
                            b6e.s();
                            return null;
                        }
                        ssg.a(3, "UserErrorHandler", "Token updated and valid", null);
                    }
                } else if (((mj6) rj6Var).a == 401) {
                    ssg.a(7, "UserErrorHandler", "Token updated but still invalid: " + rj6Var, null);
                    av0 av0Var = (av0) this.a.getValue();
                    fstVar.l = 2;
                } else {
                    ssg.a(3, null, "Error on test token request: " + rj6Var + ", but token is valid", null);
                }
                return Unit.a;
            }
        }
        fstVar = new fst(this, cg6Var);
        Object obj2 = fstVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fstVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof mj6) {
        }
        return Unit.a;
    }
}
