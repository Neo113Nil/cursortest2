package defpackage;

import com.yandex.plus.webview.api.container.WebViewContainerType;
import com.yandex.plus.webview.core.WebViewMainFrameException;
import com.yandex.plus.webview.internal.contract.impl.loading.b;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.a;

/* loaded from: classes2.dex */
public final class r5u extends jd5 implements di41, xm41, so41 {
    public final long c;
    public final j0g d;
    public final ike g;
    public final i3y h;
    public final /* synthetic */ jn41 b = new jn41();
    public final Set e = Collections.singleton(WebViewContainerType.MAIN);
    public final ArrayList f = new ArrayList();

    public r5u(long j, j0g j0gVar, ws41 ws41Var, jse jseVar) {
        this.c = j;
        this.d = j0gVar;
        this.g = qv10.e(jseVar);
        this.h = a.a(new bdp(22, this, ws41Var));
    }

    public static final ym41 u(r5u r5uVar) {
        Reference reference = (Reference) r5uVar.b.a.get(WebViewContainerType.MAIN);
        if (reference != null) {
            return (ym41) reference.get();
        }
        return null;
    }

    @Override // defpackage.in41
    public final void c() {
        com.yandex.plus.home.common.utils.a.b(this.g);
        v().g();
    }

    @Override // defpackage.in41
    public final void e() {
        com.yandex.plus.home.common.utils.a.b(this.g);
    }

    @Override // defpackage.so41
    public final void f(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            v().h(new WebViewMainFrameException(oyr.i(i, "loading_other_error: errorCode="), str, i));
        }
    }

    @Override // defpackage.in41
    public final void g() {
        com.yandex.plus.home.common.utils.a.b(this.g);
        v().f();
    }

    @Override // defpackage.xm41
    public final Set h() {
        return this.e;
    }

    @Override // defpackage.jd5, defpackage.in41
    public final void i(com.yandex.plus.webview.internal.a aVar, swh swhVar) {
        super.i(aVar, swhVar);
        v().e(swhVar);
    }

    @Override // defpackage.xm41
    public final void j(WebViewContainerType webViewContainerType, ym41 ym41Var) {
        this.b.j(webViewContainerType, ym41Var);
    }

    @Override // defpackage.di41
    public final void k(String str) {
        v().i(str);
    }

    @Override // defpackage.so41
    public final void l(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            v().h(new WebViewMainFrameException(oyr.i(i, "ssl_error: errorCode="), str, i));
        }
    }

    @Override // defpackage.so41
    public final void r(String str, int i, String str2, String str3, boolean z) {
        if (z) {
            v().h(new WebViewMainFrameException(oyr.i(i, "loading_http_error: errorCode="), str, i));
        }
    }

    @Override // defpackage.di41
    public final void s(String str) {
        v().j(str);
    }

    public final b v() {
        return (b) this.h.getValue();
    }
}
