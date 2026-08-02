package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3671nz extends AbstractC3833qz {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Long f33606g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f33607h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3671nz(String str, String str2, C4002u6 c4002u6, C3241fz c3241fz, C3952tA c3952tA, int i) {
        super(str, str2, c4002u6, c3241fz, c3952tA);
        this.f33608f = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3833qz
    public final void a(Method method, C4002u6 c4002u6) {
        switch (this.f33608f) {
            case 0:
                if (f33606g == null) {
                    synchronized (f33607h) {
                        try {
                            if (f33606g == null) {
                                Long l9 = (Long) method.invoke("", new Object[0]);
                                if (l9 == null) {
                                    throw null;
                                }
                                f33606g = l9;
                            }
                        } finally {
                        }
                    }
                }
                synchronized (c4002u6) {
                    try {
                        if (f33606g != null) {
                            long longValue = f33606g.longValue();
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).Q0(longValue);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (c4002u6) {
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).E0("E");
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).M(0L);
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).g0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", new Object[0]);
                objArr.getClass();
                synchronized (c4002u6) {
                    String str = (String) objArr[0];
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).E0(str);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).M(longValue2);
                    String str2 = (String) objArr[2];
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).g0(str2);
                }
                return;
        }
    }
}
