package androidx.room;

import Z2.f;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import u0.RemoteCallbackListC5057g;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: n, reason: collision with root package name */
    public int f5297n;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f5298u = new LinkedHashMap();

    /* renamed from: v, reason: collision with root package name */
    public final RemoteCallbackListC5057g f5299v = new RemoteCallbackListC5057g(this);

    /* renamed from: w, reason: collision with root package name */
    public final f f5300w = new f(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f5300w;
    }
}
