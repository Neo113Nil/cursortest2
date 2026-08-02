package defpackage;

import com.google.ar.core.ImageMetadata;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.dto.b;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.FavoriteAddressRequest;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.analytics.e;
import com.yandex.go.suggest.AdditionalSuggest;
import ru.yandex.taxi.map.utils.a;

/* loaded from: classes.dex */
public abstract class z81 {
    public static final AddressDTO a = new AddressDTO(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431);

    public static final boolean a(Address address, Address address2) {
        if (address == address2) {
            return true;
        }
        if (address == null || address2 == null) {
            return false;
        }
        return jl40.l(address.B(), address2.B());
    }

    public static final boolean b(Address address, Address address2) {
        return address != null && address2 != null && address.equals(address2) && jl40.l(address.B(), address2.B());
    }

    public static final AdditionalSuggest c(do0 do0Var) {
        String d = do0Var.d();
        Integer e = do0Var.e();
        Integer c = do0Var.c();
        return new AdditionalSuggest(do0Var.a(), do0Var.b(), do0Var.g(), do0Var.i(), do0Var.j(), do0Var.f(), do0Var.h(), e, c, d);
    }

    public static final PlainAddress d(v7v0 v7v0Var) {
        PlainAddress.Companion.getClass();
        AddressDTO.Companion.getClass();
        PlainAddress plainAddress = new PlainAddress(b.b(v7v0Var));
        String str = v7v0Var.q;
        if (str.length() == 0) {
            return plainAddress;
        }
        FavoriteAddress h = h(plainAddress, null);
        int i = v7v0Var.r;
        i3c0 i3c0Var = PlaceType.Companion;
        String str2 = v7v0Var.s;
        i3c0Var.getClass();
        PlaceType a2 = i3c0.a(str2);
        String str3 = plainAddress.getAddress().n;
        if (str3 == null) {
            str3 = "";
        }
        return g(FavoriteAddress.b(h, str, i, a2, null, str3, 3932124), plainAddress.getAddress(), plainAddress.q0());
    }

    public static final tb80 e(Address address) {
        tb80 tb80Var = (tb80) address.getAddress().b(tb80.class);
        if (tb80Var != null) {
            return tb80Var;
        }
        tb80.Companion.getClass();
        return tb80.c;
    }

    public static final PlainAddress f(FavoriteAddress favoriteAddress) {
        return g(favoriteAddress, a, null);
    }

    public static final PlainAddress g(FavoriteAddress favoriteAddress, AddressDTO addressDTO, String str) {
        zgc0 zgc0Var = PlainAddress.Companion;
        String fullText = favoriteAddress.getFullText();
        String shortText = favoriteAddress.getShortText();
        String p = favoriteAddress.p();
        String comment = favoriteAddress.getComment();
        String commentCourier = favoriteAddress.getCommentCourier();
        String str2 = commentCourier == null ? "" : commentCourier;
        String doorPhoneNumber = favoriteAddress.getDoorPhoneNumber();
        String str3 = doorPhoneNumber == null ? "" : doorPhoneNumber;
        String quartersNumber = favoriteAddress.getQuartersNumber();
        String str4 = quartersNumber == null ? "" : quartersNumber;
        String floorNumber = favoriteAddress.getFloorNumber();
        String str5 = floorNumber == null ? "" : floorNumber;
        String porchNumber = favoriteAddress.getPorchNumber();
        String str6 = porchNumber == null ? "" : porchNumber;
        String house = favoriteAddress.getHouse();
        String str7 = house == null ? "" : house;
        AddressDTO g = AddressDTO.g(addressDTO, favoriteAddress.getPoint(), str, str6, fullText, shortText, p, comment, favoriteAddress.getUri(), favoriteAddress.getLog(), favoriteAddress.getImageTag(), str7, str4, str5, str3, str2, null, 32525064);
        PlaceType placeType = favoriteAddress.getPlaceType();
        FavoriteAddressDatumType datumType = favoriteAddress.getDatumType();
        String id = favoriteAddress.getId();
        zgc0Var.getClass();
        return new PlainAddress(g, id, placeType, datumType);
    }

