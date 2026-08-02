package defpackage;

/* loaded from: classes6.dex */
public interface ngl {
    static /* synthetic */ void r(ngl nglVar, String str, String str2, String str3, Throwable th, Object[] objArr, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        nglVar.M(str, str2, str3, th, objArr);
    }

    default void H(String str, String str2, Object obj, Object... objArr) {
        str.getClass();
    }

    default void M(String str, String str2, Object obj, Throwable th, Object... objArr) {
        str.getClass();
    }
}
