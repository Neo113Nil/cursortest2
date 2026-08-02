package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class yzk implements c4x {
    public final sqk a;
    public Integer b;

    public yzk(sqk sqkVar) {
        this.a = sqkVar;
    }

    public final boolean a(yzk yzkVar, rvo rvoVar, rvo rvoVar2) {
        if (yzkVar == null) {
            return false;
        }
        return this.a.a(yzkVar.a, rvoVar, rvoVar2);
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int b = this.a.b() + qoi0.a(yzk.class).hashCode();
        this.b = Integer.valueOf(b);
        return b;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((zzk) ft6.b.j5.getValue()).b(ft6.a, this);
    }
}
