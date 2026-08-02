package com.yandex.plus.pay.ui.webview.common.diagnostic;

import android.net.Uri;
import com.yandex.plus.domain.auth.impl.i;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class c implements com.yandex.plus.webview.api.request.b {
    public final i a;
    public final com.yandex.plus.log.api.b b;

    public c(i iVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = iVar;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.webview.api.request.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, Continuation continuation) {
        b bVar;
        int i;
        String uri;
        Object h;
        boolean z;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bVar.l;
                nm6 nm6Var = nm6.a;
                i = bVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            buildUpon.appendQueryParameter(str2, (String) it.next());
                        }
                    }
                    uri = buildUpon.build().toString();
                    uri.getClass();
                    bVar.j = str;
                    bVar.k = uri;
                    bVar.n = 1;
                    h = this.a.h(str, bVar);
                    if (h == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = bVar.k;
                    String str4 = bVar.j;
                    qgg.h0(obj);
                    h = ((z7o) obj).a;
                    uri = str3;
                    str = str4;
                }
                r7o r7oVar = z7o.b;
                z = h instanceof t7o;
                com.yandex.plus.log.api.b bVar2 = this.b;
                if (!z) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "PlusPayWebViewAuthorizedUrlCreator", "Injected cookie for " + str);
                    }
                }
                if (z7o.a(h) != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusPayWebViewAuthorizedUrlCreator", "Failed to inject cookie for " + str);
                    }
                }
                return uri;
            }
        }
        bVar = new b(this, (cg6) continuation);
        Object obj2 = bVar.l;
        nm6 nm6Var2 = nm6.a;
        i = bVar.n;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        z = h instanceof t7o;
        com.yandex.plus.log.api.b bVar22 = this.b;
        if (!z) {
        }
        if (z7o.a(h) != null) {
        }
        return uri;
    }
}
