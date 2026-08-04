package com.gamericefishpro.space.i2;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int d = 0;
    public Object e;
    public int i;
    public Object v;
    public Object w;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.gamericefishpro.space.ei.a0 a0Var, com.gamericefishpro.space.t0.u1 u1Var, com.gamericefishpro.space.z4.u uVar, j2 j2Var, View view, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = a0Var;
        this.w = u1Var;
        this.y = uVar;
        this.z = j2Var;
        this.A = view;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function1] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        int i = this.d;
        Object obj2 = this.A;
        Object obj3 = this.z;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i2 i2Var = new i2((com.gamericefishpro.space.ei.a0) this.v, (com.gamericefishpro.space.t0.u1) this.w, (com.gamericefishpro.space.z4.u) this.y, (j2) obj3, (View) obj2, aVar);
                i2Var.e = obj;
                return i2Var;
            case 1:
                i2 i2Var2 = new i2((List) obj3, (ArrayList) obj2, aVar);
                i2Var2.y = obj;
                return i2Var2;
            case 2:
                i2 i2Var3 = new i2((com.gamericefishpro.space.ri.i) this.w, (com.gamericefishpro.space.w.b) this.y, (com.gamericefishpro.space.t0.v0) obj3, (com.gamericefishpro.space.t0.v0) obj2, aVar);
                i2Var3.e = obj;
                return i2Var3;
            default:
                com.gamericefishpro.space.w.e0 e0Var = com.gamericefishpro.space.w.e0.d;
                i2 i2Var4 = new i2((com.gamericefishpro.space.w.h0) obj3, (Function1) obj2, aVar);
                i2Var4.y = obj;
                return i2Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((i2) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((i2) create(obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((i2) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((i2) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x013b -> B:71:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01d9 -> B:89:0x01b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0203 -> B:89:0x01b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // com.gamericefishpro.space.vh.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.i2.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.gamericefishpro.space.ri.i iVar, com.gamericefishpro.space.w.b bVar, com.gamericefishpro.space.t0.v0 v0Var, com.gamericefishpro.space.t0.v0 v0Var2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.w = iVar;
        this.y = bVar;
        this.z = v0Var;
        this.A = v0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i2(com.gamericefishpro.space.w.h0 h0Var, Function1 function1, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        com.gamericefishpro.space.w.e0 e0Var = com.gamericefishpro.space.w.e0.d;
        this.z = h0Var;
        this.A = (com.gamericefishpro.space.vh.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(List list, ArrayList arrayList, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.z = list;
        this.A = arrayList;
    }
}
