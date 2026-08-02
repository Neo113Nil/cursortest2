package com.datadog.android.rum.internal.vitals;

import com.datadog.android.api.InternalLogger;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import java.io.File;
import java.util.List;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes4.dex */
public final class CPUVitalReader implements VitalReader {
    public static final File STAT_FILE = new File("/proc/self/stat");
    public final InternalLogger internalLogger;
    public final File statFile;

    public CPUVitalReader(InternalLogger internalLogger) {
        File file = STAT_FILE;
        file.getClass();
        internalLogger.getClass();
        this.statFile = file;
        this.internalLogger = internalLogger;
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalReader
    public final Double readVitalData() {
        String readTextSafe;
        File file = this.statFile;
        InternalLogger internalLogger = this.internalLogger;
        if (!zzhk.existsSafe(file, internalLogger) || !zzhk.canReadSafe(file, internalLogger) || (readTextSafe = zzhk.readTextSafe(file, Charsets.UTF_8, internalLogger)) == null) {
            return null;
        }
        List split$default = StringsKt.split$default(readTextSafe, new char[]{' '}, 6);
        if (split$default.size() > 13) {
            return StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) split$default.get(13));
        }
        return null;
    }
}
