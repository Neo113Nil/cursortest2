package defpackage;

import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public abstract class dcc {
    public static final ov6 a = new ov6(0.2f, 0.0f, 0.8f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:33:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Function0 function0, final boolean z, final boolean z2, final yci yciVar, boolean z3, long j, wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        boolean z4;
        int i3;
        long j2;
        int i4;
        int i5;
        long j3;
        Object K;
        kjn kjnVar;
        fk0 fk0Var;
        boolean h;
        Object K2;
        boolean h2;
        Object K3;
        boolean z5;
        final wn5 wn5Var2;
        oq5 oq5Var;
        final long j4;
        xmn r;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(235657457);
        int i6 = (oq5Var2.h(function0) ? 4 : 2) | i | (oq5Var2.g(z) ? 32 : 16);
        if ((i & 384) == 0) {
            i6 |= oq5Var2.g(z2) ? 256 : 128;
        }
        int i7 = i6 | (oq5Var2.f(yciVar) ? 2048 : 1024);
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i7 | 24576;
            z4 = z3;
        } else {
            z4 = z3;
            i3 = i7 | (oq5Var2.g(z4) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        if ((i2 & 32) == 0) {
            j2 = j;
            if (oq5Var2.e(j2)) {
                i4 = SQLiteDatabase.OPEN_SHAREDCACHE;
                i5 = i3 | i4;
                if ((599187 & i5) == 599186 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i & 1) != 0 || oq5Var2.y()) {
                        if (i8 != 0) {
                            z4 = true;
                        }
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                            j3 = ((dq0) oq5Var2.j(eq0.a)).d.c;
                            oq5Var2.q();
                            K = oq5Var2.K();
                            kjnVar = gq5.a;
                            if (K == kjnVar) {
                                K = vq2.a(1.0f);
                                oq5Var2.k0(K);
                            }
                            fk0Var = (fk0) K;
                            msd msdVar = (msd) oq5Var2.j(es5.l);
                            Boolean valueOf = Boolean.valueOf(z2);
                            h = ((i5 & 896) == 256) | ((i5 & 112) == 32) | oq5Var2.h(fk0Var);
                            K2 = oq5Var2.K();
                            dd3 dd3Var = null;
                            if (!h || K2 == kjnVar) {
                                K2 = new x08(z, z2, fk0Var, (Continuation) null);
                                oq5Var2.k0(K2);
                            }
                            int i9 = i5 >> 6;
                            gld.w(oq5Var2, valueOf, (Function2) K2);
                            h2 = ((i5 & 14) == 4) | oq5Var2.h(msdVar);
                            K3 = oq5Var2.K();
                            if (!h2 || K3 == kjnVar) {
                                K3 = new acc(function0, msdVar, 0);
                                oq5Var2.k0(K3);
                            }
                            Function0 function02 = (Function0) K3;
                            yci e = d.e(yciVar, 40);
                            tgo tgoVar = ugo.a;
                            if (z) {
                                oq5Var2.Z(-1166408993);
                                dd3Var = new dd3(2, new f3r(d85.b(((dq0) oq5Var2.j(eq0.a)).a.a, ((Number) fk0Var.e()).floatValue(), 0.0f, 0.0f, 0.0f, 14)));
                                z5 = false;
                            } else {
                                z5 = false;
                                oq5Var2.Z(-1798859380);
                            }
                            oq5Var2.p(z5);
                            wn5Var2 = wn5Var;
                            oq5Var = oq5Var2;
                            q5g.l(function02, e, z4, tgoVar, j3, 0L, dd3Var, 0.0f, null, ild.C(-399495670, new y61(wn5Var2, 12), oq5Var2), oq5Var, 805306368 | (i9 & 896) | ((i5 >> 3) & 57344), NetworkRequestException.INVALID_RANGE);
                            j4 = j3;
                        }
                    } else {
                        oq5Var2.S();
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                    }
                    j3 = j2;
                    oq5Var2.q();
                    K = oq5Var2.K();
                    kjnVar = gq5.a;
                    if (K == kjnVar) {
                    }
                    fk0Var = (fk0) K;
                    msd msdVar2 = (msd) oq5Var2.j(es5.l);
                    Boolean valueOf2 = Boolean.valueOf(z2);
                    if ((i5 & 112) == 32) {
                    }
                    h = ((i5 & 896) == 256) | ((i5 & 112) == 32) | oq5Var2.h(fk0Var);
                    K2 = oq5Var2.K();
                    dd3 dd3Var2 = null;
                    if (!h) {
                    }
                    K2 = new x08(z, z2, fk0Var, (Continuation) null);
                    oq5Var2.k0(K2);
                    int i92 = i5 >> 6;
                    gld.w(oq5Var2, valueOf2, (Function2) K2);
                    h2 = ((i5 & 14) == 4) | oq5Var2.h(msdVar2);
                    K3 = oq5Var2.K();
                    if (!h2) {
                    }
                    K3 = new acc(function0, msdVar2, 0);
                    oq5Var2.k0(K3);
                    Function0 function022 = (Function0) K3;
                    yci e2 = d.e(yciVar, 40);
                    tgo tgoVar2 = ugo.a;
                    if (z) {
                    }
                    oq5Var2.p(z5);
                    wn5Var2 = wn5Var;
                    oq5Var = oq5Var2;
                    q5g.l(function022, e2, z4, tgoVar2, j3, 0L, dd3Var2, 0.0f, null, ild.C(-399495670, new y61(wn5Var2, 12), oq5Var2), oq5Var, 805306368 | (i92 & 896) | ((i5 >> 3) & 57344), NetworkRequestException.INVALID_RANGE);
                    j4 = j3;
                } else {
                    oq5Var2.S();
                    wn5Var2 = wn5Var;
                    oq5Var = oq5Var2;
                    j4 = j2;
                }
                final boolean z6 = z4;
                r = oq5Var.r();
                if (r == null) {
                    r.d = new Function2() { // from class: bcc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            dcc.a(Function0.this, z, z2, yciVar, z6, j4, wn5Var2, (hq5) obj, rvf.R(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i4 = SQLiteDatabase.OPEN_FULLMUTEX;
        i5 = i3 | i4;
        if ((599187 & i5) == 599186) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        j3 = j2;
        oq5Var2.q();
        K = oq5Var2.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        fk0Var = (fk0) K;
        msd msdVar22 = (msd) oq5Var2.j(es5.l);
        Boolean valueOf22 = Boolean.valueOf(z2);
        if ((i5 & 112) == 32) {
        }
        h = ((i5 & 896) == 256) | ((i5 & 112) == 32) | oq5Var2.h(fk0Var);
        K2 = oq5Var2.K();
        dd3 dd3Var22 = null;
        if (!h) {
        }
        K2 = new x08(z, z2, fk0Var, (Continuation) null);
        oq5Var2.k0(K2);
        int i922 = i5 >> 6;
        gld.w(oq5Var2, valueOf22, (Function2) K2);
        h2 = ((i5 & 14) == 4) | oq5Var2.h(msdVar22);
        K3 = oq5Var2.K();
        if (!h2) {
        }
        K3 = new acc(function0, msdVar22, 0);
        oq5Var2.k0(K3);
        Function0 function0222 = (Function0) K3;
        yci e22 = d.e(yciVar, 40);
        tgo tgoVar22 = ugo.a;
        if (z) {
        }
        oq5Var2.p(z5);
        wn5Var2 = wn5Var;
        oq5Var = oq5Var2;
        q5g.l(function0222, e22, z4, tgoVar22, j3, 0L, dd3Var22, 0.0f, null, ild.C(-399495670, new y61(wn5Var2, 12), oq5Var2), oq5Var, 805306368 | (i922 & 896) | ((i5 >> 3) & 57344), NetworkRequestException.INVALID_RANGE);
        j4 = j3;
        final boolean z62 = z4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void b(final float f, final float f2, hq5 hq5Var, final int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(231350260);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            f2 = 40;
            pm0.c(xp3.u(d.o(vci.a, f, f2), ugo.a), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: ccc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    dcc.b(f, f2, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }
}
