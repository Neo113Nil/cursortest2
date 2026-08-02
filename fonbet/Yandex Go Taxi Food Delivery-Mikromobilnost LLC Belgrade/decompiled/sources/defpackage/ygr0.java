package defpackage;

import android.graphics.RectF;
import android.view.View;
import com.ybsdk.feature.educations.api.domain.EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ygr0 {
    public final View a;
    public final EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType b;
    public final RectF c;
    public final float[] d;

    public ygr0(View view, EducationsShadowDrawRuleEntity$EducationsShadowDrawRuleType educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType, RectF rectF, float[] fArr) {
        this.a = view;
        this.b = educationsShadowDrawRuleEntity$EducationsShadowDrawRuleType;
        this.c = rectF;
        this.d = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygr0)) {
            return false;
        }
        ygr0 ygr0Var = (ygr0) obj;
        return this.a.equals(ygr0Var.a) && this.b == ygr0Var.b && jl40.l(this.c, ygr0Var.c) && jl40.l(this.d, ygr0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewData(view=" + this.a + ", drawType=" + this.b + ", rect=" + this.c + ", cornerRadius=" + Arrays.toString(this.d) + Extension.C_BRAKE;
    }
}
