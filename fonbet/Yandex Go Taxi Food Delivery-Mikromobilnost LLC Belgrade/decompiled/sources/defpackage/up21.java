package defpackage;

import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes5.dex */
public final class up21 {
    public final ijz a;
    public final wp21 b;

    public up21(ijz ijzVar, wp21 wp21Var) {
        this.a = ijzVar;
        this.b = wp21Var;
    }

    public final String a() {
        ijz ijzVar = this.a;
        if (ijzVar != null) {
            String Og = ((h) ijzVar.a.s).Og();
            if (evu0.J(Og)) {
                Og = null;
            }
            if (Og != null) {
                return Og;
            }
        }
        return this.b.a;
    }
}
