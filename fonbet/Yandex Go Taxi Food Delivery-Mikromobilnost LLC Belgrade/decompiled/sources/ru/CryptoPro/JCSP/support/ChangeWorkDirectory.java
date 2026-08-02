package ru.CryptoPro.JCSP.support;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.qv10;
import java.io.File;

/* loaded from: classes4.dex */
public class ChangeWorkDirectory {
    public static native int changeWD(String str);

    public static void load(String str, boolean z) {
        if (!z) {
            System.loadLibrary(FoldersConfig.SUPPORT_FILTER_ID);
            return;
        }
        StringBuilder t = qv10.t(str);
        t.append(File.separator);
        t.append("libsupport.so");
        System.load(t.toString());
    }
}
