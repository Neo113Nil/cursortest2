package defpackage;

import android.content.Context;
import android.location.LocationManager;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes9.dex */
public final class s9z {
    public final Context a;
    public final rcz b;

    public s9z(Context context, rcz rczVar) {
        this.a = context;
        this.b = rczVar;
    }

    public final LocationManager a() {
        Object failure;
        try {
            failure = (LocationManager) this.a.getSystemService(LocationManager.class);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            this.b.b("LocationManagerAdapter", a, new Pair[0]);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (LocationManager) failure;
    }
}
