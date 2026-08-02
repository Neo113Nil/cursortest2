package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderIconTypeDto;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxmy;", "", "Companion", "vmy", "wmy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class xmy {
    public static final wmy Companion = new wmy();
    public static final i3y[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new wky(3)), null};
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final LinkedOrderIconTypeDto e;
    public final String f;

    public /* synthetic */ xmy(int i, boolean z, boolean z2, boolean z3, boolean z4, LinkedOrderIconTypeDto linkedOrderIconTypeDto, String str) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
        if ((i & 16) == 0) {
            this.e = LinkedOrderIconTypeDto.C2C;
        } else {
            this.e = linkedOrderIconTypeDto;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final LinkedOrderIconTypeDto getE() {
        return this.e;
    }

    /* renamed from: c, reason: from getter */
    public final String getF() {
        return this.f;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public xmy() {
        this(0);
    }

    public xmy(int i) {
        LinkedOrderIconTypeDto linkedOrderIconTypeDto = LinkedOrderIconTypeDto.C2C;
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = linkedOrderIconTypeDto;
        this.f = "";
    }
}
