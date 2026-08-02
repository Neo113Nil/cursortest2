package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class Ej extends AbstractC0697uj {
    public final Tg b;
    public final ProtobufStateStorage c;
    public final C0450m3 d;
    public final O2 e;
    public final C0248f3 f;

    public Ej(P5 p5, Tg tg) {
        this(p5, tg, ((Vp) Tp.a(F2.class)).create(p5.getContext()), new C0450m3(p5.getContext()), new O2(), new C0248f3(p5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        P5 p5 = this.a;
        p5.b.toString();
        if (!p5.t.c() || !p5.y()) {
            return false;
        }
        F2 f2 = (F2) this.c.read();
        List list = f2.a;
        C0421l3 c0421l3 = f2.b;
        C0450m3 c0450m3 = this.d;
        c0450m3.getClass();
        F2 f22 = null;
        C0421l3 a = AndroidUtils.isApiAchieved(28) ? C0335i3.a(c0450m3.a, c0450m3.b) : null;
        List list2 = f2.c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0219e3());
        Tg tg = this.b;
        Context context = this.a.a;
        tg.getClass();
        ArrayList a2 = new Nl(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a2, list)) {
            a2 = null;
        }
        if (a2 != null || !AbstractC0734vr.a(c0421l3, a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a2 != null) {
                list = a2;
            }
            f22 = new F2(list, a, list3);
        }
        if (f22 != null) {
            C0630sa c0630sa = p5.n;
            H6 a3 = H6.a(h6, f22.a, f22.b, this.e, f22.c);
            c0630sa.a(a3, Tn.a(c0630sa.c.b(a3), a3.i));
            long currentTimeSeconds = c0630sa.i.currentTimeSeconds();
            c0630sa.k = currentTimeSeconds;
            c0630sa.a.a(currentTimeSeconds).b();
            this.c.save(f22);
            return false;
        }
        if (!p5.B()) {
            return false;
        }
        C0630sa c0630sa2 = p5.n;
        H6 a4 = H6.a(h6, f2.a, f2.b, this.e, f2.c);
        c0630sa2.a(a4, Tn.a(c0630sa2.c.b(a4), a4.i));
        long currentTimeSeconds2 = c0630sa2.i.currentTimeSeconds();
        c0630sa2.k = currentTimeSeconds2;
        c0630sa2.a.a(currentTimeSeconds2).b();
        return false;
    }

    public Ej(P5 p5, Tg tg, ProtobufStateStorage protobufStateStorage, C0450m3 c0450m3, O2 o2, C0248f3 c0248f3) {
        super(p5);
        this.b = tg;
        this.c = protobufStateStorage;
        this.d = c0450m3;
        this.e = o2;
        this.f = c0248f3;
    }
}
