package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public class b9f extends lac {
    @Override // defpackage.lac
    public final jmq a(cak cakVar) {
        cakVar.getClass();
        File file = cakVar.toFile();
        Logger logger = epj.a;
        return new kt1(new FileOutputStream(file, true), new vis());
    }

    @Override // defpackage.lac
    public void b(cak cakVar, cak cakVar2) {
        cakVar.getClass();
        cakVar2.getClass();
        if (cakVar.toFile().renameTo(cakVar2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + cakVar + " to " + cakVar2);
    }

    @Override // defpackage.lac
    public final void c(cak cakVar) {
        if (cakVar.toFile().mkdir()) {
            return;
        }
        v97 i = i(cakVar);
        if (i == null || !i.c) {
            tiu.j(cakVar, "failed to create directory: ");
        }
    }

    @Override // defpackage.lac
    public final void d(cak cakVar) {
        cakVar.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = cakVar.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        tiu.j(cakVar, "failed to delete ");
    }

    @Override // defpackage.lac
    public final List g(cak cakVar) {
        cakVar.getClass();
        File file = cakVar.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                tiu.j(cakVar, "failed to list ");
                return null;
            }
            kac.e(cakVar, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(cakVar.d(str));
        }
        y75.r(arrayList);
        return arrayList;
    }

    @Override // defpackage.lac
    public v97 i(cak cakVar) {
        cakVar.getClass();
        File file = cakVar.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new v97(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // defpackage.lac
    public final a9f j(cak cakVar) {
        return new a9f(new RandomAccessFile(cakVar.toFile(), "r"));
    }

    @Override // defpackage.lac
    public final jmq k(cak cakVar) {
        cakVar.getClass();
        File file = cakVar.toFile();
        Logger logger = epj.a;
        return new kt1(new FileOutputStream(file, false), new vis());
    }

    @Override // defpackage.lac
    public final n3r l(cak cakVar) {
        cakVar.getClass();
        return fxf.S(cakVar.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
