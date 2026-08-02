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
public final class C3455jz extends AbstractC3833qz {

    /* renamed from: f, reason: collision with root package name */
    public final Map f32134f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f32135g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC3616my f32136h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f32137j;

    public C3455jz(C4002u6 c4002u6, C3241fz c3241fz, Map map, Context context, EnumC3616my enumC3616my, C2972ay c2972ay, C4006uA c4006uA) {
        super("+PCjsR8uUrE+ODYObgFJ15LzzbP31PRWxMEYlQ7sSRGBdHPl6GvLcY6T0RM0sryv", "LK6oYs0YHGkrF/9CgiECppIXTefV1s/9lm3/dqGO06I=", c4002u6, c3241fz, c4006uA.a(113));
        this.f32135g = context;
        this.f32134f = map;
        this.f32136h = enumC3616my;
        this.i = c2972ay.Y();
        this.f32137j = c2972ay.Z();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3833qz
    public final void a(Method method, C4002u6 c4002u6) {
        String str;
        H6 h62;
        Object[] objArr = (Object[]) method.invoke("", this.f32135g, Integer.valueOf(this.f32136h.ordinal()));
        objArr.getClass();
        String str2 = "E";
        int i = 1;
        try {
            P3.a aVar = (P3.a) this.f32134f.get("gs");
            if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (h62 = (H6) aVar.get(this.i, TimeUnit.MILLISECONDS)) != null && h62.v0().length() > 1)) {
                str2 = h62.v0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str2.equals("E")) {
            try {
                P3.a aVar2 = (P3.a) this.f32134f.get(com.anythink.expressad.f.a.b.da);
                if (aVar2 != null) {
                    String str3 = (String) aVar2.get(this.f32137j, TimeUnit.MILLISECONDS);
                    if (!SK.n(str3)) {
                        str2 = str3;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (c4002u6) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    str = Base64.encodeToString(EC.f25318f.f().g(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    str = (String) obj;
                }
                long longValue = ((Long) objArr[0]).longValue();
                c4002u6.h();
                ((H6) c4002u6.f28504u).F(longValue);
                String str4 = (String) objArr[1];
                c4002u6.h();
                ((H6) c4002u6.f28504u).E(str4);
                String str5 = (String) objArr[2];
                c4002u6.h();
                ((H6) c4002u6.f28504u).O(str5);
                String str6 = (String) objArr[3];
                c4002u6.h();
                ((H6) c4002u6.f28504u).P(str6);
                c4002u6.h();
                ((H6) c4002u6.f28504u).A(str);
                c4002u6.h();
                ((H6) c4002u6.f28504u).S0(str2);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    c4002u6.h();
                    ((H6) c4002u6.f28504u).t0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
