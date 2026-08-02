package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zv9 implements gip, py7 {
    public final t6f a;

    public zv9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object cw9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        dw9 dw9Var = d7fVar instanceof dw9 ? (dw9) d7fVar : null;
        if (dw9Var != null) {
            if (dw9Var instanceof bw9) {
                b0 = CameraProperty.ROTATION;
            } else {
                if (!(dw9Var instanceof cw9)) {
                    b6e.s();
                    return null;
                }
                b0 = "translation";
            }
        }
        boolean equals = b0.equals(CameraProperty.ROTATION);
        t6f t6fVar = this.a;
        if (equals) {
            mh9 mh9Var = (mh9) t6fVar.K6.getValue();
            if (dw9Var != null) {
                if (dw9Var instanceof bw9) {
                    obj2 = ((bw9) dw9Var).a;
                } else {
                    if (!(dw9Var instanceof cw9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((cw9) dw9Var).a;
                }
                obj3 = obj2;
            }
            cw9Var = new bw9(mh9Var.c(t7kVar, (ph9) obj3, jSONObject));
            return cw9Var;
        }
        if (!b0.equals("translation")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        zw9 zw9Var = (zw9) t6fVar.x9.getValue();
        if (dw9Var != null) {
            if (dw9Var instanceof bw9) {
                obj = ((bw9) dw9Var).a;
            } else {
                if (!(dw9Var instanceof cw9)) {
                    b6e.s();
                    return null;
                }
                obj = ((cw9) dw9Var).a;
            }
            obj3 = obj;
        }
        cw9Var = new cw9(zw9Var.c(t7kVar, (bx9) obj3, jSONObject));
        return cw9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, dw9 dw9Var) {
        boolean z = dw9Var instanceof bw9;
        t6f t6fVar = this.a;
        if (z) {
            return ((mh9) t6fVar.K6.getValue()).b(t7kVar, ((bw9) dw9Var).a);
        }
        if (dw9Var instanceof cw9) {
            return ((zw9) t6fVar.x9.getValue()).b(t7kVar, ((cw9) dw9Var).a);
        }
        b6e.s();
        return null;
    }
}
