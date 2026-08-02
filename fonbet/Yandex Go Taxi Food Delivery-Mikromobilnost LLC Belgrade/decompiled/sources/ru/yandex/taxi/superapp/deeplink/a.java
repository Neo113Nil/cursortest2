package ru.yandex.taxi.superapp.deeplink;

import android.net.Uri;
import com.yandex.go.superapp.api.loading_tracker.GlobalLoadingEvent;
import defpackage.f0p;
import defpackage.h3y;
import defpackage.hxx;
import defpackage.lvx;
import defpackage.m5u;
import defpackage.m950;
import defpackage.mfi;
import defpackage.n5u;
import defpackage.o5u;
import defpackage.oep0;
import defpackage.p3p;
import defpackage.pep0;
import defpackage.rit;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v770;
import defpackage.vu2;
import defpackage.xsv0;
import defpackage.yvf0;
import defpackage.z0h;
import defpackage.zzo;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes10.dex */
public final class a implements z0h, vu2 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final yvf0 d;
    public final tse e;
    public final tt2 f;
    public final h3y g;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, yvf0 yvf0Var, tse tseVar, tt2 tt2Var, h3y h3yVar4) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = yvf0Var;
        this.e = tseVar;
        this.f = tt2Var;
        this.g = h3yVar4;
    }

    @Override // defpackage.z0h
    public final Object a(oep0 oep0Var, Uri uri, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return c(oep0Var, uri);
    }

    @Override // defpackage.vu2
    public final Object b(oep0 oep0Var, Uri uri, Continuation continuation) {
        return c(oep0Var, uri);
    }

    public final o5u c(oep0 oep0Var, Uri uri) {
        mfi mfiVar;
        f0p e;
        f0p e2;
        if (uri == null || (((e = (mfiVar = mfi.l).e(uri)) == null || e.a().length() <= 0) && ((uri = ((zzo) this.a.get()).a(uri)) == null || (e2 = mfiVar.e(uri)) == null || e2.a().length() <= 0))) {
            uri = null;
        }
        if (uri == null) {
            return n5u.a;
        }
        this.f.getClass();
        tje.N(this.e, uyj.a, null, new EatskitDeeplinkHandlerImpl$speedUpWebViewCreation$1(this, null), 2);
        ((rit) this.c.get()).a(GlobalLoadingEvent.HANDLE_DEEPLINK);
        ((xsv0) this.b.get()).getClass();
        ((pep0) oep0Var).f((m950) this.d.get(), new p3p(new lvx(xsv0.a(uri), v770.c)), hxx.a);
        return new m5u(false, false);
    }
}
