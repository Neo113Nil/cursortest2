package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.net.tracker.v2.a;

/* loaded from: classes6.dex */
public final class r78 {
    public final long a;
    public final yvf0 b;
    public final h3y c;
    public a d;
    public Float e;
    public pb30 f;

    public r78(long j, yvf0 yvf0Var, h3y h3yVar) {
        this.a = j;
        this.b = yvf0Var;
        this.c = h3yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if ((r9.a - r1.d) < 22500) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, sjm sjmVar) {
        ArrayList arrayList = sjmVar.b;
        String str2 = sjmVar.a;
        boolean equals = "courier".equals(str2);
        a aVar = this.d;
        boolean z = true;
        if (aVar == null) {
            a aVar2 = new a(arrayList, null, this.b, equals, new q78(this), oby0.e, this.c);
            this.d = aVar2;
            aVar2.q = true;
        } else {
            aVar.b(arrayList, null, equals, null);
        }
        a aVar3 = this.d;
        if (aVar3 != null && (r1 = aVar3.a()) != null) {
        }
        z = false;
        this.f = new pb30(str2, str, z);
    }

    public final pb30 b() {
        pb30 pb30Var = this.f;
        if (pb30Var == null) {
            ny61.r("You should call update before");
            return null;
        }
        a aVar = this.d;
        if (aVar == null) {
            ny61.r("You should call update before");
            return null;
        }
        long j = this.a;
        h201 d = aVar.d(j);
        if (d == null) {
            pb30Var.c = false;
            return pb30Var;
        }
        Point F = ru.yandex.taxi.map.utils.a.F(d.a);
        if (j - d.d > 45000) {
            pb30Var.b = false;
        } else {
            Double d2 = d.b;
            Float valueOf = d2 != null ? Float.valueOf((float) d2.doubleValue()) : this.e;
            this.e = valueOf;
            if (valueOf != null) {
                pb30Var.x = F;
                pb30Var.w = valueOf.floatValue();
                pb30Var.c = true;
            } else {
                pb30Var.c = false;
            }
        }
        List list = aVar.i.b;
        return pb30Var.clone();
    }
}
