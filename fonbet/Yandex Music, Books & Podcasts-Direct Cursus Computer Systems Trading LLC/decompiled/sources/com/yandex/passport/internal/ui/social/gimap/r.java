package com.yandex.passport.internal.ui.social.gimap;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.passport.R;

/* loaded from: classes4.dex */
public class r extends m {
    public static final /* synthetic */ int y = 0;

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final p G(p pVar) {
        o L = L();
        pVar.getClass();
        o oVar = pVar.d;
        String str = oVar.a;
        if (str == null) {
            String str2 = L.a;
            str = str2 != null ? kotlin.text.c.r(str2, "imap", "smtp", true) : null;
        }
        String str3 = str;
        String str4 = oVar.d;
        if (str4 == null) {
            str4 = L.d;
        }
        String str5 = str4;
        String str6 = oVar.e;
        if (str6 == null) {
            str6 = L.e;
        }
        return p.a(pVar, null, L.e, L, o.b(oVar, str3, null, null, str5, str6, 6), 17);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m, com.yandex.passport.internal.ui.social.gimap.e
    public final void H(f fVar) {
        if (fVar != f.c) {
            super.H(fVar);
            return;
        }
        this.t.setVisibility(8);
        this.u.setVisibility(8);
        MailGIMAPActivity mailGIMAPActivity = (MailGIMAPActivity) requireActivity();
        mailGIMAPActivity.getClass();
        mailGIMAPActivity.n(new com.yandex.passport.internal.ui.base.m(new com.yandex.passport.internal.ui.authbytrack.a(9), "u", true, 1));
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m
    public final o M(p pVar) {
        return pVar.c;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m
    public final void O(View view) {
        int i = R.id.gimap_server_prefs_step_text;
        ((TextView) view.findViewById(i)).setText(R.string.passport_gimap_server_prefs_imap_step_text);
        int i2 = R.id.gimap_server_prefs_title;
        ((TextView) view.findViewById(i2)).setText(R.string.passport_gimap_server_prefs_imap_title);
        int i3 = R.id.gimap_edit_host;
        ((EditText) view.findViewById(i3)).setHint(R.string.passport_gimap_server_prefs_imap_host_hint);
        int i4 = R.id.gimap_input_port;
        String valueOf = String.valueOf(993);
        EditText editText = (EditText) view.findViewById(i4);
        editText.setText(valueOf);
        editText.setHint(valueOf);
        int i5 = R.id.gimap_edit_login;
        ((EditText) view.findViewById(i5)).setHint(R.string.passport_gimap_server_prefs_imap_login_hint);
        int i6 = R.id.gimap_edit_password;
        ((EditText) view.findViewById(i6)).setHint(R.string.passport_gimap_server_prefs_imap_pass_hint);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m
    public final void P() {
        p G;
        com.yandex.passport.internal.interaction.d dVar = ((n) this.g).s;
        q F = F();
        synchronized (F) {
            G = G(F.u);
            F.u = G;
        }
        dVar.a(p.a(G, null, null, null, new o(null, null, null, null, null), 23));
    }
}
