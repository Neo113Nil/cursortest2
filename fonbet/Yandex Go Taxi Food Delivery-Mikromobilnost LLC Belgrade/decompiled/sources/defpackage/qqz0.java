package defpackage;

import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class qqz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TollRoadModalView b;

    public /* synthetic */ qqz0(TollRoadModalView tollRoadModalView, int i) {
        this.a = i;
        this.b = tollRoadModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TollRoadModalView tollRoadModalView = this.b;
        switch (i) {
            case 0:
                TollRoadModalView.onModalViewAppear$lambda$0(tollRoadModalView);
                break;
            case 1:
                tollRoadModalView.onBackPressed();
                break;
            default:
                TollRoadModalView._init_$lambda$1(tollRoadModalView);
                break;
        }
    }
}
