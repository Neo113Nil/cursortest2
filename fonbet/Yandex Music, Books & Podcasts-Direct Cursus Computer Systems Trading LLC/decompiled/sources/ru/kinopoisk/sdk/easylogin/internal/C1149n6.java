package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.f9h;
import defpackage.v3w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1149n6 {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static volatile C1149n6 d = new C1149n6(c5b.a);

    @NotNull
    public final List<InterfaceC1107k6> a;

    @NotNull
    public final Map<EnumC1051g6, List<InterfaceC1107k6>> b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/n6$a;", "", "libs_shared_logger"}, k = 1, mv = {2, 0, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.n6$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public static C1149n6 a() {
            return C1149n6.d;
        }
    }

    public C1149n6(@NotNull List list) {
        list.getClass();
        this.a = list;
        f9h f9hVar = new f9h();
        for (EnumC1051g6 enumC1051g6 : EnumC1051g6.e) {
            List<InterfaceC1107k6> list2 = this.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                Set<EnumC1037f6> b = ((InterfaceC1107k6) obj).b();
                Set<EnumC1037f6> set = enumC1051g6.a;
                if (!(b instanceof Collection) || !b.isEmpty()) {
                    Iterator<T> it = b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (set.contains((EnumC1037f6) it.next())) {
                                arrayList.add(obj);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                f9hVar.put(enumC1051g6, arrayList);
            }
        }
        this.b = f9hVar.b();
    }

    @NotNull
    public final Map<EnumC1051g6, List<InterfaceC1107k6>> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1149n6) && Intrinsics.d(this.a, ((C1149n6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    @NotNull
    public final String toString() {
        return v3w.f("LoggerConfiguration(allowSensitive=false, reporters=", ")", this.a);
    }
}
