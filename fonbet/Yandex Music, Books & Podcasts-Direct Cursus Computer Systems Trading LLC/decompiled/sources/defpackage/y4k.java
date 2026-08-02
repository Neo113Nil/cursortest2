package defpackage;

import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.music.shared.utils.ThrowablesKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes4.dex */
public final class y4k implements eun {
    public rce a;
    public q8r b;
    public Function1 c;
    public w8r d;

    public final void a(yr1 yr1Var) {
        String str;
        Pair pair;
        String str2;
        Integer num;
        l3o l3oVar;
        yr1Var.getClass();
        w8r w8rVar = this.d;
        if (w8rVar != null) {
            Throwable th = yr1Var.b.c;
            x8r x8rVar = w8rVar.d;
            String str3 = w8rVar.a;
            int i = w8rVar.b;
            z66 z66Var = (z66) x8rVar.a.a;
            String a = x8r.a(str3);
            if (a != null) {
                str = "NoNetwork";
                if (i4w.M(th)) {
                    if (z66Var.h()) {
                        str = "NetworkNotAllowed";
                    } else if (z66Var.g()) {
                        str = "UnknownNetworkFail";
                    }
                    pair = new Pair("Network", str);
                } else {
                    for (Throwable th2 : ThrowablesKt.meAndCauses(th)) {
                        if (!(th2 instanceof FileNotFoundException)) {
                            boolean z = th2 instanceof ErrnoException;
                            ErrnoException errnoException = z ? (ErrnoException) th2 : null;
                            if (errnoException == null || errnoException.errno != OsConstants.EDQUOT) {
                                ErrnoException errnoException2 = z ? (ErrnoException) th2 : null;
                                if (errnoException2 == null || errnoException2.errno != OsConstants.ENOSPC) {
                                }
                            }
                        }
                        Iterator it = ThrowablesKt.meAndCauses(th).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                str2 = "UnknownStorageFail";
                                break;
                            }
                            Throwable th3 = (Throwable) it.next();
                            ErrnoException errnoException3 = th3 instanceof ErrnoException ? (ErrnoException) th3 : null;
                            if (errnoException3 != null && errnoException3.errno == OsConstants.ENOSPC) {
                                str2 = "NotEnoughSpace";
                                break;
                            }
                        }
                        pair = new Pair("Storage", str2);
                    }
                    if (th instanceof IOException) {
                        pair = new Pair("UnknownIo", null);
                    } else if (th instanceof r6e) {
                        pair = ((r6e) th).a.d == 504 ? new Pair("Network", z66Var.h() ? "NetworkNotAllowed" : "NoNetwork") : new Pair("Network", "ResponseCode");
                    } else if (th instanceof IllegalStateException) {
                        String message = th.getMessage();
                        pair = (message == null || !c.v(message, "BitmapFactory returned a null bitmap.", false)) ? new Pair("Unknown", null) : new Pair("Corrupted", null);
                    } else {
                        pair = new Pair("Unknown", null);
                    }
                }
                String str4 = (String) pair.a;
                String str5 = (String) pair.b;
                r6e r6eVar = th instanceof r6e ? (r6e) th : null;
                if (r6eVar != null && (l3oVar = r6eVar.a) != null) {
                    int i2 = l3oVar.d;
                    Integer valueOf = Integer.valueOf(i2);
                    if (i2 != 504) {
                        num = valueOf;
                        x8rVar.b.g("IMG_SHOW_FAILED", new p4c(i, num, str3, a, str4, str5).h());
                    }
                }
                num = null;
                x8rVar.b.g("IMG_SHOW_FAILED", new p4c(i, num, str3, a, str4, str5).h());
            }
        }
        this.d = null;
    }

    public final void c(zr1 zr1Var) {
        zr1Var.getClass();
        w8r w8rVar = this.d;
        if (w8rVar != null) {
            w8rVar.a();
        }
        q8r q8rVar = this.b;
        if (q8rVar == null) {
            Intrinsics.j("loader");
            throw null;
        }
        rce rceVar = this.a;
        if (rceVar != null) {
            this.d = q8rVar.a(rceVar.b);
        } else {
            Intrinsics.j(ServiceCommand.TYPE_REQ);
            throw null;
        }
    }

    @Override // defpackage.eun
    public final void e() {
        w8r w8rVar = this.d;
        if (w8rVar != null) {
            w8rVar.a();
        }
        this.d = null;
    }

    public final void f(bs1 bs1Var) {
        bs1Var.getClass();
        if (!(bs1Var instanceof xr1)) {
            if (bs1Var instanceof zr1) {
                c((zr1) bs1Var);
            } else if (bs1Var instanceof as1) {
                g((as1) bs1Var);
            } else {
                if (!(bs1Var instanceof yr1)) {
                    b6e.s();
                    return;
                }
                a((yr1) bs1Var);
            }
        }
        Function1 function1 = this.c;
        if (function1 != null) {
            function1.invoke(bs1Var);
        }
    }

    public final void g(as1 as1Var) {
        String str;
        as1Var.getClass();
        w8r w8rVar = this.d;
        if (w8rVar != null) {
            bb7 bb7Var = as1Var.b.c;
            bb7Var.getClass();
            msa msaVar = nsa.b;
            long N = yd5.N(SystemClock.uptimeMillis() - w8rVar.c, ssa.MILLISECONDS);
            x8r x8rVar = w8rVar.d;
            String str2 = w8rVar.a;
            int i = w8rVar.b;
            x8rVar.getClass();
            String a = x8r.a(str2);
            if (a != null) {
                int ordinal = bb7Var.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    str = "mem";
                } else if (ordinal == 2) {
                    str = "disk";
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return;
                    }
                    str = "net";
                }
                x8rVar.b.g("IMG_SHOWED", new leq(i, N, str2, a, str).h());
            }
        }
        this.d = null;
    }

    @Override // defpackage.eun
    public final void b() {
    }

    @Override // defpackage.eun
    public final void d() {
    }
}
