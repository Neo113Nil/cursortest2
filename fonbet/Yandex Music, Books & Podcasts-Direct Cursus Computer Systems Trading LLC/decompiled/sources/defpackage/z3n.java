package defpackage;

import android.app.DownloadManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class z3n extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ DownloadManager k;
    public final /* synthetic */ DownloadManager.Request l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3n(DownloadManager downloadManager, DownloadManager.Request request, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = downloadManager;
        this.l = request;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z3n(this.k, this.l, continuation, 0);
            default:
                return new z3n(this.k, this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((z3n) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        DownloadManager.Request request = this.l;
        DownloadManager downloadManager = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                if (downloadManager != null) {
                    new Long(downloadManager.enqueue(request));
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                if (downloadManager != null) {
                    new Long(downloadManager.enqueue(request));
                }
                break;
        }
        return Unit.a;
    }
}
