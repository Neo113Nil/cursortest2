package ru.cprocsp.ACSP.tools.integrity;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;
import ru.cprocsp.ACSP.tools.config.AbstractFile;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class PropertyFile extends AbstractFile {
    protected Properties options;

    public PropertyFile(String str, boolean z) throws Exception {
        super(new File(str));
        this.options = null;
        if (init(this.paramFile, z)) {
            load(this.paramFile);
        }
    }

    @Override // ru.cprocsp.ACSP.tools.config.AbstractFile
    public void load(InputStream inputStream) throws Exception {
        try {
            try {
                Properties properties = new Properties();
                this.options = properties;
                properties.load(inputStream);
            } catch (Exception e) {
                Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                throw e;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Override // ru.cprocsp.ACSP.tools.config.AbstractFile
    public void save() throws Exception {
        FileOutputStream fileOutputStream;
        if (this.paramFile != null) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(this.paramFile);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.options.store(fileOutputStream, (String) null);
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    public PropertyFile(InputStream inputStream) throws Exception {
        super(null);
        this.options = null;
        load(inputStream);
    }

    public PropertyFile(ResourceBundle resourceBundle) {
        super(null);
        this.options = null;
        load(resourceBundle);
    }

    private void load(ResourceBundle resourceBundle) {
        this.options = new Properties();
        Enumeration<String> keys = resourceBundle.getKeys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            this.options.put(nextElement, resourceBundle.getString(nextElement));
        }
    }
}
