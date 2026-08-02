package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messenger.websdk.api.Notification;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;

/* loaded from: classes3.dex */
public final class hfj implements Notification {
    public final Context a;
    public final SharedPreferences b;
    public final vae c;
    public final qdc d;
    public final cr e;
    public final v4n f;
    public final gfj g;
    public final Handler h;
    public final Handler i;
    public boolean j;
    public final afj k;

    public hfj(vbv vbvVar) {
        Context context = vbvVar.a;
        this.a = context;
        Object value = vbvVar.n.getValue();
        value.getClass();
        Object value2 = vbvVar.o.getValue();
        value2.getClass();
        this.b = (SharedPreferences) value2;
        this.c = (vae) vbvVar.q.getValue();
        this.d = vbvVar.r;
        NotificationClickIntentFactory notificationClickIntentFactory = vbvVar.d;
        this.e = vbvVar.t;
        this.f = (v4n) vbvVar.h.getValue();
        this.g = new gfj(this, 1);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new Handler((Looper) value);
        this.j = true;
        this.k = notificationClickIntentFactory != null ? new afj(context, notificationClickIntentFactory) : null;
    }
}
