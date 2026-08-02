package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Y implements Converter {
    public final C0939g a;
    public final c0 b;
    public final r c;

    public /* synthetic */ Y(C0939g c0939g, c0 c0Var, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0939g() : c0939g, (i & 2) != 0 ? new c0() : c0Var, (i & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(@NotNull Q q) {
        C0937e c0937e;
        a0 a0Var;
        N n = q.a;
        if (n != null) {
            this.a.getClass();
            c0937e = new C0937e(n.a);
        } else {
            c0937e = null;
        }
        P p = q.b;
        if (p != null) {
            this.b.getClass();
            a0Var = new a0(p.a, p.b);
        } else {
            a0Var = null;
        }
        O o = q.c;
        return new W(c0937e, a0Var, o != null ? this.c.toModel(o) : null);
    }

    public Y(@NotNull C0939g c0939g, @NotNull c0 c0Var, @NotNull r rVar) {
        this.a = c0939g;
        this.b = c0Var;
        this.c = rVar;
    }

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(@NotNull W w) {
        Q q = new Q();
        C0937e c0937e = w.a;
        q.a = c0937e != null ? this.a.fromModel(c0937e) : null;
        a0 a0Var = w.b;
        q.b = a0Var != null ? this.b.fromModel(a0Var) : null;
        C0948p c0948p = w.c;
        q.c = c0948p != null ? this.c.fromModel(c0948p) : null;
        return q;
    }
}
