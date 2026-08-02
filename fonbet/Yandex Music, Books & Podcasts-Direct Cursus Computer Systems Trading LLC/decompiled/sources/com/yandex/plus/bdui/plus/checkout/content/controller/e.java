package com.yandex.plus.bdui.plus.checkout.content.controller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.xal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class e extends com.yandex.plus.bdui.plus.content.controller.a {
    public final com.yandex.plus.log.api.b b;
    public Button c;
    public com.yandex.plus.bdui.content.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.yandex.plus.bdui.m mVar, com.yandex.plus.log.api.b bVar) {
        super(mVar);
        mVar.getClass();
        bVar.getClass();
        this.b = bVar;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        this.c = null;
        this.d = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_button_view, viewGroup, false);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Button button = (Button) inflate.findViewById(R.id.button);
        this.c = button;
        if (button != null) {
            r1.E(button, new xal(22, this));
        }
        return inflate;
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, com.yandex.plus.bdui.flex.ui.t tVar, Continuation continuation) {
        boolean z = dVar.d;
        com.yandex.plus.bdui.content.a aVar = dVar.b;
        if (!z) {
            this.d = dVar;
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            com.yandex.plus.log.api.b bVar = this.b;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "PlusPayButtonContentController", "onUpdateStateAsync(); set content = " + aVar);
            }
            Button button = this.c;
            if (button != null) {
                button.setText(((com.yandex.plus.bdui.plus.checkout.content.b) aVar).a.a());
            }
        }
        return Unit.a;
    }
}
