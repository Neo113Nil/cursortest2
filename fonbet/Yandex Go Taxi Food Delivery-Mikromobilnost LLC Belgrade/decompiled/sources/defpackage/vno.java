package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import java.util.List;
import ru.CryptoPro.JCP.tools.ActionTools;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.RatingBarComponent;

/* loaded from: classes10.dex */
public final /* synthetic */ class vno implements ruy, ActionTools.Action, hes0, bx60, zbv, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ vno(wc71 wc71Var, int i, af81 af81Var, af81 af81Var2) {
        this.a = 8;
        this.b = i;
    }

    @Override // defpackage.hes0
    public ColorFilter a(vtz vtzVar) {
        ColorFilter createLottieAnimationViewsOrUpdateColorIfExists$lambda$0;
        ColorFilter createStarAnimation$lambda$0;
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 3:
                createLottieAnimationViewsOrUpdateColorIfExists$lambda$0 = RatingBarComponent.createLottieAnimationViewsOrUpdateColorIfExists$lambda$0(i2, vtzVar);
                return createLottieAnimationViewsOrUpdateColorIfExists$lambda$0;
            default:
                createStarAnimation$lambda$0 = RatingBarComponent.createStarAnimation$lambda$0(i2, vtzVar);
                return createStarAnimation$lambda$0;
        }
    }

    @Override // ru.CryptoPro.JCP.tools.ActionTools.Action
    public Object execute() {
        List enumInstalledProviders;
        enumInstalledProviders = HProv.enumInstalledProviders(this.b);
        return enumInstalledProviders;
    }

    @Override // defpackage.zbv
    public rbv g(Context context, int i, int i2) {
        return new nbv(this.b, null);
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                ((xxc0) obj).onRepeatModeChanged(i2);
                break;
            case 1:
                ((xxc0) obj).onAudioSessionIdChanged(i2);
                break;
            default:
                b171 b171Var = (b171) obj;
                b171Var.getClass();
                if (i2 == 1) {
                    b171Var.t = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 applyInsetsToBackButton$lambda$6;
        n751 applyInsetsToBottomBar$lambda$3;
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 5:
                applyInsetsToBackButton$lambda$6 = ShimmersFragment.applyInsetsToBackButton$lambda$6(i2, view, n751Var);
                return applyInsetsToBackButton$lambda$6;
            default:
                applyInsetsToBottomBar$lambda$3 = ShimmersFragment.applyInsetsToBottomBar$lambda$3(i2, view, n751Var);
                return applyInsetsToBottomBar$lambda$3;
        }
    }

    public /* synthetic */ vno(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
