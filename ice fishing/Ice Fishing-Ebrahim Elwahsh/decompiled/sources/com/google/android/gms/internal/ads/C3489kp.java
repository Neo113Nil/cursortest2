package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3489kp implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2687Ne f32463b;

    public /* synthetic */ C3489kp(C2687Ne c2687Ne, int i) {
        this.f32462a = i;
        this.f32463b = c2687Ne;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final /* synthetic */ J3.a b(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f32462a) {
            case 0:
                return C3686oN.c(new C2511Cp(inputStream, this.f32463b));
            case 1:
                return C3686oN.c(new C2511Cp(inputStream, this.f32463b));
            default:
                String str = new String(JC.a(inputStream), StandardCharsets.UTF_8);
                C2687Ne c2687Ne = this.f32463b;
                c2687Ne.f26575C = str;
                return C3686oN.c(c2687Ne);
        }
    }
}
