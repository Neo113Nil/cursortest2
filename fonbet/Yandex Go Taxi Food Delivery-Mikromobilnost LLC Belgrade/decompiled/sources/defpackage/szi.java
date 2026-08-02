package defpackage;

import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes12.dex */
public final class szi extends wzi {
    public final ModalViewOrigin a;
    public final RouteSelectorOpenReason b;

    public /* synthetic */ szi(ModalViewOrigin modalViewOrigin, RouteSelectorOpenReason routeSelectorOpenReason, int i) {
        this((i & 1) != 0 ? null : modalViewOrigin, (i & 2) != 0 ? RouteSelectorOpenReason.OTHER : routeSelectorOpenReason);
    }

    public szi(ModalViewOrigin modalViewOrigin, RouteSelectorOpenReason routeSelectorOpenReason) {
        this.a = modalViewOrigin;
        this.b = routeSelectorOpenReason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public szi() {
        this(null, 0 == true ? 1 : 0, 3);
    }
}
