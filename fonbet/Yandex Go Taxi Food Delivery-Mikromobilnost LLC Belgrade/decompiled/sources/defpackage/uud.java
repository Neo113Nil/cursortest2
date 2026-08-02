package defpackage;

import com.yandex.go.requirements.modal.CompoundOptionSelectModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class uud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CompoundOptionSelectModalView b;

    public /* synthetic */ uud(CompoundOptionSelectModalView compoundOptionSelectModalView, int i) {
        this.a = i;
        this.b = compoundOptionSelectModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        CompoundOptionSelectModalView compoundOptionSelectModalView = this.b;
        switch (i) {
            case 0:
                CompoundOptionSelectModalView.onAttachedToWindow$lambda$0(compoundOptionSelectModalView);
                break;
            case 1:
                CompoundOptionSelectModalView.onAttachedToWindow$lambda$1(compoundOptionSelectModalView);
                break;
            default:
                CompoundOptionSelectModalView._init_$lambda$0(compoundOptionSelectModalView);
                break;
        }
    }
}
