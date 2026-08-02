package defpackage;

import android.content.Context;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import flex.engine.a;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class wkr implements tkr {
    public final xyg a;
    public final pey b;
    public final j190 c;
    public FrameLayout d;
    public final a e;
    public final s1r f;

    public wkr(j0g j0gVar, pey peyVar, j190 j190Var, sls slsVar) {
        this.a = j0gVar;
        this.b = peyVar;
        this.c = j190Var;
        this.e = (a) slsVar.invoke();
        s1r s1rVar = new s1r(6, this);
        this.f = s1rVar;
        j0gVar.b(s1rVar);
    }

    @Override // defpackage.tkr
    public final void hideOverlay(boolean z) {
        j190 j190Var = this.c;
        if (j190Var != null) {
            j190Var.onHide();
        }
        j0g j0gVar = (j0g) this.a;
        ViewGroup m = j0gVar.m();
        if (m != null) {
            if (z) {
                TransitionManager.beginDelayedTransition(m, new Fade().setDuration(150L));
                FrameLayout frameLayout = this.d;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            m.removeView(this.d);
            a aVar = this.e;
            gfe gfeVar = aVar.f0;
            if (gfeVar != null) {
                gfeVar.c();
            }
            aVar.i();
            LinkedHashMap linkedHashMap = (LinkedHashMap) j0gVar.a;
            ViewGroup m2 = j0gVar.m();
            List list = (List) linkedHashMap.get(m2 != null ? Integer.valueOf(m2.getId()) : null);
            if (list != null) {
                list.remove(this.f);
            }
            this.d = null;
        }
    }

    @Override // defpackage.tkr
    public final void showOverlay(ywl ywlVar) {
        int identifier;
        j190 j190Var = this.c;
        if (j190Var != null) {
            j190Var.onShow();
        }
        ViewGroup m = ((j0g) this.a).m();
        a aVar = this.e;
        if (m != null) {
            if (this.d == null) {
                FrameLayout frameLayout = new FrameLayout(m.getContext());
                frameLayout.setId(View.generateViewId());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                Context context = m.getContext();
                int identifier2 = context.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                int i = 0;
                marginLayoutParams.topMargin = identifier2 > 0 ? context.getResources().getDimensionPixelSize(identifier2) : 0;
                Context context2 = m.getContext();
                if (!ViewConfiguration.get(context2).hasPermanentMenuKey() && (identifier = context2.getResources().getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM)) > 0) {
                    i = context2.getResources().getDimensionPixelSize(identifier);
                }
                marginLayoutParams.bottomMargin = i;
                m.addView(frameLayout, -1, marginLayoutParams);
                this.d = frameLayout;
            }
            FrameLayout frameLayout2 = this.d;
            if (frameLayout2 == null) {
                ny61.g("Required value was null.");
                return;
            }
            aVar.g(frameLayout2, this.b);
        }
        if (ywlVar != null) {
            aVar.B(ywlVar, null);
        }
    }
}
