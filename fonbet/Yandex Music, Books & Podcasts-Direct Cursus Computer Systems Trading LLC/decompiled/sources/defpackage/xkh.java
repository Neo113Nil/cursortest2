package defpackage;

import android.view.Choreographer;
import androidx.media3.session.i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class xkh implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xkh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                dvt.c0(((ykh) this.b).h, runnable);
                break;
            case 1:
                ((vld) this.b).post(runnable);
                break;
            case 2:
                dvt.c0(((i) this.b).l, runnable);
                break;
            case 3:
                ((Choreographer) this.b).postFrameCallback(new gm0(runnable, 1));
                break;
            default:
                ((Executor) this.b).execute(new bhp(13, runnable));
                break;
        }
    }
}
