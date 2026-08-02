package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes3.dex */
public final class d39 implements a39 {
    public final a39 a;
    public final Context b;
    public final List c;
    public final kur d;
    public final int e;

    public d39(a39 a39Var, Context context) {
        this.a = a39Var;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = t75.c(new j29());
        this.d = !a39Var.c().booleanValue() ? new kur(applicationContext) : null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.e = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.a39
    public final ffg b(String str, n7w n7wVar) {
        if (Intrinsics.d(str, "empty://")) {
            n7wVar.S();
            return new ih9();
        }
        String e = e(str);
        a39 f = f(e);
        f.getClass();
        return f.b(e, new c39(this, n7wVar, this.b));
    }

    @Override // defpackage.a39
    public final ffg d(String str, m19 m19Var) {
        if (Intrinsics.d(str, "empty://")) {
            m19Var.T();
            return new ih9();
        }
        String e = e(str);
        return f(e).d(e, m19Var);
    }

    public final String e(String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((j29) it.next()).getClass();
            if (c.v(str, "divkit-asset", false)) {
                str = "file:///android_asset/divkit/".concat(StringsKt.Y(str, "divkit-asset://"));
            }
        }
        return str;
    }

    public final a39 f(String str) {
        kur kurVar = this.d;
        if (kurVar != null) {
            int S = StringsKt.S(str, '?', 0, 6);
            if (S < 0) {
                S = str.length();
            }
            if (c.n(str.substring(0, S), ".svg", false)) {
                return kurVar;
            }
        }
        return this.a;
    }
}
