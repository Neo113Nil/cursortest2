package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.music.cover.upload.UploadCoverService;

/* loaded from: classes.dex */
public final class zu1 implements ServiceConnection {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public zu1() {
        this.a = 0;
        this.b = new AtomicBoolean(false);
        this.c = new LinkedBlockingDeque();
    }

    public IBinder a() {
        if (((AtomicBoolean) this.b).compareAndSet(true, true)) {
            xq0.q("Binder already consumed");
            return null;
        }
        Object take = ((LinkedBlockingDeque) this.c).take();
        take.getClass();
        return (IBinder) take;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) obj).put(iBinder);
                        break;
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
                break;
            default:
                componentName.getClass();
                iBinder.getClass();
                if (!(iBinder instanceof lpg)) {
                    xq0.w(hrg.q("Binder for ", componentName.flattenToString(), " is not LocalBinder."));
                    break;
                } else {
                    int i2 = lpg.h;
                    UploadCoverService uploadCoverService = ((lpg) iBinder).a;
                    ((g06) this.b).d = uploadCoverService;
                    ((kxc) obj).invoke(uploadCoverService);
                    break;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                break;
            default:
                componentName.getClass();
                ((g06) this.b).d = null;
                break;
        }
    }

    public zu1(g06 g06Var, kxc kxcVar, htb htbVar) {
        this.a = 1;
        this.b = g06Var;
        this.c = kxcVar;
    }

    private final void b(ComponentName componentName) {
    }
}
