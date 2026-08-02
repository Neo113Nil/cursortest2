package defpackage;

import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.GetFileInfoException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class z9c {
    public final jyr a;
    public final jyr b;

    public z9c(b7q b7qVar) {
        this.a = b7qVar.b(hag.I(oco.class), true);
        b7qVar.b(hag.I(tcl.class), true);
        this.b = b7qVar.b(hag.I(s8d.class), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e5 A[Catch: Exception -> 0x0069, DoNotRetryException -> 0x0074, InterruptedException -> 0x0077, RuntimeException -> 0x007a, TryCatch #1 {Exception -> 0x0069, blocks: (B:21:0x00df, B:23:0x00e5, B:25:0x00ec, B:27:0x00f0, B:29:0x00f4, B:30:0x00fd, B:31:0x00fe, B:32:0x0103, B:33:0x0104, B:34:0x0112, B:35:0x0113, B:36:0x0118, B:37:0x0119, B:39:0x011d, B:41:0x012c, B:43:0x0133, B:44:0x0138, B:45:0x0139, B:46:0x013e, B:71:0x0064), top: B:70:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119 A[Catch: Exception -> 0x0069, DoNotRetryException -> 0x0074, InterruptedException -> 0x0077, RuntimeException -> 0x007a, TryCatch #1 {Exception -> 0x0069, blocks: (B:21:0x00df, B:23:0x00e5, B:25:0x00ec, B:27:0x00f0, B:29:0x00f4, B:30:0x00fd, B:31:0x00fe, B:32:0x0103, B:33:0x0104, B:34:0x0112, B:35:0x0113, B:36:0x0118, B:37:0x0119, B:39:0x011d, B:41:0x012c, B:43:0x0133, B:44:0x0138, B:45:0x0139, B:46:0x013e, B:71:0x0064), top: B:70:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v10, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5, types: [f9f] */
    /* JADX WARN: Type inference failed for: r11v7, types: [mbo] */
    /* JADX WARN: Type inference failed for: r12v7, types: [mbo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01ae -> B:12:0x01c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pbo pboVar, zvs zvsVar, o5n o5nVar, gy1 gy1Var, cg6 cg6Var) {
        y9c y9cVar;
        int i;
        pbo pboVar2;
        tao taoVar;
        y9c y9cVar2;
        lm4 lm4Var;
        int i2;
        int i3;
        int i4;
        zvs zvsVar2;
        o5n o5nVar2;
        gy1 gy1Var2;
        zvs zvsVar3;
        o5n o5nVar3;
        gy1 gy1Var3;
        pbo pboVar3;
        int i5;
        lm4 lm4Var2;
        tao taoVar2;
        int i6;
        int i7;
        Exception e;
        GetFileInfoException getFileInfoException;
        rj6 rj6Var;
        try {
            if (cg6Var instanceof y9c) {
                y9cVar = (y9c) cg6Var;
                int i8 = y9cVar.u;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    y9cVar.u = i8 - Integer.MIN_VALUE;
                    Object obj = y9cVar.s;
                    nm6 nm6Var = nm6.a;
                    i = y9cVar.u;
                    int i9 = 1;
                    if (i != 0) {
                        qgg.h0(obj);
                        oco ocoVar = (oco) this.a.getValue();
                        lm4 a = ern.a(GetFileInfoException.class);
                        pboVar2 = pboVar;
                        taoVar = new tao(pboVar2, new mx7(ocoVar.a, null, null));
                        y9cVar2 = y9cVar;
                        lm4Var = a;
                        i2 = 1;
                        i3 = 0;
                        i4 = 0;
                        zvsVar2 = zvsVar;
                        o5nVar2 = o5nVar;
                        gy1Var2 = gy1Var;
                        if (i2 == 0) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i10 = y9cVar.q;
                            int i11 = y9cVar.p;
                            tao taoVar3 = y9cVar.o;
                            ?? r10 = y9cVar.n;
                            ?? r11 = y9cVar.m;
                            gy1 gy1Var4 = y9cVar.l;
                            o5n o5nVar4 = y9cVar.k;
                            zvs zvsVar4 = y9cVar.j;
                            qgg.h0(obj);
                            i3 = i10;
                            o5nVar2 = o5nVar4;
                            i4 = i11;
                            gy1Var2 = gy1Var4;
                            char c = 2;
                            lm4Var = r10;
                            y9cVar2 = y9cVar;
                            zvsVar2 = zvsVar4;
                            taoVar = taoVar3;
                            pboVar2 = r11;
                            i9 = 1;
                            i2 = ((Boolean) obj).booleanValue();
                            if (i2 == 0) {
                                ((Function1) pboVar2.d).invoke((ArrayList) taoVar.e);
                                rj7.f();
                                return null;
                            }
                            try {
                            } catch (Exception e2) {
                                e = e2;
                                lm4 lm4Var3 = lm4Var;
                                zvsVar3 = zvsVar2;
                                y9cVar = y9cVar2;
                                lm4Var2 = lm4Var3;
                                tao taoVar4 = taoVar;
                                o5nVar3 = o5nVar2;
                                i7 = i3;
                                pboVar3 = pboVar2;
                                taoVar2 = taoVar4;
                                int i12 = i4;
                                gy1Var3 = gy1Var2;
                                i6 = i12;
                                i5 = i2;
                                if (e instanceof IOException) {
                                    j66.h0((IOException) e);
                                }
                                getFileInfoException = (GetFileInfoException) (e instanceof GetFileInfoException ? null : e);
                                if (getFileInfoException != null) {
                                    if (pboVar3.a) {
                                        Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e + " caught, expected " + lm4Var2.f(), e));
                                    }
                                    throw e;
                                }
                                y9cVar.j = zvsVar3;
                                y9cVar.k = o5nVar3;
                                y9cVar.l = gy1Var3;
                                y9cVar.m = pboVar3;
                                y9cVar.n = lm4Var2;
                                y9cVar.o = taoVar2;
                                y9cVar.p = i6;
                                y9cVar.q = i7;
                                y9cVar.r = i5;
                                c = 2;
                                y9cVar.u = 2;
                                obj = taoVar2.m(getFileInfoException, e, y9cVar);
                                if (obj != nm6Var) {
                                    lm4 lm4Var4 = lm4Var2;
                                    y9cVar2 = y9cVar;
                                    zvsVar2 = zvsVar3;
                                    lm4Var = lm4Var4;
                                    pbo pboVar4 = pboVar3;
                                    i3 = i7;
                                    o5nVar2 = o5nVar3;
                                    taoVar = taoVar2;
                                    pboVar2 = pboVar4;
                                    gy1 gy1Var5 = gy1Var3;
                                    i4 = i6;
                                    gy1Var2 = gy1Var5;
                                    i9 = 1;
                                    i2 = ((Boolean) obj).booleanValue();
                                    if (i2 == 0) {
                                    }
                                }
                                return nm6Var;
                            }
                            s8d s8dVar = (s8d) this.b.getValue();
                            y9cVar2.j = zvsVar2;
                            y9cVar2.k = o5nVar2;
                            y9cVar2.l = gy1Var2;
                            y9cVar2.m = pboVar2;
                            y9cVar2.n = lm4Var;
                            y9cVar2.o = taoVar;
                            y9cVar2.p = i4;
                            y9cVar2.q = i3;
                            y9cVar2.r = i2 == true ? 1 : 0;
                            y9cVar2.u = i9;
                            obj = s8dVar.a(zvsVar2, o5nVar2, gy1Var2, y9cVar2);
                            if (obj != nm6Var) {
                                boolean z = i2 == true ? 1 : 0;
                                rj6Var = (rj6) obj;
                                if (rj6Var instanceof pj6) {
                                    if (!(rj6Var instanceof qj6)) {
                                        throw new x7j();
                                    }
                                    if (StringsKt.U(((x9c) ((qj6) rj6Var).a).e)) {
                                        throw new o8d(null);
                                    }
                                    return (x9c) ((qj6) rj6Var).a;
                                }
                                pj6 pj6Var = (pj6) rj6Var;
                                if (pj6Var instanceof nj6) {
                                    throw new q8d(null);
                                }
                                if (pj6Var instanceof oj6) {
                                    IOException a2 = ((oj6) rj6Var).a();
                                    a2.getClass();
                                    throw new n8d(a2);
                                }
                                if (pj6Var instanceof mj6) {
                                    throw new p8d(((mj6) rj6Var).a);
                                }
                                throw new x7j();
                            }
                            return nm6Var;
                        }
                        int i13 = y9cVar.r;
                        int i14 = y9cVar.q;
                        int i15 = y9cVar.p;
                        tao taoVar5 = y9cVar.o;
                        ?? r112 = y9cVar.n;
                        ?? r12 = y9cVar.m;
                        gy1Var3 = y9cVar.l;
                        o5nVar3 = y9cVar.k;
                        zvsVar3 = y9cVar.j;
                        try {
                            qgg.h0(obj);
                        } catch (Exception e3) {
                            e = e3;
                            i5 = i13;
                            i7 = i14;
                            i6 = i15;
                            taoVar2 = taoVar5;
                            lm4Var2 = r112;
                            pboVar3 = r12;
                            if (e instanceof IOException) {
                            }
                            getFileInfoException = (GetFileInfoException) (e instanceof GetFileInfoException ? null : e);
                            if (getFileInfoException != null) {
                            }
                        }
                        rj6Var = (rj6) obj;
                        if (rj6Var instanceof pj6) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (DoNotRetryException e4) {
            throw e4.a;
        } catch (InterruptedException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            throw e6;
        }
        y9cVar = new y9c(this, cg6Var);
        Object obj2 = y9cVar.s;
        nm6 nm6Var2 = nm6.a;
        i = y9cVar.u;
        int i92 = 1;
    }
}
