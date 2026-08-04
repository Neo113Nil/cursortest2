package com.gamericefishpro.space.la;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.onesignal.core.activities.PermissionsActivity;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.wa.b {
    public final /* synthetic */ int c;
    public final SideSheetBehavior d;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.c = i;
        this.d = sideSheetBehavior;
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int A() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return -this.d.l;
            default:
                return w();
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int B(View view) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.getRight() + this.d.o;
            default:
                return view.getLeft() - this.d.o;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int C(CoordinatorLayout coordinatorLayout) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int E() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final boolean G(float f) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final boolean I(View view) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return view.getRight() < (w() - x()) / 2;
            default:
                return view.getLeft() > (w() + this.d.m) / 2;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final boolean J(float f, float f2) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
            default:
                return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final boolean O(View view, float f) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.d;
                float fAbs = Math.abs((f * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.d;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final void S(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i <= this.d.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.d.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final float i(int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                float fX = x();
                return (i - fX) / (w() - fX);
            default:
                float f = this.d.m;
                return (f - i) / (f - w());
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int w() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.d;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.d;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int x() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.d;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.d.m;
        }
    }

    @Override // com.gamericefishpro.space.wa.b
    public final int z() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.d.o;
            default:
                return this.d.m;
        }
    }
}
