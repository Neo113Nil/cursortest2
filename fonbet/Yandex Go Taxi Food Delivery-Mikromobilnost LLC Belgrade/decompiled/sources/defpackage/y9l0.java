package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes6.dex */
public final class y9l0 {
    public final ModalViewOrigin a;
    public final RouteSelectorOpenReason b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final RouteSelectorOpenReason g;

    public y9l0(ModalViewOrigin modalViewOrigin, RouteSelectorOpenReason routeSelectorOpenReason, String str, String str2, String str3, RouteSelectorOpenReason routeSelectorOpenReason2, int i) {
        boolean z = (i & 32) != 0;
        routeSelectorOpenReason2 = (i & 64) != 0 ? RouteSelectorOpenReason.OTHER : routeSelectorOpenReason2;
        this.a = modalViewOrigin;
        this.b = routeSelectorOpenReason;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = routeSelectorOpenReason2;
    }
}
