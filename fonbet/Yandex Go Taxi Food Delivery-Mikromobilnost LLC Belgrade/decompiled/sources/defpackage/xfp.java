package defpackage;

import android.os.Bundle;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.favorites.edit.FavoriteEditFragment;

/* loaded from: classes5.dex */
public final class xfp extends dds {
    public final a F;
    public final bip G;
    public final xsi H;
    public final yvf0 I;
    public final l01 J;
    public final eqe K;

    public xfp(a aVar, bip bipVar, xsi xsiVar, yvf0 yvf0Var, l01 l01Var, eqe eqeVar) {
        super(null);
        this.F = aVar;
        this.G = bipVar;
        this.H = xsiVar;
        this.I = yvf0Var;
        this.J = l01Var;
        this.K = eqeVar;
    }

    public static final void V(xfp xfpVar, pv0 pv0Var, zzs zzsVar, MapFragment.a aVar) {
        zzs B;
        boolean a = xfpVar.J.a(tz0.a);
        int i = 0;
        hxx hxxVar = hxx.a;
        if (!a) {
            xfpVar.E((m950) xfpVar.H.get(), pv0Var != null ? new aep(pv0Var) : zzsVar != null ? new bep(zzsVar) : cep.a, new wfp(aVar, 0), hxxVar);
            return;
        }
        if (pv0Var != null && (B = pv0Var.a.B()) != null) {
            zzsVar = B;
        }
        xfpVar.E((m950) xfpVar.I.get(), new u11(zzsVar != null ? new ymu(6, zzsVar, (Object) null) : null, f11.a, AddressMapPickerSourceScreen.Superapp), new vfp(aVar, i), hxxVar);
    }

    @Override // defpackage.dds
    public final a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        ((FavoriteEditFragment) baseFragment).setCallbackListener(new ufp(this, (jip) obj));
    }

    @Override // defpackage.dds
    public final xbs S(Object obj) {
        return new vbs(FragmentAnimation$TransitionType.ENTER);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        ofp ofpVar = FavoriteEditFragment.Companion;
        EditArguments editArguments = ((jip) obj).a;
        ofpVar.getClass();
        FavoriteEditFragment favoriteEditFragment = new FavoriteEditFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("argument_key", editArguments);
        favoriteEditFragment.setArguments(bundle);
        return favoriteEditFragment;
    }

    @Override // defpackage.dds
    public final xbs U() {
        return new vbs(FragmentAnimation$TransitionType.RETURN);
    }
}
