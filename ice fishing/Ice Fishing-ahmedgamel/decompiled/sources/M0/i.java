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
import p.BinderC4815e;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1807n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1808u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1809v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f1810w;

    public /* synthetic */ i(int i, int i6, Object obj, Object obj2) {
        this.f1807n = i6;
        this.f1809v = obj;
        this.f1810w = obj2;
        this.f1808u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1807n) {
            case 0:
                Intent intent = (Intent) this.f1810w;
                ((j) this.f1809v).a(this.f1808u, intent);
                break;
            case 1:
                ((SystemForegroundService) this.f1810w).f5396x.notify(this.f1808u, (Notification) this.f1809v);
                break;
            case 2:
                ((TextView) this.f1809v).setTypeface((Typeface) this.f1810w, this.f1808u);
                break;
            case 3:
                ((BinderC4815e) this.f1810w).f39688u.e(this.f1808u, (Bundle) this.f1809v);
                break;
            default:
                ((BottomSheetBehavior) this.f1810w).E((View) this.f1809v, this.f1808u, false);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i, Parcelable parcelable, int i6) {
        this.f1807n = i6;
        this.f1810w = obj;
        this.f1808u = i;
        this.f1809v = parcelable;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1807n = 4;
        this.f1810w = bottomSheetBehavior;
        this.f1809v = view;
        this.f1808u = i;
    }
}
