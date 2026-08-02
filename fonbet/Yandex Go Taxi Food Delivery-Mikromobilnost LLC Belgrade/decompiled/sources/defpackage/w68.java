package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw68;", "", "Companion", "v68", "u68", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w68 {
    public static final v68 Companion = new v68();
    public static final w68 f = new w68(0.03f, "smcp", 14.0f, false, false);
    public final float a;
    public final String b;
    public final float c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ w68(int i, float f2, String str, float f3, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = 0.0f;
        } else {
            this.a = f2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
    }

    public w68(float f2, String str, float f3, boolean z, boolean z2) {
        this.a = f2;
        this.b = str;
        this.c = f3;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w68() {
        this(r0, r0, 31);
        float f2 = 0.0f;
    }

    public /* synthetic */ w68(float f2, float f3, int i) {
        this((i & 1) != 0 ? 0.0f : f2, null, (i & 4) != 0 ? 0.0f : f3, (i & 8) == 0, (i & 16) == 0);
    }
}
