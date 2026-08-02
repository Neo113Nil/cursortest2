package defpackage;

import ru.yandex.taxi.stories.presentation.story.StoryModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class zpu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bqu0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ zpu0(bqu0 bqu0Var, Runnable runnable, int i) {
        this.a = i;
        this.b = bqu0Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.a;
        Runnable runnable = this.c;
        bqu0 bqu0Var = this.b;
        switch (i) {
            case 0:
                z = ((StoryModalView) bqu0Var.i.a).attached;
                if (z) {
                    bqu0Var.u = null;
                    runnable.run();
                    break;
                }
                break;
            case 1:
                bqu0Var.s(runnable);
                break;
            default:
                bqu0Var.s(runnable);
                break;
        }
    }
}
