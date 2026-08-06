package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307bh extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C0847we f5672b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f5673c;

    /* renamed from: d, reason: collision with root package name */
    public final C0887y2 f5674d;

    /* renamed from: e, reason: collision with root package name */
    public final C0318c2 f5675e;

    /* renamed from: f, reason: collision with root package name */
    public final C0705r2 f5676f;

    public C0307bh(X4 x4, C0847we c0847we) {
        this(x4, c0847we, ((Rm) Pm.a(T1.class)).create(x4.getContext()), new C0887y2(x4.getContext()), new C0318c2(), new C0705r2(x4.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f4998a;
        x4.f5347b.toString();
        if (!x4.t.c() || !x4.x()) {
            return false;
        }
        T1 t12 = (T1) this.f5673c.read();
        List list = t12.f5083a;
        C0861x2 c0861x2 = t12.f5084b;
        C0887y2 c0887y2 = this.f5674d;
        c0887y2.getClass();
        T1 t13 = null;
        C0861x2 a2 = AndroidUtils.isApiAchieved(28) ? C0783u2.a(c0887y2.f7224a, c0887y2.f7225b) : null;
        List list2 = t12.f5085c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f5676f.f6805a, "getting available providers", "location manager", Collections.emptyList(), new C0680q2());
        C0847we c0847we = this.f5672b;
        Context context = this.f4998a.f5346a;
        c0847we.getClass();
        ArrayList a3 = new Pi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a3, list)) {
            a3 = null;
        }
        if (a3 != null || !AbstractC0572lo.a(c0861x2, a2) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a3 != null) {
                list = a3;
            }
            t13 = new T1(list, a2, list3);
        }
        if (t13 != null) {
            C0531k9 c0531k9 = x4.f5359n;
            P5 a4 = P5.a(p5, t13.f5083a, t13.f5084b, this.f5675e, t13.f5085c);
            c0531k9.a(a4, Rk.a(c0531k9.f6357c.b(a4), a4.f4912i));
            long currentTimeSeconds = c0531k9.f6363i.currentTimeSeconds();
            c0531k9.f6365k = currentTimeSeconds;
            c0531k9.f6355a.a(currentTimeSeconds).b();
            this.f5673c.save(t13);
            return false;
        }
        if (!x4.A()) {
            return false;
        }
        C0531k9 c0531k92 = x4.f5359n;
        P5 a5 = P5.a(p5, t12.f5083a, t12.f5084b, this.f5675e, t12.f5085c);
        c0531k92.a(a5, Rk.a(c0531k92.f6357c.b(a5), a5.f4912i));
        long currentTimeSeconds2 = c0531k92.f6363i.currentTimeSeconds();
        c0531k92.f6365k = currentTimeSeconds2;
        c0531k92.f6355a.a(currentTimeSeconds2).b();
        return false;
    }

    public C0307bh(X4 x4, C0847we c0847we, ProtobufStateStorage protobufStateStorage, C0887y2 c0887y2, C0318c2 c0318c2, C0705r2 c0705r2) {
        super(x4);
        this.f5672b = c0847we;
        this.f5673c = protobufStateStorage;
        this.f5674d = c0887y2;
        this.f5675e = c0318c2;
        this.f5676f = c0705r2;
    }
}
