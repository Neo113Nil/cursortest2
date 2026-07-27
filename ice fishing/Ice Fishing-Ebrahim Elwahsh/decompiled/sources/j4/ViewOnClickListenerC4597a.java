package j4;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: j4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC4597a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38552n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f38553u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f38554v;

    public /* synthetic */ ViewOnClickListenerC4597a(c cVar, int i, int i4) {
        this.f38552n = i4;
        this.f38554v = cVar;
        this.f38553u = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38552n) {
            case 0:
                c cVar = this.f38554v;
                view.startAnimation(AnimationUtils.loadAnimation(cVar.f38561d, C5284R.anim.button_push));
                c.e(cVar, this.f38553u);
                break;
            default:
                c cVar2 = this.f38554v;
                view.startAnimation(AnimationUtils.loadAnimation(cVar2.f38561d, C5284R.anim.button_push));
                c.e(cVar2, this.f38553u);
                break;
        }
    }
}
