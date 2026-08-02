package defpackage;

import com.yandex.go.payments.cards.ui.AddCardView;
import com.yandex.go.payments.cards.ui.add.AddCardModalView;

/* loaded from: classes13.dex */
public final class x90 extends jey {
    public final /* synthetic */ AddCardModalView a;

    public x90(AddCardModalView addCardModalView) {
        this.a = addCardModalView;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onPause() {
        AddCardView addCardView;
        addCardView = this.a.addCardView;
        if (addCardView != null) {
            addCardView.pause();
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onResume() {
        AddCardView addCardView;
        addCardView = this.a.addCardView;
        if (addCardView != null) {
            addCardView.resume();
        }
    }
}
