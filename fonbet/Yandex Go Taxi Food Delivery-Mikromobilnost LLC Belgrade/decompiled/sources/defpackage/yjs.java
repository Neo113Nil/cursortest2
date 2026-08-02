package defpackage;

import com.yandex.go.flex.common.facade.routers.views.FullscreenFlexView;

/* loaded from: classes12.dex */
public final class yjs implements szl {
    public final /* synthetic */ FullscreenFlexView a;

    public yjs(FullscreenFlexView fullscreenFlexView) {
        this.a = fullscreenFlexView;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        if (neoVar instanceof hzl) {
            this.a.removeCloseButton();
        }
    }

    @Override // defpackage.szl
    public final void dispose() {
    }
}
