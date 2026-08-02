package defpackage;

import com.yandex.messenger.websdk.api.UserUnreadCounters;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class qrr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ltm b;

    public /* synthetic */ qrr(ltm ltmVar, int i) {
        this.a = i;
        this.b = ltmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                gld.K(this.b, "API Error", (Throwable) obj);
                break;
            default:
                Object c = ((oc4) this.b).d.c(Integer.valueOf(((UserUnreadCounters) obj).a));
                if (c instanceof ed4) {
                    ssg.a(4, "SupportChat", "trySend.onClosed", null);
                }
                if (c instanceof fd4) {
                    ssg.a(4, "SupportChat", "trySend.onFailure: " + gd4.a(c), null);
                }
                break;
        }
        return Unit.a;
    }
}
