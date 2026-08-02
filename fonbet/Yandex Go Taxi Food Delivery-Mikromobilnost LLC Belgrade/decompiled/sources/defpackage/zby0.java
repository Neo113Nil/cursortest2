package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.UnsupportedAddressViewFactoryImpl$create$1;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class zby0 extends pjm0 {
    public final eg01 a;
    public FrameLayout b;
    public UnsupportedAddressViewFactoryImpl$create$1 c;
    public WeakReference w;
    public float x = 1.0f;
    public final xby0 y = new xby0(this, 0);
    public final yby0 z = new yby0(this);

    public zby0(eg01 eg01Var) {
        this.a = eg01Var;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        FrameLayout frameLayout = this.b;
        return frameLayout != null ? frameLayout : (ViewGroup) view;
    }

    public final void b(float f, boolean z) {
        UnsupportedAddressViewFactoryImpl$create$1 unsupportedAddressViewFactoryImpl$create$1 = this.c;
        if (unsupportedAddressViewFactoryImpl$create$1 == null) {
            return;
        }
        if (!z) {
            unsupportedAddressViewFactoryImpl$create$1.animate().cancel();
            unsupportedAddressViewFactoryImpl$create$1.setAlpha(f);
            this.x = f;
        } else {
            if (f == this.x) {
                return;
            }
            this.x = f;
            unsupportedAddressViewFactoryImpl$create$1.animate().alpha(f);
        }
    }

    public final void c(RecyclerView recyclerView) {
        x0 findViewHolderForAdapterPosition;
        int bottom;
        UnsupportedAddressViewFactoryImpl$create$1 unsupportedAddressViewFactoryImpl$create$1 = this.c;
        if (unsupportedAddressViewFactoryImpl$create$1 == null) {
            return;
        }
        Object layoutManager = recyclerView.getLayoutManager();
        gki0 fki0Var = layoutManager instanceof gki0 ? (gki0) layoutManager : layoutManager instanceof LinearLayoutManager ? new fki0((LinearLayoutManager) layoutManager) : null;
        int i = 0;
        if (fki0Var == null) {
            unsupportedAddressViewFactoryImpl$create$1.setPadding(unsupportedAddressViewFactoryImpl$create$1.getPaddingLeft(), 0, unsupportedAddressViewFactoryImpl$create$1.getPaddingRight(), unsupportedAddressViewFactoryImpl$create$1.getPaddingBottom());
            b(1.0f, false);
            return;
        }
        int b = fki0Var.b();
        if (b != -1 && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(b)) != null && (bottom = findViewHolderForAdapterPosition.a.getBottom()) >= 0) {
            i = bottom;
        }
        unsupportedAddressViewFactoryImpl$create$1.setPadding(unsupportedAddressViewFactoryImpl$create$1.getPaddingLeft(), i, unsupportedAddressViewFactoryImpl$create$1.getPaddingRight(), unsupportedAddressViewFactoryImpl$create$1.getPaddingBottom());
        b(Math.min((unsupportedAddressViewFactoryImpl$create$1.getWidth() - unsupportedAddressViewFactoryImpl$create$1.getPaddingLeft()) - unsupportedAddressViewFactoryImpl$create$1.getPaddingRight(), unsupportedAddressViewFactoryImpl$create$1.getHeight() - unsupportedAddressViewFactoryImpl$create$1.getPaddingBottom()) + i > unsupportedAddressViewFactoryImpl$create$1.getHeight() ? 0.0f : 1.0f, true);
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        Context context = viewGroup.getContext();
        eg01 eg01Var = this.a;
        eg01Var.getClass();
        UnsupportedAddressViewFactoryImpl$create$1 unsupportedAddressViewFactoryImpl$create$1 = new UnsupportedAddressViewFactoryImpl$create$1(context);
        unsupportedAddressViewFactoryImpl$create$1.setContentDescription(null);
        int r = tje.r(mrg0.go_design_l_space, context);
        unsupportedAddressViewFactoryImpl$create$1.setPadding(r, 0, r, r);
        unsupportedAddressViewFactoryImpl$create$1.applyTheme(((pwy0) eg01Var.a).getThemeType());
        this.c = unsupportedAddressViewFactoryImpl$create$1;
        frameLayout.addView(unsupportedAddressViewFactoryImpl$create$1);
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        frameLayout2.addOnLayoutChangeListener(new xby0(this, 1));
        this.b = frameLayout2;
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        WeakReference weakReference = this.w;
        RecyclerView recyclerView = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.z);
        }
        if (recyclerView != null) {
            recyclerView.removeOnLayoutChangeListener(this.y);
        }
        this.w = null;
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.ws11
    public final /* bridge */ /* synthetic */ void onUpdateState(Object obj) {
    }
}
