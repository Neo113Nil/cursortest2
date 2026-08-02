package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes4.dex */
public final /* synthetic */ class xc61 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ jci0 c;
    public final /* synthetic */ Ref$ObjectRef w;
    public final /* synthetic */ Ref$ObjectRef x;

    public /* synthetic */ xc61(jci0 jci0Var, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.c = jci0Var;
        this.b = ref$ObjectRef;
        this.w = ref$ObjectRef2;
        this.x = ref$ObjectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.lang.Integer] */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$ObjectRef ref$ObjectRef = this.x;
        Ref$ObjectRef ref$ObjectRef2 = this.w;
        jci0 jci0Var = this.c;
        Ref$ObjectRef ref$ObjectRef3 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue == 21589) {
                    if (longValue >= 1) {
                        byte readByte = jci0Var.readByte();
                        boolean z = (readByte & 1) == 1;
                        boolean z2 = (readByte & 2) == 2;
                        boolean z3 = (readByte & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (longValue >= j) {
                            if (z) {
                                ref$ObjectRef3.element = Integer.valueOf(jci0Var.d2());
                            }
                            if (z2) {
                                ref$ObjectRef2.element = Integer.valueOf(jci0Var.d2());
                            }
                            if (z3) {
                                ref$ObjectRef.element = Integer.valueOf(jci0Var.d2());
                                break;
                            }
                        } else {
                            ny61.v("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        ny61.v("bad zip: extended timestamp extra too short");
                    }
                    break;
                }
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue2 == 1) {
                    if (ref$ObjectRef3.element != 0) {
                        ny61.v("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    } else if (longValue2 == 24) {
                        ref$ObjectRef3.element = Long.valueOf(jci0Var.X());
                        ref$ObjectRef2.element = Long.valueOf(jci0Var.X());
                        ref$ObjectRef.element = Long.valueOf(jci0Var.X());
                        break;
                    } else {
                        ny61.v("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    break;
                }
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ xc61(Ref$ObjectRef ref$ObjectRef, jci0 jci0Var, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.b = ref$ObjectRef;
        this.c = jci0Var;
        this.w = ref$ObjectRef2;
        this.x = ref$ObjectRef3;
    }
}
