package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@we7(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {o.LTS_CHANNEL_FIELD_NUMBER}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
final class ia7 extends aur implements Function1<Continuation<? super Unit>, Object> {
    public int j;

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new ia7(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ia7) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i == 0) {
            qgg.h0(obj);
            this.j = 1;
            throw null;
        }
        if (i == 1) {
            qgg.h0(obj);
            return Unit.a;
        }
        xq0.q("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
