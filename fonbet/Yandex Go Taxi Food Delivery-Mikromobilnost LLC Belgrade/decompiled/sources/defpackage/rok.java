package defpackage;

import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;

/* loaded from: classes3.dex */
public final /* synthetic */ class rok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DivEducationsV2View b;

    public /* synthetic */ rok(DivEducationsV2View divEducationsV2View, int i) {
        this.a = i;
        this.b = divEducationsV2View;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DivEducationsV2View divEducationsV2View = this.b;
        switch (i) {
            case 0:
                DivEducationsV2View.animateShow$lambda$28(divEducationsV2View);
                break;
            default:
                DivEducationsV2View.dismiss$lambda$50(divEducationsV2View);
                break;
        }
    }
}
