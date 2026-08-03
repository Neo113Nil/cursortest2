package k6;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f3632c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f3633d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f3634a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f3635b;

    public a(Context context) {
        this.f3635b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f3634a;
        reentrantLock.lock();
        try {
            return this.f3635b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
