package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class zh0 implements LvHlPNBd {
    public boolean Ey6iv0m0;
    public final xh0 FySoLYna;
    public boolean I5GHvsYW;
    public yg0 KlHjfFWx;
    public ActionBarOverlayLayout MdtA4re8;
    public Context NCTxEWno;
    public final ArrayList OnDfzHZD;
    public boolean OxcuoDLp;
    public ActionBarContextView P7K7Inc8;
    public boolean Qr9iLBAD;
    public final xh0 RXQxj5Oe;
    public sa VgvYg0wo;
    public boolean amk52bBQ;
    public final View b2ZJblxo;
    public yh0 eVhOlqcC;
    public final ya0 gjV1z5T1;
    public yh0 jb9XjC4I;
    public mcXgUFR8 k3x7lurq;
    public boolean lDXGDhIF;
    public boolean ow5vqvCr;
    public Context qoPGr6Ce;
    public boolean sjUBp5pO;
    public ActionBarContainer wxUZMvaN;
    public int ygLcUYwZ;
    public static final AccelerateInterpolator WYNAV5pd = new AccelerateInterpolator();
    public static final DecelerateInterpolator DK9slbsy = new DecelerateInterpolator();

    public zh0(Activity activity, boolean z) {
        new ArrayList();
        this.OnDfzHZD = new ArrayList();
        this.ygLcUYwZ = 0;
        this.lDXGDhIF = true;
        this.amk52bBQ = true;
        this.RXQxj5Oe = new xh0(this, 0);
        this.FySoLYna = new xh0(this, 1);
        this.gjV1z5T1 = new ya0(5, this);
        View decorView = activity.getWindow().getDecorView();
        MdtA4re8(decorView);
        if (z) {
            return;
        }
        this.b2ZJblxo = decorView.findViewById(R.id.content);
    }

    public final void MdtA4re8(View view) {
        sa wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.kolosta.rejin.jilosa.R.id.decor_content_parent);
        this.MdtA4re8 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.kolosta.rejin.jilosa.R.id.action_bar);
        if (findViewById instanceof sa) {
            wrapper = (sa) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.VgvYg0wo = wrapper;
        this.P7K7Inc8 = (ActionBarContextView) view.findViewById(com.kolosta.rejin.jilosa.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.kolosta.rejin.jilosa.R.id.action_bar_container);
        this.wxUZMvaN = actionBarContainer;
        sa saVar = this.VgvYg0wo;
        if (saVar == null || this.P7K7Inc8 == null || actionBarContainer == null) {
            m1.Ey6iv0m0(zh0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((dd0) saVar).qoPGr6Ce.getContext();
        this.qoPGr6Ce = context;
        if ((((dd0) this.VgvYg0wo).NCTxEWno & 4) != 0) {
            this.Qr9iLBAD = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.VgvYg0wo.getClass();
        VgvYg0wo(context.getResources().getBoolean(com.kolosta.rejin.jilosa.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.qoPGr6Ce.obtainStyledAttributes(null, z00.qoPGr6Ce, com.kolosta.rejin.jilosa.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.MdtA4re8;
            if (!actionBarOverlayLayout2.Qr9iLBAD) {
                m1.Ey6iv0m0("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.I5GHvsYW = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.wxUZMvaN;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final Context NCTxEWno() {
        Context context = this.NCTxEWno;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.qoPGr6Ce.getTheme().resolveAttribute(com.kolosta.rejin.jilosa.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.qoPGr6Ce, i);
            this.NCTxEWno = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.qoPGr6Ce;
        this.NCTxEWno = context2;
        return context2;
    }

    public final void P7K7Inc8(boolean z) {
        boolean z2 = this.OxcuoDLp || !this.sjUBp5pO;
        boolean z3 = this.amk52bBQ;
        ya0 ya0Var = this.gjV1z5T1;
        View view = this.b2ZJblxo;
        if (!z2) {
            if (z3) {
                this.amk52bBQ = false;
                yg0 yg0Var = this.KlHjfFWx;
                if (yg0Var != null) {
                    yg0Var.qoPGr6Ce();
                }
                int i = this.ygLcUYwZ;
                xh0 xh0Var = this.RXQxj5Oe;
                if (i != 0 || (!this.Ey6iv0m0 && !z)) {
                    xh0Var.qoPGr6Ce();
                    return;
                }
                this.wxUZMvaN.setAlpha(1.0f);
                this.wxUZMvaN.setTransitioning(true);
                yg0 yg0Var2 = new yg0();
                float f = -this.wxUZMvaN.getHeight();
                if (z) {
                    this.wxUZMvaN.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                xg0 qoPGr6Ce = hg0.qoPGr6Ce(this.wxUZMvaN);
                qoPGr6Ce.VgvYg0wo(f);
                View view2 = (View) qoPGr6Ce.qoPGr6Ce.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(ya0Var != null ? new bc(ya0Var, view2) : null);
                }
                boolean z4 = yg0Var2.VgvYg0wo;
                ArrayList arrayList = yg0Var2.qoPGr6Ce;
                if (!z4) {
                    arrayList.add(qoPGr6Ce);
                }
                if (this.lDXGDhIF && view != null) {
                    xg0 qoPGr6Ce2 = hg0.qoPGr6Ce(view);
                    qoPGr6Ce2.VgvYg0wo(f);
                    if (!yg0Var2.VgvYg0wo) {
                        arrayList.add(qoPGr6Ce2);
                    }
                }
                boolean z5 = yg0Var2.VgvYg0wo;
                if (!z5) {
                    yg0Var2.MdtA4re8 = WYNAV5pd;
                }
                if (!z5) {
                    yg0Var2.NCTxEWno = 250L;
                }
                if (!z5) {
                    yg0Var2.wxUZMvaN = xh0Var;
                }
                this.KlHjfFWx = yg0Var2;
                yg0Var2.NCTxEWno();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.amk52bBQ = true;
        yg0 yg0Var3 = this.KlHjfFWx;
        if (yg0Var3 != null) {
            yg0Var3.qoPGr6Ce();
        }
        this.wxUZMvaN.setVisibility(0);
        int i2 = this.ygLcUYwZ;
        xh0 xh0Var2 = this.FySoLYna;
        if (i2 == 0 && (this.Ey6iv0m0 || z)) {
            this.wxUZMvaN.setTranslationY(0.0f);
            float f2 = -this.wxUZMvaN.getHeight();
            if (z) {
                this.wxUZMvaN.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.wxUZMvaN.setTranslationY(f2);
            yg0 yg0Var4 = new yg0();
            xg0 qoPGr6Ce3 = hg0.qoPGr6Ce(this.wxUZMvaN);
            qoPGr6Ce3.VgvYg0wo(0.0f);
            View view3 = (View) qoPGr6Ce3.qoPGr6Ce.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(ya0Var != null ? new bc(ya0Var, view3) : null);
            }
            boolean z6 = yg0Var4.VgvYg0wo;
            ArrayList arrayList2 = yg0Var4.qoPGr6Ce;
            if (!z6) {
                arrayList2.add(qoPGr6Ce3);
            }
            if (this.lDXGDhIF && view != null) {
                view.setTranslationY(f2);
                xg0 qoPGr6Ce4 = hg0.qoPGr6Ce(view);
                qoPGr6Ce4.VgvYg0wo(0.0f);
                if (!yg0Var4.VgvYg0wo) {
                    arrayList2.add(qoPGr6Ce4);
                }
            }
            boolean z7 = yg0Var4.VgvYg0wo;
            if (!z7) {
                yg0Var4.MdtA4re8 = DK9slbsy;
            }
            if (!z7) {
                yg0Var4.NCTxEWno = 250L;
            }
            if (!z7) {
                yg0Var4.wxUZMvaN = xh0Var2;
            }
            this.KlHjfFWx = yg0Var4;
            yg0Var4.NCTxEWno();
        } else {
            this.wxUZMvaN.setAlpha(1.0f);
            this.wxUZMvaN.setTranslationY(0.0f);
            if (this.lDXGDhIF && view != null) {
                view.setTranslationY(0.0f);
            }
            xh0Var2.qoPGr6Ce();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.MdtA4re8;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public final void VgvYg0wo(boolean z) {
        if (z) {
            this.wxUZMvaN.setTabContainer(null);
            ((dd0) this.VgvYg0wo).getClass();
        } else {
            ((dd0) this.VgvYg0wo).getClass();
            this.wxUZMvaN.setTabContainer(null);
        }
        this.VgvYg0wo.getClass();
        ((dd0) this.VgvYg0wo).qoPGr6Ce.setCollapsible(false);
        this.MdtA4re8.setHasNonEmbeddedTabs(false);
    }

    public final void qoPGr6Ce(boolean z) {
        xg0 jb9XjC4I;
        xg0 xg0Var;
        boolean z2 = this.OxcuoDLp;
        if (z) {
            if (!z2) {
                this.OxcuoDLp = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.MdtA4re8;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                P7K7Inc8(false);
            }
        } else if (z2) {
            this.OxcuoDLp = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.MdtA4re8;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            P7K7Inc8(false);
        }
        boolean isLaidOut = this.wxUZMvaN.isLaidOut();
        sa saVar = this.VgvYg0wo;
        if (!isLaidOut) {
            if (z) {
                ((dd0) saVar).qoPGr6Ce.setVisibility(4);
                this.P7K7Inc8.setVisibility(0);
                return;
            } else {
                ((dd0) saVar).qoPGr6Ce.setVisibility(0);
                this.P7K7Inc8.setVisibility(8);
                return;
            }
        }
        if (z) {
            dd0 dd0Var = (dd0) saVar;
            jb9XjC4I = hg0.qoPGr6Ce(dd0Var.qoPGr6Ce);
            jb9XjC4I.qoPGr6Ce(0.0f);
            jb9XjC4I.MdtA4re8(100L);
            jb9XjC4I.wxUZMvaN(new cd0(dd0Var, 4));
            xg0Var = this.P7K7Inc8.jb9XjC4I(0, 200L);
        } else {
            dd0 dd0Var2 = (dd0) saVar;
            xg0 qoPGr6Ce = hg0.qoPGr6Ce(dd0Var2.qoPGr6Ce);
            qoPGr6Ce.qoPGr6Ce(1.0f);
            qoPGr6Ce.MdtA4re8(200L);
            qoPGr6Ce.wxUZMvaN(new cd0(dd0Var2, 0));
            jb9XjC4I = this.P7K7Inc8.jb9XjC4I(8, 100L);
            xg0Var = qoPGr6Ce;
        }
        yg0 yg0Var = new yg0();
        ArrayList arrayList = yg0Var.qoPGr6Ce;
        arrayList.add(jb9XjC4I);
        View view = (View) jb9XjC4I.qoPGr6Ce.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) xg0Var.qoPGr6Ce.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(xg0Var);
        yg0Var.NCTxEWno();
    }

    public final void wxUZMvaN(boolean z) {
        if (this.Qr9iLBAD) {
            return;
        }
        int i = z ? 4 : 0;
        dd0 dd0Var = (dd0) this.VgvYg0wo;
        int i2 = dd0Var.NCTxEWno;
        this.Qr9iLBAD = true;
        dd0Var.qoPGr6Ce((i & 4) | (i2 & (-5)));
    }

    public zh0(Dialog dialog) {
        new ArrayList();
        this.OnDfzHZD = new ArrayList();
        this.ygLcUYwZ = 0;
        this.lDXGDhIF = true;
        this.amk52bBQ = true;
        this.RXQxj5Oe = new xh0(this, 0);
        this.FySoLYna = new xh0(this, 1);
        this.gjV1z5T1 = new ya0(5, this);
        MdtA4re8(dialog.getWindow().getDecorView());
    }
}
