package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class vxv implements uyc {
    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        k1w k1wVar = (k1w) obj;
        xyv xyvVar = (xyv) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        boolean booleanValue3 = ((Boolean) obj5).booleanValue();
        boolean booleanValue4 = ((Boolean) obj6).booleanValue();
        k1wVar.getClass();
        xyvVar.getClass();
        if (xyvVar instanceof vyv) {
            return new zyv(k1wVar.d, booleanValue, booleanValue2, booleanValue3, booleanValue4, ((vyv) xyvVar).a);
        }
        if (xyvVar instanceof wyv) {
            wyv wyvVar = (wyv) xyvVar;
            return new azv(k1wVar.d, booleanValue, booleanValue2, booleanValue3, booleanValue4, wyvVar.a, wyvVar.b);
        }
        b6e.s();
        return null;
    }
}
