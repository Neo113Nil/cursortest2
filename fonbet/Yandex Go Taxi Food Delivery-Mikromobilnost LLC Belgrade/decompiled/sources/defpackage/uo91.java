package defpackage;

import com.yandex.go.xiva.domain.model.XivaConnectionState;
import com.yx360.design.compose.atoms.DsDivider$VerticalPadding;
import kotlin.collections.EmptyList;

/* loaded from: classes11.dex */
public abstract class uo91 {
    public static final a6f0 a = new a6f0(0);
    public static final k6d b = new k6d(2);
    public static au2 c;

    public static final void a(boolean z, DsDivider$VerticalPadding dsDivider$VerticalPadding, f530 f530Var, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        float f;
        DsDivider$VerticalPadding dsDivider$VerticalPadding2;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(937159437);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = i | (btsVar.c(dsDivider$VerticalPadding == null ? -1 : dsDivider$VerticalPadding.ordinal()) ? 32 : 16);
        } else {
            i3 = i;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i3 | 384;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i4 = i3 | (btsVar.k(f530Var2) ? 256 : 128);
        }
        if ((i4 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            dsDivider$VerticalPadding2 = dsDivider$VerticalPadding;
            f530Var3 = f530Var2;
        } else {
            DsDivider$VerticalPadding dsDivider$VerticalPadding3 = i5 != 0 ? DsDivider$VerticalPadding.M4 : dsDivider$VerticalPadding;
            f530 f530Var4 = i6 != 0 ? c530.a : f530Var2;
            if (z) {
                qnm.d.getClass();
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            f530 l = an91.l(f530Var4, f, dsDivider$VerticalPadding3.getValue());
            qnm qnmVar = qnm.a;
            qnm.f.getClass();
            tj91.a(1.0f, 0, 0, qnm.c(btsVar).g(), btsVar, l);
            dsDivider$VerticalPadding2 = dsDivider$VerticalPadding3;
            f530Var3 = f530Var4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new or1(z, dsDivider$VerticalPadding2, f530Var3, i, i2);
        }
    }

    public static final au2 b() {
        au2 au2Var = c;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("PlusL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        int i = c531.a;
        lgvVar.a("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, EmptyList.a);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 e = nnm.e(19.07f, 4.93f);
        e.a(10.0f, 10.0f, true, false, 4.93f, 19.07f);
        e.a(10.0f, 10.0f, false, false, 19.07f, 4.93f);
        e.j(11.0f, 6.33f);
        e.o(11.0f);
        e.f(6.34f);
        e.p(2.0f);
        e.f(11.0f);
        e.p(4.66f);
        e.g(2.0f);
        e.o(13.0f);
        e.g(4.66f);
        e.p(-2.0f);
        e.f(13.0f);
        e.o(6.34f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
        lgvVar.e();
        au2 a2 = rya1.a(lgvVar.d(), true);
        c = a2;
        return a2;
    }

    public static final boolean c(XivaConnectionState xivaConnectionState) {
        return xivaConnectionState == XivaConnectionState.Disconnected;
    }
}
