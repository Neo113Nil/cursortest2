package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ahr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6g b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ o6g e;

    public /* synthetic */ ahr(o6g o6gVar, long j, float f, o6g o6gVar2, int i) {
        this.a = i;
        this.b = o6gVar;
        this.c = j;
        this.d = f;
        this.e = o6gVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                o6g o6gVar = this.b;
                long j = this.c;
                jpa.A0(opfVar, o6gVar, 0L, j, 0.0f, null, null, 8, 58);
                jpa.A0(opfVar, this.e, swf.i(nmq.d(opfVar.a.e()) - this.d, 0.0f), j, 0.0f, null, null, 8, 56);
                break;
            default:
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                opfVar2.a();
                o6g o6gVar2 = this.b;
                long j2 = this.c;
                jpa.A0(opfVar2, o6gVar2, 0L, j2, 0.0f, null, null, 8, 58);
                jpa.A0(opfVar2, this.e, swf.i(nmq.d(opfVar2.a.e()) - this.d, 0.0f), j2, 0.0f, null, null, 8, 56);
                break;
        }
        return Unit.a;
    }
}
