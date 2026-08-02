package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.internal.authorized.sync.HistoryLoader$HistoryException;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class vlu extends ylu {
    public long a;
    public final /* synthetic */ wlu b;
    public final /* synthetic */ HistoryRequest c;
    public final /* synthetic */ kde w;

    public vlu(wlu wluVar, HistoryRequest historyRequest, kde kdeVar) {
        this.b = wluVar;
        this.c = historyRequest;
        this.w = kdeVar;
    }

    @Override // defpackage.ylu
    public final void b(HistoryResponse historyResponse) {
        j18 j18Var = this.w.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(new Result.Failure(new HistoryLoader$HistoryException(oyr.i(historyResponse.status, "history request failed with status "))));
        }
    }

    @Override // defpackage.ylu
    public final void f(HistoryResponse historyResponse) {
        wlu wluVar = this.b;
        wluVar.c(null);
        ((jwa0) wluVar.c.get()).a(this.a, wluVar.b());
        int i = wluVar.d.a.getSharedPreferences("debug_settings_prefs_filename", 0).getInt("debug_settings_messenger_workspace_version_key", -1);
        Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
        if (valueOf != null) {
            historyResponse.workspaceVersion = valueOf.intValue();
        }
        j18 j18Var = this.w.b;
        if (j18Var.t() instanceof mf60) {
            j18Var.resumeWith(historyResponse);
        }
    }

    @Override // defpackage.ylu, defpackage.o5t0
    /* renamed from: g */
    public final HistoryRequest c(int i, int i2) {
        ((jwa0) this.b.c.get()).getClass();
        this.a = SystemClock.elapsedRealtime();
        CommonRequestFields commonRequestFields = new CommonRequestFields(i2 > 0, i);
        HistoryRequest historyRequest = this.c;
        historyRequest.commonFields = commonRequestFields;
        return historyRequest;
    }
}
