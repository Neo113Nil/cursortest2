package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rv8 implements u1f {
    public static final /* synthetic */ int i = 0;
    public final List a;
    public final String b;
    public final List c;
    public final List d;
    public final szb e;
    public final List f;
    public final List g;
    public final List h;

    static {
        new ozb(mw9.NONE);
    }

    public rv8(List list, String str, List list2, List list3, szb szbVar, List list4, List list5, List list6) {
        this.a = list;
        this.b = str;
        this.c = list2;
        this.d = list3;
        this.e = szbVar;
        this.f = list4;
        this.g = list5;
        this.h = list6;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((wv8) rj3.b.N2.getValue()).b(rj3.a, this);
    }
}
