package ru.cprocsp.ACSP.tools.integrity;

import java.io.File;

/* loaded from: classes4.dex */
public class ApkFile {
    protected String fileName;
    protected String filePath;
    protected String path;

    public ApkFile(String str) {
        this.filePath = str;
        File file = new File(str);
        this.path = file.getParent();
        this.fileName = file.getName();
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getPath() {
        return this.path;
    }

    public ApkFile() {
    }

    public ApkFile(String str, String str2) {
        this.path = str;
        this.fileName = str2;
        this.filePath = new File(str, str2).getAbsolutePath();
    }
}
