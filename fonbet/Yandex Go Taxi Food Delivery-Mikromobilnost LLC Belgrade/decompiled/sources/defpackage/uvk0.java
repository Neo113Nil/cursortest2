package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class uvk0 {
    public final String a;
    public final CharSequence b;
    public final List c;
    public final List d;
    public final tvk0 e;
    public final UiStateDrawableWrapper f;

    public uvk0(String str, CharSequence charSequence, List list, List list2, tvk0 tvk0Var, UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = str;
        this.b = charSequence;
        this.c = list;
        this.d = list2;
        this.e = tvk0Var;
        this.f = uiStateDrawableWrapper;
    }

    public static uvk0 a(uvk0 uvk0Var, UiStateDrawableWrapper uiStateDrawableWrapper) {
        String str = uvk0Var.a;
        CharSequence charSequence = uvk0Var.b;
        List list = uvk0Var.c;
        List list2 = uvk0Var.d;
        tvk0 tvk0Var = uvk0Var.e;
        uvk0Var.getClass();
        return new uvk0(str, charSequence, list, list2, tvk0Var, uiStateDrawableWrapper);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvk0)) {
            return false;
        }
        uvk0 uvk0Var = (uvk0) obj;
        return jl40.l(this.a, uvk0Var.a) && jl40.l(this.b, uvk0Var.b) && jl40.l(this.c, uvk0Var.c) && jl40.l(this.d, uvk0Var.d) && jl40.l(this.e, uvk0Var.e) && jl40.l(this.f, uvk0Var.f);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        tvk0 tvk0Var = this.e;
        int hashCode = (c + (tvk0Var == null ? 0 : tvk0Var.hashCode())) * 31;
        UiStateDrawableWrapper uiStateDrawableWrapper = this.f;
        return hashCode + (uiStateDrawableWrapper != null ? uiStateDrawableWrapper.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "RobotaxiUiState(id=", this.a, ", title=", ", bullets=");
        nnm.w(t, this.c, ", buttons=", this.d, ", slider=");
        t.append(this.e);
        t.append(", image=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
