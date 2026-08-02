package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.dto.b;
import com.yandex.go.address.models.PlainAddress;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class zgc0 {
    public static PlainAddress a(zzs zzsVar) {
        AddressDTO.Companion.getClass();
        return new PlainAddress(b.a(zzsVar));
    }

    public final KSerializer serializer() {
        return ahc0.a;
    }
}
