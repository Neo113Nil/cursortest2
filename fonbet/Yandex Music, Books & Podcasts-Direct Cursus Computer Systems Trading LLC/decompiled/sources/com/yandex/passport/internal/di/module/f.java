package com.yandex.passport.internal.di.module;

import android.content.Context;
import com.yandex.passport.internal.database.PassportDatabase;
import defpackage.a4g;
import defpackage.hyf;
import defpackage.rzm;
import defpackage.seo;

/* loaded from: classes4.dex */
public final class f implements rzm {
    public final /* synthetic */ int a;
    public final e b;
    public final rzm c;

    public /* synthetic */ f(e eVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = eVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        int i = this.a;
        rzm rzmVar = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                PassportDatabase passportDatabase = (PassportDatabase) rzmVar.get();
                eVar.getClass();
                passportDatabase.getClass();
                com.yandex.passport.internal.database.auth_cookie.d v = passportDatabase.v();
                a4g.t(v);
                return v;
            case 1:
                com.yandex.passport.internal.database.d dVar = (com.yandex.passport.internal.database.d) rzmVar.get();
                eVar.getClass();
                dVar.getClass();
                com.yandex.passport.internal.database.h hVar = dVar.b;
                a4g.t(hVar);
                return hVar;
            case 2:
                PassportDatabase passportDatabase2 = (PassportDatabase) rzmVar.get();
                eVar.getClass();
                passportDatabase2.getClass();
                com.yandex.passport.internal.database.diary.c w = passportDatabase2.w();
                a4g.t(w);
                return w;
            case 3:
                PassportDatabase passportDatabase3 = (PassportDatabase) rzmVar.get();
                eVar.getClass();
                passportDatabase3.getClass();
                com.yandex.passport.internal.database.diary.e x = passportDatabase3.x();
                a4g.t(x);
                return x;
            case 4:
                com.yandex.passport.internal.database.d dVar2 = (com.yandex.passport.internal.database.d) rzmVar.get();
                eVar.getClass();
                dVar2.getClass();
                return new com.yandex.passport.internal.database.e(dVar2);
            default:
                Context context = (Context) rzmVar.get();
                eVar.getClass();
                context.getClass();
                seo A = hyf.A(context, PassportDatabase.class, "passport-database");
                A.a(com.yandex.passport.internal.database.g.a);
                return (PassportDatabase) A.b();
        }
    }
}
