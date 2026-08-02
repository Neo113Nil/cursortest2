package com.yandex.plus.core.network.api.interceptors;

import android.net.Uri;
import com.connectsdk.etc.helper.HttpMessage;
import com.yandex.passport.internal.ui.social.i;
import com.yandex.plus.home.internal.di.n;
import defpackage.aur;
import defpackage.b0o;
import defpackage.bse;
import defpackage.d0o;
import defpackage.ezc;
import defpackage.h0o;
import defpackage.l3o;
import defpackage.o3o;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.s7e;
import defpackage.t7o;
import defpackage.u7e;
import defpackage.ukn;
import defpackage.x97;
import defpackage.z7o;
import defpackage.zvd;
import java.net.URI;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a implements bse {
    public final /* synthetic */ int a;
    public final Object b;

    public a(com.yandex.plus.pay.diagnostic.impl.c cVar) {
        this.a = 5;
        cVar.getClass();
        this.b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [t7o] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        Uri d;
        l3o t7oVar;
        int i = this.a;
        ?? r3 = 0;
        ?? r32 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                b0o b = ((d0o) uknVar.i).b();
                b.d("Accept-Language", (String) ((ezc) obj).invoke());
                return uknVar.f(b.b());
            case 1:
                b0o b2 = ((d0o) uknVar.i).b();
                String str = (String) x97.D(g.a, new i(this, r3 == true ? 1 : 0, 9));
                if (str == null || StringsKt.U(str)) {
                    b2.c.I("Authorization");
                } else {
                    b2.d("Authorization", "OAuth ".concat(str));
                }
                return uknVar.f(b2.b());
            case 2:
                if (((e) obj).f()) {
                    throw new com.yandex.plus.core.network.api.exceptions.a("Can't proceed request, offline mode is enabled!");
                }
                return uknVar.f((d0o) uknVar.i);
            case 3:
                b0o b3 = ((d0o) uknVar.i).b();
                b3.d(HttpMessage.USER_AGENT, (String) obj);
                return uknVar.f(b3.b());
            case 4:
                n nVar = (n) obj;
                switch (nVar.a) {
                    case 0:
                        d = nVar.b.d();
                        break;
                    case 1:
                        d = nVar.b.g();
                        break;
                    default:
                        d = nVar.b.e();
                        break;
                }
                d0o d0oVar = (d0o) uknVar.i;
                u7e u7eVar = d0oVar.a;
                if (!Intrinsics.d(d.getScheme(), u7eVar.a) || !Intrinsics.d(d.getHost(), u7eVar.d)) {
                    s7e f = d0oVar.a.f();
                    String scheme = d.getScheme();
                    if (scheme == null) {
                        scheme = "";
                    }
                    f.n(scheme);
                    String host = d.getHost();
                    f.g(host != null ? host : "");
                    u7e e = f.e();
                    b0o b4 = d0oVar.b();
                    b4.a = e;
                    d0oVar = b4.b();
                }
                return uknVar.f(d0oVar);
            case 5:
                d0o d0oVar2 = (d0o) uknVar.i;
                d0oVar2.getClass();
                u7e u7eVar2 = d0oVar2.a;
                zvd zvdVar = d0oVar2.c;
                if (zvdVar.a("X-APOLLO-OPERATION-NAME") != null) {
                    return uknVar.f(d0oVar2);
                }
                String a = zvdVar.a("X-Request-Id");
                h0o h0oVar = d0oVar2.d;
                String H = h0oVar != null ? com.yandex.plus.bdui.flex.ui.a.H(h0oVar) : null;
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = uknVar.f(d0oVar2);
                    if (!t7oVar.b()) {
                        com.yandex.plus.pay.diagnostic.impl.c cVar = (com.yandex.plus.pay.diagnostic.impl.c) obj;
                        URI j = u7eVar2.j();
                        o3o o3oVar = t7oVar.g;
                        cVar.a(j, a, H, o3oVar != null ? com.yandex.plus.bdui.flex.ui.a.I(o3oVar) : null, Integer.valueOf(t7oVar.d), null);
                    }
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    ((com.yandex.plus.pay.diagnostic.impl.c) obj).a(u7eVar2.j(), a, H, a2.getMessage(), null, a2);
                }
                qgg.h0(t7oVar);
                return t7oVar;
            default:
                String str2 = (String) x97.D(g.a, new i(this, r32 == true ? 1 : 0, 29));
                d0o d0oVar3 = (d0o) uknVar.i;
                if (str2 != null) {
                    b0o b5 = d0oVar3.b();
                    b5.d("X-OAuth-Token", str2);
                    b5.d("Authorization", "OAuth ".concat(str2));
                    d0oVar3 = b5.b();
                }
                return uknVar.f(d0oVar3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0 function0) {
        this.a = 0;
        this.b = (ezc) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function1 function1) {
        this.a = 1;
        this.b = (aur) function1;
    }

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
