package defpackage;

import android.os.Build;
import androidx.core.splashscreen.a;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes.dex */
public final class xrt0 {
    public final a a;

    public xrt0(FragmentActivity fragmentActivity) {
        a wrt0Var = Build.VERSION.SDK_INT >= 31 ? new wrt0(fragmentActivity) : new a(fragmentActivity);
        wrt0Var.a();
        this.a = wrt0Var;
    }
}
