package j0;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.x2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f3404a = new x2(k.f3386h);

    /* renamed from: b, reason: collision with root package name */
    public static final x2 f3405b = new x2(k.f3387i);

    public static final long a(j jVar, long j3) {
        long j6 = jVar.f3355a;
        long j10 = jVar.f3371q;
        if (f1.q.c(j3, j6)) {
            return jVar.f3356b;
        }
        if (f1.q.c(j3, jVar.f3360f)) {
            return jVar.f3361g;
        }
        if (f1.q.c(j3, jVar.f3364j)) {
            return jVar.f3365k;
        }
        if (f1.q.c(j3, jVar.f3368n)) {
            return jVar.f3369o;
        }
        if (f1.q.c(j3, jVar.f3377w)) {
            return jVar.f3378x;
        }
        if (f1.q.c(j3, jVar.f3357c)) {
            return jVar.f3358d;
        }
        if (f1.q.c(j3, jVar.f3362h)) {
            return jVar.f3363i;
        }
        if (f1.q.c(j3, jVar.f3366l)) {
            return jVar.f3367m;
        }
        if (f1.q.c(j3, jVar.f3379y)) {
            return jVar.f3380z;
        }
        if (f1.q.c(j3, jVar.f3375u)) {
            return jVar.f3376v;
        }
        if (f1.q.c(j3, jVar.f3370p)) {
            return j10;
        }
        if (f1.q.c(j3, jVar.f3372r)) {
            return jVar.f3373s;
        }
        if (f1.q.c(j3, jVar.D)) {
            return j10;
        }
        if (f1.q.c(j3, jVar.F)) {
            return j10;
        }
        if (f1.q.c(j3, jVar.G)) {
            return j10;
        }
        if (f1.q.c(j3, jVar.H)) {
            return j10;
        }
        if (f1.q.c(j3, jVar.I)) {
            return j10;
        }
        if (f1.q.c(j3, jVar.J)) {
            return j10;
        }
        int i10 = f1.q.f2284i;
        return f1.q.f2283h;
    }

    public static final long b(long j3, m0.r rVar) {
        rVar.X(-1680936624);
        long a6 = a((j) rVar.j(f3404a), j3);
        if (a6 == 16) {
            a6 = ((f1.q) rVar.j(n.f3409a)).f2285a;
        }
        rVar.q(false);
        return a6;
    }

    public static final long c(j jVar, int i10) {
        switch (v.f.d(i10)) {
            case 0:
                return jVar.f3368n;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return jVar.f3377w;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return jVar.f3379y;
            case 3:
                return jVar.f3376v;
            case 4:
                return jVar.f3359e;
            case 5:
                return jVar.f3375u;
            case 6:
                return jVar.f3369o;
            case 7:
                return jVar.f3378x;
            case 8:
                return jVar.f3380z;
            case 9:
                return jVar.f3356b;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return jVar.f3358d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                return f1.q.f2283h;
            case 13:
                return jVar.f3361g;
            case 14:
                return jVar.f3363i;
            case 17:
                return jVar.f3371q;
            case 18:
                return jVar.f3373s;
            case 19:
                return jVar.f3365k;
            case 20:
                return jVar.f3367m;
            case 23:
                return jVar.A;
            case 24:
                return jVar.B;
            case 25:
                return jVar.f3355a;
            case 26:
                return jVar.f3357c;
            case 29:
                return jVar.C;
            case 30:
                return jVar.f3360f;
            case 31:
                return jVar.f3362h;
            case 34:
                return jVar.f3370p;
            case 35:
                return jVar.D;
            case 36:
                return jVar.F;
            case 37:
                return jVar.G;
            case 38:
                return jVar.H;
            case 39:
                return jVar.I;
            case 40:
                return jVar.J;
            case 41:
                return jVar.E;
            case 42:
                return jVar.f3374t;
            case 43:
                return jVar.f3372r;
            case 44:
                return jVar.f3364j;
            case 45:
                return jVar.f3366l;
        }
    }
}
