package v2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import w2.C5147g;

/* loaded from: classes.dex */
public final class i extends RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public final C5147g f41133n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41134u;

    public i(Context context, String str, String str2, String str3) {
        super(context);
        C5147g c5147g = new C5147g(context);
        c5147g.f41663c = str;
        this.f41133n = c5147g;
        c5147g.f41665e = str2;
        c5147g.f41664d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f41134u) {
            return false;
        }
        this.f41133n.a(motionEvent);
        return false;
    }
}
