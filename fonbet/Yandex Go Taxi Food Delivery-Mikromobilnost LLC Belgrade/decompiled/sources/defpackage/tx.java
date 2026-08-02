package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes4.dex */
public final class tx implements yu00 {
    public final /* synthetic */ odx a;
    public final /* synthetic */ ywl b;
    public final /* synthetic */ String c;

    public tx(ux uxVar, odx odxVar, ywl ywlVar, hx hxVar, String str) {
        this.a = odxVar;
        this.b = ywlVar;
        this.c = str;
    }

    @Override // defpackage.yu00
    public final Object a(Map map, InputStream inputStream) {
        ywl ywlVar = this.b;
        String str = this.c;
        odx odxVar = this.a;
        ux.a(odxVar, ywlVar, map, str, null);
        kg90 a = odxVar.a(inputStream);
        if (a instanceof jg90) {
            return (nui0) ((jg90) a).a;
        }
        if (a instanceof ig90) {
            return new ewj0(((ig90) a).a);
        }
        w511.b();
        return null;
    }

    @Override // defpackage.yu00
    public final Object b(Map map, InputStream inputStream, wu00 wu00Var) {
        String str = this.c;
        String str2 = wu00Var.e;
        odx odxVar = this.a;
        ux.a(odxVar, this.b, map, str, str2);
        kg90 a = odxVar.a(inputStream);
        if (a instanceof jg90) {
            return (nui0) ((jg90) a).a;
        }
        if (a instanceof ig90) {
            return new ewj0(((ig90) a).a);
        }
        w511.b();
        return null;
    }
}
