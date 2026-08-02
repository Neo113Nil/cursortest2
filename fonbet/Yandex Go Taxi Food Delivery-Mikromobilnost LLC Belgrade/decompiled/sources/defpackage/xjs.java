package defpackage;

import android.view.View;
import com.yandex.go.flex.common.facade.routers.views.FullscreenFlexView;

/* loaded from: classes12.dex */
public final /* synthetic */ class xjs implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullscreenFlexView b;

    public /* synthetic */ xjs(FullscreenFlexView fullscreenFlexView, int i) {
        this.a = i;
        this.b = fullscreenFlexView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View insetsType$lambda$0;
        yjs documentTracker_delegate$lambda$0;
        int i = this.a;
        FullscreenFlexView fullscreenFlexView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = FullscreenFlexView.insetsType$lambda$0(fullscreenFlexView);
                return insetsType$lambda$0;
            default:
                documentTracker_delegate$lambda$0 = FullscreenFlexView.documentTracker_delegate$lambda$0(fullscreenFlexView);
                return documentTracker_delegate$lambda$0;
        }
    }
}
