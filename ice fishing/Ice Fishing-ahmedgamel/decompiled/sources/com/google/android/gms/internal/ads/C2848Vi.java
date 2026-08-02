package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Vi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2848Vi implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f29024n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2864Wi f29025u;

    public C2848Vi(C2864Wi c2864Wi, int i) {
        this.f29024n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c2864Wi);
                this.f29025u = c2864Wi;
                break;
            default:
                Objects.requireNonNull(c2864Wi);
                this.f29025u = c2864Wi;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final void e(Object obj, Map map) {
        switch (this.f29024n) {
            case 0:
                C2864Wi c2864Wi = this.f29025u;
                c2864Wi.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(c2864Wi.f29169a)) {
                        c2864Wi.f29171c.execute(new RunnableC3134e(28, this));
                        break;
                    }
                }
                break;
            default:
                C2864Wi c2864Wi2 = this.f29025u;
                c2864Wi2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(c2864Wi2.f29169a)) {
                        c2864Wi2.f29171c.execute(new RunnableC3134e(29, this));
                        break;
                    }
                }
                break;
        }
    }
}
