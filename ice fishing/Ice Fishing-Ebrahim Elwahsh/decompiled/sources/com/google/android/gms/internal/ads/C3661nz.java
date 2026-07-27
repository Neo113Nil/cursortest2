package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3661nz extends AbstractC3984tz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33069f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f33070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3661nz(C3830r6 c3830r6, C3391iz c3391iz, Context context, C4158xA c4158xA, int i) {
        super("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", c3830r6, c3391iz, c4158xA.a(115));
        this.f33069f = i;
        switch (i) {
            case 1:
                super("i8dIMUuFazx2QmSkfzNlM975x3JumPrUee1RASXGMNDJH8RWJsPNqbpEpnJFa4Hi", "5davCcWMx5wzne2F0dLFbMr5/cylOtU7FK3CcX7bJPU=", c3830r6, c3391iz, c4158xA.a(119));
                this.f33070g = context;
                break;
            default:
                this.f33070g = context;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3984tz
    public final void a(Method method, C3830r6 c3830r6) {
        switch (this.f33069f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", this.f33070g);
                objArr.getClass();
                synchronized (c3830r6) {
                    try {
                        long intValue = ((Integer) objArr[0]).intValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).Y(intValue);
                        int i = 1;
                        long intValue2 = ((Integer) objArr[1]).intValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).H0(intValue2);
                        long intValue3 = ((Integer) objArr[2]).intValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).I0(intValue3);
                        long intValue4 = ((Integer) objArr[3]).intValue();
                        c3830r6.h();
                        ((D6) c3830r6.f30000u).m0(intValue4);
                        Boolean bool = (Boolean) objArr[4];
                        if (bool == null) {
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).q0(3);
                        } else {
                            int i4 = true != bool.booleanValue() ? 1 : 2;
                            c3830r6.h();
                            ((D6) c3830r6.f30000u).q0(i4);
                        }
                        Boolean bool2 = (Boolean) objArr[5];
                        if (bool2 == null) {
                            c3830r6.m(3);
                        } else {
                            if (true == bool2.booleanValue()) {
                                i = 2;
                            }
                            c3830r6.m(i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Object[] objArr2 = (Object[]) method.invoke("", this.f33070g);
                objArr2.getClass();
                synchronized (c3830r6) {
                    long longValue = ((Long) objArr2[0]).longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).G0(longValue);
                    long longValue2 = ((Long) objArr2[1]).longValue();
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).Z(longValue2);
                }
                return;
        }
    }
}
