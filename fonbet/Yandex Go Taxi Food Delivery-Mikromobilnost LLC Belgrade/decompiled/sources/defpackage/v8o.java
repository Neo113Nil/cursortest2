package defpackage;

import android.content.Context;
import kotlin.a;
import ru.yandex.taxi.plaque.api.dependencies.PlaqueEnvironment;

/* loaded from: classes6.dex */
public final class v8o {
    public final String a;
    public final i3y b;

    public v8o(Context context, PlaqueEnvironment plaqueEnvironment) {
        String str;
        int i = u8o.a[plaqueEnvironment.ordinal()];
        if (i == 1) {
            str = "2e9aabee-53ab-4330-aa11-f920ceb4af15";
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            str = "3b33a1c8-7293-4c8e-a954-9e30566f2427";
        }
        this.a = str;
        this.b = a.a(new ymj(27, context, this));
    }
}
