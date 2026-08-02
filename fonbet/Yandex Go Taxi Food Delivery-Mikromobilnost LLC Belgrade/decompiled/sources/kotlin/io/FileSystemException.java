package kotlin.io;

import defpackage.cea1;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "Ljava/io/File;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "other", "getOther", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class FileSystemException extends IOException {
    private final File file;
    private final File other;
    private final String reason;

    public FileSystemException(File file, File file2, String str) {
        super(cea1.c(file, file2, str));
        this.file = file;
        this.other = file2;
        this.reason = str;
    }
}
