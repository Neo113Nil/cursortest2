package com.braze.support;

import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class j {
    public static final j a = new j();

    public static final String a(String str) {
        str.getClass();
        try {
            InputStream inputStream = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str}).getInputStream();
            inputStream.getClass();
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), PKIFailureInfo.certRevoked).readLine();
            readLine.getClass();
            return readLine;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new c$$ExternalSyntheticLambda2(7), 4, (Object) null);
            return "";
        }
    }

    public static final String a() {
        return "Caught exception while trying to read BrazeLogger tag from system properties.";
    }
}
