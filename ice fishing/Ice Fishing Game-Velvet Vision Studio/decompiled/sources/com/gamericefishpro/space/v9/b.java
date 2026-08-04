package com.gamericefishpro.space.v9;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d5;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d5 {
    public final /* synthetic */ int c;

    @Override // com.gamericefishpro.space.i9.d5
    public final int F(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final int I() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // com.gamericefishpro.space.i9.d5
    public final ViewPropertyAnimator J(View view, int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
