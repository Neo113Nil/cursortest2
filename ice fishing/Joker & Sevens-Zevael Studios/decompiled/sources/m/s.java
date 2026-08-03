package m;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f4437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f4438d;

    public s(u uVar, int i10, int i11, WeakReference weakReference) {
        this.f4438d = uVar;
        this.f4435a = i10;
        this.f4436b = i11;
        this.f4437c = weakReference;
    }

    public final void a(int i10) {
        new Handler(Looper.getMainLooper()).post(new c6.a(this, i10));
    }

    public final void c(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f4435a) != -1) {
            typeface = Typeface.create(typeface, i10, (this.f4436b & 2) != 0);
        }
        u uVar = this.f4438d;
        if (uVar.f4477m) {
            uVar.f4476l = typeface;
            TextView textView = (TextView) this.f4437c.get();
            if (textView != null) {
                Field field = h3.w.f2829a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new t(uVar.f4474j, 0, textView, typeface));
                } else {
                    textView.setTypeface(typeface, uVar.f4474j);
                }
            }
        }
    }

    public final void b(int i10) {
    }
}
