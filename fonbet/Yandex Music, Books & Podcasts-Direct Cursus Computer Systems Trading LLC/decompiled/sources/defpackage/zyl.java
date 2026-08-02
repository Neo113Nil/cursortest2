package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class zyl {
    public static final float a = 16;

    public static final void a(yci yciVar, fvf fvfVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-252386543);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            weo.i(d.d(yciVar, 1.0f), fvfVar, a.a(a, 0.0f, 2), false, qx0.g(8), null, null, false, null, function1, oq5Var, (i2 & 112) | 24960 | ((i2 << 21) & 1879048192), 488);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ryl(yciVar, fvfVar, function1, i, 1);
        }
    }

    public static final void b(fvf fvfVar, ndc ndcVar, final Function1 function1, yci yciVar, boolean z, boolean z2, hq5 hq5Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        long D;
        boolean z6;
        Object obj;
        final boolean z7;
        boolean z8;
        final fvf fvfVar2 = fvfVar;
        fvfVar2.getClass();
        ndcVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1222828414);
        int i5 = i | (oq5Var.f(fvfVar2) ? 4 : 2) | (oq5Var.f(ndcVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            z3 = z;
        } else {
            z3 = z;
            i3 = i5 | (oq5Var.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID);
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i3 | 196608;
            z4 = z2;
        } else {
            z4 = z2;
            i4 = i3 | (oq5Var.g(z4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        }
        int i8 = i4;
        if (oq5Var.P(i8 & 1, (74899 & i8) != 74898)) {
            if (i6 != 0) {
                z3 = true;
            }
            if (i7 != 0) {
                z4 = true;
            }
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            final mm6 mm6Var = (mm6) K;
            final int L = ((jx7) oq5Var.j(es5.h)).L(a);
            if (z4) {
                oq5Var.Z(631762129);
                D = ((dq0) oq5Var.j(eq0.a)).d.c;
                oq5Var.p(false);
                z6 = false;
            } else {
                oq5Var.Z(631815976);
                agr agrVar = eq0.a;
                D = c3x.D(((dq0) oq5Var.j(agrVar)).d.c, ((dq0) oq5Var.j(agrVar)).c.a);
                z6 = false;
                oq5Var.p(false);
            }
            if (ndcVar.equals(hdc.a)) {
                oq5Var.Z(631960126);
                oq5Var.p(z6);
            } else if (ndcVar.equals(jdc.a)) {
                oq5Var.Z(632008145);
                pm0.a(null, ild.C(-92048518, new pyl(yciVar, fvfVar2, 0), oq5Var), oq5Var, 48, 1);
                oq5Var.p(false);
            } else {
                if (!(ndcVar instanceof ldc)) {
                    throw vz1.i(oq5Var, 1682954996, false);
                }
                oq5Var.Z(632474757);
                final ArrayList arrayList = ((ldc) ndcVar).a;
                boolean f = oq5Var.f(arrayList);
                Object K2 = oq5Var.K();
                if (f || K2 == kjnVar) {
                    K2 = new w71(arrayList, 2);
                    oq5Var.k0(K2);
                }
                yci b = nfp.b(yciVar, false, (Function1) K2);
                boolean f2 = ((i8 & 14) == 4) | oq5Var.f(arrayList) | ((i8 & 896) == 256) | oq5Var.h(mm6Var) | oq5Var.d(L) | ((57344 & i8) == 16384) | oq5Var.e(D);
                Object K3 = oq5Var.K();
                if (f2 || K3 == kjnVar) {
                    z7 = z3;
                    z8 = false;
                    final long j = D;
                    obj = new Function1() { // from class: qyl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            vuf vufVar = (vuf) obj2;
                            vufVar.getClass();
                            ArrayList arrayList2 = arrayList;
                            vufVar.Z(arrayList2.size(), null, new wyl(arrayList2, 0), new wn5(new xyl(arrayList2, function1, mm6Var, fvfVar2, L, z7, j), -1091073711, true));
                            return Unit.a;
                        }
                    };
                    fvfVar2 = fvfVar2;
                    oq5Var.k0(obj);
                } else {
                    obj = K3;
                    z7 = z3;
                    z8 = false;
                }
                a(b, fvfVar2, (Function1) obj, oq5Var, (i8 << 3) & 112);
                oq5Var.p(z8);
                z5 = z7;
            }
            z7 = z3;
            z5 = z7;
        } else {
            oq5Var.S();
            z5 = z3;
        }
        boolean z9 = z4;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new aj6(fvfVar2, ndcVar, function1, yciVar, z5, z9, i, i2);
        }
    }
}
