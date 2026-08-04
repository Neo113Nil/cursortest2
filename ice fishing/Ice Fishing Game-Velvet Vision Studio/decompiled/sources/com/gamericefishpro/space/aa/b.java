package com.gamericefishpro.space.aa;

import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.fa.i;
import com.gamericefishpro.space.fa.j;
import com.gamericefishpro.space.i9.y3;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends y3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.i9.y3
    public final void A(int i) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                j jVar = (j) this.e;
                jVar.d = true;
                i iVar = (i) jVar.e.get();
                if (iVar != null) {
                    f fVar = (f) iVar;
                    fVar.A();
                    fVar.invalidateSelf();
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.i9.y3
    public final void B(Typeface typeface, boolean z) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Chip chip = (Chip) this.e;
                f fVar = chip.w;
                chip.setText(fVar.e1 ? fVar.g0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    j jVar = (j) this.e;
                    jVar.d = true;
                    i iVar = (i) jVar.e.get();
                    if (iVar != null) {
                        f fVar2 = (f) iVar;
                        fVar2.A();
                        fVar2.invalidateSelf();
                    }
                    break;
                }
                break;
        }
    }

    private final void X(int i) {
    }
}
