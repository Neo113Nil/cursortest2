package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001Be\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/bugsnag/android/NativeStackframe;", "Lcom/bugsnag/android/JsonStream$Streamable;", "method", "", "file", "lineNumber", "", "frameAddress", "", "symbolAddress", "loadAddress", "isPC", "", "type", "Lcom/bugsnag/android/ErrorType;", "codeIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/bugsnag/android/ErrorType;Ljava/lang/String;)V", "getCodeIdentifier", "()Ljava/lang/String;", "setCodeIdentifier", "(Ljava/lang/String;)V", "getFile", "setFile", "getFrameAddress", "()Ljava/lang/Long;", "setFrameAddress", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "setPC", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLineNumber", "()Ljava/lang/Number;", "setLineNumber", "(Ljava/lang/Number;)V", "getLoadAddress", "setLoadAddress", "getMethod", "setMethod", "getSymbolAddress", "setSymbolAddress", "getType", "()Lcom/bugsnag/android/ErrorType;", "setType", "(Lcom/bugsnag/android/ErrorType;)V", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeStackframe implements JsonStream.Streamable {
    private String codeIdentifier;
    private String file;
    private Long frameAddress;
    private Boolean isPC;
    private Number lineNumber;
    private Long loadAddress;
    private String method;
    private Long symbolAddress;
    private ErrorType type;

    public NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, String str3) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.frameAddress = l;
        this.symbolAddress = l2;
        this.loadAddress = l3;
        this.isPC = bool;
        this.type = errorType;
        this.codeIdentifier = str3;
    }

    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    public final String getFile() {
        return this.file;
    }

    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    public final Number getLineNumber() {
        return this.lineNumber;
    }

    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    public final ErrorType getType() {
        return this.type;
    }

    /* renamed from: isPC, reason: from getter */
    public final Boolean getIsPC() {
        return this.isPC;
    }

    public final void setCodeIdentifier(String str) {
        this.codeIdentifier = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setFrameAddress(Long l) {
        this.frameAddress = l;
    }

    public final void setLineNumber(Number number) {
        this.lineNumber = number;
    }

    public final void setLoadAddress(Long l) {
        this.loadAddress = l;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPC(Boolean bool) {
        this.isPC = bool;
    }

    public final void setSymbolAddress(Long l) {
        this.symbolAddress = l;
    }

    public final void setType(ErrorType errorType) {
        this.type = errorType;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        writer.beginObject();
        writer.name("method");
        writer.value(this.method);
        writer.name("file");
        writer.value(this.file);
        writer.name("lineNumber");
        writer.value(this.lineNumber);
        if (this.frameAddress != null) {
            writer.name("frameAddress");
            Long l = this.frameAddress;
            writer.value(l == null ? null : l.longValue() >= 0 ? String.format("0x%x", Arrays.copyOf(new Object[]{l}, 1)) : String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l.longValue() >>> 8), Long.valueOf(l.longValue() & 255)}, 2)));
        }
        if (this.symbolAddress != null) {
            writer.name("symbolAddress");
            Long l2 = this.symbolAddress;
            writer.value(l2 == null ? null : l2.longValue() >= 0 ? String.format("0x%x", Arrays.copyOf(new Object[]{l2}, 1)) : String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l2.longValue() >>> 8), Long.valueOf(l2.longValue() & 255)}, 2)));
        }
        if (this.loadAddress != null) {
            writer.name("loadAddress");
            Long l3 = this.loadAddress;
            writer.value(l3 != null ? l3.longValue() >= 0 ? String.format("0x%x", Arrays.copyOf(new Object[]{l3}, 1)) : String.format("0x%x%02x", Arrays.copyOf(new Object[]{Long.valueOf(l3.longValue() >>> 8), Long.valueOf(l3.longValue() & 255)}, 2)) : null);
        }
        writer.name("codeIdentifier");
        writer.value(this.codeIdentifier);
        writer.name("isPC");
        writer.value(this.isPC);
        ErrorType errorType = this.type;
        if (errorType != null) {
            writer.name("type");
            writer.value(errorType.getDesc());
        }
        writer.endObject();
    }

    public /* synthetic */ NativeStackframe(String str, String str2, Number number, Long l, Long l2, Long l3, Boolean bool, ErrorType errorType, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, number, l, l2, l3, bool, (i & 128) != 0 ? null : errorType, (i & 256) != 0 ? null : str3);
    }
}
