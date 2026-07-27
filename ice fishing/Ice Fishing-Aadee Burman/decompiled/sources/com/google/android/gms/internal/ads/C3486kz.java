package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.kz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3486kz extends AbstractC3810qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f31670f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f31671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486kz(C3979u6 c3979u6, C3218fz c3218fz, Context context, C3983uA c3983uA, int i) {
        super("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", c3979u6, c3218fz, c3983uA.a(115));
        this.f31670f = i;
        switch (i) {
            case 1:
                super("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", c3979u6, c3218fz, c3983uA.a(119));
                this.f31671g = context;
                break;
            default:
                this.f31671g = context;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3810qz
    public final void a(Method method, C3979u6 c3979u6) {
        switch (this.f31670f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f31671g);
                objArr.getClass();
                synchronized (c3979u6) {
                    try {
                        long intValue = ((Integer) objArr[0]).intValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).Y(intValue);
                        int i = 1;
                        long intValue2 = ((Integer) objArr[1]).intValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).H0(intValue2);
                        long intValue3 = ((Integer) objArr[2]).intValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).I0(intValue3);
                        long intValue4 = ((Integer) objArr[3]).intValue();
                        c3979u6.h();
                        ((H6) c3979u6.f27721u).m0(intValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).q0(3);
                        } else {
                            int i6 = true != bool.booleanValue() ? 1 : 2;
                            c3979u6.h();
                            ((H6) c3979u6.f27721u).q0(i6);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            c3979u6.m(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i = 2;
                            }
                            c3979u6.m(i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.f31671g);
                objArr2.getClass();
                synchronized (c3979u6) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).G0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).Z(longValue2);
                }
                return;
        }
    }
}
