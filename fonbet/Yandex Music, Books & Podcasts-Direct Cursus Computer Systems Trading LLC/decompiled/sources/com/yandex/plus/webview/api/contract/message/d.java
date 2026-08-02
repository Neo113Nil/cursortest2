package com.yandex.plus.webview.api.contract.message;

import android.webkit.JavascriptInterface;
import com.yandex.plus.core.analytics.logging.e;
import defpackage.cg6;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.wct;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d implements com.yandex.plus.webview.api.javascript.a {
    public final com.yandex.plus.webview.api.message.a a;
    public final kotlinx.coroutines.a b;
    public final LinkedHashMap c;
    public tf6 d;

    public d(com.yandex.plus.webview.api.message.a aVar, kotlinx.coroutines.a aVar2) {
        aVar2.getClass();
        this.a = aVar;
        this.b = aVar2;
        this.c = new LinkedHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(1:15)|(1:17)|18))|33|6|7|(0)(0)|12|13|(0)|(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, String str, cg6 cg6Var) {
        c cVar;
        Object obj;
        int i;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                obj = cVar.k;
                nm6 nm6Var = nm6.a;
                i = cVar.m;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    kotlinx.coroutines.a aVar = dVar.b;
                    b bVar = new b(dVar, str, continuation, i3);
                    cVar.j = str;
                    cVar.m = 1;
                    obj = x97.V(aVar, bVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = cVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                if (obj instanceof t7o) {
                    obj = null;
                }
                if (obj == null) {
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.c;
                    String g = f1d.g("Message parsing error, message=", str);
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.d, bVar2, g, null);
                }
                return obj;
            }
        }
        cVar = new c(dVar, cg6Var);
        obj = cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = cVar.m;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        if (obj instanceof t7o) {
        }
        if (obj == null) {
        }
        return obj;
    }

    public final void c(Class cls, Function1 function1) {
        if (!wct.D(1, function1)) {
            function1 = null;
        }
        if (function1 == null) {
            return;
        }
        this.c.put(cls, function1);
    }

    @Override // com.yandex.plus.webview.api.javascript.a
    @JavascriptInterface
    public void onMessage(@NotNull String str) {
        str.getClass();
        tf6 tf6Var = this.d;
        if (tf6Var == null) {
            xq0.q("Coroutine scope needs to be initialized");
        } else {
            x97.y(tf6Var, null, null, new b(this, str, null, 0), 3);
        }
    }
}
