package defpackage;

import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonSize;
import com.yandex.go.places.models.domain.entities.bottom_panel.BottomPanelButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ud6 {
    public final String a;
    public final String b;
    public final String c;
    public final BottomPanelButtonType d;
    public final BottomPanelButtonSize e;
    public final fr f;

    public ud6(String str, String str2, String str3, BottomPanelButtonType bottomPanelButtonType, BottomPanelButtonSize bottomPanelButtonSize, fr frVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bottomPanelButtonType;
        this.e = bottomPanelButtonSize;
        this.f = frVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud6)) {
            return false;
        }
        ud6 ud6Var = (ud6) obj;
        return jl40.l(this.a, ud6Var.a) && jl40.l(this.b, ud6Var.b) && jl40.l(this.c, ud6Var.c) && this.d == ud6Var.d && this.e == ud6Var.e && this.f.equals(ud6Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        BottomPanelButtonType bottomPanelButtonType = this.d;
        int hashCode2 = (b + (bottomPanelButtonType == null ? 0 : bottomPanelButtonType.hashCode())) * 31;
        BottomPanelButtonSize bottomPanelButtonSize = this.e;
        return this.f.hashCode() + ((hashCode2 + (bottomPanelButtonSize != null ? bottomPanelButtonSize.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("BottomPanelButton(imageUrl=", this.a, ", text=", this.b, ", accessibilityText=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(", size=");
        v.append(this.e);
        v.append(", action=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
