package defpackage;

import com.yandex.go.user_profile.settings.profile.presentation.SettingsProfileView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class vcr0 implements gcr0 {
    public final /* synthetic */ SettingsProfileView a;

    public vcr0(SettingsProfileView settingsProfileView) {
        this.a = settingsProfileView;
    }

    @Override // defpackage.gcr0
    public final void ea(scr0 scr0Var) {
        mfr0 mfr0Var;
        mfr0 mfr0Var2;
        mfr0 mfr0Var3;
        boolean z = scr0Var instanceof ncr0;
        SettingsProfileView settingsProfileView = this.a;
        if (z) {
            settingsProfileView.setVisibility(8);
            return;
        }
        if (!(scr0Var instanceof jcr0)) {
            w511.b();
            return;
        }
        jcr0 jcr0Var = (jcr0) scr0Var;
        settingsProfileView.setVisibility(0);
        pcr0 pcr0Var = jcr0Var.a;
        mfr0Var = settingsProfileView.binding;
        ListItemComponent listItemComponent = mfr0Var.c;
        boolean z2 = pcr0Var instanceof ocr0;
        boolean z3 = z2 && ((ocr0) pcr0Var).b;
        ocr0 ocr0Var = z2 ? (ocr0) pcr0Var : null;
        String str = ocr0Var != null ? ocr0Var.a : null;
        if (str == null) {
            str = "";
        }
        listItemComponent.setVisibility(z2 ? 0 : 8);
        if (z2) {
            listItemComponent.setTitle(str);
            listItemComponent.setEnabled(z3);
            listItemComponent.setTrailMode(z3 ? 2 : 0);
        }
        rcr0 rcr0Var = jcr0Var.b;
        mfr0Var2 = settingsProfileView.binding;
        ListItemComponent listItemComponent2 = mfr0Var2.d;
        boolean z4 = rcr0Var instanceof qcr0;
        boolean z5 = z4 && ((qcr0) rcr0Var).b;
        qcr0 qcr0Var = z4 ? (qcr0) rcr0Var : null;
        String str2 = qcr0Var != null ? qcr0Var.a : null;
        String str3 = str2 != null ? str2 : "";
        listItemComponent2.setVisibility(z4 ? 0 : 8);
        if (z4) {
            listItemComponent2.setTitle(str3);
            listItemComponent2.setEnabled(z5);
            listItemComponent2.setTrailMode(z5 ? 2 : 0);
        }
        mcr0 mcr0Var = jcr0Var.c;
        mfr0Var3 = settingsProfileView.binding;
        ListItemComponent listItemComponent3 = mfr0Var3.b;
        if (mcr0Var instanceof lcr0) {
            lcr0 lcr0Var = (lcr0) mcr0Var;
            listItemComponent3.setTitle(lcr0Var.a);
            listItemComponent3.setSubtitle(lcr0Var.b);
        } else if (!(mcr0Var instanceof kcr0)) {
            w511.b();
        } else {
            listItemComponent3.setTitle(kyh0.settings_add_email);
            listItemComponent3.setSubtitle((CharSequence) null);
        }
    }
}