    public static final FavoriteAddress h(Address address, PlaceType placeType) {
        String favoriteId = address.getFavoriteId();
        String str = favoriteId == null ? "" : favoriteId;
        FavoriteAddressDatumType datumType = address.getDatumType();
        String name = address.getName();
        String d = address.d();
        String D1 = address.D1();
        String H1 = address.H1();
        String e0 = address.e0();
        String e2 = address.e2();
        String J1 = address.J1();
        String n0 = address.n0();
        String b1 = address.b1();
        zzs B = address.B();
        String uri = address.getUri();
        String str2 = address.getAddress().p;
        FavoriteAddress.FavoriteTitle favoriteTitle = new FavoriteAddress.FavoriteTitle(address.d());
        String str3 = address.getAddress().g;
        return new FavoriteAddress(str, D1, d, B, placeType, datumType, favoriteTitle, new FavoriteAddress.FavoriteTitle(str3 != null ? str3 : ""), b1, n0, e0, H1, name, str2, e2, J1, uri, address.c2(), ImageMetadata.SENSOR_SENSITIVITY);
    }

    public static final FavoriteAddressRequest i(FavoriteAddress favoriteAddress) {
        return new FavoriteAddressRequest(favoriteAddress.getFullText(), favoriteAddress.getShortText(), favoriteAddress.getPoint(), favoriteAddress.getPlaceType(), favoriteAddress.getName(), favoriteAddress.getComment(), favoriteAddress.getCommentCourier(), favoriteAddress.getPorchNumber(), favoriteAddress.getFloorNumber(), favoriteAddress.getQuartersNumber(), favoriteAddress.getUri(), hka1.c(favoriteAddress.getDatumType()), favoriteAddress.getEmoji(), 1024);
    }

    public static FavoriteAddressRequest j(AddressDTO addressDTO, String str, PlaceType placeType, FavoriteAddressDatumType favoriteAddressDatumType, int i) {
        return new FavoriteAddressRequest(addressDTO.e, addressDTO.f, addressDTO.a, (i & 4) != 0 ? null : placeType, (i & 1) != 0 ? null : str, addressDTO.h, addressDTO.t, addressDTO.c, addressDTO.r, addressDTO.q, addressDTO.h(), hka1.c(favoriteAddressDatumType), (String) null, 1024);
    }

    public static final FavoriteAddress k(FavoriteAddress favoriteAddress, Address address) {
        return FavoriteAddress.b(h(address, null), favoriteAddress.getId(), favoriteAddress.getVersion(), favoriteAddress.getPlaceType(), favoriteAddress.getDatumType(), null, 4194204);
    }

    public static final Address l(Address address, Address address2) {
        PlainAddress plainAddress;
        tb90 panoramaData;
        if (address != null && address2 != null && address.equals(address2) && jl40.l(address.B(), address2.B()) && jl40.l(address.s1(), address2.s1()) && address.Z() == address2.Z()) {
            return address;
        }
        if (jl40.l(address2, address)) {
            PlainAddress.Companion.getClass();
            plainAddress = new PlainAddress(address2);
            String pickMethod = address.getPickMethod();
            if (pickMethod != null) {
                plainAddress.P(pickMethod);
            }
            String pickAction = address.getPickAction();
            if (pickAction != null) {
                plainAddress.L1(pickAction);
            }
            e analyticsData = address.getAnalyticsData();
            if (analyticsData != null) {
                plainAddress.O1(analyticsData);
            }
            plainAddress.U(address.getPickPosition());
            plainAddress.p(address.getZoneName());
        } else {
            PlainAddress.Companion.getClass();
            plainAddress = new PlainAddress(address2);
        }
        if ((jl40.l(address.B(), address2.B()) || a.j(address.B(), address2.B()) < 1.0f) && (panoramaData = address.getPanoramaData()) != null) {
            plainAddress.W(panoramaData);
        }
        String c2 = address2.c2();
        if (c2 == null) {
            c2 = address.c2();
        }
        String str = c2;
        String uri = address2.getUri();
        if (uri == null) {
            uri = address.getUri();
        }
        String str2 = uri;
        return (jl40.l(str, address2.c2()) && jl40.l(str2, address2.getUri())) ? plainAddress : new PlainAddress(plainAddress, AddressDTO.g(plainAddress.getAddress(), null, null, null, null, null, null, null, str2, str, null, null, null, null, null, null, null, 33549311));
    }
}
