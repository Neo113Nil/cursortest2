package defpackage;

import ru.yandex.taxi.maas.api.deeplink.MaasMode;

/* loaded from: classes5.dex */
public final class v100 {
    public static MaasMode a(String str) {
        for (MaasMode maasMode : MaasMode.values()) {
            if (jl40.l(maasMode.getValue(), str)) {
                return maasMode;
            }
        }
        return null;
    }
}
