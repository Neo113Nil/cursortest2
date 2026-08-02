package defpackage;

import com.ybsdk.core.stories.StoriesComponentView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ulu0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoriesComponentView b;

    public /* synthetic */ ulu0(StoriesComponentView storiesComponentView, int i) {
        this.a = i;
        this.b = storiesComponentView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 startProgressTimer$lambda$20;
        zy11 initErrorView$lambda$16;
        int i = this.a;
        StoriesComponentView storiesComponentView = this.b;
        switch (i) {
            case 0:
                startProgressTimer$lambda$20 = StoriesComponentView.startProgressTimer$lambda$20(storiesComponentView);
                return startProgressTimer$lambda$20;
            default:
                initErrorView$lambda$16 = StoriesComponentView.initErrorView$lambda$16(storiesComponentView);
                return initErrorView$lambda$16;
        }
    }
}
