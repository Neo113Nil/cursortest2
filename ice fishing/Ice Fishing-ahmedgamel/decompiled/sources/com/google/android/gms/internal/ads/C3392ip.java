package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3392ip implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2759Qe f31906b;

    public /* synthetic */ C3392ip(C2759Qe c2759Qe, int i) {
        this.f31905a = i;
        this.f31906b = c2759Qe;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final /* synthetic */ P3.a a(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f31905a) {
            case 0:
                return QC.c(new C4308zp(inputStream, this.f31906b));
            case 1:
                return QC.c(new C4308zp(inputStream, this.f31906b));
            default:
                String str = new String(GC.a(inputStream), StandardCharsets.UTF_8);
                C2759Qe c2759Qe = this.f31906b;
                c2759Qe.f27822C = str;
                return QC.c(c2759Qe);
        }
    }
}
