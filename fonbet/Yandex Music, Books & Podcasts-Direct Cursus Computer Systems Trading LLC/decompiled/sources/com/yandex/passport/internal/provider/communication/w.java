package com.yandex.passport.internal.provider.communication;

import android.content.Context;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.push.v0;
import com.yandex.passport.internal.report.diary.b0;
import com.yandex.passport.internal.report.diary.e0;
import com.yandex.passport.internal.report.diary.q0;
import com.yandex.passport.internal.report.reporters.a1;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.report.reporters.c0;
import com.yandex.passport.internal.report.reporters.c1;
import com.yandex.passport.internal.report.reporters.d0;
import com.yandex.passport.internal.report.reporters.e1;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.report.reporters.j0;
import com.yandex.passport.internal.report.reporters.k0;
import com.yandex.passport.internal.report.reporters.u0;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.reporters.y0;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class w implements rzm {
    public final /* synthetic */ int a;
    public final rzm b;
    public final rzm c;

    public /* synthetic */ w(rzm rzmVar, rzm rzmVar2, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new v((Context) this.b.get(), (u) this.c.get());
            case 1:
                return new com.yandex.passport.common.network.n((Context) this.b.get(), (com.yandex.passport.internal.network.d) this.c.get());
            case 2:
                return new v0((com.yandex.passport.common.a) this.b.get(), (com.yandex.passport.internal.flags.i) this.c.get());
            case 3:
                return new com.yandex.passport.internal.report.d((com.yandex.passport.internal.f) this.b.get(), (x) this.c.get());
            case 4:
                return new b0((com.yandex.passport.common.a) this.b.get(), (e0) this.c.get());
            case 5:
                return new q0((com.yandex.passport.internal.database.diary.e) this.b.get(), (com.yandex.passport.common.coroutine.a) this.c.get());
            case 6:
                return new com.yandex.passport.internal.report.reporters.e((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 7:
                return new com.yandex.passport.internal.report.reporters.f((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 8:
                return new com.yandex.passport.internal.report.reporters.g((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 9:
                return new com.yandex.passport.internal.report.reporters.h((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 10:
                return new com.yandex.passport.internal.report.reporters.i((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 11:
                return new com.yandex.passport.internal.report.reporters.j((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 12:
                return new com.yandex.passport.internal.report.reporters.l((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 13:
                return new com.yandex.passport.internal.report.reporters.n((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 14:
                return new com.yandex.passport.internal.report.reporters.r((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 15:
                return new com.yandex.passport.internal.report.reporters.w((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 16:
                return new c0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 17:
                return new d0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 18:
                return new com.yandex.passport.internal.report.reporters.e0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 19:
                return new j0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 20:
                return new k0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 21:
                return new u0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 22:
                return new com.yandex.passport.internal.report.reporters.v0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 23:
                return new w0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 24:
                return new y0((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 25:
                return new a1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 26:
                return new b1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case 27:
                return new c1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new e1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
            default:
                return new f1((com.yandex.passport.internal.report.g) this.b.get(), (com.yandex.passport.internal.features.a) this.c.get());
        }
    }
}
