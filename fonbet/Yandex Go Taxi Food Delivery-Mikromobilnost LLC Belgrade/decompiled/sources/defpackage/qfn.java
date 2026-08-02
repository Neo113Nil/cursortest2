package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.superapp.web_chat.ui.EatsOrderWebChatModalView;

/* loaded from: classes14.dex */
public final class qfn implements xbn {
    public final /* synthetic */ EatsOrderWebChatModalView a;

    public qfn(EatsOrderWebChatModalView eatsOrderWebChatModalView) {
        this.a = eatsOrderWebChatModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        wbn binding;
        wbn binding2;
        wbn binding3;
        wbn binding4;
        wbn binding5;
        y2b y2bVar = (y2b) obj;
        EatsOrderWebChatModalView eatsOrderWebChatModalView = this.a;
        binding = eatsOrderWebChatModalView.getBinding();
        binding.d.setTitle(y2bVar.a);
        binding2 = eatsOrderWebChatModalView.getBinding();
        binding2.d.setSubtitle(y2bVar.b);
        binding3 = eatsOrderWebChatModalView.getBinding();
        binding3.d.setLeadImage(dzg0.ic_cross_close);
        if (y2bVar.c) {
            binding5 = eatsOrderWebChatModalView.getBinding();
            binding5.d.setTrailImage(f1h0.ic_call);
        } else {
            binding4 = eatsOrderWebChatModalView.getBinding();
            binding4.d.setTrailImage((Drawable) null);
        }
    }
}
