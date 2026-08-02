package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain.Me2MeResultPageEntity;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s910 {
    public final e910 a;
    public final Text b;
    public final ArrayList c;
    public final UnconditionalLimitWidgetEntity d;
    public final Me2MeResultPageEntity e;
    public final Me2MeResultPageEntity f;
    public final PageHeaderEntity g;

    public s910(e910 e910Var, Text text, ArrayList arrayList, UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity, Me2MeResultPageEntity me2MeResultPageEntity, Me2MeResultPageEntity me2MeResultPageEntity2, PageHeaderEntity pageHeaderEntity) {
        this.a = e910Var;
        this.b = text;
        this.c = arrayList;
        this.d = unconditionalLimitWidgetEntity;
        this.e = me2MeResultPageEntity;
        this.f = me2MeResultPageEntity2;
        this.g = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s910)) {
            return false;
        }
        s910 s910Var = (s910) obj;
        return this.a.equals(s910Var.a) && this.b.equals(s910Var.b) && this.c.equals(s910Var.c) && jl40.l(this.d, s910Var.d) && this.e.equals(s910Var.e) && this.f.equals(s910Var.f) && this.g.equals(s910Var.g);
    }

    public final int hashCode() {
        int b = ly3.b(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((b + (unconditionalLimitWidgetEntity == null ? 0 : unconditionalLimitWidgetEntity.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Me2MeDebitSuccessEntity(debitInfo=" + this.a + ", agreementsSheetTitle=" + this.b + ", agreements=" + this.c + ", failedOperationWidget=" + this.d + ", resultLoaderPage=" + this.e + ", undefinedResultPage=" + this.f + ", header=" + this.g + Extension.C_BRAKE;
    }
}
