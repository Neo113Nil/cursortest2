package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.surge.models.dto.PriceComplainParam$Source;

@gsq0
/* loaded from: classes6.dex */
public final class zye0 {
    public static final xye0 Companion = new xye0();
    public static final i3y[] f;
    public final String a;
    public final PriceComplainParam$Source b;
    public final Set c;
    public final Set d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new vye0(0)), a.b(lazyThreadSafetyMode, new vye0(1)), a.b(lazyThreadSafetyMode, new vye0(2)), null};
    }

    public /* synthetic */ zye0(int i, String str, PriceComplainParam$Source priceComplainParam$Source, Set set, Set set2, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, wye0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = priceComplainParam$Source;
        this.c = set;
        this.d = set2;
        this.e = str2;
    }

    public zye0(String str, PriceComplainParam$Source priceComplainParam$Source, Set set, Set set2, String str2) {
        this.a = str;
        this.b = priceComplainParam$Source;
        this.c = set;
        this.d = set2;
        this.e = str2;
    }
}
