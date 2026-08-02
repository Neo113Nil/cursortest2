package com.yandex.plus.experiments.impl.cache;

import android.content.SharedPreferences;
import com.yandex.plus.experiments.api.cache.f;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjt;
import defpackage.qgg;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c extends com.yandex.plus.experiments.api.cache.c {
    public final com.yandex.plus.core.config.a c;
    public final kotlinx.coroutines.a d;
    public final x3f e;
    public final SharedPreferences f;
    public final Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.yandex.plus.core.android.extensions.c cVar, long j, com.yandex.plus.core.config.a aVar, kotlinx.coroutines.a aVar2, x3f x3fVar, SharedPreferences sharedPreferences, Function0 function0) {
        super(cVar, j);
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.c = aVar;
        this.d = aVar2;
        this.e = x3fVar;
        this.f = sharedPreferences;
        this.g = function0;
    }

    public static final String j(c cVar) {
        return cVar.c.name() + '[' + cVar.g.invoke() + ']';
    }

    @Override // com.yandex.plus.experiments.api.cache.c
    public final Object a(long j, Continuation continuation) {
        Object g = g(null, (cg6) continuation);
        return g == nm6.a ? g : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.experiments.api.cache.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(cg6 cg6Var) {
        a aVar;
        int i;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjt pjtVar = new pjt(this, null, 24);
                    aVar.l = 1;
                    obj = x97.V(this.d, pjtVar, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return (f) obj;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        return (f) obj2;
    }

    @Override // com.yandex.plus.experiments.api.cache.c
    public final Object g(f fVar, cg6 cg6Var) {
        return x97.V(this.d, new b(this, fVar, null, 0), cg6Var);
    }
}
