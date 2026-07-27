package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.jz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3432jz extends AbstractC3810qz {

    /* renamed from: f, reason: collision with root package name */
    public final Map f31355f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f31356g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC3593my f31357h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f31358j;

    public C3432jz(C3979u6 c3979u6, C3218fz c3218fz, Map map, Context context, EnumC3593my enumC3593my, C2949ay c2949ay, C3983uA c3983uA) {
        super("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", c3979u6, c3218fz, c3983uA.a(113));
        this.f31356g = context;
        this.f31355f = map;
        this.f31357h = enumC3593my;
        this.i = c2949ay.Y();
        this.f31358j = c2949ay.Z();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3810qz
    public final void a(Method method, C3979u6 c3979u6) {
        String str;
        H6 h62;
        Object[] objArr = (Object[]) method.invoke("", this.f31356g, Integer.valueOf(this.f31357h.ordinal()));
        objArr.getClass();
        String str2 = "E";
        int i = 1;
        try {
            N3.a aVar = (N3.a) this.f31355f.get("gs");
            if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (h62 = (H6) aVar.get(this.i, TimeUnit.MILLISECONDS)) != null && h62.v0().length() > 1)) {
                str2 = h62.v0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str2.equals("E")) {
            try {
                N3.a aVar2 = (N3.a) this.f31355f.get(com.anythink.expressad.f.a.b.da);
                if (aVar2 != null) {
                    String str3 = (String) aVar2.get(this.f31358j, TimeUnit.MILLISECONDS);
                    if (!SK.n(str3)) {
                        str2 = str3;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (c3979u6) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    str = Base64.encodeToString(EC.f24557f.f().g(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    str = (String) obj;
                }
                long longValue = ((Long) objArr[0]).longValue();
                c3979u6.h();
                ((H6) c3979u6.f27721u).F(longValue);
                String str4 = (String) objArr[1];
                c3979u6.h();
                ((H6) c3979u6.f27721u).E(str4);
                String str5 = (String) objArr[2];
                c3979u6.h();
                ((H6) c3979u6.f27721u).O(str5);
                String str6 = (String) objArr[3];
                c3979u6.h();
                ((H6) c3979u6.f27721u).P(str6);
                c3979u6.h();
                ((H6) c3979u6.f27721u).A(str);
                c3979u6.h();
                ((H6) c3979u6.f27721u).S0(str2);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    c3979u6.h();
                    ((H6) c3979u6.f27721u).t0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
