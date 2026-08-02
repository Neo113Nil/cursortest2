package yads;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.cu81;
import defpackage.sls;
import defpackage.uh71;
import defpackage.v881;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class hz1 extends Lambda implements sls {
    public final /* synthetic */ v881 b;
    public final /* synthetic */ cu81 c;
    public final /* synthetic */ uh71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz1(v881 v881Var, cu81 cu81Var, uh71 uh71Var) {
        super(0);
        this.b = v881Var;
        this.c = cu81Var;
        this.d = uh71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Bitmap a = this.b.a(this.c);
        if (a != null) {
            return new BitmapDrawable(this.d.a, a);
        }
        return null;
    }
}
