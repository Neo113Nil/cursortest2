package ru.yandex.taxi.factories;

import android.content.Context;
import android.view.View;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.atd0;
import defpackage.bvv;
import defpackage.dmn;
import defpackage.ee0;
import defpackage.fe0;
import defpackage.h0w;
import defpackage.he0;
import defpackage.hxx;
import defpackage.krl0;
import defpackage.m950;
import defpackage.mrj;
import defpackage.n621;
import defpackage.ny61;
import defpackage.p9t0;
import defpackage.q5z;
import defpackage.qmp;
import defpackage.s6k0;
import defpackage.tj60;
import defpackage.tls;
import defpackage.tt2;
import defpackage.u500;
import defpackage.w030;
import defpackage.wd0;
import defpackage.xd0;
import defpackage.ydp;
import defpackage.ze0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.view.AddFavoritesModalView;
import ru.yandex.taxi.view.c;

/* loaded from: classes5.dex */
public final class a implements ee0 {
    public final m a;
    public final ru.yandex.taxi.favorites.address.api.experiment.a b;

    public a(m mVar, ru.yandex.taxi.favorites.address.api.experiment.a aVar) {
        this.a = mVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v6, types: [tls] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View$OnLayoutChangeListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w030 w030Var, bvv bvvVar, ze0 ze0Var, dmn dmnVar, p9t0 p9t0Var, he0 he0Var, ContinuationImpl continuationImpl) {
        AddFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1 addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1;
        int i;
        w030 w030Var2;
        he0 he0Var2;
        Object obj;
        dmn dmnVar2;
        p9t0 p9t0Var2;
        ze0 ze0Var2;
        bvv bvvVar2;
        if (continuationImpl instanceof AddFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1) {
            addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1 = (AddFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1) continuationImpl;
            int i2 = addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.label;
                if (i != 0) {
                    b.b(obj2);
                    w030Var2 = w030Var;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$0 = w030Var2;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$1 = bvvVar;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$2 = ze0Var;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$3 = dmnVar;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$4 = p9t0Var;
                    he0Var2 = he0Var;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$5 = he0Var2;
                    addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.label = 1;
                    Object g = this.b.g(addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = g;
                    dmnVar2 = dmnVar;
                    p9t0Var2 = p9t0Var;
                    ze0Var2 = ze0Var;
                    bvvVar2 = bvvVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    he0 he0Var3 = (he0) addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$5;
                    ?? r4 = (tls) addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$4;
                    ?? r5 = (View.OnLayoutChangeListener) addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$3;
                    ze0 ze0Var3 = (ze0) addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$2;
                    bvv bvvVar3 = (bvv) addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$1;
                    w030 w030Var3 = (w030) addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.L$0;
                    b.b(obj2);
                    he0Var2 = he0Var3;
                    dmnVar2 = r5;
                    ze0Var2 = ze0Var3;
                    bvvVar2 = bvvVar3;
                    obj = obj2;
                    w030Var2 = w030Var3;
                    p9t0Var2 = r4;
                }
                int i3 = 0;
                if (((Boolean) obj).booleanValue()) {
                    bvvVar2.getClass();
                    ze0Var2.getClass();
                    p9t0Var2.getClass();
                    m mVar = this.a;
                    Context context = (Context) mVar.j;
                    q5z.h(context);
                    p9t0 p9t0Var3 = p9t0Var2;
                    zuj0 zuj0Var = (zuj0) mVar.a;
                    q5z.h(zuj0Var);
                    h0w h0wVar = new h0w(18, ze0Var2, zuj0Var);
                    fe0 fe0Var = new fe0();
                    ru.yandex.taxi.favorites.data.repo.a aVar = (ru.yandex.taxi.favorites.data.repo.a) mVar.d;
                    q5z.h(aVar);
                    ru.yandex.taxi.mappers.a aVar2 = new ru.yandex.taxi.mappers.a(bvvVar2, ze0Var2, h0wVar, fe0Var, aVar);
                    fe0 fe0Var2 = new fe0();
                    n621 n621Var = (n621) mVar.b;
                    q5z.h(n621Var);
                    atd0 atd0Var = (atd0) mVar.c;
                    q5z.h(atd0Var);
                    qmp qmpVar = (qmp) mVar.h;
                    q5z.h(qmpVar);
                    krl0 krl0Var = new krl0(aVar, qmpVar);
                    tj60 tj60Var = (tj60) mVar.g;
                    q5z.h(tj60Var);
                    s6k0 s6k0Var = new s6k0(context, tj60Var, ze0Var2);
                    u500 u500Var = (u500) mVar.e;
                    q5z.h(u500Var);
                    mrj mrjVar = (mrj) mVar.f;
                    tt2 tt2Var = (tt2) mVar.i;
                    q5z.h(tt2Var);
                    AddFavoritesModalView addFavoritesModalView = new AddFavoritesModalView(context, new c(aVar2, fe0Var2, n621Var, bvvVar2, atd0Var, ze0Var2, krl0Var, zuj0Var, s6k0Var, u500Var, mrjVar, tt2Var), p9t0Var3);
                    addFavoritesModalView.addOnLayoutChangeListener(dmnVar2);
                    w030Var2.s(addFavoritesModalView, false);
                } else {
                    FavoriteAddress favoriteAddress = new FavoriteAddress(null, null, null, bvvVar2.a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194287);
                    ru.yandex.taxi.router.a aVar3 = ((xd0) he0Var2).a;
                    aVar3.E((m950) aVar3.H.get(), new ydp(favoriteAddress, true, null, aVar3.J, 8), new wd0(i3, p9t0Var2, aVar3), hxx.a);
                }
                return zy11.a;
            }
        }
        addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1 = new AddFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1(this, continuationImpl);
        Object obj22 = addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFavoritesModalViewFactoryImpl$showAddFavoritesModalView$1.label;
        if (i != 0) {
        }
        int i32 = 0;
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
