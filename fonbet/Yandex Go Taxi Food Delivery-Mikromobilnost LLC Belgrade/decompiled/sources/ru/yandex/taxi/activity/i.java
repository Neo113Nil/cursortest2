package ru.yandex.taxi.activity;

import android.content.Intent;
import defpackage.ffx;
import defpackage.tje;
import defpackage.tse;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class i {
    public final tse a;
    public final n0 b;
    public final n0 c;

    public i(tse tseVar) {
        this.a = tseVar;
        n0 c = ffx.c(0, 0, null, 6);
        this.b = c;
        this.c = c;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            tje.N(this.a, null, null, new OnNewIntentHandler$onNewIntent$1(this, intent, null), 3);
        }
    }
}
