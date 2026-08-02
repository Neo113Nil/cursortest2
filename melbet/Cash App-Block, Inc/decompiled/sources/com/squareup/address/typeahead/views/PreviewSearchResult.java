package com.squareup.address.typeahead.views;

import com.squareup.address.typeahead.backend.api.AddressResult$Address;
import com.squareup.address.typeahead.backend.api.AddressSearchResult;
import com.squareup.protos.common.location.Coordinates;
import com.squareup.protos.common.location.GlobalAddress;
import java.io.Serializable;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class PreviewSearchResult implements AddressSearchResult {
    public final /* synthetic */ int $r8$classId = 0;
    public final String primaryText;
    public final Serializable secondaryText;

    public PreviewSearchResult(Pair pair) {
        pair.getClass();
        this.primaryText = (String) pair.first;
        this.secondaryText = (GlobalAddress) pair.second;
    }

    @Override // com.squareup.address.typeahead.backend.api.AddressSearchResult
    public final Object computeAddress(AddressTypeaheadState$select$1 addressTypeaheadState$select$1) {
        switch (this.$r8$classId) {
            case 0:
                throw new NotImplementedError(null, 1, null);
            default:
                GlobalAddress globalAddress = (GlobalAddress) this.secondaryText;
                globalAddress.getClass();
                String str = globalAddress.address_line_1;
                String str2 = str == null ? "" : str;
                String str3 = globalAddress.address_line_2;
                String str4 = globalAddress.postal_code;
                String str5 = str4 == null ? "" : str4;
                String str6 = globalAddress.locality;
                String str7 = str6 == null ? "" : str6;
                String str8 = globalAddress.administrative_district_level_1;
                String str9 = str8 == null ? "" : str8;
                Coordinates coordinates = globalAddress.address_coordinates;
                return new AddressSearchResult.ComputedAddressResult.Success(new AddressResult$Address(str2, str3, str7, str9, str5, coordinates != null ? coordinates.latitude : null, coordinates != null ? coordinates.longitude : null, this.primaryText));
        }
    }

    @Override // com.squareup.address.typeahead.backend.api.AddressSearchResult
    public final CharSequence getPrimaryText() {
        switch (this.$r8$classId) {
            case 0:
                return this.primaryText;
            default:
                String str = ((GlobalAddress) this.secondaryText).address_line_1;
                str.getClass();
                return str;
        }
    }

    @Override // com.squareup.address.typeahead.backend.api.AddressSearchResult
    public final CharSequence getSecondaryText() {
        int i = this.$r8$classId;
        Serializable serializable = this.secondaryText;
        switch (i) {
            case 0:
                return (String) serializable;
            default:
                GlobalAddress globalAddress = (GlobalAddress) serializable;
                return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{globalAddress.locality, globalAddress.administrative_district_level_1, globalAddress.postal_code}), ", ", null, null, 0, null, null, 62);
        }
    }

    public PreviewSearchResult(String str, String str2) {
        this.primaryText = str;
        this.secondaryText = str2;
    }
}
