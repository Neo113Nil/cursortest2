package defpackage;

import com.yandex.go.pickup_from_photo.navigation.c;

/* loaded from: classes13.dex */
public final class sob0 implements kr4 {
    public final /* synthetic */ c b;
    public final /* synthetic */ sls c;

    public sob0(c cVar, sls slsVar) {
        this.b = cVar;
        this.c = slsVar;
    }

    @Override // defpackage.kr4
    public final void a() {
        this.b.J.a.u("pickup_from_photo_onboarding_shown", true);
    }

    @Override // defpackage.kr4
    public final void c() {
        this.b.d0 = true;
        this.c.invoke();
    }

    @Override // defpackage.kr4
    public final void onDetach() {
        c cVar = this.b;
        if (cVar.d0) {
            return;
        }
        cVar.i();
    }
}
