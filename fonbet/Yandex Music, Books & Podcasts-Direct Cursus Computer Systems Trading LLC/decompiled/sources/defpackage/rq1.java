package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.pulse.metrics.o;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rq1 extends uif implements Function1 {
    public static final rq1 A;
    public static final rq1 A0;
    public static final rq1 B;
    public static final rq1 B0;
    public static final rq1 C;
    public static final rq1 D;
    public static final rq1 E;
    public static final rq1 F;
    public static final rq1 G;
    public static final rq1 H;
    public static final rq1 I;
    public static final rq1 J;
    public static final rq1 K;
    public static final rq1 L;
    public static final rq1 X;
    public static final rq1 Y;
    public static final rq1 Z;
    public static final rq1 s;
    public static final rq1 t;
    public static final rq1 u;
    public static final rq1 v;
    public static final rq1 v0;
    public static final rq1 w;
    public static final rq1 w0;
    public static final rq1 x;
    public static final rq1 x0;
    public static final rq1 y;
    public static final rq1 y0;
    public static final rq1 z;
    public static final rq1 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new rq1(i, 0);
        t = new rq1(i, 1);
        u = new rq1(i, 2);
        v = new rq1(i, 3);
        w = new rq1(i, 4);
        x = new rq1(i, 5);
        y = new rq1(i, 6);
        z = new rq1(i, 7);
        A = new rq1(i, 8);
        B = new rq1(i, 9);
        C = new rq1(i, 10);
        D = new rq1(i, 11);
        E = new rq1(i, 12);
        F = new rq1(i, 13);
        G = new rq1(i, 14);
        H = new rq1(i, 15);
        I = new rq1(i, 16);
        J = new rq1(i, 17);
        K = new rq1(i, 18);
        L = new rq1(i, 19);
        X = new rq1(i, 20);
        Y = new rq1(i, 21);
        Z = new rq1(i, 22);
        v0 = new rq1(i, 23);
        w0 = new rq1(i, 24);
        x0 = new rq1(i, 25);
        y0 = new rq1(i, 26);
        z0 = new rq1(i, 27);
        A0 = new rq1(i, 28);
        B0 = new rq1(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq1(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.r) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                return Float.valueOf(floatValue);
            case 1:
                return Unit.a;
            case 2:
                return (bs1) obj;
            case 3:
                ((cw1) obj).getClass();
                return Unit.a;
            case 4:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                if (yd5.w(r7wVar)) {
                    return nif.c(r7wVar);
                }
                String message = r7wVar.getMessage();
                message.getClass();
                return nif.c(new k03(hrg.q("Mobile backend invalid authorization error: Oauth token exchange failure - \"", message, "\""), 4));
            case 5:
                ((jk2) obj).U0();
                return Unit.a;
            case 6:
                Long l = (Long) obj;
                if (l == null) {
                    return null;
                }
                long longValue = l.longValue();
                if (longValue >= 8388608) {
                    double d = 100;
                    str = String.format(Locale.US, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor((longValue / 8388608.0d) * d) / d)}, 1));
                } else if (longValue >= 8192) {
                    double d2 = 100;
                    str = String.format(Locale.US, "%.2f kB", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor((longValue / 8192.0d) * d2) / d2)}, 1));
                } else if (longValue >= 8) {
                    double d3 = 100;
                    str = String.format(Locale.US, "%.2f B", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor((longValue / 8.0d) * d3) / d3)}, 1));
                } else {
                    str = longValue + " b";
                }
                return str.concat("/s");
            case 7:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                return new et2(b.o("status"), b.g("status_code"), b.g("status_desc"));
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Long.valueOf(((Number) obj).longValue());
            case 11:
                wle wleVar = (wle) obj;
                wleVar.getClass();
                return wleVar.h;
            case 12:
                q1f q1fVar2 = (q1f) obj;
                q1fVar2.getClass();
                y28 y28Var = (y28) bkp.a0(q1fVar2, e27.y0).d();
                z9h b2 = q1fVar2.b();
                return new h13(y28Var.a, y28Var.b, y28Var.c, b2.o("payment_method"), b2.o("trust_payment_id"));
            case 13:
                hi4 hi4Var = (hi4) obj;
                hi4Var.getClass();
                return new qv3(hi4Var.e, hi4Var.f);
            case 14:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                LinkedHashMap linkedHashMap = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar2.getMessage());
                return nif.c(r7wVar2);
            case 15:
                r7w r7wVar3 = (r7w) obj;
                r7wVar3.getClass();
                LinkedHashMap linkedHashMap2 = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar3.getMessage());
                return nif.c(r7wVar3);
            case 16:
                hi4 hi4Var2 = (hi4) obj;
                hi4Var2.getClass();
                String str2 = hi4Var2.i;
                String str3 = hi4Var2.h;
                return Intrinsics.d(str2, "duplicate") ? nif.c(new p1c(q1c.A, r1c.c, null, null, f1d.g("Successful binding of a duplicate token: ", str3))) : nif.d(new ero(hi4Var2.e, str3));
            case 17:
                r7w r7wVar4 = (r7w) obj;
                r7wVar4.getClass();
                LinkedHashMap linkedHashMap3 = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar4.getMessage());
                return nif.c(r7wVar4);
            case 18:
                r7w r7wVar5 = (r7w) obj;
                r7wVar5.getClass();
                LinkedHashMap linkedHashMap4 = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar5.getMessage());
                return nif.c(r7wVar5);
            case 19:
                o0u o0uVar = (o0u) obj;
                o0uVar.getClass();
                String str4 = o0uVar.c;
                return str4 != null ? nif.d(new z0r(str4)) : nif.c(new r7w("Expected deny resend until field in resend code response", null));
            case 20:
                ((cit) obj).getClass();
                return Unit.a;
            case 21:
                o0u o0uVar2 = (o0u) obj;
                o0uVar2.getClass();
                return new p0u(o0uVar2.a.equals("success") ? gro.correct : gro.incorrect, o0uVar2.b);
            case 22:
                ((opf) obj).a();
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                return Unit.a;
            case 25:
                a aVar = (a) obj;
                agr agrVar = AndroidCompositionLocals_androidKt.b;
                aVar.getClass();
                if (((Context) weo.L(aVar, agrVar)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return uh3.b;
                }
                sh3.a.getClass();
                return rh3.c;
            case 26:
                wfp.q((jfp) obj, 0);
                return Unit.a;
            case 27:
                wfp.q((jfp) obj, 0);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            default:
                ((lne) obj).getClass();
                return Unit.a;
        }
    }
}
