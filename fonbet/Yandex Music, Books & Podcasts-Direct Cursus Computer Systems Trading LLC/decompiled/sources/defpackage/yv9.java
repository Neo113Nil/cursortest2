package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yv9 implements gip, py7 {
    public final t6f a;

    public yv9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals(CameraProperty.ROTATION);
        t6f t6fVar = this.a;
        if (equals) {
            return new vv9(((lh9) t6fVar.J6.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("translation")) {
            return new wv9(((yw9) t6fVar.w9.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        dw9 dw9Var = t instanceof dw9 ? (dw9) t : null;
        if (dw9Var != null) {
            return ((aw9) t6fVar.v9.getValue()).a(t7kVar, dw9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xv9 xv9Var) {
        boolean z = xv9Var instanceof vv9;
        t6f t6fVar = this.a;
        if (z) {
            return ((lh9) t6fVar.J6.getValue()).b(t7kVar, ((vv9) xv9Var).b);
        }
        if (xv9Var instanceof wv9) {
            return ((yw9) t6fVar.w9.getValue()).b(t7kVar, ((wv9) xv9Var).b);
        }
        b6e.s();
        return null;
    }
}
