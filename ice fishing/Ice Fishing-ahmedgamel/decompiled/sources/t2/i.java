package t2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import u2.C5076g;

/* loaded from: classes.dex */
public final class i extends RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public final C5076g f40845n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40846u;

    public i(Context context, String str, String str2, String str3) {
        super(context);
        C5076g c5076g = new C5076g(context);
        c5076g.f41273c = str;
        this.f40845n = c5076g;
        c5076g.f41275e = str2;
        c5076g.f41274d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f40846u) {
            return false;
        }
        this.f40845n.a(motionEvent);
        return false;
    }
}
