package com.yandex.plus.pay.ui.tarifficator.mobile.bdui.internal.featureflags;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.featureflags.h;
import com.yandex.plus.core.featureflags.i;
import com.yandex.plus.core.featureflags.j;
import com.yandex.plus.core.featureflags.m;
import com.yandex.plus.core.featureflags.n;
import com.yandex.plus.core.featureflags.o;
import com.yandex.plus.core.featureflags.p;
import com.yandex.plus.core.featureflags.r;
import com.yandex.plus.core.featureflags.y;
import defpackage.xq0;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new i(new y(2, null), (n) null, (n) null, (Integer) null, (r) null, 62);
            case 1:
                return new i(new y(1, null), (m) null, (m) null, (Float) null, (r) null, 62);
            case 2:
                return new h(new y(0, null), null, null, null, 30);
            case 3:
                return new j(new y(3, null), (o) null, (o) null, (String) null, 30);
            case 4:
                return new j(new y(4, null), (p) null, (p) null, (Set) null, 30);
            case 5:
                return new i(new y(2, null), (n) null, (n) null, (Integer) null, (r) null, 62);
            case 6:
                return new j(new y(3, "api/mobile/flow/launch"), (o) null, (o) null, (String) null, 30);
            case 7:
                return new i(new y(1, null), (m) null, (m) null, (Float) null, (r) null, 62);
            case 8:
                if (u.s("api/mobile/flow/launch")) {
                    return new j(new y(4, u.H("api/mobile/flow/launch")), (p) null, (p) null, (Set) null, 30);
                }
                xq0.x("Value arg is not of Set type or has non-string items!");
                return null;
            case 9:
                return new i(new y(2, null), (n) null, (n) null, (Integer) null, (r) null, 62);
            case 10:
                return new i(new y(1, null), (m) null, (m) null, (Float) null, (r) null, 62);
            case 11:
                return new h(new y(0, null), null, null, null, 30);
            case 12:
                return new j(new y(3, "checkout"), (o) null, (o) null, (String) null, 30);
            case 13:
                if (u.s("checkout")) {
                    return new j(new y(4, u.H("checkout")), (p) null, (p) null, (Set) null, 30);
                }
                xq0.x("Value arg is not of Set type or has non-string items!");
                return null;
            default:
                return new i(new y(2, null), (n) null, (n) null, (Integer) null, (r) null, 62);
        }
    }
}
