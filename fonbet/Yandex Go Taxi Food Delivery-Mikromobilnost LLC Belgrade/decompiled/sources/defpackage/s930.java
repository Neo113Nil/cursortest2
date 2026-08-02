package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.b;
import defpackage.jll0;
import defpackage.tje;
import defpackage.z930;
import defpackage.zy11;

/* loaded from: classes12.dex */
public final /* synthetic */ class s930 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ s930(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jll0.a aVar;
        View decorView;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final b bVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new tls() { // from class: com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        b bVar2 = b.this;
                        tje.N(bVar2.o(), null, null, new MosmetroOtpRouter$content$1$1$1(bVar2, (z930) obj2, null), 3);
                        return zy11.a;
                    }
                };
                v8d.a.getClass();
                ((agd) yfdVar).g = v8d.b;
                break;
            default:
                mp30 mp30Var = (mp30) obj;
                Context context = bVar.F;
                String str = null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null && (decorView = activity.getWindow().getDecorView()) != null) {
                    decorView.post(new ce0(decorView, 15));
                }
                jll0 a = ((s411) bVar.K).a();
                if (a != null && (aVar = a.a) != null) {
                    str = aVar.g;
                }
                if (str == null) {
                    str = "";
                }
                bVar.J.a(str);
                mp30Var.a.r(new pi30(12));
                break;
        }
        return zy11Var;
    }
}
