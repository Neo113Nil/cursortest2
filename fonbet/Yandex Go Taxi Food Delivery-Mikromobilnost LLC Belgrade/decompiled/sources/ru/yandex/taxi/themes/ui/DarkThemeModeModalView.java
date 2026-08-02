package ru.yandex.taxi.themes.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.styling.router.a;
import defpackage.a230;
import defpackage.cma1;
import defpackage.cx7;
import defpackage.dob1;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.fvy0;
import defpackage.gkh0;
import defpackage.j9f;
import defpackage.jc4;
import defpackage.k5;
import defpackage.mfg;
import defpackage.nfg;
import defpackage.ny61;
import defpackage.oxe;
import defpackage.pay0;
import defpackage.pz40;
import defpackage.qfg;
import defpackage.sk7;
import defpackage.w7h0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.themes.ThemeChangeMode;
import ru.yandex.taxi.themes.evgen.DarkThemeSwitcherAnalytics$Theme;
import ru.yandex.taxi.themes.evgen.DarkThemeSwitcherAnalytics$ThemeState;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;
import ru.yandex.taxi.widget.BindingModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\bB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/themes/ui/DarkThemeModeModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lnfg;", "Lnwy0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/themes/ThemeChangeMode;", "actualValue", "Lmfg;", "onClickCallback", "", "autoModeEnabled", "systemThemeEnabled", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/themes/ThemeChangeMode;Lmfg;ZZ)V", "themeChangeMode", "selected", "Landroid/view/View;", "getThemeModeItemView", "(Lru/yandex/taxi/themes/ThemeChangeMode;Z)Landroid/view/View;", "La230;", "insetsType", "()La230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnfg;", "Lmfg;", "Landroid/widget/LinearLayout;", "optionsList", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/ToolbarComponent;", "Lru/yandex/taxi/design/ListItemCheckComponent;", "selectedView", "Lru/yandex/taxi/design/ListItemCheckComponent;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DarkThemeModeModalView extends BindingModalView<nfg> {
    private final mfg onClickCallback;
    private final LinearLayout optionsList;
    private ListItemCheckComponent selectedView;
    private final ToolbarComponent toolbar;

    public DarkThemeModeModalView(Context context, ThemeChangeMode themeChangeMode, mfg mfgVar, boolean z, boolean z2) {
        super(context);
        this.onClickCallback = mfgVar;
        this.optionsList = getBinding().b;
        this.toolbar = getBinding().c;
        for (ThemeChangeMode themeChangeMode2 : ThemeChangeMode.a()) {
            if (z || themeChangeMode2 != ThemeChangeMode.AUTO) {
                if (z2 || themeChangeMode2 != ThemeChangeMode.SYSTEM) {
                    this.optionsList.addView(getThemeModeItemView(themeChangeMode2, themeChangeMode == themeChangeMode2));
                }
            }
        }
        this.toolbar.setOnNavigationClickListener(new oxe(8, this));
        this.toolbar.requestAccessibilityFocus();
    }

    private final View getThemeModeItemView(ThemeChangeMode themeChangeMode, boolean selected) {
        ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(this.optionsList.getContext(), null, 0, 6, null);
        listItemCheckComponent.setBackgroundResource(dzg0.bg_main_ripple);
        if (selected) {
            listItemCheckComponent.setChecked(true);
            this.selectedView = listItemCheckComponent;
        }
        listItemCheckComponent.setOnClickListener(new k5(25, this, themeChangeMode));
        listItemCheckComponent.setTitle(dob1.a(themeChangeMode));
        return listItemCheckComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getThemeModeItemView$lambda$1(DarkThemeModeModalView darkThemeModeModalView, ThemeChangeMode themeChangeMode, View view) {
        AlertDialog parentView;
        ListItemCheckComponent listItemCheckComponent = darkThemeModeModalView.selectedView;
        if (view == listItemCheckComponent || !(view instanceof ListItemCheckComponent)) {
            return;
        }
        if (listItemCheckComponent != null) {
            listItemCheckComponent.setChecked(false);
        }
        ListItemCheckComponent listItemCheckComponent2 = (ListItemCheckComponent) view;
        listItemCheckComponent2.setChecked(true);
        darkThemeModeModalView.selectedView = listItemCheckComponent2;
        sk7 sk7Var = (sk7) darkThemeModeModalView.onClickCallback;
        a aVar = (a) sk7Var.b;
        pay0 pay0Var = aVar.J;
        pay0Var.getClass();
        pay0Var.a.setValue(pay0Var, pay0.e[0], themeChangeMode.getId());
        r0 r0Var = (r0) ((pz40) pay0Var.d.getValue());
        r0Var.getClass();
        AlertDialog alertDialog = null;
        r0Var.m(null, themeChangeMode);
        fvy0 fvy0Var = aVar.H;
        jc4 jc4Var = fvy0Var.d;
        DarkThemeSwitcherAnalytics$ThemeState b = fvy0.b(themeChangeMode);
        DarkThemeSwitcherAnalytics$Theme a = fvy0Var.a();
        jc4Var.getClass();
        HashMap hashMap = new HashMap();
        if (a != null) {
            hashMap.put("system_theme", a.getEventValue());
        }
        if (b != null) {
            hashMap.put("theme_state", b.getEventValue());
        }
        jc4Var.a.a("DarkThemeSwitcher.Tapped", hashMap, 1, new HashMap());
        if (themeChangeMode != ThemeChangeMode.LIGHT) {
            qfg qfgVar = aVar.M;
            Activity activity = (Activity) sk7Var.c;
            DarkThemeSwitchExperiment darkThemeSwitchExperiment = (DarkThemeSwitchExperiment) sk7Var.w;
            cx7 cx7Var = new cx7(27, aVar);
            qfgVar.getClass();
            DarkThemeSwitchExperiment.a aVar2 = darkThemeSwitchExperiment.c;
            if (aVar2 != null) {
                String str = aVar2.a;
                String str2 = aVar2.c;
                String str3 = aVar2.b;
                if (!evu0.J(str) && !evu0.J(aVar2.d) && !evu0.J(str3) && !evu0.J(str2)) {
                    alertDialog = new AlertDialog(activity).setMessage(str).setPositiveButton(str3, new j9f(21, cx7Var, aVar2)).setNegativeButton(str2);
                }
            }
            if (alertDialog == null || (parentView = alertDialog.setParentView(darkThemeModeModalView)) == null) {
                return;
            }
            parentView.show();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public nfg bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gkh0.dark_theme_mode_modal_view, parent, false);
        int i = w7h0.options_list;
        LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
        if (linearLayout != null) {
            i = w7h0.toolbar;
            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
            if (toolbarComponent != null) {
                return new nfg((LinearLayout) inflate, linearLayout, toolbarComponent);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public a230 insetsType() {
        return new a230(3, new DarkThemeModeModalView$insetsType$1(getBinding(), nfg.class, "toolbar", "getToolbar()Lru/yandex/taxi/design/ToolbarComponent;", 0), new DarkThemeModeModalView$insetsType$2(getBinding(), nfg.class, "optionsList", "getOptionsList()Landroid/widget/LinearLayout;", 0));
    }
}
