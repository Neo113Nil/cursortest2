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

/* loaded from: classes9.dex */
public final class Oj extends Aj {
    public final C0451jh b;
    public final ProtobufStateStorage c;
    public final C0524m3 d;
    public final O2 e;
    public final C0322f3 f;

    public Oj(S5 s5, C0451jh c0451jh) {
        this(s5, c0451jh, ((AbstractC0576nq) C0518lq.a(F2.class)).create(s5.getContext()), new C0524m3(s5.getContext()), new O2(), new C0322f3(s5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        S5 s5 = this.a;
        s5.b.toString();
        if (!s5.t.c() || !s5.y()) {
            return false;
        }
        F2 f2 = (F2) this.c.read();
        List list = f2.a;
        C0495l3 c0495l3 = f2.b;
        C0524m3 c0524m3 = this.d;
        c0524m3.getClass();
        F2 f22 = null;
        C0495l3 a = AndroidUtils.isApiAchieved(28) ? C0409i3.a(c0524m3.a, c0524m3.b) : null;
        List list2 = f2.c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C0293e3());
        C0451jh c0451jh = this.b;
        Context context = this.a.a;
        c0451jh.getClass();
        ArrayList a2 = new C0255cm(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a2, list)) {
            a2 = null;
        }
        if (a2 != null || !Or.a(c0495l3, a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a2 != null) {
                list = a2;
            }
            f22 = new F2(list, a, list3);
        }
        if (f22 != null) {
            C0907za c0907za = s5.n;
            K6 a3 = K6.a(k6, f22.a, f22.b, this.e, f22.c);
            c0907za.a(a3, C0574no.a(c0907za.c.b(a3), a3.i));
            long currentTimeSeconds = c0907za.i.currentTimeSeconds();
            c0907za.k = currentTimeSeconds;
            c0907za.a.a(currentTimeSeconds);
            this.c.save(f22);
            return false;
        }
        if (!s5.B()) {
            return false;
        }
        C0907za c0907za2 = s5.n;
        K6 a4 = K6.a(k6, f2.a, f2.b, this.e, f2.c);
        c0907za2.a(a4, C0574no.a(c0907za2.c.b(a4), a4.i));
        long currentTimeSeconds2 = c0907za2.i.currentTimeSeconds();
        c0907za2.k = currentTimeSeconds2;
        c0907za2.a.a(currentTimeSeconds2);
        return false;
    }

    public Oj(S5 s5, C0451jh c0451jh, ProtobufStateStorage protobufStateStorage, C0524m3 c0524m3, O2 o2, C0322f3 c0322f3) {
        super(s5);
        this.b = c0451jh;
        this.c = protobufStateStorage;
        this.d = c0524m3;
        this.e = o2;
        this.f = c0322f3;
    }
}
