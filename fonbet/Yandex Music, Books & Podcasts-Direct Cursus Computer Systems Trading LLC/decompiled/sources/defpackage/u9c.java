package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class u9c implements s8c {
    public final File a;

    public u9c(File file) {
        this.a = file;
    }

    @Override // defpackage.s8c
    public final Object a(Continuation continuation) {
        String str = cak.b;
        File file = this.a;
        w9c w9cVar = new w9c(h1b.N(file), lac.a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        name.getClass();
        return new r3r(w9cVar, singleton.getMimeTypeFromExtension(StringsKt.l0('.', name, "")), bb7.c);
    }
}
