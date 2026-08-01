package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.aK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2918aK extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R5 f29049a;

    public C2918aK(R5 r52) {
        Objects.requireNonNull(r52);
        this.f29049a = r52;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            WJ wj = WJ.f28341c;
            R5 r52 = this.f29049a;
            Mac mac = (Mac) wj.f28346a.b((String) r52.f27174v);
            mac.init((SecretKeySpec) r52.f27175w);
            return mac;
        } catch (GeneralSecurityException e9) {
            throw new IllegalStateException(e9);
        }
    }
}
