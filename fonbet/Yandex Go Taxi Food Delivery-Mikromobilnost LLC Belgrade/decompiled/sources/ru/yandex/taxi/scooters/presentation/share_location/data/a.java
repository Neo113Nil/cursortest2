package ru.yandex.taxi.scooters.presentation.share_location.data;

import defpackage.bvf0;
import defpackage.fvo0;
import defpackage.hvo0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class a {
    public final e a;
    public final hvo0 b;

    public a(e eVar, hvo0 hvo0Var) {
        this.a = eVar;
        this.b = hvo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1 scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1;
        int i;
        if (continuationImpl instanceof ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1) {
            scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1 = (ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1) continuationImpl;
            int i2 = scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label = 1;
                    obj = this.b.a.b(scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                fvo0 fvo0Var = (fvo0) obj;
                ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2 scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2 = new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2(this, fvo0Var.e, fvo0Var, null);
                scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.L$0 = null;
                scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.L$1 = null;
                scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label = 2;
                Object n = bvf0.n(scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2, scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1);
                return n != coroutineSingletons ? coroutineSingletons : n;
            }
        }
        scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1 = new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1(this, continuationImpl);
        Object obj2 = scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label;
        if (i != 0) {
        }
        fvo0 fvo0Var2 = (fvo0) obj2;
        ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2 scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$22 = new ScootersShareLocationAboutDialogContentFactory$getAboutDialogContent$2(this, fvo0Var2.e, fvo0Var2, null);
        scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.L$0 = null;
        scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.L$1 = null;
        scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1.label = 2;
        Object n2 = bvf0.n(scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$22, scootersShareLocationAboutDialogContentFactory$getAboutDialogContent$1);
        if (n2 != coroutineSingletons2) {
        }
    }
}
