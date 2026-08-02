package defpackage;

import android.view.MotionEvent;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcAppEventDispatcher;

/* loaded from: classes.dex */
public final /* synthetic */ class wht implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UibcAppEventDispatcher b;
    public final /* synthetic */ MotionEvent c;

    public /* synthetic */ wht(UibcAppEventDispatcher uibcAppEventDispatcher, MotionEvent motionEvent, int i) {
        this.a = i;
        this.b = uibcAppEventDispatcher;
        this.c = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$dispatchTouchEvent$1(this.c);
                break;
            default:
                this.b.lambda$dispatchGenericMotionEvent$3(this.c);
                break;
        }
    }
}
