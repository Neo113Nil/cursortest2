package defpackage;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public final class whr implements uhr {
    public final Context a;
    public final c76 b;

    public whr(Context context, c76 c76Var) {
        this.a = context;
        this.b = c76Var;
    }

    @Override // defpackage.uhr
    public final List a() {
        thr thrVar = thr.c;
        return d(thrVar).exists() ? t75.c(thrVar) : c5b.a;
    }

    @Override // defpackage.uhr
    public final String b() {
        Object invoke = this.b.invoke();
        if (invoke == null) {
            dfi.r("player called for storage when user is null", "StorageRootResolverImpl");
        }
        String str = (String) invoke;
        return str == null ? CommonUrlParts.Values.FALSE_INTEGER : str;
    }

    @Override // defpackage.uhr
    public final thr c() {
        return thr.c;
    }

    @Override // defpackage.uhr
    public final File d(thr thrVar) {
        thrVar.getClass();
        if (thrVar != thr.c) {
            su4.s(2, null, "pathForStorage called with unsupported argument (" + thrVar + ")", null);
        }
        gos gosVar = gos.i;
        Context context = this.a;
        File u = gosVar.u(context);
        if (u != null) {
            return new File(ouj.n(u.getAbsolutePath(), File.separator));
        }
        ssg.a(7, "StorageRootResolverImpl", "primaryStorageRoot is null, fallback to internalFilesDir", null);
        return new File(ouj.n(context.getFilesDir().getAbsolutePath(), File.separator));
    }
}
