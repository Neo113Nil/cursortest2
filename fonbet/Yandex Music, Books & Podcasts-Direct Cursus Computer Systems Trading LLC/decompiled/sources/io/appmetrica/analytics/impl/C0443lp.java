package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.lp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0443lp implements InterfaceC0530op {
    public volatile C0385jp a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public final void a(@NotNull Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Vp) Tp.a(C0501np.class)).create(context);
        Gr a = C0747wb.k().D().a();
        synchronized (a) {
            optStringOrNull = JsonUtils.optStringOrNull(a.a.a(), "device_id");
        }
        a(new C0385jp(optStringOrNull, a.a(), (C0501np) create.read()));
    }

    @NotNull
    public final C0385jp b() {
        C0385jp c0385jp = this.a;
        if (c0385jp != null) {
            return c0385jp;
        }
        Intrinsics.j("startupState");
        throw null;
    }

    public final void b(@NotNull InterfaceC0530op interfaceC0530op) {
        this.b.remove(interfaceC0530op);
    }

    public final void a(@NotNull InterfaceC0530op interfaceC0530op) {
        this.b.add(interfaceC0530op);
        if (this.a != null) {
            C0385jp c0385jp = this.a;
            if (c0385jp != null) {
                interfaceC0530op.a(c0385jp);
            } else {
                Intrinsics.j("startupState");
                throw null;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0530op
    public final void a(@NotNull C0385jp c0385jp) {
        this.a = c0385jp;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0530op) it.next()).a(c0385jp);
        }
    }
}
