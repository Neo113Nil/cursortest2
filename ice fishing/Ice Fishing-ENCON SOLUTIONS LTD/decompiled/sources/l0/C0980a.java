package l0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f8129c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C0980a f8130d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f8131a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f8132b;

    public C0980a(Context context) {
        this.f8132b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f8131a;
        reentrantLock.lock();
        try {
            return this.f8132b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
