package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messenger.websdk.api.Authentication;
import com.yandex.messenger.websdk.api.MessengerParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class h02 implements Authentication {
    public final hfj a;
    public final gs4 b;
    public final qdc c;
    public volatile String d;
    public final wn0 e;
    public final boolean f;
    public final Handler g;
    public final Handler h;
    public final HashSet i;
    public g5r j;

    public h02(vbv vbvVar) {
        MessengerParams messengerParams = vbvVar.g;
        Object value = vbvVar.n.getValue();
        value.getClass();
        this.a = (hfj) vbvVar.m.getValue();
        Object value2 = vbvVar.o.getValue();
        value2.getClass();
        gs4 gs4Var = new gs4();
        gs4Var.a = (l0o) vbvVar.D.getValue();
        gs4Var.b = vbvVar.r;
        gs4Var.c = (OkHttpClient) vbvVar.j.getValue();
        gs4Var.d = Collections.synchronizedList(new ArrayList());
        this.b = gs4Var;
        qdc qdcVar = vbvVar.r;
        this.c = qdcVar;
        this.e = new wn0((SharedPreferences) value2, qdcVar);
        this.f = messengerParams.c;
        this.g = new Handler(Looper.getMainLooper());
        this.h = new Handler((Looper) value);
        this.i = new HashSet();
    }

    public final String a() {
        boolean z = this.f;
        String str = this.d;
        return !z ? str : str == null ? this.e.a() : str;
    }

    public final void b() {
        if (a() == null) {
            return;
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            fi4 fi4Var = ((th4) it.next()).a.a;
            qdc qdcVar = fi4Var.h;
            k5r.t(qdcVar, qdcVar, "wm_main_new_token");
            fi4Var.i("onTokenChange", null);
        }
    }
}
