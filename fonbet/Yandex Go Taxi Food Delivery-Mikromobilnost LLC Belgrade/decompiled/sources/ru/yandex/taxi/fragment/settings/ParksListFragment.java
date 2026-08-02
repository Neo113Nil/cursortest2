package ru.yandex.taxi.fragment.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0g;
import defpackage.afh0;
import defpackage.aq80;
import defpackage.b5g;
import defpackage.bko;
import defpackage.cf90;
import defpackage.crh0;
import defpackage.e840;
import defpackage.f380;
import defpackage.g680;
import defpackage.ge50;
import defpackage.i5m;
import defpackage.je90;
import defpackage.n3w;
import defpackage.pho;
import defpackage.q5z;
import defpackage.rqo;
import defpackage.tt2;
import defpackage.we90;
import defpackage.x770;
import defpackage.xvf0;
import defpackage.ye90;
import defpackage.ze90;
import defpackage.zzf;
import kotlin.Metadata;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.parks.a;
import ru.yandex.taxi.parks.api.ParksApi;
import ru.yandex.taxi.parks.view.ParksContentView;
import ru.yandex.taxi.ui.FragmentBackground;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/yandex/taxi/fragment/settings/ParksListFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lje90;", "La0g;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/yandex/taxi/ui/FragmentBackground;", "getBackground", "()Lru/yandex/taxi/ui/FragmentBackground;", "Lwe90;", "parksDependencies", "Lwe90;", "getParksDependencies", "()Lwe90;", "setParksDependencies", "(Lwe90;)V", "Lrqo;", "experimentProviderFactory", "Lrqo;", "getExperimentProviderFactory", "()Lrqo;", "setExperimentProviderFactory", "(Lrqo;)V", "Companion", "ye90", "parks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParksListFragment extends YandexTaxiFragment<je90, a0g> {
    private static final String ARG_ZONE_NAME = "zoneName";
    public static final ye90 Companion = new ye90();
    public rqo experimentProviderFactory;
    public we90 parksDependencies;

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public FragmentBackground getBackground() {
        return FragmentBackground.NONE;
    }

    public final rqo getExperimentProviderFactory() {
        rqo rqoVar = this.experimentProviderFactory;
        if (rqoVar != null) {
            return rqoVar;
        }
        return null;
    }

    public final we90 getParksDependencies() {
        we90 we90Var = this.parksDependencies;
        if (we90Var != null) {
            return we90Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(crh0.park_list_fragment, container, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String string = requireArguments().getString(ARG_ZONE_NAME);
        if (string == null) {
            string = "";
        }
        zzf zzfVar = ((a0g) injector()).a;
        this.receiverProvider = zzfVar.Yp;
        bko bkoVar = (bko) zzfVar.Sg.get();
        ParksApi parksApi = (ParksApi) zzfVar.fr.get();
        tt2 tt2Var = (tt2) zzfVar.n.get();
        this.parksDependencies = new we90(bkoVar, parksApi, tt2Var, (pho) zzfVar.d0.get());
        this.experimentProviderFactory = (rqo) zzfVar.C.get();
        ParksContentView parksContentView = new ParksContentView(requireContext());
        we90 parksDependencies = getParksDependencies();
        cf90 cf90Var = new cf90(string);
        aq80 aq80Var = new aq80(this);
        parksDependencies.getClass();
        b5g b5gVar = new b5g(parksDependencies, 3);
        n3w a = n3w.a(cf90Var);
        b5g b5gVar2 = new b5g(parksDependencies, 2);
        b5g b5gVar3 = new b5g(parksDependencies, 0);
        e840 e840Var = new e840(b5gVar, a, b5gVar2, new g680((xvf0) new ge50((xvf0) b5gVar, (xvf0) b5gVar3, (xvf0) b5gVar2, (xvf0) a, 18, (byte) 0), (xvf0) new f380(new b5g(parksDependencies, 1), 9), 5), b5gVar3, 26);
        ParksApi parksApi2 = parksDependencies.b;
        q5z.h(parksApi2);
        tt2 tt2Var2 = parksDependencies.c;
        q5z.h(tt2Var2);
        bko bkoVar2 = parksDependencies.a;
        q5z.h(bkoVar2);
        ze90 ze90Var = new ze90(parksApi2, tt2Var2, bkoVar2, cf90Var);
        pho phoVar = parksDependencies.d;
        q5z.h(phoVar);
        parksContentView.parksListPresenter = new a(ze90Var, new x770(phoVar));
        parksContentView.eventsListener = aq80Var;
        parksContentView.parksQuickBlacklister = i5m.a(e840Var);
        ((ViewGroup) nonNullViewById(afh0.container)).addView(parksContentView);
    }

    public final void setExperimentProviderFactory(rqo rqoVar) {
        this.experimentProviderFactory = rqoVar;
    }

    public final void setParksDependencies(we90 we90Var) {
        this.parksDependencies = we90Var;
    }
}
