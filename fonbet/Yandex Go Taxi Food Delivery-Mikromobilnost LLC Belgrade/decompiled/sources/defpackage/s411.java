package defpackage;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.f411;
import defpackage.j411;
import defpackage.jll0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class s411 implements x830 {
    public final o a;
    public final p411 b;

    public s411(o oVar, p411 p411Var) {
        this.a = oVar;
        this.b = p411Var;
    }

    public final jll0 a() {
        f411 b = b();
        if (b.equals(f411.c)) {
            return null;
        }
        f411.b bVar = b.b;
        return new jll0(bVar != null ? new jll0.a(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g) : null);
    }

    public final f411 b() {
        f411.a aVar;
        j411.c cVar;
        j411.a aVar2;
        Zone g = this.a.g();
        if (g != null) {
            j411 j411Var = (j411) g.z.a(j411.class);
            f411 f411Var = null;
            r1 = null;
            f411.b bVar = null;
            if (j411Var != null) {
                j411.b bVar2 = j411Var.c;
                this.b.getClass();
                if (bVar2 == null || (aVar2 = bVar2.a) == null) {
                    aVar = null;
                } else {
                    String str = aVar2.a;
                    String Y = str != null ? d6z.Y(j411Var, str) : null;
                    String str2 = aVar2.b;
                    String Y2 = str2 != null ? d6z.Y(j411Var, str2) : null;
                    String str3 = aVar2.c;
                    String str4 = aVar2.d;
                    String Y3 = str4 != null ? d6z.Y(j411Var, str4) : null;
                    FormattedText formattedText = aVar2.e;
                    aVar = new f411.a(Y, Y2, str3, Y3, formattedText != null ? e9s.b(formattedText, j411Var) : null);
                }
                if (bVar2 != null && (cVar = bVar2.b) != null) {
                    String str5 = cVar.a;
                    String Y4 = str5 != null ? d6z.Y(j411Var, str5) : null;
                    String str6 = cVar.b;
                    String Y5 = str6 != null ? d6z.Y(j411Var, str6) : null;
                    String str7 = cVar.c;
                    String Y6 = str7 != null ? d6z.Y(j411Var, str7) : null;
                    String str8 = cVar.d;
                    String Y7 = str8 != null ? d6z.Y(j411Var, str8) : null;
                    String str9 = cVar.e;
                    String Y8 = str9 != null ? d6z.Y(j411Var, str9) : null;
                    String str10 = cVar.f;
                    String Y9 = str10 != null ? d6z.Y(j411Var, str10) : null;
                    String str11 = cVar.g;
                    bVar = new f411.b(Y4, Y5, Y6, Y7, Y8, Y9, str11 != null ? d6z.Y(j411Var, str11) : null);
                }
                f411Var = new f411(aVar, bVar);
            }
            if (f411Var != null) {
                return f411Var;
            }
        }
        return f411.c;
    }
}
