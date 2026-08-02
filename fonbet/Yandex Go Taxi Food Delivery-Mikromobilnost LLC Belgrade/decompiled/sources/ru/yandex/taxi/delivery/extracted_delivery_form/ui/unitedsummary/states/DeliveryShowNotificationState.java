package ru.yandex.taxi.delivery.extracted_delivery_form.ui.unitedsummary.states;

import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.delivery.extracted_delivery_form.ui.point.DeliveryPointFocusHolder$FocusTarget;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryBubblePosition;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class DeliveryShowNotificationState {
    public final ShowState a;
    public final String b;
    public final int c;
    public final DeliveryFormStepType d;
    public final DeliveryPointFocusHolder$FocusTarget e;
    public final DeliveryBubblePosition f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/delivery/extracted_delivery_form/ui/unitedsummary/states/DeliveryShowNotificationState$ShowState;", "", "NOT_SHOWN", "NEED_SHOW", "SHOWN", "extracted_delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ShowState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ShowState[] $VALUES;
        public static final ShowState NEED_SHOW;
        public static final ShowState NOT_SHOWN;
        public static final ShowState SHOWN;

        static {
            ShowState showState = new ShowState("NOT_SHOWN", 0);
            NOT_SHOWN = showState;
            ShowState showState2 = new ShowState("NEED_SHOW", 1);
            NEED_SHOW = showState2;
            ShowState showState3 = new ShowState("SHOWN", 2);
            SHOWN = showState3;
            ShowState[] showStateArr = {showState, showState2, showState3};
            $VALUES = showStateArr;
            $ENTRIES = a.a(showStateArr);
        }

        public static ShowState valueOf(String str) {
            return (ShowState) Enum.valueOf(ShowState.class, str);
        }

        public static ShowState[] values() {
            return (ShowState[]) $VALUES.clone();
        }
    }

    public DeliveryShowNotificationState(ShowState showState, String str, int i, DeliveryFormStepType deliveryFormStepType, DeliveryPointFocusHolder$FocusTarget deliveryPointFocusHolder$FocusTarget, DeliveryBubblePosition deliveryBubblePosition, boolean z, int i2) {
        showState = (i2 & 1) != 0 ? ShowState.NOT_SHOWN : showState;
        str = (i2 & 2) != 0 ? "" : str;
        i = (i2 & 4) != 0 ? -1 : i;
        deliveryFormStepType = (i2 & 8) != 0 ? DeliveryFormStepType.SOURCE : deliveryFormStepType;
        deliveryPointFocusHolder$FocusTarget = (i2 & 16) != 0 ? DeliveryPointFocusHolder$FocusTarget.None : deliveryPointFocusHolder$FocusTarget;
        deliveryBubblePosition = (i2 & 32) != 0 ? DeliveryBubblePosition.CENTER : deliveryBubblePosition;
        z = (i2 & 64) != 0 ? false : z;
        this.a = showState;
        this.b = str;
        this.c = i;
        this.d = deliveryFormStepType;
        this.e = deliveryPointFocusHolder$FocusTarget;
        this.f = deliveryBubblePosition;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryShowNotificationState)) {
            return false;
        }
        DeliveryShowNotificationState deliveryShowNotificationState = (DeliveryShowNotificationState) obj;
        return this.a == deliveryShowNotificationState.a && jl40.l(this.b, deliveryShowNotificationState.b) && this.c == deliveryShowNotificationState.c && this.d == deliveryShowNotificationState.d && this.e == deliveryShowNotificationState.e && this.f == deliveryShowNotificationState.f && this.g == deliveryShowNotificationState.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryShowNotificationState(showState=");
        sb.append(this.a);
        sb.append(", notificationText=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", screenType=");
        sb.append(this.d);
        sb.append(", notificationTarget=");
        sb.append(this.e);
        sb.append(", pointerPosition=");
        sb.append(this.f);
        sb.append(", fromUser=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }

    public DeliveryShowNotificationState() {
        this(null, null, 0, null, null, null, false, HProv.PP_VERSION_TIMESTAMP);
    }
}
