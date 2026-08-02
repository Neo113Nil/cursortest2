package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class G7 extends Q7 {
    public static final Ux i = new Ux();

    /* renamed from: h, reason: collision with root package name */
    public final Context f25726h;

    public G7(C4219y7 c4219y7, C4002u6 c4002u6, int i4, Context context) {
        super(c4219y7, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", c4002u6, i4, 29);
        this.f25726h = context;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        C4002u6 c4002u6 = this.f27769d;
        c4002u6.h();
        ((H6) c4002u6.f28504u).A("E");
        Context context = this.f25726h;
        AtomicReference l9 = i.l(context.getPackageName());
        if (l9.get() == null) {
            synchronized (l9) {
                try {
                    if (l9.get() == null) {
                        l9.set((String) this.f27770e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) l9.get();
        C4002u6 c4002u62 = this.f27769d;
        synchronized (c4002u62) {
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            c4002u62.h();
            ((H6) c4002u62.f28504u).A(encodeToString);
        }
    }
}
