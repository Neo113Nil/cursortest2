package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class qrq implements View.OnAttachStateChangeListener {
    public final srq a;
    public final boolean b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public ipv d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public qrq(srq srqVar, boolean z) {
        this.a = srqVar;
        this.b = z;
    }

    public final void c() {
        this.c.removeCallbacksAndMessages(null);
        if (this.e) {
            return;
        }
        this.e = true;
        srq srqVar = this.a;
        srqVar.c();
        if (this.h) {
            if (this.f) {
                srqVar.b();
            }
            if (this.g) {
                srqVar.onResume();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ipv ipvVar;
        view.getClass();
        if (this.d != null) {
            return;
        }
        Object tag = view.getTag(R.id.slab_window_events_hook_view);
        if (tag instanceof ipv) {
            ipvVar = (ipv) tag;
        } else {
            Activity q = o8g.q(view.getContext());
            ipv ipvVar2 = (ipv) q.findViewById(R.id.slab_window_events_hook_view);
            if (ipvVar2 == null) {
                ipvVar2 = new ipv(q);
                ipvVar2.setId(R.id.slab_window_events_hook_view);
                q.addContentView(ipvVar2, new FrameLayout.LayoutParams(0, 0));
            }
            ipvVar = ipvVar2;
            view.setTag(R.id.slab_window_events_hook_view, ipvVar);
        }
        ArrayList arrayList = ipvVar.b.a;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.f = ipvVar.e;
        this.g = ipvVar.f;
        this.h = true;
        this.d = ipvVar;
        if (!this.b) {
            c();
        } else {
            this.c.post(new bhp(3, this));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dkj dkjVar;
        ArrayList arrayList;
        int indexOf;
        view.getClass();
        this.c.removeCallbacksAndMessages(null);
        if (this.d == null) {
            return;
        }
        boolean z = this.e;
        srq srqVar = this.a;
        if (z) {
            if (this.h) {
                if (this.g) {
                    srqVar.a();
                }
                if (this.f) {
                    srqVar.onStop();
                }
            }
            this.g = false;
            this.f = false;
        }
        if (this.e) {
            srqVar.d();
            this.e = false;
        }
        ipv ipvVar = this.d;
        if (ipvVar != null && (indexOf = (arrayList = (dkjVar = ipvVar.b).a).indexOf(this)) != -1) {
            if (dkjVar.b == 0) {
                arrayList.remove(indexOf);
            } else {
                dkjVar.c = true;
                arrayList.set(indexOf, null);
            }
        }
        this.d = null;
    }
}
