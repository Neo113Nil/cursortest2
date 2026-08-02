package defpackage;

import android.content.Context;
import android.media.VolumeProvider;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class mch {
    public final int a;
    public final int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;

    public mch(View view) {
        this.d = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
        this.e = view;
        Context context = view.getContext();
        this.a = szf.p0(context, R.attr.motionDurationMedium2, 300);
        this.b = szf.p0(context, R.attr.motionDurationShort3, 150);
        this.c = szf.p0(context, R.attr.motionDurationShort2, 100);
    }

    public VolumeProvider a() {
        mch mchVar;
        if (((VolumeProvider) this.f) != null) {
            mchVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            mchVar = this;
            mchVar.f = new fju(mchVar, this.a, this.b, this.c, (String) this.d, 1);
        } else {
            mchVar = this;
            mchVar.f = new gju(mchVar, mchVar.a, mchVar.b, mchVar.c, 1);
        }
        return (VolumeProvider) mchVar.f;
    }

    public abstract void b(int i);

    public ri2 c() {
        if (((ri2) this.f) == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        ri2 ri2Var = (ri2) this.f;
        this.f = null;
        return ri2Var;
    }

    public abstract void d(int i);

    public void e(int i) {
        int i2;
        this.c = i;
        hju.a(a(), i);
        anx anxVar = (anx) this.e;
        if (anxVar == null || anxVar.a == (i2 = this.c)) {
            return;
        }
        ((xdr) anxVar.b).m(null, new y08((p08) anxVar.c, i2, (svh) anxVar.d, new enp(this)));
    }

    public mch(String str, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }
}
