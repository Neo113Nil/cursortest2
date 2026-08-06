package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467hm implements InterfaceC0544km {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0415fm f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6152b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0544km
    public final void a(C0415fm c0415fm) {
        this.f6151a = c0415fm;
        Iterator it = this.f6152b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0544km) it.next()).a(c0415fm);
        }
    }

    public final C0415fm b() {
        C0415fm c0415fm = this.f6151a;
        if (c0415fm != null) {
            return c0415fm;
        }
        kotlin.jvm.internal.i.i("startupState");
        throw null;
    }

    public final void b(InterfaceC0544km interfaceC0544km) {
        this.f6152b.remove(interfaceC0544km);
    }

    public final void a(InterfaceC0544km interfaceC0544km) {
        this.f6152b.add(interfaceC0544km);
        if (this.f6151a != null) {
            C0415fm c0415fm = this.f6151a;
            if (c0415fm != null) {
                interfaceC0544km.a(c0415fm);
            } else {
                kotlin.jvm.internal.i.i("startupState");
                throw null;
            }
        }
    }

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((Rm) Pm.a(C0518jm.class)).create(context);
        C0857wo a2 = C0610na.k().D().a();
        synchronized (a2) {
            optStringOrNull = JsonUtils.optStringOrNull(a2.f7161a.a(), "device_id");
        }
        a(new C0415fm(optStringOrNull, a2.a(), (C0518jm) create.read()));
    }
}
