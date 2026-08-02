package defpackage;

import android.app.Activity;
import android.content.Intent;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes5.dex */
public final class t36 implements r63 {
    public final Activity a;

    public t36(Activity activity, int i) {
        switch (i) {
            case 1:
                this.a = activity;
                break;
            case 2:
                activity.getClass();
                this.a = activity;
                break;
            case 3:
                activity.getClass();
                this.a = activity;
                break;
            default:
                activity.getClass();
                this.a = activity;
                break;
        }
    }

    @Override // defpackage.r63
    public void a(w43 w43Var) {
        if (!(((o88) w43Var) instanceof o88)) {
            b6e.s();
            return;
        }
        np2 np2Var = (np2) new m88(this.a).a.getValue();
        if (np2Var == null) {
            return;
        }
        int i = CollectionMainActivity.v0;
        Intent B = men.B(np2Var, v35.i);
        sb.D(np2Var, B);
        np2Var.startActivity(B);
    }
}
