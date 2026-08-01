package H3;

import android.view.View;

/* renamed from: H3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0309b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1106b;

    public /* synthetic */ ViewOnFocusChangeListenerC0309b(s sVar, int i) {
        this.f1105a = i;
        this.f1106b = sVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f1105a) {
            case 0:
                C0312e c0312e = (C0312e) this.f1106b;
                c0312e.t(c0312e.u());
                break;
            default:
                m mVar = (m) this.f1106b;
                mVar.f1135l = z3;
                mVar.q();
                if (!z3) {
                    mVar.t(false);
                    mVar.f1136m = false;
                    break;
                }
                break;
        }
    }
}
