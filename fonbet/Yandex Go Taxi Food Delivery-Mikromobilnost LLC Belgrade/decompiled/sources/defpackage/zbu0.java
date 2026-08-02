package defpackage;

import android.app.Activity;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.view.stickers.bottomsheet.StickerPanelBottomSheet;
import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes15.dex */
public final class zbu0 {
    public final m a;

    public zbu0(m mVar) {
        this.a = mVar;
    }

    public final void a(String str, reu reuVar) {
        m mVar = this.a;
        mVar.getClass();
        new StickerPanelBottomSheet((Activity) mVar.a, (kcu0) mVar.b, (p4t) mVar.c, (dct) mVar.d, str, (cdu0) mVar.f, (xav) mVar.e, (mae0) mVar.g, (ChatRequest) mVar.i, (g) mVar.h, (x22) mVar.j, reuVar).show();
    }
}
