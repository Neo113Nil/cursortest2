package ru.yandex.taxi.masstransit.userlocation;

import defpackage.ah00;
import defpackage.gh00;
import defpackage.hxx;
import defpackage.mo21;
import defpackage.nc60;
import defpackage.ny61;
import defpackage.oc60;
import defpackage.oep0;
import defpackage.pc60;
import defpackage.pep0;
import defpackage.po21;
import defpackage.v7j0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes6.dex */
public final class a {
    public final v7j0 a;
    public final ah00 b;
    public final oc60 c;
    public final po21 d;
    public final oep0 e;

    public a(v7j0 v7j0Var, ah00 ah00Var, oc60 oc60Var, po21 po21Var, oep0 oep0Var) {
        this.a = v7j0Var;
        this.b = ah00Var;
        this.c = oc60Var;
        this.d = po21Var;
        this.e = oep0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserLocationButtonDelegate$locationButtonClicked$1 userLocationButtonDelegate$locationButtonClicked$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof UserLocationButtonDelegate$locationButtonClicked$1) {
            userLocationButtonDelegate$locationButtonClicked$1 = (UserLocationButtonDelegate$locationButtonClicked$1) continuationImpl;
            int i2 = userLocationButtonDelegate$locationButtonClicked$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationButtonDelegate$locationButtonClicked$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationButtonDelegate$locationButtonClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationButtonDelegate$locationButtonClicked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userLocationButtonDelegate$locationButtonClicked$1.label = 1;
                    obj = ((com.yandex.go.permission.b) this.a).d(1, userLocationButtonDelegate$locationButtonClicked$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (a) userLocationButtonDelegate$locationButtonClicked$1.L$0;
                        kotlin.b.b(obj);
                        ((gh00) this.b).D(ru.yandex.taxi.map.utils.a.G((mo21) obj), 17.0f, 300.0f, null);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    ((pep0) this.e).f(((pc60) this.c).b(true), new nc60((String) null), hxx.a);
                    return zy11.a;
                }
                userLocationButtonDelegate$locationButtonClicked$1.L$0 = this;
                userLocationButtonDelegate$locationButtonClicked$1.Z$0 = booleanValue;
                userLocationButtonDelegate$locationButtonClicked$1.label = 2;
                obj = ((e) this.d).f(userLocationButtonDelegate$locationButtonClicked$1);
            }
        }
        userLocationButtonDelegate$locationButtonClicked$1 = new UserLocationButtonDelegate$locationButtonClicked$1(this, continuationImpl);
        Object obj2 = userLocationButtonDelegate$locationButtonClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationButtonDelegate$locationButtonClicked$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
    }
}
