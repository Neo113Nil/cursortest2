package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class cyg implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ cyg(Context context, String str, String str2, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ayg aygVar;
        switch (this.a) {
            case 0:
                Context context = this.b;
                xzi I = ff7.I(context);
                String str = this.c;
                String str2 = this.d;
                nzg X = I.X(context, str, str2);
                if (str2 != null && (aygVar = X.a) != null) {
                    byg.b.a.put(str2, aygVar);
                }
                return X;
            default:
                return gyg.b(this.b, this.c, this.d);
        }
    }
}
