package defpackage;

import android.content.Context;
import com.yandex.music.core.job.JobService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class u2f {
    public final Context a;
    public volatile JobService d;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final k3f c = new k3f();
    public final nha e = new nha(20, this);

    public u2f(Context context) {
        this.a = context;
        new lhd(10, this);
    }

    public final void a(v2f v2fVar, boolean z) {
        x97.y(cmd.a, null, null, new cg1(this, v2fVar, z, (Continuation) null, 8), 3);
    }
}
