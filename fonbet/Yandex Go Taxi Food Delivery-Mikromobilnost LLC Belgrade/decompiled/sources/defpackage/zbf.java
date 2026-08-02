package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.utils.b;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.a;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class zbf {
    public static final /* synthetic */ kgx[] h;
    public final Context a;
    public final x22 b;
    public final b c;
    public final String d;
    public final i3y e;
    public final i3y f;
    public final qp3 g;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("receiverRegistration", 0, "getReceiverRegistration()Lcom/yandex/alicekit/core/Disposable;", zbf.class);
        qoi0.a.getClass();
        h = new kgx[]{mutablePropertyReference1Impl};
    }

    public zbf(Context context, wff0 wff0Var, k020 k020Var, x22 x22Var, b bVar) {
        this.a = context;
        this.b = x22Var;
        this.c = bVar;
        String str = context.getApplicationInfo().packageName;
        String a = n8u.a(str);
        this.d = a != null ? a : str;
        this.e = a.a(new ybf(0, k020Var));
        this.f = a.a(new ybf(1, this));
        new Handler(Looper.getMainLooper());
        this.g = new qp3();
        wff0Var.a(new fn3(4, this));
    }

    public final void a(String str, Pair... pairArr) {
        LinkedHashMap l = kotlin.collections.b.l((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        l.put("step", str);
        l.put("app", this.d);
        l.put("user", (String) this.e.getValue());
        this.b.reportEvent("tech_online_ipc_check", l);
    }
}
