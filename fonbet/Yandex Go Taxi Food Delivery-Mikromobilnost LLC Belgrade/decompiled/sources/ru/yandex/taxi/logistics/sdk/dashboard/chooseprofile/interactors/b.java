package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors;

import defpackage.bpc;
import defpackage.bvf0;
import defpackage.dpc;
import defpackage.flg;
import defpackage.fpc;
import defpackage.ike;
import defpackage.ikg;
import defpackage.jkg;
import defpackage.kkg;
import defpackage.ny61;
import defpackage.oig;
import defpackage.st2;
import defpackage.tje;
import defpackage.trb;
import defpackage.v0q0;
import defpackage.w511;
import defpackage.yrb;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a a;
    public final yrb b;
    public final ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data.a c;
    public final trb d;
    public final flg e;
    public final ike f;

    public b(ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a aVar, yrb yrbVar, st2 st2Var, ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data.a aVar2, trb trbVar, flg flgVar) {
        this.a = aVar;
        this.b = yrbVar;
        this.c = aVar2;
        this.d = trbVar;
        this.e = flgVar;
        this.f = bvf0.a(st2Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, Continuation continuation) {
        FetchChooseProfileContentInteractor$fetchContent$1 fetchChooseProfileContentInteractor$fetchContent$1;
        int i;
        fpc fpcVar;
        trb trbVar = bVar.d;
        if (continuation instanceof FetchChooseProfileContentInteractor$fetchContent$1) {
            fetchChooseProfileContentInteractor$fetchContent$1 = (FetchChooseProfileContentInteractor$fetchContent$1) continuation;
            int i2 = fetchChooseProfileContentInteractor$fetchContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchChooseProfileContentInteractor$fetchContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchChooseProfileContentInteractor$fetchContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchChooseProfileContentInteractor$fetchContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trbVar.a(kkg.a);
                    ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data.a aVar = bVar.c;
                    fetchChooseProfileContentInteractor$fetchContent$1.label = 1;
                    obj = aVar.b(fetchChooseProfileContentInteractor$fetchContent$1);
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
                fpcVar = (fpc) obj;
                if (!(fpcVar instanceof dpc)) {
                    oig oigVar = (oig) ((dpc) fpcVar).a;
                    trbVar.a(new jkg(oigVar));
                    flg flgVar = bVar.e;
                    List<v0q0> list = oigVar.a;
                    ArrayList arrayList = new ArrayList();
                    for (v0q0 v0q0Var : list) {
                        String str = v0q0Var.d;
                        Pair pair = str != null ? new Pair(str, Boolean.valueOf(v0q0Var.e)) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    flgVar.a(arrayList);
                } else {
                    if (!(fpcVar instanceof bpc)) {
                        w511.b();
                        return null;
                    }
                    trbVar.a(new ikg((bpc) fpcVar));
                }
                return zy11.a;
            }
        }
        fetchChooseProfileContentInteractor$fetchContent$1 = new FetchChooseProfileContentInteractor$fetchContent$1(bVar, continuation);
        Object obj2 = fetchChooseProfileContentInteractor$fetchContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchChooseProfileContentInteractor$fetchContent$1.label;
        if (i != 0) {
        }
        fpcVar = (fpc) obj2;
        if (!(fpcVar instanceof dpc)) {
        }
        return zy11.a;
    }

    public final void b() {
        FetchChooseProfileContentInteractor$start$1 fetchChooseProfileContentInteractor$start$1 = new FetchChooseProfileContentInteractor$start$1(this, null);
        ike ikeVar = this.f;
        tje.N(ikeVar, null, null, fetchChooseProfileContentInteractor$start$1, 3);
        tje.N(ikeVar, null, null, new FetchChooseProfileContentInteractor$start$2(this, null), 3);
    }
}
