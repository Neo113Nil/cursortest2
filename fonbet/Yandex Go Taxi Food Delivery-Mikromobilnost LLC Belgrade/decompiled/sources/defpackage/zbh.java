package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import com.yandex.delivery.attrbutedtext.impl.text.base.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes11.dex */
public final class zbh implements q8s {
    public final v920 a;
    public final ofg b;

    public zbh(v920 v920Var, ofg ofgVar) {
        this.a = v920Var;
        this.b = ofgVar;
    }

    @Override // defpackage.q8s
    public final Object b(FormattedText formattedText, ThemeStyle themeStyle, ContinuationImpl continuationImpl) {
        a aVar;
        boolean b = this.b.b();
        v920 v920Var = this.a;
        v920Var.getClass();
        int i = u8s.a[themeStyle.ordinal()];
        if (i == 1) {
            aVar = b ? (a) ((i3y) v920Var.w).getValue() : (a) ((i3y) v920Var.c).getValue();
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            aVar = b ? (a) ((i3y) v920Var.y).getValue() : (a) ((i3y) v920Var.x).getValue();
        }
        return a.c(aVar, formattedText, continuationImpl);
    }
}
