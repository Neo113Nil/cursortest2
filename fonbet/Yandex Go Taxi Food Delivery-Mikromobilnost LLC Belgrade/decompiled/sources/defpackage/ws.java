package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$OrderAction$Flow;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.Style;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.ActionButtonMapper$Container;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ws {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ActionButtonMapper$Container.values().length];
        try {
            iArr[ActionButtonMapper$Container.FORM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionButtonMapper$Container.HORIZONTAL_STACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TapAction$OrderAction$Flow.values().length];
        try {
            iArr2[TapAction$OrderAction$Flow.STATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TapAction$OrderAction$Flow.ROUTE_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TapAction$OrderAction$Flow.PICKUP_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[Style.values().length];
        try {
            iArr3[Style.FLOATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[Style.GHOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[Style.MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[Style.MINOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[Style.OUTLINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
    }
}
