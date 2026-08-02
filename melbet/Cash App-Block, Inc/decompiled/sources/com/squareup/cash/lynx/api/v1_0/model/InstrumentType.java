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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEBIT_CARD", "BANK_ACCOUNT", "CREDIT_CARD", "CASH_BALANCE", "LINE_OF_CREDIT", "CASH_SECONDARY_BALANCE", "APPLE_PAY", "GOOGLE_PAY", "EBT", "STABLECOIN_WALLET", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstrumentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentType[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final InstrumentType APPLE_PAY;
    public static final InstrumentType BANK_ACCOUNT;
    public static final InstrumentType CASH_BALANCE;
    public static final InstrumentType CASH_SECONDARY_BALANCE;
    public static final InstrumentType CREDIT_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InstrumentType DEBIT_CARD;
    public static final InstrumentType EBT;
    public static final InstrumentType GOOGLE_PAY;
    public static final InstrumentType LINE_OF_CREDIT;
    public static final InstrumentType STABLECOIN_WALLET;
    private final int value;

    private static final /* synthetic */ InstrumentType[] $values() {
        return new InstrumentType[]{DEBIT_CARD, BANK_ACCOUNT, CREDIT_CARD, CASH_BALANCE, LINE_OF_CREDIT, CASH_SECONDARY_BALANCE, APPLE_PAY, GOOGLE_PAY, EBT, STABLECOIN_WALLET};
    }

    static {
        final InstrumentType instrumentType = new InstrumentType("DEBIT_CARD", 0, 0);
        DEBIT_CARD = instrumentType;
        BANK_ACCOUNT = new InstrumentType("BANK_ACCOUNT", 1, 1);
        CREDIT_CARD = new InstrumentType("CREDIT_CARD", 2, 2);
        CASH_BALANCE = new InstrumentType("CASH_BALANCE", 3, 3);
        LINE_OF_CREDIT = new InstrumentType("LINE_OF_CREDIT", 4, 4);
        CASH_SECONDARY_BALANCE = new InstrumentType("CASH_SECONDARY_BALANCE", 5, 5);
        APPLE_PAY = new InstrumentType("APPLE_PAY", 6, 6);
        GOOGLE_PAY = new InstrumentType("GOOGLE_PAY", 7, 7);
        EBT = new InstrumentType("EBT", 8, 8);
        STABLECOIN_WALLET = new InstrumentType("STABLECOIN_WALLET", 9, 9);
        InstrumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, instrumentType) { // from class: com.squareup.cash.lynx.api.v1_0.model.InstrumentType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public InstrumentType fromValue(int value) {
                return InstrumentType.INSTANCE.fromValue(value);
            }
        };
    }

    private InstrumentType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final InstrumentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/cash/lynx/api/v1_0/model/InstrumentType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InstrumentType fromValue(int value) {
            switch (value) {
                case 0:
                    return InstrumentType.DEBIT_CARD;
                case 1:
                    return InstrumentType.BANK_ACCOUNT;
                case 2:
                    return InstrumentType.CREDIT_CARD;
                case 3:
                    return InstrumentType.CASH_BALANCE;
                case 4:
                    return InstrumentType.LINE_OF_CREDIT;
                case 5:
                    return InstrumentType.CASH_SECONDARY_BALANCE;
                case 6:
                    return InstrumentType.APPLE_PAY;
                case 7:
                    return InstrumentType.GOOGLE_PAY;
                case 8:
                    return InstrumentType.EBT;
                case 9:
                    return InstrumentType.STABLECOIN_WALLET;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
