package defpackage;

import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes9.dex */
public final class qmr0 {
    public static SharedAccountType a(String str) {
        for (SharedAccountType sharedAccountType : SharedAccountType.a()) {
            if (jl40.l(str, sharedAccountType.getTypeId())) {
                return sharedAccountType;
            }
        }
        return SharedAccountType.UNKNOWN;
    }
}
