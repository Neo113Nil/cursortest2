package com.yandex.plus.pay.ui.core.mobile.view.error.buttons;

import android.view.View;
import android.widget.Button;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.ern;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] e = {new yxm(b.class, "primaryButton", "getPrimaryButton()Landroid/widget/Button;", 0), f1d.c(ern.a, b.class, "secondaryButton", "getSecondaryButton()Landroid/widget/Button;", 0)};
    public final ezc a;
    public final ezc b;
    public final f c;
    public final f d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(PlusPayErrorButtonsView plusPayErrorButtonsView, Function0 function0, Function0 function02) {
        plusPayErrorButtonsView.getClass();
        this.a = (ezc) function0;
        this.b = (ezc) function02;
        f fVar = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(plusPayErrorButtonsView, 15));
        this.c = fVar;
        f fVar2 = new f(new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.b(plusPayErrorButtonsView, 16));
        this.d = fVar2;
        s9f[] s9fVarArr = e;
        final int i = 0;
        r1.E((Button) fVar.g(s9fVarArr[0]), new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.mobile.view.error.buttons.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ezc, kotlin.jvm.functions.Function0] */
            /* JADX WARN: Type inference failed for: r1v5, types: [ezc, kotlin.jvm.functions.Function0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.b.a.invoke();
                        break;
                    default:
                        this.b.b.invoke();
                        break;
                }
            }
        });
        Button button = (Button) fVar2.g(s9fVarArr[1]);
        final int i2 = 1;
        r1.E(button, new View.OnClickListener(this) { // from class: com.yandex.plus.pay.ui.core.mobile.view.error.buttons.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [ezc, kotlin.jvm.functions.Function0] */
            /* JADX WARN: Type inference failed for: r1v5, types: [ezc, kotlin.jvm.functions.Function0] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.b.a.invoke();
                        break;
                    default:
                        this.b.b.invoke();
                        break;
                }
            }
        });
    }
}
