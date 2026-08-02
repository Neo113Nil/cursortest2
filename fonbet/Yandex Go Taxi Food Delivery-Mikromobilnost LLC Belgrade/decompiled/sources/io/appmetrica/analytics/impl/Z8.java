package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class Z8 {
    public final Context a;
    public final ProtobufStateStorage b;
    public final AbstractC0213b9 c;
    public final InterfaceC0895yr d;
    public final InterfaceC0316eq e;
    public final InterfaceC0456jm f;
    public final InterfaceC0399hm g;
    public final InterfaceC0846x7 h;
    public InterfaceC0184a9 i;

    public Z8(Context context, ProtobufStateStorage protobufStateStorage, AbstractC0213b9 abstractC0213b9, InterfaceC0895yr interfaceC0895yr, InterfaceC0316eq interfaceC0316eq, InterfaceC0456jm interfaceC0456jm, InterfaceC0399hm interfaceC0399hm, InterfaceC0846x7 interfaceC0846x7, InterfaceC0184a9 interfaceC0184a9) {
        this.a = context;
        this.b = protobufStateStorage;
        this.c = abstractC0213b9;
        this.d = interfaceC0895yr;
        this.e = interfaceC0316eq;
        this.f = interfaceC0456jm;
        this.g = interfaceC0399hm;
        this.h = interfaceC0846x7;
        this.i = interfaceC0184a9;
    }

    public final InterfaceC0299e9 a(InterfaceC0299e9 interfaceC0299e9) {
        InterfaceC0299e9 c;
        this.h.a(this.a);
        synchronized (this) {
            b(interfaceC0299e9);
            c = c();
        }
        return c;
    }

    public final synchronized boolean b(InterfaceC0299e9 interfaceC0299e9) {
        try {
            boolean z = false;
            if (interfaceC0299e9.a() == EnumC0271d9.c) {
                return false;
            }
            if (interfaceC0299e9.equals(this.i.b())) {
                return false;
            }
            List list = (List) this.d.invoke(this.i.a(), interfaceC0299e9);
            boolean z2 = list != null;
            if (list == null) {
                list = this.i.a();
            }
            if (this.c.a(interfaceC0299e9, this.i.b())) {
                z = true;
            } else {
                interfaceC0299e9 = (InterfaceC0299e9) this.i.b();
            }
            if (z || z2) {
                InterfaceC0184a9 interfaceC0184a9 = this.i;
                InterfaceC0184a9 interfaceC0184a92 = (InterfaceC0184a9) this.e.invoke(interfaceC0299e9, list);
                this.i = interfaceC0184a92;
                this.b.save(interfaceC0184a92);
                AbstractC0774um.a("Update distribution data: %s -> %s", interfaceC0184a9, this.i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized InterfaceC0299e9 c() {
        try {
            if (!this.g.a()) {
                InterfaceC0299e9 interfaceC0299e9 = (InterfaceC0299e9) this.f.invoke();
                this.g.b();
                if (interfaceC0299e9 != null) {
                    b(interfaceC0299e9);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC0299e9) this.i.b();
    }

    public final synchronized InterfaceC0184a9 a() {
        return this.i;
    }

    public final InterfaceC0299e9 b() {
        this.h.a(this.a);
        return c();
    }
}
