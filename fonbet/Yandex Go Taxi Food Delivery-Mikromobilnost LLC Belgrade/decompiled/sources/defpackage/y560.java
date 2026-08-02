package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import androidx.room.util.a;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.RateLimit;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.AddresseeType;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.entities.ImageMessageData;
import com.yandex.messaging.internal.entities.MediaMessageData;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class y560 extends ree0 {
    public final /* synthetic */ e7b A;
    public long a;
    public long b;
    public long c;
    public final /* synthetic */ m w;
    public final /* synthetic */ PlainMessage x;
    public final /* synthetic */ yw80 y;
    public final /* synthetic */ String z;

    public y560(m mVar, PlainMessage plainMessage, yw80 yw80Var, String str, e7b e7bVar) {
        this.w = mVar;
        this.x = plainMessage;
        this.y = yw80Var;
        this.z = str;
        this.A = e7bVar;
    }

    @Override // defpackage.o5t0
    public final void a() {
        this.c = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        ((jwa0) ((h3y) this.w.f).get()).getClass();
        this.a = SystemClock.elapsedRealtime();
        return new ClientMessage(null, null, null, this.x, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this.y.j ? 3 : 0, false, 201326583, null);
    }

    @Override // defpackage.o5t0
    public final void d() {
        this.b = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ree0
    public final boolean f(PostMessageResponse postMessageResponse) {
        boolean z;
        m mVar = this.w;
        oab oabVar = (oab) mVar.c;
        naz0 naz0Var = (naz0) mVar.a;
        int i = postMessageResponse.status;
        boolean z2 = i == 19 || i == 20;
        RateLimit rateLimit = postMessageResponse.rateLimit;
        long j = rateLimit != null ? rateLimit.waitFor : 0L;
        ((f7i0) mVar.e).a(j);
        int i2 = postMessageResponse.status;
        boolean z3 = i2 == 23;
        boolean z4 = i2 == 8;
        e7b e7bVar = this.A;
        if (z3) {
            e7bVar.a(((Number) ((HashMap) mVar.j).get(Integer.valueOf(i2))).intValue());
            ((doc) mVar.h).a(postMessageResponse.status, j, "rate_limit", this.z, naz0Var.a.b);
            ((x22) mVar.g).f("rate limiter msg sent", "chat_id", naz0Var.a.b, "wait_for", Long.valueOf(j));
            return true;
        }
        if (z4) {
            i7b i7bVar = e7bVar.a;
            t3z t3zVar = LocalMessageRef.Companion;
            String str = e7bVar.b.a;
            t3zVar.getClass();
            i7bVar.b(t3z.b(str));
            i7b.a(i7bVar, e7bVar.c);
            ((qsa0) e7bVar.d).b();
            ((doc) mVar.h).a(postMessageResponse.status, j, "duplicate", this.z, naz0Var.a.b);
            ((x22) mVar.g).f("duplicate msg sent", "chat_id", naz0Var.a.b, "wait_for", Long.valueOf(j));
            return true;
        }
        String str2 = this.z;
        if (z2) {
            ((rj21) mVar.d).a(i2);
            z83.g(null, oabVar.c, Looper.myLooper());
            oabVar.O.remove(str2);
            e7bVar.a(2);
            return true;
        }
        String str3 = naz0Var.a.b;
        z83.g(null, oabVar.c, Looper.myLooper());
        HashMap hashMap = oabVar.O;
        Integer num = (Integer) hashMap.get(str2);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue < 2) {
            hashMap.put(str2, Integer.valueOf(intValue + 1));
            return false;
        }
        et10 et10Var = oabVar.y;
        z83.g(null, et10Var.c, Looper.myLooper());
        et10Var.d.a(i2, 0L, "unrecoverable_error", str2, str3);
        et10Var.b.add(str2);
        zq60 zq60Var = et10Var.a;
        zq60Var.getClass();
        ArrayList arrayList = zq60Var.a;
        zq60Var.b++;
        int size = arrayList.size();
        int i3 = 0;
        boolean z5 = false;
        while (true) {
            int i4 = i3;
            while (i4 < size && arrayList.get(i4) == null) {
                i4++;
            }
            if (i4 < size) {
                z = true;
            } else {
                if (!z5) {
                    zq60.a(zq60Var);
                    z5 = true;
                }
                z = false;
            }
            if (!z) {
                return true;
            }
            while (i3 < size && arrayList.get(i3) == null) {
                i3++;
            }
            if (i3 >= size) {
                if (!z5) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return false;
            }
            int i5 = i3 + 1;
            dt10 dt10Var = (dt10) arrayList.get(i3);
            z83.g(null, dt10Var.c.c, Looper.myLooper());
            if (str2.equals(dt10Var.a)) {
                gt10 gt10Var = dt10Var.b;
                z83.g(null, (Looper) gt10Var.w.c, Looper.myLooper());
                gt10Var.b.post(new ft10(gt10Var, 0));
            }
            i3 = i5;
        }
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        boolean z;
        Object obj;
        yab yabVar;
        e7b e7bVar;
        vv10 vv10Var;
        k020 k020Var;
        m mVar = this.w;
        ((jwa0) ((h3y) mVar.f).get()).a(this.a, "time2ack_plain");
        ((x22) mVar.g).h("msg time 2 ack", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - this.a), "response_diff", Long.valueOf(this.b - this.a), "parse_diff", Long.valueOf(this.c - this.a));
        RateLimit rateLimit = postMessageResponse.rateLimit;
        ((f7i0) mVar.e).a(rateLimit != null ? rateLimit.waitFor : 0L);
        oab oabVar = (oab) mVar.c;
        z83.g(null, oabVar.c, Looper.myLooper());
        HashMap hashMap = oabVar.O;
        String str = this.z;
        hashMap.remove(str);
        et10 et10Var = oabVar.y;
        z83.g(null, et10Var.c, Looper.myLooper());
        et10Var.b.remove(str);
        zq60 zq60Var = et10Var.a;
        zq60Var.getClass();
        ArrayList arrayList = zq60Var.a;
        zq60Var.b++;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                ShortMessageInfo shortMessageInfo = postMessageResponse.messageInfo;
                e7b e7bVar2 = this.A;
                yw80 yw80Var = e7bVar2.b;
                i7b i7bVar = e7bVar2.a;
                vv10 vv10Var2 = i7bVar.i;
                if (shortMessageInfo != null) {
                    t3z t3zVar = LocalMessageRef.Companion;
                    String str2 = yw80Var.a;
                    t3zVar.getClass();
                    LocalMessageRef b = t3z.b(str2);
                    x22 x22Var = vv10Var2.a;
                    o1b0 o1b0Var = i7bVar.b;
                    String str3 = o1b0Var.b;
                    k020 k020Var2 = i7bVar.c;
                    String messageId = b.getMessageId();
                    if (messageId == null) {
                        ny61.g("messageId cannot be null");
                        return;
                    }
                    long j = o1b0Var.a;
                    at2 at2Var = k020Var2.b;
                    at2 at2Var2 = k020Var2.b;
                    int intValue = ((Number) a.b(at2Var.b().a, true, false, new qo6(j, messageId, 11))).intValue();
                    if (intValue > 1) {
                        x22Var.reportEvent("tech_illegal_state_messageId_not_unique", b.i(new Pair("chat id", str3), new Pair("count", Integer.valueOf(intValue))));
                    }
                    if (((Boolean) a.b(at2Var2.b().a, true, false, new qo6(j, messageId, 13))).booleanValue()) {
                        obj = "chat id";
                        yab i3 = alb1.i(at2Var2.B(), (Moshi) k020Var2.h.get(), j, new ServerMessageRef(shortMessageInfo.timestamp, null, 2, null).getTimestamp());
                        try {
                            if (!i3.moveToNext() || jl40.l(i3.W(), messageId)) {
                                e7bVar = e7bVar2;
                                vv10Var = vv10Var2;
                                yabVar = i3;
                                k020Var = k020Var2;
                            } else {
                                k020Var = k020Var2;
                                yabVar = i3;
                                try {
                                    e7bVar = e7bVar2;
                                    vv10Var = vv10Var2;
                                    x22Var.reportEvent("tech_illegal_state_timestamp_not_unique", b.i(new Pair(obj, str3), new Pair("messageId1", yabVar.W()), new Pair("messageId2", messageId), new Pair("count", Integer.valueOf(yabVar.getCount()))));
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ooc.g(yabVar, th2);
                                        throw th3;
                                    }
                                }
                            }
                            yabVar.close();
                        } catch (Throwable th4) {
                            th = th4;
                            yabVar = i3;
                        }
                    } else {
                        obj = "chat id";
                        e7bVar = e7bVar2;
                        vv10Var = vv10Var2;
                        k020Var = k020Var2;
                    }
                    l020 C = k020Var.C();
                    try {
                        boolean o = C.o(j, messageId, shortMessageInfo);
                        C.s();
                        C.close();
                        MessageData messageData = yw80Var.b;
                        if ((o && (messageData instanceof MediaMessageData)) || (messageData instanceof ImageMessageData) || (messageData instanceof GalleryMessageData)) {
                            ((MediaMessageData) messageData).a(new b7b(i7bVar, shortMessageInfo));
                        }
                        j3b j3bVar = i7bVar.y;
                        String str4 = j3bVar.N;
                        String str5 = j3bVar.e;
                        long j2 = shortMessageInfo.seqNo;
                        boolean z3 = yw80Var.i;
                        boolean z4 = i7bVar.z;
                        Map a = yw80Var.h.a();
                        Pair pair = new Pair(obj, str3);
                        Pair pair2 = new Pair("chat type", str4);
                        Pair pair3 = new Pair("addressee id", str5);
                        Pair pair4 = new Pair("n", Long.valueOf(j2));
                        Pair pair5 = new Pair("important", Boolean.valueOf(z3));
                        Pair pair6 = new Pair("muted", Boolean.valueOf(yw80Var.j));
                        AddresseeType.INSTANCE.getClass();
                        vv10Var.a.reportEvent("msg sent", b.n(a, b.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair("addressee type", (z4 ? AddresseeType.CONTACT : AddresseeType.OTHER).getReportName()))));
                        e7bVar2 = e7bVar;
                        i7b.a(i7bVar, e7bVar2.c);
                    } finally {
                    }
                }
                ((qsa0) e7bVar2.d).b();
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            }
            int i4 = i + 1;
            dt10 dt10Var = (dt10) arrayList.get(i);
            z83.g(null, dt10Var.c.c, Looper.myLooper());
            if (str.equals(dt10Var.a)) {
                gt10 gt10Var = dt10Var.b;
                z83.g(null, (Looper) gt10Var.w.c, Looper.myLooper());
                gt10Var.b.post(new ft10(gt10Var, 1));
            }
            i = i4;
        }
    }
}
