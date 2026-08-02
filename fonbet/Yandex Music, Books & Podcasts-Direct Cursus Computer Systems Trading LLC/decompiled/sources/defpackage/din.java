package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class din implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ein b;

    public /* synthetic */ din(ein einVar, int i) {
        this.a = i;
        this.b = einVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Activity activity = (Activity) CollectionsKt.Z(frc.a.c);
                if (activity != null) {
                    ein.b(this.b, activity);
                }
                break;
            default:
                Activity activity2 = (Activity) CollectionsKt.Z(frc.a.c);
                if (activity2 != null) {
                    ein.b(this.b, activity2);
                }
                break;
        }
        return Unit.a;
    }
}
