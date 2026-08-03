package t8;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ void query$default(c cVar, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, oc.c cVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            strArr = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            strArr2 = null;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        if ((i10 & 128) != 0) {
            str6 = null;
        }
        cVar.query(str, strArr, str2, strArr2, str3, str4, str5, str6, cVar2);
    }
}
