package ru.yandex.taxi.logistics.sdk.management.localstate;

import android.content.SharedPreferences;
import defpackage.osh;
import defpackage.tje;
import defpackage.wi3;
import defpackage.zy11;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class a implements wi3 {
    public final e a;
    public final osh b;

    public a(e eVar, osh oshVar) {
        this.a = eVar;
        this.b = oshVar;
    }

    @Override // defpackage.wi3
    public final void a() {
        e eVar = this.a;
        r0 r0Var = eVar.i;
        r0Var.getClass();
        r0Var.m(null, EmptySet.a);
        SharedPreferences.Editor edit = eVar.a().edit();
        edit.clear();
        edit.apply();
        tje.N(eVar.e, null, null, new DeliveriesLocalStateRepositoryImpl$clearAll$2(eVar, null), 3);
        this.b.a.g(zy11.a);
    }
}
