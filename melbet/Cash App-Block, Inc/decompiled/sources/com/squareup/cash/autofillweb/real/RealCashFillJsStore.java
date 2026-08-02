package com.squareup.cash.autofillweb.real;

import dev.zacsweers.metro.internal.Factory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.text.Charsets;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;

/* loaded from: classes4.dex */
public final class RealCashFillJsStore {
    public final String javascript;
    public final String version;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealCashFillJsStore();
        }
    }

    public RealCashFillJsStore() {
        String readText;
        ClassLoader classLoader = RealCashFillJsStore.class.getClassLoader();
        classLoader.getClass();
        InputStream resourceAsStream = classLoader.getResourceAsStream("cashFill.js");
        BufferedReader bufferedReader = resourceAsStream != null ? new BufferedReader(new InputStreamReader(resourceAsStream, Charsets.UTF_8), PKIFailureInfo.certRevoked) : null;
        if (bufferedReader != null) {
            try {
                readText = AppUpdateData.readText(bufferedReader);
            } finally {
            }
        } else {
            readText = "";
        }
        Utf8.closeFinally(bufferedReader, null);
        this.javascript = readText;
        this.version = "1.0.0";
    }
}
