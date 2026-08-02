package com.datadog.android.core.internal.persistence.tlvformat;

import java.util.LinkedHashMap;
import kotlin.UShort;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes10.dex */
public enum TLVBlockType {
    VERSION_CODE(0),
    DATA(1);

    public static final LinkedHashMap map;
    public final short rawValue;

    static {
        TLVBlockType[] values = values();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (TLVBlockType tLVBlockType : values) {
            linkedHashMap.put(new UShort(tLVBlockType.rawValue), tLVBlockType);
        }
        map = linkedHashMap;
    }

    TLVBlockType(short s) {
        this.rawValue = s;
    }
}
