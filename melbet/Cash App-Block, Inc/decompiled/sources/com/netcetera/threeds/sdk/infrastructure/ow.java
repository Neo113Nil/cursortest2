package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class ow extends HashMap implements os, ot, Map {
    public static String get(String str) {
        return pb.ThreeDS2Service(str);
    }

    public static void getWarnings(Map map, Writer writer) {
        if (map == null) {
            writer.write("null");
            return;
        }
        writer.write(EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(get(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            pb.ThreeDS2ServiceInstance(entry.getValue(), writer);
        }
        writer.write(125);
    }

    public static String initialize(Map map) {
        StringWriter stringWriter = new StringWriter();
        try {
            getWarnings(map, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return initialize();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.os
    public void get(Writer writer) {
        getWarnings(this, writer);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ot
    public String initialize() {
        return initialize(this);
    }
}
