package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class x3m0 implements v7p {
    public final /* synthetic */ int a;
    public final k6g b;
    public final g7g c;

    public /* synthetic */ x3m0(k6g k6gVar, g7g g7gVar, int i) {
        this.a = i;
        this.b = k6gVar;
        this.c = g7gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g7g g7gVar = this.c;
        k6g k6gVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) k6gVar.get();
                g7gVar.get();
                return new w3m0(context);
            default:
                return new e5m0((Context) k6gVar.get(), (mdm0) g7gVar.get());
        }
    }
}
