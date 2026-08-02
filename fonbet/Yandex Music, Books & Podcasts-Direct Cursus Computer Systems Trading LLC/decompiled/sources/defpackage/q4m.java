package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class q4m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q4m(int i, long j, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = (String) this.d;
                long j = this.c;
                xjo xjoVar = (xjo) obj;
                xjoVar.getClass();
                cko D0 = xjoVar.D0("UPDATE playlist SET liked=?, liked_timestamp=COALESCE(?, liked_timestamp) WHERE _id=?");
                try {
                    D0.bindLong(1, z ? 1L : 0L);
                    if (str == null) {
                        D0.bindNull(2);
                    } else {
                        D0.E(2, str);
                    }
                    D0.bindLong(3, j);
                    D0.q();
                    D0.close();
                    return Unit.a;
                } catch (Throwable th) {
                    D0.close();
                    throw th;
                }
            default:
                Function0 function0 = (Function0) this.d;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                float floatValue = this.b ? 1.0f : ((Number) function0.invoke()).floatValue();
                Float valueOf = Float.valueOf((1.0f - floatValue) * 0.3f);
                long j2 = this.c;
                jpa.A0(opfVar, y9w.U(new Pair[]{new Pair(valueOf, new d85(d85.b(j2, (floatValue * 0.68f) + 0.2f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(j2, 0.88f, 0.0f, 0.0f, 0.0f, 14)))}, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.a;
        }
    }
}
