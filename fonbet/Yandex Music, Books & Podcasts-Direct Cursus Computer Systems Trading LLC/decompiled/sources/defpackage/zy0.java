package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class zy0 extends by0 {
    public final /* synthetic */ int d;
    public final List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(int i) {
        super(mhb.COLOR, 2);
        this.d = i;
        switch (i) {
            case 1:
                super(mhb.URL, 2);
                this.e = u75.h(new azc(mhb.ARRAY), new azc(mhb.INTEGER), new azc(mhb.STRING));
                break;
            default:
                this.e = u75.h(new azc(mhb.ARRAY), new azc(mhb.INTEGER), new azc(mhb.STRING));
                break;
        }
    }

    @Override // defpackage.by0, defpackage.oyc
    public final Object a(g06 g06Var, jhb jhbVar, List list) {
        int i = this.d;
        list.getClass();
        switch (i) {
            case 0:
                Object F = xp3.F(c(), list);
                c85 a0 = xp3.a0(F instanceof String ? (String) F : null);
                if (a0 == null) {
                    Object obj = list.get(2);
                    obj.getClass();
                    a0 = xp3.a0((String) obj);
                    if (a0 == null) {
                        xp3.d0(c(), "Unable to convert value to Color, expected format #AARRGGBB.", list);
                        throw null;
                    }
                }
                return a0;
            default:
                Object F2 = xp3.F(c(), list);
                String b0 = xp3.b0(F2 instanceof String ? (String) F2 : null);
                if (b0 != null) {
                    return new lpt(b0);
                }
                Object obj2 = list.get(2);
                obj2.getClass();
                String b02 = xp3.b0((String) obj2);
                if (b02 != null) {
                    return new lpt(b02);
                }
                xp3.d0(c(), "Unable to convert value to Url.", list);
                throw null;
        }
    }

    @Override // defpackage.by0, defpackage.oyc
    public final List b() {
        switch (this.d) {
        }
        return this.e;
    }
}
