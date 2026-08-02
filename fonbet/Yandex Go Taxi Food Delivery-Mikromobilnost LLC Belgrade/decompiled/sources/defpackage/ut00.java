package defpackage;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.mapview.MapView;

/* loaded from: classes7.dex */
public final class ut00 implements qwc0, gey, au00 {
    public final e40 a;
    public final MapView b;

    public ut00(Context context, e40 e40Var) {
        this.a = e40Var;
        this.b = new MapView(context);
        e40Var.a.add(this);
        Lifecycle lifecycle = e40Var.b;
        if ((lifecycle != null ? lifecycle.b() : null) == Lifecycle.State.RESUMED) {
            onStart();
        }
    }

    @Override // defpackage.qwc0
    public final void dispose() {
    }

    @Override // defpackage.au00
    public final MapWindow getMapWindow() {
        return this.b.getMapWindow();
    }

    @Override // defpackage.qwc0
    public final View getView() {
        return this.b;
    }

    @Override // defpackage.gey
    public final void onStart() {
        this.b.onStart();
        MapKitFactory.getInstance().onStart();
    }

    @Override // defpackage.gey
    public final void onStop() {
        this.b.onStop();
        MapKitFactory.getInstance().onStop();
    }

    @Override // defpackage.au00
    public final void release() {
        this.a.a.remove(this);
    }
}
