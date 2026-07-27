package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class Yw {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f28760a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f28761b;

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f28762c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f28763d;

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f28764e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f28760a = new UUID(0L, 0L);
        f28761b = new UUID(1186680826959645954L, -5988876978535335093L);
        f28762c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f28763d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f28764e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
