package com.gamericefishpro.space.ob;

import android.text.TextUtils;
import com.gamericefishpro.space.n9.y;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static j d;
    public final y a;

    public j(y yVar) {
        this.a = yVar;
    }

    public final boolean a(com.gamericefishpro.space.pb.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j = bVar.f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
