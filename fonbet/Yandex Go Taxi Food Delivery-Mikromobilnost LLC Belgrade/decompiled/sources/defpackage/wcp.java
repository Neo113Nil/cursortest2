package defpackage;

import com.yandex.go.address.models.FavoriteAddressDatumType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class wcp {
    public static FavoriteAddressDatumType a(String str) {
        if (jl40.l(str, "regular")) {
            return FavoriteAddressDatumType.REGULAR;
        }
        if (jl40.l(str, "geo_point")) {
            return FavoriteAddressDatumType.GEO_POINT;
        }
        return null;
    }

    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FavoriteAddressDatumType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
