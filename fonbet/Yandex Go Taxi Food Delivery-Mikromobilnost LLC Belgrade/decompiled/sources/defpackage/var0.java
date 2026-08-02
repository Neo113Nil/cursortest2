package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.settings.mvp.SettingsModalView;
import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class var0 implements dbr0 {
    public final /* synthetic */ SettingsModalView a;

    public var0(SettingsModalView settingsModalView) {
        this.a = settingsModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        yar0 binding;
        yar0 binding2;
        yar0 binding3;
        yar0 binding4;
        yar0 binding5;
        yar0 binding6;
        yar0 binding7;
        yar0 binding8;
        wbr0 wbr0Var;
        as21 as21Var;
        View view;
        yar0 binding9;
        yar0 binding10;
        yar0 binding11;
        yar0 binding12;
        yar0 binding13;
        wbr0 wbr0Var2;
        oer0 oer0Var = (oer0) obj;
        zdr0 zdr0Var = oer0Var.a;
        ner0 ner0Var = oer0Var.i;
        boolean l = jl40.l(zdr0Var, zdr0.b);
        SettingsModalView settingsModalView = this.a;
        binding = settingsModalView.getBinding();
        binding.c.setVisibility(l ? 0 : 8);
        binding2 = settingsModalView.getBinding();
        binding2.b.setVisibility(l ? 0 : 8);
        a8h a8hVar = oer0Var.c;
        binding3 = settingsModalView.getBinding();
        binding3.y.setVisibility(a8hVar != null ? 0 : 8);
        binding4 = settingsModalView.getBinding();
        binding4.y.setTitle(a8hVar != null ? a8hVar.a : null);
        binding5 = settingsModalView.getBinding();
        binding5.y.setSubtitle(a8hVar != null ? a8hVar.b : null);
        r8r0 r8r0Var = oer0Var.b;
        binding6 = settingsModalView.getBinding();
        binding6.d.setVisibility(r8r0Var.a ? 0 : 8);
        if (r8r0Var.a) {
            binding13 = settingsModalView.getBinding();
            ListItemComponent listItemComponent = binding13.d;
            wbr0Var2 = settingsModalView.presenter;
            listItemComponent.setDebounceClickListener(new par0(wbr0Var2, 3));
            listItemComponent.setSubtitle(r8r0Var.b);
            listItemComponent.setTitle(kyh0.settings_theme_switch);
            listItemComponent.invalidateComponent();
        }
        boolean z = oer0Var.e;
        binding7 = settingsModalView.getBinding();
        binding7.f.setCheckedWithAnimation(z);
        p3g0 p3g0Var = oer0Var.d;
        if (p3g0Var.b) {
            String Y = d6z.Y(p3g0Var, "other");
            String Y2 = d6z.Y(p3g0Var, "notifications");
            binding12 = settingsModalView.getBinding();
            settingsModalView.updatePushSettingsVisible(true);
            ListItemSwitchComponent listItemSwitchComponent = binding12.p;
            ListTitleComponent listTitleComponent = binding12.s;
            listItemSwitchComponent.setVisibility(8);
            ListItemComponent listItemComponent2 = binding12.o;
            listItemComponent2.setVisibility(Y.length() > 0 ? 0 : 8);
            listItemComponent2.setTitle(Y);
            listTitleComponent.setVisibility(Y2.length() > 0 ? 0 : 8);
            listTitleComponent.setTitle(Y2);
            b.q(listTitleComponent, true);
        } else {
            binding8 = settingsModalView.getBinding();
            ListItemSwitchComponent listItemSwitchComponent2 = binding8.p;
            listItemSwitchComponent2.setVisibility(0);
            listItemSwitchComponent2.setOnClickListener(new a1i(listItemSwitchComponent2, 6));
            wbr0Var = settingsModalView.presenter;
            listItemSwitchComponent2.setOnCheckedListener(new uar0(wbr0Var, 0));
            as21Var = settingsModalView.userPreferences;
            listItemSwitchComponent2.setChecked(as21Var.a("FIELD_DONT_SHOW_PROMO_PUSHES", false));
            view = settingsModalView.pushSystemDisabledView;
            if (view != null) {
                view.setVisibility(8);
            }
            settingsModalView.updatePushSettingsVisible(false);
        }
        MainMenuLogOutUiState mainMenuLogOutUiState = oer0Var.f;
        String str = oer0Var.g;
        binding9 = settingsModalView.getBinding();
        boolean z2 = mainMenuLogOutUiState != MainMenuLogOutUiState.NONE;
        CardDivider cardDivider = binding9.m;
        ListItemComponent listItemComponent3 = binding9.n;
        cardDivider.setVisibility(z2 ? 0 : 8);
        binding9.l.setVisibility(z2 ? 0 : 8);
        listItemComponent3.setSubtitle(str);
        int i = tar0.a[mainMenuLogOutUiState.ordinal()];
        if (i == 1) {
            listItemComponent3.setEnabled(true);
            listItemComponent3.setContentAlpha(1.0f);
        } else if (i == 2) {
            listItemComponent3.setEnabled(false);
            listItemComponent3.setContentAlpha(0.5f);
        } else if (i != 3) {
            w511.b();
            return;
        }
        binding10 = settingsModalView.getBinding();
        binding10.v.setVisibility(0);
        binding10.e.setVisibility(oer0Var.h ? 0 : 8);
        binding10.i.setVisibility(ner0Var.a ? 0 : 8);
        binding11 = settingsModalView.getBinding();
        ListItemSwitchComponent listItemSwitchComponent3 = binding11.i;
        listItemSwitchComponent3.setCheckedWithAnimation(ner0Var.b);
        listItemSwitchComponent3.setTitle(ner0Var.c);
        listItemSwitchComponent3.hideSubtitle();
    }
}
