package ru.yandex.alice.protos.data.dialogs.quark.webchat;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/yandex/alice/protos/data/dialogs/quark/webchat/EAliceAgentAppDeployment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEPLOYMENT_UNSPECIFIED", "DEPLOYMENT_PUBLISHED", "DEPLOYMENT_DRAFT", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EAliceAgentAppDeployment implements WireEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EAliceAgentAppDeployment[] $VALUES;
    public static final ProtoAdapter<EAliceAgentAppDeployment> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EAliceAgentAppDeployment DEPLOYMENT_DRAFT;
    public static final EAliceAgentAppDeployment DEPLOYMENT_PUBLISHED;
    public static final EAliceAgentAppDeployment DEPLOYMENT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ EAliceAgentAppDeployment[] $values() {
        return new EAliceAgentAppDeployment[]{DEPLOYMENT_UNSPECIFIED, DEPLOYMENT_PUBLISHED, DEPLOYMENT_DRAFT};
    }

    static {
        final EAliceAgentAppDeployment eAliceAgentAppDeployment = new EAliceAgentAppDeployment("DEPLOYMENT_UNSPECIFIED", 0, 0);
        DEPLOYMENT_UNSPECIFIED = eAliceAgentAppDeployment;
        DEPLOYMENT_PUBLISHED = new EAliceAgentAppDeployment("DEPLOYMENT_PUBLISHED", 1, 1);
        DEPLOYMENT_DRAFT = new EAliceAgentAppDeployment("DEPLOYMENT_DRAFT", 2, 2);
        EAliceAgentAppDeployment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        final g0c a = qoi0.a(EAliceAgentAppDeployment.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EAliceAgentAppDeployment>(a, syntax, eAliceAgentAppDeployment) { // from class: ru.yandex.alice.protos.data.dialogs.quark.webchat.EAliceAgentAppDeployment$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EAliceAgentAppDeployment fromValue(int value) {
                return EAliceAgentAppDeployment.INSTANCE.fromValue(value);
            }
        };
    }

    private EAliceAgentAppDeployment(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EAliceAgentAppDeployment fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EAliceAgentAppDeployment valueOf(String str) {
        return (EAliceAgentAppDeployment) Enum.valueOf(EAliceAgentAppDeployment.class, str);
    }

    public static EAliceAgentAppDeployment[] values() {
        return (EAliceAgentAppDeployment[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/data/dialogs/quark/webchat/EAliceAgentAppDeployment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/data/dialogs/quark/webchat/EAliceAgentAppDeployment;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EAliceAgentAppDeployment fromValue(int value) {
            if (value == 0) {
                return EAliceAgentAppDeployment.DEPLOYMENT_UNSPECIFIED;
            }
            if (value == 1) {
                return EAliceAgentAppDeployment.DEPLOYMENT_PUBLISHED;
            }
            if (value != 2) {
                return null;
            }
            return EAliceAgentAppDeployment.DEPLOYMENT_DRAFT;
        }

        private Companion() {
        }
    }
}
