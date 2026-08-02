package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.aK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2941aK extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R5 f29819a;

    public C2941aK(R5 r52) {
        Objects.requireNonNull(r52);
        this.f29819a = r52;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            WJ wj = WJ.f29139c;
            R5 r52 = this.f29819a;
            Mac mac = (Mac) wj.f29144a.b((String) r52.f27930v);
            mac.init((SecretKeySpec) r52.f27931w);
            return mac;
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
