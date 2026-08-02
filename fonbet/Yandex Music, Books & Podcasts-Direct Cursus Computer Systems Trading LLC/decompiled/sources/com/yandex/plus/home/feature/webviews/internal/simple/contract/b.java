package com.yandex.plus.home.feature.webviews.internal.simple.contract;

import com.yandex.plus.bdui.q;
import com.yandex.plus.webview.core.d;
import defpackage.syc;
import defpackage.zyc;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements com.yandex.plus.webview.api.redirect.a, zyc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function2 b;

    public b(q qVar) {
        qVar.getClass();
        this.b = qVar;
    }

    @Override // com.yandex.plus.webview.api.redirect.a
    public final /* synthetic */ boolean a(d dVar, com.yandex.plus.webview.core.resource.c cVar) {
        switch (this.a) {
        }
        return ((Boolean) this.b.invoke(dVar, cVar)).booleanValue();
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof com.yandex.plus.webview.api.redirect.a) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof com.yandex.plus.webview.api.redirect.a) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    public b(Function2 function2) {
        function2.getClass();
        this.b = function2;
    }
}
