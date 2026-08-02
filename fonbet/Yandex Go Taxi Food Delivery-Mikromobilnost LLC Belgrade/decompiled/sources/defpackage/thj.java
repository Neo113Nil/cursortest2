package defpackage;

import com.yandex.xplat.common.NetworkMethod;

/* loaded from: classes2.dex */
public class thj extends l55 {
    @Override // defpackage.l55, defpackage.hz50
    public wj00 a() {
        wj00 wj00Var = new wj00(0);
        wj00Var.b.put("params", e());
        return wj00Var;
    }

    @Override // defpackage.hz50
    public String c() {
        throw new Error("Should be overridden by inheritors");
    }

    public wj00 e() {
        return new wj00(0);
    }

    @Override // defpackage.hz50
    public final y5j0 encoding() {
        return new aex();
    }

    @Override // defpackage.hz50
    public final NetworkMethod method() {
        return NetworkMethod.post;
    }
}
