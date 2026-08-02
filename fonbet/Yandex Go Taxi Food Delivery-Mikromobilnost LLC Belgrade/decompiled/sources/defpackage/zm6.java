package defpackage;

import ru.yandex.taxi.multiorder.BubbleModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class zm6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BubbleModalView b;

    public /* synthetic */ zm6(BubbleModalView bubbleModalView, int i) {
        this.a = i;
        this.b = bubbleModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BubbleModalView bubbleModalView = this.b;
        switch (i) {
            case 0:
                bubbleModalView.dismiss();
                break;
            default:
                bubbleModalView.dismiss();
                break;
        }
    }
}
