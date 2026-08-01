package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Vi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2825Vi implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28227n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2841Wi f28228u;

    public C2825Vi(C2841Wi c2841Wi, int i) {
        this.f28227n = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c2841Wi);
                this.f28228u = c2841Wi;
                break;
            default:
                Objects.requireNonNull(c2841Wi);
                this.f28228u = c2841Wi;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final void e(Object obj, Map map) {
        switch (this.f28227n) {
            case 0:
                C2841Wi c2841Wi = this.f28228u;
                c2841Wi.getClass();
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(c2841Wi.f28370a)) {
                        c2841Wi.f28372c.execute(new RunnableC3111e(28, this));
                        break;
                    }
                }
                break;
            default:
                C2841Wi c2841Wi2 = this.f28228u;
                c2841Wi2.getClass();
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(c2841Wi2.f28370a)) {
                        c2841Wi2.f28372c.execute(new RunnableC3111e(29, this));
                        break;
                    }
                }
                break;
        }
    }
}
