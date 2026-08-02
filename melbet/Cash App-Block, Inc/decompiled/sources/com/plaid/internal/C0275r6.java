package com.plaid.internal;

import android.content.Context;
import com.plaid.internal.C0095a6;
import com.plaid.internal.F6;
import com.plaid.internal.Y6;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;

/* renamed from: com.plaid.internal.r6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0275r6 {
    public final ExecutorService a;
    public final C0259p7 b;
    public final C0302u6 c;
    public final C0284s6 d;

    public C0275r6(Context context, InterfaceC0178g7 interfaceC0178g7) {
        interfaceC0178g7.getClass();
        this.a = Executors.newSingleThreadExecutor();
        C0302u6 c0302u6 = new C0302u6(interfaceC0178g7);
        this.c = c0302u6;
        C0284s6 c0284s6 = new C0284s6(interfaceC0178g7);
        this.d = c0284s6;
        C0220l4 c0220l4 = new C0220l4(context);
        E0 e0 = new E0(context);
        C0314w0 c0314w0 = new C0314w0(new C0305v0(c0220l4, EnumC0202j4.CELLULAR, new C0250o7(), new C0287t0()));
        C0278s0 c0278s0 = new C0278s0();
        this.b = new C0259p7(new C0242o(new A7(), c0314w0, new C0296u0(), c0302u6, c0278s0, c0284s6), e0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.plaid.internal.s6] */
    public static final void a(C0275r6 c0275r6, C0293t6 c0293t6) {
        c0275r6.getClass();
        c0293t6.getClass();
        try {
            F6.a.a("ProveSNA - start isAuthenticationPossible");
            c0275r6.b.b();
            F6.a.a("ProveSNA - isAuthenticationPossible success");
            String a = c0293t6.a();
            c0275r6.c.b = a;
            c0275r6.d.b = a;
            try {
                try {
                    F6.a.a("ProveSNA - start authenticate");
                    c0275r6.b.a();
                    C0095a6.a.a(C0095a6.a, "Prove SNA success");
                    F6.a.a("ProveSNA - authenticate success");
                    c0275r6.c.b = null;
                } catch (Throwable th) {
                    c0275r6.c.b = null;
                    c0275r6.d.b = null;
                    throw th;
                }
            } catch (Exception e) {
                F6.a.a(MapsKt__MapsJVMKt.mapOf(new Pair("Exception", e.toString())), "ProveSNA - authenticate failure");
                Y6.a.a("Prove SNA failure - exception: " + e);
                c0275r6.c.b = null;
            }
            c0275r6 = c0275r6.d;
            c0275r6.b = null;
        } catch (Exception e2) {
            F6.a.a(MapsKt__MapsJVMKt.mapOf(new Pair("Exception", e2.toString())), "ProveSNA - isAuthenticationPossible failure");
            Y6.a.a("Prove SNA authentication is not possible- exception: " + e2);
        }
    }

    public final void a(C0293t6 c0293t6) {
        c0293t6.getClass();
        this.a.submit(new r6$$ExternalSyntheticLambda0(0, this, c0293t6));
    }
}
