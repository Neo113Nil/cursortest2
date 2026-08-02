package M0;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.BinderC4819e;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1840n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1841u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1842v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1843w;

    public /* synthetic */ i(int i, int i4, Object obj, Object obj2) {
        this.f1840n = i4;
        this.f1842v = obj;
        this.f1843w = obj2;
        this.f1841u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1840n) {
            case 0:
                Intent intent = (Intent) this.f1843w;
                ((j) this.f1842v).a(this.f1841u, intent);
                break;
            case 1:
                ((SystemForegroundService) this.f1843w).f5361x.notify(this.f1841u, (Notification) this.f1842v);
                break;
            case 2:
                ((TextView) this.f1842v).setTypeface((Typeface) this.f1843w, this.f1841u);
                break;
            case 3:
                ((BinderC4819e) this.f1843w).f39796u.e(this.f1841u, (Bundle) this.f1842v);
                break;
            default:
                ((BottomSheetBehavior) this.f1843w).E((View) this.f1842v, this.f1841u, false);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i, Parcelable parcelable, int i4) {
        this.f1840n = i4;
        this.f1843w = obj;
        this.f1841u = i;
        this.f1842v = parcelable;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1840n = 4;
        this.f1843w = bottomSheetBehavior;
        this.f1842v = view;
        this.f1841u = i;
    }
}
