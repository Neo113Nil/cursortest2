package defpackage;

import android.content.Context;
import kotlin.a;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class vjm {
    public final tt2 a;
    public final Context b;
    public final e c;
    public final hbp0 d;
    public final i3y e;

    public vjm(tt2 tt2Var, Context context, e eVar) {
        this.a = tt2Var;
        this.b = context;
        this.c = eVar;
        final int i = 0;
        this.d = new hbp0(new sls(this) { // from class: ujm
            public final /* synthetic */ vjm b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                vjm vjmVar = this.b;
                switch (i2) {
                    case 0:
                        vjmVar.a.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                    default:
                        return Integer.valueOf(tje.r(mrg0.component_text_size_body, vjmVar.b));
                }
            }
        }, vjm.class.getName(), null, 4);
        final int i2 = 1;
        this.e = a.a(new sls(this) { // from class: ujm
            public final /* synthetic */ vjm b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                vjm vjmVar = this.b;
                switch (i22) {
                    case 0:
                        vjmVar.a.getClass();
                        sjh sjhVar = uyj.a;
                        return mdh.b;
                    default:
                        return Integer.valueOf(tje.r(mrg0.component_text_size_body, vjmVar.b));
                }
            }
        });
    }
}
