package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class chs implements ngl {
    @Override // defpackage.ngl
    public final void H(String str, String str2, Object obj, Object... objArr) {
        str.getClass();
        Timber.INSTANCE.tag(str).v("[" + str2 + "] " + obj, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.ngl
    public final void M(String str, String str2, Object obj, Throwable th, Object... objArr) {
        str.getClass();
        Timber.INSTANCE.tag(str).e(th, "[" + str2 + "] " + obj, Arrays.copyOf(objArr, objArr.length));
    }

    public final void a(String str, String str2, String str3, Object... objArr) {
        Timber.INSTANCE.tag(str).d("[" + str2 + "] " + ((Object) str3), Arrays.copyOf(objArr, objArr.length));
    }

    public final void b(String str, Serializable serializable, Object... objArr) {
        Timber.INSTANCE.tag("YP:OpYandexPlayerImpl").w(null, "[" + str + "] " + serializable, Arrays.copyOf(objArr, objArr.length));
    }
}
