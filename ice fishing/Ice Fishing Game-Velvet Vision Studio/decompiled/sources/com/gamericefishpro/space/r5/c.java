package com.gamericefishpro.space.r5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ g i;

    public /* synthetic */ c(g gVar, ArrayList arrayList, int i) {
        this.d = i;
        this.i = gVar;
        this.e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = this.e;
                int size = arrayList.size();
                g gVar = this.i;
                if (size <= 0) {
                    arrayList.clear();
                    gVar.m.remove(arrayList);
                    return;
                } else {
                    ((f) arrayList.get(0)).getClass();
                    gVar.getClass();
                    throw null;
                }
            case 1:
                ArrayList arrayList2 = this.e;
                int size2 = arrayList2.size();
                int i = 0;
                while (true) {
                    g gVar2 = this.i;
                    if (i >= size2) {
                        arrayList2.clear();
                        gVar2.n.remove(arrayList2);
                        return;
                    } else {
                        Object obj = arrayList2.get(i);
                        i++;
                        ArrayList arrayList3 = gVar2.r;
                        ((e) obj).getClass();
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.e;
                int size3 = arrayList4.size();
                g gVar3 = this.i;
                if (size3 <= 0) {
                    arrayList4.clear();
                    gVar3.l.remove(arrayList4);
                    return;
                } else {
                    m0 m0Var = (m0) arrayList4.get(0);
                    gVar3.getClass();
                    m0Var.getClass();
                    throw null;
                }
        }
    }
}
