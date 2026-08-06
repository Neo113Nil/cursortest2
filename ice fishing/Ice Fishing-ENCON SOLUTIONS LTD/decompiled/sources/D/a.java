package D;

import P0.t;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import h.d0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.h;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Handler handler, int i2) {
        super(handler);
        this.f197a = i2;
        this.f198b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f197a) {
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
        switch (this.f197a) {
            case 2:
                h hVar = (h) this.f198b;
                if (!hVar.t) {
                    if (Settings.Global.getFloat(hVar.f7980f, "transition_animation_scale", 1.0f) == 0.0f) {
                        hVar.f7985k |= 4;
                    } else {
                        hVar.f7985k &= -5;
                    }
                    ((FlutterJNI) hVar.f7976b.f722c).setAccessibilityFeatures(hVar.f7985k);
                    break;
                }
                break;
            default:
                super.onChange(z2, uri);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 d0Var) {
        super(new Handler());
        this.f197a = 0;
        this.f198b = d0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Cursor cursor;
        switch (this.f197a) {
            case 0:
                d0 d0Var = (d0) this.f198b;
                if (d0Var.f202b && (cursor = d0Var.f203c) != null && !cursor.isClosed()) {
                    d0Var.f201a = d0Var.f203c.requery();
                    break;
                }
                break;
            case 1:
                super.onChange(z2);
                t tVar = (t) this.f198b;
                if (tVar.f1464i != null) {
                    tVar.d();
                    break;
                }
                break;
            default:
                onChange(z2, null);
                break;
        }
    }
}
