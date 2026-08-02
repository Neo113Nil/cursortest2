package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class vpl implements w2q, hs6, t8s, up4, pun {
    @Override // defpackage.up4
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        s9x s9xVar = new s9x((i8s) obj2);
        gax gaxVar = (gax) ((nax) obj).s();
        Parcel M0 = gaxVar.M0();
        y4x.d(M0, s9xVar);
        gaxVar.O0(M0, 2);
    }

    public void b(Context context, Function1 function1) {
        int i;
        context.getClass();
        if (rdk.i != null) {
            return;
        }
        synchronized (this) {
            vpl vplVar = rdk.h;
            if (rdk.i == null && jo0.E(context)) {
                qaw qawVar = new qaw();
                function1.invoke(qawVar);
                OkHttpClient okHttpClient = qawVar.a;
                Function0 no7Var = okHttpClient != null ? new no7(okHttpClient, 2) : b8w.u;
                Integer num = qawVar.b;
                if (num != null) {
                    i = 1;
                    if (num.intValue() == 1) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        vplVar.d(new w2r(applicationContext, no7Var, i));
                    }
                }
                i = 0;
                Context applicationContext2 = context.getApplicationContext();
                applicationContext2.getClass();
                vplVar.d(new w2r(applicationContext2, no7Var, i));
            }
        }
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return upl.a;
    }

    public void d(w2r w2rVar) {
        if (rdk.i != null) {
            return;
        }
        synchronized (this) {
            try {
                if (rdk.i == null) {
                    Context context = (Context) w2rVar.c;
                    w3f w3fVar = x3f.d;
                    w3fVar.getClass();
                    i5f r = quj.r(w3fVar, rvr.y0);
                    wvo wvoVar = pt0.g;
                    context.getClass();
                    synchronized (wvoVar) {
                        if (pt0.h == null) {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("ru.yandex.video.ab.database.pref", 0);
                            sharedPreferences.getClass();
                            pt0.h = new pt0(sharedPreferences, r);
                        }
                    }
                    gku gkuVar = new gku();
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    rdk.i = new rdk(packageName, new xiq(new vtm(wvoVar.z()), gkuVar), new eno(new inr(context, w2rVar, r, gkuVar, (Continuation) null)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        return upl.a;
    }

    @Override // defpackage.t8s
    public d7f get(String str) {
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return upl.a;
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        return upl.a;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return upl.b;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return upl.a;
    }
}
