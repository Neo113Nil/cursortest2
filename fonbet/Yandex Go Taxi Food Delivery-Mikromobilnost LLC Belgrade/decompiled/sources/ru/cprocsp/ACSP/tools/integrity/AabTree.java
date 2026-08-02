package ru.cprocsp.ACSP.tools.integrity;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class AabTree {
    private final List<File> files = new ArrayList();
    private final String path;

    public AabTree(String str) {
        this.path = str;
    }

    public void build(ApkFilter apkFilter) {
        this.files.clear();
        File[] listFiles = new File(this.path).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isDirectory()) {
                    if (apkFilter == null) {
                        this.files.add(file);
                    } else if (apkFilter.accept(file)) {
                        this.files.add(file);
                    }
                }
            }
        }
    }

    public List<File> getFiles() {
        return Collections.synchronizedList(this.files);
    }
}
