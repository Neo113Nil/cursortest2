package defpackage;

import com.yandex.go.zone.dto.objects.TollRoadsAvailability;
import com.yandex.go.zone.dto.objects.o6;
import com.yandex.go.zone.dto.objects.r6;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvrz0;", "", "Companion", "urz0", "trz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class vrz0 {
    public static final urz0 Companion = new urz0();
    public static final i3y[] h = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(23)), null, null, null, null, null};
    public static final vrz0 i = new vrz0(0);
    public final Boolean a;
    public final TollRoadsAvailability b;
    public final o6 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final nrz0 g;

    public /* synthetic */ vrz0(int i2, Boolean bool, TollRoadsAvailability tollRoadsAvailability, o6 o6Var, String str, String str2, boolean z, nrz0 nrz0Var) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i2 & 2) == 0) {
            this.b = TollRoadsAvailability.DISABLED;
        } else {
            this.b = tollRoadsAvailability;
        }
        if ((i2 & 4) == 0) {
            this.c = r6.INSTANCE;
        } else {
            this.c = o6Var;
        }
        if ((i2 & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = nrz0Var;
        }
    }

    public vrz0() {
        this(0);
    }

    public vrz0(int i2) {
        TollRoadsAvailability tollRoadsAvailability = TollRoadsAvailability.DISABLED;
        r6 r6Var = r6.INSTANCE;
        this.a = null;
        this.b = tollRoadsAvailability;
        this.c = r6Var;
        this.d = "";
        this.e = "";
        this.f = false;
        this.g = null;
    }
}
