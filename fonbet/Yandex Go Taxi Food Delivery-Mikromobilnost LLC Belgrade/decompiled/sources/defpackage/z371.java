package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import yads.ah;
import yads.bh;
import yads.ch;
import yads.dh;
import yads.zg;

/* loaded from: classes7.dex */
public final class z371 {
    public final Context a;
    public final i3y b = a.a(new zg(this));

    public z371(Context context) {
        this.a = context;
    }

    public final List a(int i, int i2, long j) {
        List historicalProcessExitReasons;
        ActivityManager activityManager = (ActivityManager) this.b.getValue();
        if (activityManager == null) {
            return EmptyList.a;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, i);
        return b.s(b.o(b.g(b.g(b.g(new h73(1, historicalProcessExitReasons), ah.w), new bh(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i2))), new ch(j)), new dh(this)));
    }
}
