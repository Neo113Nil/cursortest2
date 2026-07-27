package com.anythink.basead.d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bf;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public final class h extends bf {

    /* renamed from: a, reason: collision with root package name */
    String f6195a;

    /* renamed from: b, reason: collision with root package name */
    String f6196b;

    /* renamed from: c, reason: collision with root package name */
    com.anythink.core.common.k.c f6197c;

    public h(w wVar, String str, String str2, com.anythink.core.common.k.c cVar) {
        this.f6195a = str;
        this.f6196b = str2;
        this.f13627d = wVar;
        this.f6197c = cVar;
    }

    @Override // com.anythink.core.common.h.bf
    public final void a(Activity activity) {
        try {
            w wVar = this.f13627d;
            String aL = wVar instanceof bj ? ((bj) wVar).aL() : "";
            if (TextUtils.isEmpty(aL)) {
                aL = this.f13627d.x();
            }
            final Context g4 = t.b().g();
            View inflate = LayoutInflater.from(activity).inflate(q.a(g4, "myoffer_confirm_dialog", "layout"), (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(q.a(g4, "myoffer_confirm_msg", "id"));
            TextView textView2 = (TextView) inflate.findViewById(q.a(g4, "myoffer_confirm_give_up", "id"));
            TextView textView3 = (TextView) inflate.findViewById(q.a(g4, "myoffer_confirm_continue", "id"));
            String string = g4.getString(q.a(t.b().g(), "myoffer_confirm_msg", com.anythink.expressad.foundation.h.k.f19636g));
            String string2 = g4.getString(q.a(t.b().g(), "myoffer_give_up", com.anythink.expressad.foundation.h.k.f19636g));
            String string3 = g4.getString(q.a(t.b().g(), "myoffer_continue", com.anythink.expressad.foundation.h.k.f19636g));
            textView.setText(string + "\"" + aL + "\"?");
            textView2.setText(string2);
            textView3.setText(string3);
            final Dialog dialog = new Dialog(activity, q.a(g4, "style_full_screen_translucent_dialog", com.anythink.expressad.foundation.h.k.f19634e));
            dialog.setContentView(inflate);
            dialog.setCancelable(false);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.d.h.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h hVar = h.this;
                    String str = hVar.f6196b;
                    String v9 = ((bf) hVar).f13627d.v();
                    h hVar2 = h.this;
                    com.anythink.core.common.u.e.a(str, v9, hVar2.f6195a, 7, (String) null, 0L, 0L, ((bf) hVar2).f13627d.ap(), ((bf) h.this).f13627d.aq());
                    try {
                        dialog.dismiss();
                    } catch (Throwable unused) {
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.d.h.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        h hVar = h.this;
                        String str = hVar.f6196b;
                        String v9 = ((bf) hVar).f13627d.v();
                        h hVar2 = h.this;
                        com.anythink.core.common.u.e.a(str, v9, hVar2.f6195a, 8, (String) null, 0L, 0L, ((bf) hVar2).f13627d.ap(), ((bf) h.this).f13627d.aq());
                        boolean a9 = com.anythink.basead.b.b.a(g4, ((bf) h.this).f13627d);
                        if (a9) {
                            h hVar3 = h.this;
                            String str2 = hVar3.f6196b;
                            String v10 = ((bf) hVar3).f13627d.v();
                            h hVar4 = h.this;
                            com.anythink.core.common.u.e.a(str2, v10, hVar4.f6195a, 9, (String) null, 0L, 0L, ((bf) hVar4).f13627d.ap(), ((bf) h.this).f13627d.aq());
                        }
                        dialog.dismiss();
                        com.anythink.core.common.k.c cVar = h.this.f6197c;
                        if (cVar != null) {
                            cVar.a(a9);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            dialog.show();
        } catch (Throwable unused) {
        }
    }
}
