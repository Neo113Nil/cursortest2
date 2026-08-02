package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.d85;
import defpackage.enj;
import defpackage.k5r;
import defpackage.tlm;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/a9;", "", "", "Ld85;", "colors", "", "positions", "Lenj;", "center", "angle", "<init>", "(Ljava/util/List;Ljava/util/List;JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "android_ui_uikit_shared"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.a9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C0970a9 {

    @NotNull
    public final List<d85> a;

    @NotNull
    public final List<Float> b;
    public final long c;
    public final float d;

    public C0970a9(List list, List list2, long j, float f, DefaultConstructorMarker defaultConstructorMarker) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = f;
        Iterator it = list2.iterator();
        Iterator it2 = list.iterator();
        ArrayList arrayList = new ArrayList(Math.min(v75.o(list2, 10), v75.o(list, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(Float.valueOf(((Number) it.next()).floatValue()), new d85(((d85) it2.next()).a)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0970a9)) {
            return false;
        }
        C0970a9 c0970a9 = (C0970a9) obj;
        return Intrinsics.d(this.a, c0970a9.a) && Intrinsics.d(this.b, c0970a9.b) && enj.c(this.c, c0970a9.c) && Float.compare(this.d, c0970a9.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tlm.c(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    @NotNull
    public final String toString() {
        return "SweepGradientColor(colors=" + this.a + ", positions=" + this.b + ", center=" + enj.j(this.c) + ", angle=" + this.d + ")";
    }

    public C0970a9() {
        throw null;
    }
}
