package J3;

import android.view.View;

/* renamed from: J3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0318b implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1462b;

    public /* synthetic */ ViewOnFocusChangeListenerC0318b(s sVar, int i) {
        this.f1461a = i;
        this.f1462b = sVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        switch (this.f1461a) {
            case 0:
                C0321e c0321e = (C0321e) this.f1462b;
                c0321e.t(c0321e.u());
                break;
            default:
                m mVar = (m) this.f1462b;
                mVar.f1491l = z6;
                mVar.q();
                if (!z6) {
                    mVar.t(false);
                    mVar.f1492m = false;
                    break;
                }
                break;
        }
    }
}
