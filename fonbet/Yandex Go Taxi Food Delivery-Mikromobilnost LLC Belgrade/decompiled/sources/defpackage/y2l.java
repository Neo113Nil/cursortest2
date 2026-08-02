package defpackage;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivPatch$Mode;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y2l implements c4x {
    public static final /* synthetic */ int f = 0;
    public final List a;
    public final Expression b;
    public final List c;
    public final List d;
    public Integer e;

    static {
        new kvo(DivPatch$Mode.PARTIAL);
    }

    public y2l(Expression expression, List list, List list2, List list3) {
        this.a = list;
        this.b = expression;
        this.c = list2;
        this.d = list3;
    }

    public final int a() {
        int i;
        int hashCode;
        int i2;
        int i3;
        Integer num = this.e;
        if (num != null) {
            return num.intValue();
        }
        int hashCode2 = qoi0.a(y2l.class).hashCode();
        int i4 = 0;
        int i5 = 0;
        for (w2l w2lVar : this.a) {
            Integer num2 = w2lVar.d;
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                Integer num3 = w2lVar.c;
                if (num3 != null) {
                    hashCode = num3.intValue();
                } else {
                    hashCode = qoi0.a(w2l.class).hashCode() + w2lVar.a.hashCode();
                    w2lVar.c = Integer.valueOf(hashCode);
                }
                List list = w2lVar.b;
                if (list != null) {
                    Iterator it = list.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        i2 += ((m3k) it.next()).b();
                    }
                } else {
                    i2 = 0;
                }
                int i6 = hashCode + i2;
                w2lVar.d = Integer.valueOf(i6);
                i3 = i6;
            }
            i5 += i3;
        }
        int hashCode3 = this.b.hashCode() + hashCode2 + i5;
        List list2 = this.c;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                i += ((v3k) it2.next()).b();
            }
        } else {
            i = 0;
        }
        int i7 = hashCode3 + i;
        List list3 = this.d;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                i4 += ((v3k) it3.next()).b();
            }
        }
        int i8 = i7 + i4;
        this.e = Integer.valueOf(i8);
        return i8;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((c3l) ft6.b.N5.getValue()).b(ft6.a, this);
    }
}
