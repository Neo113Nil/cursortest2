package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vas {
    public final Text.Constant a;
    public final PageHeaderEntity b;
    public final Text.Constant c;
    public final Text.Constant d;
    public final ThemedImageUrlEntity e;
    public final ActionButtonEntity f;
    public final String g;
    public final ArrayList h;

    public vas(Text.Constant constant, PageHeaderEntity pageHeaderEntity, Text.Constant constant2, Text.Constant constant3, ThemedImageUrlEntity themedImageUrlEntity, ActionButtonEntity actionButtonEntity, String str, ArrayList arrayList) {
        this.a = constant;
        this.b = pageHeaderEntity;
        this.c = constant2;
        this.d = constant3;
        this.e = themedImageUrlEntity;
        this.f = actionButtonEntity;
        this.g = str;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vas)) {
            return false;
        }
        vas vasVar = (vas) obj;
        return this.a.equals(vasVar.a) && this.b.equals(vasVar.b) && this.c.equals(vasVar.c) && this.d.equals(vasVar.d) && this.e.equals(vasVar.e) && this.f.equals(vasVar.f) && jl40.l(this.g, vasVar.g) && this.h.equals(vasVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + xvz.c(this.e, xvz.d(this.d, xvz.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31)) * 31;
        String str = this.g;
        return this.h.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "FpsPayEnrollSuccessEntity(agreementsSheetTitle=" + this.a + ", header=" + this.b + ", title=" + this.c + ", description=" + this.d + ", image=" + this.e + ", button=" + this.f + ", buttonDescription=" + this.g + ", agreements=" + this.h + Extension.C_BRAKE;
    }
}
