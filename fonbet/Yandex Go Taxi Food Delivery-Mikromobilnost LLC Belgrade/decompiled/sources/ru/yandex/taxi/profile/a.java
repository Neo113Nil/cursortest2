package ru.yandex.taxi.profile;

import defpackage.bvf0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jbh;
import defpackage.jl90;
import defpackage.lxx;
import defpackage.ml90;
import defpackage.n150;
import defpackage.ny61;
import defpackage.on2;
import defpackage.owx;
import defpackage.q8i0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.profile.api.ProfileApi;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes9.dex */
public final class a implements lxx {
    public final h a;
    public final i3y b;
    public final qqo c;
    public final r0 d = bvf0.c(n150.c);

    public a(on2 on2Var, h hVar, rqo rqoVar) {
        this.a = hVar;
        this.b = kotlin.a.a(new ck(on2Var, 23));
        this.c = ((jbh) rqoVar).c(q8i0.f);
    }

    public final n150 a() {
        h hVar = this.a;
        return new n150(((cne0) hVar.b).l("user_first_name", null), ((cne0) hVar.b).l("user_rating", null));
    }

    public final boolean b() {
        ((q8i0) this.c.b()).getClass();
        return !evu0.J(d6z.Y(r1, "rating_info_message"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        RatingAndNameInteractorImpl$updateUserName$1 ratingAndNameInteractorImpl$updateUserName$1;
        int i;
        if (continuationImpl instanceof RatingAndNameInteractorImpl$updateUserName$1) {
            ratingAndNameInteractorImpl$updateUserName$1 = (RatingAndNameInteractorImpl$updateUserName$1) continuationImpl;
            int i2 = ratingAndNameInteractorImpl$updateUserName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ratingAndNameInteractorImpl$updateUserName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ratingAndNameInteractorImpl$updateUserName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ratingAndNameInteractorImpl$updateUserName$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<jl90> a = ((ProfileApi) this.b.getValue()).a(new ml90(str));
                    ratingAndNameInteractorImpl$updateUserName$1.L$0 = null;
                    ratingAndNameInteractorImpl$updateUserName$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, ratingAndNameInteractorImpl$updateUserName$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                h hVar = this.a;
                hVar.Ng((jl90) obj);
                cne0 cne0Var = (cne0) hVar.b;
                n150 n150Var = new n150(cne0Var.l("user_first_name", null), cne0Var.l("user_rating", null));
                r0 r0Var = this.d;
                r0Var.getClass();
                r0Var.m(null, n150Var);
                return zy11.a;
            }
        }
        ratingAndNameInteractorImpl$updateUserName$1 = new RatingAndNameInteractorImpl$updateUserName$1(this, continuationImpl);
        Object obj2 = ratingAndNameInteractorImpl$updateUserName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ratingAndNameInteractorImpl$updateUserName$1.label;
        if (i != 0) {
        }
        h hVar2 = this.a;
        hVar2.Ng((jl90) obj2);
        cne0 cne0Var2 = (cne0) hVar2.b;
        n150 n150Var2 = new n150(cne0Var2.l("user_first_name", null), cne0Var2.l("user_rating", null));
        r0 r0Var2 = this.d;
        r0Var2.getClass();
        r0Var2.m(null, n150Var2);
        return zy11.a;
    }

    @Override // defpackage.lxx
    public final Object e(owx owxVar, Continuation continuation) {
        jl90 jl90Var = owxVar.y;
        n150 n150Var = new n150(jl90Var.a, jl90Var.b);
        r0 r0Var = this.d;
        r0Var.getClass();
        r0Var.m(null, n150Var);
        return zy11.a;
    }

    @Override // defpackage.j35
    public final String getName() {
        return "RatingAndNameInteractorImpl";
    }
}
