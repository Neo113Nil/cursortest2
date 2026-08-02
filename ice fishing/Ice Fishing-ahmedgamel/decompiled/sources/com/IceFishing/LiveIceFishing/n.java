package com.IceFishing.LiveIceFishing;

import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public final class n implements G0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f6415b;

    public /* synthetic */ n(AbstractActivityC4555k abstractActivityC4555k, int i) {
        this.f6414a = i;
        this.f6415b = abstractActivityC4555k;
    }

    @Override // G0.g
    public final void a(int i) {
        switch (this.f6414a) {
            case 0:
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f6415b;
                if (i == 0) {
                    mainActivity.f6341W.setAlpha(1.0f);
                    mainActivity.f6343Z.setAlpha(0.5f);
                    mainActivity.f6344i0.setAlpha(0.5f);
                    mainActivity.f6345j0.setAlpha(0.5f);
                    mainActivity.f6347l0.setAlpha(0.5f);
                }
                if (i == 1) {
                    mainActivity.f6341W.setAlpha(0.5f);
                    mainActivity.f6343Z.setAlpha(1.0f);
                    mainActivity.f6344i0.setAlpha(0.5f);
                    mainActivity.f6345j0.setAlpha(0.5f);
                    mainActivity.f6347l0.setAlpha(0.5f);
                }
                if (i == 2) {
                    mainActivity.f6341W.setAlpha(0.5f);
                    mainActivity.f6343Z.setAlpha(0.5f);
                    mainActivity.f6344i0.setAlpha(1.0f);
                    mainActivity.f6345j0.setAlpha(0.5f);
                    mainActivity.f6347l0.setAlpha(0.5f);
                }
                if (i == 3) {
                    mainActivity.f6341W.setAlpha(0.5f);
                    mainActivity.f6343Z.setAlpha(0.5f);
                    mainActivity.f6344i0.setAlpha(0.5f);
                    mainActivity.f6345j0.setAlpha(1.0f);
                    mainActivity.f6347l0.setAlpha(0.5f);
                }
                if (i == 4) {
                    mainActivity.f6341W.setAlpha(0.5f);
                    mainActivity.f6343Z.setAlpha(0.5f);
                    mainActivity.f6344i0.setAlpha(0.5f);
                    mainActivity.f6345j0.setAlpha(0.5f);
                    mainActivity.f6347l0.setAlpha(1.0f);
                }
                if (i == 5) {
                    mainActivity.f6341W.setAlpha(0.5f);
                    mainActivity.f6343Z.setAlpha(0.5f);
                    mainActivity.f6344i0.setAlpha(0.5f);
                    mainActivity.f6345j0.setAlpha(0.5f);
                    mainActivity.f6347l0.setAlpha(0.5f);
                    break;
                }
                break;
        }
    }

    @Override // G0.g
    public final void b(int i) {
        switch (this.f6414a) {
            case 0:
                ((IntroActivity) this.f6415b).e(i);
                break;
        }
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
