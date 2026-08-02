package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentScope;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN_SCOPE", "DEFAULT_CASH", "LOCAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstrumentScope implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentScope[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InstrumentScope DEFAULT_CASH;
    public static final InstrumentScope LOCAL;
    public static final InstrumentScope UNKNOWN_SCOPE;
    private final int value;

    private static final /* synthetic */ InstrumentScope[] $values() {
        return new InstrumentScope[]{UNKNOWN_SCOPE, DEFAULT_CASH, LOCAL};
    }

    static {
        final InstrumentScope instrumentScope = new InstrumentScope("UNKNOWN_SCOPE", 0, 0);
        UNKNOWN_SCOPE = instrumentScope;
        DEFAULT_CASH = new InstrumentScope("DEFAULT_CASH", 1, 1);
        LOCAL = new InstrumentScope("LOCAL", 2, 2);
        InstrumentScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentScope.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, instrumentScope) { // from class: com.squareup.cash.lynx.api.v1_0.model.InstrumentScope$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public InstrumentScope fromValue(int value) {
                return InstrumentScope.INSTANCE.fromValue(value);
            }
        };
    }

    private InstrumentScope(String str, int i, int i2) {
        this.value = i2;
    }

    public static final InstrumentScope fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static InstrumentScope valueOf(String str) {
        return (InstrumentScope) Enum.valueOf(InstrumentScope.class, str);
    }

    public static InstrumentScope[] values() {
        return (InstrumentScope[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentScope$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentScope;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InstrumentScope fromValue(int value) {
            if (value == 0) {
                return InstrumentScope.UNKNOWN_SCOPE;
            }
            if (value == 1) {
                return InstrumentScope.DEFAULT_CASH;
            }
            if (value != 2) {
                return null;
            }
            return InstrumentScope.LOCAL;
        }

        private Companion() {
        }
    }
}
