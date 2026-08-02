package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f6u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ f6u(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 1:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 2:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 3:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 4:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 5:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 6:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 7:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 8:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 9:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 10:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 11:
                return Boolean.valueOf(((m2v) this.b.getValue()).d);
            case 12:
                m3v m3vVar = (m3v) this.b.getValue();
                if (m3vVar != null) {
                    int ordinal = m3vVar.ordinal();
                    z = true;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                        if (ordinal != 3) {
                            b6e.s();
                            return null;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 13:
                return (ai3) this.b.getValue();
            case 14:
                return Boolean.valueOf(((m2v) this.b.getValue()).d);
            case 15:
                return (ylu) this.b.getValue();
            case 16:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 17:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 18:
                m3v m3vVar2 = (m3v) this.b.getValue();
                if (m3vVar2 != null) {
                    int ordinal2 = m3vVar2.ordinal();
                    z2 = true;
                    if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            b6e.s();
                            return null;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 19:
                return Boolean.valueOf(((Number) this.b.getValue()).floatValue() > 0.0f);
            case 20:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 21:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 22:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 23:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 24:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case 25:
                return (m2v) this.b.getValue();
            case 26:
                return Float.valueOf((nya.b.b(1.0f - Math.abs((((Number) this.b.getValue()).floatValue() * 2.0f) - 1.0f)) * 0.1f) + 1.0f);
            case 27:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Float.valueOf(1 - ((Number) this.b.getValue()).floatValue());
            default:
                return Float.valueOf(((Number) this.b.getValue()).floatValue());
        }
    }
}
