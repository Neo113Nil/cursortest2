package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.pulse.metrics.o;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.video.m3.data.StreamType;

/* loaded from: classes.dex */
public final class qs6 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qs6(x0 x0Var, Function0 function0) {
        super(0);
        this.r = 21;
        this.s = x0Var;
        this.t = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r0v111, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r0v32, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jpo jpoVar;
        Long r0;
        y7o y7oVar;
        Charset charset;
        String F;
        Long valueOf;
        switch (this.r) {
            case 0:
                ts6 ts6Var = (ts6) this.s;
                ts6Var.f().execute(new qf0(25, ts6Var, (l7d) this.t));
                return Unit.a;
            case 1:
                ws6 ws6Var = (ws6) this.s;
                Executor executor = ws6Var.e;
                if (executor != null) {
                    executor.execute(new qf0(28, ws6Var, (cr6) this.t));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            case 2:
                dt6 dt6Var = (dt6) this.s;
                Executor executor2 = dt6Var.f;
                if (executor2 != null) {
                    executor2.execute(new ys6(dt6Var, (zq6) this.t, 1));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            case 3:
                dt6 dt6Var2 = (dt6) this.s;
                Executor executor3 = dt6Var2.f;
                if (executor3 != null) {
                    executor3.execute(new qf0(29, dt6Var2, (cs6) this.t));
                    return Unit.a;
                }
                Intrinsics.j("executor");
                throw null;
            case 4:
                new Handler(Looper.getMainLooper()).post(new jt6(6, (DKCardNumberInput) this.s, (j17) this.t));
                return Unit.a;
            case 5:
                g47 g47Var = (g47) this.s;
                bfk bfkVar = (bfk) this.t;
                k1o k1oVar = g47Var.q;
                k1oVar.getClass();
                k1oVar.getClass();
                g47Var.K(new x37(bfkVar));
                return Unit.a;
            case 6:
                g47 g47Var2 = (g47) this.s;
                if (g47Var2.A != null) {
                    g47Var2.K(new v37((jg3) this.t));
                    return Unit.a;
                }
                Intrinsics.j("textProvider");
                throw null;
            case 7:
                ((uif) ((cj3) this.s).d).invoke((oce) this.t);
                return Unit.a;
            case 8:
                x7o x7oVar = (x7o) ((qxp) this.s).a;
                String uri = ((ft7) this.t).a.toString();
                uri.getClass();
                x7oVar.onSuccess(new hn(uri, c5b.a));
                return Unit.a;
            case 9:
                x7o x7oVar2 = (x7o) ((qxp) this.s).a;
                iek iekVar = (iek) this.t;
                iekVar.getClass();
                int ordinal = iekVar.a.ordinal();
                if (ordinal == 0) {
                    jpoVar = jpo.RandomAmount;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    jpoVar = jpo.SmsChallenge;
                }
                jpo jpoVar2 = jpoVar;
                String str = iekVar.b;
                String str2 = iekVar.c;
                String str3 = iekVar.d;
                String str4 = iekVar.g;
                x7oVar2.onSuccess(new in(new kpo(jpoVar2, str, str2, (str4 == null || (r0 = StringsKt.r0(10, str4)) == null) ? (new Date().getTime() / 1000) + 30 : r0.longValue(), str3, iekVar.e, iekVar.f)));
                return Unit.a;
            case 10:
                String str5 = (String) this.s;
                awc awcVar = (awc) this.t;
                File file = new File(str5);
                q6b q6bVar = (q6b) awcVar.a;
                try {
                } catch (Throwable th) {
                    y7oVar = new y7o(null, new mac(hrg.q("Received unexpected error when accessing file item at path: '", str5, "'"), th));
                }
                if (!file.exists()) {
                    return new y7o(null, new mac("File item is missing at path: '" + str5 + "'", (Throwable) null));
                }
                if (file.isDirectory()) {
                    return new y7o(null, new mac("File item at path could not be read: '" + str5 + "'", (Throwable) null));
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                if (im7.a[q6bVar.ordinal()] == 1) {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, RemoteCameraConfig.Notification.ID);
                    try {
                        byte[] N = vnj.N(bufferedInputStream);
                        bufferedInputStream.close();
                        F = Base64.encodeToString(N, 2);
                    } finally {
                    }
                } else {
                    int ordinal2 = q6bVar.ordinal();
                    if (ordinal2 == 0) {
                        charset = StandardCharsets.UTF_8;
                    } else {
                        if (ordinal2 != 1) {
                            throw new x7j();
                        }
                        charset = null;
                    }
                    if (charset == null) {
                        charset = StandardCharsets.UTF_8;
                    }
                    charset.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, charset), RemoteCameraConfig.Notification.ID);
                    try {
                        F = t7g.F(bufferedReader);
                        bufferedReader.close();
                    } finally {
                    }
                }
                y7oVar = new y7o(F, null);
                return y7oVar;
            case 11:
                return ((xo7) this.s).a((e1j) this.t);
            case 12:
                return ((t28) this.s).a.C((b13) this.t, e27.H, p1j.b);
            case 13:
                return ((t28) this.s).a.C((h3j) this.t, e27.K, p1j.b);
            case 14:
                return ((t28) this.s).a.C((frr) this.t, e27.L, p1j.b);
            case 15:
                return ((t28) this.s).a.C((grr) this.t, e27.X, p1j.b);
            case 16:
                return ((t28) this.s).a.C((hrr) this.t, e27.Y, p1j.b);
            case 17:
                return ((t28) this.s).a.C((hrr) this.t, e27.Z, p1j.b);
            case 18:
                return ((t28) this.s).a.C((frr) this.t, e27.v0, p1j.b);
            case 19:
                return ((t28) this.s).a.C((ios) this.t, e27.w0, p1j.b);
            case 20:
                return ((t28) this.s).a.C((bit) this.t, e27.x0, p1j.b);
            case 21:
                ((x0) this.s).b++;
                return (mif) ((uif) this.t).invoke();
            case 22:
                ((View.OnClickListener) this.s).onClick((View) this.t);
                return Unit.a;
            case 23:
                return (Boolean) ((q69) this.s).b.a((xzb) this.t);
            case 24:
                zm9 zm9Var = (zm9) this.s;
                if (zm9Var.b) {
                    xq0.q("Data no longer valid!");
                    return null;
                }
                dn9 dn9Var = (dn9) this.t;
                Cursor cursor = zm9Var.a;
                return new JSONObject(new String(cursor.getBlob(dn9.g(dn9Var, cursor, "raw_json_data")), StandardCharsets.UTF_8));
            case 25:
                ((qu9) this.s).c(((iu9) this.t).h);
                return Unit.a;
            case 26:
                h4b h4bVar = (h4b) this.s;
                zgb zgbVar = (zgb) this.t;
                jhb jhbVar = zgbVar.f;
                Object h = h4bVar.h(jhbVar);
                zgbVar.d(jhbVar.b);
                return h;
            case 27:
                ip3 ip3Var = (ip3) this.s;
                return ip3Var != null ? ip3Var : new hl5((Context) this.t);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new xpb(((aqb) this.s).a, (ip3) this.t);
            default:
                StreamType streamType = (StreamType) this.s;
                StreamType streamType2 = StreamType.Dash;
                crb crbVar = (crb) this.t;
                ExoPlayer exoPlayer = crbVar.a;
                long j = 0;
                if (streamType == streamType2) {
                    Object S0 = exoPlayer.S0();
                    d97 d97Var = S0 instanceof d97 ? (d97) S0 : null;
                    Long valueOf2 = d97Var != null ? Long.valueOf(d97Var.h) : null;
                    valueOf = (valueOf2 == null || valueOf2.longValue() != -9223372036854775807L) ? valueOf2 : null;
                    if (valueOf != null) {
                        j = valueOf.longValue();
                    }
                } else {
                    int R0 = exoPlayer.R0();
                    sis V = exoPlayer.V();
                    if (V.p()) {
                        V = null;
                    }
                    ris m = V != null ? V.m(R0, crbVar.M, 0L) : null;
                    if (m != null) {
                        long j2 = m.f;
                        valueOf = j2 != -9223372036854775807L ? Long.valueOf(j2) : null;
                        if (valueOf != null) {
                            j = valueOf.longValue();
                        }
                    }
                }
                return Long.valueOf(j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs6(int i, Object obj, Object obj2) {
        super(0);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs6(vx6 vx6Var, String str, awc awcVar) {
        super(0);
        this.r = 10;
        this.s = str;
        this.t = awcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs6(qu9 qu9Var, iu9 iu9Var, gc8 gc8Var) {
        super(0);
        this.r = 25;
        this.s = qu9Var;
        this.t = iu9Var;
    }
}
