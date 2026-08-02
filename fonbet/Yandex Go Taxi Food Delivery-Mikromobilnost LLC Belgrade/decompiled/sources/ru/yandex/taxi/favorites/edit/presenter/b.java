package ru.yandex.taxi.favorites.edit.presenter;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.FavoriteAddressDatumType;
import com.yandex.go.address.models.FavoriteAddressRequest;
import defpackage.cgp;
import defpackage.egp;
import defpackage.hbp0;
import defpackage.k3u0;
import defpackage.nnm;
import defpackage.oln;
import defpackage.rmn;
import defpackage.ul51;
import defpackage.vpr;
import defpackage.z81;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3u0 b;

    public /* synthetic */ b(k3u0 k3u0Var, int i) {
        this.a = i;
        this.b = k3u0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k3u0 k3u0Var = this.b;
        switch (i) {
            case 0:
                AddressDTO addressDTO = (AddressDTO) obj;
                oln olnVar = (oln) k3u0Var;
                d dVar = olnVar.a;
                ((ul51) olnVar.e).getClass();
                if (olnVar.b.getDatumType() != FavoriteAddressDatumType.REGULAR || !olnVar.g.e() || ((str = addressDTO.p) != null && str.length() != 0)) {
                    egp inputsHolder = ((cgp) dVar.Dg()).inputsHolder();
                    hbp0.e(olnVar.j, null, null, new EditExisting$requestUpdateFavorite$1(olnVar, FavoriteAddressRequest.a(z81.j(addressDTO, null, null, olnVar.b.getDatumType(), 7), olnVar.b.getPlaceType(), inputsHolder.a(), nnm.k(inputsHolder.i), nnm.k(inputsHolder.g), nnm.k(inputsHolder.f), nnm.k(inputsHolder.h), null, 14503), null), 3);
                    break;
                } else {
                    cgp cgpVar = (cgp) dVar.Dg();
                    cgpVar.stopLoading();
                    cgpVar.showHouseMissingDialog();
                    break;
                }
                break;
            default:
                AddressDTO addressDTO2 = (AddressDTO) obj;
                rmn rmnVar = (rmn) k3u0Var;
                d dVar2 = rmnVar.a;
                ((ul51) rmnVar.d).getClass();
                if (rmnVar.b.getDatumType() != FavoriteAddressDatumType.REGULAR || !rmnVar.h.e() || ((str2 = addressDTO2.p) != null && str2.length() != 0)) {
                    egp inputsHolder2 = ((cgp) dVar2.Dg()).inputsHolder();
                    hbp0.e(rmnVar.k, null, null, new EditNew$requestUpdateFavorite$1(rmnVar, FavoriteAddressRequest.a(z81.j(addressDTO2, null, null, rmnVar.b.getDatumType(), 7), rmnVar.b.getPlaceType(), inputsHolder2.a(), nnm.k(inputsHolder2.i), nnm.k(inputsHolder2.g), nnm.k(inputsHolder2.f), nnm.k(inputsHolder2.h), null, 14503), null), 3);
                    break;
                } else {
                    cgp cgpVar2 = (cgp) dVar2.Dg();
                    cgpVar2.stopLoading();
                    cgpVar2.showHouseMissingDialog();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
