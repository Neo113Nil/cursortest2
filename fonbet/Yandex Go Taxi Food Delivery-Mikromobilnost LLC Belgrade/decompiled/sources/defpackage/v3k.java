package defpackage;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction$Target;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v3k implements c4x {
    public static final kvo m = new kvo(Boolean.TRUE);
    public final tnk a;
    public final Expression b;
    public final Expression c;
    public final Expression d;
    public final List e;
    public final JSONObject f;
    public final Expression g;
    public final String h;
    public final Expression i;
    public final jbk j;
    public final Expression k;
    public Integer l;

    public v3k(tnk tnkVar, Expression expression, Expression expression2, Expression expression3, List list, JSONObject jSONObject, Expression expression4, String str, Expression expression5, jbk jbkVar, Expression expression6) {
        this.a = tnkVar;
        this.b = expression;
        this.c = expression2;
        this.d = expression3;
        this.e = list;
        this.f = jSONObject;
        this.g = expression4;
        this.h = str;
        this.i = expression5;
        this.j = jbkVar;
        this.k = expression6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a4, code lost:
    
        if (r3 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(v3k v3kVar, rvo rvoVar, rvo rvoVar2) {
        if (v3kVar != null) {
            tnk tnkVar = v3kVar.a;
            tnk tnkVar2 = this.a;
            if ((tnkVar2 != null ? tnkVar2.a(tnkVar, rvoVar, rvoVar2) : tnkVar == null) && ((Boolean) this.b.a(rvoVar)).booleanValue() == ((Boolean) v3kVar.b.a(rvoVar2)).booleanValue() && jl40.l(this.c.a(rvoVar), v3kVar.c.a(rvoVar2))) {
                Expression expression = this.d;
                Uri uri = expression != null ? (Uri) expression.a(rvoVar) : null;
                Expression expression2 = v3kVar.d;
                if (jl40.l(uri, expression2 != null ? (Uri) expression2.a(rvoVar2) : null)) {
                    List list = v3kVar.e;
                    List list2 = this.e;
                    if (list2 != null) {
                        if (list != null && list2.size() == list.size()) {
                            int i = 0;
                            for (Object obj : list2) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    scc.m();
                                    throw null;
                                }
                                if (!((t3k) obj).a((t3k) list.get(i), rvoVar, rvoVar2)) {
                                    break;
                                }
                                i = i2;
                            }
                            if (jl40.l(this.f, v3kVar.f)) {
                                Expression expression3 = this.g;
                                Uri uri2 = expression3 != null ? (Uri) expression3.a(rvoVar) : null;
                                Expression expression4 = v3kVar.g;
                                if (jl40.l(uri2, expression4 != null ? (Uri) expression4.a(rvoVar2) : null) && jl40.l(this.h, v3kVar.h)) {
                                    Expression expression5 = this.i;
                                    DivAction$Target divAction$Target = expression5 != null ? (DivAction$Target) expression5.a(rvoVar) : null;
                                    Expression expression6 = v3kVar.i;
                                    if (divAction$Target == (expression6 != null ? (DivAction$Target) expression6.a(rvoVar2) : null)) {
                                        jbk jbkVar = v3kVar.j;
                                        jbk jbkVar2 = this.j;
                                        if (jbkVar2 != null ? jbkVar2.a(jbkVar, rvoVar, rvoVar2) : jbkVar == null) {
                                            Expression expression7 = this.k;
                                            Uri uri3 = expression7 != null ? (Uri) expression7.a(rvoVar) : null;
                                            Expression expression8 = v3kVar.k;
                                            if (jl40.l(uri3, expression8 != null ? (Uri) expression8.a(rvoVar2) : null)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.l;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(v3k.class).hashCode();
        tnk tnkVar = this.a;
        int hashCode2 = this.c.hashCode() + this.b.hashCode() + hashCode + (tnkVar != null ? tnkVar.b() : 0);
        Expression expression = this.d;
        int hashCode3 = hashCode2 + (expression != null ? expression.hashCode() : 0);
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((t3k) it.next()).b();
            }
        } else {
            i = 0;
        }
        int i2 = hashCode3 + i;
        JSONObject jSONObject = this.f;
        int hashCode4 = i2 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression expression2 = this.g;
        int hashCode5 = hashCode4 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.h;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        Expression expression3 = this.i;
        int hashCode7 = hashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        jbk jbkVar = this.j;
        int b = hashCode7 + (jbkVar != null ? jbkVar.b() : 0);
        Expression expression4 = this.k;
        int hashCode8 = b + (expression4 != null ? expression4.hashCode() : 0);
        this.l = Integer.valueOf(hashCode8);
        return hashCode8;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((f7k) ft6.b.t1.getValue()).b(ft6.a, this);
    }

    public /* synthetic */ v3k(kvo kvoVar, JSONObject jSONObject, kvo kvoVar2, int i) {
        this(null, m, kvoVar, null, null, (i & 32) != 0 ? null : jSONObject, null, null, null, null, kvoVar2);
    }
}
