package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c7$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ id f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ c7$$ExternalSyntheticLambda8(id idVar, long j, long j2, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = idVar;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$3;
        switch (i) {
            case 0:
                return c7.a(this.f$0, this.f$1, this.f$2, (xf) obj);
            default:
                return hd.a(this.f$0, this.f$1, this.f$2, (hd) obj);
        }
    }
}
