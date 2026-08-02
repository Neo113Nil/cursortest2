package com.yandex.plus.pay.ui.webview.confirmation;

import android.app.Activity;
import com.yandex.plus.webview.core.i;
import defpackage.b6e;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends com.yandex.plus.webview.api.contract.b implements com.yandex.plus.webview.api.security.a, com.yandex.plus.webview.api.security.b, com.yandex.plus.webview.api.a, i {
    public final Activity b;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a c;
    public final com.yandex.plus.pay.ui.common.internal.web.a d;
    public final com.yandex.plus.pay.ui.common.internal.web.b e;
    public final List f;
    public boolean g;
    public int h;

    public b(Activity activity, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, com.yandex.plus.pay.ui.common.internal.web.a aVar2, com.yandex.plus.pay.ui.common.internal.web.b bVar, List list) {
        activity.getClass();
        list.getClass();
        this.b = activity;
        this.c = aVar;
        this.d = aVar2;
        this.e = bVar;
        this.f = list;
        this.h = activity.getRequestedOrientation();
    }

    @Override // com.yandex.plus.webview.api.a
    public final void b(String str) {
        str.getClass();
        this.c.a();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void d(int i, String str, String str2, String str3, boolean z) {
        this.d.d(i, str, str2, str3, z);
        if (z) {
            this.c.s();
        }
    }

    @Override // com.yandex.plus.webview.api.security.a
    public final boolean f(com.yandex.plus.webview.core.resource.c cVar) {
        Object t7oVar;
        cVar.getClass();
        if (!(cVar instanceof com.yandex.plus.webview.core.resource.a)) {
            if (cVar instanceof com.yandex.plus.webview.core.resource.b) {
                return true;
            }
            b6e.s();
            return false;
        }
        int ordinal = ((com.yandex.plus.webview.core.resource.a) cVar).c.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal != 2) {
            b6e.s();
            return false;
        }
        try {
            r7o r7oVar = z7o.b;
            t7oVar = ((com.yandex.plus.webview.core.resource.a) cVar).a.getHost();
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        String str = (String) t7oVar;
        if (str == null) {
            return false;
        }
        List list = this.f;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void g() {
        if (this.g) {
            this.b.setRequestedOrientation(this.h);
            this.g = false;
        }
    }

    @Override // com.yandex.plus.webview.api.contract.d
    public final void h() {
        Activity activity = this.b;
        this.h = activity.getRequestedOrientation();
        int i = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i != 1 ? i != 2 ? -1 : 6 : 7);
        this.g = true;
    }

    @Override // com.yandex.plus.webview.core.i
    public final void k(int i, String str, String str2, String str3, boolean z) {
        this.d.k(i, str, str2, str3, z);
        if (z) {
            this.c.s();
        }
    }

    @Override // com.yandex.plus.webview.api.security.b
    public final void o(com.yandex.plus.webview.core.resource.a aVar) {
        this.e.o(aVar);
        this.c.s();
    }

    @Override // com.yandex.plus.webview.core.i
    public final void u(int i, String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.d.u(i, str, str2, str3, z);
        if (z) {
            this.c.s();
        }
    }

    @Override // com.yandex.plus.webview.api.security.b
    public final void p(com.yandex.plus.webview.core.resource.a aVar) {
    }
}
