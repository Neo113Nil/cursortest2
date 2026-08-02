package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.t8i;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class s8i extends ad5 {
    public static final f3i F = new f3i("", "", "", "", "", "", null);
    public final y8i A;
    public final j0g B;
    public final vmn0 C;
    public boolean D;
    public final r0 E;
    public final r8i x;
    public final m8i y;
    public final zch z;

    public s8i(r8i r8iVar, m8i m8iVar, zch zchVar, y8i y8iVar, j0g j0gVar, vmn0 vmn0Var) {
        super(p8i.class);
        this.x = r8iVar;
        this.y = m8iVar;
        this.z = zchVar;
        this.A = y8iVar;
        this.B = j0gVar;
        this.C = vmn0Var;
        this.E = bvf0.c(Boolean.FALSE);
        String str = r8iVar.c;
        str = str == null ? m8iVar.a() : str;
        m8iVar.a.c = evu0.J(str) ? null : str;
    }

    public final void Kg() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.E;
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.FALSE));
    }

    public final void Lg() {
        Object value;
        String str;
        String str2;
        String str3;
        Boolean bool = Boolean.FALSE;
        this.D = true;
        m8i m8iVar = this.y;
        t8i t8iVar = m8iVar.a;
        r0 r0Var = t8iVar.a;
        do {
            value = r0Var.getValue();
            str = t8iVar.c;
            ((t8i.a) value).getClass();
        } while (!r0Var.k(value, new t8i.a(str)));
        t8iVar.c = null;
        String a = m8iVar.a();
        j0g j0gVar = this.B;
        pex0 m = ((k) ((wiq0) j0gVar.b)).m();
        if (m != null && (str2 = m.b) != null) {
            boolean y = evu0.y(str2, "cargo", true);
            zch zchVar = (zch) j0gVar.a;
            if (y) {
                zchVar.getClass();
                str3 = a.length() != 0 ? a : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str3 != null) {
                    linkedHashMap.put("comment", str3);
                }
                linkedHashMap.put("is_with_pictures", bool);
                linkedHashMap.put("pictures_amt", 0);
                zchVar.l("Summary.SummaryCard.CommentToCargoDriverCard.ContinueButton.Tapped", linkedHashMap);
            } else {
                zchVar.getClass();
                str3 = a.length() != 0 ? a : null;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (str3 != null) {
                    linkedHashMap2.put("comment", str3);
                }
                linkedHashMap2.put("is_with_pictures", bool);
                linkedHashMap2.put("pictures_amt", 0);
                zchVar.l("Summary.SummaryCard.CommentToCourierCard.SubmitButton.Tapped", linkedHashMap2);
            }
        }
        this.A.a.r(new wth(19));
    }
}
