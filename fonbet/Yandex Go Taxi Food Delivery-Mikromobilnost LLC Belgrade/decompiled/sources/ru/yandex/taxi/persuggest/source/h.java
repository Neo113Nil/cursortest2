package ru.yandex.taxi.persuggest.source;

import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2s;
import defpackage.p7v0;
import defpackage.sjh;
import defpackage.sta0;
import defpackage.t9j0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v03;
import defpackage.v5v0;
import defpackage.w7v0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.suggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class h {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final sta0 b;
    public final v5v0 c;
    public final tt2 d;
    public final a e;
    public final o2s f;
    public final w7v0 g;

    public h(ru.yandex.taxi.persuggest.api.a aVar, sta0 sta0Var, v5v0 v5v0Var, tt2 tt2Var, a aVar2, o2s o2sVar, w7v0 w7v0Var) {
        this.a = aVar;
        this.b = sta0Var;
        this.c = v5v0Var;
        this.d = tt2Var;
        this.e = aVar2;
        this.f = o2sVar;
        this.g = w7v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t9j0 t9j0Var, ContinuationImpl continuationImpl) {
        SuggestRepositoryImpl$notFullAddressSelected$1 suggestRepositoryImpl$notFullAddressSelected$1;
        int i;
        String str;
        if (continuationImpl instanceof SuggestRepositoryImpl$notFullAddressSelected$1) {
            suggestRepositoryImpl$notFullAddressSelected$1 = (SuggestRepositoryImpl$notFullAddressSelected$1) continuationImpl;
            int i2 = suggestRepositoryImpl$notFullAddressSelected$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestRepositoryImpl$notFullAddressSelected$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestRepositoryImpl$notFullAddressSelected$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestRepositoryImpl$notFullAddressSelected$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Action action = Action.USER_SELECT;
                    suggestRepositoryImpl$notFullAddressSelected$1.L$0 = t9j0Var;
                    suggestRepositoryImpl$notFullAddressSelected$1.label = 1;
                    obj = b(action, t9j0Var, suggestRepositoryImpl$notFullAddressSelected$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t9j0Var = (t9j0) suggestRepositoryImpl$notFullAddressSelected$1.L$0;
                    kotlin.b.b(obj);
                }
                str = t9j0Var.e;
                if (str != null) {
                    this.c.a(t9j0Var.b, str);
                }
                return obj;
            }
        }
        suggestRepositoryImpl$notFullAddressSelected$1 = new SuggestRepositoryImpl$notFullAddressSelected$1(this, continuationImpl);
        Object obj3 = suggestRepositoryImpl$notFullAddressSelected$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestRepositoryImpl$notFullAddressSelected$1.label;
        if (i != 0) {
        }
        str = t9j0Var.e;
        if (str != null) {
        }
        return obj3;
    }

    public final Object b(Action action, t9j0 t9j0Var, ContinuationImpl continuationImpl) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SuggestRepositoryImpl$request$2(this, action, t9j0Var, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, RoutePointType routePointType, String str3, ContinuationImpl continuationImpl) {
        SuggestRepositoryImpl$requestV2$1 suggestRepositoryImpl$requestV2$1;
        int i;
        String str4;
        String str5;
        RoutePointType routePointType2;
        if (continuationImpl instanceof SuggestRepositoryImpl$requestV2$1) {
            suggestRepositoryImpl$requestV2$1 = (SuggestRepositoryImpl$requestV2$1) continuationImpl;
            int i2 = suggestRepositoryImpl$requestV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestRepositoryImpl$requestV2$1.label = i2 - Integer.MIN_VALUE;
                SuggestRepositoryImpl$requestV2$1 suggestRepositoryImpl$requestV2$12 = suggestRepositoryImpl$requestV2$1;
                Object obj = suggestRepositoryImpl$requestV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestRepositoryImpl$requestV2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    suggestRepositoryImpl$requestV2$12.L$0 = str;
                    suggestRepositoryImpl$requestV2$12.L$1 = str2;
                    suggestRepositoryImpl$requestV2$12.L$2 = routePointType;
                    suggestRepositoryImpl$requestV2$12.L$3 = null;
                    suggestRepositoryImpl$requestV2$12.label = 1;
                    Object b = a.b(this.e, str3, null, null, null, null, null, null, false, suggestRepositoryImpl$requestV2$12, 254);
                    if (b != coroutineSingletons) {
                        str4 = str2;
                        str5 = str;
                        obj = b;
                        routePointType2 = routePointType;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                routePointType2 = (RoutePointType) suggestRepositoryImpl$requestV2$12.L$2;
                String str6 = (String) suggestRepositoryImpl$requestV2$12.L$1;
                String str7 = (String) suggestRepositoryImpl$requestV2$12.L$0;
                kotlin.b.b(obj);
                str4 = str6;
                str5 = str7;
                p7v0 p7v0Var = new p7v0(Action.USER_INPUT, (v03) obj, routePointType2.getType(), str5, str4, null, null, null, null, null, null);
                String a = this.b.a();
                suggestRepositoryImpl$requestV2$12.L$0 = null;
                suggestRepositoryImpl$requestV2$12.L$1 = null;
                suggestRepositoryImpl$requestV2$12.L$2 = null;
                suggestRepositoryImpl$requestV2$12.L$3 = null;
                suggestRepositoryImpl$requestV2$12.L$4 = null;
                suggestRepositoryImpl$requestV2$12.L$5 = null;
                suggestRepositoryImpl$requestV2$12.label = 2;
                Object f = this.a.f(a, p7v0Var, suggestRepositoryImpl$requestV2$12);
                return f != coroutineSingletons ? coroutineSingletons : f;
            }
        }
        suggestRepositoryImpl$requestV2$1 = new SuggestRepositoryImpl$requestV2$1(this, continuationImpl);
        SuggestRepositoryImpl$requestV2$1 suggestRepositoryImpl$requestV2$122 = suggestRepositoryImpl$requestV2$1;
        Object obj2 = suggestRepositoryImpl$requestV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestRepositoryImpl$requestV2$122.label;
        if (i != 0) {
        }
        p7v0 p7v0Var2 = new p7v0(Action.USER_INPUT, (v03) obj2, routePointType2.getType(), str5, str4, null, null, null, null, null, null);
        String a2 = this.b.a();
        suggestRepositoryImpl$requestV2$122.L$0 = null;
        suggestRepositoryImpl$requestV2$122.L$1 = null;
        suggestRepositoryImpl$requestV2$122.L$2 = null;
        suggestRepositoryImpl$requestV2$122.L$3 = null;
        suggestRepositoryImpl$requestV2$122.L$4 = null;
        suggestRepositoryImpl$requestV2$122.L$5 = null;
        suggestRepositoryImpl$requestV2$122.label = 2;
        Object f2 = this.a.f(a2, p7v0Var2, suggestRepositoryImpl$requestV2$122);
        if (f2 != coroutineSingletons2) {
        }
    }
}
