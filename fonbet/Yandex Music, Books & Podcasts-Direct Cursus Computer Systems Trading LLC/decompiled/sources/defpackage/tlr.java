package defpackage;

import java.util.Map;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class tlr implements ove {
    public final paw a;
    public final olr b;

    public tlr(paw pawVar, olr olrVar) {
        this.a = pawVar;
        this.b = olrVar;
    }

    @Override // defpackage.ove
    public final void E() {
        this.b.a();
    }

    @Override // defpackage.ove
    public final void F(PreparingParams preparingParams, Map map) {
        this.b.f(this.a, map, preparingParams.getIsOffline());
    }
}
