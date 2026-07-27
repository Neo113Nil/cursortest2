package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3369ip implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2739Qe f31121b;

    public /* synthetic */ C3369ip(C2739Qe c2739Qe, int i) {
        this.f31120a = i;
        this.f31121b = c2739Qe;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final /* synthetic */ N3.a a(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f31120a) {
            case 0:
                return QC.c(new C4285zp(inputStream, this.f31121b));
            case 1:
                return QC.c(new C4285zp(inputStream, this.f31121b));
            default:
                String str = new String(GC.a(inputStream), StandardCharsets.UTF_8);
                C2739Qe c2739Qe = this.f31121b;
                c2739Qe.f27037C = str;
                return QC.c(c2739Qe);
        }
    }
}
