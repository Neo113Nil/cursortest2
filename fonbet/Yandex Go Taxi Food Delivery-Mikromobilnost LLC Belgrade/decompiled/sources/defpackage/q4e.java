package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.ConnectionError;
import ru.yandex.taxi.eatskit.dto.ConnectionStatus;

@gsq0
/* loaded from: classes5.dex */
public final class q4e {
    public static final p4e Companion = new p4e();
    public static final i3y[] c;
    public final ConnectionStatus a;
    public final ConnectionError b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new m3e(2)), a.b(lazyThreadSafetyMode, new m3e(3))};
    }

    public /* synthetic */ q4e(int i, ConnectionStatus connectionStatus, ConnectionError connectionError) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, o4e.a.getDescriptor());
            throw null;
        }
        this.a = connectionStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = connectionError;
        }
    }

    public q4e(ConnectionStatus connectionStatus, ConnectionError connectionError) {
        this.a = connectionStatus;
        this.b = connectionError;
    }
}
