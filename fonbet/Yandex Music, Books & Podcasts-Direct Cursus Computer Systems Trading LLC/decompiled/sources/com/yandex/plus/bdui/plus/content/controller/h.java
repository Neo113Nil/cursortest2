package com.yandex.plus.bdui.plus.content.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.serializer.d0;
import defpackage.tf6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class h extends a {
    public final com.yandex.plus.bdui.plus.auth.a b;
    public final tf6 c;
    public final com.yandex.plus.log.api.b d;
    public TextView e;
    public Button f;
    public Button g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.plus.auth.a aVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        this.b = aVar;
        this.c = tf6Var;
        this.d = bVar;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        Button button = this.f;
        if (button != null) {
            button.setOnClickListener(null);
        }
        Button button2 = this.g;
        if (button2 != null) {
            button2.setOnClickListener(null);
        }
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plus_sdk_content_authorize, viewGroup, false);
        this.e = (TextView) inflate.findViewById(R.id.plus_sdk_authorize_text);
        this.f = (Button) inflate.findViewById(R.id.plus_sdk_authorize_auth);
        this.g = (Button) inflate.findViewById(R.id.plus_sdk_authorize_cancel);
        return inflate;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(final com.yandex.plus.bdui.content.d dVar, t tVar, Continuation continuation) {
        boolean z = dVar.d;
        com.yandex.plus.bdui.content.a aVar = dVar.b;
        if (!z) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            com.yandex.plus.log.api.b bVar = this.d;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "PlusAuthorizeContentController", "onUpdateStateAsync()");
            }
            TextView textView = this.e;
            if (textView != null) {
                textView.setText((String) ((d0) ((com.yandex.plus.bdui.plus.content.a) aVar)).a.d(d0.e[0]));
            }
            Button button = this.f;
            if (button != null) {
                button.setText(((d0) ((com.yandex.plus.bdui.plus.content.a) aVar)).b.a());
                final int i = 0;
                r1.E(button, new View.OnClickListener(this) { // from class: com.yandex.plus.bdui.plus.content.controller.g
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                h hVar = this.b;
                                com.yandex.plus.log.api.b bVar2 = hVar.d;
                                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                                if (bVar2.b(aVar3)) {
                                    bVar2.c(aVar3, "PlusAuthorizeContentController", "onAuthClick(); start authorize");
                                }
                                hVar.b.a(hVar.c, new com.yandex.passport.internal.ui.bouncer.o(24, hVar, dVar));
                                break;
                            default:
                                h hVar2 = this.b;
                                com.yandex.plus.log.api.b bVar3 = hVar2.d;
                                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                                boolean b = bVar3.b(aVar4);
                                com.yandex.plus.bdui.content.d dVar2 = dVar;
                                if (b) {
                                    com.appsflyer.internal.k.x(new StringBuilder("onCancelClick(); dispatch cancel action = "), ((d0) ((com.yandex.plus.bdui.plus.content.a) dVar2.b)).c.a, bVar3, aVar4, "PlusAuthorizeContentController");
                                }
                                hVar2.a.a.a(((d0) ((com.yandex.plus.bdui.plus.content.a) dVar2.b)).c.a, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                                break;
                        }
                    }
                });
            } else {
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar3)) {
                    bVar.c(aVar3, "PlusAuthorizeContentController", "onUpdateStateAsync(); auth button not found!");
                }
            }
            Button button2 = this.g;
            if (button2 != null) {
                button2.setText(((d0) ((com.yandex.plus.bdui.plus.content.a) aVar)).c.a());
                final int i2 = 1;
                r1.E(button2, new View.OnClickListener(this) { // from class: com.yandex.plus.bdui.plus.content.controller.g
                    public final /* synthetic */ h b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i2) {
                            case 0:
                                h hVar = this.b;
                                com.yandex.plus.log.api.b bVar2 = hVar.d;
                                com.yandex.plus.log.api.a aVar32 = com.yandex.plus.log.api.a.c;
                                if (bVar2.b(aVar32)) {
                                    bVar2.c(aVar32, "PlusAuthorizeContentController", "onAuthClick(); start authorize");
                                }
                                hVar.b.a(hVar.c, new com.yandex.passport.internal.ui.bouncer.o(24, hVar, dVar));
                                break;
                            default:
                                h hVar2 = this.b;
                                com.yandex.plus.log.api.b bVar3 = hVar2.d;
                                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                                boolean b = bVar3.b(aVar4);
                                com.yandex.plus.bdui.content.d dVar2 = dVar;
                                if (b) {
                                    com.appsflyer.internal.k.x(new StringBuilder("onCancelClick(); dispatch cancel action = "), ((d0) ((com.yandex.plus.bdui.plus.content.a) dVar2.b)).c.a, bVar3, aVar4, "PlusAuthorizeContentController");
                                }
                                hVar2.a.a.a(((d0) ((com.yandex.plus.bdui.plus.content.a) dVar2.b)).c.a, new com.yandex.plus.bdui.action.h(dVar2.c), null);
                                break;
                        }
                    }
                });
            } else {
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                if (bVar.b(aVar4)) {
                    bVar.c(aVar4, "PlusAuthorizeContentController", "onUpdateStateAsync(); cancel button not found!");
                }
            }
        }
        return Unit.a;
    }
}
