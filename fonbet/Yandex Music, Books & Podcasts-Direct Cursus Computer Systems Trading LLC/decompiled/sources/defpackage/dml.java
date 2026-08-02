package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import ru.yandex.music.payment.tariffpaywall.TariffPaywallActivity;

/* loaded from: classes4.dex */
public final class dml implements vzn, hgg, lci {
    public static eml a() {
        eml emlVar = eml.d;
        return new eml(j1g.a, true, true);
    }

    public static Intent b(Context context, lik likVar) {
        context.getClass();
        likVar.getClass();
        Intent intent = new Intent(context, (Class<?>) TariffPaywallActivity.class);
        intent.putExtra("navigation_source_info", likVar);
        intent.putExtra("promo_code", (String) null);
        return intent;
    }

    public aa c(Context context, bya byaVar) {
        aa aaVar = new aa(3);
        int a = byaVar.a(context, true);
        aaVar.b = a;
        if (a != 0) {
            aaVar.c = 1;
            return aaVar;
        }
        int b = byaVar.b(context);
        aaVar.a = b;
        if (b != 0) {
            aaVar.c = -1;
        }
        return aaVar;
    }

    @Override // defpackage.hgg
    public /* bridge */ /* synthetic */ void d(jgg jggVar, long j, long j2, boolean z) {
    }

    @Override // defpackage.hgg
    public /* bridge */ /* synthetic */ void g(jgg jggVar, long j, long j2) {
    }

    @Override // defpackage.vzn
    public void h(String str, long j, int i, long j2, long j3) {
        str.getClass();
        y2x.t(j, j2, i, str).c(j3, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.vzn
    public void i(String str, float f) {
        y2x.z(str).b((int) (f * 100));
    }

    @Override // defpackage.hgg
    public mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        return osh.l;
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new nkr(kkpVar.n(Uri.class, InputStream.class), 0);
    }
}
