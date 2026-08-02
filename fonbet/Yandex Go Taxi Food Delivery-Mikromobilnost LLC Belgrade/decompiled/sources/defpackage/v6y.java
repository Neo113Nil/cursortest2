package defpackage;

import androidx.compose.foundation.lazy.b;
import com.yandex.go.summary.ui.compose.common.animation.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class v6y implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float w;

    public /* synthetic */ v6y(b bVar, int i, float f, int i2, int i3) {
        this.a = i3;
        this.b = bVar;
        this.c = i;
        this.w = f;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        float f = this.w;
        int i2 = this.c;
        b bVar = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                c.a(bVar, i2, f, fidVar, vng.O(1));
                break;
            default:
                c.b(bVar, i2, f, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
