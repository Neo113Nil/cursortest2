package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class juf extends uif implements Function1 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xqn B;
    public final /* synthetic */ dvf r;
    public final /* synthetic */ int s;
    public final /* synthetic */ float t;
    public final /* synthetic */ uqn u;
    public final /* synthetic */ tqn v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ float x;
    public final /* synthetic */ vqn y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juf(dvf dvfVar, int i, float f, uqn uqnVar, tqn tqnVar, boolean z, float f2, vqn vqnVar, int i2, int i3, xqn xqnVar) {
        super(1);
        this.r = dvfVar;
        this.s = i;
        this.t = f;
        this.u = uqnVar;
        this.v = tqnVar;
        this.w = z;
        this.x = f2;
        this.y = vqnVar;
        this.z = i2;
        this.A = i3;
        this.B = xqnVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v24 float, still in use, count: 2, list:
          (r2v24 float) from 0x002b: PHI (r2v20 float) = (r2v7 float), (r2v24 float) binds: [B:37:0x003b, B:6:0x0028] A[DONT_GENERATE, DONT_INLINE]
          (r2v24 float) from 0x0026: CMP_L (r2v24 float), (r7v0 float) A[WRAPPED] (LINE:39)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            sm0 r11 = (defpackage.sm0) r11
            dvf r0 = r10.r
            int r1 = r10.s
            boolean r2 = defpackage.kuf.c(r0, r1)
            tqn r3 = r10.v
            int r4 = r10.A
            boolean r5 = r10.w
            r6 = 0
            if (r2 != 0) goto Lb5
            r2 = 0
            float r7 = r10.t
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2d
            x6k r2 = r11.e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2b
            goto L3d
        L2b:
            r7 = r2
            goto L3d
        L2d:
            x6k r2 = r11.e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 >= 0) goto L2b
        L3d:
            uqn r2 = r10.u
            float r8 = r2.a
            float r7 = r7 - r8
            float r8 = r0.a(r7)
            boolean r9 = defpackage.kuf.c(r0, r1)
            if (r9 == 0) goto L4d
            goto Lb5
        L4d:
            boolean r9 = defpackage.kuf.a(r5, r0, r1, r4)
            if (r9 != 0) goto Lb5
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 != 0) goto Laf
            float r8 = r2.a
            float r8 = r8 + r7
            r2.a = r8
            float r2 = r10.x
            if (r5 == 0) goto L74
            x6k r7 = r11.e
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L88
            r11.a()
            goto L88
        L74:
            x6k r7 = r11.e
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = -r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L88
            r11.a()
        L88:
            vqn r2 = r10.y
            int r2 = r2.a
            int r7 = r10.z
            r8 = 2
            if (r5 == 0) goto La1
            if (r2 < r8) goto Lb5
            int r2 = r0.e()
            int r2 = r1 - r2
            if (r2 <= r7) goto Lb5
            int r2 = r1 - r7
            r0.f(r2, r6)
            goto Lb5
        La1:
            if (r2 < r8) goto Lb5
            int r2 = r0.c()
            int r2 = r2 - r1
            if (r2 <= r7) goto Lb5
            int r7 = r7 + r1
            r0.f(r7, r6)
            goto Lb5
        Laf:
            r11.a()
            r3.a = r6
            goto Lca
        Lb5:
            boolean r2 = defpackage.kuf.a(r5, r0, r1, r4)
            if (r2 == 0) goto Lc4
            r0.f(r1, r4)
            r3.a = r6
            r11.a()
            goto Lca
        Lc4:
            boolean r11 = defpackage.kuf.c(r0, r1)
            if (r11 != 0) goto Lcd
        Lca:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        Lcd:
            int r11 = r0.b(r1)
            bze r0 = new bze
            xqn r1 = r10.B
            java.lang.Object r1 = r1.a
            vm0 r1 = (defpackage.vm0) r1
            r0.<init>(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juf.invoke(java.lang.Object):java.lang.Object");
    }
}
