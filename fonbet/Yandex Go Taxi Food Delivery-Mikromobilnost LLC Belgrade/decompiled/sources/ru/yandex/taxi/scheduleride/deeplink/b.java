package ru.yandex.taxi.scheduleride.deeplink;

import android.net.Uri;
import defpackage.hit;
import defpackage.lnm0;
import defpackage.tje;
import defpackage.z880;
import ru.yandex.taxi.preorder.source.domain.o;

/* loaded from: classes6.dex */
public final class b {
    public final lnm0 a;
    public final hit b;
    public final o c;
    public final z880 d;

    public b(lnm0 lnm0Var, hit hitVar, o oVar, z880 z880Var) {
        this.a = lnm0Var;
        this.b = hitVar;
        this.c = oVar;
        this.d = z880Var;
    }

    public final void a(Uri uri) {
        tje.N(this.b.a, null, null, new ScheduleRideSummaryDeeplinkHandler$handleDeeplink$1(this, uri, null), 3);
    }
}
