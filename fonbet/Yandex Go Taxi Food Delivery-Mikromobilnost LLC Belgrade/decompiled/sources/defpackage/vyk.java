package defpackage;

import com.yandex.div.json.expressions.Expression;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vyk implements c4x {
    public static final kvo e = new kvo(0L);
    public final Expression a;
    public final List b;
    public final pvo c;
    public Integer d;

    public vyk(Expression expression, List list, pvo pvoVar) {
        this.a = expression;
        this.b = list;
        this.c = pvoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r10 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(vyk vykVar, rvo rvoVar, rvo rvoVar2) {
        List a;
        List a2;
        if (vykVar != null) {
            pvo pvoVar = vykVar.c;
            if (((Number) this.a.a(rvoVar)).longValue() == ((Number) vykVar.a.a(rvoVar2)).longValue()) {
                List list = vykVar.b;
                List list2 = this.b;
                if (list2 != null) {
                    if (list != null && list2.size() == list.size()) {
                        int i = 0;
                        for (Object obj : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            uyk uykVar = (uyk) list.get(i);
                            uyk uykVar2 = (uyk) obj;
                            if (uykVar == null) {
                                uykVar2.getClass();
                                return false;
                            }
                            if (((Number) uykVar2.a.a(rvoVar)).intValue() != ((Number) uykVar.a.a(rvoVar2)).intValue() || ((Number) uykVar2.b.a(rvoVar)).doubleValue() != ((Number) uykVar.b.a(rvoVar2)).doubleValue()) {
                                break;
                            }
                            i = i2;
                        }
                        pvo pvoVar2 = this.c;
                        if (pvoVar2 != null && (a = pvoVar2.a(rvoVar)) != null) {
                            if (pvoVar != null && (a2 = pvoVar.a(rvoVar2)) != null && a.size() == a2.size()) {
                                int i3 = 0;
                                for (Object obj2 : a) {
                                    int i4 = i3 + 1;
                                    if (i3 < 0) {
                                        scc.m();
                                        throw null;
                                    }
                                    if (((Number) obj2).intValue() == ((Number) a2.get(i3)).intValue()) {
                                        i3 = i4;
                                    }
                                }
                                return true;
                            }
                        } else if (pvoVar == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        int i2;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(vyk.class).hashCode();
        List<uyk> list = this.b;
        if (list != null) {
            i = 0;
            for (uyk uykVar : list) {
                Integer num2 = uykVar.c;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    int hashCode2 = uykVar.b.hashCode() + uykVar.a.hashCode() + qoi0.a(uyk.class).hashCode();
                    uykVar.c = Integer.valueOf(hashCode2);
                    i2 = hashCode2;
                }
                i += i2;
            }
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        pvo pvoVar = this.c;
        int hashCode3 = i3 + (pvoVar != null ? pvoVar.hashCode() : 0);
        this.d = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((yyk) ft6.b.a5.getValue()).b(ft6.a, this);
    }

    public vyk() {
        this(e, null, null);
    }
}
