package defpackage;

import android.net.Uri;
import com.yandex.go.deeplinks.typed.a;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes13.dex */
public final class yw6 implements yor0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ a c;

    public /* synthetic */ yw6(a aVar, Uri uri, int i) {
        this.a = i;
        this.c = aVar;
        this.b = uri;
    }

    @Override // defpackage.yor0
    public final void a(snr0 snr0Var, tmr0 tmr0Var) {
        int i = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                zw6 zw6Var = (zw6) aVar;
                zw6Var.d(new d1(6, zw6Var, snr0Var, tmr0Var));
                break;
            default:
                une uneVar = (une) aVar;
                une.d(uneVar, new d1(23, uneVar, snr0Var, tmr0Var));
                break;
        }
    }

    @Override // defpackage.yor0
    public final void b(snr0 snr0Var, SharedAccountScreen sharedAccountScreen) {
        int i = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                zw6 zw6Var = (zw6) aVar;
                zw6Var.d(new d1(8, zw6Var, snr0Var, sharedAccountScreen));
                break;
            default:
                une uneVar = (une) aVar;
                une.d(uneVar, new d1(21, uneVar, snr0Var, sharedAccountScreen));
                break;
        }
    }

    @Override // defpackage.yor0
    public final void c(tmr0 tmr0Var) {
        int i = this.a;
        Uri uri = this.b;
        a aVar = this.c;
        switch (i) {
            case 0:
                zw6 zw6Var = (zw6) aVar;
                zw6Var.d(new d1(7, zw6Var, tmr0Var, uri));
                break;
            default:
                une uneVar = (une) aVar;
                une.d(uneVar, new d1(22, uneVar, tmr0Var, uri));
                break;
        }
    }

    @Override // defpackage.yor0
    public final void d(String str) {
        int i = this.a;
        a aVar = this.c;
        switch (i) {
            case 0:
                zw6 zw6Var = (zw6) aVar;
                i d = ((j) zw6Var.h.a).d("FamilyAccount.FlowStart");
                d.d("webview_url", str);
                d.d("open_reason", "family");
                d.m();
                zw6Var.d(new mh3(23, zw6Var, str));
                break;
            default:
                une uneVar = (une) aVar;
                i d2 = ((j) uneVar.e.a).d("FamilyAccount.FlowStart");
                d2.d("webview_url", str);
                d2.d("open_reason", "family");
                d2.m();
                une.d(uneVar, new l7a(25, uneVar, str));
                break;
        }
    }
}
