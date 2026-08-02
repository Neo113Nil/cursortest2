package com.yandex.passport.internal.ui.autologin;

import android.widget.Button;
import com.yandex.passport.internal.widget.ConfirmationCodeInput;
import com.yandex.plus.home.feature.webviews.internal.container.modal.k;

/* loaded from: classes4.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((e) this.b).d.invoke();
                break;
            case 1:
                ((com.yandex.passport.internal.ui.sloth.menu.c) this.b).invoke();
                break;
            case 2:
                long currentTimeMillis = System.currentTimeMillis();
                com.yandex.passport.internal.ui.util.a aVar = (com.yandex.passport.internal.ui.util.a) this.b;
                Button button = aVar.a;
                long j = aVar.f;
                if (j > currentTimeMillis) {
                    button.setText(button.getContext().getString(aVar.d, String.valueOf((j - currentTimeMillis) / 1000)));
                    aVar.g.postDelayed(this, 1000L);
                    button.setClickable(false);
                    break;
                } else {
                    button.setText(button.getContext().getString(aVar.c));
                    button.setClickable(true);
                    break;
                }
            case 3:
                ConfirmationCodeInput confirmationCodeInput = (ConfirmationCodeInput) this.b;
                confirmationCodeInput.o = !confirmationCodeInput.o;
                confirmationCodeInput.invalidate();
                confirmationCodeInput.postDelayed(confirmationCodeInput.p, 400L);
                break;
            default:
                ((k) this.b).l(0);
                break;
        }
    }
}
