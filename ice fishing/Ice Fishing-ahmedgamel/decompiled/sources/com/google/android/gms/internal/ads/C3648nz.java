package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3648nz extends AbstractC3810qz {

    /* renamed from: g, reason: collision with root package name */
    public static volatile Long f32819g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f32820h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3648nz(String str, String str2, C3979u6 c3979u6, C3218fz c3218fz, C3929tA c3929tA, int i) {
        super(str, str2, c3979u6, c3218fz, c3929tA);
        this.f32821f = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3810qz
    public final void a(Method method, C3979u6 c3979u6) {
        switch (this.f32821f) {
            case 0:
                if (f32819g == null) {
                    synchronized (f32820h) {
                        try {
                            if (f32819g == null) {
                                Long l9 = (Long) method.invoke("", new Object[0]);
                                if (l9 == null) {
                                    throw null;
                                }
                                f32819g = l9;
                            }
                        } finally {
                        }
                    }
                }
                synchronized (c3979u6) {
                    try {
                        if (f32819g != null) {
                            long longValue = f32819g.longValue();
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).Q0(longValue);
                        }
                    } finally {
                    }
                }
                return;
            default:
                synchronized (c3979u6) {
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).E0("E");
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).M(0L);
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).g0("D");
                }
                Object[] objArr = (Object[]) method.invoke("", new Object[0]);
                objArr.getClass();
                synchronized (c3979u6) {
                    String str = (String) objArr[0];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).E0(str);
                    long longValue2 = ((Long) objArr[1]).longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).M(longValue2);
                    String str2 = (String) objArr[2];
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).g0(str2);
                }
                return;
        }
    }
}
