package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import kotlin.Pair;
import ru.yandex.taxi.favorites.data.repo.a;
import ru.yandex.taxi.favorites.edit.presenter.EditNew$saveFavorite$$inlined$safeCollectIn$1;
import ru.yandex.taxi.favorites.edit.presenter.d;
import ru.yandex.taxi.favorites.experiment.e;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;

/* loaded from: classes5.dex */
public final class rmn implements k3u0 {
    public final d a;
    public FavoriteAddress b;
    public final boolean c;
    public final qmp d;
    public final a e;
    public final zuj0 f;
    public final tt2 g;
    public final e h;
    public final bgf i;
    public final kip j;
    public final hbp0 k = new hbp0(new czo0(14), "", null);

    public rmn(d dVar, FavoriteAddress favoriteAddress, boolean z, qmp qmpVar, a aVar, zuj0 zuj0Var, tt2 tt2Var, e eVar, bgf bgfVar, kip kipVar) {
        this.a = dVar;
        this.b = favoriteAddress;
        this.c = z;
        this.d = qmpVar;
        this.e = aVar;
        this.f = zuj0Var;
        this.g = tt2Var;
        this.h = eVar;
        this.i = bgfVar;
        this.j = kipVar;
    }

    @Override // defpackage.k3u0
    public final PlainAddress a() {
        return z81.f(this.b);
    }

    @Override // defpackage.k3u0
    public final void b() {
    }

    @Override // defpackage.k3u0
    public final void c() {
        this.k.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
    @Override // defpackage.k3u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bgp d() {
        String str;
        String p;
        Pair pair;
        String a = ((cgp) this.a.Dg()).inputsHolder().a();
        int length = a.length();
        zuj0 zuj0Var = this.f;
        if (length == 0) {
            if (this.b.getPlaceType() == PlaceType.WORK) {
                a = ((avj0) zuj0Var).h(kyh0.favorite_work);
            } else if (this.b.getPlaceType() == PlaceType.HOME) {
                a = ((avj0) zuj0Var).h(kyh0.favorite_home);
            } else {
                a = this.b.getName();
                if (a == null) {
                    str = "";
                    if (this.c) {
                        bgf bgfVar = this.i;
                        if (bgfVar.isEnabled()) {
                            pair = new Pair(bgfVar.a(), "");
                            String str2 = (String) pair.getFirst();
                            String str3 = (String) pair.getSecond();
                            String fullText = this.b.getFullText();
                            String h = (str != null || evu0.J(str)) ? ((avj0) zuj0Var).h(kyh0.favorite_edit_screen_default_title) : str;
                            String porchNumber = this.b.getPorchNumber();
                            String str4 = porchNumber == null ? "" : porchNumber;
                            String quartersNumber = this.b.getQuartersNumber();
                            String str5 = quartersNumber == null ? "" : quartersNumber;
                            String floorNumber = this.b.getFloorNumber();
                            String str6 = floorNumber == null ? "" : floorNumber;
                            String doorPhoneNumber = this.b.getDoorPhoneNumber();
                            String str7 = doorPhoneNumber == null ? "" : doorPhoneNumber;
                            String comment = this.b.getComment();
                            String str8 = comment == null ? "" : comment;
                            String commentCourier = this.b.getCommentCourier();
                            return new bgp(h, str, str2, fullText, str4, str8, str3, str5, str6, str7, commentCourier == null ? "" : commentCourier, this.j.b(), 2048);
                        }
                    }
                    String q = this.b.q();
                    p = this.b.p();
                    if (p == null) {
                        p = "";
                    }
                    pair = new Pair(q, p);
                    String str22 = (String) pair.getFirst();
                    String str32 = (String) pair.getSecond();
                    String fullText2 = this.b.getFullText();
                    if (str != null) {
                    }
                    String porchNumber2 = this.b.getPorchNumber();
                    if (porchNumber2 == null) {
                    }
                    String quartersNumber2 = this.b.getQuartersNumber();
                    if (quartersNumber2 == null) {
                    }
                    String floorNumber2 = this.b.getFloorNumber();
                    if (floorNumber2 == null) {
                    }
                    String doorPhoneNumber2 = this.b.getDoorPhoneNumber();
                    if (doorPhoneNumber2 == null) {
                    }
                    String comment2 = this.b.getComment();
                    if (comment2 == null) {
                    }
                    String commentCourier2 = this.b.getCommentCourier();
                    return new bgp(h, str, str22, fullText2, str4, str8, str32, str5, str6, str7, commentCourier2 == null ? "" : commentCourier2, this.j.b(), 2048);
                }
            }
        }
        str = a;
        if (this.c) {
        }
        String q2 = this.b.q();
        p = this.b.p();
        if (p == null) {
        }
        pair = new Pair(q2, p);
        String str222 = (String) pair.getFirst();
        String str322 = (String) pair.getSecond();
        String fullText22 = this.b.getFullText();
        if (str != null) {
        }
        String porchNumber22 = this.b.getPorchNumber();
        if (porchNumber22 == null) {
        }
        String quartersNumber22 = this.b.getQuartersNumber();
        if (quartersNumber22 == null) {
        }
        String floorNumber22 = this.b.getFloorNumber();
        if (floorNumber22 == null) {
        }
        String doorPhoneNumber22 = this.b.getDoorPhoneNumber();
        if (doorPhoneNumber22 == null) {
        }
        String comment22 = this.b.getComment();
        if (comment22 == null) {
        }
        String commentCourier22 = this.b.getCommentCourier();
        return new bgp(h, str, str222, fullText22, str4, str8, str322, str5, str6, str7, commentCourier22 == null ? "" : commentCourier22, this.j.b(), 2048);
    }

    @Override // defpackage.k3u0
    public final void e() {
        d dVar = this.a;
        ((cgp) dVar.Dg()).showLoading();
        tpr f = this.e.f(z81.f(this.b), nnm.k(((cgp) dVar.Dg()).inputsHolder().d), nnm.k(((cgp) dVar.Dg()).inputsHolder().e));
        this.g.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.k, null, null, new EditNew$saveFavorite$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(f, mdh.b), null, this), 3);
    }

    @Override // defpackage.k3u0
    public final void f(FavoriteAddressDatumType favoriteAddressDatumType) {
        this.b = FavoriteAddress.b(this.b, null, 0, null, favoriteAddressDatumType, null, 4194239);
    }

    @Override // defpackage.k3u0
    public final void g(String str) {
        if (str == null || evu0.J(str)) {
            str = ((avj0) this.f).h(kyh0.favorite_edit_screen_default_title);
        }
        ((cgp) this.a.Dg()).setScreenTitle(str);
    }

    @Override // defpackage.k3u0
    public final void h(Address address) {
        this.b = z81.k(this.b, address);
        GeoPointAcquisitionType geoPointAcquisitionType = address.getGeoPointAcquisitionType();
        GeoPointAcquisitionType geoPointAcquisitionType2 = GeoPointAcquisitionType.USER_LOCATION;
        d dVar = this.a;
        if (geoPointAcquisitionType == geoPointAcquisitionType2) {
            bgf bgfVar = this.i;
            if (bgfVar.isEnabled()) {
                ((cgp) dVar.Dg()).updateAddressItem(bgfVar.a(), "", address.d());
                return;
            }
        }
        ((cgp) dVar.Dg()).updateAddressItem(q5z.L(address), this.j.b() ? q5z.D(address) : "", address.d());
    }

    @Override // defpackage.k3u0
    public final void i() {
        this.k.a();
    }

    @Override // defpackage.k3u0
    public final void j() {
    }

    @Override // defpackage.k3u0
    public final void k() {
    }
}
