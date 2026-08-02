package ru.yandex.taxi.contacts;

import defpackage.k4o;
import defpackage.l050;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/contacts/SelectContactMvpView;", "Ll050;", "UiState", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SelectContactMvpView extends l050 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/contacts/SelectContactMvpView$UiState;", "", "NORMAL", "EDIT", "EMPTY", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class UiState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UiState[] $VALUES;
        public static final UiState EDIT;
        public static final UiState EMPTY;
        public static final UiState NORMAL;

        static {
            UiState uiState = new UiState("NORMAL", 0);
            NORMAL = uiState;
            UiState uiState2 = new UiState("EDIT", 1);
            EDIT = uiState2;
            UiState uiState3 = new UiState("EMPTY", 2);
            EMPTY = uiState3;
            UiState[] uiStateArr = {uiState, uiState2, uiState3};
            $VALUES = uiStateArr;
            $ENTRIES = kotlin.enums.a.a(uiStateArr);
        }

        public static UiState valueOf(String str) {
            return (UiState) Enum.valueOf(UiState.class, str);
        }

        public static UiState[] values() {
            return (UiState[]) $VALUES.clone();
        }
    }

    void A(int i);

    void D4();

    void Ga();

    void H7(boolean z);

    void J(String str);

    void R5(String str);

    void Ya(List list, UiState uiState);

    void ac();

    void c0();

    void d0(String str);

    void f0();

    void g0();

    void i0();

    void m4();

    void nd();

    void o2(String str, String str2, boolean z);

    void r(ArrayList arrayList);

    void t();

    void u(List list);

    void updateInputType(int i);

    void v0(String str);

    void v8(String str);

    void x1();

    void xf(List list, UiState uiState);

    void z();
}
