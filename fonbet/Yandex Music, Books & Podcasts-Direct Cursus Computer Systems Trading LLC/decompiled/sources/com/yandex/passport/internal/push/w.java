package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.nm6;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class w extends x {
    public final v2 a;
    public final String b;

    public w(v2 v2Var, String str) {
        v2Var.getClass();
        this.a = v2Var;
        this.b = str;
    }

    @Override // com.yandex.passport.internal.push.x
    public final Object a(g gVar, y yVar) {
        Object g = gVar.g(this.a, this.b, yVar);
        return g == nm6.a ? g : Unit.a;
    }
}
