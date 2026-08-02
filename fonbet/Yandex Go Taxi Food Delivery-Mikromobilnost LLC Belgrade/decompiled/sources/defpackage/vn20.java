package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes8.dex */
public final /* synthetic */ class vn20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ vn20(Context context, String str, int i) {
        this.a = i;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        String str = this.c;
        Context context = this.b;
        switch (i) {
            case 0:
                return new File(context.getFilesDir(), "datastore/".concat(str));
            default:
                return context.getSharedPreferences(str, 0);
        }
    }
}
