package com.gamericefishpro.space.b6;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.i5.c;
import com.gamericefishpro.space.i5.g;
import com.gamericefishpro.space.z4.o;
import com.gamericefishpro.space.z4.p;
import com.gamericefishpro.space.z4.s;
import com.gamericefishpro.space.z4.u;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements s {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u uVar, o event) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b bVar = (b) this.e;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == o.ON_START) {
                    bVar.h = true;
                } else if (event == o.ON_STOP) {
                    bVar.h = false;
                }
                break;
            default:
                g gVar = (g) this.e;
                Intrinsics.checkNotNullParameter(uVar, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                gVar.q = event.a();
                if (gVar.c != null) {
                    ArrayList arrayListM = CollectionsKt.M(gVar.f);
                    int size = arrayListM.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListM.get(i);
                        i++;
                        k kVar = (k) obj;
                        kVar.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        c cVar = kVar.A;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        k kVar2 = cVar.a;
                        p pVarA = event.a();
                        Intrinsics.checkNotNullParameter(pVarA, "<set-?>");
                        kVar2.v = pVarA;
                        cVar.d = event.a();
                        cVar.b();
                    }
                }
                break;
        }
    }
}
