package defpackage;

import ru.yandex.taxi.logistics.childrouter.api.ButtonType;
import ru.yandex.taxi.logistics.childrouter.api.ScreenMode;

/* loaded from: classes5.dex */
public final class s1f implements q1f {
    public final gzh a;
    public final sae b;

    public s1f(gzh gzhVar, sae saeVar) {
        this.a = gzhVar;
        this.b = saeVar;
    }

    @Override // defpackage.q1f
    public final void open() {
        czh create = this.a.create();
        czh.a(create, new izh(new cbe(1, this, new gyc(new r1f(create))), ButtonType.BACK, ScreenMode.FIXED, null, null, null, 8178));
    }
}
