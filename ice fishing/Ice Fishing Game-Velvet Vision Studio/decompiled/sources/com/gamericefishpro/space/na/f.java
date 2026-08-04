package com.gamericefishpro.space.na;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(p pVar, int i) {
        super(pVar);
        this.e = i;
    }

    @Override // com.gamericefishpro.space.na.q
    public void q() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                p pVar = this.b;
                pVar.H = null;
                CheckableImageButton checkableImageButton = pVar.z;
                checkableImageButton.setOnLongClickListener(null);
                d5.X(checkableImageButton, null);
                break;
        }
    }
}
