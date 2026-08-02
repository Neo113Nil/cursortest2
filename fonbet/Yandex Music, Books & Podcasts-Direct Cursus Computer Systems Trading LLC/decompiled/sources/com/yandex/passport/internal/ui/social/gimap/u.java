package com.yandex.passport.internal.ui.social.gimap;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.yandex.passport.R;

/* loaded from: classes4.dex */
public class u extends m {
    public static final /* synthetic */ int y = 0;

    @Override // com.yandex.passport.internal.ui.social.gimap.m, com.yandex.passport.internal.ui.social.gimap.e
    public final void E(p pVar) {
        super.E(pVar);
        this.r.getEditText().setText(pVar.a);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.e
    public final p G(p pVar) {
        String z = com.yandex.plus.core.network.api.utils.a.z(this.r.getEditText().getText().toString().trim());
        o L = L();
        pVar.getClass();
        if (z == null) {
            z = pVar.a;
        }
        return p.a(pVar, z, null, null, L, 22);
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m
    public final o M(p pVar) {
        return pVar.d;
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m
    public final boolean N() {
        return super.N() && e.D(com.yandex.plus.core.network.api.utils.a.z(this.r.getEditText().getText().toString().trim()));
    }

    @Override // com.yandex.passport.internal.ui.social.gimap.m
    public final void O(View view) {
        int i = R.id.gimap_server_prefs_step_text;
        ((TextView) view.findViewById(i)).setText(R.string.passport_gimap_server_prefs_smtp_step_text);
        int i2 = R.id.gimap_server_prefs_title;
        ((TextView) view.findViewById(i2)).setText(R.string.passport_gimap_server_prefs_smtp_title);
        int i3 = R.id.gimap_edit_host;
        ((EditText) view.findViewById(i3)).setHint(R.string.passport_gimap_server_prefs_smtp_host_hint);
        int i4 = R.id.gimap_input_port;
        String valueOf = String.valueOf(465);
        EditText editText = (EditText) view.findViewById(i4);
        editText.setText(valueOf);
        editText.setHint(valueOf);
        int i5 = R.id.gimap_edit_login;
        ((EditText) view.findViewById(i5)).setHint(R.string.passport_gimap_server_prefs_smtp_login_hint);
        int i6 = R.id.gimap_edit_password;
        ((EditText) view.findViewById(i6)).setHint(R.string.passport_gimap_server_prefs_smtp_pass_hint);
        view.findViewById(R.id.gimap_email_title).setVisibility(0);
        this.r.setVisibility(0);
        this.s.setText(R.string.passport_login);
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
        dVar.a(G);
    }
}
