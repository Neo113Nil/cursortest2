package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.yandex.music.shared.downloading.api.service.DownloadService;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class qba extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public /* synthetic */ boolean k;
    public final /* synthetic */ Context l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qba(Context context, Continuation continuation, boolean z) {
        super(2, continuation);
        this.l = context;
        this.k = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new qba(this.l, continuation, this.k);
            default:
                qba qbaVar = new qba(this.l, continuation);
                qbaVar.k = ((Boolean) obj).booleanValue();
                return qbaVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((qba) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qba) create(bool, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Context context = this.l;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                vka vkaVar = DownloadService.c;
                Intent action = new Intent(context, (Class<?>) DownloadService.class).setAction(this.k ? "ACTION_START_SERVICE" : "ACTION_STOP_SERVICE");
                action.getClass();
                try {
                    context.startService(action);
                } catch (IllegalStateException e) {
                    Assertions.throwOrSkip$default(new FailedAssertionException("DownloadService start fail", e), null, 2, null);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                c0k.a(context, RescheduleReceiver.class, this.k);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qba(Context context, Continuation continuation) {
        super(2, continuation);
        this.l = context;
    }
}
