package ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper;

import defpackage.a5z0;
import defpackage.kmt0;
import defpackage.mmt0;
import defpackage.nmt0;
import defpackage.ny61;
import defpackage.omt0;
import defpackage.tcc;
import defpackage.y4z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [ru.yandex.taxi.logistics.sdk.dashboard.ui.mapper.b] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a7 -> B:10:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kmt0 kmt0Var, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        SpannableGridMapper$map$1 spannableGridMapper$map$1;
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        SpannableGridMapper$map$1 spannableGridMapper$map$12;
        boolean z3;
        boolean z4;
        int i3;
        if (continuationImpl instanceof SpannableGridMapper$map$1) {
            spannableGridMapper$map$1 = (SpannableGridMapper$map$1) continuationImpl;
            int i4 = spannableGridMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                spannableGridMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = spannableGridMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spannableGridMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = kmt0Var.a;
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    it = arrayList2.iterator();
                    arrayList = arrayList3;
                    i2 = 0;
                    spannableGridMapper$map$12 = spannableGridMapper$map$1;
                    z3 = z2;
                    z4 = z;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = spannableGridMapper$map$1.I$1;
                    int i6 = spannableGridMapper$map$1.I$0;
                    boolean z5 = spannableGridMapper$map$1.Z$1;
                    boolean z6 = spannableGridMapper$map$1.Z$0;
                    ?? r6 = (Collection) spannableGridMapper$map$1.L$7;
                    Iterator it2 = (Iterator) spannableGridMapper$map$1.L$4;
                    ?? r8 = (Collection) spannableGridMapper$map$1.L$3;
                    kmt0 kmt0Var2 = (kmt0) spannableGridMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    i3 = i5;
                    kmt0Var = kmt0Var2;
                    Iterator it3 = it2;
                    ArrayList arrayList4 = r6;
                    SpannableGridMapper$map$1 spannableGridMapper$map$13 = spannableGridMapper$map$1;
                    int i7 = i6;
                    boolean z7 = z5;
                    z4 = z6;
                    ArrayList arrayList5 = r8;
                    arrayList4.add((omt0) obj);
                    i2 = i7;
                    z3 = z7;
                    spannableGridMapper$map$12 = spannableGridMapper$map$13;
                    arrayList = arrayList5;
                    it = it3;
                    if (it.hasNext()) {
                        nmt0 nmt0Var = (nmt0) it.next();
                        spannableGridMapper$map$12.L$0 = kmt0Var;
                        spannableGridMapper$map$12.L$1 = null;
                        spannableGridMapper$map$12.L$2 = null;
                        spannableGridMapper$map$12.L$3 = arrayList;
                        spannableGridMapper$map$12.L$4 = it;
                        spannableGridMapper$map$12.L$5 = null;
                        spannableGridMapper$map$12.L$6 = null;
                        spannableGridMapper$map$12.L$7 = arrayList;
                        spannableGridMapper$map$12.Z$0 = z4;
                        spannableGridMapper$map$12.Z$1 = z3;
                        spannableGridMapper$map$12.I$0 = i2;
                        spannableGridMapper$map$12.I$1 = i3;
                        spannableGridMapper$map$12.I$2 = 0;
                        spannableGridMapper$map$12.label = 1;
                        Object b = b(nmt0Var, z4, spannableGridMapper$map$12);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it3 = it;
                        arrayList4 = arrayList;
                        spannableGridMapper$map$13 = spannableGridMapper$map$12;
                        z7 = z3;
                        i7 = i2;
                        obj = b;
                        arrayList5 = arrayList4;
                        arrayList4.add((omt0) obj);
                        i2 = i7;
                        z3 = z7;
                        spannableGridMapper$map$12 = spannableGridMapper$map$13;
                        arrayList = arrayList5;
                        it = it3;
                        if (it.hasNext()) {
                            return new mmt0(arrayList, kmt0Var.b, kmt0Var.c, z3);
                        }
                    }
                }
            }
        }
        spannableGridMapper$map$1 = new SpannableGridMapper$map$1(this, continuationImpl);
        Object obj2 = spannableGridMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spannableGridMapper$map$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(nmt0 nmt0Var, boolean z, ContinuationImpl continuationImpl) {
        SpannableGridMapper$map$3 spannableGridMapper$map$3;
        int i;
        if (continuationImpl instanceof SpannableGridMapper$map$3) {
            spannableGridMapper$map$3 = (SpannableGridMapper$map$3) continuationImpl;
            int i2 = spannableGridMapper$map$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spannableGridMapper$map$3.label = i2 - Integer.MIN_VALUE;
                Object obj = spannableGridMapper$map$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spannableGridMapper$map$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    y4z0 y4z0Var = nmt0Var.a;
                    spannableGridMapper$map$3.L$0 = nmt0Var;
                    spannableGridMapper$map$3.L$1 = null;
                    spannableGridMapper$map$3.Z$0 = z;
                    spannableGridMapper$map$3.I$0 = 0;
                    spannableGridMapper$map$3.label = 1;
                    obj = this.a.d(y4z0Var, z, spannableGridMapper$map$3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nmt0Var = (nmt0) spannableGridMapper$map$3.L$0;
                    kotlin.b.b(obj);
                }
                return new omt0((a5z0) obj, nmt0Var.b, nmt0Var.c, nmt0Var.d, nmt0Var.e);
            }
        }
        spannableGridMapper$map$3 = new SpannableGridMapper$map$3(this, continuationImpl);
        Object obj2 = spannableGridMapper$map$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spannableGridMapper$map$3.label;
        if (i != 0) {
        }
        return new omt0((a5z0) obj2, nmt0Var.b, nmt0Var.c, nmt0Var.d, nmt0Var.e);
    }
}
