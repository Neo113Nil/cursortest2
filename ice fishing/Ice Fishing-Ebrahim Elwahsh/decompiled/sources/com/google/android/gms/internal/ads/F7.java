package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class F7 extends P7 {
    public static final Vx i = new Vx();

    /* renamed from: h, reason: collision with root package name */
    public final Context f24922h;

    public F7(C4101w7 c4101w7, C3830r6 c3830r6, int i4, Context context) {
        super(c4101w7, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", c3830r6, i4, 29);
        this.f24922h = context;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        C3830r6 c3830r6 = this.f26844d;
        c3830r6.h();
        ((D6) c3830r6.f30000u).A("E");
        Context context = this.f24922h;
        AtomicReference m8 = i.m(context.getPackageName());
        if (m8.get() == null) {
            synchronized (m8) {
                try {
                    if (m8.get() == null) {
                        m8.set((String) this.f26845e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) m8.get();
        C3830r6 c3830r62 = this.f26844d;
        synchronized (c3830r62) {
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            c3830r62.h();
            ((D6) c3830r62.f30000u).A(encodeToString);
        }
    }
}
