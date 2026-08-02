package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class Stackframe implements JsonStream.Streamable {
    public Map code;
    public String codeIdentifier;
    public Number columnNumber;
    public String file;
    public Long frameAddress;
    public Boolean inProject;
    public Boolean isPC;
    public Number lineNumber;
    public Long loadAddress;
    public String method;
    public Long symbolAddress;

    /* renamed from: type, reason: collision with root package name */
    public ErrorType f943type;

    public Stackframe(NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), null, null);
        this.frameAddress = nativeStackframe.getFrameAddress();
        this.symbolAddress = nativeStackframe.getSymbolAddress();
        this.loadAddress = nativeStackframe.getLoadAddress();
        this.codeIdentifier = nativeStackframe.getCodeIdentifier();
        this.isPC = nativeStackframe.getIsPC();
        this.f943type = nativeStackframe.getType();
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        Long l = this.frameAddress;
        jsonStream.beginObject();
        jsonStream.name("method");
        jsonStream.value(this.method);
        jsonStream.name("file");
        jsonStream.value(this.file);
        jsonStream.name("lineNumber");
        jsonStream.value(this.lineNumber);
        Boolean bool = this.inProject;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            jsonStream.name("inProject");
            jsonStream.value(booleanValue);
        }
        jsonStream.name("columnNumber");
        jsonStream.value(this.columnNumber);
        if (l != null) {
            jsonStream.name("frameAddress");
            jsonStream.value(l.longValue() >= 0 ? String.format("0x%x", Arrays.copyOf(new Object[]{l}, 1)) : String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l.longValue() >>> 8), Long.valueOf(l.longValue() & 255)}, 2)));
        }
        if (this.symbolAddress != null) {
            jsonStream.name("symbolAddress");
            Long l2 = this.symbolAddress;
            jsonStream.value(l2 == null ? null : l2.longValue() >= 0 ? String.format("0x%x", Arrays.copyOf(new Object[]{l2}, 1)) : String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l2.longValue() >>> 8), Long.valueOf(l2.longValue() & 255)}, 2)));
        }
        if (this.loadAddress != null) {
            jsonStream.name("loadAddress");
            Long l3 = this.loadAddress;
            jsonStream.value(l3 != null ? l3.longValue() >= 0 ? String.format("0x%x", Arrays.copyOf(new Object[]{l3}, 1)) : String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l3.longValue() >>> 8), Long.valueOf(l3.longValue() & 255)}, 2)) : null);
        }
        String str = this.codeIdentifier;
        if (str != null) {
            jsonStream.name("codeIdentifier");
            jsonStream.value(str);
        }
        Boolean bool2 = this.isPC;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            jsonStream.name("isPC");
            jsonStream.value(booleanValue2);
        }
        ErrorType errorType = this.f943type;
        if (errorType != null) {
            jsonStream.name("type");
            jsonStream.value(errorType.getDesc());
        }
        Map map = this.code;
        if (map != null) {
            jsonStream.name("code");
            for (Map.Entry entry : map.entrySet()) {
                jsonStream.beginObject();
                jsonStream.name((String) entry.getKey());
                jsonStream.value((String) entry.getValue());
                jsonStream.endObject();
            }
        }
        jsonStream.endObject();
    }

    public Stackframe(String str, String str2, Number number, Boolean bool, Map map) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.inProject = bool;
        this.code = map;
        this.columnNumber = null;
    }
}
