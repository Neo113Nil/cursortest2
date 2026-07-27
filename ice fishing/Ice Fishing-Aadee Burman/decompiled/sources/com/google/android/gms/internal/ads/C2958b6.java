package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Optional;

/* renamed from: com.google.android.gms.internal.ads.b6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2958b6 {

    /* renamed from: a, reason: collision with root package name */
    public final Y5 f29214a;

    /* renamed from: b, reason: collision with root package name */
    public final C3694or f29215b = new C3694or(7);

    /* renamed from: c, reason: collision with root package name */
    public final R5 f29216c;

    public C2958b6(Y5 y52, R5 r52) {
        this.f29214a = y52;
        this.f29216c = r52;
    }

    public final Optional a() {
        B5 b52;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f29215b.f32954u;
            if (arrayDeque.isEmpty()) {
                throw new V5();
            }
            T5 t52 = (T5) arrayDeque.pop();
            long j6 = t52.f27691a;
            long j9 = t52.f27692b;
            long j10 = t52.f27693c;
            Y5 y52 = this.f29214a;
            if (y52.f28654b < j9) {
                return Optional.of(B5.f23838n0);
            }
            this.f29216c.b(j6);
            if (j10 == 0) {
                while (y52.f28654b > j9) {
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
            b52 = B5.f23829Q;
            return Optional.of(b52);
        } catch (W5 unused2) {
            b52 = B5.f23838n0;
            return Optional.of(b52);
        }
    }
}
