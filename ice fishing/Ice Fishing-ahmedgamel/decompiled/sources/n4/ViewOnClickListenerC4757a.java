package n4;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.icefishing.icefishingbigwin.C5275R;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4757a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39475n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f39476u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f39477v;

    public /* synthetic */ ViewOnClickListenerC4757a(c cVar, int i, int i6) {
        this.f39475n = i6;
        this.f39477v = cVar;
        this.f39476u = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f39475n) {
            case 0:
                c cVar = this.f39477v;
                view.startAnimation(AnimationUtils.loadAnimation(cVar.f39484d, C5275R.anim.button_push));
                c.e(cVar, this.f39476u);
                break;
            default:
                c cVar2 = this.f39477v;
                view.startAnimation(AnimationUtils.loadAnimation(cVar2.f39484d, C5275R.anim.button_push));
                c.e(cVar2, this.f39476u);
                break;
        }
    }
}
