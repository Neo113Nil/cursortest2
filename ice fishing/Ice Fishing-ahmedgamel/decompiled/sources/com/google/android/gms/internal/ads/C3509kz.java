package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.kz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3509kz extends AbstractC3833qz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f32450f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f32451g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3509kz(C4002u6 c4002u6, C3241fz c3241fz, Context context, C4006uA c4006uA, int i) {
        super("uhXgNuGSyd8UZxNVLle6+R5FVDrGs3ztJxFRccM25tfzP1xuUPcwCU9TKSVvh2k9", "qKJ/azzJVrSI96ukKyGiETTBFTHn9OIRjLO/t8+zHyA=", c4002u6, c3241fz, c4006uA.a(115));
        this.f32450f = i;
        switch (i) {
            case 1:
                super("H0YdM17mgrrozxD0WVa3M40/jGgbp6xsWEqC8q+HAngxqz5clYs9XrZGt0ruoMVC", "vTRbdp+bvCvcqmoB2mkwDXNuKnz+mZ0QzFSaQEl2hgg=", c4002u6, c3241fz, c4006uA.a(119));
                this.f32451g = context;
                break;
            default:
                this.f32451g = context;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3833qz
    public final void a(Method method, C4002u6 c4002u6) {
        switch (this.f32450f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f32451g);
                objArr.getClass();
                synchronized (c4002u6) {
                    try {
                        long intValue = ((Integer) objArr[0]).intValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).Y(intValue);
                        int i = 1;
                        long intValue2 = ((Integer) objArr[1]).intValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).H0(intValue2);
                        long intValue3 = ((Integer) objArr[2]).intValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).I0(intValue3);
                        long intValue4 = ((Integer) objArr[3]).intValue();
                        c4002u6.h();
                        ((H6) c4002u6.f28504u).m0(intValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).q0(3);
                        } else {
                            int i4 = true != bool.booleanValue() ? 1 : 2;
                            c4002u6.h();
                            ((H6) c4002u6.f28504u).q0(i4);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            c4002u6.m(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i = 2;
                            }
                            c4002u6.m(i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.f32451g);
                objArr2.getClass();
                synchronized (c4002u6) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).G0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).Z(longValue2);
                }
                return;
        }
    }
}
