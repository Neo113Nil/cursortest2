package defpackage;

import android.content.Context;
import com.yandex.passport.common.ui.view.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class mrl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    public /* synthetic */ mrl(int i, long j, boolean z) {
        this.a = i;
        this.b = z;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                np3 np3Var = (np3) obj;
                np3Var.getClass();
                return np3Var.b(new mrl(1, this.c, this.b));
            case 1:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                if (this.b) {
                    jpa.B(opfVar, this.c, 0L, 0L, 0.0f, null, 0, 126);
                }
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                d dVar = new d(context);
                dVar.setColor(c3x.U(this.b ? d85.f : this.c));
                dVar.a();
                return dVar;
        }
    }
}
