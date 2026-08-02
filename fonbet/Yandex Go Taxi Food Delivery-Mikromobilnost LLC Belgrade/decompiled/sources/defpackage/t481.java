package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import yads.n6;
import yads.p6;

/* loaded from: classes7.dex */
public final class t481 {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 jl61, still in use, count: 2, list:
          (r3v2 jl61) from 0x00a9: MOVE (r17v0 jl61) = (r3v2 jl61)
          (r3v2 jl61) from 0x006f: PHI (r3v5 jl61) = (r3v2 jl61), (r3v7 jl61) binds: [B:22:0x0066, B:28:0x007d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static defpackage.jl61 a(org.json.JSONObject r19) {
        /*
            r1 = r19
            java.lang.String r0 = "usagePercent"
            if (r1 == 0) goto Ld9
            jl61 r3 = new jl61     // Catch: java.lang.Throwable -> L4c
            java.lang.String r4 = "isEnabled"
            boolean r4 = r1.getBoolean(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "isInDebug"
            boolean r5 = r1.getBoolean(r5)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r6 = "apiKey"
            java.lang.String r6 = r1.getString(r6)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "validationTimeoutInSec"
            long r7 = r1.getLong(r7)     // Catch: java.lang.Throwable -> L4c
            int r9 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "willBlockAdOnInternalError"
            boolean r10 = r1.getBoolean(r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r11 = "enabledAdUnits"
            org.json.JSONArray r11 = r1.optJSONArray(r11)     // Catch: java.lang.Throwable -> L4c
            if (r11 == 0) goto L59
            kotlin.collections.builders.SetBuilder r12 = new kotlin.collections.builders.SetBuilder     // Catch: java.lang.Throwable -> L4c
            r12.<init>()     // Catch: java.lang.Throwable -> L4c
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L4c
            r14 = 0
        L3c:
            if (r14 >= r13) goto L54
            java.lang.String r15 = r11.getString(r14)     // Catch: java.lang.Throwable -> L4c
            int r16 = r15.length()     // Catch: java.lang.Throwable -> L4c
            if (r16 <= 0) goto L51
            r12.add(r15)     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r0 = move-exception
            r16 = 0
            goto Lc0
        L51:
            int r14 = r14 + 1
            goto L3c
        L54:
            kotlin.collections.builders.SetBuilder r11 = r12.b()     // Catch: java.lang.Throwable -> L4c
            goto L5a
        L59:
            r11 = 0
        L5a:
            if (r11 != 0) goto L5e
            kotlin.collections.EmptySet r11 = kotlin.collections.EmptySet.a     // Catch: java.lang.Throwable -> L4c
        L5e:
            java.lang.String r12 = "adNetworksCustomParameters"
            org.json.JSONObject r12 = r1.optJSONObject(r12)     // Catch: java.lang.Throwable -> L4c
            if (r12 == 0) goto La9
            kotlin.collections.builders.MapBuilder r13 = new kotlin.collections.builders.MapBuilder     // Catch: java.lang.Throwable -> L4c
            r13.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r14 = r12.keys()     // Catch: java.lang.Throwable -> L4c
        L6f:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r15 == 0) goto La0
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r15 = (java.lang.String) r15     // Catch: java.lang.Throwable -> L4c
            r16 = 0
            org.json.JSONObject r2 = r12.getJSONObject(r15)     // Catch: java.lang.Throwable -> L9e
            vz61 r1 = new vz61     // Catch: java.lang.Throwable -> L9e
            r17 = r3
            int r3 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L9e
            r18 = r0
            java.lang.String r0 = "isDisabled"
            boolean r0 = r2.getBoolean(r0)     // Catch: java.lang.Throwable -> L9e
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L9e
            r13.put(r15, r1)     // Catch: java.lang.Throwable -> L9e
            r1 = r19
            r3 = r17
            r0 = r18
            goto L6f
        L9e:
            r0 = move-exception
            goto Lc0
        La0:
            r17 = r3
            r16 = 0
            kotlin.collections.builders.MapBuilder r0 = r13.j()     // Catch: java.lang.Throwable -> L9e
            goto Laf
        La9:
            r17 = r3
            r16 = 0
            r0 = r16
        Laf:
            if (r0 != 0) goto Lb5
            java.util.Map r0 = kotlin.collections.b.f()     // Catch: java.lang.Throwable -> L9e
        Lb5:
            r12 = r0
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9e
            r17 = r3
            r3 = r17
            goto Lc5
        Lc0:
            kotlin.Result$Failure r3 = new kotlin.Result$Failure
            r3.<init>(r0)
        Lc5:
            java.lang.Throwable r0 = kotlin.Result.a(r3)
            if (r0 == 0) goto Lce
            r19.toString()
        Lce:
            boolean r0 = r3 instanceof kotlin.Result.Failure
            if (r0 == 0) goto Ld5
            r2 = r16
            goto Ld6
        Ld5:
            r2 = r3
        Ld6:
            jl61 r2 = (defpackage.jl61) r2
            return r2
        Ld9:
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t481.a(org.json.JSONObject):jl61");
    }

    public static String b(jl61 jl61Var) {
        if (jl61Var == null) {
            return null;
        }
        kdx kdxVar = new kdx();
        abb1.c(kdxVar, "isEnabled", Boolean.valueOf(jl61Var.a));
        abb1.c(kdxVar, "isInDebug", Boolean.valueOf(jl61Var.b));
        abb1.d(kdxVar, Constants.KEY_API_KEY, jl61Var.c);
        kdxVar.b("validationTimeoutInSec", qcx.b(Long.valueOf(jl61Var.d)));
        kdxVar.b("usagePercent", qcx.b(Integer.valueOf(jl61Var.e)));
        abb1.c(kdxVar, "willBlockAdOnInternalError", Boolean.valueOf(jl61Var.f));
        n6 n6Var = new n6(jl61Var);
        xbx xbxVar = new xbx();
        n6Var.invoke(xbxVar);
        kdxVar.b("enabledAdUnits", xbxVar.b());
        p6 p6Var = new p6(jl61Var);
        kdx kdxVar2 = new kdx();
        p6Var.invoke(kdxVar2);
        kdxVar.b("adNetworksCustomParameters", kdxVar2.a());
        return kdxVar.a().toString();
    }
}
