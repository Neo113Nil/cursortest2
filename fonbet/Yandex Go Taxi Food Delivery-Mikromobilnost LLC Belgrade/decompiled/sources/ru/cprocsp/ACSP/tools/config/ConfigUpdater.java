package ru.cprocsp.ACSP.tools.config;

import android.content.Context;
import java.io.InputStream;
import ru.CryptoPro.JCSP.support.MainUpdater;
import ru.cprocsp.ACSP.util.UtilFile;

/* loaded from: classes4.dex */
public class ConfigUpdater extends MainUpdater {
    private long configCRC32;

    public ConfigUpdater(Context context) {
        super(context, "updated.prefs", "raw_res_config_hash");
        this.configCRC32 = UtilFile.crc32(getDefaultConfig(context));
    }

    private InputStream getDefaultConfig(Context context) {
        return context.getResources().openRawResource(context.getResources().getIdentifier("raw/config", null, context.getPackageName()));
    }

    @Override // ru.CryptoPro.JCSP.support.MainUpdater
    public boolean markUpdated() {
        boolean markUpdated = super.markUpdated();
        if (markUpdated) {
            this.configCRC32 = Long.parseLong(getUpdateValue());
        }
        return markUpdated;
    }

    @Override // ru.CryptoPro.JCSP.support.MainUpdater
    public boolean needUpdate() {
        String updateValue = getUpdateValue();
        if (updateValue == null) {
            setUpdateValue(String.valueOf(this.configCRC32));
            return true;
        }
        long parseLong = Long.parseLong(updateValue);
        long j = this.configCRC32;
        if (parseLong == j) {
            return false;
        }
        setUpdateValue(String.valueOf(j));
        return true;
    }
}
