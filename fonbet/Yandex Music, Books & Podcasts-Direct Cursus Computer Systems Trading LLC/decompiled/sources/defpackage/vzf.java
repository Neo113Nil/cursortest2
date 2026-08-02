package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes5.dex */
public final class vzf {
    public final pst a;
    public boolean b;
    public int c;

    public vzf(Context context) {
        xxq c = ((frt) l18.b.b(hag.I(frt.class), true).getValue()).c();
        c.getClass();
        pst pstVar = new pst(context, c.a, "ru.yandex.music.likes.FirstLikeDialogShowController");
        this.a = pstVar;
        SharedPreferences sharedPreferences = pstVar.a;
        this.b = sharedPreferences.getBoolean("like_dialog_showed", false);
        this.c = sharedPreferences.getInt("user_has_some_like", 0);
    }

    public final uzf a() {
        l18 l18Var = l18.b;
        bdt I = hag.I(y18.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        b9s[] b9sVarArr = d9s.a;
        return !d9s.a(b9s.d) ? uzf.b : this.c >= 2 ? !this.b ? uzf.a : uzf.c : uzf.b;
    }
}
