package ru.yandex.taxi.router;

import defpackage.bvv;
import defpackage.dds;
import defpackage.tje;
import defpackage.ue0;
import defpackage.xd0;
import defpackage.ye0;
import defpackage.yvf0;
import defpackage.zd0;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.SuggestedFavoritesFragment;

/* loaded from: classes5.dex */
public final class a extends dds {
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a F;
    public final ru.yandex.taxi.deeplinks.b G;
    public final yvf0 H;
    public final xd0 I;
    public ye0 J;

    public a(com.yandex.go.mainscreen.superapp.impl.fragment.a aVar, ru.yandex.taxi.deeplinks.b bVar, yvf0 yvf0Var) {
        super(null);
        this.F = aVar;
        this.G = bVar;
        this.H = yvf0Var;
        this.I = new xd0(this);
        this.J = ue0.b;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.J = ((bvv) obj).c;
        tje.N(o(), null, null, new AddFavoritesFragmentRouterImpl$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        SuggestedFavoritesFragment suggestedFavoritesFragment = (SuggestedFavoritesFragment) baseFragment;
        suggestedFavoritesFragment.setCallbackListener(new zd0(this, suggestedFavoritesFragment));
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        bvv bvvVar = (bvv) obj;
        SuggestedFavoritesFragment.Companion.getClass();
        SuggestedFavoritesFragment suggestedFavoritesFragment = new SuggestedFavoritesFragment();
        suggestedFavoritesFragment.initDataForAddFavoritesScreen = bvvVar;
        suggestedFavoritesFragment.updateInitialPoint(bvvVar.a);
        suggestedFavoritesFragment.setNeedControlViews(false);
        suggestedFavoritesFragment.setNavigator(this.I);
        return suggestedFavoritesFragment;
    }
}
