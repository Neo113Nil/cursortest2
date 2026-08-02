package yads;

import android.media.AudioManager;
import android.os.Handler;
import defpackage.bm81;
import defpackage.nba1;
import defpackage.xm2;

/* loaded from: classes7.dex */
public final class tj implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ bm81 b;

    public tj(bm81 bm81Var, Handler handler) {
        this.b = bm81Var;
        this.a = handler;
    }

    public final void a(int i) {
        bm81 bm81Var = this.b;
        if (i == -3 || i == -2) {
            if (i != -2) {
                bm81Var.getClass();
                bm81Var.c(3);
                return;
            } else {
                bm81Var.b(0);
                bm81Var.c(2);
                return;
            }
        }
        if (i == -1) {
            bm81Var.b(-1);
            bm81Var.a();
        } else if (i != 1) {
            bm81Var.getClass();
            nba1.e();
        } else {
            bm81Var.c(1);
            bm81Var.b(1);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.post(new xm2(this, i, 26));
    }
}
