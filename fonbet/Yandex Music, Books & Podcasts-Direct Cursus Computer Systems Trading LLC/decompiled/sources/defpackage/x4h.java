package defpackage;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class x4h {
    public static final xfp a = new xfp("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static yci b(Function1 function1, Function1 function12, utk utkVar) {
        return a() ? new MagnifierElement(function1, function12, utkVar) : vci.a;
    }
}
