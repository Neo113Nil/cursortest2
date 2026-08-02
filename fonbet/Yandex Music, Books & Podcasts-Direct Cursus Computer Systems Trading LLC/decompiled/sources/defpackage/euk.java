package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.webview.WebViewScreenActivity;

/* loaded from: classes.dex */
public final class euk implements guk, ejm, p7q, l0p {
    public static euk a;

    public static aaq F(n7q n7qVar) {
        n7qVar.getClass();
        return n7qVar instanceof maq ? ((maq) n7qVar).k().getId() : (aaq) wdg.A(n7qVar, ofc.l);
    }

    public static Intent G(Context context, String str, boolean z, xfv xfvVar) {
        context.getClass();
        str.getClass();
        Intent intent = new Intent(context, (Class<?>) WebViewScreenActivity.class);
        intent.putExtra("webview.url", str);
        intent.putExtra("webview.needAuthorization", z);
        intent.putExtra("webview.settings", xfvVar);
        return intent;
    }

    public static int K(n7q n7qVar) {
        n7qVar.getClass();
        return ((gxj) wdg.A(n7qVar, rre.m)).a;
    }

    @Override // defpackage.ejm
    public void B(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.l0p
    public void C0(aab aabVar, e4p e4pVar, int i) {
        aabVar.getClass();
        e4pVar.getClass();
    }

    @Override // defpackage.ejm
    public void E(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.l0p
    public void I(aab aabVar, e4p e4pVar, int i) {
        aabVar.getClass();
        e4pVar.getClass();
    }

    @Override // defpackage.ejm
    public void a(zvs zvsVar, String str, InternalDownloadException internalDownloadException) {
        zvsVar.getClass();
    }

    @Override // defpackage.ejm
    public void b(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.l0p
    public pjc c(aab aabVar) {
        aabVar.getClass();
        return new fs(15, Boolean.FALSE);
    }

    @Override // defpackage.ejm
    public void f(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.l0p
    public void g0(aab aabVar, e4p e4pVar, int i) {
        aabVar.getClass();
        e4pVar.getClass();
    }

    @Override // defpackage.ejm
    public void l(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        aou id = szuVar.a.getId();
        if (id instanceof tnu) {
            return ((tnu) id).b;
        }
        if (id instanceof unu) {
            return ((unu) id).b;
        }
        if (id instanceof znu) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.ejm
    public void o(zvs zvsVar, float f) {
        zvsVar.getClass();
    }

    @Override // defpackage.ejm
    public void p(zvs zvsVar) {
        zvsVar.getClass();
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        aaq id = maqVar.k().getId();
        if (id instanceof dbq) {
            return ((dbq) id).b;
        }
        if (id instanceof ebq) {
            return ((ebq) id).b;
        }
        if (id instanceof fbq) {
            return ((fbq) id).b;
        }
        if ((id instanceof t9q) || (id instanceof u9q) || (id instanceof x9q) || Intrinsics.d(id, y9q.a) || (id instanceof caq) || (id instanceof paq) || (id instanceof cbq) || (id instanceof uaq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.ejm
    public void r(zvs zvsVar, String str, InternalDownloadException internalDownloadException) {
        zvsVar.getClass();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return null;
    }

    @Override // defpackage.ejm
    public void w(zvs zvsVar, String str) {
        zvsVar.getClass();
    }
}
