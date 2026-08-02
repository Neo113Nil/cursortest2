package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.DiscoveryMapSearchbarAnimatedTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class vtj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DiscoveryMapSearchbarAnimatedTextView b;
    public final /* synthetic */ sls c;

    public /* synthetic */ vtj(DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView, sls slsVar, int i) {
        this.a = i;
        this.b = discoveryMapSearchbarAnimatedTextView;
        this.c = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 animateHide$lambda$0;
        zy11 animateShow$lambda$0;
        int i = this.a;
        sls slsVar = this.c;
        DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView = this.b;
        switch (i) {
            case 0:
                animateHide$lambda$0 = DiscoveryMapSearchbarAnimatedTextView.animateHide$lambda$0(discoveryMapSearchbarAnimatedTextView, slsVar);
                return animateHide$lambda$0;
            default:
                animateShow$lambda$0 = DiscoveryMapSearchbarAnimatedTextView.animateShow$lambda$0(discoveryMapSearchbarAnimatedTextView, slsVar);
                return animateShow$lambda$0;
        }
    }
}
