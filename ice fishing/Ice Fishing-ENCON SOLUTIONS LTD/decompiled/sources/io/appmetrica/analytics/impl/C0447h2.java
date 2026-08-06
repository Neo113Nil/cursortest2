package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447h2 extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0883xo f6110b;

    /* renamed from: c, reason: collision with root package name */
    public final Xj f6111c;

    public C0447h2(X4 x4) {
        this(x4, x4.u(), Xj.c());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f4998a;
        if (!this.f6110b.c() && !this.f6110b.d()) {
            if (((C0539kh) x4.f5356k.a()).f6376e) {
                this.f6111c.b();
            }
            M8 m8 = this.f4998a.f5357l;
            if (m8.f4743c == null) {
                m8.a();
            }
            O8 o8 = m8.f4743c;
            o8.getClass();
            o8.f4856b = new HashSet();
            o8.f4858d = 0;
            O8 o82 = m8.f4743c;
            o82.f4855a = true;
            R8 r8 = m8.f4742b;
            IBinaryDataHelper iBinaryDataHelper = r8.f4990c;
            Q8 q8 = r8.f4989b;
            r8.f4988a.getClass();
            iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o82)));
        }
        return false;
    }

    public C0447h2(X4 x4, C0883xo c0883xo, Xj xj) {
        super(x4);
        this.f6110b = c0883xo;
        this.f6111c = xj;
    }
}
