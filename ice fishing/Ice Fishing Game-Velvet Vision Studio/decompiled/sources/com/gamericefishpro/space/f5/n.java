package com.gamericefishpro.space.f5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ o e;
    public final /* synthetic */ k i;

    public /* synthetic */ n(o oVar, k kVar) {
        this.e = oVar;
        this.i = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o oVar = this.e;
                k entry = this.i;
                Intrinsics.checkNotNullParameter(entry, "entry");
                com.gamericefishpro.space.si.n0 n0Var = oVar.c;
                Set set = (Set) n0Var.getValue();
                Intrinsics.checkNotNullParameter(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(com.gamericefishpro.space.ph.l0.a(set.size()));
                boolean z = false;
                for (Object obj : set) {
                    boolean z2 = true;
                    if (!z && Intrinsics.a(obj, entry)) {
                        z = true;
                        z2 = false;
                    }
                    if (z2) {
                        linkedHashSet.add(obj);
                    }
                }
                n0Var.j(null, linkedHashSet);
                return Unit.a;
            default:
                o oVar2 = this.e;
                k popUpTo = this.i;
                Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
                synchronized (oVar2.a) {
                    try {
                        com.gamericefishpro.space.si.n0 n0Var2 = oVar2.b;
                        Iterable iterable = (Iterable) n0Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (Intrinsics.a((k) obj2, popUpTo)) {
                                n0Var2.getClass();
                                n0Var2.j(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        n0Var2.getClass();
                        n0Var2.j(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ n(o oVar, k kVar, boolean z) {
        this.e = oVar;
        this.i = kVar;
    }
}
