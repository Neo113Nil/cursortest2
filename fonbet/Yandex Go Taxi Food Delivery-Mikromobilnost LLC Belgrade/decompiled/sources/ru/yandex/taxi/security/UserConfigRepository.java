package ru.yandex.taxi.security;

import defpackage.i3y;
import defpackage.l8x;
import defpackage.lr40;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.on2;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.z93;
import kotlin.a;

/* loaded from: classes10.dex */
public final class UserConfigRepository {
    public final tse a;
    public final i3y b;

    public UserConfigRepository(on2 on2Var, tse tseVar) {
        this.a = tseVar;
        this.b = a.a(new lr40(on2Var, 18));
    }

    public final l8x a(String str, meu meuVar, m5j0 m5j0Var, wls wlsVar, sls slsVar) {
        return tje.N(this.a, uyj.b.plus(new z93(slsVar)), null, new UserConfigRepository$sendRequest$1(this, str, meuVar, m5j0Var, wlsVar, null), 2);
    }
}
