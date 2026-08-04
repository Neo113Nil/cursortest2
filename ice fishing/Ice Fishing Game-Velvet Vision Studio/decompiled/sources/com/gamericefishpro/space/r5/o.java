package com.gamericefishpro.space.r5;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public o(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.b = -1;
                this.c = Integer.MIN_VALUE;
                this.d = false;
                this.e = false;
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }
}
