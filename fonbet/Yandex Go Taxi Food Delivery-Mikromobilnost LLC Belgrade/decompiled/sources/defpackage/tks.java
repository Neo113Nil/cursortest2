package defpackage;

import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;

/* loaded from: classes8.dex */
public final class tks implements szl {
    public final /* synthetic */ FullscreenSuperappSuggestModalView a;

    public tks(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        this.a = fullscreenSuperappSuggestModalView;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        cgw0 binding;
        if (neoVar instanceof hzl) {
            binding = this.a.getBinding();
            binding.e.requestApplyInsets();
        }
    }

    @Override // defpackage.szl
    public final void dispose() {
    }
}
