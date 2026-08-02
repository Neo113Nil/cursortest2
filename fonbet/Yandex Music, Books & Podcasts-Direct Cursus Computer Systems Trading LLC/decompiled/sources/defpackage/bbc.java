package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class bbc implements Function2 {
    public static final bbc a = new bbc();

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void invoke(File file, IOException iOException) {
        file.getClass();
        iOException.getClass();
        throw iOException;
    }
}
