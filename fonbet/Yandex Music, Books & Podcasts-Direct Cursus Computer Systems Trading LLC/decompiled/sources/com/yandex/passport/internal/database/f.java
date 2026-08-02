package com.yandex.passport.internal.database;

import defpackage.i5i;
import defpackage.p6g;
import defpackage.rsr;
import defpackage.xjo;

/* loaded from: classes4.dex */
public final class f extends i5i {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.i5i
    public void a(xjo xjoVar) {
        switch (this.c) {
            case 1:
                p6g.s(xjoVar, "CREATE TABLE IF NOT EXISTS `auth_cookie` (`uid` TEXT NOT NULL, `cookies` TEXT NOT NULL, PRIMARY KEY(`uid`))");
                break;
            default:
                super.a(xjoVar);
                break;
        }
    }

    @Override // defpackage.i5i
    public void b(rsr rsrVar) {
        switch (this.c) {
            case 0:
                rsrVar.getClass();
                rsrVar.execSQL("CREATE TABLE IF NOT EXISTS modern_auth_cookie (\n    uid TEXT NOT NULL,\n    cookies TEXT NOT NULL,\n    domain TEXT NOT NULL DEFAULT '',\n    PRIMARY KEY (uid, domain)\n);");
                rsrVar.execSQL("INSERT INTO modern_auth_cookie (uid, cookies, domain)\nSELECT uid, cookies, '' FROM auth_cookie;");
                rsrVar.execSQL("DROP TABLE auth_cookie");
                break;
            default:
                super.b(rsrVar);
                break;
        }
    }
}
