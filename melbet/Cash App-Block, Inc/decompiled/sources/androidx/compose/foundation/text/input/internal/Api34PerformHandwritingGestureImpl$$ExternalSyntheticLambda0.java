package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IntConsumer f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0(IntConsumer intConsumer, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = intConsumer;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        IntConsumer intConsumer = this.f$0;
        switch (i) {
            case 0:
                intConsumer.accept(i2);
                break;
            default:
                intConsumer.accept(i2);
                break;
        }
    }
}
