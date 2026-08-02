package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class j42 implements usr {
    public final /* synthetic */ int a;
    public final usr b;
    public final Object c;

    public /* synthetic */ j42(usr usrVar, Object obj, int i) {
        this.a = i;
        this.b = usrVar;
        this.c = obj;
    }

    @Override // defpackage.usr
    public final vsr create(tsr tsrVar) {
        switch (this.a) {
            case 0:
                return new i42(this.b.create(tsrVar), (a42) this.c);
            default:
                dse dseVar = new dse(0, this, tsrVar);
                Context context = tsrVar.a;
                ssr ssrVar = tsrVar.c;
                ArrayList h0 = CollectionsKt.h0((List) this.c, dseVar);
                context.getClass();
                ssrVar.getClass();
                return ((e9r) h0.get(0)).a(new anx(context, ssrVar, h0, 1));
        }
    }
}
