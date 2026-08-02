package com.yandex.passport.internal.di.module;

import android.content.Context;
import android.content.res.Resources;
import com.yandex.passport.internal.properties.x;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class b implements rzm {
    public final /* synthetic */ int a;
    public final a b;
    public final rzm c;

    public /* synthetic */ b(a aVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = aVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.common.b bVar = (com.yandex.passport.internal.common.b) this.c.get();
                this.b.getClass();
                bVar.getClass();
                return bVar;
            case 1:
                com.yandex.passport.internal.common.d dVar = (com.yandex.passport.internal.common.d) this.c.get();
                this.b.getClass();
                dVar.getClass();
                return dVar;
            case 2:
                com.yandex.passport.internal.common.f fVar = (com.yandex.passport.internal.common.f) this.c.get();
                this.b.getClass();
                fVar.getClass();
                return fVar;
            case 3:
                com.yandex.passport.internal.common.k kVar = (com.yandex.passport.internal.common.k) this.c.get();
                this.b.getClass();
                kVar.getClass();
                return kVar;
            case 4:
                com.yandex.passport.internal.ui.lang.a aVar = (com.yandex.passport.internal.ui.lang.a) this.c.get();
                this.b.getClass();
                aVar.getClass();
                return aVar;
            case 5:
                Context context = (Context) this.c.get();
                this.b.getClass();
                context.getClass();
                Resources resources = context.getResources();
                resources.getClass();
                return new com.yandex.passport.common.resources.b(resources);
            default:
                x xVar = (x) this.c.get();
                this.b.getClass();
                xVar.getClass();
                return Boolean.valueOf(xVar.x);
        }
    }
}
