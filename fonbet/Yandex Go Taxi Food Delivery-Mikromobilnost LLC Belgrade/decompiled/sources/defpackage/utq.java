package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

@gsq0
/* loaded from: classes6.dex */
public final class utq {
    public static final ttq Companion = new ttq();
    public static final i3y[] h;
    public final FeedbackSettingsParams$Screen a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final List f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{a.b(lazyThreadSafetyMode, new nsq(5)), null, null, null, null, a.b(lazyThreadSafetyMode, new nsq(6)), a.b(lazyThreadSafetyMode, new nsq(7))};
    }

    public /* synthetic */ utq(int i, FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str, String str2, int i2, String str3, List list, List list2) {
        if (127 != (i & HProv.PP_VERSION_TIMESTAMP)) {
            qje.Z(i, HProv.PP_VERSION_TIMESTAMP, stq.a.getDescriptor());
            throw null;
        }
        this.a = feedbackSettingsParams$Screen;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = list;
        this.g = list2;
    }

    public utq(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, String str, String str2, int i, String str3, List list, List list2) {
        this.a = feedbackSettingsParams$Screen;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = list;
        this.g = list2;
    }
}
