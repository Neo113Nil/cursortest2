package defpackage;

import android.os.Looper;
import com.yandex.plus.core.analytics.logging.PlusLogLevel;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.reporter.api.PlusPayEvent$Type;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class rkd0 implements pgz {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ rkd0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pgz
    public final void a(LogPriority logPriority, String str, String str2) {
        switch (this.a) {
            case 0:
                b(logPriority, str, str2, null);
                break;
            default:
                b(logPriority, str, str2, null);
                break;
        }
    }

    @Override // defpackage.pgz
    public final void b(LogPriority logPriority, String str, String str2, Throwable th) {
        PlusLogLevel plusLogLevel;
        String str3;
        Thread thread;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                i3y i3yVar = skd0.a;
                switch (qkd0.a[logPriority.ordinal()]) {
                    case 1:
                        plusLogLevel = PlusLogLevel.VERBOSE;
                        break;
                    case 2:
                        plusLogLevel = PlusLogLevel.DEBUG;
                        break;
                    case 3:
                        plusLogLevel = PlusLogLevel.INFO;
                        break;
                    case 4:
                        plusLogLevel = PlusLogLevel.WARNING;
                        break;
                    case 5:
                        plusLogLevel = PlusLogLevel.ERROR;
                        break;
                    case 6:
                        plusLogLevel = PlusLogLevel.ASSERT;
                        break;
                    default:
                        w511.b();
                        break;
                }
                skd0.f(plusLogLevel, (PlusLogTag) obj, g8e.p(str, Extension.COLON_SPACE, str2), th);
                break;
            default:
                ped0 ped0Var = (ped0) this.b;
                Pair pair = new Pair(Constants.KEY_MESSAGE, str2);
                Pair pair2 = new Pair("tag", str);
                Pair pair3 = new Pair("session_id", ((UUID) obj).toString());
                Pair pair4 = new Pair("level", logPriority.name());
                if (th != null) {
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str3 = stringWriter.toString();
                } else {
                    str3 = null;
                }
                Pair pair5 = new Pair("error", String.valueOf(str3));
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                Map i2 = b.i(pair, pair2, pair3, pair4, pair5, new Pair("thread", (mainLooper == null || (thread = mainLooper.getThread()) == null || currentThread.getId() != thread.getId()) ? currentThread.getName() : "Main"));
                if (logPriority == LogPriority.ERROR) {
                    ped0Var.b(new tbd0(PlusPayEvent$Type.ERROR, "PlusPayLog", i2, th));
                }
                ped0Var.b(new tbd0(PlusPayEvent$Type.LOG, "PlusPayLog", i2, th));
                break;
        }
    }

    @Override // defpackage.pgz
    public final boolean e(LogPriority logPriority) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((tls) this.b).invoke(logPriority)).booleanValue();
            default:
                return true;
        }
    }
}
