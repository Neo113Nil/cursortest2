package defpackage;

import android.view.ViewGroup;
import com.yandex.go.blur.core.BlurEffect$CoordinatesType;
import com.yandex.go.blur.core.BlurEffect$Progressive$TileMode;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes8.dex */
public final class uks implements tls {
    public final /* synthetic */ cgw0 a;
    public final /* synthetic */ FullscreenSuperappSuggestModalView b;
    public final /* synthetic */ float c;

    public uks(cgw0 cgw0Var, FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, float f) {
        this.a = cgw0Var;
        this.b = fullscreenSuperappSuggestModalView;
        this.c = f;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i;
        GoFrameLayout goFrameLayout = this.a.g;
        float intBitsToFloat = Float.intBitsToFloat((int) (rzo.A(goFrameLayout) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        i = this.b.blurEffectTopOffset;
        float f = intBitsToFloat - i;
        BlurEffect$CoordinatesType blurEffect$CoordinatesType = BlurEffect$CoordinatesType.Absolute;
        float measuredHeight = intBitsToFloat + goFrameLayout.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = goFrameLayout.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        return ngd0.w(24, blurEffect$CoordinatesType, f, 0.0f, measuredHeight + (((ViewGroup.MarginLayoutParams) layoutParams) != null ? r11.bottomMargin : 0) + this.c, 0.0f, BlurEffect$Progressive$TileMode.Decal, 104);
    }
}
