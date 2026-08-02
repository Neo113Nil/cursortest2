package defpackage;

import com.yandex.go.inapp_calls.navigation.loader.a;

/* loaded from: classes12.dex */
public final class ujv implements yjv {
    public final /* synthetic */ a a;
    public final /* synthetic */ sjv b;

    public ujv(a aVar, sjv sjvVar) {
        this.a = aVar;
        this.b = sjvVar;
    }

    @Override // defpackage.yjv
    public final void Z(boolean z) {
        String str;
        a aVar = this.a;
        njv njvVar = aVar.F;
        sjv sjvVar = this.b;
        fkv fkvVar = sjvVar.b;
        if (fkvVar == null || (str = fkvVar.a) == null) {
            str = "";
        }
        njvVar.e(true, false, str, sjvVar.c.b);
        aVar.r(new yce(z, 7));
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new jiu(20));
    }

    @Override // defpackage.yjv
    public final void u() {
        String str;
        a aVar = this.a;
        njv njvVar = aVar.F;
        sjv sjvVar = this.b;
        fkv fkvVar = sjvVar.b;
        if (fkvVar == null || (str = fkvVar.a) == null) {
            str = "";
        }
        njvVar.e(false, false, str, sjvVar.c.b);
        aVar.r(new jiu(19));
    }
}
