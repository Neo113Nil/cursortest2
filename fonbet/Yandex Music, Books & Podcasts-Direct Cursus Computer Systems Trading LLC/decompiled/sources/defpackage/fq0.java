package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class fq0 implements too {
    public final /* synthetic */ int a;
    public final Object b;

    public fq0(uoo uooVar) {
        this.a = 1;
        this.b = new LinkedHashSet();
        uooVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.too
    public final Bundle a() {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                ((hq0) this.b).getDelegate().getClass();
                return bundle;
            default:
                e5b.a.getClass();
                Bundle K = cxb.K((Pair[]) Arrays.copyOf(new Pair[0], 0));
                List w0 = CollectionsKt.w0((LinkedHashSet) this.b);
                w0.getClass();
                List list = w0;
                K.putStringArrayList("classes_to_restore", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                return K;
        }
    }

    public fq0(hq0 hq0Var) {
        this.a = 0;
        this.b = hq0Var;
    }
}
