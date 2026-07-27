package B;

import F.k;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import c0.r;
import h.f0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f40a = i2;
        this.f41b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f40a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z2, Uri uri) {
        switch (this.f40a) {
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                h hVar = (h) this.f41b;
                if (!hVar.f2611t) {
                    if (Settings.Global.getFloat(hVar.f2598f, "transition_animation_scale", 1.0f) == 0.0f) {
                        hVar.f2603k |= 4;
                    } else {
                        hVar.f2603k &= -5;
                    }
                    ((FlutterJNI) hVar.f2594b.f524f).setAccessibilityFeatures(hVar.f2603k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var) {
        super(new Handler());
        this.f40a = 0;
        this.f41b = f0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f40a) {
            case 0:
                f0 f0Var = (f0) this.f41b;
                if (f0Var.f45f && (cursor = f0Var.f46g) != null && !cursor.isClosed()) {
                    f0Var.f44e = f0Var.f46g.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z2);
                r rVar = (r) this.f41b;
                if (rVar.f1747m != null) {
                    rVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
