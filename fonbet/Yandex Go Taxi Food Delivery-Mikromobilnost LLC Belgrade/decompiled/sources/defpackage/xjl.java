package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class xjl implements c4x {
    public Integer a;

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(xjl xjlVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (xjlVar != null) {
            if (this instanceof vjl) {
                vjl vjlVar = (vjl) this;
                if (xjlVar instanceof vjl) {
                    c4xVar2 = ((vjl) xjlVar).b;
                } else {
                    if (!(xjlVar instanceof wjl)) {
                        w511.b();
                        return false;
                    }
                    c4xVar2 = ((wjl) xjlVar).b;
                }
                e7l e7lVar = c4xVar2 instanceof e7l ? (e7l) c4xVar2 : null;
                if (e7lVar != null) {
                    e7l e7lVar2 = vjlVar.b;
                    if (((Number) e7lVar2.a.a(rvoVar)).doubleValue() == ((Number) e7lVar.a.a(rvoVar2)).doubleValue() && e7lVar2.b.a(e7lVar.b, rvoVar, rvoVar2) && e7lVar2.c.a(e7lVar.c, rvoVar, rvoVar2)) {
                        return true;
                    }
                }
            } else {
                if (!(this instanceof wjl)) {
                    w511.b();
                    return false;
                }
                wjl wjlVar = (wjl) this;
                if (xjlVar instanceof vjl) {
                    c4xVar = ((vjl) xjlVar).b;
                } else {
                    if (!(xjlVar instanceof wjl)) {
                        w511.b();
                        return false;
                    }
                    c4xVar = ((wjl) xjlVar).b;
                }
                all allVar = c4xVar instanceof all ? (all) c4xVar : null;
                if (allVar != null) {
                    all allVar2 = wjlVar.b;
                    tkl tklVar = allVar2.a;
                    tkl tklVar2 = allVar.a;
                    if (tklVar != null ? tklVar.a(tklVar2, rvoVar, rvoVar2) : tklVar2 == null) {
                        tkl tklVar3 = allVar2.b;
                        tkl tklVar4 = allVar.b;
                        if (tklVar3 != null ? tklVar3.a(tklVar4, rvoVar, rvoVar2) : tklVar4 == null) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int i;
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(getClass()).hashCode();
        if (this instanceof vjl) {
            e7l e7lVar = ((vjl) this).b;
            Integer num2 = e7lVar.d;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int b = e7lVar.b.b() + e7lVar.a.hashCode() + qoi0.a(e7l.class).hashCode() + e7lVar.c.b();
                e7lVar.d = Integer.valueOf(b);
                i = b;
            }
        } else {
            if (!(this instanceof wjl)) {
                w511.b();
                return 0;
            }
            all allVar = ((wjl) this).b;
            Integer num3 = allVar.c;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode2 = qoi0.a(all.class).hashCode();
                tkl tklVar = allVar.a;
                int b2 = hashCode2 + (tklVar != null ? tklVar.b() : 0);
                tkl tklVar2 = allVar.b;
                int b3 = b2 + (tklVar2 != null ? tklVar2.b() : 0);
                allVar.c = Integer.valueOf(b3);
                i = b3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((yjl) ft6.b.q9.getValue()).b(ft6.a, this);
    }
}
