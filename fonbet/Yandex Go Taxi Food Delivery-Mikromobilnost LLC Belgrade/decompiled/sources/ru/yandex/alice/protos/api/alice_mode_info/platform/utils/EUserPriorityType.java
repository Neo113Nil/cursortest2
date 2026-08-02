package ru.yandex.alice.protos.api.alice_mode_info.platform.utils;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/EUserPriorityType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undefined", "Subscription", "WithoutSubscription", "NewWithoutSubscription", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EUserPriorityType implements WireEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EUserPriorityType[] $VALUES;
    public static final ProtoAdapter<EUserPriorityType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EUserPriorityType NewWithoutSubscription;
    public static final EUserPriorityType Subscription;
    public static final EUserPriorityType Undefined;
    public static final EUserPriorityType WithoutSubscription;
    private final int value;

    private static final /* synthetic */ EUserPriorityType[] $values() {
        return new EUserPriorityType[]{Undefined, Subscription, WithoutSubscription, NewWithoutSubscription};
    }

    static {
        final EUserPriorityType eUserPriorityType = new EUserPriorityType("Undefined", 0, 0);
        Undefined = eUserPriorityType;
        Subscription = new EUserPriorityType("Subscription", 1, 1);
        WithoutSubscription = new EUserPriorityType("WithoutSubscription", 2, 2);
        NewWithoutSubscription = new EUserPriorityType("NewWithoutSubscription", 3, 3);
        EUserPriorityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        final g0c a = qoi0.a(EUserPriorityType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EUserPriorityType>(a, syntax, eUserPriorityType) { // from class: ru.yandex.alice.protos.api.alice_mode_info.platform.utils.EUserPriorityType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EUserPriorityType fromValue(int value) {
                return EUserPriorityType.INSTANCE.fromValue(value);
            }
        };
    }

    private EUserPriorityType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EUserPriorityType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EUserPriorityType valueOf(String str) {
        return (EUserPriorityType) Enum.valueOf(EUserPriorityType.class, str);
    }

    public static EUserPriorityType[] values() {
        return (EUserPriorityType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/EUserPriorityType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/api/alice_mode_info/platform/utils/EUserPriorityType;", "fromValue", "value", "", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EUserPriorityType fromValue(int value) {
            if (value == 0) {
                return EUserPriorityType.Undefined;
            }
            if (value == 1) {
                return EUserPriorityType.Subscription;
            }
            if (value == 2) {
                return EUserPriorityType.WithoutSubscription;
            }
            if (value != 3) {
                return null;
            }
            return EUserPriorityType.NewWithoutSubscription;
        }

        private Companion() {
        }
    }
}
