package defpackage;

import com.yandex.div.json.expressions.Expression;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class vbl implements c4x {
    public static final sqk d = new sqk(ngd0.m(5L));
    public static final kvo e = ngd0.m(10L);
    public final sqk a;
    public final Expression b;
    public Integer c;

    public vbl(sqk sqkVar, Expression expression) {
        this.a = sqkVar;
        this.b = expression;
    }

    public final boolean a(vbl vblVar, rvo rvoVar, rvo rvoVar2) {
        return vblVar != null && this.a.a(vblVar.a, rvoVar, rvoVar2) && ((Number) this.b.a(rvoVar)).longValue() == ((Number) vblVar.b.a(rvoVar2)).longValue();
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.b.hashCode() + this.a.b() + qoi0.a(vbl.class).hashCode();
        this.c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((wbl) ft6.b.M7.getValue()).b(ft6.a, this);
    }

    public vbl() {
        this(d, e);
    }
}
