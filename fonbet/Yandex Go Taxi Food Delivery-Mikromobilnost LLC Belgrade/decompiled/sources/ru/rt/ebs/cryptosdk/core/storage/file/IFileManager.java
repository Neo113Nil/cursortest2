package ru.rt.ebs.cryptosdk.core.storage.file;

import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, d2 = {"Lru/rt/ebs/cryptosdk/core/storage/file/IFileManager;", "", "getDirectory", "Ljava/io/File;", "dirName", "", "isCreate", "", "getFile", "fileName", "rewriteFile", "deleteFile", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IFileManager {
    boolean deleteFile(String fileName, String dirName);

    File getDirectory(String dirName, boolean isCreate);

    File getFile(String fileName, String dirName, boolean isCreate);

    boolean rewriteFile(String fileName, String dirName);
}
