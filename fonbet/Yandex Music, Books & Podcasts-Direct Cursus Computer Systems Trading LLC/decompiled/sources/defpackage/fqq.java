package defpackage;

import android.app.Activity;
import android.os.Parcelable;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class fqq {
    public final jyr a;

    public fqq(jyr jyrVar) {
        this.a = jyrVar;
    }

    public final Object a(Activity activity, aur aurVar) {
        zh5 zh5Var;
        if (a28.a(activity)) {
            return Unit.a;
        }
        String stringExtra = activity.getIntent().getStringExtra("extra.anchor.id");
        if (stringExtra == null) {
            zh5Var = null;
        } else {
            Parcelable.Creator<zh5> creator = zh5.CREATOR;
            zh5Var = (zh5) zh5.d.get(stringExtra);
        }
        if (zh5Var == null) {
            return Unit.a;
        }
        jyr jyrVar = k3j.e;
        boolean x = ixf.x();
        jyr jyrVar2 = this.a;
        if (x) {
            Object D = xv7.D((xj5) jyrVar2.getValue(), zh5Var, activity, null, aurVar);
            return D == nm6.a ? D : Unit.a;
        }
        ((xj5) jyrVar2.getValue()).f(zh5Var, activity, true, null);
        return Unit.a;
    }
}
