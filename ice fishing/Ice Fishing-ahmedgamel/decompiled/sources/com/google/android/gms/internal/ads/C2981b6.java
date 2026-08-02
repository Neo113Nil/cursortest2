package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* renamed from: com.google.android.gms.internal.ads.b6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2981b6 {

    /* renamed from: a, reason: collision with root package name */
    public final Y5 f30002a;

    /* renamed from: b, reason: collision with root package name */
    public final C3717or f30003b = new C3717or(7);

    /* renamed from: c, reason: collision with root package name */
    public final R5 f30004c;

    public C2981b6(Y5 y52, R5 r52) {
        this.f30002a = y52;
        this.f30004c = r52;
    }

    public final Optional a() {
        B5 b52;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f30003b.f33740u;
            if (arrayDeque.isEmpty()) {
                throw new V5();
            }
            T5 t52 = (T5) arrayDeque.pop();
            long j6 = t52.f28474a;
            long j9 = t52.f28475b;
            long j10 = t52.f28476c;
            Y5 y52 = this.f30002a;
            if (y52.f29431b < j9) {
                return Optional.of(B5.f24610i0);
            }
            this.f30004c.b(j6);
            if (j10 == 0) {
                while (y52.f29431b > j9) {
                    y52.c();
                }
            }
            return Optional.empty();
        } catch (P5 e9) {
            e = e9;
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
        } catch (Q5 e10) {
            e = e10;
            throw new AssertionError(L5.a("CEiv6BFfPnitUE+D"), e);
        } catch (V5 unused) {
            b52 = B5.f24601Q;
            return Optional.of(b52);
        } catch (W5 unused2) {
            b52 = B5.f24610i0;
            return Optional.of(b52);
        }
    }
}
