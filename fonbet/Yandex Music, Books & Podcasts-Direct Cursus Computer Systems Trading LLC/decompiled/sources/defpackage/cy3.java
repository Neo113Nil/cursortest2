package defpackage;

import com.yandex.music.screen.cards.data.CardsDtoOld;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class cy3 {
    public final ay3 a;
    public final z66 b;

    public cy3(ay3 ay3Var, z66 z66Var) {
        this.a = ay3Var;
        this.b = z66Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:26|27))(2:28|(2:30|31)(2:32|(1:34)))|12|(4:14|15|(2:17|(1:19)(2:20|21))|23)(5:24|25|15|(0)|23)))|55|6|7|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0030, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r0 = new defpackage.oj6(r0.a, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        r0 = r0.b;
        r1 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        r13 = new defpackage.kj6(r0.a, r0.getDetails(), r8, r9, r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
    
        r0 = new defpackage.lj6(r0.a, r0.b, r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
    
        r0 = new defpackage.oj6(defpackage.btf.b(new defpackage.ur(4, r0)));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: IOException -> 0x002d, IllegalRequestOnNetworkModeException -> 0x0030, MusicCommonHttpException -> 0x0033, MusicBackendHttpException -> 0x0036, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x0030, MusicBackendHttpException -> 0x0036, MusicCommonHttpException -> 0x0033, IOException -> 0x002d, blocks: (B:11:0x0029, B:12:0x0068, B:14:0x0070, B:24:0x0076, B:32:0x005b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: IOException -> 0x002d, IllegalRequestOnNetworkModeException -> 0x0030, MusicCommonHttpException -> 0x0033, MusicBackendHttpException -> 0x0036, TRY_LEAVE, TryCatch #2 {IllegalRequestOnNetworkModeException -> 0x0030, MusicBackendHttpException -> 0x0036, MusicCommonHttpException -> 0x0033, IOException -> 0x002d, blocks: (B:11:0x0029, B:12:0x0068, B:14:0x0070, B:24:0x0076, B:32:0x005b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        by3 by3Var;
        int i;
        Object kj6Var;
        ArrayList P;
        if (cg6Var instanceof by3) {
            by3Var = (by3) cg6Var;
            int i2 = by3Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                by3Var.m = i2 - Integer.MIN_VALUE;
                Object obj = by3Var.k;
                nm6 nm6Var = nm6.a;
                i = by3Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!this.b.g()) {
                        ssg.a(6, "CardsCenterOld", "no connection to load cards", null);
                        return new oj6(new IOException("no connection to load cards"));
                    }
                    ay3 ay3Var = this.a;
                    by3Var.j = str;
                    by3Var.m = 1;
                    obj = ay3Var.g(str, by3Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = by3Var.j;
                    qgg.h0(obj);
                }
                P = nt0.P((CardsDtoOld) obj);
                if (P == null) {
                    Object oj6Var = new qj6(P);
                    kj6Var = oj6Var;
                    if (!(kj6Var instanceof qj6)) {
                    }
                    return kj6Var;
                }
                kj6Var = new nj6(null);
                if (!(kj6Var instanceof qj6)) {
                    if (!(kj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ssg.a(6, "CardsCenterOld", "failed load cards. PromoId = " + str, ((pj6) kj6Var).a());
                }
                return kj6Var;
            }
        }
        by3Var = new by3(this, cg6Var);
        Object obj2 = by3Var.k;
        nm6 nm6Var2 = nm6.a;
        i = by3Var.m;
        if (i != 0) {
        }
        P = nt0.P((CardsDtoOld) obj2);
        if (P == null) {
        }
    }
}
