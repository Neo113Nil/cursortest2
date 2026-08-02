package ru.cprocsp.ACSP.tools.config;

import java.io.File;
import java.io.InputStream;

/* loaded from: classes4.dex */
public abstract class IniFile extends AbstractFile {
    public IniFile(String str, boolean z) throws Exception {
        super(new File(str));
        if (init(this.paramFile, z)) {
            load(this.paramFile);
        }
    }

    @Override // ru.cprocsp.ACSP.tools.config.AbstractFile
    public void load(InputStream inputStream) throws Exception {
    }

    public IniFile(String str) throws Exception {
        this(str, false);
    }
}
