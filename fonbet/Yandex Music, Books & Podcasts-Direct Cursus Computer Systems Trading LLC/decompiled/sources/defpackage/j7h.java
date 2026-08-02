package defpackage;

import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes5.dex */
public final class j7h {
    public static final /* synthetic */ s9f[] i;
    public final MainScreenActivity a;
    public final rhp b = new rhp();
    public final tf6 c = gld.e(dm6.b().plus(a4g.n()).plus(new im6("MainScreenPresenter")));
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public g8c h;

    static {
        opi opiVar = new opi(j7h.class, "restorePlaybackJob", "getRestorePlaybackJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        i = new s9f[]{opiVar};
    }

    public j7h(MainScreenActivity mainScreenActivity) {
        this.a = mainScreenActivity;
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        this.d = l18Var.b(I, true);
        this.e = l18Var.b(hag.I(vyk.class), true);
        this.f = l18Var.b(hag.I(oq7.class), true);
        this.g = l18Var.b(hag.I(kbn.class), true);
    }
}
