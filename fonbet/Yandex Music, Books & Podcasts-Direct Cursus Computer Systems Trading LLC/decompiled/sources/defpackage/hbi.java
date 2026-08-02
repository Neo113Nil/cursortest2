package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class hbi extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ float s;
    public final /* synthetic */ long t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbi(float f, long j, zcq zcqVar) {
        super(1);
        this.s = f;
        this.t = j;
        this.u = zcqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ooa ooaVar = (ooa) obj;
                float f = this.s;
                Float valueOf = Float.valueOf(f);
                LinkedHashMap linkedHashMap = ooaVar.a;
                LinkedHashMap linkedHashMap2 = ooaVar.a;
                linkedHashMap.put(gdq.a, valueOf);
                int i = (int) (this.t & 4294967295L);
                float f2 = i;
                if (f2 > f / 2 && !((zcq) this.u).a) {
                    linkedHashMap2.put(gdq.c, Float.valueOf(f / 2.0f));
                }
                if (i != 0) {
                    linkedHashMap2.put(gdq.b, Float.valueOf(Math.max(0.0f, f - f2)));
                }
                break;
            default:
                qoa qoaVar = (qoa) obj;
                cci cciVar = cci.a;
                float f3 = this.s;
                qoaVar.a(cciVar, f3);
                float f4 = f3 / 2.0f;
                boolean z = ((bci) this.u).a;
                long j = this.t;
                if (!z && ((int) (j & 4294967295L)) > f4) {
                    qoaVar.a(cci.c, f4);
                }
                int i2 = (int) (j & 4294967295L);
                if (i2 != 0) {
                    qoaVar.a(cci.b, Math.max(0.0f, f3 - i2));
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbi(float f, bci bciVar, long j) {
        super(1);
        this.s = f;
        this.u = bciVar;
        this.t = j;
    }
}
