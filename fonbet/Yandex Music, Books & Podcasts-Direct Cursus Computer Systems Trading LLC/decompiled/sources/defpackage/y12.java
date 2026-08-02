package defpackage;

import android.app.Activity;
import kotlin.Unit;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes3.dex */
public final class y12 {
    public final rk1 a;
    public final rmb b;
    public final b22 c;
    public final thj d = new thj(pkb.NonApplicable, "", 1, 1, "");

    public y12(rk1 rk1Var, rmb rmbVar, b22 b22Var) {
        this.a = rk1Var;
        this.b = rmbVar;
        this.c = b22Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        x12 x12Var;
        int i;
        if (cg6Var instanceof x12) {
            x12Var = (x12) cg6Var;
            int i2 = x12Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x12Var.l = i2 - Integer.MIN_VALUE;
                Object obj = x12Var.j;
                nm6 nm6Var = nm6.a;
                i = x12Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rmb.j(this.b, wjb.SettingsAutoDownloadScreen, this.d, null, 12);
                    x12Var.l = 1;
                    if (this.c.n(x12Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Activity activity = this.a.a;
                int i3 = CollectionMainActivity.v0;
                activity.startActivity(men.B(activity, v35.l));
                return Unit.a;
            }
        }
        x12Var = new x12(this, cg6Var);
        Object obj2 = x12Var.j;
        nm6 nm6Var2 = nm6.a;
        i = x12Var.l;
        if (i != 0) {
        }
        Activity activity2 = this.a.a;
        int i32 = CollectionMainActivity.v0;
        activity2.startActivity(men.B(activity2, v35.l));
        return Unit.a;
    }
}
