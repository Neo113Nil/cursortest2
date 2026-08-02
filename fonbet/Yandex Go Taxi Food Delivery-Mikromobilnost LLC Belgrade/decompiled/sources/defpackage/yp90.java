package defpackage;

import com.ybsdk.widgets.common.CodeInputView;

/* loaded from: classes10.dex */
public final class yp90 implements gy31 {
    @Override // defpackage.gy31
    public final vw01 b(kk2 kk2Var) {
        return new vw01(new kk2(cvu0.u(kk2Var.b.length(), String.valueOf(CodeInputView.PLACEHOLDER))), hv60.a);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yp90);
    }

    public final int hashCode() {
        return Character.hashCode(CodeInputView.PLACEHOLDER);
    }
}
