package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class yy0 extends by0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(int i) {
        super(mhb.BOOLEAN, 2);
        this.d = i;
        switch (i) {
            case 1:
                super(mhb.COLOR, 2);
                break;
            case 2:
                super(mhb.INTEGER, 2);
                break;
            case 3:
                super(mhb.NUMBER, 2);
                break;
            case 4:
                super(mhb.STRING, 2);
                break;
            case 5:
                super(mhb.URL, 2);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.by0, defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        Object obj;
        int i = this.d;
        c85 c85Var = null;
        list.getClass();
        switch (i) {
            case 0:
                Object F = xp3.F(c(), list);
                Boolean bool = F instanceof Boolean ? (Boolean) F : null;
                if (bool == null) {
                    break;
                }
                break;
            case 1:
                Object F2 = xp3.F(c(), list);
                c85 c85Var2 = F2 instanceof c85 ? (c85) F2 : null;
                if (c85Var2 == null) {
                    String str = F2 instanceof String ? (String) F2 : null;
                    if (str != null) {
                        try {
                            r7o r7oVar = z7o.b;
                            obj = new c85(bow.v(str));
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            obj = new t7o(th);
                        }
                        c85Var = (c85) (obj instanceof t7o ? null : obj);
                    }
                    if (c85Var != null) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                Object F3 = xp3.F(c(), list);
                if (!(F3 instanceof Integer)) {
                    if (!(F3 instanceof Long)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 3:
                Object F4 = xp3.F(c(), list);
                Number number = F4 instanceof Number ? (Number) F4 : null;
                if (number == null) {
                    break;
                } else {
                    break;
                }
            case 4:
                Object F5 = xp3.F(c(), list);
                String str2 = F5 instanceof String ? (String) F5 : null;
                if (str2 == null) {
                    break;
                }
                break;
            default:
                Object F6 = xp3.F(c(), list);
                String b0 = xp3.b0(F6 instanceof String ? (String) F6 : null);
                if (b0 == null) {
                    break;
                } else {
                    break;
                }
        }
        return list.get(2);
    }
}
