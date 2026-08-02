package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yandex.div.core.Div2Context;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.divkit.internal.ui.DivContextThemeWrapper;
import com.ybsdk.feature.divkit.internal.ui.DivLayoutInflaterFactory;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;

/* loaded from: classes3.dex */
public abstract class qx21 {
    public static final LayoutInflater a(FrameLayout frameLayout, boolean z) {
        Div2Context div2Context;
        Context context = frameLayout.getContext();
        DivContextThemeWrapper divContextThemeWrapper = context instanceof DivContextThemeWrapper ? (DivContextThemeWrapper) context : null;
        if (divContextThemeWrapper == null || (div2Context = divContextThemeWrapper.getDivContext()) == null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(frameLayout.getContext(), n1i0.YbSdkDivKitTextStyle);
            ivk ivkVar = pxk.a;
            Div2Context div2Context2 = new Div2Context(contextThemeWrapper, pxk.a(frameLayout.getContext(), new kac(frameLayout.getContext(), 2, z), false, 12), 0, null, 4, null);
            c(div2Context2);
            div2Context = div2Context2;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(div2Context.getBaseContext()).cloneInContext(div2Context);
        cloneInContext.setFactory2(new DivLayoutInflaterFactory(div2Context));
        return cloneInContext;
    }

    public static final void b(OrientationAwareRecyclerView orientationAwareRecyclerView) {
        b.t(orientationAwareRecyclerView, new mx21());
    }

    public static final void c(Div2Context div2Context) {
        gnl gnlVar;
        boolean f = lob1.f(div2Context);
        if (f) {
            gnlVar = gnl.c;
        } else {
            if (f) {
                w511.b();
                return;
            }
            gnlVar = gnl.d;
        }
        ij91.c(div2Context, gnlVar);
        ij91.c(div2Context, cnl.c);
        ij91.c(div2Context, new cnl(0.0f, 3));
        ij91.c(div2Context, new cnl(0.0f, 2));
        ij91.c(div2Context, new cnl(0.0f, 1));
        ij91.c(div2Context, new cnl(div2Context.getResources().getDisplayMetrics().widthPixels / div2Context.getResources().getDisplayMetrics().density, 5));
        ij91.c(div2Context, new cnl(div2Context.getResources().getDisplayMetrics().heightPixels / div2Context.getResources().getDisplayMetrics().density, 4));
    }
}
