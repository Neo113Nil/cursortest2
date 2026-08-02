package com.datadog.android.rum.internal.vitals;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt$readTextSafe$1;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes4.dex */
public final class MemoryVitalReader implements VitalReader {
    public static final File STATUS_FILE = new File("/proc/self/status");
    public static final Regex VM_RSS_REGEX = new Regex("VmRSS:\\s+(\\d+) kB");
    public final InternalLogger internalLogger;
    public final File statusFile;

    public MemoryVitalReader(InternalLogger internalLogger) {
        File file = STATUS_FILE;
        file.getClass();
        internalLogger.getClass();
        this.statusFile = file;
        this.internalLogger = internalLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    @Override // com.datadog.android.rum.internal.vitals.VitalReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Double readVitalData() {
        Double d;
        File file = this.statusFile;
        InternalLogger internalLogger = this.internalLogger;
        if (zzhk.existsSafe(file, internalLogger) && zzhk.canReadSafe(file, internalLogger)) {
            Charset charset = Charsets.UTF_8;
            charset.getClass();
            List list = (zzhk.existsSafe(file, internalLogger) && zzhk.canReadSafe(file, internalLogger)) ? (List) zzhk.safeCall(file, null, internalLogger, new FileExtKt$readTextSafe$1(1, charset)) : null;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MatcherMatchResult matchEntire = VM_RSS_REGEX.matchEntire((String) it.next());
                    String str = matchEntire != null ? (String) CollectionsKt.getOrNull(1, matchEntire.getGroupValues()) : null;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                String str2 = (String) CollectionsKt.firstOrNull((List) arrayList);
                if (str2 != null) {
                    d = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str2);
                    if (d != null) {
                        return Double.valueOf(d.doubleValue() * 1000.0d);
                    }
                }
            }
            d = null;
            if (d != null) {
            }
        }
        return null;
    }
}
