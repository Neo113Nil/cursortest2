package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class G7 extends Q7 {
    public static final Ux i = new Ux();

    /* renamed from: h, reason: collision with root package name */
    public final Context f24936h;

    public G7(C4196y7 c4196y7, C3979u6 c3979u6, int i6, Context context) {
        super(c4196y7, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", c3979u6, i6, 29);
        this.f24936h = context;
    }

    @Override // com.google.android.gms.internal.ads.Q7
    public final void a() {
        C3979u6 c3979u6 = this.f26982d;
        c3979u6.h();
        ((H6) c3979u6.f27721u).A("E");
        Context context = this.f24936h;
        AtomicReference f3 = i.f(context.getPackageName());
        if (f3.get() == null) {
            synchronized (f3) {
                try {
                    if (f3.get() == null) {
                        f3.set((String) this.f26983e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) f3.get();
        C3979u6 c3979u62 = this.f26982d;
        synchronized (c3979u62) {
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            c3979u62.h();
            ((H6) c3979u62.f27721u).A(encodeToString);
        }
    }
}
