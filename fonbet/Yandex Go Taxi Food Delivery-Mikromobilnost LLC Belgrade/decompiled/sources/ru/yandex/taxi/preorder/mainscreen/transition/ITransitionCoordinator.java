package ru.yandex.taxi.preorder.mainscreen.transition;

import com.yandex.go.address.models.Address;
import defpackage.k4o;
import defpackage.zwx0;
import defpackage.zxf0;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/transition/ITransitionCoordinator;", "Lzxf0;", "VisibilityChangeReason", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ITransitionCoordinator extends zxf0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/preorder/mainscreen/transition/ITransitionCoordinator$VisibilityChangeReason;", "", "MODAL_VIEW", "ADDRESS_CHANGED", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class VisibilityChangeReason {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ VisibilityChangeReason[] $VALUES;
        public static final VisibilityChangeReason ADDRESS_CHANGED;
        public static final VisibilityChangeReason MODAL_VIEW;

        static {
            VisibilityChangeReason visibilityChangeReason = new VisibilityChangeReason("MODAL_VIEW", 0);
            MODAL_VIEW = visibilityChangeReason;
            VisibilityChangeReason visibilityChangeReason2 = new VisibilityChangeReason("ADDRESS_CHANGED", 1);
            ADDRESS_CHANGED = visibilityChangeReason2;
            VisibilityChangeReason[] visibilityChangeReasonArr = {visibilityChangeReason, visibilityChangeReason2};
            $VALUES = visibilityChangeReasonArr;
            $ENTRIES = a.a(visibilityChangeReasonArr);
        }

        public static VisibilityChangeReason valueOf(String str) {
            return (VisibilityChangeReason) Enum.valueOf(VisibilityChangeReason.class, str);
        }

        public static VisibilityChangeReason[] values() {
            return (VisibilityChangeReason[]) $VALUES.clone();
        }
    }

    void C1();

    void D8();

    boolean F4();

    void Kf();

    void M0();

    void Nd();

    void Qb(Object obj, boolean z);

    void Rf();

    void T3();

    void T6();

    void Tb(boolean z);

    void Wa();

    void c3(boolean z);

    zwx0 cc();

    void d2(String str);

    void f4();

    void fb();

    void k3(boolean z, VisibilityChangeReason visibilityChangeReason);

    void o8();

    void o9();

    void onModalViewDisappear();

    void setSourceAddress(Address address);

    void showControlElements(boolean z);

    void ta(boolean z);

    void v7();

    void wa();

    void xb();
}
