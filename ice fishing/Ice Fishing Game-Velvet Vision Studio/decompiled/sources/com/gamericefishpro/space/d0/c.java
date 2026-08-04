package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements d, g {
    public final /* synthetic */ int a;
    public final float b;

    public c(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 0;
                break;
            case 2:
                this.b = 0;
                break;
            case 3:
                this.b = 0;
                break;
            default:
                this.b = 0;
                break;
        }
    }

    @Override // com.gamericefishpro.space.d0.d, com.gamericefishpro.space.d0.g
    public final float a() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    @Override // com.gamericefishpro.space.d0.g
    public final void b(int i, com.gamericefishpro.space.f2.n0 n0Var, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h.a(i, iArr, iArr2, false);
                break;
            case 1:
                h.d(i, iArr, iArr2, false);
                break;
            case 2:
                h.e(i, iArr, iArr2, false);
                break;
            default:
                h.f(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // com.gamericefishpro.space.d0.d
    public final void c(com.gamericefishpro.space.c3.c cVar, int i, int[] iArr, com.gamericefishpro.space.c3.l lVar, int[] iArr2) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (lVar != com.gamericefishpro.space.c3.l.d) {
                    h.a(i, iArr, iArr2, true);
                } else {
                    h.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (lVar != com.gamericefishpro.space.c3.l.d) {
                    h.d(i, iArr, iArr2, true);
                } else {
                    h.d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (lVar != com.gamericefishpro.space.c3.l.d) {
                    h.e(i, iArr, iArr2, true);
                } else {
                    h.e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (lVar != com.gamericefishpro.space.c3.l.d) {
                    h.f(i, iArr, iArr2, true);
                } else {
                    h.f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
