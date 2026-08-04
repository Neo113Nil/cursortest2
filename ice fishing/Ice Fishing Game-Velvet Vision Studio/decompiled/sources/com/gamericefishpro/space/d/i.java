package com.gamericefishpro.space.d;

import android.content.Intent;
import android.content.IntentSender;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object v;

    public /* synthetic */ i(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.e = obj;
        this.i = i;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) this.e;
                Serializable serializable = (Serializable) ((com.gamericefishpro.space.vb.c) this.v).e;
                String str = (String) jVar.a.get(Integer.valueOf(this.i));
                if (str != null) {
                    com.gamericefishpro.space.h.c cVar = (com.gamericefishpro.space.h.c) jVar.e.get(str);
                    if ((cVar != null ? cVar.a : null) != null) {
                        com.gamericefishpro.space.a8.b bVar = cVar.a;
                        if (jVar.d.remove(str)) {
                            bVar.f(serializable);
                        }
                    } else {
                        jVar.g.remove(str);
                        jVar.f.put(str, serializable);
                    }
                    break;
                }
                break;
            case 1:
                ((j) this.e).a(this.i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.v));
                break;
            default:
                ((com.gamericefishpro.space.p5.c) ((com.gamericefishpro.space.p5.a) this.e).c).g(this.i, this.v);
                break;
        }
    }
}
