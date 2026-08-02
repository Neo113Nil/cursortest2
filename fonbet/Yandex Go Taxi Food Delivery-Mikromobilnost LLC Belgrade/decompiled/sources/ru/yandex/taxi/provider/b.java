package ru.yandex.taxi.provider;

import androidx.lifecycle.Lifecycle;
import defpackage.h3y;
import defpackage.lz60;
import defpackage.rfw0;
import defpackage.tje;
import defpackage.tse;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes9.dex */
public final class b implements lz60 {
    public final h3y a;
    public final rfw0 b;
    public final tse c;
    public final Lifecycle d;
    public AlertDialog e;

    public b(h3y h3yVar, rfw0 rfw0Var, tse tseVar, Lifecycle lifecycle) {
        this.a = h3yVar;
        this.b = rfw0Var;
        this.c = tseVar;
        this.d = lifecycle;
    }

    @Override // defpackage.lz60
    public final void g() {
        UpdateAppLifecycleListener$onLargestContentfulPaint$1 updateAppLifecycleListener$onLargestContentfulPaint$1 = new UpdateAppLifecycleListener$onLargestContentfulPaint$1(this, null);
        tse tseVar = this.c;
        tje.N(tseVar, null, null, updateAppLifecycleListener$onLargestContentfulPaint$1, 3);
        com.yandex.go.coroutines.b.g(tseVar, null, null, new UpdateAppLifecycleListener$onLargestContentfulPaint$2(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UpdateAppLifecycleListener";
    }
}
