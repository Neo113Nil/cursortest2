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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/EUnit;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NoUnit", "PercentUnit", "TemperatureKelvinUnit", "TemperatureCelsiusUnit", "PressureAtmUnit", "PressurePascalUnit", "PressureBarUnit", "PressureMmHgUnit", "LuxUnit", "PPBUnit", "AmpereUnit", "VoltUnit", "WattUnit", "PPMUnit", "CubicMeterUnit", "KilowattHourUnit", "GigacalorieUnit", "DensityUgM3Unit", "LiterUnit", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EUnit implements WireEnum {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EUnit[] $VALUES;
    public static final ProtoAdapter<EUnit> ADAPTER;
    public static final EUnit AmpereUnit;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EUnit CubicMeterUnit;
    public static final EUnit DensityUgM3Unit;
    public static final EUnit GigacalorieUnit;
    public static final EUnit KilowattHourUnit;
    public static final EUnit LiterUnit;
    public static final EUnit LuxUnit;
    public static final EUnit NoUnit;
    public static final EUnit PPBUnit;
    public static final EUnit PPMUnit;
    public static final EUnit PercentUnit;
    public static final EUnit PressureAtmUnit;
    public static final EUnit PressureBarUnit;
    public static final EUnit PressureMmHgUnit;
    public static final EUnit PressurePascalUnit;
    public static final EUnit TemperatureCelsiusUnit;
    public static final EUnit TemperatureKelvinUnit;
    public static final EUnit VoltUnit;
    public static final EUnit WattUnit;
    private final int value;

    private static final /* synthetic */ EUnit[] $values() {
        return new EUnit[]{NoUnit, PercentUnit, TemperatureKelvinUnit, TemperatureCelsiusUnit, PressureAtmUnit, PressurePascalUnit, PressureBarUnit, PressureMmHgUnit, LuxUnit, PPBUnit, AmpereUnit, VoltUnit, WattUnit, PPMUnit, CubicMeterUnit, KilowattHourUnit, GigacalorieUnit, DensityUgM3Unit, LiterUnit};
    }

    static {
        final EUnit eUnit = new EUnit("NoUnit", 0, 0);
        NoUnit = eUnit;
        PercentUnit = new EUnit("PercentUnit", 1, 1);
        TemperatureKelvinUnit = new EUnit("TemperatureKelvinUnit", 2, 2);
        TemperatureCelsiusUnit = new EUnit("TemperatureCelsiusUnit", 3, 3);
        PressureAtmUnit = new EUnit("PressureAtmUnit", 4, 4);
        PressurePascalUnit = new EUnit("PressurePascalUnit", 5, 5);
        PressureBarUnit = new EUnit("PressureBarUnit", 6, 6);
        PressureMmHgUnit = new EUnit("PressureMmHgUnit", 7, 7);
        LuxUnit = new EUnit("LuxUnit", 8, 8);
        PPBUnit = new EUnit("PPBUnit", 9, 9);
        AmpereUnit = new EUnit("AmpereUnit", 10, 10);
        VoltUnit = new EUnit("VoltUnit", 11, 11);
        WattUnit = new EUnit("WattUnit", 12, 12);
        PPMUnit = new EUnit("PPMUnit", 13, 13);
        CubicMeterUnit = new EUnit("CubicMeterUnit", 14, 14);
        KilowattHourUnit = new EUnit("KilowattHourUnit", 15, 15);
        GigacalorieUnit = new EUnit("GigacalorieUnit", 16, 16);
        DensityUgM3Unit = new EUnit("DensityUgM3Unit", 17, 17);
        LiterUnit = new EUnit("LiterUnit", 18, 18);
        EUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        INSTANCE = new Companion(null);
        final g0c a = qoi0.a(EUnit.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<EUnit>(a, syntax, eUnit) { // from class: ru.yandex.alice.protos.endpoint.quark.webchat.EUnit$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EUnit fromValue(int value) {
                return EUnit.INSTANCE.fromValue(value);
            }
        };
    }

    private EUnit(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EUnit fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static EUnit valueOf(String str) {
        return (EUnit) Enum.valueOf(EUnit.class, str);
    }

    public static EUnit[] values() {
        return (EUnit[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/endpoint/quark/webchat/EUnit$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/endpoint/quark/webchat/EUnit;", "fromValue", "value", "", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EUnit fromValue(int value) {
            switch (value) {
                case 0:
                    return EUnit.NoUnit;
                case 1:
                    return EUnit.PercentUnit;
                case 2:
                    return EUnit.TemperatureKelvinUnit;
                case 3:
                    return EUnit.TemperatureCelsiusUnit;
                case 4:
                    return EUnit.PressureAtmUnit;
                case 5:
                    return EUnit.PressurePascalUnit;
                case 6:
                    return EUnit.PressureBarUnit;
                case 7:
                    return EUnit.PressureMmHgUnit;
                case 8:
                    return EUnit.LuxUnit;
                case 9:
                    return EUnit.PPBUnit;
                case 10:
                    return EUnit.AmpereUnit;
                case 11:
                    return EUnit.VoltUnit;
                case 12:
                    return EUnit.WattUnit;
                case 13:
                    return EUnit.PPMUnit;
                case 14:
                    return EUnit.CubicMeterUnit;
                case 15:
                    return EUnit.KilowattHourUnit;
                case 16:
                    return EUnit.GigacalorieUnit;
                case 17:
                    return EUnit.DensityUgM3Unit;
                case 18:
                    return EUnit.LiterUnit;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
