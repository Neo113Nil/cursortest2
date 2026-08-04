package com.gamericefishpro.space.s4;

import androidx.work.impl.foreground.SystemForegroundService;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.u8.a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int d;
    public final int e;
    public final Object i;

    public /* synthetic */ i(int i, int i2, Object obj) {
        this.d = i2;
        this.i = obj;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ArrayList arrayList = (ArrayList) this.i;
                int size = arrayList.size();
                int i = 0;
                if (this.e == 1) {
                    while (i < size) {
                        ((h) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((h) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            case 1:
                ((SystemForegroundService) this.i).w.cancel(this.e);
                break;
            case 2:
                ((a0) this.i).f(this.e);
                break;
            default:
                com.gamericefishpro.space.t3.b bVar = (com.gamericefishpro.space.t3.b) ((com.gamericefishpro.space.tb.u) this.i).e;
                if (bVar != null) {
                    bVar.g(this.e);
                }
                break;
        }
    }

    public i(List list, int i, Throwable th) {
        this.d = 0;
        a4.p(list, "initCallbacks cannot be null");
        this.i = new ArrayList(list);
        this.e = i;
    }
}
