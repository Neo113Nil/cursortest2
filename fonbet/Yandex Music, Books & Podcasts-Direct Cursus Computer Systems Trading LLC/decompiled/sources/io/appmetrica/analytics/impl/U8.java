package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class U8 {
    public final Context a;
    public final ProtobufStateStorage b;
    public final W8 c;
    public final InterfaceC0301gr d;
    public final Mp e;
    public final Sl f;
    public final Ql g;
    public final InterfaceC0627s7 h;
    public V8 i;

    public U8(Context context, ProtobufStateStorage protobufStateStorage, W8 w8, InterfaceC0301gr interfaceC0301gr, Mp mp, Sl sl, Ql ql, InterfaceC0627s7 interfaceC0627s7, V8 v8) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = w8;
        this.d = interfaceC0301gr;
        this.e = mp;
        this.f = sl;
        this.g = ql;
        this.h = interfaceC0627s7;
        this.i = v8;
    }

    @NotNull
    public final Y8 a(@NotNull Y8 y8) {
        Y8 c;
        this.h.a(this.a);
        synchronized (this) {
            b(y8);
            c = c();
        }
        return c;
    }

    public final synchronized boolean b(@NotNull Y8 y8) {
        try {
            boolean z = false;
            if (y8.a() == X8.b) {
                return false;
            }
            if (y8.equals(this.i.b())) {
                return false;
            }
            List list = (List) this.d.invoke(this.i.a(), y8);
            boolean z2 = list != null;
            if (list == null) {
                list = this.i.a();
            }
            if (this.c.a(y8, this.i.b())) {
                z = true;
            } else {
                y8 = (Y8) this.i.b();
            }
            if (z || z2) {
                V8 v8 = this.i;
                V8 v82 = (V8) this.e.invoke(y8, list);
                this.i = v82;
                this.b.save(v82);
                AbstractC0210dm.a("Update distribution data: %s -> %s", v8, this.i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized Y8 c() {
        try {
            if (!this.g.a()) {
                Y8 y8 = (Y8) this.f.invoke();
                this.g.b();
                if (y8 != null) {
                    b(y8);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Y8) this.i.b();
    }

    @NotNull
    public final synchronized V8 a() {
        return this.i;
    }

    @NotNull
    public final Y8 b() {
        this.h.a(this.a);
        return c();
    }
}
