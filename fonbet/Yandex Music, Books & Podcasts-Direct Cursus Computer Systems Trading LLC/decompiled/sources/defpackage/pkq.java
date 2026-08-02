package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class pkq extends uif implements Function1<Throwable, Unit> {
    public final /* synthetic */ okq r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkq(okq okqVar) {
        super(1);
        this.r = okqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            xdr xdrVar = this.r.g;
            pdc pdcVar = new pdc(th);
            xdrVar.getClass();
            xdrVar.m(null, pdcVar);
        }
        Object obj2 = okq.k;
        okq okqVar = this.r;
        synchronized (obj2) {
            okq.j.remove(okqVar.c().getAbsolutePath());
        }
        return Unit.a;
    }
}
