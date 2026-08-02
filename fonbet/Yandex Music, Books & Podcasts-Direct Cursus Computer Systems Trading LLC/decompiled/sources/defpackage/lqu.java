package defpackage;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes4.dex */
public final class lqu implements kqu {
    public final lpu a;
    public final rmb b;

    public lqu(lpu lpuVar, rmb rmbVar) {
        this.a = lpuVar;
        this.b = rmbVar;
    }

    @Override // defpackage.kqu
    public final void a() {
        rmb.k(this.b, "", y7g.I(0, 0, ""), null, 4);
        this.a.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("yandexmusic://collection/multivibes")));
    }
}
