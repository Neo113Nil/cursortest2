package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.kinopoisk.sdk.easylogin.internal.C1149n6;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/o6;", "Lru/kinopoisk/sdk/easylogin/internal/m6;", "libs_shared_logger"}, k = 1, mv = {2, 0, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1163o6 implements InterfaceC1135m6 {
    public final C1149n6 a;

    public C1163o6(String str, C1149n6 c1149n6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        c1149n6 = (i & 2) != 0 ? null : c1149n6;
        str.getClass();
        this.a = c1149n6;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1135m6
    public final void a(@NotNull EnumC1079i6 enumC1079i6, @NotNull EnumC1051g6 enumC1051g6, @NotNull Function1<? super InterfaceC1177p6, String> function1) {
        enumC1079i6.getClass();
        enumC1051g6.getClass();
        function1.getClass();
        C1149n6 c1149n6 = this.a;
        if (c1149n6 == null) {
            C1149n6.c.getClass();
            c1149n6 = C1149n6.a.a();
        }
        List<InterfaceC1107k6> list = c1149n6.a().get(enumC1051g6);
        if (list == null) {
            return;
        }
        C1191q6 c1191q6 = new C1191q6(false);
        String str = (String) function1.invoke(c1191q6);
        if (str.length() <= 0) {
            str = null;
        }
        LinkedHashMap a = c1191q6.a();
        LinkedHashMap linkedHashMap = a.isEmpty() ? null : a;
        if (str == null && linkedHashMap == null) {
            return;
        }
        if (linkedHashMap != null) {
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(entry.getKey() + " = " + entry.getValue());
            }
            CollectionsKt.X(arrayList, ", ", null, null, null, 62);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1107k6) it.next()).a();
        }
    }
}
