package com.yandex.passport.sloth.url;

import android.net.Uri;
import com.yandex.passport.sloth.data.n0;
import com.yandex.passport.sloth.data.o0;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class u extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ v l;
    public final /* synthetic */ Uri m;
    public final /* synthetic */ o0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, Uri uri, o0 o0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = vVar;
        this.m = uri;
        this.n = o0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new u(this.l, this.m, this.n, continuation, 0);
            case 1:
                return new u(this.l, this.m, this.n, continuation, 1);
            default:
                return new u(this.l, this.m, this.n, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object a;
        Object d;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f fVar = ((com.yandex.passport.sloth.data.v) this.n).c;
                    this.k = 1;
                    b = v.b(this.l, this.m, fVar, this);
                    if (b == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                    b = bVar != null ? bVar.a : null;
                }
                String str = (String) b;
                if (str != null) {
                    return new com.yandex.passport.common.url.b(str);
                }
                return null;
            case 1:
                Object obj3 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f fVar2 = ((n0) this.n).c;
                    this.k = 1;
                    a = v.a(this.l, this.m, fVar2, this);
                    if (a == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) obj;
                    a = bVar2 != null ? bVar2.a : null;
                }
                String str2 = (String) a;
                if (str2 != null) {
                    return new com.yandex.passport.common.url.b(str2);
                }
                return null;
            default:
                Object obj4 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.core.f fVar3 = ((com.yandex.passport.sloth.data.t) this.n).b;
                    this.k = 1;
                    d = v.d(this.l, this.m, fVar3, this);
                    if (d == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = ((com.yandex.passport.common.url.b) obj).a;
                }
                return new com.yandex.passport.common.url.b((String) d);
        }
    }
}
