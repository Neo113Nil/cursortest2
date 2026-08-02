package X0;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.IceFishing.LiveIceFishing.C5248R;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3737n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3738u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f3739v;

    public /* synthetic */ a(c cVar, int i, int i4) {
        this.f3737n = i4;
        this.f3739v = cVar;
        this.f3738u = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3737n) {
            case 0:
                c cVar = this.f3739v;
                view.startAnimation(AnimationUtils.loadAnimation(cVar.f3746d, C5248R.anim.button_push));
                c.e(cVar, this.f3738u);
                break;
            default:
                c cVar2 = this.f3739v;
                view.startAnimation(AnimationUtils.loadAnimation(cVar2.f3746d, C5248R.anim.button_push));
                c.e(cVar2, this.f3738u);
                break;
        }
    }
}
