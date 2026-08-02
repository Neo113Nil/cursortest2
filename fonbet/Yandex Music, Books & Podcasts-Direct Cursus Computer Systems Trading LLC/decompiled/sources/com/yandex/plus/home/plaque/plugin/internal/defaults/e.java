package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.SharedPreferences;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.home.datasource.openapi.models.g7;
import defpackage.aur;
import defpackage.ff7;
import defpackage.i5f;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h l;
    public final /* synthetic */ com.yandex.plus.home.plaque.repository.rest.a m;
    public final /* synthetic */ g7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, com.yandex.plus.home.plaque.repository.rest.a aVar, g7 g7Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = hVar;
        this.m = aVar;
        this.n = g7Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                e eVar = new e(this.l, this.m, this.n, continuation, 0);
                eVar.k = obj;
                return eVar;
            default:
                e eVar2 = new e(this.l, this.m, this.n, continuation, 1);
                eVar2.k = obj;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((e) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object t7oVar2;
        int i = this.j;
        g7 g7Var = this.n;
        com.yandex.plus.home.plaque.repository.rest.a aVar = this.m;
        h hVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar = z7o.b;
                    SharedPreferences sharedPreferences = (SharedPreferences) hVar.d;
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    String concat = h.H(aVar).concat("_fallback");
                    i5f i5fVar = (i5f) hVar.e;
                    i5fVar.getClass();
                    edit.putString(concat, i5fVar.c(ff7.C(g7.Companion.serializer()), g7Var));
                    edit.commit();
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) hVar.b;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar2)) {
                        bVar.a(aVar2, "DefaultPrefsRestPlaqueDataSource", "putFallbackPlaque(key=" + h.H(aVar) + ", model=" + g7Var + ')', a);
                    }
                }
                return new z7o(t7oVar);
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar3 = z7o.b;
                    SharedPreferences sharedPreferences2 = (SharedPreferences) hVar.d;
                    sharedPreferences2.getClass();
                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                    String concat2 = h.H(aVar).concat("_prefetch");
                    i5f i5fVar2 = (i5f) hVar.e;
                    i5fVar2.getClass();
                    edit2.putString(concat2, i5fVar2.c(ff7.C(g7.Companion.serializer()), g7Var));
                    edit2.commit();
                    t7oVar2 = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar2);
                if (a2 != null) {
                    com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) hVar.b;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar3)) {
                        bVar2.a(aVar3, "DefaultPrefsRestPlaqueDataSource", "putPrefetchPlaque(key=" + h.H(aVar) + ", model=" + g7Var + ')', a2);
                    }
                }
                return new z7o(t7oVar2);
        }
    }
}
