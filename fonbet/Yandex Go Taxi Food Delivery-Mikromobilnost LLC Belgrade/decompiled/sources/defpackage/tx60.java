package defpackage;

import com.yandex.go.payments.cards.ui.OnClickRepeatingTouchListener;

/* loaded from: classes13.dex */
public final /* synthetic */ class tx60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OnClickRepeatingTouchListener b;

    public /* synthetic */ tx60(OnClickRepeatingTouchListener onClickRepeatingTouchListener, int i) {
        this.a = i;
        this.b = onClickRepeatingTouchListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OnClickRepeatingTouchListener onClickRepeatingTouchListener = this.b;
        switch (i) {
            case 0:
                OnClickRepeatingTouchListener.waitingRunnable$lambda$0(onClickRepeatingTouchListener);
                break;
            default:
                OnClickRepeatingTouchListener.waitingRunnable$lambda$0$0(onClickRepeatingTouchListener);
                break;
        }
    }
}
