package defpackage;

import android.database.Cursor;
import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.MessageData;
import java.io.IOException;

/* loaded from: classes15.dex */
public final class vcz0 {
    public final o1b0 a;
    public final k020 b;
    public final Moshi c;
    public final by10 d;
    public final az10 e;

    public vcz0(o1b0 o1b0Var, at2 at2Var, k020 k020Var, Moshi moshi) {
        this.a = o1b0Var;
        this.b = k020Var;
        this.c = moshi;
        this.d = at2Var.b();
        this.e = at2Var.B();
    }

    public final r3z a() {
        r3z I;
        long j = this.a.a;
        k020 k020Var = this.b;
        at2 at2Var = k020Var.b;
        yab yabVar = new yab(at2Var.B().P(2, j), (Moshi) k020Var.h.get(), at2Var.Y().g(j));
        try {
            if (yabVar.getCount() == 0) {
                I = null;
            } else {
                while (true) {
                    boolean moveToNext = yabVar.moveToNext();
                    Cursor cursor = yabVar.a;
                    if (!moveToNext) {
                        yabVar.moveToPosition(cursor.getPosition() - 1);
                        break;
                    }
                    if (cursor.getPosition() >= 2) {
                        break;
                    }
                    Integer a0 = yabVar.a0();
                    if (a0 == null) {
                        throw new IllegalStateException();
                    }
                    int intValue = a0.intValue();
                    if (intValue != -3 && intValue != -1) {
                        break;
                    }
                }
                I = yabVar.I();
            }
            yabVar.close();
            return I;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(yabVar, th);
                throw th2;
            }
        }
    }

    public final r3z b(LocalMessageRef localMessageRef) {
        yab e = e(localMessageRef);
        try {
            if (!e.moveToFirst()) {
                e.close();
                return null;
            }
            if (localMessageRef.getTimestamp() == 0) {
                r3z I = e.I();
                e.close();
                return I;
            }
            if (!e.S0()) {
                r3z I2 = e.U() == localMessageRef.getTimestamp() ? e.I() : null;
                e.close();
                return I2;
            }
            long z0 = e.z0();
            long k0 = e.k0();
            if (z0 != -1) {
                long j = k0 + 1;
                long timestamp = localMessageRef.getTimestamp();
                if (j <= timestamp && timestamp <= z0) {
                    r3z I3 = e.I();
                    e.close();
                    return I3;
                }
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(e, th);
                throw th2;
            }
        }
    }

    public final r3z c(ServerMessageRef serverMessageRef) {
        yab yabVar = new yab(this.e.N(this.a.a, serverMessageRef.getTimestamp() - 1), this.c, 0L);
        try {
            if (!yabVar.moveToFirst()) {
                yabVar.close();
                return null;
            }
            if (yabVar.R0()) {
                Long B = yabVar.B();
                long timestamp = serverMessageRef.getTimestamp();
                if (B != null && B.longValue() == timestamp) {
                    r3z I = yabVar.I();
                    if (!yabVar.moveToNext() || yabVar.U() != serverMessageRef.getTimestamp()) {
                        yabVar.close();
                        return I;
                    }
                    r3z I2 = yabVar.I();
                    yabVar.close();
                    return I2;
                }
                yabVar.close();
                return null;
            }
            if (!yabVar.S0()) {
                r3z I3 = yabVar.U() == serverMessageRef.getTimestamp() ? yabVar.I() : null;
                yabVar.close();
                return I3;
            }
            long z0 = yabVar.z0();
            long k0 = yabVar.k0();
            if (z0 == -1 || serverMessageRef.getTimestamp() > z0 || serverMessageRef.getTimestamp() <= k0) {
                yabVar.close();
                return null;
            }
            r3z I4 = yabVar.I();
            yabVar.close();
            return I4;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(yabVar, th);
                throw th2;
            }
        }
    }

    public final MessageData d(LocalMessageRef localMessageRef) {
        String b;
        String messageId = localMessageRef.getMessageId();
        o1b0 o1b0Var = this.a;
        by10 by10Var = this.d;
        if (messageId != null) {
            b = (String) a.b(by10Var.a, true, false, new qo6(o1b0Var.a, localMessageRef.getMessageId(), 8));
        } else {
            b = by10Var.b(o1b0Var.a, localMessageRef.getTimestamp());
        }
        if (b == null) {
            return null;
        }
        try {
            return (MessageData) this.c.adapter(MessageData.class).fromJson(b);
        } catch (IOException e) {
            ny61.j(e);
            return null;
        }
    }

    public final yab e(LocalMessageRef localMessageRef) {
        long timestamp = localMessageRef.getTimestamp();
        o1b0 o1b0Var = this.a;
        Moshi moshi = this.c;
        az10 az10Var = this.e;
        if (timestamp != 0) {
            return new yab(az10Var.U(o1b0Var.a, localMessageRef.getTimestamp()), moshi, 0L);
        }
        if (localMessageRef.getMessageId() != null) {
            return new yab(az10Var.Y(o1b0Var.a, localMessageRef.getMessageId()), moshi, 0L);
        }
        ny61.k();
        return null;
    }

    public final yab f() {
        o1b0 o1b0Var = this.a;
        ChatId a = ChatId.Companion.a(o1b0Var.b);
        if ((a instanceof ChatId.ThreadId) && ((ChatId.ThreadId) a).d >= 0) {
            long j = o1b0Var.a;
            k020 k020Var = this.b;
            i3b a2 = k020Var.k(j).a();
            if (a2 != null) {
                long j2 = a2.a;
                ServerMessageRef serverMessageRef = a2.b;
                at2 at2Var = k020Var.b;
                long g = at2Var.Y().g(j2);
                az10 B = at2Var.B();
                return new yab(B.T(j2, serverMessageRef.getTimestamp() - 999, serverMessageRef.getTimestamp()), (Moshi) k020Var.h.get(), g);
            }
        }
        return null;
    }

    public final ServerMessageRef g(LocalMessageRef localMessageRef) {
        ServerMessageRef serverMessageRef;
        yab e = e(localMessageRef);
        try {
            ServerMessageRef serverMessageRef2 = null;
            if (!e.moveToFirst()) {
                e.close();
                return null;
            }
            if (e.S0()) {
                e.close();
                return null;
            }
            long z0 = e.z0();
            long timestamp = localMessageRef.getTimestamp();
            o1b0 o1b0Var = this.a;
            if (timestamp == 0) {
                if (z0 != -1) {
                    o1b0Var.getClass();
                    serverMessageRef2 = new ServerMessageRef(o1b0Var.b, z0);
                }
                e.close();
                return serverMessageRef2;
            }
            if (e.U() != localMessageRef.getTimestamp()) {
                e.close();
                return null;
            }
            if (e.R0()) {
                Long B = e.B();
                if (B == null) {
                    throw new IllegalStateException();
                }
                long longValue = B.longValue();
                o1b0Var.getClass();
                serverMessageRef = new ServerMessageRef(o1b0Var.b, longValue);
            } else {
                o1b0Var.getClass();
                serverMessageRef = new ServerMessageRef(o1b0Var.b, z0);
            }
            e.close();
            return serverMessageRef;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(e, th);
                throw th2;
            }
        }
    }
}
