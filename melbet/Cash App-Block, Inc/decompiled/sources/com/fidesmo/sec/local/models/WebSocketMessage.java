package com.fidesmo.sec.local.models;

import com.fidesmo.sec.core.models.RequiredField;
import com.fidesmo.sec.delivery.models.DataRequirement;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage;", "Ljava/io/Serializable;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "AuxStatus", "AuxStatusContent", "Command", "Companion", "Id", "Response", "Status", "StatusContent", "Unknown", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Command;", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Id;", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Response;", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;", "Lcom/fidesmo/sec/local/models/WebSocketMessage$Unknown;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WebSocketMessage implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Gson gson = new GsonBuilder().create();
    private final String type;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$AuxStatus;", "", "type", "", "code", "message", "content", "Lcom/fidesmo/sec/local/models/WebSocketMessage$AuxStatusContent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/local/models/WebSocketMessage$AuxStatusContent;)V", "getCode", "()Ljava/lang/String;", "getContent", "()Lcom/fidesmo/sec/local/models/WebSocketMessage$AuxStatusContent;", "getMessage", "getType", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AuxStatus {
        private final String code;
        private final AuxStatusContent content;
        private final String message;
        private final String type;

        public AuxStatus(String str, String str2, String str3, AuxStatusContent auxStatusContent) {
            str.getClass();
            str2.getClass();
            this.type = str;
            this.code = str2;
            this.message = str3;
            this.content = auxStatusContent;
        }

        public final String getCode() {
            return this.code;
        }

        public final AuxStatusContent getContent() {
            return this.content;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$AuxStatusContent;", "", "fields", "", "Lcom/fidesmo/sec/core/models/RequiredField;", "refId", "", "cin", "([Lcom/fidesmo/sec/core/models/RequiredField;Ljava/lang/String;Ljava/lang/String;)V", "getCin", "()Ljava/lang/String;", "getFields", "()[Lcom/fidesmo/sec/core/models/RequiredField;", "[Lcom/fidesmo/sec/core/models/RequiredField;", "getRefId", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AuxStatusContent {
        private final String cin;
        private final RequiredField[] fields;
        private final String refId;

        public AuxStatusContent(RequiredField[] requiredFieldArr, String str, String str2) {
            this.fields = requiredFieldArr;
            this.refId = str;
            this.cin = str2;
        }

        public final String getCin() {
            return this.cin;
        }

        public final RequiredField[] getFields() {
            return this.fields;
        }

        public final String getRefId() {
            return this.refId;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$Command;", "Lcom/fidesmo/sec/local/models/WebSocketMessage;", "type", "", "commands", "", "(Ljava/lang/String;Ljava/util/List;)V", "getCommands", "()Ljava/util/List;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Command extends WebSocketMessage {
        private final List<String> commands;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Command(String str, List<String> list) {
            super(str, null);
            str.getClass();
            list.getClass();
            this.commands = list;
        }

        public final List<String> getCommands() {
            return this.commands;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$Id;", "Lcom/fidesmo/sec/local/models/WebSocketMessage;", "type", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Id extends WebSocketMessage {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Id(String str, String str2) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$Response;", "Lcom/fidesmo/sec/local/models/WebSocketMessage;", "type", "", "responses", "", "(Ljava/lang/String;Ljava/util/List;)V", "getResponses", "()Ljava/util/List;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Response extends WebSocketMessage {
        private final List<String> responses;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Response(String str, List<String> list) {
            super(str, null);
            str.getClass();
            list.getClass();
            this.responses = list;
        }

        public final List<String> getResponses() {
            return this.responses;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$Status;", "Lcom/fidesmo/sec/local/models/WebSocketMessage;", "type", "", "code", "message", "content", "Lcom/fidesmo/sec/local/models/WebSocketMessage$StatusContent;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/local/models/WebSocketMessage$StatusContent;)V", "getCode", "()Ljava/lang/String;", "getContent", "()Lcom/fidesmo/sec/local/models/WebSocketMessage$StatusContent;", "getMessage", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Status extends WebSocketMessage {
        private final String code;
        private final StatusContent content;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Status(String str, String str2, String str3, StatusContent statusContent) {
            super(str, null);
            str.getClass();
            str2.getClass();
            this.code = str2;
            this.message = str3;
            this.content = statusContent;
        }

        public final String getCode() {
            return this.code;
        }

        public final StatusContent getContent() {
            return this.content;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$StatusContent;", "", "fields", "", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "refId", "", "cin", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCin", "()Ljava/lang/String;", "getFields", "()Ljava/util/List;", "getRefId", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StatusContent {
        private final String cin;
        private final List<DataRequirement> fields;
        private final String refId;

        /* JADX WARN: Multi-variable type inference failed */
        public StatusContent(List<? extends DataRequirement> list, String str, String str2) {
            this.fields = list;
            this.refId = str;
            this.cin = str2;
        }

        public final String getCin() {
            return this.cin;
        }

        public final List<DataRequirement> getFields() {
            return this.fields;
        }

        public final String getRefId() {
            return this.refId;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$Unknown;", "Lcom/fidesmo/sec/local/models/WebSocketMessage;", "type", "", "(Ljava/lang/String;)V", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown extends WebSocketMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String str) {
            super(str, null);
            str.getClass();
        }
    }

    private WebSocketMessage(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/fidesmo/sec/local/models/WebSocketMessage$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "getGson", "()Lcom/google/gson/Gson;", "from", "Lcom/fidesmo/sec/local/models/WebSocketMessage;", "message", "", "to", "apduResponses", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebSocketMessage from(String message) {
            message.getClass();
            String type2 = ((Unknown) getGson().fromJson(message, Unknown.class)).getType();
            int hashCode = type2.hashCode();
            if (hashCode != -892481550) {
                if (hashCode != -602535288) {
                    if (hashCode == 3355 && type2.equals("id")) {
                        Object fromJson = getGson().fromJson(message, (Class<Object>) Id.class);
                        fromJson.getClass();
                        return (WebSocketMessage) fromJson;
                    }
                } else if (type2.equals("commands")) {
                    Object fromJson2 = getGson().fromJson(message, (Class<Object>) Command.class);
                    fromJson2.getClass();
                    return (WebSocketMessage) fromJson2;
                }
            } else if (type2.equals("status")) {
                AuxStatus auxStatus = (AuxStatus) getGson().fromJson(message, AuxStatus.class);
                String code = auxStatus.getCode();
                String message2 = auxStatus.getMessage();
                StatusContent statusContent = null;
                ArrayList arrayList = null;
                if (auxStatus.getContent() != null) {
                    RequiredField[] fields = auxStatus.getContent().getFields();
                    if (fields != null) {
                        arrayList = new ArrayList(fields.length);
                        for (RequiredField requiredField : fields) {
                            arrayList.add(DataRequirement.INSTANCE.from(requiredField));
                        }
                    }
                    statusContent = new StatusContent(arrayList, auxStatus.getContent().getRefId(), auxStatus.getContent().getCin());
                }
                return new Status("status", code, message2, statusContent);
            }
            return new Unknown(message);
        }

        public final Gson getGson() {
            return WebSocketMessage.gson;
        }

        public final String to(List<String> apduResponses) {
            apduResponses.getClass();
            String json = getGson().toJson(new Response("responses", apduResponses));
            json.getClass();
            return json;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WebSocketMessage(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
