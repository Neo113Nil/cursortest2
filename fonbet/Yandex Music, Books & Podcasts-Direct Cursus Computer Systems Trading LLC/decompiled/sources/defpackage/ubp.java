package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class ubp extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Uri s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubp(Uri uri, int i) {
        super(2);
        this.r = i;
        this.s = uri;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                t33 t33Var = (t33) obj2;
                t33Var.getClass();
                return new qq3((Bitmap) obj, this.s, t33Var, 0);
            default:
                t33 t33Var2 = (t33) obj2;
                t33Var2.getClass();
                return new qq3((Bitmap) obj, this.s, t33Var2, 0);
        }
    }
}
