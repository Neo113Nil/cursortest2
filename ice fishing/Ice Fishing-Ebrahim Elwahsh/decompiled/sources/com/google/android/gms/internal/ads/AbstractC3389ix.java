package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.ix, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3389ix {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f32028a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f32029b;

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f32030c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f32031d;

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f32032e;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
        f32028a = new UUID(0L, 0L);
        f32029b = new UUID(1186680826959645954L, -5988876978535335093L);
        f32030c = new UUID(-2129748144642739255L, 8654423357094679310L);
        f32031d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f32032e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
