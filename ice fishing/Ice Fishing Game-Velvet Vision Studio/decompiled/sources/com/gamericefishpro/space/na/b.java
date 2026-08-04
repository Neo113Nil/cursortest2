package com.gamericefishpro.space.na;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ b(q qVar, int i) {
        this.a = i;
        this.b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e eVar = (e) this.b;
                eVar.s(eVar.t());
                break;
            default:
                m mVar = (m) this.b;
                mVar.l = z;
                mVar.p();
                if (!z) {
                    mVar.s(false);
                    mVar.m = false;
                }
                break;
        }
    }
}
