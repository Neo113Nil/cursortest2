package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c7$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ id f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ c7$$ExternalSyntheticLambda5(long j, id idVar) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$0 = idVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        id idVar = this.f$0;
        switch (i) {
            case 0:
                return c7.a(idVar, j);
            case 1:
                return fd.a(idVar, j);
            case 2:
                return hd.b(j, idVar);
            case 3:
                return id.a(idVar, j);
            case 4:
                return of.b(idVar, j);
            default:
                return of.c(idVar, j);
        }
    }

    public /* synthetic */ c7$$ExternalSyntheticLambda5(id idVar, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = idVar;
        this.f$1 = j;
    }
}
