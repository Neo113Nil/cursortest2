package defpackage;

/* loaded from: classes.dex */
public final class vep extends uif implements uyc {
    public final /* synthetic */ xep r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vep(xep xepVar) {
        super(6);
        this.r = xepVar;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wof wofVar = (wof) obj2;
        long j = ((enj) obj3).a;
        long j2 = ((enj) obj4).a;
        xep xepVar = this.r;
        long a = xep.a(xepVar, wofVar, j);
        long a2 = xep.a(xepVar, wofVar, j2);
        xepVar.l(booleanValue);
        return Boolean.valueOf(xepVar.p(a, a2, ((Boolean) obj5).booleanValue(), (zdp) obj6));
    }
}
