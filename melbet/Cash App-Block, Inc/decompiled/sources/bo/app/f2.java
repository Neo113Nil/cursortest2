package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class f2 {
    public final r7 a;
    public final ue b;
    public final xa c;
    public boolean d;

    public f2(Context context, r7 r7Var, ue ueVar) {
        context.getClass();
        r7Var.getClass();
        ueVar.getClass();
        this.a = r7Var;
        this.b = ueVar;
        this.c = new xa(context);
    }

    public static final String c() {
        return "Publishing new messaging session event.";
    }

    public static final String d() {
        return "Messaging session not started.";
    }

    public final boolean a() {
        long s = this.b.s();
        if (s == -1 || this.d) {
            return false;
        }
        Long readLong = this.c.readLong(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, -1L);
        long longValue = readLong != null ? readLong.longValue() : -1L;
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new f2$$ExternalSyntheticLambda3(0, s, nowInSeconds, longValue), 7, (Object) null);
        return s + longValue < nowInSeconds;
    }

    public final void b() {
        if (!a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda0(1), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(29), 7, (Object) null);
        this.a.b(ya.a, ya.class);
        this.d = true;
    }

    public final void e() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(nowInSeconds, 3), 7, (Object) null);
        this.c.writeData(DataStoreKey.MESSAGING_SESSION_END_TIMESTAMP, Long.valueOf(nowInSeconds));
        this.d = false;
    }

    public static final String a(long j, long j2, long j3) {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Messaging session timeout: ", ", current diff: ");
        m1149m.append(j2 - j3);
        return m1149m.toString();
    }

    public static final String a(long j) {
        return Recorder$$ExternalSyntheticOutline2.m(j, "Messaging session stopped. Adding new messaging session timestamp: ");
    }
}
