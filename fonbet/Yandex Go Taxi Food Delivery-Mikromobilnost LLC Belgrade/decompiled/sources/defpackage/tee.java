package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.ButtonAction;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ltee;", "", "Companion", "a", "oee", "ree", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class tee {
    public static final ree Companion = new ree();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(9))};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final List f;

    public /* synthetic */ tee(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str2, List list) {
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
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltee$a;", "", "Companion", "pee", "qee", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final qee Companion = new qee();
        public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new m3e(10))};
        public final String a;
        public final FormattedText b;
        public final String c;
        public final ButtonAction d;

        public /* synthetic */ a(int i, String str, FormattedText formattedText, String str2, ButtonAction buttonAction) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = buttonAction;
            }
        }

        public a() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = "";
            this.d = null;
        }
    }

    public tee() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
        this.e = "";
        this.f = null;
    }
}
