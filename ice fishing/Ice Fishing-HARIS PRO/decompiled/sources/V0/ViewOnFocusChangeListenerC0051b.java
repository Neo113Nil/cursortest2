package V0;

import android.view.View;

/* renamed from: V0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0051b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f1264b;

    public /* synthetic */ ViewOnFocusChangeListenerC0051b(q qVar, int i) {
        this.f1263a = i;
        this.f1264b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f1263a) {
            case 0:
                e eVar = (e) this.f1264b;
                eVar.t(eVar.u());
                break;
            default:
                k kVar = (k) this.f1264b;
                kVar.f1284l = z2;
                kVar.q();
                if (!z2) {
                    kVar.t(false);
                    kVar.f1285m = false;
                    break;
                }
                break;
        }
    }
}
