package defpackage;

import com.yandex.plus.pay.data.acquisition.PlusPayAcquisitionApi;
import okhttp3.OkHttpClient;

/* loaded from: classes14.dex */
public final class x7d0 {
    public static final /* synthetic */ x7d0 a = new x7d0();

    public static PlusPayAcquisitionApi a(OkHttpClient okHttpClient, fnh fnhVar, sbx sbxVar) {
        msu msuVar = new msu(new OkHttpClient(okHttpClient.b()), new t6f0(10, fnhVar));
        s0k0 s0k0Var = new s0k0();
        s0k0Var.d.add(new uz50());
        s0k0Var.a(new lgx(sbxVar, 2));
        s0k0Var.a = msuVar;
        s0k0Var.b(fnhVar.getUrl().toString());
        return (PlusPayAcquisitionApi) s0k0Var.c().b(PlusPayAcquisitionApi.class);
    }
}
