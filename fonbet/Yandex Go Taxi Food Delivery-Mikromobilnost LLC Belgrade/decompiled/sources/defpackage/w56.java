package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw56;", "", "Companion", "v56", "u56", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class w56 {
    public static final v56 Companion = new v56();
    public static final w56 d = new w56(0);
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ w56(String str, int i, String str2, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
    }

    public w56(int i) {
        this.a = "";
        this.b = "";
        this.c = true;
    }

    public w56() {
        this(0);
    }
}
