package defpackage;

import com.yandex.messenger.websdk.api.Cancelable;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ilt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cr b;
    public final /* synthetic */ jlt c;

    public /* synthetic */ ilt(cr crVar, jlt jltVar, int i) {
        this.a = i;
        this.b = crVar;
        this.c = jltVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                cr crVar = this.b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) crVar.h;
                jlt jltVar = this.c;
                Cancelable cancelable = (Cancelable) linkedHashMap.get(jltVar);
                if (cancelable != null) {
                    linkedHashMap.remove(jltVar);
                    cancelable.cancel();
                }
                CancellationException cancellationException = new CancellationException(th.toString());
                cancellationException.initCause(th);
                llt lltVar = (llt) ((LinkedHashMap) crVar.f).get(jltVar);
                if (lltVar != null) {
                    lltVar.a(new r3s(13, cancellationException));
                }
                break;
            default:
                nlt nltVar = (nlt) obj;
                nltVar.getClass();
                this.b.U(this.c, nltVar);
                break;
        }
        return Unit.a;
    }
}
