package androidx.room;

import Y2.f;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import u0.RemoteCallbackListC5096g;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: n, reason: collision with root package name */
    public int f5409n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f5410u = new LinkedHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final RemoteCallbackListC5096g f5411v = new RemoteCallbackListC5096g(this);

    /* renamed from: w, reason: collision with root package name */
    public final f f5412w = new f(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f5412w;
    }
}
