package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lzso0;", "Lw96;", "Lc6z;", "Companion", "a", "wso0", "vso0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class zso0 extends w96 implements c6z {
    public static final wso0 Companion = new wso0();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(27)), null, null, null};
    public static final zso0 h = new zso0(0);
    public final boolean b;
    public final Map c;
    public final a d;
    public final a e;
    public final Long f;

    public /* synthetic */ zso0(int i, boolean z, Map map, a aVar, a aVar2, Long l) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = aVar2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzso0$a;", "", "Companion", "xso0", "yso0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final yso0 Companion = new yso0();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;

        public /* synthetic */ a(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText3;
            }
        }

        public a() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
            this.c = null;
            this.d = formattedText;
        }
    }

    public zso0() {
        this(0);
    }

    public zso0(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
