package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltn6;", "", "Companion", "rn6", "sn6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class tn6 {
    public static final sn6 Companion = new sn6();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public /* synthetic */ tn6(int i, int i2, int i3, int i4, int i5) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i4;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i5;
        }
    }

    /* renamed from: a, reason: from getter */
    public final int getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public tn6() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }
}
