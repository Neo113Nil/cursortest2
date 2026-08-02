package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b3.f;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import u0.RemoteCallbackListC5058g;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: n, reason: collision with root package name */
    public int f5263n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f5264u = new LinkedHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final RemoteCallbackListC5058g f5265v = new RemoteCallbackListC5058g(this);

    /* renamed from: w, reason: collision with root package name */
    public final f f5266w = new f(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f5266w;
    }
}
