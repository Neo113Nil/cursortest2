package B8;

import D.y;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236a = 1;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f237b;

    public /* synthetic */ g() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f236a) {
            case 0:
                pl.droidsonroids.gif.c cVar = (pl.droidsonroids.gif.c) this.f237b.get();
                if (cVar == null) {
                    return;
                }
                if (message.what == -1) {
                    cVar.invalidateSelf();
                    return;
                }
                Iterator it = cVar.f39952A.iterator();
                if (it.hasNext()) {
                    throw y.j(it);
                }
                return;
            default:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f237b.get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }

    public g(pl.droidsonroids.gif.c cVar) {
        super(Looper.getMainLooper());
        this.f237b = new WeakReference(cVar);
    }
}
