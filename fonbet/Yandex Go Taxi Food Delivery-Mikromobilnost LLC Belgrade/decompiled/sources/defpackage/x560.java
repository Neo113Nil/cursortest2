package defpackage;

import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;

/* loaded from: classes12.dex */
public final class x560 implements ec00 {
    public final MainScreenBehavior a;

    public x560(MainScreenBehavior mainScreenBehavior) {
        this.a = mainScreenBehavior;
    }

    @Override // defpackage.ec00
    public final String a() {
        return this.a.version;
    }

    @Override // defpackage.ec00
    public final void b(i iVar) {
        iVar.d("MainScreenVersion", this.a.version);
    }
}
