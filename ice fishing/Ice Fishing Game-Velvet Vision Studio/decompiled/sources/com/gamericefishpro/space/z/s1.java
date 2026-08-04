package com.gamericefishpro.space.z;

import com.gamericefishpro.space.i9.d5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {
    static {
        new c0(3, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.gamericefishpro.space.b2.c0 r5, boolean r6, com.gamericefishpro.space.b2.i r7, com.gamericefishpro.space.vh.a r8) {
        /*
            boolean r0 = r8 instanceof com.gamericefishpro.space.z.r1
            if (r0 == 0) goto L13
            r0 = r8
            com.gamericefishpro.space.z.r1 r0 = (com.gamericefishpro.space.z.r1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            com.gamericefishpro.space.z.r1 r0 = new com.gamericefishpro.space.z.r1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            com.gamericefishpro.space.uh.a r1 = com.gamericefishpro.space.uh.a.d
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.i
            com.gamericefishpro.space.b2.i r6 = r0.e
            com.gamericefishpro.space.b2.c0 r7 = r0.d
            com.gamericefishpro.space.wa.b.P(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.gamericefishpro.space.wa.b.P(r8)
        L3c:
            r0.d = r5
            r0.e = r7
            r0.i = r6
            r0.w = r3
            java.lang.Object r8 = r5.a(r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.gamericefishpro.space.b2.h r8 = (com.gamericefishpro.space.b2.h) r8
            boolean r2 = c(r8, r6)
            if (r2 == 0) goto L3c
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gamericefishpro.space.z.s1.a(com.gamericefishpro.space.b2.c0, boolean, com.gamericefishpro.space.b2.i, com.gamericefishpro.space.vh.a):java.lang.Object");
    }

    public static boolean c(com.gamericefishpro.space.b2.h hVar, boolean z) {
        List list = hVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean zO = true;
            if (i >= size) {
                return true;
            }
            com.gamericefishpro.space.b2.m mVar = (com.gamericefishpro.space.b2.m) list.get(i);
            if (!z) {
                zO = d5.o(mVar);
            } else if (mVar.b() || mVar.h || !mVar.d) {
                zO = false;
            }
            if (!zO) {
                return false;
            }
            i++;
        }
    }
}
