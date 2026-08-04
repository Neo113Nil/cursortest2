package com.gamericefishpro.space.z5;

import android.view.View;
import com.gamericefishpro.space.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[LOOP:0: B:22:0x0067->B:26:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[EDGE_INSN: B:31:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:22:0x0067->B:26:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.gamericefishpro.space.b2.c0 r8, com.gamericefishpro.space.b2.i r9, com.gamericefishpro.space.vh.a r10) {
        /*
            boolean r0 = r10 instanceof com.gamericefishpro.space.z.e0
            if (r0 == 0) goto L13
            r0 = r10
            com.gamericefishpro.space.z.e0 r0 = (com.gamericefishpro.space.z.e0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            com.gamericefishpro.space.z.e0 r0 = new com.gamericefishpro.space.z.e0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            com.gamericefishpro.space.b2.i r8 = r0.e
            com.gamericefishpro.space.b2.c0 r9 = r0.d
            com.gamericefishpro.space.wa.b.P(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            com.gamericefishpro.space.wa.b.P(r10)
            com.gamericefishpro.space.b2.f0 r10 = r8.y
            com.gamericefishpro.space.b2.h r10 = r10.L
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            com.gamericefishpro.space.b2.m r6 = (com.gamericefishpro.space.b2.m) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L77
        L51:
            r0.d = r8
            r0.e = r9
            r0.v = r4
            java.lang.Object r10 = r8.a(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            com.gamericefishpro.space.b2.h r10 = (com.gamericefishpro.space.b2.h) r10
            java.util.List r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            com.gamericefishpro.space.b2.m r6 = (com.gamericefishpro.space.b2.m) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.z5.g.a(com.gamericefishpro.space.b2.c0, com.gamericefishpro.space.b2.i, com.gamericefishpro.space.vh.a):java.lang.Object");
    }

    public static final e b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            e eVar = tag instanceof e ? (e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objB = com.gamericefishpro.space.hj.c.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final void c(View view, e eVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }
}
