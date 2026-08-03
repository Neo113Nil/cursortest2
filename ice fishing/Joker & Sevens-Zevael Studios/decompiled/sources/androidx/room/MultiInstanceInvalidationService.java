package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b4.i;
import b4.j;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: g, reason: collision with root package name */
    public int f737g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f738h = new LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final j f739i = new j(this);

    /* renamed from: j, reason: collision with root package name */
    public final i f740j = new i(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        pc.j.e(intent, "intent");
        return this.f740j;
    }
}
