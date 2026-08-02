package defpackage;

import android.os.SystemClock;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class w8r {
    public final String a;
    public final int b;
    public final long c = SystemClock.uptimeMillis();
    public final /* synthetic */ x8r d;

    public w8r(x8r x8rVar, String str, int i) {
        this.d = x8rVar;
        this.a = str;
        this.b = i;
        x8rVar.getClass();
        String a = x8r.a(str);
        if (a == null) {
            return;
        }
        x8rVar.b.g("IMG_WANT_TO_SHOW", uah.e(new Pair("url", str), new Pair("imageSize", a), new Pair("sampleSize", Integer.valueOf(i))));
    }

    public final void a() {
        x8r x8rVar = this.d;
        x8rVar.getClass();
        String str = this.a;
        String a = x8r.a(str);
        if (a == null) {
            return;
        }
        x8rVar.b.g("IMG_SHOW_MISSED", uah.e(new Pair("url", str), new Pair("imageSize", a), new Pair("sampleSize", Integer.valueOf(this.b))));
    }
}
