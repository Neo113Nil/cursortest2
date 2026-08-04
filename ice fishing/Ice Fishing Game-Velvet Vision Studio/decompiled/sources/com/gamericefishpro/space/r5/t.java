package com.gamericefishpro.space.r5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends com.gamericefishpro.space.f.b {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(b0 b0Var, int i) {
        super(b0Var);
        this.c = i;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int c(View view) {
        int right;
        int i;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                right = view.getRight() + ((c0) view.getLayoutParams()).a.right;
                i = ((ViewGroup.MarginLayoutParams) c0Var).rightMargin;
                break;
            default:
                c0 c0Var2 = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                right = view.getBottom() + ((c0) view.getLayoutParams()).a.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0Var2).bottomMargin;
                break;
        }
        return right + i;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int d(View view) {
        int iV;
        int i;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                iV = b0.v(view) + ((ViewGroup.MarginLayoutParams) c0Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0Var).rightMargin;
                break;
            default:
                c0 c0Var2 = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                iV = b0.u(view) + ((ViewGroup.MarginLayoutParams) c0Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0Var2).bottomMargin;
                break;
        }
        return iV + i;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int e(View view) {
        int iU;
        int i;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                iU = b0.u(view) + ((ViewGroup.MarginLayoutParams) c0Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c0Var).bottomMargin;
                break;
            default:
                c0 c0Var2 = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                iU = b0.v(view) + ((ViewGroup.MarginLayoutParams) c0Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c0Var2).rightMargin;
                break;
        }
        return iU + i;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int f(View view) {
        int left;
        int i;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c0 c0Var = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                left = view.getLeft() - ((c0) view.getLayoutParams()).a.left;
                i = ((ViewGroup.MarginLayoutParams) c0Var).leftMargin;
                break;
            default:
                c0 c0Var2 = (c0) view.getLayoutParams();
                ((b0) this.a).getClass();
                left = view.getTop() - ((c0) view.getLayoutParams()).a.top;
                i = ((ViewGroup.MarginLayoutParams) c0Var2).topMargin;
                break;
        }
        return left - i;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int g() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) this.a).i;
            default:
                return ((b0) this.a).j;
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int h() {
        int i;
        int iY;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = (b0) this.a;
                i = b0Var.i;
                iY = b0Var.y();
                break;
            default:
                b0 b0Var2 = (b0) this.a;
                i = b0Var2.j;
                iY = b0Var2.w();
                break;
        }
        return i - iY;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int i() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) this.a).y();
            default:
                return ((b0) this.a).w();
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int j() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) this.a).g;
            default:
                return ((b0) this.a).h;
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int k() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) this.a).h;
            default:
                return ((b0) this.a).g;
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int m() {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b0) this.a).x();
            default:
                return ((b0) this.a).z();
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int o() {
        int iX;
        int iY;
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = (b0) this.a;
                iX = b0Var.i - b0Var.x();
                iY = b0Var.y();
                break;
            default:
                b0 b0Var2 = (b0) this.a;
                iX = b0Var2.j - b0Var2.z();
                iY = b0Var2.w();
                break;
        }
        return iX - iY;
    }

    @Override // com.gamericefishpro.space.f.b
    public final int p(View view) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = (b0) this.a;
                Rect rect = (Rect) this.b;
                b0Var.D(view, rect);
                return rect.right;
            default:
                b0 b0Var2 = (b0) this.a;
                Rect rect2 = (Rect) this.b;
                b0Var2.D(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final int q(View view) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = (b0) this.a;
                Rect rect = (Rect) this.b;
                b0Var.D(view, rect);
                return rect.left;
            default:
                b0 b0Var2 = (b0) this.a;
                Rect rect2 = (Rect) this.b;
                b0Var2.D(view, rect2);
                return rect2.top;
        }
    }

    @Override // com.gamericefishpro.space.f.b
    public final void s(int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((b0) this.a).H(i);
                break;
            default:
                ((b0) this.a).I(i);
                break;
        }
    }
}
