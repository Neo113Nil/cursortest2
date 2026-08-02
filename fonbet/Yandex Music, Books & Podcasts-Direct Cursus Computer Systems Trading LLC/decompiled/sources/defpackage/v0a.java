package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v0a implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ gc8 b;

    public /* synthetic */ v0a(gc8 gc8Var, int i) {
        this.a = i;
        this.b = gc8Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                String valueOf = String.valueOf(((Number) obj).intValue() == 2);
                gc8 gc8Var = this.b;
                gc8Var.N("is_landscape", valueOf);
                Context context = gc8Var.getContext();
                context.getClass();
                gc8Var.N("is_screen_reader_enabled", String.valueOf(ff7.H(context)));
                break;
            default:
                chk chkVar = (chk) obj;
                if (!(chkVar instanceof ygk)) {
                    if (!(chkVar instanceof xgk) && !Intrinsics.d(chkVar, ahk.a) && !Intrinsics.d(chkVar, bhk.a)) {
                        b6e.s();
                        break;
                    }
                } else {
                    p3n p3nVar = ((ygk) chkVar).a;
                    String str = p3nVar.d;
                    String str2 = p3nVar.e;
                    gc8 gc8Var2 = this.b;
                    gc8Var2.post(new cy1(26, str2, gc8Var2, str));
                }
                break;
        }
        return Unit.a;
    }
}
