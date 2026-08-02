package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.common.media.context.c;

/* loaded from: classes5.dex */
public abstract class v8n implements k7q {
    public final c a;
    public final String b;

    public v8n(c cVar) {
        cVar.getClass();
        this.a = cVar;
        nyk nykVar = cVar.b;
        this.b = ouj.o(nykVar.a.name, StringUtils.PROCESS_POSTFIX_DELIMITER, nykVar.b);
    }

    public abstract Object a(w8n w8nVar);

    public abstract String b();

    public c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8n)) {
            return false;
        }
        return Intrinsics.d(this.b, ((v8n) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder m = f1d.m("QueueDescriptor{ChildState=", b(), ", id='", this.b, "', playbackContext=");
        m.append(this.a);
        m.append("}");
        return m.toString();
    }
}
