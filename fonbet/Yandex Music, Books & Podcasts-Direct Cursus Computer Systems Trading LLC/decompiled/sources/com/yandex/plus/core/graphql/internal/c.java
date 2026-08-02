package com.yandex.plus.core.graphql.internal;

import com.yandex.plus.core.graphql.exception.d;
import com.yandex.plus.core.graphql.exception.e;
import com.yandex.plus.core.graphql.u0;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.fp0;
import defpackage.gs4;
import defpackage.hp0;
import defpackage.ip0;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class c {
    public final dp0 a;

    public c(dp0 dp0Var) {
        this.a = dp0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:41|42))(3:43|44|(1:46))|12|(3:14|15|(1:38)(3:17|18|(2:20|(2:22|(2:24|25)(2:27|28))(2:29|30))(2:31|32)))(2:39|40)))|54|6|7|(0)(0)|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0035, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007d, code lost:
    
        r3 = defpackage.z7o.b;
        r3 = new defpackage.t7o(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007a, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0033, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0031, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0073, code lost:
    
        r3 = defpackage.z7o.b;
        r3 = new defpackage.t7o(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x0031, CancellationException -> 0x0033, wis -> 0x0035, TryCatch #3 {wis -> 0x0035, CancellationException -> 0x0033, all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0058, B:14:0x005e, B:39:0x0061, B:40:0x0072, B:44:0x0041), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061 A[Catch: all -> 0x0031, CancellationException -> 0x0033, wis -> 0x0035, TryCatch #3 {wis -> 0x0035, CancellationException -> 0x0033, all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0058, B:14:0x005e, B:39:0x0061, B:40:0x0072, B:44:0x0041), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0 u0Var, cg6 cg6Var) {
        b bVar;
        int i;
        Object obj;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    dp0 dp0Var = this.a;
                    u0Var.getClass();
                    gs4 gs4Var = new gs4(dp0Var, u0Var);
                    bVar.j = u0Var;
                    bVar.m = 1;
                    obj2 = gs4Var.p(bVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u0Var = bVar.j;
                    qgg.h0(obj2);
                }
                obj = ((kp0) obj2).c;
                if (obj != null) {
                    throw new IllegalArgumentException("Response data is null: ".concat(u0Var.name()).toString());
                }
                r7o r7oVar2 = z7o.b;
                Throwable a = z7o.a(obj);
                if (a == null) {
                    return obj;
                }
                try {
                    String name = u0Var.name();
                    if (a instanceof fp0) {
                        fp0 fp0Var = (fp0) a;
                        throw new com.yandex.plus.core.graphql.exception.b("Http exception: ".concat(name), fp0Var, fp0Var.a);
                    }
                    if (a instanceof hp0) {
                        throw new com.yandex.plus.core.graphql.exception.c("Network exception: ".concat(name), a);
                    }
                    if (a instanceof ip0) {
                        throw new d("Parse exception: ".concat(name), a);
                    }
                    throw new e(a.getMessage(), a);
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    return new t7o(th);
                }
            }
        }
        bVar = new b(this, cg6Var);
        Object obj22 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        obj = ((kp0) obj22).c;
        if (obj != null) {
        }
    }
}
