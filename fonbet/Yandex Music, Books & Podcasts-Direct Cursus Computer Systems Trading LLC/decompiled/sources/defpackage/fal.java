package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class fal {
    public final crh a;
    public final fkn b;
    public final z50 c;
    public final u21 d;
    public final bca e;

    public fal(g64 g64Var, dk4 dk4Var) {
        this.a = dk4Var.c().d;
        tf6 e = gld.e(dm6.b());
        xdr xdrVar = g64Var.i;
        this.b = lg3.u0(new njf(xdrVar, this, 27), e, a((u64) xdrVar.getValue()));
        int i = 3;
        this.c = new z50(zsd.d0(xdrVar, 1), i);
        this.d = new u21(10, g64Var.j, dk4Var.c().g, new t81(i, 17, (Continuation) null));
        this.e = new bca(new a1l(dk4Var.d, 12), 18);
    }

    public static uz7 a(u64 u64Var) {
        if (Intrinsics.d(u64Var, r64.a)) {
            return sz7.a;
        }
        if (!(u64Var instanceof t64)) {
            if (u64Var instanceof q64) {
                return new tz7((s64) u64Var, vq1.R(((q64) u64Var).c));
            }
            if (!(u64Var instanceof p64)) {
                b6e.s();
                return null;
            }
            s64 s64Var = (s64) u64Var;
            ek4 ek4Var = ((p64) u64Var).a.c;
            return new tz7(s64Var, R.drawable.ic_chromecast_24);
        }
        s64 s64Var2 = (s64) u64Var;
        int ordinal = ((t64) u64Var).a.b.ordinal();
        int i = R.drawable.ic_tv_24;
        switch (ordinal) {
            case 0:
            case 2:
            case 9:
                i = R.drawable.ic_phone_24;
                break;
            case 1:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                i = R.drawable.ic_computer_24;
                break;
            case 7:
                i = R.drawable.ic_station_24;
                break;
            case 8:
                i = R.drawable.ic_smart_watch_24;
                break;
            default:
                b6e.s();
                return null;
        }
        return new tz7(s64Var2, i);
    }
}
