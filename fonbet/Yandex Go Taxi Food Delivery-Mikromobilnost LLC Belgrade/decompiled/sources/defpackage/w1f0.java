package defpackage;

import com.yandex.go.blockeduser.api.analytics.BlockedReason;
import com.yandex.go.blockeduser.data.c;
import defpackage.owx;
import java.util.Calendar;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes10.dex */
public final class w1f0 implements hwx {
    public final avx a;
    public final pux b;
    public final c c;

    public w1f0(avx avxVar, pux puxVar, c cVar) {
        this.a = avxVar;
        this.b = puxVar;
        this.c = cVar;
    }

    @Override // defpackage.j35
    public final String getName() {
        return "MAIN";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x001c, B:11:0x0026, B:14:0x002d, B:17:0x003f, B:19:0x0055, B:20:0x005c, B:22:0x0060, B:23:0x0062, B:25:0x0070, B:26:0x007b, B:28:0x0085, B:29:0x0095, B:34:0x00e4, B:36:0x00ee, B:37:0x00f3, B:38:0x010c, B:40:0x011e, B:43:0x0125, B:45:0x012f, B:52:0x00f8, B:54:0x00fe, B:56:0x0104, B:57:0x0109), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x001c, B:11:0x0026, B:14:0x002d, B:17:0x003f, B:19:0x0055, B:20:0x005c, B:22:0x0060, B:23:0x0062, B:25:0x0070, B:26:0x007b, B:28:0x0085, B:29:0x0095, B:34:0x00e4, B:36:0x00ee, B:37:0x00f3, B:38:0x010c, B:40:0x011e, B:43:0x0125, B:45:0x012f, B:52:0x00f8, B:54:0x00fe, B:56:0x0104, B:57:0x0109), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x001c, B:11:0x0026, B:14:0x002d, B:17:0x003f, B:19:0x0055, B:20:0x005c, B:22:0x0060, B:23:0x0062, B:25:0x0070, B:26:0x007b, B:28:0x0085, B:29:0x0095, B:34:0x00e4, B:36:0x00ee, B:37:0x00f3, B:38:0x010c, B:40:0x011e, B:43:0x0125, B:45:0x012f, B:52:0x00f8, B:54:0x00fe, B:56:0x0104, B:57:0x0109), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x001c, B:11:0x0026, B:14:0x002d, B:17:0x003f, B:19:0x0055, B:20:0x005c, B:22:0x0060, B:23:0x0062, B:25:0x0070, B:26:0x007b, B:28:0x0085, B:29:0x0095, B:34:0x00e4, B:36:0x00ee, B:37:0x00f3, B:38:0x010c, B:40:0x011e, B:43:0x0125, B:45:0x012f, B:52:0x00f8, B:54:0x00fe, B:56:0x0104, B:57:0x0109), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x001c, B:11:0x0026, B:14:0x002d, B:17:0x003f, B:19:0x0055, B:20:0x005c, B:22:0x0060, B:23:0x0062, B:25:0x0070, B:26:0x007b, B:28:0x0085, B:29:0x0095, B:34:0x00e4, B:36:0x00ee, B:37:0x00f3, B:38:0x010c, B:40:0x011e, B:43:0x0125, B:45:0x012f, B:52:0x00f8, B:54:0x00fe, B:56:0x0104, B:57:0x0109), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:9:0x001c, B:11:0x0026, B:14:0x002d, B:17:0x003f, B:19:0x0055, B:20:0x005c, B:22:0x0060, B:23:0x0062, B:25:0x0070, B:26:0x007b, B:28:0x0085, B:29:0x0095, B:34:0x00e4, B:36:0x00ee, B:37:0x00f3, B:38:0x010c, B:40:0x011e, B:43:0x0125, B:45:0x012f, B:52:0x00f8, B:54:0x00fe, B:56:0x0104, B:57:0x0109), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0093  */
    @Override // defpackage.hwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(owx owxVar) {
        boolean z;
        os00 os00Var;
        Object obj;
        boolean a;
        ru.yandex.taxi.launch.c cVar;
        String Hg;
        dvx dvxVar;
        pux puxVar = this.b;
        puxVar.getClass();
        if (!owxVar.a && owxVar.o) {
            puxVar.a = false;
            r0 r0Var = puxVar.b;
            r0Var.getClass();
            r0Var.m(null, owxVar);
        }
        avx avxVar = this.a;
        synchronized (avxVar) {
            try {
                jst.e.getClass();
                String str = owxVar.g;
                if (str != null && !evu0.J(str) && !str.equals(avxVar.b.Hg())) {
                    z = true;
                    avxVar.d.d(owxVar);
                    avxVar.b.Mg(owxVar);
                    ss00 ss00Var = avxVar.f;
                    os00Var = (os00) owxVar.b(os00.class);
                    if (os00Var == null) {
                        os00.Companion.getClass();
                        os00Var = os00.d;
                    }
                    obj = os00Var.b;
                    if (obj == null) {
                        obj = EmptyList.a;
                    }
                    r0 r0Var2 = ss00Var.a;
                    r0Var2.getClass();
                    r0Var2.m(null, obj);
                    avxVar.i = owxVar.x;
                    if (z) {
                        ((j) avxVar.h).i().i(str);
                    }
                    Calendar b = wf7.b.b(owxVar.e);
                    long timeInMillis = b == null ? b.getTimeInMillis() - Calendar.getInstance().getTimeInMillis() : 0L;
                    owx.f fVar = owxVar.w;
                    yg4 yg4Var = (yg4) avxVar.e.get();
                    yg4Var.getClass();
                    yg4Var.b.setValue(yg4Var, yg4.c[0], Boolean.valueOf(fVar.a));
                    ((cne0) avxVar.g.b).q(timeInMillis, "time_delta");
                    f0t0 f0t0Var = avxVar.c;
                    boolean z2 = owxVar.u;
                    boolean b2 = ((xk60) f0t0Var.b.get()).b();
                    as21 as21Var = f0t0Var.a;
                    boolean a2 = as21Var.a("FIELD_DONT_SMS", false);
                    a = as21Var.a("FIELD_OLD_SETTINGS_LAYOUT", false);
                    boolean z3 = !a;
                    if (a) {
                        as21 as21Var2 = f0t0Var.a;
                        if (z2) {
                            if (!as21Var2.a("FIELD_CHECKED_SMS_EXPERIMENT", false)) {
                                as21Var2.e("FIELD_DONT_SMS", true);
                            }
                            as21Var2.e("FIELD_CHECKED_SMS_EXPERIMENT", true);
                        }
                    } else if (z2 && b2 && !a2) {
                        as21 as21Var3 = f0t0Var.a;
                        if (!as21Var3.a("FIELD_CHECKED_SMS_EXPERIMENT", false)) {
                            as21Var3.e("FIELD_DONT_SMS", true);
                        }
                        as21Var3.e("FIELD_CHECKED_SMS_EXPERIMENT", true);
                        z3 = true;
                    }
                    as21Var.e("FIELD_OLD_SETTINGS_LAYOUT", !z3);
                    cVar = avxVar.a;
                    Hg = avxVar.b.Hg();
                    cVar.getClass();
                    if (Hg != null && !evu0.J(Hg)) {
                        dvxVar = cVar.b.a(Hg);
                        if (dvxVar != null) {
                            r0 r0Var3 = cVar.d;
                            r0Var3.getClass();
                            r0Var3.m(null, dvxVar);
                        }
                    }
                    dvxVar = null;
                    if (dvxVar != null) {
                    }
                }
                z = false;
                avxVar.d.d(owxVar);
                avxVar.b.Mg(owxVar);
                ss00 ss00Var2 = avxVar.f;
                os00Var = (os00) owxVar.b(os00.class);
                if (os00Var == null) {
                }
                obj = os00Var.b;
                if (obj == null) {
                }
                r0 r0Var22 = ss00Var2.a;
                r0Var22.getClass();
                r0Var22.m(null, obj);
                avxVar.i = owxVar.x;
                if (z) {
                }
                Calendar b3 = wf7.b.b(owxVar.e);
                if (b3 == null) {
                }
                owx.f fVar2 = owxVar.w;
                yg4 yg4Var2 = (yg4) avxVar.e.get();
                yg4Var2.getClass();
                yg4Var2.b.setValue(yg4Var2, yg4.c[0], Boolean.valueOf(fVar2.a));
                ((cne0) avxVar.g.b).q(timeInMillis, "time_delta");
                f0t0 f0t0Var2 = avxVar.c;
                boolean z22 = owxVar.u;
                boolean b22 = ((xk60) f0t0Var2.b.get()).b();
                as21 as21Var4 = f0t0Var2.a;
                boolean a22 = as21Var4.a("FIELD_DONT_SMS", false);
                a = as21Var4.a("FIELD_OLD_SETTINGS_LAYOUT", false);
                boolean z32 = !a;
                if (a) {
                }
                as21Var4.e("FIELD_OLD_SETTINGS_LAYOUT", !z32);
                cVar = avxVar.a;
                Hg = avxVar.b.Hg();
                cVar.getClass();
                if (Hg != null) {
                    dvxVar = cVar.b.a(Hg);
                    if (dvxVar != null) {
                    }
                }
                dvxVar = null;
                if (dvxVar != null) {
                }
            } finally {
            }
        }
        this.c.b(bvf0.q(owxVar.n, BlockedReason.LAUNCH_HAS_BLOCKED, null));
    }
}
