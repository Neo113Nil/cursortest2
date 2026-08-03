package com.onesignal.common.modeling;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void replace$default(f fVar, i iVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        }
        if ((i10 & 2) != 0) {
            str = "NORMAL";
        }
        fVar.replace(iVar, str);
    }
}
