package ru.yandex.taxi.startup.launch;

import defpackage.au50;
import defpackage.i5g0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class i {
    public final l a;
    public final ru.yandex.taxi.orders.g b;
    public final h c;
    public final ru.yandex.taxi.startup.launch.response.e d;
    public final tt2 e;
    public final au50 f;

    public i(l lVar, ru.yandex.taxi.orders.g gVar, h hVar, ru.yandex.taxi.startup.launch.response.e eVar, tt2 tt2Var, au50 au50Var) {
        this.a = lVar;
        this.b = gVar;
        this.c = hVar;
        this.d = eVar;
        this.e = tt2Var;
        this.f = au50Var;
    }

    public static /* synthetic */ Object b(i iVar, String str, String str2, boolean z, ContinuationImpl continuationImpl, int i) {
        String Hg = iVar.c.Hg();
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return iVar.a(str, Hg, str2, z, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r0 != r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, boolean z, ContinuationImpl continuationImpl) {
        LaunchInteractor$request$1 launchInteractor$request$1;
        int i;
        String str4;
        boolean z2;
        String str5;
        String str6;
        if (continuationImpl instanceof LaunchInteractor$request$1) {
            launchInteractor$request$1 = (LaunchInteractor$request$1) continuationImpl;
            int i2 = launchInteractor$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchInteractor$request$1.label = i2 - Integer.MIN_VALUE;
                LaunchInteractor$request$1 launchInteractor$request$12 = launchInteractor$request$1;
                Object obj = launchInteractor$request$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchInteractor$request$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    launchInteractor$request$12.L$0 = str;
                    launchInteractor$request$12.L$1 = str2;
                    str4 = str3;
                    launchInteractor$request$12.L$2 = str4;
                    z2 = z;
                    launchInteractor$request$12.Z$0 = z2;
                    launchInteractor$request$12.label = 1;
                    if (((i5g0) this.f.b).a.a(launchInteractor$request$12) != coroutineSingletons) {
                        str5 = str;
                        str6 = str2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                boolean z3 = launchInteractor$request$12.Z$0;
                String str7 = (String) launchInteractor$request$12.L$2;
                String str8 = (String) launchInteractor$request$12.L$1;
                String str9 = (String) launchInteractor$request$12.L$0;
                kotlin.b.b(obj);
                z2 = z3;
                str5 = str9;
                str4 = str7;
                str6 = str8;
                this.e.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                LaunchInteractor$request$2 launchInteractor$request$2 = new LaunchInteractor$request$2(this, str5, str6, str4, z2, null);
                launchInteractor$request$12.L$0 = null;
                launchInteractor$request$12.L$1 = null;
                launchInteractor$request$12.L$2 = null;
                launchInteractor$request$12.Z$0 = z2;
                launchInteractor$request$12.label = 2;
                obj = tje.k0(mdhVar, launchInteractor$request$2, launchInteractor$request$12);
            }
        }
        launchInteractor$request$1 = new LaunchInteractor$request$1(this, continuationImpl);
        LaunchInteractor$request$1 launchInteractor$request$122 = launchInteractor$request$1;
        Object obj2 = launchInteractor$request$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchInteractor$request$122.label;
        if (i != 0) {
        }
        this.e.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        LaunchInteractor$request$2 launchInteractor$request$22 = new LaunchInteractor$request$2(this, str5, str6, str4, z2, null);
        launchInteractor$request$122.L$0 = null;
        launchInteractor$request$122.L$1 = null;
        launchInteractor$request$122.L$2 = null;
        launchInteractor$request$122.Z$0 = z2;
        launchInteractor$request$122.label = 2;
        obj2 = tje.k0(mdhVar2, launchInteractor$request$22, launchInteractor$request$122);
    }
}
