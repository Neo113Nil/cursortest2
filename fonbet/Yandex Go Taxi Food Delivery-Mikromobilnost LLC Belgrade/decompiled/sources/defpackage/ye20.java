package defpackage;

import ru.yandex.taxi.plus.api.dto.state.plaque.ElementLevelDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ye20 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[MicroWidgetDto.Type.values().length];
        try {
            iArr[MicroWidgetDto.Type.BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MicroWidgetDto.Type.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MicroWidgetDto.Type.SPACER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MicroWidgetDto.Type.ICON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MicroWidgetDto.Type.SWITCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MicroWidgetDto.Type.BALANCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
        int[] iArr2 = new int[ElementLevelDto.Type.values().length];
        try {
            iArr2[ElementLevelDto.Type.WIDGET.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ElementLevelDto.Type.WIDGET_GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ElementLevelDto.Type.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
        int[] iArr3 = new int[MicroWidgetPlaqueDto.IconInCornerDto.Position.values().length];
        try {
            iArr3[MicroWidgetPlaqueDto.IconInCornerDto.Position.LEFT_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[MicroWidgetPlaqueDto.IconInCornerDto.Position.RIGHT_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        c = iArr3;
    }
}
