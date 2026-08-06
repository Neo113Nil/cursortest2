package h;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: h.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0201H implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0202I f3155a;

    public ViewOnTouchListenerC0201H(AbstractC0202I abstractC0202I) {
        this.f3155a = abstractC0202I;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        AbstractC0202I abstractC0202I = this.f3155a;
        if (action == 0 && (rVar = abstractC0202I.f3178v) != null && rVar.isShowing() && x2 >= 0 && x2 < abstractC0202I.f3178v.getWidth() && y2 >= 0 && y2 < abstractC0202I.f3178v.getHeight()) {
            abstractC0202I.f3175r.postDelayed(abstractC0202I.f3171n, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC0202I.f3175r.removeCallbacks(abstractC0202I.f3171n);
        return false;
    }
}
