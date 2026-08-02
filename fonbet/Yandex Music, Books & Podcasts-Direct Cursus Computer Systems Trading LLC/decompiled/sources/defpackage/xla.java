package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Charsets;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes.dex */
public final /* synthetic */ class xla implements fra, kya, m7t, nn5, myc, ycg, oq3, ag6 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new vqe(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void i(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        switch (this.a) {
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 19:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                brf brfVar = ExecutorsRegistrar.a;
                return sft.a;
        }
    }

    @Override // defpackage.fra
    public void a() {
    }

    @Override // defpackage.m7t
    public Object apply(Object obj) {
        switch (this.a) {
            case 16:
                String n = slp.b.n((rlp) obj);
                n.getClass();
                Log.d("EventGDTLogger", "Session Event Type: SESSION_START");
                byte[] bytes = n.getBytes(Charsets.UTF_8);
                bytes.getClass();
                return bytes;
            default:
                return new uj7((dzr) obj);
        }
    }

    @Override // defpackage.kya
    public float b(float f) {
        float f2;
        float f3;
        switch (this.a) {
            case 9:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                return f;
        }
    }

    @Override // defpackage.oq3
    public void d(long j, long j2, long j3) {
        int i = i9f.a;
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        f8l f8lVar = (f8l) obj;
        switch (this.a) {
            case 25:
                f8lVar.L(new pqb(2, new wsb(1), 1003));
                break;
            default:
                f8lVar.y();
                break;
        }
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        int i;
        switch (this.a) {
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                i = NetworkRequestException.INVALID_SIGNATURE;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ xla(int i) {
        this.a = i;
    }
}
