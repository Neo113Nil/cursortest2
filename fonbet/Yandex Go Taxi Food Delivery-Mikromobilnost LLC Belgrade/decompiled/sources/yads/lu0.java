package yads;

import defpackage.sls;
import defpackage.yz71;
import java.io.File;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class lu0 extends Lambda implements sls {
    public final /* synthetic */ yz71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(yz71 yz71Var) {
        super(0);
        this.b = yz71Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new File(this.b.a.getFilesDir(), "downloaded_fonts");
    }
}
