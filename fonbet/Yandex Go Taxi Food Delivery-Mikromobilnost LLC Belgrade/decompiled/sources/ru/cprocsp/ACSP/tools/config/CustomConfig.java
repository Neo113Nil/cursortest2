package ru.cprocsp.ACSP.tools.config;

import android.app.Application;
import android.content.Context;
import java.io.FileInputStream;
import java.io.InputStream;
import ru.CryptoPro.JCSP.CSPInternalConfig;
import ru.cprocsp.ACSP.tools.common.CSPTool;
import ru.cprocsp.ACSP.util.UtilFile;

/* loaded from: classes4.dex */
public class CustomConfig {
    public static boolean update(Context context, InputStream inputStream) throws Exception {
        CSPInternalConfig.init((Application) context);
        if (!CSPInternalConfig.isEmbedded()) {
            return false;
        }
        CSPTool cSPTool = new CSPTool(context);
        cSPTool.createInfrastructure();
        String configFile = cSPTool.getAppInfrastructure().getConfigFile();
        boolean update = new Config(context, configFile, true).update(inputStream);
        if (update) {
            new ConfigUpdater(context, UtilFile.crc32(new FileInputStream(configFile))) { // from class: ru.cprocsp.ACSP.tools.config.CustomConfig.1CustomUpdater
                final /* synthetic */ long val$crc32;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: IPUT (r2v0 ?? I:long), (r0 I:ru.cprocsp.ACSP.tools.config.CustomConfig$1CustomUpdater) ru.cprocsp.ACSP.tools.config.CustomConfig.1CustomUpdater.val$crc32 long, block:B:1:0x0000 */
                /* JADX WARN: Type inference failed for: r0v0, types: [ru.cprocsp.ACSP.tools.config.ConfigUpdater, ru.cprocsp.ACSP.tools.config.CustomConfig$1CustomUpdater] */
                {
                    ?? configUpdater = new ConfigUpdater(this);
                }

                @Override // ru.cprocsp.ACSP.tools.config.ConfigUpdater, ru.CryptoPro.JCSP.support.MainUpdater
                public boolean needUpdate() {
                    setUpdateValue(String.valueOf(this.val$crc32));
                    return true;
                }
            }.markUpdated();
        }
        return update;
    }
}
