package defpackage;

import com.yandex.go.payments.api.shared.model.BusinessAccountMenuItemPosition;
import com.yandex.go.payments.api.shared.model.EntryPoints;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes8.dex */
public final class tmr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final String i;
    public final rmr0 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final EntryPoints n;
    public final BusinessAccountMenuItemPosition o;
    public final String p;
    public final boolean q;
    public final ynr0 r;

    public /* synthetic */ tmr0(String str, String str2, String str3, String str4, String str5, boolean z, ArrayList arrayList, boolean z2, String str6, rmr0 rmr0Var, ynr0 ynr0Var, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? EmptyList.a : arrayList, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? null : rmr0Var, true, true, true, null, BusinessAccountMenuItemPosition.ORIGINAL, "", false, ynr0Var);
    }

    public final SharedAccountType a() {
        SharedAccountType.Companion.getClass();
        return qmr0.a(this.a);
    }

    public tmr0(String str, String str2, String str3, String str4, String str5, boolean z, List list, boolean z2, String str6, rmr0 rmr0Var, boolean z3, boolean z4, boolean z5, EntryPoints entryPoints, BusinessAccountMenuItemPosition businessAccountMenuItemPosition, String str7, boolean z6, ynr0 ynr0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = list;
        this.h = z2;
        this.i = str6;
        this.j = rmr0Var;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = entryPoints;
        this.o = businessAccountMenuItemPosition;
        this.p = str7;
        this.q = z6;
        this.r = ynr0Var;
    }
}
