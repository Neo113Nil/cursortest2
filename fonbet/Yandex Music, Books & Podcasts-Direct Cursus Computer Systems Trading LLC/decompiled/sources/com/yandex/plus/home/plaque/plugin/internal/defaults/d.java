package com.yandex.plus.home.plaque.plugin.internal.defaults;

import android.content.SharedPreferences;
import com.yandex.passport.internal.core.accounts.h;
import com.yandex.plus.home.datasource.openapi.models.e8;
import com.yandex.plus.home.datasource.openapi.models.g7;
import defpackage.aur;
import defpackage.i5f;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qy0;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h l;
    public final /* synthetic */ com.yandex.plus.home.plaque.repository.rest.a m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, com.yandex.plus.home.plaque.repository.rest.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = hVar;
        this.m = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                d dVar = new d(this.l, this.m, continuation, 0);
                dVar.k = obj;
                return dVar;
            case 1:
                d dVar2 = new d(this.l, this.m, continuation, 1);
                dVar2.k = obj;
                return dVar2;
            default:
                d dVar3 = new d(this.l, this.m, continuation, 2);
                dVar3.k = obj;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((d) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object t7oVar2;
        Object t7oVar3;
        int i = this.j;
        com.yandex.plus.home.plaque.repository.rest.a aVar = this.m;
        h hVar = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar = z7o.b;
                    String string = ((SharedPreferences) hVar.d).getString(h.H(aVar).concat("_fallback"), null);
                    if (string != null) {
                        i5f i5fVar = (i5f) hVar.e;
                        i5fVar.getClass();
                        t7oVar = (g7) i5fVar.b(g7.Companion.serializer(), string);
                    } else {
                        t7oVar = null;
                    }
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) hVar.b;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    if (bVar.b(aVar2)) {
                        bVar.a(aVar2, "DefaultPrefsRestPlaqueDataSource", "getFallbackModel(key=" + h.H(aVar) + ") error", a);
                    }
                }
                if (t7oVar instanceof t7o) {
                    return null;
                }
                return t7oVar;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar3 = z7o.b;
                    String string2 = ((SharedPreferences) hVar.d).getString(h.H(aVar).concat("_prefetch"), null);
                    if (string2 != null) {
                        i5f i5fVar2 = (i5f) hVar.e;
                        i5fVar2.getClass();
                        t7oVar2 = (g7) i5fVar2.b(g7.Companion.serializer(), string2);
                    } else {
                        t7oVar2 = null;
                    }
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar2);
                if (a2 != null) {
                    com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) hVar.b;
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar3)) {
                        bVar2.a(aVar3, "DefaultPrefsRestPlaqueDataSource", "getPrefetchPlaque(key=" + h.H(aVar) + ") error", a2);
                    }
                }
                if (t7oVar2 instanceof t7o) {
                    return null;
                }
                return t7oVar2;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    r7o r7oVar5 = z7o.b;
                    String string3 = ((SharedPreferences) hVar.d).getString(h.H(aVar).concat("_widgets"), null);
                    if (string3 != null) {
                        i5f i5fVar3 = (i5f) hVar.e;
                        i5fVar3.getClass();
                        t7oVar3 = (List) i5fVar3.b(new qy0(e8.Companion.serializer(), 0), string3);
                    } else {
                        t7oVar3 = null;
                    }
                } catch (Throwable th3) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar3 = new t7o(th3);
                }
                Throwable a3 = z7o.a(t7oVar3);
                if (a3 != null) {
                    com.yandex.plus.log.api.b bVar3 = (com.yandex.plus.log.api.b) hVar.b;
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.e;
                    if (bVar3.b(aVar4)) {
                        bVar3.a(aVar4, "DefaultPrefsRestPlaqueDataSource", "getWidgets(key=" + h.H(aVar) + ") error", a3);
                    }
                }
                if (t7oVar3 instanceof t7o) {
                    return null;
                }
                return t7oVar3;
        }
    }
}
