package F3;

import android.view.View;

/* renamed from: F3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0308b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1019b;

    public /* synthetic */ ViewOnFocusChangeListenerC0308b(s sVar, int i) {
        this.f1018a = i;
        this.f1019b = sVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f1018a) {
            case 0:
                C0311e c0311e = (C0311e) this.f1019b;
                c0311e.t(c0311e.u());
                break;
            default:
                m mVar = (m) this.f1019b;
                mVar.f1048l = z8;
                mVar.q();
                if (!z8) {
                    mVar.t(false);
                    mVar.f1049m = false;
                    break;
                }
                break;
        }
    }
}
