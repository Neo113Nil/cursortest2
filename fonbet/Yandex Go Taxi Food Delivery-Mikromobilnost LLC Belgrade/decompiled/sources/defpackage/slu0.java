package defpackage;

import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.stories.domain.b;

/* loaded from: classes.dex */
public final class slu0 implements jy60 {
    public final Lifecycle a;
    public final tse b;
    public final b c;

    public slu0(Lifecycle lifecycle, tse tseVar, b bVar) {
        this.a = lifecycle;
        this.b = tseVar;
        this.c = bVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "StoriesAppLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        this.c.a(this.a, this.b);
    }
}
