package defpackage;

import com.yandex.urbanads.gamecenter.GameCenterFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class rss implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ GameCenterFragment b;

    public /* synthetic */ rss(GameCenterFragment gameCenterFragment, int i) {
        this.a = i;
        this.b = gameCenterFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String url_delegate$lambda$0;
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        GameCenterFragment gameCenterFragment = this.b;
        switch (i) {
            case 0:
                url_delegate$lambda$0 = GameCenterFragment.url_delegate$lambda$0(gameCenterFragment);
                return url_delegate$lambda$0;
            case 1:
                zy11Var = GameCenterFragment.setupWebView$lambda$7$lambda$5(gameCenterFragment);
                return zy11Var;
            default:
                zy11Var2 = GameCenterFragment.setupWebView$lambda$7$lambda$6(gameCenterFragment);
                return zy11Var2;
        }
    }
}
