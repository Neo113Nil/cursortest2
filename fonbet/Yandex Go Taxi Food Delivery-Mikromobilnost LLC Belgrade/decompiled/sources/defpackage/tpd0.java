package defpackage;

import android.content.Context;
import com.yandex.plus.ui.core.theme.PlusTheme;

/* loaded from: classes8.dex */
public abstract class tpd0 {
    public static final boolean a(Context context, PlusTheme plusTheme) {
        if (plusTheme != PlusTheme.DARK) {
            return plusTheme == PlusTheme.AUTO && vng.y(context);
        }
        return true;
    }
}
