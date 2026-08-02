package defpackage;

import androidx.compose.foundation.lazy.b;
import com.yandex.go.summary.ui.compose.common.animation.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class rqu implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ b b;
    public final /* synthetic */ int c;

    public /* synthetic */ rqu(int i, b bVar) {
        this.c = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                return new z69(i2, bVar);
            default:
                return Float.valueOf(c.h(i2, bVar));
        }
    }

    public /* synthetic */ rqu(b bVar, int i) {
        this.b = bVar;
        this.c = i;
    }
}
