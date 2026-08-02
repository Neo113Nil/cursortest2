package defpackage;

import com.yandex.plus.plaquesdk.plaque.c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m8t extends j8t {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public m8t(b8t b8tVar) {
        this.b = b8tVar;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void e(b8t b8tVar) {
        switch (this.a) {
            case 0:
                ((b8t) this.b).K();
                b8tVar.H(this);
                return;
            default:
                b8tVar.getClass();
                Iterator it = ((c) this.b).i.iterator();
                if (it.hasNext()) {
                    throw hrg.j(it);
                }
                return;
        }
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void f(b8t b8tVar) {
        switch (this.a) {
            case 1:
                b8tVar.getClass();
                Iterator it = ((c) this.b).i.iterator();
                if (it.hasNext()) {
                    throw hrg.j(it);
                }
                return;
            default:
                return;
        }
    }

    public m8t(c cVar, com.yandex.plus.plaquesdk.plaque.api.dependencies.c cVar2, com.yandex.plus.plaquesdk.plaque.api.dependencies.c cVar3) {
        this.b = cVar;
    }
}
