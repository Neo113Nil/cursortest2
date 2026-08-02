package defpackage;

import android.content.Context;
import kotlin.a;

/* loaded from: classes11.dex */
public final class vto {
    public final Context a;
    public final lwt b;
    public final i3y c;

    public vto(Context context) {
        this.a = context;
        zm2 zm2Var = bdz.a;
        this.b = new lwt(context, null, k991.k, mm2.V0, sst.c);
        this.c = a.a(new c1o(7, this));
    }

    public final boolean a() {
        Context context = this.a;
        return (qke.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) && (qke.h(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0);
    }
}
