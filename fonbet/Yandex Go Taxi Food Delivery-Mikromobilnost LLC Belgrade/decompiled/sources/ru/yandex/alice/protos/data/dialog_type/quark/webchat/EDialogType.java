package ru.yandex.alice.protos.data.dialog_type.quark.webchat;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lru/yandex/alice/protos/data/dialog_type/quark/webchat/EDialogType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "EXTERNAL_SKILL", "DEDICATED_CHAT", "ENGLISH_TUTOR", "EXTERNAL_MODEL_PROXY", "GO", "PRO", "WEATHER", "EATS", "BOOKS", "CHERRY", "NEUROEXPERT", "MAPS", "NOTA", "CHARACTER", "FASTMASTERS_AI", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EDialogType implements WireEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EDialogType[] $VALUES;
    public static final ProtoAdapter<EDialogType> ADAPTER;
    public static final EDialogType BOOKS;
    public static final EDialogType CHARACTER;
    public static final EDialogType CHERRY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EDialogType DEDICATED_CHAT;
    public static final EDialogType EATS;
    public static final EDialogType ENGLISH_TUTOR;
    public static final EDialogType EXTERNAL_MODEL_PROXY;
    public static final EDialogType EXTERNAL_SKILL;
    public static final EDialogType FASTMASTERS_AI;
    public static final EDialogType GO;
    public static final EDialogType MAPS;
    public static final EDialogType NEUROEXPERT;
    public static final EDialogType NOTA;
    public static final EDialogType PRO;
    public static final EDialogType UNKNOWN;
    public static final EDialogType WEATHER;
    private final int value;

    private static final /* synthetic */ EDialogType[] $values() {
        return new EDialogType[]{UNKNOWN, EXTERNAL_SKILL, DEDICATED_CHAT, ENGLISH_TUTOR, EXTERNAL_MODEL_PROXY, GO, PRO, WEATHER, EATS, BOOKS, CHERRY, NEUROEXPERT, MAPS, NOTA, CHARACTER, FASTMASTERS_AI};
    }

    static {
        final EDialogType eDialogType = new EDialogType("UNKNOWN", 0, 0);
        UNKNOWN = eDialogType;
        EXTERNAL_SKILL = new EDialogType("EXTERNAL_SKILL", 1, 1);
        DEDICATED_CHAT = new EDialogType("DEDICATED_CHAT", 2, 2);
        ENGLISH_TUTOR = new EDialogType("ENGLISH_TUTOR", 3, 3);
        EXTERNAL_MODEL_PROXY = new EDialogType("EXTERNAL_MODEL_PROXY", 4, 4);
        GO = new EDialogType("GO", 5, 5);
        PRO = new EDialogType("PRO", 6, 6);
        WEATHER = new EDialogType("WEATHER", 7, 7);
        EATS = new EDialogType("EATS", 8, 8);
        BOOKS = new EDialogType("BOOKS", 9, 9);
        CHERRY = new EDialogType("CHERRY", 10, 10);
        NEUROEXPERT = new EDialogType("NEUROEXPERT", 11, 11);
        MAPS = new EDialogType("MAPS", 12, 12);
        NOTA = new EDialogType("NOTA", 13, 13);
        CHARACTER = new EDialogType("CHARACTER", 14, 14);
        FASTMASTERS_AI = new EDialogType("FASTMASTERS_AI", 15, 15);
        EDialogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        final g0c a = qoi0.a(EDialogType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EDialogType>(a, syntax, eDialogType) { // from class: ru.yandex.alice.protos.data.dialog_type.quark.webchat.EDialogType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EDialogType fromValue(int value) {
                return EDialogType.INSTANCE.fromValue(value);
            }
        };
    }

    private EDialogType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EDialogType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EDialogType valueOf(String str) {
        return (EDialogType) Enum.valueOf(EDialogType.class, str);
    }

    public static EDialogType[] values() {
        return (EDialogType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/data/dialog_type/quark/webchat/EDialogType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/data/dialog_type/quark/webchat/EDialogType;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EDialogType fromValue(int value) {
            switch (value) {
                case 0:
                    return EDialogType.UNKNOWN;
                case 1:
                    return EDialogType.EXTERNAL_SKILL;
                case 2:
                    return EDialogType.DEDICATED_CHAT;
                case 3:
                    return EDialogType.ENGLISH_TUTOR;
                case 4:
                    return EDialogType.EXTERNAL_MODEL_PROXY;
                case 5:
                    return EDialogType.GO;
                case 6:
                    return EDialogType.PRO;
                case 7:
                    return EDialogType.WEATHER;
                case 8:
                    return EDialogType.EATS;
                case 9:
                    return EDialogType.BOOKS;
                case 10:
                    return EDialogType.CHERRY;
                case 11:
                    return EDialogType.NEUROEXPERT;
                case 12:
                    return EDialogType.MAPS;
                case 13:
                    return EDialogType.NOTA;
                case 14:
                    return EDialogType.CHARACTER;
                case 15:
                    return EDialogType.FASTMASTERS_AI;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
