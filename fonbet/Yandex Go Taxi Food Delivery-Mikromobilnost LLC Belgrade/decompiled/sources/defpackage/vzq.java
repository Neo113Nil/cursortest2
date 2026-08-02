package defpackage;

import android.webkit.MimeTypeMap;
import coil.graphics.DataSource;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.b;

/* loaded from: classes10.dex */
public final class vzq implements rwq {
    public final File a;

    public vzq(File file) {
        this.a = file;
    }

    @Override // defpackage.rwq
    public final Object a(Continuation continuation) {
        String str = oq90.b;
        File file = this.a;
        return new pjt0(new c0r(sms.e(file), r1r.a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.m(file)), DataSource.DISK);
    }
}
