package s2;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import t2.C5074h;

/* loaded from: classes.dex */
public final class i extends RelativeLayout {

    /* renamed from: n, reason: collision with root package name */
    public final C5074h f40474n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40475u;

    public i(Context context, String str, String str2, String str3) {
        super(context);
        C5074h c5074h = new C5074h(context);
        c5074h.f40896c = str;
        this.f40474n = c5074h;
        c5074h.f40898e = str2;
        c5074h.f40897d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f40475u) {
            return false;
        }
        this.f40474n.a(motionEvent);
        return false;
    }
}
