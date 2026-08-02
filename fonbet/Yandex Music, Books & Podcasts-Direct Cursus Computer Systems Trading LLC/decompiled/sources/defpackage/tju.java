package defpackage;

import android.content.Context;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class tju implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uju b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ tju(uju ujuVar, String str, boolean z, int i) {
        this.a = i;
        this.b = ujuVar;
        this.c = str;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object t7oVar;
        int i = this.a;
        boolean z = this.d;
        String str = this.c;
        uju ujuVar = this.b;
        switch (i) {
            case 0:
                ReentrantLock reentrantLock = vju.a;
                Context context = ujuVar.a;
                vju.a(context, str);
                if (z) {
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = Boolean.valueOf(new File(quj.i0(context), "offline_mode_availability_".concat(str)).createNewFile());
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        Assertions.throwOrSkip("VpnGateOfflineModeAvailabilityDataSource", new FailedAssertionException("Can't create marker for uid=".concat(str), a));
                    }
                } else {
                    new File(quj.i0(context), "offline_mode_availability_".concat(str)).delete();
                }
                break;
            case 1:
                ReentrantLock reentrantLock2 = vju.a;
                Context context2 = ujuVar.a;
                vju.a(context2, str);
                avf.P(context2, str, z);
                break;
            default:
                avf.P(ujuVar.a, str, z);
                break;
        }
        return Unit.a;
    }
}
