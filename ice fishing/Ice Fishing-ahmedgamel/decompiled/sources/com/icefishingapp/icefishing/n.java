package com.icefishingapp.icefishing;

import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public final class n implements G0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f36926b;

    public /* synthetic */ n(AbstractActivityC4551k abstractActivityC4551k, int i) {
        this.f36925a = i;
        this.f36926b = abstractActivityC4551k;
    }

    @Override // G0.h
    public final void a(int i) {
        switch (this.f36925a) {
            case 0:
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f36926b;
                if (i == 0) {
                    mainActivity.f36852W.setAlpha(1.0f);
                    mainActivity.f36857Z.setAlpha(0.5f);
                    mainActivity.f36860n0.setAlpha(0.5f);
                    mainActivity.f36861o0.setAlpha(0.5f);
                    mainActivity.f36863q0.setAlpha(0.5f);
                }
                if (i == 1) {
                    mainActivity.f36852W.setAlpha(0.5f);
                    mainActivity.f36857Z.setAlpha(1.0f);
                    mainActivity.f36860n0.setAlpha(0.5f);
                    mainActivity.f36861o0.setAlpha(0.5f);
                    mainActivity.f36863q0.setAlpha(0.5f);
                }
                if (i == 2) {
                    mainActivity.f36852W.setAlpha(0.5f);
                    mainActivity.f36857Z.setAlpha(0.5f);
                    mainActivity.f36860n0.setAlpha(1.0f);
                    mainActivity.f36861o0.setAlpha(0.5f);
                    mainActivity.f36863q0.setAlpha(0.5f);
                }
                if (i == 3) {
                    mainActivity.f36852W.setAlpha(0.5f);
                    mainActivity.f36857Z.setAlpha(0.5f);
                    mainActivity.f36860n0.setAlpha(0.5f);
                    mainActivity.f36861o0.setAlpha(1.0f);
                    mainActivity.f36863q0.setAlpha(0.5f);
                }
                if (i == 4) {
                    mainActivity.f36852W.setAlpha(0.5f);
                    mainActivity.f36857Z.setAlpha(0.5f);
                    mainActivity.f36860n0.setAlpha(0.5f);
                    mainActivity.f36861o0.setAlpha(0.5f);
                    mainActivity.f36863q0.setAlpha(1.0f);
                }
                if (i == 5) {
                    mainActivity.f36852W.setAlpha(0.5f);
                    mainActivity.f36857Z.setAlpha(0.5f);
                    mainActivity.f36860n0.setAlpha(0.5f);
                    mainActivity.f36861o0.setAlpha(0.5f);
                    mainActivity.f36863q0.setAlpha(0.5f);
                    break;
                }
                break;
        }
    }

    @Override // G0.h
    public final void b(int i) {
        switch (this.f36925a) {
            case 0:
                ((IntroActivity) this.f36926b).e(i);
                break;
        }
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }
}
