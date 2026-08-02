package defpackage;

import android.os.CountDownTimer;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ejs extends CountDownTimer {
    public final /* synthetic */ fjs a;
    public final /* synthetic */ uif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ejs(fjs fjsVar, Function0 function0, long j) {
        super(j, 1000L);
        this.a = fjsVar;
        this.b = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.b();
        this.b.invoke();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
