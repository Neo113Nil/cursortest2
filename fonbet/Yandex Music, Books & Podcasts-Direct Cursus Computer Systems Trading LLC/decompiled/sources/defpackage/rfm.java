package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rfm extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ tfm s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfm(tfm tfmVar, int i) {
        super(1);
        this.r = i;
        this.s = tfmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                jj0 jj0Var = this.s.a;
                if (jj0Var != null) {
                    jj0Var.invoke(motionEvent);
                    return Unit.a;
                }
                Intrinsics.j("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                jj0 jj0Var2 = this.s.a;
                if (jj0Var2 != null) {
                    jj0Var2.invoke(motionEvent2);
                    return Unit.a;
                }
                Intrinsics.j("onTouchEvent");
                throw null;
        }
    }
}
