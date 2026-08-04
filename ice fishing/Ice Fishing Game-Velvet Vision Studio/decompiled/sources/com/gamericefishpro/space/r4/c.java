package com.gamericefishpro.space.r4;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ka.y;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d5 {
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i) {
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.i9.d5
    public final float H(y yVar) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((View) yVar).getAlpha();
            case 1:
                return ((View) yVar).getScaleX();
            case 2:
                return ((View) yVar).getScaleY();
            case 3:
                return ((View) yVar).getRotation();
            case 4:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.i9.d5
    public final void Z(y yVar, float f) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((View) yVar).setAlpha(f);
                break;
            case 1:
                ((View) yVar).setScaleX(f);
                break;
            case 2:
                ((View) yVar).setScaleY(f);
                break;
            case 3:
                ((View) yVar).setRotation(f);
                break;
            case 4:
                ((View) yVar).setRotationX(f);
                break;
            default:
                ((View) yVar).setRotationY(f);
                break;
        }
    }
}
