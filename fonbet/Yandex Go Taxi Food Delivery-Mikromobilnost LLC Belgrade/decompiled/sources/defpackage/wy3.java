package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.CommonSheetEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wy3 {
    public final ThemedImageUrlEntity a;
    public final Text b;
    public final Text c;
    public final ActionButtonEntity d;
    public final ActionButtonEntity e;
    public final CommonSheetEntity f;
    public final AutoTopupLogoResultStatus g;
    public final boolean h;
    public final ba4 i;
    public final Text j;
    public final List k;

    public /* synthetic */ wy3(ThemedImageUrlEntity themedImageUrlEntity, Text.Constant constant, Text.Constant constant2, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, AutoTopupLogoResultStatus autoTopupLogoResultStatus, List list, int i) {
        this(themedImageUrlEntity, constant, constant2, actionButtonEntity, actionButtonEntity2, null, autoTopupLogoResultStatus, (i & 128) == 0, null, null, list);
    }

    public static wy3 a(wy3 wy3Var, ThemedImageUrlEntity themedImageUrlEntity, Text text, Text text2, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, CommonSheetEntity commonSheetEntity, AutoTopupLogoResultStatus autoTopupLogoResultStatus, boolean z, ba4 ba4Var, Text text3, int i) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = wy3Var.a;
        }
        ThemedImageUrlEntity themedImageUrlEntity2 = themedImageUrlEntity;
        if ((i & 2) != 0) {
            text = wy3Var.b;
        }
        Text text4 = text;
        if ((i & 4) != 0) {
            text2 = wy3Var.c;
        }
        Text text5 = text2;
        ActionButtonEntity actionButtonEntity3 = (i & 8) != 0 ? wy3Var.d : actionButtonEntity;
        ActionButtonEntity actionButtonEntity4 = (i & 16) != 0 ? wy3Var.e : actionButtonEntity2;
        CommonSheetEntity commonSheetEntity2 = (i & 32) != 0 ? wy3Var.f : commonSheetEntity;
        AutoTopupLogoResultStatus autoTopupLogoResultStatus2 = (i & 64) != 0 ? wy3Var.g : autoTopupLogoResultStatus;
        boolean z2 = (i & 128) != 0 ? wy3Var.h : z;
        ba4 ba4Var2 = (i & 256) != 0 ? wy3Var.i : ba4Var;
        Text text6 = (i & 512) != 0 ? wy3Var.j : text3;
        List list = wy3Var.k;
        wy3Var.getClass();
        return new wy3(themedImageUrlEntity2, text4, text5, actionButtonEntity3, actionButtonEntity4, commonSheetEntity2, autoTopupLogoResultStatus2, z2, ba4Var2, text6, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy3)) {
            return false;
        }
        wy3 wy3Var = (wy3) obj;
        return jl40.l(this.a, wy3Var.a) && jl40.l(this.b, wy3Var.b) && jl40.l(this.c, wy3Var.c) && jl40.l(this.d, wy3Var.d) && jl40.l(this.e, wy3Var.e) && jl40.l(this.f, wy3Var.f) && this.g == wy3Var.g && this.h == wy3Var.h && jl40.l(this.i, wy3Var.i) && jl40.l(this.j, wy3Var.j) && jl40.l(this.k, wy3Var.k);
    }

    public final int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.a;
        int hashCode = (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.d;
        int hashCode4 = (hashCode3 + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity2 = this.e;
        int hashCode5 = (hashCode4 + (actionButtonEntity2 == null ? 0 : actionButtonEntity2.hashCode())) * 31;
        CommonSheetEntity commonSheetEntity = this.f;
        int e = unr0.e((this.g.hashCode() + ((hashCode5 + (commonSheetEntity == null ? 0 : commonSheetEntity.hashCode())) * 31)) * 31, 31, this.h);
        ba4 ba4Var = this.i;
        int hashCode6 = (e + (ba4Var == null ? 0 : ba4Var.hashCode())) * 31;
        Text text3 = this.j;
        int hashCode7 = (hashCode6 + (text3 == null ? 0 : text3.hashCode())) * 31;
        List list = this.k;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopupResultState(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", primaryButton=");
        sb.append(this.d);
        sb.append(", secondaryButton=");
        sb.append(this.e);
        sb.append(", appNotFoundSheet=");
        sb.append(this.f);
        sb.append(", status=");
        sb.append(this.g);
        sb.append(", shouldShowSkeletons=");
        sb.append(this.h);
        sb.append(", autotopupResultPaymentData=");
        sb.append(this.i);
        sb.append(", amount=");
        sb.append(this.j);
        sb.append(", resultAnalyticsTypes=");
        return ly3.s(sb, this.k, Extension.C_BRAKE);
    }

    public wy3(ThemedImageUrlEntity themedImageUrlEntity, Text text, Text text2, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, CommonSheetEntity commonSheetEntity, AutoTopupLogoResultStatus autoTopupLogoResultStatus, boolean z, ba4 ba4Var, Text text3, List list) {
        this.a = themedImageUrlEntity;
        this.b = text;
        this.c = text2;
        this.d = actionButtonEntity;
        this.e = actionButtonEntity2;
        this.f = commonSheetEntity;
        this.g = autoTopupLogoResultStatus;
        this.h = z;
        this.i = ba4Var;
        this.j = text3;
        this.k = list;
    }
}
