package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lu4w;", "", "Companion", "b", "a", "q4w", "r4w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class u4w {
    public static final r4w Companion = new r4w();
    public final String a;
    public final boolean b;
    public final b c;
    public final a d;

    public /* synthetic */ u4w(int i, String str, boolean z, b bVar, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lu4w$b;", "", "Companion", "v4w", "w4w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final w4w Companion = new w4w();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(29))};
        public final FormattedText a;
        public final List b;

        public /* synthetic */ b(int i, FormattedText formattedText, List list) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public b() {
            this.a = FormattedText.c;
            this.b = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lu4w$a;", "", "Companion", "s4w", "t4w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final t4w Companion = new t4w();
        public final long a;
        public final long b;

        public /* synthetic */ a(int i, long j, long j2) {
            if ((i & 1) == 0) {
                this.a = 0L;
            } else {
                this.a = j;
            }
            if ((i & 2) == 0) {
                this.b = 0L;
            } else {
                this.b = j2;
            }
        }

        public a() {
            this.a = 0L;
            this.b = 0L;
        }
    }

    public u4w() {
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }
}
