package defpackage;

import com.yandex.go.blur.view.internal.scrim.ScrimBlurDrawable;
import java.util.Map;

/* loaded from: classes9.dex */
public final /* synthetic */ class vp00 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ vp00(Map map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean effects$lambda$1;
        boolean effects$lambda$3;
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                return (lm00) map.get((String) obj);
            case 1:
                effects$lambda$1 = ScrimBlurDrawable.setEffects$lambda$1(map, (Map.Entry) obj);
                return Boolean.valueOf(effects$lambda$1);
            default:
                effects$lambda$3 = ScrimBlurDrawable.setEffects$lambda$3(map, (Map.Entry) obj);
                return Boolean.valueOf(effects$lambda$3);
        }
    }
}
