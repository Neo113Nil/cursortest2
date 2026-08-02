package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class Yw {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f29540a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f29541b;

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f29542c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f29543d;

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f29544e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f29540a = new UUID(0L, 0L);
        f29541b = new UUID(1186680826959645954L, -5988876978535335093L);
        f29542c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f29543d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f29544e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
