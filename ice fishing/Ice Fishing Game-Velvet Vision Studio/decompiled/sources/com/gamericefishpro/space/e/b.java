package com.gamericefishpro.space.e;

import android.os.Build;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.ei.x;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.z.o0;
import com.gamericefishpro.space.z.p0;
import com.gamericefishpro.space.z.q1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Serializable v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    public /* synthetic */ b(Object obj, Object obj2, Serializable serializable, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = serializable;
        this.w = obj3;
        this.y = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object parcelable;
        Number number;
        List listSubList;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a aVar = (a) this.e;
                com.gamericefishpro.space.d.j jVar = (com.gamericefishpro.space.d.j) this.i;
                String key = (String) this.v;
                com.gamericefishpro.space.i.a contract = (com.gamericefishpro.space.i.a) this.w;
                com.gamericefishpro.space.a8.b callback = new com.gamericefishpro.space.a8.b(3, (v0) this.y);
                LinkedHashMap linkedHashMap = jVar.a;
                Bundle bundle = jVar.g;
                LinkedHashMap linkedHashMap2 = jVar.f;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(contract, "contract");
                Intrinsics.checkNotNullParameter(callback, "callback");
                LinkedHashMap linkedHashMap3 = jVar.b;
                if (((Integer) linkedHashMap3.get(key)) == null) {
                    com.gamericefishpro.space.a5.h nextFunction = new com.gamericefishpro.space.a5.h(20);
                    Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
                    com.gamericefishpro.space.li.d dVar = new com.gamericefishpro.space.li.d(nextFunction, new com.gamericefishpro.space.a7.c(15, nextFunction));
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    Iterator it = new com.gamericefishpro.space.li.a(dVar).iterator();
                    do {
                        if (!it.hasNext()) {
                            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                        }
                        number = (Number) it.next();
                    } while (linkedHashMap.containsKey(Integer.valueOf(number.intValue())));
                    int iIntValue = number.intValue();
                    linkedHashMap.put(Integer.valueOf(iIntValue), key);
                    linkedHashMap3.put(key, Integer.valueOf(iIntValue));
                }
                jVar.e.put(key, new com.gamericefishpro.space.h.c(callback, contract));
                if (linkedHashMap2.containsKey(key)) {
                    Object obj2 = linkedHashMap2.get(key);
                    linkedHashMap2.remove(key);
                    callback.f(obj2);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = com.gamericefishpro.space.e4.e.a(key, bundle);
                } else {
                    parcelable = bundle.getParcelable(key);
                    if (!com.gamericefishpro.space.h.b.class.isInstance(parcelable)) {
                        parcelable = null;
                    }
                }
                com.gamericefishpro.space.h.b bVar = (com.gamericefishpro.space.h.b) parcelable;
                if (bVar != null) {
                    bundle.remove(key);
                    callback.f(contract.D(bVar.d, bVar.e));
                }
                aVar.a = new com.gamericefishpro.space.h.d(jVar, key, contract);
                return new c(0, aVar);
            case 1:
                w wVar = (w) this.e;
                ArrayList arrayList = (ArrayList) this.i;
                y yVar = (y) this.v;
                com.gamericefishpro.space.i5.g gVar = (com.gamericefishpro.space.i5.g) this.w;
                Bundle bundle2 = (Bundle) this.y;
                com.gamericefishpro.space.f5.k entry = (com.gamericefishpro.space.f5.k) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                wVar.d = true;
                int iIndexOf = arrayList.indexOf(entry);
                if (iIndexOf != -1) {
                    int i = iIndexOf + 1;
                    listSubList = arrayList.subList(yVar.d, i);
                    yVar.d = i;
                } else {
                    listSubList = g0.d;
                }
                gVar.a(entry.e, bundle2, entry, listSubList);
                return Unit.a;
            default:
                com.gamericefishpro.space.p5.a aVar2 = (com.gamericefishpro.space.p5.a) this.e;
                a0 a0Var = (a0) this.i;
                x xVar = (x) this.v;
                q1 q1Var = (q1) this.w;
                w wVar2 = (w) this.y;
                float fFloatValue = ((Float) obj).floatValue();
                p0 p0VarG = com.gamericefishpro.space.p5.a.g((com.gamericefishpro.space.ri.e) aVar2.f);
                if (p0VarG != null) {
                    aVar2.h(p0VarG);
                    p0 p0VarA = ((p0) a0Var.d).a(p0VarG);
                    a0Var.d = p0VarA;
                    float fI = q1Var.i(q1Var.e(p0VarA.a));
                    xVar.d = fI;
                    wVar2.d = !o0.a(fI - fFloatValue);
                }
                return Boolean.valueOf(p0VarG != null);
        }
    }
}
