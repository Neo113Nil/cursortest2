package defpackage;

import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView;

/* loaded from: classes.dex */
public final /* synthetic */ class s1w0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppMainScreenFlexModalView b;

    public /* synthetic */ s1w0(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, int i) {
        this.a = i;
        this.b = superAppMainScreenFlexModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView = this.b;
        switch (i) {
            case 0:
                superAppMainScreenFlexModalView.scrollUp();
                break;
            default:
                SuperAppMainScreenFlexModalView.renderBottomView$lambda$0(superAppMainScreenFlexModalView);
                break;
        }
    }
}
