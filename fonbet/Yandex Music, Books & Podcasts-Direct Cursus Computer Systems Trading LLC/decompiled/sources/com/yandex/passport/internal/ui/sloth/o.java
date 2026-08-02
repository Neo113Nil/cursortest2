package com.yandex.passport.internal.ui.sloth;

import android.content.DialogInterface;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity;
import com.yandex.passport.internal.ui.sloth.webcard.WebCardSlothActivity;
import com.yandex.passport.sloth.ui.e1;

/* loaded from: classes4.dex */
public final class o implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                dialogInterface.getClass();
                ((StandaloneSlothActivity) this.b).finish();
                break;
            case 1:
                dialogInterface.getClass();
                ((StandaloneSlothComposeActivity) this.b).finish();
                break;
            case 2:
                dialogInterface.getClass();
                ((AuthSdkSlothActivity) this.b).finish();
                break;
            case 3:
                dialogInterface.getClass();
                ((WebCardSlothActivity) this.b).finish();
                break;
            case 4:
                dialogInterface.getClass();
                ((com.yandex.passport.sloth.ui.n) this.b).invoke();
                break;
            default:
                dialogInterface.getClass();
                ((com.yandex.passport.sloth.ui.b0) this.b).p.a(e1.a);
                break;
        }
    }
}
