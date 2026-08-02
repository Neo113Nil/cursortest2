package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls090;", "", "Companion", "q090", "r090", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s090 {
    public static final r090 Companion = new r090();
    public static final i3y[] g;
    public final String a;
    public final Float[] b;
    public final Float[] c;
    public final FormattedText d;
    public final List e;
    public final a190 f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, a.b(lazyThreadSafetyMode, new aw80(3)), a.b(lazyThreadSafetyMode, new aw80(5)), null, a.b(lazyThreadSafetyMode, new aw80(7)), null};
    }

    public /* synthetic */ s090(int i, String str, Float[] fArr, Float[] fArr2, FormattedText formattedText, List list, a190 a190Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = fArr;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = fArr2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = a190Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Float[] getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final a190 getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final FormattedText getD() {
        return this.d;
    }

    /* renamed from: d, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final List e() {
        List list = this.e;
        return list == null ? EmptyList.a : list;
    }

    /* renamed from: f, reason: from getter */
    public final Float[] getB() {
        return this.b;
    }

    public s090() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
