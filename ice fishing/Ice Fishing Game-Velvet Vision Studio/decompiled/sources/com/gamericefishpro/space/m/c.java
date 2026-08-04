package com.gamericefishpro.space.m;

import android.view.View;
import android.view.ViewTreeObserver;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.n.n1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ k e;

    public /* synthetic */ c(k kVar, int i) {
        this.d = i;
        this.e = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f fVar = (f) this.e;
                ArrayList arrayList = fVar.A;
                if (fVar.j() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((e) arrayList.get(0)).a.N) {
                        View view = fVar.H;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((e) obj).a.a();
                            }
                        } else {
                            fVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                r rVar = (r) this.e;
                n1 n1Var = rVar.A;
                if (rVar.j() && !n1Var.N) {
                    View view2 = rVar.F;
                    if (view2 != null && view2.isShown()) {
                        n1Var.a();
                    } else {
                        rVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
