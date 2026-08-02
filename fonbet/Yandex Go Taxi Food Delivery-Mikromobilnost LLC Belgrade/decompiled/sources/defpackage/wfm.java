package defpackage;

import android.view.View;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.shortcuts.impl.view.adapter.f;
import com.yandex.go.shortcuts.impl.view.adapter.v;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class wfm implements tls {
    public final /* synthetic */ j1s0 A;
    public final /* synthetic */ mqv0 B;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ w3s0 b;
    public final /* synthetic */ t4s0 c;
    public final /* synthetic */ c1f w;
    public final /* synthetic */ n170 x;
    public final /* synthetic */ a y;
    public final /* synthetic */ c z;

    public /* synthetic */ wfm(w3s0 w3s0Var, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, a aVar, c cVar, j1s0 j1s0Var, mqv0 mqv0Var) {
        this.b = w3s0Var;
        this.c = t4s0Var;
        this.w = c1fVar;
        this.x = n170Var;
        this.y = aVar;
        this.z = cVar;
        this.A = j1s0Var;
        this.B = mqv0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new f(this.w, this.x, this.A, this.b, this.c, this.B, (View) obj, this.y, this.z);
            default:
                return new v(this.w, this.x, this.A, this.b, this.c, this.B, (View) obj, this.y, this.z);
        }
    }

    public /* synthetic */ wfm(w3s0 w3s0Var, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, c cVar, a aVar, j1s0 j1s0Var, mqv0 mqv0Var) {
        this.b = w3s0Var;
        this.c = t4s0Var;
        this.w = c1fVar;
        this.x = n170Var;
        this.z = cVar;
        this.y = aVar;
        this.A = j1s0Var;
        this.B = mqv0Var;
    }
}
