package androidx.datastore.preferences.protobuf;

import java.io.File;
import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0112l extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0112l(File file, File file2, String str) {
        super(r3);
        kotlin.jvm.internal.i.e(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
    }

    public C0112l(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
