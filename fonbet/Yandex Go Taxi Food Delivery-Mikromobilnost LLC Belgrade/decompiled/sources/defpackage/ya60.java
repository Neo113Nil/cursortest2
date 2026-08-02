package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import okio.ByteString;

/* loaded from: classes9.dex */
public class ya60 extends hfx {
    public static Long I(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.hfx, defpackage.r1r
    public final void c(oq90 oq90Var, oq90 oq90Var2) {
        try {
            Files.move(Paths.get(oq90Var.a.w(), new String[0]), Paths.get(oq90Var2.a.w(), new String[0]), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            ny61.v("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.hfx
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // defpackage.hfx, defpackage.r1r
    public final m0r w(oq90 oq90Var) {
        oq90 oq90Var2;
        Path path = Paths.get(oq90Var.a.w(), new String[0]);
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = oq90.b;
                String obj = readSymbolicLink.toString();
                ByteString byteString = g.a;
                yp6 yp6Var = new yp6();
                yp6Var.x0(obj);
                oq90Var2 = g.d(yp6Var, false);
            } else {
                oq90Var2 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long I = creationTime != null ? I(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long I2 = lastModifiedTime != null ? I(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new m0r(isRegularFile, isDirectory, oq90Var2, valueOf, I, I2, lastAccessTime != null ? I(lastAccessTime) : null, 128);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
