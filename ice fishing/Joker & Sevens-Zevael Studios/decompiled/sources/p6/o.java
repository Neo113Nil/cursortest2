package p6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final m7.g f5618a;

    /* renamed from: h, reason: collision with root package name */
    public final a7.c f5625h;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5619b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5620c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5621d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f5622e = false;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f5623f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    public boolean f5624g = false;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5626i = new Object();

    public o(Looper looper, m7.g gVar) {
        this.f5618a = gVar;
        this.f5625h = new a7.c(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.wtf("GmsClientEvents", a4.d.g("Don't know how to handle message: ", i10), new Exception());
            return false;
        }
        n6.f fVar = (n6.f) message.obj;
        synchronized (this.f5626i) {
            try {
                if (this.f5622e && ((o6.v) this.f5618a.f4957h).d() && this.f5619b.contains(fVar)) {
                    fVar.onConnected(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
