package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.b6s;
import defpackage.gci0;
import defpackage.i4s;
import defpackage.j6s;
import defpackage.mth;
import defpackage.p6s;
import defpackage.wsr0;
import defpackage.xsr0;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class e implements p6s {
    public final c a;
    public final gci0 b;

    public e(b6s b6sVar, i4s i4sVar, c cVar) {
        this.a = cVar;
        this.b = kotlinx.coroutines.flow.e.R(new m0(kotlinx.coroutines.flow.e.d(i4sVar.a), cVar.e(), new FormStateRepositoryImpl$stateFlow$1(3, null)), b6sVar, wsr0.a(xsr0.a, 3), null);
    }

    @Override // defpackage.p6s
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.p6s
    public final j6s b() {
        return (j6s) this.b.a.getValue();
    }

    @Override // defpackage.p6s
    public final void c(Object obj, String str) {
        this.a.c(obj, str);
    }

    @Override // defpackage.p6s
    public final void d(LinkedHashMap linkedHashMap) {
        this.a.d(linkedHashMap);
    }

    @Override // defpackage.p6s
    public final mth e() {
        return new mth(this.b, 6);
    }
}
