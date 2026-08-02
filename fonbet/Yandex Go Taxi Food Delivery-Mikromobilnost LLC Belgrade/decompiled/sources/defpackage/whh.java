package defpackage;

import android.graphics.Typeface;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontStyle;
import com.yandex.plus.plaquesdk.plaque.api.models.FormattedText$FontWeight;
import com.yandex.plus.plaquesdk.utils.StyledTypefaceSpan;

/* loaded from: classes2.dex */
public final class whh implements n8s {
    @Override // defpackage.n8s
    public final StyledTypefaceSpan h(ContextThemeWrapper contextThemeWrapper, FormattedText$FontWeight formattedText$FontWeight, FormattedText$FontStyle formattedText$FontStyle) {
        int i;
        Typeface b;
        int i2 = vhh.a[formattedText$FontStyle.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                w511.b();
                return null;
            }
        } else {
            i = 0;
        }
        switch (formattedText$FontWeight == null ? -1 : vhh.b[formattedText$FontWeight.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
                b = wuj0.b(j5h0.ys_text_regular, contextThemeWrapper);
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                b = wuj0.b(j5h0.ys_text_medium, contextThemeWrapper);
                break;
        }
        return new StyledTypefaceSpan(Typeface.create(b, i), i);
    }
}
