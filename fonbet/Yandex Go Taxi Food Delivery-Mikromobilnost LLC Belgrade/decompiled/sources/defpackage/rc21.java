package defpackage;

import com.yandex.go.repositories.AvatarStatus;

/* loaded from: classes12.dex */
public final class rc21 {
    public static njb0 a(lr21 lr21Var) {
        kr21 kr21Var = lr21Var.c;
        String str = lr21Var.b;
        return jl40.l(str, AvatarStatus.APPROVED.getText()) ? ljb0.a : new mjb0(str, kr21Var != null ? kr21Var.a : null);
    }
}
