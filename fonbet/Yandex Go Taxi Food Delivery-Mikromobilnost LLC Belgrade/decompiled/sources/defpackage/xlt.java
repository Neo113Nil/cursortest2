package defpackage;

import com.yandex.auth.LegacyAccountType;
import ru.yandex.taxi.am.GoAccountType;

/* loaded from: classes9.dex */
public final class xlt {
    public static GoAccountType a(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -897050771:
                if (str.equals(LegacyAccountType.STRING_SOCIAL)) {
                    return GoAccountType.Social;
                }
                return null;
            case -737882127:
                if (str.equals("yandex")) {
                    return GoAccountType.Yandex;
                }
                return null;
            case -595478713:
                if (str.equals("phonish")) {
                    return GoAccountType.Phonish;
                }
                return null;
            case 3322030:
                if (str.equals("lite")) {
                    return GoAccountType.Lite;
                }
                return null;
            case 3387192:
                if (str.equals("none")) {
                    return GoAccountType.None;
                }
                return null;
            default:
                return null;
        }
    }
}
