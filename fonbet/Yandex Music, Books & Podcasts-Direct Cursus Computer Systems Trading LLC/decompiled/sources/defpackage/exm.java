package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lexm;", "Ljnb;", "<init>", "()V", "promocode-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class exm extends jnb {
    public final ybf j = new ybf(ern.a(a.class), new lvj(18, this), new lvj(19, new hvl(29)));

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object value;
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new dxm(this, 0), 2051281747, true));
        String string = requireArguments().getString("url");
        if (string == null) {
            string = "https://plus.yandex.ru/gift?serviceName=music&promoName=music_common";
        }
        String string2 = requireArguments().getString("promo_code");
        if (string2 != null) {
            string = Uri.parse(string).buildUpon().appendQueryParameter("code", string2).build().toString();
            string.getClass();
        }
        a aVar = (a) this.j.getValue();
        mm6 mm6Var = aVar.o;
        xdr xdrVar = aVar.p;
        Continuation continuation = null;
        if ((xdrVar.getValue() instanceof rwm) || (xdrVar.getValue() instanceof swm)) {
            rar y = x97.y(mm6Var, null, pm6.b, new b5l((Object) aVar, string, continuation, 29), 1);
            x97.y(mm6Var, null, null, new g2l(aVar, null, 21), 3);
            do {
                value = xdrVar.getValue();
            } while (!xdrVar.k(value, new twm(y, false)));
            y.start();
        }
        x97.y(wyf.F(getLifecycle()), null, null, new g2l(this, null, 22), 3);
        return composeView;
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        nmb nmbVar = (nmb) ((a) this.j.getValue()).n.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("PayWallScreen.PromoCode.Opened", linkedHashMap);
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onStop() {
        nmb nmbVar = (nmb) ((a) this.j.getValue()).n.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("PayWallScreen.PromoCode.Closed", linkedHashMap);
        super.onStop();
    }
}
