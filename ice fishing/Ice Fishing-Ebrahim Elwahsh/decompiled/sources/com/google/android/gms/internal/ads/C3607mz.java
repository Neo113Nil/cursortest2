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

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3607mz extends AbstractC3984tz {

    /* renamed from: f, reason: collision with root package name */
    public final Map f32781f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f32782g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC3714oy f32783h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f32784j;

    public C3607mz(C3830r6 c3830r6, C3391iz c3391iz, Map map, Context context, EnumC3714oy enumC3714oy, C3066cy c3066cy, C4158xA c4158xA) {
        super("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", c3830r6, c3391iz, c4158xA.a(113));
        this.f32782g = context;
        this.f32781f = map;
        this.f32783h = enumC3714oy;
        this.i = c3066cy.Y();
        this.f32784j = c3066cy.Z();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3984tz
    public final void a(Method method, C3830r6 c3830r6) {
        String str;
        D6 d62;
        Object[] objArr = (Object[]) method.invoke("", this.f32782g, Integer.valueOf(this.f32783h.ordinal()));
        objArr.getClass();
        String str2 = "E";
        int i = 1;
        try {
            J3.a aVar = (J3.a) this.f32781f.get("gs");
            if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (d62 = (D6) aVar.get(this.i, TimeUnit.MILLISECONDS)) != null && d62.v0().length() > 1)) {
                str2 = d62.v0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str2.equals("E")) {
            try {
                J3.a aVar2 = (J3.a) this.f32781f.get(com.anythink.expressad.f.a.b.da);
                if (aVar2 != null) {
                    String str3 = (String) aVar2.get(this.f32784j, TimeUnit.MILLISECONDS);
                    if (!AbstractC3217fl.q(str3)) {
                        str2 = str3;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (c3830r6) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    str = Base64.encodeToString(HC.f25322f.f().g(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    str = (String) obj;
                }
                long longValue = ((Long) objArr[0]).longValue();
                c3830r6.h();
                ((D6) c3830r6.f30000u).F(longValue);
                String str4 = (String) objArr[1];
                c3830r6.h();
                ((D6) c3830r6.f30000u).E(str4);
                String str5 = (String) objArr[2];
                c3830r6.h();
                ((D6) c3830r6.f30000u).O(str5);
                String str6 = (String) objArr[3];
                c3830r6.h();
                ((D6) c3830r6.f30000u).P(str6);
                c3830r6.h();
                ((D6) c3830r6.f30000u).A(str);
                c3830r6.h();
                ((D6) c3830r6.f30000u).S0(str2);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    c3830r6.h();
                    ((D6) c3830r6.f30000u).t0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
