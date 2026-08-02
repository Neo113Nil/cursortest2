package c3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Looper looper, int i, boolean z6) {
        super(looper);
        this.f5728a = i;
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.f5728a) {
            case 1:
                a(message);
                break;
            default:
                super.dispatchMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.f5728a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Looper looper, int i) {
        super(looper);
        this.f5728a = i;
        switch (i) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
