package ru.yandex.taxi.hiredriver;

import defpackage.bx00;
import defpackage.cne0;
import defpackage.e2t;
import defpackage.evu0;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.i3y;
import defpackage.kj;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.opq0;
import defpackage.pp21;
import defpackage.r1s;
import defpackage.sjh;
import defpackage.sxq0;
import defpackage.tt2;
import defpackage.u6r;
import defpackage.uyj;
import defpackage.v6r;
import defpackage.zn1;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes5.dex */
public final class c {
    public final tt2 a;
    public final e2t b;
    public final com.yandex.go.zone.interactors.a c;
    public final r1s d;
    public final i3y e;

    public c(on2 on2Var, tt2 tt2Var, e2t e2tVar, com.yandex.go.zone.interactors.a aVar, r1s r1sVar) {
        this.a = tt2Var;
        this.b = e2tVar;
        this.c = aVar;
        this.d = r1sVar;
        this.e = kotlin.a.a(new zn1(on2Var, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        HireDriverRepository$getRegionId$1 hireDriverRepository$getRegionId$1;
        int i;
        v6r v6rVar;
        u6r u6rVar;
        sxq0 sxq0Var;
        bx00 bx00Var;
        String str;
        if (continuationImpl instanceof HireDriverRepository$getRegionId$1) {
            hireDriverRepository$getRegionId$1 = (HireDriverRepository$getRegionId$1) continuationImpl;
            int i2 = hireDriverRepository$getRegionId$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hireDriverRepository$getRegionId$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hireDriverRepository$getRegionId$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hireDriverRepository$getRegionId$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g2t a = ((f2t) this.b).a();
                    if (a != null && (v6rVar = a.a) != null && (u6rVar = v6rVar.a) != null && (sxq0Var = u6rVar.d) != null && (bx00Var = sxq0Var.c) != null && (str = bx00Var.a) != null) {
                        return str;
                    }
                    hireDriverRepository$getRegionId$1.label = 1;
                    obj = this.c.a(hireDriverRepository$getRegionId$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return String.valueOf(((Number) obj).intValue());
            }
        }
        hireDriverRepository$getRegionId$1 = new HireDriverRepository$getRegionId$1(this, continuationImpl);
        Object obj2 = hireDriverRepository$getRegionId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hireDriverRepository$getRegionId$1.label;
        if (i != 0) {
        }
        return String.valueOf(((Number) obj2).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        if (defpackage.tje.k0(r9, r10, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        HireDriverRepository$sendUserData$1 hireDriverRepository$sendUserData$1;
        int i;
        Map map2;
        String str;
        if (continuationImpl instanceof HireDriverRepository$sendUserData$1) {
            hireDriverRepository$sendUserData$1 = (HireDriverRepository$sendUserData$1) continuationImpl;
            int i2 = hireDriverRepository$sendUserData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hireDriverRepository$sendUserData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hireDriverRepository$sendUserData$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hireDriverRepository$sendUserData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r1s r1sVar = this.d;
                    String l = ((cne0) ((h) ((pp21) r1sVar.b)).b).l("user_first_name", null);
                    if (l == null || evu0.J(l)) {
                        kj Ig = ((g) r1sVar.w).a.Ig();
                        l = Ig != null ? Ig.b : "";
                    }
                    if (evu0.J(l)) {
                        l = null;
                    }
                    hireDriverRepository$sendUserData$1.L$0 = map;
                    hireDriverRepository$sendUserData$1.L$1 = null;
                    hireDriverRepository$sendUserData$1.L$2 = l;
                    hireDriverRepository$sendUserData$1.label = 1;
                    obj = a(hireDriverRepository$sendUserData$1);
                    if (obj != obj2) {
                        String str2 = l;
                        map2 = map;
                        str = str2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                str = (String) hireDriverRepository$sendUserData$1.L$2;
                map2 = (Map) hireDriverRepository$sendUserData$1.L$0;
                kotlin.b.b(obj);
                opq0 opq0Var = new opq0(str, (String) obj);
                this.a.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                HireDriverRepository$sendUserData$2 hireDriverRepository$sendUserData$2 = new HireDriverRepository$sendUserData$2(this, opq0Var, map2, null);
                hireDriverRepository$sendUserData$1.L$0 = null;
                hireDriverRepository$sendUserData$1.L$1 = null;
                hireDriverRepository$sendUserData$1.L$2 = null;
                hireDriverRepository$sendUserData$1.label = 2;
            }
        }
        hireDriverRepository$sendUserData$1 = new HireDriverRepository$sendUserData$1(this, continuationImpl);
        Object obj3 = hireDriverRepository$sendUserData$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hireDriverRepository$sendUserData$1.label;
        if (i != 0) {
        }
        opq0 opq0Var2 = new opq0(str, (String) obj3);
        this.a.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        HireDriverRepository$sendUserData$2 hireDriverRepository$sendUserData$22 = new HireDriverRepository$sendUserData$2(this, opq0Var2, map2, null);
        hireDriverRepository$sendUserData$1.L$0 = null;
        hireDriverRepository$sendUserData$1.L$1 = null;
        hireDriverRepository$sendUserData$1.L$2 = null;
        hireDriverRepository$sendUserData$1.label = 2;
    }
}
