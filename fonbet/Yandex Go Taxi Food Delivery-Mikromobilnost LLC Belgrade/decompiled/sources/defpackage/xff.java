package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Collections;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.layers.domain.model.BubbleType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class xff implements dn6 {
    public static final /* synthetic */ int d = 0;
    public final String b;
    public final Integer c;

    public xff(String str, Integer num) {
        this.b = str;
        this.c = num;
    }

    @Override // defpackage.dn6
    public final int a() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // defpackage.dn6
    public final Bitmap b(Context context, yuf0 yuf0Var) {
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setUseMinimumWidth(true);
        robotoTextView.setText(this.b);
        robotoTextView.setTextColor(qje.t(xng0.textMain, context));
        robotoTextView.setTextSize(13.0f);
        robotoTextView.setTextAlignment(4);
        return yuf0Var.r(new dxu0(q5z.s(qje.u(context.getTheme(), xng0.bgMain)), null, null, 1022), Collections.singletonList(robotoTextView), null, null, BubbleType.MEDIUM_OR_LARGE, new a5f(8)).b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xff)) {
            return false;
        }
        xff xffVar = (xff) obj;
        return jl40.l(this.b, xffVar.b) && jl40.l(this.c, xffVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CurrentLocationHintModel(title=" + this.b + ", duration=" + this.c + Extension.C_BRAKE;
    }

    public xff() {
        this("", null);
    }
}
