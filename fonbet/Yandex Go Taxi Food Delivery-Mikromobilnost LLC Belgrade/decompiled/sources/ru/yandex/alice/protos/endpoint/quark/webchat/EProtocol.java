package ru.yandex.alice.protos.endpoint.quark.webchat;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.g0c;
import defpackage.k4o;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/EProtocol;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PROTOCOL_UNKNOWN", "PROTOCOL_ZIGBEE", "PROTOCOL_MATTER", "PROTOCOL_WIFI", "PROTOCOL_IR", "PROTOCOL_CRADLE", "PROTOCOL_ZENOH", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EProtocol implements WireEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EProtocol[] $VALUES;
    public static final ProtoAdapter<EProtocol> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EProtocol PROTOCOL_CRADLE;
    public static final EProtocol PROTOCOL_IR;
    public static final EProtocol PROTOCOL_MATTER;
    public static final EProtocol PROTOCOL_UNKNOWN;
    public static final EProtocol PROTOCOL_WIFI;
    public static final EProtocol PROTOCOL_ZENOH;
    public static final EProtocol PROTOCOL_ZIGBEE;
    private final int value;

    private static final /* synthetic */ EProtocol[] $values() {
        return new EProtocol[]{PROTOCOL_UNKNOWN, PROTOCOL_ZIGBEE, PROTOCOL_MATTER, PROTOCOL_WIFI, PROTOCOL_IR, PROTOCOL_CRADLE, PROTOCOL_ZENOH};
    }

    static {
        final EProtocol eProtocol = new EProtocol("PROTOCOL_UNKNOWN", 0, 0);
        PROTOCOL_UNKNOWN = eProtocol;
        PROTOCOL_ZIGBEE = new EProtocol("PROTOCOL_ZIGBEE", 1, 1);
        PROTOCOL_MATTER = new EProtocol("PROTOCOL_MATTER", 2, 2);
        PROTOCOL_WIFI = new EProtocol("PROTOCOL_WIFI", 3, 3);
        PROTOCOL_IR = new EProtocol("PROTOCOL_IR", 4, 4);
        PROTOCOL_CRADLE = new EProtocol("PROTOCOL_CRADLE", 5, 5);
        PROTOCOL_ZENOH = new EProtocol("PROTOCOL_ZENOH", 6, 6);
        EProtocol[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        final g0c a = qoi0.a(EProtocol.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EProtocol>(a, syntax, eProtocol) { // from class: ru.yandex.alice.protos.endpoint.quark.webchat.EProtocol$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EProtocol fromValue(int value) {
                return EProtocol.INSTANCE.fromValue(value);
            }
        };
    }

    private EProtocol(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EProtocol fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EProtocol valueOf(String str) {
        return (EProtocol) Enum.valueOf(EProtocol.class, str);
    }

    public static EProtocol[] values() {
        return (EProtocol[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/EProtocol$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/quark/webchat/EProtocol;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EProtocol fromValue(int value) {
            switch (value) {
                case 0:
                    return EProtocol.PROTOCOL_UNKNOWN;
                case 1:
                    return EProtocol.PROTOCOL_ZIGBEE;
                case 2:
                    return EProtocol.PROTOCOL_MATTER;
                case 3:
                    return EProtocol.PROTOCOL_WIFI;
                case 4:
                    return EProtocol.PROTOCOL_IR;
                case 5:
                    return EProtocol.PROTOCOL_CRADLE;
                case 6:
                    return EProtocol.PROTOCOL_ZENOH;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
