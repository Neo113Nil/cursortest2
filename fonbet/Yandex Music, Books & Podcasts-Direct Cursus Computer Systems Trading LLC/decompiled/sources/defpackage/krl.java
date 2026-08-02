package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* loaded from: classes.dex */
public final class krl {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ lrl g;

    public krl(lrl lrlVar, int i, int i2, int i3, String str, Handler handler) {
        this.g = lrlVar;
        this.f = handler;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        krl krlVar;
        if (this.e != null) {
            krlVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            krlVar = this;
            krlVar.e = new fju(krlVar, this.a, this.b, this.d, this.c, 0);
        } else {
            krlVar = this;
            krlVar.e = new gju(krlVar, krlVar.a, krlVar.b, krlVar.d, 0);
        }
        return krlVar.e;
    }
}
