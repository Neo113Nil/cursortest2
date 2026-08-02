package defpackage;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.a;
import java.util.concurrent.Callable;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class r2f implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ a b;

    public r2f(a aVar, long j) {
        this.b = aVar;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong(ClidProvider.TIMESTAMP, this.a);
        this.b.k.c(bundle);
        return null;
    }
}
