package ru.yandex.taxi;

import android.os.VibrationEffect;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"ru/yandex/taxi/HapticController$Effect", "", "Lru/yandex/taxi/HapticController$Effect;", "", "timings", "[J", "", "amplitudes", "[I", "fallbackTimings", "getFallbackTimings$design_components", "()[J", "", "vibrationEffect", "Ljava/lang/Object;", "CLICK_LIGHT", "CLICK_MEDIUM", "CLICK_HEAVY", "TICK", "SELECT", "BZZ", "WARNING", "GO_SPLASH", "PROMO_APPEARANCE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HapticController$Effect {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ HapticController$Effect[] $VALUES;
    public static final HapticController$Effect BZZ;
    public static final HapticController$Effect CLICK_HEAVY;
    public static final HapticController$Effect CLICK_LIGHT;
    public static final HapticController$Effect CLICK_MEDIUM;
    public static final HapticController$Effect GO_SPLASH;
    public static final HapticController$Effect PROMO_APPEARANCE;
    public static final HapticController$Effect SELECT;
    public static final HapticController$Effect TICK;
    public static final HapticController$Effect WARNING;
    private final int[] amplitudes;
    private final long[] fallbackTimings;
    private final long[] timings;
    private Object vibrationEffect;

    static {
        HapticController$Effect hapticController$Effect = new HapticController$Effect("CLICK_LIGHT", 0, new long[]{2}, new int[]{50}, new long[]{100});
        CLICK_LIGHT = hapticController$Effect;
        HapticController$Effect hapticController$Effect2 = new HapticController$Effect("CLICK_MEDIUM", 1, new long[]{6}, new int[]{150}, new long[]{100});
        CLICK_MEDIUM = hapticController$Effect2;
        HapticController$Effect hapticController$Effect3 = new HapticController$Effect("CLICK_HEAVY", 2, new long[]{18}, new int[]{255}, new long[]{100});
        CLICK_HEAVY = hapticController$Effect3;
        HapticController$Effect hapticController$Effect4 = new HapticController$Effect("TICK", 3, new long[]{6}, new int[]{100}, new long[]{100});
        TICK = hapticController$Effect4;
        HapticController$Effect hapticController$Effect5 = new HapticController$Effect("SELECT", 4, new long[]{10}, new int[]{55}, new long[]{50});
        SELECT = hapticController$Effect5;
        HapticController$Effect hapticController$Effect6 = new HapticController$Effect("BZZ", 5, new long[]{300}, new int[]{100}, new long[]{300});
        BZZ = hapticController$Effect6;
        HapticController$Effect hapticController$Effect7 = new HapticController$Effect("WARNING", 6, new long[]{18, 120, 18}, new int[]{255, 0, 150}, new long[]{50});
        WARNING = hapticController$Effect7;
        HapticController$Effect hapticController$Effect8 = new HapticController$Effect("GO_SPLASH", 7, new long[]{400, 15, 25, 15}, new int[]{0, 102, 0, 204}, new long[0]);
        GO_SPLASH = hapticController$Effect8;
        HapticController$Effect hapticController$Effect9 = new HapticController$Effect("PROMO_APPEARANCE", 8, new long[]{98, 146, 98}, new int[]{104, 0, 255}, new long[]{98, 146, 98});
        PROMO_APPEARANCE = hapticController$Effect9;
        HapticController$Effect[] hapticController$EffectArr = {hapticController$Effect, hapticController$Effect2, hapticController$Effect3, hapticController$Effect4, hapticController$Effect5, hapticController$Effect6, hapticController$Effect7, hapticController$Effect8, hapticController$Effect9};
        $VALUES = hapticController$EffectArr;
        $ENTRIES = kotlin.enums.a.a(hapticController$EffectArr);
    }

    public HapticController$Effect(String str, int i, long[] jArr, int[] iArr, long[] jArr2) {
        this.timings = jArr;
        this.amplitudes = iArr;
        this.fallbackTimings = jArr2;
    }

    public static HapticController$Effect valueOf(String str) {
        return (HapticController$Effect) Enum.valueOf(HapticController$Effect.class, str);
    }

    public static HapticController$Effect[] values() {
        return (HapticController$Effect[]) $VALUES.clone();
    }

    public final VibrationEffect a(boolean z) {
        VibrationEffect createOneShot;
        if (this.vibrationEffect == null) {
            if (z) {
                createOneShot = VibrationEffect.createWaveform(this.timings, this.amplitudes, -1);
            } else {
                long[] jArr = this.fallbackTimings;
                createOneShot = jArr.length == 1 ? VibrationEffect.createOneShot(jArr[0], -1) : VibrationEffect.createWaveform(jArr, -1);
            }
            this.vibrationEffect = createOneShot;
        }
        return (VibrationEffect) this.vibrationEffect;
    }
}
