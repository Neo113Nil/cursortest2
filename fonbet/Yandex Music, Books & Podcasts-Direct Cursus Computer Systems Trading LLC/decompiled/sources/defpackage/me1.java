package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class me1 implements lci, i48 {
    public final /* synthetic */ int a;
    public final Context b;

    public me1(Context context) {
        this.a = 0;
        context.getClass();
        this.b = context;
    }

    @Override // defpackage.i48
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.i48
    public void l(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // defpackage.i48
    public Object m(int i, Resources.Theme theme, Resources resources) {
        return resources.openRawResource(i);
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        switch (this.a) {
            case 1:
                return new fr1(this.b, this);
            case 2:
            default:
                return new fr1(this.b, kkpVar.n(Integer.class, InputStream.class));
            case 3:
                return new qwh(this.b, 0);
        }
    }

    public /* synthetic */ me1(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
