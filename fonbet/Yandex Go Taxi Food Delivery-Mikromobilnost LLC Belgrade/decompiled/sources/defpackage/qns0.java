package defpackage;

import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;

/* loaded from: classes12.dex */
public final class qns0 implements szl {
    public final /* synthetic */ SlidableFlexView a;

    public qns0(SlidableFlexView slidableFlexView) {
        this.a = slidableFlexView;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        if (neoVar instanceof hzl) {
            this.a.onContentUpdated();
        }
    }

    @Override // defpackage.szl
    public final void dispose() {
    }
}
