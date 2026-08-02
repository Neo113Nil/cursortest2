package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

@gsq0
/* loaded from: classes6.dex */
public final class su90 implements fv90 {
    public static final ru90 Companion = new ru90();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(9))};
    public final ScootersErrorCode a;

    public /* synthetic */ su90(int i, ScootersErrorCode scootersErrorCode) {
        if (1 == (i & 1)) {
            this.a = scootersErrorCode;
        } else {
            qje.Z(i, 1, qu90.a.getDescriptor());
            throw null;
        }
    }
}
