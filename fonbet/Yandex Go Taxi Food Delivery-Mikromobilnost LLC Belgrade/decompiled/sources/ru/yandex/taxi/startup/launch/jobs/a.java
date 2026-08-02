package ru.yandex.taxi.startup.launch.jobs;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.coroutines.b;
import com.yandex.go.preload.e;
import defpackage.cne0;
import defpackage.tse;
import defpackage.vw60;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes10.dex */
public final class a implements vw60 {
    public final c a;
    public final h b;
    public final e c;
    public final tse d;
    public final Lifecycle e;

    public a(c cVar, h hVar, e eVar, tse tseVar, Lifecycle lifecycle) {
        this.a = cVar;
        this.b = hVar;
        this.c = eVar;
        this.d = tseVar;
        this.e = lifecycle;
    }

    @Override // defpackage.vw60
    public final void c() {
        ((cne0) this.b.b).u("launch_actual", false);
        b.g(this.d, null, null, new LaunchRequestOnActivityCreateListener$onActivityCreate$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "request launch on resume";
    }
}
