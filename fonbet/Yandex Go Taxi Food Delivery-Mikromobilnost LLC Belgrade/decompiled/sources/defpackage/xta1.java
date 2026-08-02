package defpackage;

import android.graphics.ColorFilter;
import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.gms.internal.play_billing.zzcv;
import java.util.Iterator;

/* loaded from: classes15.dex */
public abstract class xta1 {
    public static final ColorFilter a(wec wecVar) {
        return wecVar.a;
    }

    public static WindowInsets b(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, FragmentContainerView fragmentContainerView, WindowInsets windowInsets) {
        return onApplyWindowInsetsListener.onApplyWindowInsets(fragmentContainerView, windowInsets);
    }

    public static int c(zzcv zzcvVar) {
        Iterator it = zzcvVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }
}
