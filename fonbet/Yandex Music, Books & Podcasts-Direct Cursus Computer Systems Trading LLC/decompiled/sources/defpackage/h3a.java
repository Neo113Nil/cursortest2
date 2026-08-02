package defpackage;

import com.yandex.passport.internal.core.accounts.h;
import com.yandex.passport.internal.ui.bouncer.o;
import com.yandex.plus.bdui.flex.ui.content.c;
import com.yandex.plus.bdui.flex.ui.error.a;
import com.yandex.plus.bdui.flex.utils.b;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class h3a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3a b;

    public /* synthetic */ h3a(o3a o3aVar, int i) {
        this.a = i;
        this.b = o3aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m4a a = ((m6a) this.b.A.a).a();
                if (a != null) {
                    return a.a;
                }
                return null;
            case 1:
                o3a o3aVar = this.b;
                mka mkaVar = new mka(o3aVar.c);
                cir cirVar = o3aVar.A;
                pt0 pt0Var = o3aVar.y;
                return new qdc(mkaVar, new ovn());
            default:
                o3a o3aVar2 = this.b;
                h hVar = o3aVar2.b;
                r7b r7bVar = o3aVar2.s;
                hVar.getClass();
                r7bVar.getClass();
                b bVar = (b) hVar.b;
                return new a(bVar, (ps) hVar.c, (com.yandex.plus.bdui.ui.a) ((o) hVar.d).invoke(bVar.e(r7bVar)), (c) hVar.e);
        }
    }
}
