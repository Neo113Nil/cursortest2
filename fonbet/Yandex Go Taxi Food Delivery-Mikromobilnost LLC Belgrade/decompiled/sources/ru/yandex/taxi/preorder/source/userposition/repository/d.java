package ru.yandex.taxi.preorder.source.userposition.repository;

import defpackage.adz;
import defpackage.h3y;
import defpackage.hcz;
import defpackage.j73;
import defpackage.ny61;
import defpackage.oiy0;
import defpackage.s66;
import defpackage.tcc;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class d {
    public final h3y a;
    public final b b;
    public final h3y c;
    public final s66 d;
    public final oiy0 e;
    public final h3y f;

    public d(h3y h3yVar, b bVar, h3y h3yVar2, s66 s66Var, oiy0 oiy0Var, h3y h3yVar3) {
        this.a = h3yVar;
        this.b = bVar;
        this.c = h3yVar2;
        this.d = s66Var;
        this.e = oiy0Var;
        this.f = h3yVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationRepositoryFactory$getMostSuitableRepository$1 locationRepositoryFactory$getMostSuitableRepository$1;
        Object obj;
        int i;
        adz adzVar;
        adz adzVar2;
        hcz iVar;
        if (continuationImpl instanceof LocationRepositoryFactory$getMostSuitableRepository$1) {
            locationRepositoryFactory$getMostSuitableRepository$1 = (LocationRepositoryFactory$getMostSuitableRepository$1) continuationImpl;
            int i2 = locationRepositoryFactory$getMostSuitableRepository$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRepositoryFactory$getMostSuitableRepository$1.label = i2 - Integer.MIN_VALUE;
                obj = locationRepositoryFactory$getMostSuitableRepository$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRepositoryFactory$getMostSuitableRepository$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    adz adzVar3 = (adz) this.f.get();
                    locationRepositoryFactory$getMostSuitableRepository$1.L$0 = adzVar3;
                    locationRepositoryFactory$getMostSuitableRepository$1.label = 1;
                    com.yandex.go.g gVar = (com.yandex.go.g) adzVar3;
                    Object i3 = gVar.i(locationRepositoryFactory$getMostSuitableRepository$1);
                    if (i3 != obj2) {
                        adzVar = gVar;
                        obj = i3;
                    }
                    return obj2;
                }
                if (i == 1) {
                    adzVar = (adz) locationRepositoryFactory$getMostSuitableRepository$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        adzVar2 = (adz) locationRepositoryFactory$getMostSuitableRepository$1.L$1;
                        kotlin.b.b(obj);
                        iVar = new i(adzVar2, (hcz) obj);
                        return this.e.a(iVar);
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        iVar = (hcz) obj;
                        return this.e.a(iVar);
                    }
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        iVar = (hcz) this.a.get();
                        return this.e.a(iVar);
                    }
                    locationRepositoryFactory$getMostSuitableRepository$1.L$0 = null;
                    locationRepositoryFactory$getMostSuitableRepository$1.label = 4;
                    obj = c(locationRepositoryFactory$getMostSuitableRepository$1);
                }
                if (((Boolean) obj).booleanValue()) {
                    locationRepositoryFactory$getMostSuitableRepository$1.L$0 = null;
                    locationRepositoryFactory$getMostSuitableRepository$1.label = 3;
                    obj = this.d.b.b(locationRepositoryFactory$getMostSuitableRepository$1);
                } else {
                    locationRepositoryFactory$getMostSuitableRepository$1.L$0 = null;
                    locationRepositoryFactory$getMostSuitableRepository$1.L$1 = adzVar;
                    locationRepositoryFactory$getMostSuitableRepository$1.label = 2;
                    obj = c(locationRepositoryFactory$getMostSuitableRepository$1);
                    if (obj != obj2) {
                        adzVar2 = adzVar;
                        iVar = new i(adzVar2, (hcz) obj);
                        return this.e.a(iVar);
                    }
                }
                return obj2;
            }
        }
        locationRepositoryFactory$getMostSuitableRepository$1 = new LocationRepositoryFactory$getMostSuitableRepository$1(this, continuationImpl);
        obj = locationRepositoryFactory$getMostSuitableRepository$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRepositoryFactory$getMostSuitableRepository$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0176 A[LOOP:0: B:14:0x0170->B:16:0x0176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        LocationRepositoryFactory$getRepositoriesByPriority$1 locationRepositoryFactory$getRepositoriesByPriority$1;
        int i;
        adz adzVar;
        hcz[] hczVarArr;
        hcz[] hczVarArr2;
        Object[] objArr;
        Object[] objArr2;
        List A;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Iterator it;
        if (continuationImpl instanceof LocationRepositoryFactory$getRepositoriesByPriority$1) {
            locationRepositoryFactory$getRepositoriesByPriority$1 = (LocationRepositoryFactory$getRepositoriesByPriority$1) continuationImpl;
            int i2 = locationRepositoryFactory$getRepositoriesByPriority$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRepositoryFactory$getRepositoriesByPriority$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRepositoryFactory$getRepositoriesByPriority$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRepositoryFactory$getRepositoriesByPriority$1.label;
                h3y h3yVar = this.c;
                b bVar = this.b;
                int i3 = 0;
                int i4 = 1;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        adz adzVar2 = (adz) this.f.get();
                        locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = adzVar2;
                        locationRepositoryFactory$getRepositoriesByPriority$1.label = 1;
                        com.yandex.go.g gVar = (com.yandex.go.g) adzVar2;
                        Object i5 = gVar.i(locationRepositoryFactory$getRepositoriesByPriority$1);
                        if (i5 != coroutineSingletons) {
                            adzVar = gVar;
                            obj = i5;
                            if (((Boolean) obj).booleanValue()) {
                                locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = null;
                                locationRepositoryFactory$getRepositoriesByPriority$1.label = 4;
                                obj = this.d.b.b(locationRepositoryFactory$getRepositoriesByPriority$1);
                                break;
                            } else {
                                hczVarArr = new hcz[3];
                                locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = null;
                                locationRepositoryFactory$getRepositoriesByPriority$1.L$1 = hczVarArr;
                                locationRepositoryFactory$getRepositoriesByPriority$1.L$2 = hczVarArr;
                                locationRepositoryFactory$getRepositoriesByPriority$1.L$3 = adzVar;
                                locationRepositoryFactory$getRepositoriesByPriority$1.I$0 = 0;
                                locationRepositoryFactory$getRepositoriesByPriority$1.label = 2;
                                obj = c(locationRepositoryFactory$getRepositoriesByPriority$1);
                                if (obj != coroutineSingletons) {
                                    hczVarArr2 = hczVarArr;
                                    hczVarArr2[i3] = new i(adzVar, (hcz) obj);
                                    locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = null;
                                    locationRepositoryFactory$getRepositoriesByPriority$1.L$1 = hczVarArr;
                                    locationRepositoryFactory$getRepositoriesByPriority$1.L$2 = hczVarArr;
                                    locationRepositoryFactory$getRepositoriesByPriority$1.L$3 = null;
                                    locationRepositoryFactory$getRepositoriesByPriority$1.I$0 = 1;
                                    locationRepositoryFactory$getRepositoriesByPriority$1.label = 3;
                                    obj = bVar.b(locationRepositoryFactory$getRepositoriesByPriority$1);
                                    if (obj != coroutineSingletons) {
                                        objArr = hczVarArr;
                                        objArr2 = objArr;
                                        objArr[i4] = obj;
                                        objArr2[2] = h3yVar.get();
                                        A = j73.A(objArr2);
                                        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
                                        it = A.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(this.e.a((hcz) it.next()));
                                        }
                                        return arrayList;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        adzVar = (adz) locationRepositoryFactory$getRepositoriesByPriority$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return coroutineSingletons;
                    case 2:
                        i3 = locationRepositoryFactory$getRepositoriesByPriority$1.I$0;
                        adzVar = (adz) locationRepositoryFactory$getRepositoriesByPriority$1.L$3;
                        hcz[] hczVarArr3 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$2;
                        hcz[] hczVarArr4 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$1;
                        kotlin.b.b(obj);
                        hczVarArr2 = hczVarArr3;
                        hczVarArr = hczVarArr4;
                        hczVarArr2[i3] = new i(adzVar, (hcz) obj);
                        locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = null;
                        locationRepositoryFactory$getRepositoriesByPriority$1.L$1 = hczVarArr;
                        locationRepositoryFactory$getRepositoriesByPriority$1.L$2 = hczVarArr;
                        locationRepositoryFactory$getRepositoriesByPriority$1.L$3 = null;
                        locationRepositoryFactory$getRepositoriesByPriority$1.I$0 = 1;
                        locationRepositoryFactory$getRepositoriesByPriority$1.label = 3;
                        obj = bVar.b(locationRepositoryFactory$getRepositoriesByPriority$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        i4 = locationRepositoryFactory$getRepositoriesByPriority$1.I$0;
                        objArr = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$2;
                        objArr2 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$1;
                        kotlin.b.b(obj);
                        objArr[i4] = obj;
                        objArr2[2] = h3yVar.get();
                        A = j73.A(objArr2);
                        ArrayList arrayList2 = new ArrayList(tcc.n(A, 10));
                        it = A.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList2;
                    case 4:
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            Object[] objArr7 = new hcz[3];
                            objArr7[0] = this.a.get();
                            locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = null;
                            locationRepositoryFactory$getRepositoriesByPriority$1.L$1 = objArr7;
                            locationRepositoryFactory$getRepositoriesByPriority$1.L$2 = objArr7;
                            locationRepositoryFactory$getRepositoriesByPriority$1.I$0 = 1;
                            locationRepositoryFactory$getRepositoriesByPriority$1.label = 5;
                            Object b = bVar.b(locationRepositoryFactory$getRepositoriesByPriority$1);
                            if (b != coroutineSingletons) {
                                objArr5 = objArr7;
                                objArr6 = objArr5;
                                obj = b;
                                objArr5[i4] = obj;
                                objArr6[2] = h3yVar.get();
                                A = j73.A(objArr6);
                                ArrayList arrayList22 = new ArrayList(tcc.n(A, 10));
                                it = A.iterator();
                                while (it.hasNext()) {
                                }
                                return arrayList22;
                            }
                        } else {
                            hcz[] hczVarArr5 = new hcz[2];
                            locationRepositoryFactory$getRepositoriesByPriority$1.L$0 = null;
                            locationRepositoryFactory$getRepositoriesByPriority$1.L$1 = hczVarArr5;
                            locationRepositoryFactory$getRepositoriesByPriority$1.L$2 = hczVarArr5;
                            locationRepositoryFactory$getRepositoriesByPriority$1.I$0 = 0;
                            locationRepositoryFactory$getRepositoriesByPriority$1.label = 6;
                            Object b2 = bVar.b(locationRepositoryFactory$getRepositoriesByPriority$1);
                            if (b2 != coroutineSingletons) {
                                objArr3 = hczVarArr5;
                                objArr4 = objArr3;
                                obj = b2;
                                objArr3[i3] = obj;
                                objArr4[1] = h3yVar.get();
                                A = j73.A(objArr4);
                                ArrayList arrayList222 = new ArrayList(tcc.n(A, 10));
                                it = A.iterator();
                                while (it.hasNext()) {
                                }
                                return arrayList222;
                            }
                        }
                        return coroutineSingletons;
                    case 5:
                        i4 = locationRepositoryFactory$getRepositoriesByPriority$1.I$0;
                        objArr5 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$2;
                        objArr6 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$1;
                        kotlin.b.b(obj);
                        objArr5[i4] = obj;
                        objArr6[2] = h3yVar.get();
                        A = j73.A(objArr6);
                        ArrayList arrayList2222 = new ArrayList(tcc.n(A, 10));
                        it = A.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList2222;
                    case 6:
                        i3 = locationRepositoryFactory$getRepositoriesByPriority$1.I$0;
                        objArr3 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$2;
                        objArr4 = (hcz[]) locationRepositoryFactory$getRepositoriesByPriority$1.L$1;
                        kotlin.b.b(obj);
                        objArr3[i3] = obj;
                        objArr4[1] = h3yVar.get();
                        A = j73.A(objArr4);
                        ArrayList arrayList22222 = new ArrayList(tcc.n(A, 10));
                        it = A.iterator();
                        while (it.hasNext()) {
                        }
                        return arrayList22222;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        locationRepositoryFactory$getRepositoriesByPriority$1 = new LocationRepositoryFactory$getRepositoriesByPriority$1(this, continuationImpl);
        Object obj2 = locationRepositoryFactory$getRepositoriesByPriority$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRepositoryFactory$getRepositoriesByPriority$1.label;
        h3y h3yVar2 = this.c;
        b bVar2 = this.b;
        int i32 = 0;
        int i42 = 1;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        LocationRepositoryFactory$getSystemAndroidProvider$1 locationRepositoryFactory$getSystemAndroidProvider$1;
        int i;
        if (continuationImpl instanceof LocationRepositoryFactory$getSystemAndroidProvider$1) {
            locationRepositoryFactory$getSystemAndroidProvider$1 = (LocationRepositoryFactory$getSystemAndroidProvider$1) continuationImpl;
            int i2 = locationRepositoryFactory$getSystemAndroidProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRepositoryFactory$getSystemAndroidProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRepositoryFactory$getSystemAndroidProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRepositoryFactory$getSystemAndroidProvider$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationRepositoryFactory$getSystemAndroidProvider$1.label = 1;
                    obj = this.b.b(locationRepositoryFactory$getSystemAndroidProvider$1);
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
                e eVar = (e) obj;
                return eVar == null ? eVar : (hcz) this.c.get();
            }
        }
        locationRepositoryFactory$getSystemAndroidProvider$1 = new LocationRepositoryFactory$getSystemAndroidProvider$1(this, continuationImpl);
        Object obj2 = locationRepositoryFactory$getSystemAndroidProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRepositoryFactory$getSystemAndroidProvider$1.label;
        if (i != 0) {
        }
        e eVar2 = (e) obj2;
        if (eVar2 == null) {
        }
    }
}
