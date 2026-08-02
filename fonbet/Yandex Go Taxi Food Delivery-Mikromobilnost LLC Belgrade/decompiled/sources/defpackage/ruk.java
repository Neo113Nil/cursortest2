package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class ruk implements c4x {
    public Integer a;

    public final boolean a(ruk rukVar, rvo rvoVar, rvo rvoVar2) {
        c4x c4xVar;
        c4x c4xVar2;
        if (rukVar != null) {
            if (this instanceof quk) {
                quk qukVar = (quk) this;
                if (rukVar instanceof quk) {
                    c4xVar2 = ((quk) rukVar).b;
                } else {
                    if (!(rukVar instanceof puk)) {
                        w511.b();
                        return false;
                    }
                    c4xVar2 = ((puk) rukVar).b;
                }
                avk avkVar = c4xVar2 instanceof avk ? (avk) c4xVar2 : null;
                if (avkVar != null) {
                    return jl40.l(qukVar.b.a.a(rvoVar), avkVar.a.a(rvoVar2));
                }
            } else {
                if (!(this instanceof puk)) {
                    w511.b();
                    return false;
                }
                puk pukVar = (puk) this;
                if (rukVar instanceof quk) {
                    c4xVar = ((quk) rukVar).b;
                } else {
                    if (!(rukVar instanceof puk)) {
                        w511.b();
                        return false;
                    }
                    c4xVar = ((puk) rukVar).b;
                }
                suk sukVar = c4xVar instanceof suk ? (suk) c4xVar : null;
                if (sukVar != null && ((Boolean) pukVar.b.a.a(rvoVar)).booleanValue() == ((Boolean) sukVar.a.a(rvoVar2)).booleanValue()) {
                    return true;
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
        if (this instanceof quk) {
            avk avkVar = ((quk) this).b;
            Integer num2 = avkVar.b;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                int hashCode2 = qoi0.a(avk.class).hashCode() + avkVar.a.hashCode();
                avkVar.b = Integer.valueOf(hashCode2);
                i = hashCode2;
            }
        } else {
            if (!(this instanceof puk)) {
                w511.b();
                return 0;
            }
            suk sukVar = ((puk) this).b;
            Integer num3 = sukVar.b;
            if (num3 != null) {
                i = num3.intValue();
            } else {
                int hashCode3 = sukVar.a.hashCode() + qoi0.a(suk.class).hashCode();
                sukVar.b = Integer.valueOf(hashCode3);
                i = hashCode3;
            }
        }
        int i2 = hashCode + i;
        this.a = Integer.valueOf(i2);
        return i2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((xuk) ft6.b.A4.getValue()).b(ft6.a, this);
    }
}
