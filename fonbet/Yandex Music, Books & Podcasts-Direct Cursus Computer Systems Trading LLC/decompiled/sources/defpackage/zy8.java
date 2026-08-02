package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zy8 implements u1f, w59 {
    public final szb a;
    public final szb b;
    public final List c;
    public final String d;
    public Integer e;

    public zy8(szb szbVar, szb szbVar2, List list, String str) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = list;
        this.d = str;
    }

    @Override // defpackage.w59
    public final String a() {
        return this.d;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((az8) rj3.b.z3.getValue()).b(rj3.a, this);
    }
}
