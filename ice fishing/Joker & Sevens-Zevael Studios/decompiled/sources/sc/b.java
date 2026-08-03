package sc;

import android.os.Looper;
import android.view.Choreographer;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Random;
import y1.d1;
import y1.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6473a;

    public /* synthetic */ b(int i10) {
        this.f6473a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f6473a) {
            case 0:
                return new Random();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                j0 j0Var = new j0(choreographer, v6.a.q(myLooper));
                return v6.a.K(j0Var, j0Var.f8569r);
            default:
                return new d1();
        }
    }
}
