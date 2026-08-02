package ru.yandex.taxi.fragment.favorites.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerSourceScreen;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.a0g;
import defpackage.ag9;
import defpackage.b61;
import defpackage.bdp;
import defpackage.bjp;
import defpackage.bts0;
import defpackage.bvv;
import defpackage.c0g;
import defpackage.c61;
import defpackage.car0;
import defpackage.cep;
import defpackage.ddf;
import defpackage.df4;
import defpackage.edj;
import defpackage.f11;
import defpackage.g28;
import defpackage.gjp;
import defpackage.hjp;
import defpackage.hxx;
import defpackage.ihf;
import defpackage.ijp;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kjp;
import defpackage.kyh0;
import defpackage.lip;
import defpackage.ljp;
import defpackage.m3o;
import defpackage.m950;
import defpackage.mip;
import defpackage.mjp;
import defpackage.nfp;
import defpackage.p51;
import defpackage.pv0;
import defpackage.qe0;
import defpackage.rjp;
import defpackage.rwp0;
import defpackage.sls;
import defpackage.sme0;
import defpackage.sxo;
import defpackage.tdh0;
import defpackage.tf91;
import defpackage.tj60;
import defpackage.tls;
import defpackage.tz0;
import defpackage.u11;
import defpackage.uhm;
import defpackage.uhp;
import defpackage.ul51;
import defpackage.vfp;
import defpackage.vip;
import defpackage.w030;
import defpackage.wfp;
import defpackage.wkn;
import defpackage.xzf;
import defpackage.z81;
import defpackage.z9r0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;
import ru.yandex.taxi.favorites.edit.arguments.Existing;
import ru.yandex.taxi.favorites.list.ui.FavoritesView;
import ru.yandex.taxi.favorites.list.ui.f;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 k2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002l\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010$J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u0010\bJ\u0015\u00102\u001a\u00020\u00132\u0006\u0010\"\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b8\u0010$J\u001f\u0010:\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b<\u0010$J\u0015\u0010>\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020=¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020=¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010?J\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ1\u0010J\u001a\u00020\u00132\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00130E2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00130GH\u0002¢\u0006\u0004\bJ\u0010KJ1\u0010L\u001a\u00020\u00132\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00130E2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00130GH\u0002¢\u0006\u0004\bL\u0010KJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0016\u0010j\u001a\u0004\u0018\u00010g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lru/yandex/taxi/fragment/favorites/list/FavoritesFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lhjp;", "La0g;", "Lvip;", "Ldf4;", "Lihf;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "onPause", "onDestroyView", "Lrjp;", "uiState", "render", "(Lrjp;)V", "Lcom/yandex/go/address/models/FavoriteAddress;", "address", "editFavoriteAddress", "(Lcom/yandex/go/address/models/FavoriteAddress;)V", "pickFavoriteAddress", "", "rideId", "Lz9r0;", "bottomModalParams", "showRideSettingsModal", "(Ljava/lang/String;Lz9r0;)V", "Lcom/yandex/go/address/models/PlaceType;", "placeType", "addSuggestedAddress", "(Lcom/yandex/go/address/models/PlaceType;)V", "showTooltipTitle", "Lcom/yandex/go/address/models/Address;", "addAddressFromRawParams", "(Lcom/yandex/go/address/models/Address;)V", "Lmip;", "payload", "setDatumType", "(Lmip;)V", "addNewFavorite", "addressId", "updateAddress", "(Ljava/lang/String;Lcom/yandex/go/address/models/FavoriteAddress;)V", "removeAddress", "Lg28;", "removeCandidate", "(Lg28;)V", "markAsViewed", "addFavoriteAddress", "", "onBackPressed", "()Z", "Lkotlin/Function0;", "onPointOnMap", "Lkotlin/Function1;", "Lpv0;", "onAddressPicked", "searchAddress", "(Lsls;Ltls;)V", "showAddressPicker", "Lmjp;", "addressSearchComponent", "()Lmjp;", "Lru/yandex/taxi/favorites/list/ui/f;", "presenter", "Lru/yandex/taxi/favorites/list/ui/f;", "Lbts0;", "slotItemViewFactory", "Lbts0;", "Ljava/lang/Runnable;", "backAction", "Ljava/lang/Runnable;", "Lru/yandex/taxi/favorites/list/ui/FavoritesView;", "layoutView", "Lru/yandex/taxi/favorites/list/ui/FavoritesView;", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lru/yandex/taxi/widget/utils/e;", "Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "addressDatumType", "Lcom/yandex/go/address/models/FavoriteAddressDatumType;", "getBusinessName", "()Ljava/lang/String;", "businessName", "getPromoName", "promoName", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "Companion", "lip", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FavoritesFragment extends YandexTaxiFragment<hjp, a0g> implements vip, df4, ihf {
    public static final int $stable = 8;
    public static final lip Companion = new lip();
    private FavoriteAddressDatumType addressDatumType;
    private Runnable backAction;
    private FavoritesView layoutView;
    private e mediaInfoConverter;
    private f presenter;
    private bts0 slotItemViewFactory;

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addSuggestedAddress$lambda$0(FavoritesFragment favoritesFragment, PlaceType placeType) {
        ljp ljpVar = favoritesFragment.requireCallback().a;
        gjp gjpVar = new gjp(ljpVar, placeType);
        boolean a = ljpVar.V.a(tz0.a);
        int i = 1;
        hxx hxxVar = hxx.a;
        if (a) {
            ljpVar.E((m950) ljpVar.U.get(), new u11(null, f11.a, AddressMapPickerSourceScreen.Superapp), new vfp(gjpVar, i), hxxVar);
        } else {
            ljpVar.E((m950) ljpVar.T.get(), cep.a, new wfp(gjpVar, i), hxxVar);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 addSuggestedAddress$lambda$1(FavoritesFragment favoritesFragment, PlaceType placeType, pv0 pv0Var) {
        hjp requireCallback = favoritesFragment.requireCallback();
        Address address = pv0Var.a;
        ljp ljpVar = requireCallback.a;
        EditArguments.Companion.getClass();
        ljp.W(ljpVar, wkn.a(address, placeType), false);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final mjp addressSearchComponent() {
        c0g c0gVar = ((a0g) injector()).b;
        w030 modalViewCoordinator = modalViewCoordinator();
        ddf ddfVar = new ddf(11, new rwp0(RoutePointType.FAVORITE, false));
        m3o m3oVar = m3o.b;
        modalViewCoordinator.getClass();
        m3oVar.getClass();
        return new xzf(ddfVar, m3oVar, c0gVar);
    }

    public static final FavoritesFragment newInstance(f fVar, e eVar, bts0 bts0Var, Runnable runnable) {
        Companion.getClass();
        FavoritesFragment favoritesFragment = new FavoritesFragment();
        favoritesFragment.presenter = fVar;
        favoritesFragment.mediaInfoConverter = eVar;
        favoritesFragment.slotItemViewFactory = bts0Var;
        favoritesFragment.backAction = runnable;
        return favoritesFragment;
    }

    private final void searchAddress(sls onPointOnMap, tls onAddressPicked) {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        ((ul51) fVar.D).getClass();
        showAddressPicker(onPointOnMap, new sxo(4, this, onAddressPicked));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 searchAddress$lambda$0(FavoritesFragment favoritesFragment, tls tlsVar, pv0 pv0Var) {
        Address address = pv0Var.a;
        FavoriteAddressDatumType favoriteAddressDatumType = favoritesFragment.addressDatumType;
        if (favoriteAddressDatumType == null) {
            favoriteAddressDatumType = null;
        }
        address.V1(favoriteAddressDatumType);
        tlsVar.invoke(pv0Var);
        return zy11.a;
    }

    private final void showAddressPicker(sls onPointOnMap, tls onAddressPicked) {
        p51 p51Var = AddressSearchModalView.Companion;
        c61 c61Var = AddressSearchView.Companion;
        mjp addressSearchComponent = addressSearchComponent();
        c61Var.getClass();
        b61 b61Var = new b61(addressSearchComponent);
        b61Var.j = tdh0.suggested_favorites;
        b61Var.q = new ag9(onPointOnMap);
        b61Var.n = c.G(kyh0.favorite_address_search_hint, asView());
        b61Var.p = false;
        p51Var.getClass();
        AddressSearchModalView a = p51.a(b61Var);
        a.setOnAddressPickedListener(new nfp(1, onAddressPicked));
        modalViewCoordinator().s(a, true);
    }

    public final void addAddressFromRawParams(Address address) {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        ((ul51) fVar.D).getClass();
        FavoriteAddressDatumType favoriteAddressDatumType = this.addressDatumType;
        address.V1(favoriteAddressDatumType != null ? favoriteAddressDatumType : null);
        hjp requireCallback = requireCallback();
        ljp ljpVar = requireCallback.a;
        wkn wknVar = EditArguments.Companion;
        PlaceType placeType = requireCallback.b.i;
        wknVar.getClass();
        ljp.W(ljpVar, wkn.a(address, placeType), false);
    }

    @Override // defpackage.vip
    public void addFavoriteAddress(g28 address) {
        ljp ljpVar = requireCallback().a;
        ljpVar.E((m950) ljpVar.R.get(), new bvv(address.e.getPoint(), z81.f(address.e), qe0.b, null, null, false, null, 248), new ijp(ljpVar, address), hxx.a);
    }

    public final void addNewFavorite(FavoriteAddress address) {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        fVar.Lg(address);
    }

    @Override // defpackage.vip
    public void addSuggestedAddress(PlaceType placeType) {
        searchAddress(new bdp(1, this, placeType), new sxo(3, this, placeType));
    }

    @Override // defpackage.vip
    public void editFavoriteAddress(FavoriteAddress address) {
        ljp ljpVar = requireCallback().a;
        EditArguments.Companion.getClass();
        ljp.W(ljpVar, new Existing(address), false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getBusinessName() {
        return "favorites";
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment
    public String getPromoName() {
        return getBusinessName();
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        return Screen.FAVORITES;
    }

    public final void markAsViewed(g28 address) {
        f fVar = this.presenter;
        Object obj = null;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        String str = address.b;
        if (str != null) {
            uhp uhpVar = fVar.B.a;
            sme0 sme0Var = uhpVar.a;
            kgx[] kgxVarArr = uhp.b;
            Set M0 = a.M0((Set) sme0Var.getValue(uhpVar, kgxVarArr[0]));
            M0.add(str);
            uhpVar.a.setValue(uhpVar, kgxVarArr[0], M0);
        }
        bjp bjpVar = fVar.I;
        Iterator it = bjpVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((g28) next).b, address.b)) {
                obj = next;
                break;
            }
        }
        g28 g28Var = (g28) obj;
        if (g28Var != null) {
            g28Var.a = false;
        }
        bjpVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ((tj60) ((a0g) injector()).b.t7.get()).f();
    }

    @Override // defpackage.df4
    public boolean onBackPressed() {
        Runnable runnable = this.backAction;
        if (runnable == null) {
            runnable = null;
        }
        runnable.run();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Context requireContext = requireContext();
        f fVar = this.presenter;
        f fVar2 = fVar == null ? null : fVar;
        e eVar = this.mediaInfoConverter;
        e eVar2 = eVar == null ? null : eVar;
        bts0 bts0Var = this.slotItemViewFactory;
        FavoritesView favoritesView = new FavoritesView(requireContext, null, 0, fVar2, eVar2, bts0Var == null ? null : bts0Var);
        this.layoutView = favoritesView;
        return favoritesView.asViewGroup();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FavoritesView favoritesView = this.layoutView;
        if (favoritesView != null) {
            favoritesView.clearAdapter();
        }
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        fVar.Cg();
        super.onDestroyView();
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, androidx.fragment.app.Fragment
    public void onPause() {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        fVar.pause();
        super.onPause();
    }

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment, ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        fVar.resume();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ViewGroup asViewGroup;
        super.onViewCreated(view, savedInstanceState);
        FavoritesView favoritesView = this.layoutView;
        if (favoritesView != null) {
            uhm uhmVar = new uhm(28, this);
            f fVar = this.presenter;
            if (fVar == null) {
                fVar = null;
            }
            favoritesView.setupClickActions(uhmVar, new uhm(29, fVar));
        }
        f fVar2 = this.presenter;
        (fVar2 != null ? fVar2 : null).Mg(this);
        setAccessibilityScreenName(view.getResources().getString(kyh0.my_addresses));
        FavoritesView favoritesView2 = this.layoutView;
        if (favoritesView2 == null || (asViewGroup = favoritesView2.asViewGroup()) == null) {
            return;
        }
        int i = edj.x;
        tf91.a(asViewGroup);
    }

    @Override // defpackage.vip
    public void pickFavoriteAddress(FavoriteAddress address) {
        hjp requireCallback = requireCallback();
        requireCallback.getClass();
        PlainAddress f = z81.f(address);
        ljp ljpVar = requireCallback.a;
        f.O1(ljpVar.b0.b(f));
        ljp.V(ljpVar, f);
    }

    public final void removeAddress(FavoriteAddress address) {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        fVar.Rg(address);
    }

    public final void removeCandidate(g28 address) {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        bjp bjpVar = fVar.I;
        bjpVar.e.remove(address);
        bjpVar.a();
    }

    @Override // defpackage.vip
    public void render(rjp uiState) {
        FavoritesView favoritesView = this.layoutView;
        if (favoritesView != null) {
            favoritesView.updateState(uiState);
        }
    }

    public final void setDatumType(mip payload) {
        this.addressDatumType = payload.j.equals(Boolean.TRUE) ? FavoriteAddressDatumType.REGULAR : FavoriteAddressDatumType.GEO_POINT;
    }

    @Override // defpackage.vip
    public void showRideSettingsModal(String rideId, z9r0 bottomModalParams) {
        ljp ljpVar = requireCallback().a;
        ljpVar.A((m950) ljpVar.P.get(), new car0(rideId, bottomModalParams), (kjp) ljpVar.e0.getValue());
    }

    @Override // defpackage.vip
    public void showTooltipTitle() {
        FavoritesView favoritesView = this.layoutView;
        if (favoritesView != null) {
            favoritesView.showTooltipTitle();
        }
    }

    public final void updateAddress(String addressId, FavoriteAddress address) {
        f fVar = this.presenter;
        if (fVar == null) {
            fVar = null;
        }
        fVar.Sg(addressId, address);
    }
}
