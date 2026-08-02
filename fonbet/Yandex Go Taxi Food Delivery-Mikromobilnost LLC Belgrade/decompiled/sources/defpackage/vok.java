package defpackage;

import android.view.View;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;

/* loaded from: classes3.dex */
public final class vok implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ DivEducationsV2View c;
    public final /* synthetic */ uon w;

    public /* synthetic */ vok(View view, DivEducationsV2View divEducationsV2View, uon uonVar, int i) {
        this.a = i;
        this.b = view;
        this.c = divEducationsV2View;
        this.w = uonVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        uon uonVar = this.w;
        DivEducationsV2View divEducationsV2View = this.c;
        switch (i) {
            case 0:
                divEducationsV2View.updatePopupPosition(uonVar);
                break;
            default:
                divEducationsV2View.updatePopupPosition(uonVar);
                break;
        }
    }
}
