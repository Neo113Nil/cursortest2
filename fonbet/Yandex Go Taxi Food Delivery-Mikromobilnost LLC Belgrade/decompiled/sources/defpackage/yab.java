package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.ModeratedOutMessageData;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.entities.ReplyData;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TechMeetingStartedMessage;
import com.yandex.messaging.internal.entities.UnsupportedMessageData;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.b;
import org.json.JSONArray;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public final class yab implements Closeable, Iterable, xfx {
    public static final i3y B = a.a(new eua(18));
    public final SparseArray A = new SparseArray();
    public final Cursor a;
    public final long b;
    public x22 c;
    public final JsonAdapter w;
    public final JsonAdapter x;
    public final JsonAdapter y;
    public final JsonAdapter z;

    public yab(Cursor cursor, Moshi moshi, long j) {
        this.a = cursor;
        this.b = j;
        this.w = moshi.adapter(MessageData.class);
        this.x = moshi.adapter(CustomPayload.class);
        this.y = moshi.adapter(ReplyData.class);
        this.z = moshi.adapter(NotificationMeta.class);
    }

    public final ArrayList A0() {
        Object valueOf;
        String str;
        Cursor cursor = this.a;
        if (cursor.isNull(27)) {
            str = null;
        } else {
            g0c a = qoi0.a(String.class);
            if (a.equals(qoi0.a(String.class))) {
                valueOf = cursor.getString(27);
            } else if (a.equals(qoi0.a(Long.TYPE))) {
                valueOf = Long.valueOf(cursor.getLong(27));
            } else if (a.equals(qoi0.a(Integer.TYPE))) {
                valueOf = Integer.valueOf(cursor.getInt(27));
            } else if (a.equals(qoi0.a(Short.TYPE))) {
                valueOf = Short.valueOf(cursor.getShort(27));
            } else if (a.equals(qoi0.a(Float.TYPE))) {
                valueOf = Float.valueOf(cursor.getFloat(27));
            } else if (a.equals(qoi0.a(Double.TYPE))) {
                valueOf = Double.valueOf(cursor.getDouble(27));
            } else if (a.equals(qoi0.a(byte[].class))) {
                valueOf = cursor.getBlob(27);
            } else {
                if (!a.equals(qoi0.a(Boolean.TYPE))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return null;
                }
                valueOf = Boolean.valueOf(cursor.getInt(27) != 0);
            }
            str = (String) valueOf;
        }
        if (str == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.get(i));
        }
        return arrayList;
    }

    public final Long B() {
        Cursor cursor = this.a;
        if (cursor.isNull(10)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(10));
    }

    public final Long D0() {
        if (R0()) {
            Long B2 = B();
            if (B2 != null) {
                return B2;
            }
            ny61.t("must not be null for forwards");
            return null;
        }
        if (Q0()) {
            return Long.valueOf(k0());
        }
        if (z0() == -1) {
            return null;
        }
        return Long.valueOf(z0());
    }

    public final wab F0() {
        Object valueOf;
        String str;
        Object valueOf2;
        String str2;
        Object valueOf3;
        String str3;
        Cursor cursor = this.a;
        boolean isNull = cursor.isNull(23);
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Short.TYPE;
        Class cls5 = Integer.TYPE;
        Class cls6 = Long.TYPE;
        if (isNull) {
            str = null;
        } else {
            g0c a = qoi0.a(String.class);
            if (a.equals(qoi0.a(String.class))) {
                valueOf = cursor.getString(23);
            } else if (a.equals(qoi0.a(cls6))) {
                valueOf = Long.valueOf(cursor.getLong(23));
            } else if (a.equals(qoi0.a(cls5))) {
                valueOf = Integer.valueOf(cursor.getInt(23));
            } else if (a.equals(qoi0.a(cls4))) {
                valueOf = Short.valueOf(cursor.getShort(23));
            } else if (a.equals(qoi0.a(cls3))) {
                valueOf = Float.valueOf(cursor.getFloat(23));
            } else if (a.equals(qoi0.a(cls2))) {
                valueOf = Double.valueOf(cursor.getDouble(23));
            } else if (a.equals(qoi0.a(byte[].class))) {
                valueOf = cursor.getBlob(23);
            } else {
                if (!a.equals(qoi0.a(cls))) {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                    return null;
                }
                valueOf = Boolean.valueOf(cursor.getInt(23) != 0);
            }
            str = (String) valueOf;
        }
        if (str != null) {
            if (cursor.isNull(22)) {
                str2 = null;
            } else {
                g0c a2 = qoi0.a(String.class);
                if (a2.equals(qoi0.a(String.class))) {
                    valueOf2 = cursor.getString(22);
                } else if (a2.equals(qoi0.a(cls6))) {
                    valueOf2 = Long.valueOf(cursor.getLong(22));
                } else if (a2.equals(qoi0.a(cls5))) {
                    valueOf2 = Integer.valueOf(cursor.getInt(22));
                } else if (a2.equals(qoi0.a(cls4))) {
                    valueOf2 = Short.valueOf(cursor.getShort(22));
                } else if (a2.equals(qoi0.a(cls3))) {
                    valueOf2 = Float.valueOf(cursor.getFloat(22));
                } else if (a2.equals(qoi0.a(cls2))) {
                    valueOf2 = Double.valueOf(cursor.getDouble(22));
                } else if (a2.equals(qoi0.a(byte[].class))) {
                    valueOf2 = cursor.getBlob(22);
                } else if (a2.equals(qoi0.a(cls))) {
                    valueOf2 = Boolean.valueOf(cursor.getInt(22) != 0);
                } else {
                    qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                }
                str2 = (String) valueOf2;
            }
            if (str2 != null) {
                if (cursor.isNull(24)) {
                    str3 = null;
                } else {
                    g0c a3 = qoi0.a(String.class);
                    if (a3.equals(qoi0.a(String.class))) {
                        valueOf3 = cursor.getString(24);
                    } else if (a3.equals(qoi0.a(cls6))) {
                        valueOf3 = Long.valueOf(cursor.getLong(24));
                    } else if (a3.equals(qoi0.a(cls5))) {
                        valueOf3 = Integer.valueOf(cursor.getInt(24));
                    } else if (a3.equals(qoi0.a(cls4))) {
                        valueOf3 = Short.valueOf(cursor.getShort(24));
                    } else if (a3.equals(qoi0.a(cls3))) {
                        valueOf3 = Float.valueOf(cursor.getFloat(24));
                    } else if (a3.equals(qoi0.a(cls2))) {
                        valueOf3 = Double.valueOf(cursor.getDouble(24));
                    } else if (a3.equals(qoi0.a(byte[].class))) {
                        valueOf3 = cursor.getBlob(24);
                    } else {
                        if (!a3.equals(qoi0.a(cls))) {
                            qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                            return null;
                        }
                        valueOf3 = Boolean.valueOf(cursor.getInt(24) != 0);
                    }
                    str3 = (String) valueOf3;
                }
                if (str3 != null) {
                    return new wab(str2, str, str3);
                }
            }
        }
        return null;
    }

    public final long G() {
        return this.a.getLong(1);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final defpackage.r3z I() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yab.I():r3z");
    }

    public final LocalMessageRef P() {
        if (!S0()) {
            if (!W0()) {
                t3z t3zVar = LocalMessageRef.Companion;
                String W = W();
                t3zVar.getClass();
                return t3z.b(W);
            }
            Cursor cursor = this.a;
            long j = cursor.getLong(0);
            long j2 = j > ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET ? 0L : j;
            if (R0()) {
                String string = cursor.getString(14);
                t3z t3zVar2 = LocalMessageRef.Companion;
                Long B2 = B();
                t3zVar2.getClass();
                z83.h(null, j2 > 0);
                return new LocalMessageRef(j2, null, string, B2);
            }
            if (j2 > 0) {
                LocalMessageRef.Companion.getClass();
                return t3z.a(j2);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r5 == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P0() {
        if (n() || !R0()) {
            return true;
        }
        Long B2 = B();
        boolean z = false;
        if (B2 != null) {
            long longValue = B2.longValue();
            if (longValue - U() == 1) {
                Cursor cursor = this.a;
                if (!cursor.isLast()) {
                    moveToNext();
                    long U = U();
                    moveToPrevious();
                }
                if (!cursor.isFirst()) {
                    moveToPrevious();
                    long U2 = U();
                    moveToNext();
                }
                return !z;
            }
        }
        return false;
    }

    public final boolean Q0() {
        return wkb1.k(this.a.getLong(2), PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH);
    }

    public final MessageData R() {
        Cursor cursor = this.a;
        if (cursor.isNull(5)) {
            ny61.r("Check failed.");
            return null;
        }
        int position = cursor.getPosition();
        SparseArray sparseArray = this.A;
        MessageData messageData = (MessageData) sparseArray.get(position);
        if (messageData == null) {
            try {
                messageData = (MessageData) this.w.fromJson(cursor.getString(5));
                sparseArray.put(position, messageData);
            } catch (IOException e) {
                ny61.j(e);
                return null;
            }
        }
        return messageData;
    }

    public final boolean R0() {
        return wkb1.k(this.a.getLong(2), 32L);
    }

    public final boolean S0() {
        Integer a0 = a0();
        if (a0 != null) {
            return a0.intValue() == -1 || a0.intValue() == -3;
        }
        return false;
    }

    public final Date T() {
        return W0() ? new Date(Math.round(Z() * 1000.0d)) : new Date();
    }

    public final long U() {
        return this.a.getLong(0);
    }

    public final String W() {
        return this.a.getString(7);
    }

    public final boolean W0() {
        return this.a.getLong(0) < ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET;
    }

    public final double Z() {
        return this.a.getDouble(3);
    }

    public final String a() {
        Cursor cursor = this.a;
        String string = cursor.isNull(16) ? null : cursor.getString(16);
        return string == null ? cursor.getString(4) : string;
    }

    public final Integer a0() {
        Cursor cursor = this.a;
        if (cursor.isNull(18)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(18));
    }

    public final boolean a1() {
        return (this.a.getLong(2) & 1) == 1;
    }

    public final boolean b1() {
        return wkb1.k(this.a.getLong(2), PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    public final boolean c1() {
        int intValue;
        Integer a0 = a0();
        return a0 != null && (intValue = a0.intValue()) >= 101 && intValue <= 1000;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String d() {
        Object valueOf;
        g0c a = qoi0.a(String.class);
        boolean equals = a.equals(qoi0.a(String.class));
        Cursor cursor = this.a;
        if (equals) {
            valueOf = cursor.getString(21);
        } else if (a.equals(qoi0.a(Long.TYPE))) {
            valueOf = Long.valueOf(cursor.getLong(21));
        } else if (a.equals(qoi0.a(Integer.TYPE))) {
            valueOf = Integer.valueOf(cursor.getInt(21));
        } else if (a.equals(qoi0.a(Short.TYPE))) {
            valueOf = Short.valueOf(cursor.getShort(21));
        } else if (a.equals(qoi0.a(Float.TYPE))) {
            valueOf = Float.valueOf(cursor.getFloat(21));
        } else if (a.equals(qoi0.a(Double.TYPE))) {
            valueOf = Double.valueOf(cursor.getDouble(21));
        } else if (a.equals(qoi0.a(byte[].class))) {
            valueOf = cursor.getBlob(21);
        } else {
            if (!a.equals(qoi0.a(Boolean.TYPE))) {
                qir.p(g8e.o("No mapping defined for class ", qoi0.a(String.class).c()));
                return null;
            }
            valueOf = Boolean.valueOf(cursor.getInt(21) != 0);
        }
        return (String) valueOf;
    }

    public final Object d1(tls tlsVar) {
        Cursor cursor = this.a;
        SQLiteCursor sQLiteCursor = cursor instanceof SQLiteCursor ? (SQLiteCursor) cursor : null;
        CursorWindow window = sQLiteCursor != null ? sQLiteCursor.getWindow() : null;
        Integer valueOf = window != null ? Integer.valueOf(window.getStartPosition()) : null;
        Integer valueOf2 = window != null ? Integer.valueOf(window.getNumRows()) : null;
        int position = cursor.getPosition();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object invoke = tlsVar.invoke(this);
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 > 3000) {
            SQLiteCursor sQLiteCursor2 = cursor instanceof SQLiteCursor ? (SQLiteCursor) cursor : null;
            CursorWindow window2 = sQLiteCursor2 != null ? sQLiteCursor2.getWindow() : null;
            Integer valueOf3 = window2 != null ? Integer.valueOf(window2.getStartPosition()) : null;
            Integer valueOf4 = window2 != null ? Integer.valueOf(window2.getNumRows()) : null;
            x22 x22Var = this.c;
            if (x22Var != null) {
                x22Var.reportEvent("tech_cursor_slow", b.i(new Pair("is_main_thread", Boolean.valueOf(jl40.l(Looper.myLooper(), Looper.getMainLooper()))), new Pair("duration", Long.valueOf(elapsedRealtime2)), new Pair("count", Integer.valueOf(cursor.getCount())), new Pair("window_size", Integer.valueOf(((Number) B.getValue()).intValue())), new Pair("from_position", Integer.valueOf(position)), new Pair("to_position", Integer.valueOf(cursor.getPosition())), new Pair("from_window_offset", valueOf), new Pair("from_window_count", valueOf2), new Pair("to_window_offset", valueOf3), new Pair("to_window_count", valueOf4)));
            }
        }
        return invoke;
    }

    public final CustomPayload e() {
        Cursor cursor = this.a;
        if (cursor.isNull(6)) {
            return null;
        }
        try {
            return (CustomPayload) this.x.fromJson(cursor.getString(6));
        } catch (IOException e) {
            ny61.j(e);
            return null;
        }
    }

    public final NotificationMeta e0() {
        Cursor cursor = this.a;
        if (cursor.isNull(19)) {
            return null;
        }
        try {
            return (NotificationMeta) this.z.fromJson(cursor.getString(19));
        } catch (IOException unused) {
            return null;
        }
    }

    public final String f0() {
        Cursor cursor = this.a;
        if (cursor.isNull(14)) {
            return null;
        }
        return cursor.getString(14);
    }

    public final Long g0() {
        Cursor cursor = this.a;
        if (cursor.isNull(15)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(15));
    }

    public final int getCount() {
        return ((Number) d1(new rfa(15))).intValue();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xab(this);
    }

    public final String k() {
        Cursor cursor = this.a;
        if (cursor.isNull(9)) {
            return null;
        }
        return cursor.getString(9);
    }

    public final long k0() {
        return this.a.getLong(12);
    }

    public final ii60 l1(zab zabVar) {
        in21 a;
        li60 li60Var = (li60) zabVar;
        Context context = li60Var.c;
        at2 at2Var = li60Var.f;
        boolean z = li60Var.a;
        h3y h3yVar = li60Var.m;
        MessageData R = R();
        if (!(R instanceof RemovedMessageData) && !(R instanceof ModeratedOutMessageData)) {
            if (R instanceof UnsupportedMessageData) {
                o421 o421Var = (o421) li60Var.j.get();
                o421Var.b.post(new bh11(5, o421Var));
                MessageData R2 = R();
                if (!vkb1.f(R2, ((tqq0) h3yVar.get()).c) && ((!z || R2.notificationBehaviour == 2) && (a = at2Var.a().a(a())) != null)) {
                    return new ii60(context.getString(oyh0.messenger_chat_unsupported_message_text, a.a), U(), T().getTime(), R2.type, "", " ", null, R2, null, false, false, false, R2.notificationBehaviour == 3, HProv.ALG_TYPE_GR3410);
                }
            } else {
                if (!(R instanceof TechBaseMessage)) {
                    if (R instanceof MediaMessageData) {
                        boolean a1 = a1();
                        pe10 pe10Var = li60Var.h;
                        return a1 ? li60Var.c(this, pe10Var) : li60Var.b(this, pe10Var);
                    }
                    boolean a12 = a1();
                    poc pocVar = li60Var.i;
                    return a12 ? li60Var.c(this, pocVar) : li60Var.b(this, pocVar);
                }
                TechBaseMessage techBaseMessage = (TechBaseMessage) R;
                if (a1() || vkb1.f(techBaseMessage, ((tqq0) h3yVar.get()).c) || (z && techBaseMessage.notificationBehaviour != 2)) {
                    return null;
                }
                String str = techBaseMessage.initiator;
                String a2 = li60Var.a(at2Var.a().a(str), null);
                String str2 = (String) techBaseMessage.a(new hcy0(context, li60Var.l, a2));
                if (str2 != null) {
                    return new ii60(str2, U(), T().getTime(), techBaseMessage.type, str, a2, null, techBaseMessage, null, (techBaseMessage instanceof TechMeetingStartedMessage) || (techBaseMessage instanceof TechPersonalMeetingEndedMessage), false, false, techBaseMessage.notificationBehaviour == 3, HProv.ALG_TYPE_SECURECHANNEL);
                }
            }
        }
        return null;
    }

    public final boolean moveToFirst() {
        return ((Boolean) d1(new rfa(17))).booleanValue();
    }

    public final boolean moveToNext() {
        return ((Boolean) d1(new rfa(16))).booleanValue();
    }

    public final boolean moveToPosition(int i) {
        return ((Boolean) d1(new ii8(i, 1))).booleanValue();
    }

    public final boolean moveToPrevious() {
        return ((Boolean) d1(new rfa(19))).booleanValue();
    }

    public final boolean n() {
        return wkb1.k(this.a.getLong(2), 512L);
    }

    public final ReplyData n0() {
        Cursor cursor = this.a;
        if (cursor.isNull(8)) {
            return null;
        }
        try {
            return (ReplyData) this.y.fromJson(cursor.getString(8));
        } catch (IOException unused) {
            return null;
        }
    }

    public final mbz0 o() {
        Long D0 = D0();
        if (D0 == null) {
            return lbz0.a;
        }
        if (R0()) {
            D0 = B();
        }
        return new kbz0(D0.longValue(), k0());
    }

    public final ServerMessageRef q0() {
        long w0 = w0();
        if (w0 > 0) {
            return new ServerMessageRef(d(), w0);
        }
        return null;
    }

    public final ServerMessageRef v0() {
        Long D0 = D0();
        if (D0 != null) {
            ServerMessageRef serverMessageRef = new ServerMessageRef(d(), D0.longValue());
            if (!Q0()) {
                return serverMessageRef;
            }
        }
        return null;
    }

    public final long w0() {
        if (R0() || S0() || !W0()) {
            return 0L;
        }
        long j = this.a.getLong(0);
        if (j > ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET) {
            return 0L;
        }
        return j;
    }

    public final ServerMessageRef x0() {
        long z0 = z0();
        if (z0 > 0) {
            return new ServerMessageRef(d(), z0);
        }
        return null;
    }

    public final long z0() {
        long j = this.a.getLong(0);
        if (j <= 0 || j >= ServerMessageRef.OUTGOING_HISTORY_ID_OFFSET) {
            return -1L;
        }
        return j;
    }
}
