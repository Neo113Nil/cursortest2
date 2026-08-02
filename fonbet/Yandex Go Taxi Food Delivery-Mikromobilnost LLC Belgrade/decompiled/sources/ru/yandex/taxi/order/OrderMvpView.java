package ru.yandex.taxi.order;

import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import com.yandex.go.taxi.order.state.OrderStateView;
import defpackage.a741;
import defpackage.k4o;
import defpackage.l050;
import defpackage.qim;
import kotlin.Metadata;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/order/OrderMvpView;", "Ll050;", "State", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface OrderMvpView extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/order/OrderMvpView$State;", "", "PREORDER", "SEARCH", "ON_THE_WAY", "COMPLETE", "SCHEDULE", "CHECK_IN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State CHECK_IN;
        public static final State COMPLETE;
        public static final State ON_THE_WAY;
        public static final State PREORDER;
        public static final State SCHEDULE;
        public static final State SEARCH;

        static {
            State state = new State("PREORDER", 0);
            PREORDER = state;
            State state2 = new State("SEARCH", 1);
            SEARCH = state2;
            State state3 = new State("ON_THE_WAY", 2);
            ON_THE_WAY = state3;
            State state4 = new State("COMPLETE", 3);
            COMPLETE = state4;
            State state5 = new State("SCHEDULE", 4);
            SCHEDULE = state5;
            State state6 = new State("CHECK_IN", 5);
            CHECK_IN = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    void changeCardContent(DriveState driveState, DriveState driveState2, OrderStateView.Mode mode);

    void checkCardState();

    void disableFocusOnPinWhenZooming();

    void dismissSelf();

    void dispatchRatingClick();

    boolean hasPopupsShown();

    void openAfterFeedbackInfo(boolean z);

    void renderWalkingInfo(a741 a741Var);

    void setBottomSheetState(int i);

    void setState(State state, OrderStateView.Mode mode);

    void showDriver(qim qimVar);

    void showOrderInfo();

    void showRouteChangeWarning(RouteChangeWarning routeChangeWarning);

    void showTipsInput(String str);

    void updateArrowViewBehaviour(DriveState driveState);
}
