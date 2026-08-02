package defpackage;

import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class wew0 implements vew0 {
    public final /* synthetic */ gcn a;

    public wew0(gcn gcnVar) {
        this.a = gcnVar;
    }

    @Override // defpackage.vew0
    public final void V0() {
        this.a.a(new ck7(new IllegalStateException("Invalid stories config")));
    }

    @Override // defpackage.sy60
    public final void a() {
        xby.t(jst.e, "EATS:DELEGATE:STORIES", null, "Exit from stories withot viewed stories param", 6);
        this.a.a(new ck7(new uw31(EmptyList.a), null));
    }

    @Override // defpackage.vew0
    public final void k0(ArrayList arrayList) {
        this.a.a(new ck7(new uw31(arrayList), null));
    }
}
