package defpackage;

import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;

/* loaded from: classes6.dex */
public final class yz41 implements mz41 {
    public final /* synthetic */ WhoRideSelectorModalView a;

    public yz41(WhoRideSelectorModalView whoRideSelectorModalView) {
        this.a = whoRideSelectorModalView;
    }

    @Override // defpackage.mz41
    public final void re(int i) {
        a051 binding;
        binding = this.a.getBinding();
        binding.b.setImageResource(i);
    }

    @Override // defpackage.mz41
    public final void showPhoto(String str) {
        pav pavVar;
        a051 binding;
        int i = csg0.who_ride_avatar_size;
        WhoRideSelectorModalView whoRideSelectorModalView = this.a;
        int r = tje.r(i, whoRideSelectorModalView.getContext());
        pavVar = whoRideSelectorModalView.imageLoader;
        binding = whoRideSelectorModalView.getBinding();
        nac nacVar = (nac) pavVar.a(binding.b);
        nacVar.g(nfv.a);
        nacVar.f(r, r);
        nacVar.e(i0h0.ic_passenger_yourself);
        nacVar.c(str);
    }
}
