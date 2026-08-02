package defpackage;

import android.os.Vibrator;
import com.yandex.music.shared.wave.screen.wordsinwave.data.WaveScreenWordsInWaveApi;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.ui.widget.WidgetRecentlyRectangleReceiver;
import ru.yandex.music.ui.widget.WidgetRectangleReceiver;
import ru.yandex.music.ui.widget.WidgetSquareReceiver;

/* loaded from: classes4.dex */
public final /* synthetic */ class jvu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jvu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hwv hwvVar;
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                kvu kvuVar = (kvu) obj;
                ArrayList arrayList = kvuVar.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mqs mqsVar = ((jja) it.next()).a;
                    if (!kvuVar.b && mqsVar.i() != null) {
                        mqsVar = null;
                    }
                    if (mqsVar != null) {
                        arrayList2.add(mqsVar);
                    }
                }
                return arrayList2;
            case 1:
                return ((cmu) obj).a;
            case 2:
                return new xh3((z4c) obj);
            case 3:
                return asq.K(((ug5) ((lk5) ((c1v) obj).a.getValue())).b, new t0v(i2));
            case 4:
                return new h3v((skr) obj);
            case 5:
                return rf0.b((Vibrator) obj);
            case 6:
                return ydr.a(Boolean.valueOf(((f4v) obj).h()));
            case 7:
                return ydr.a(Boolean.valueOf(((g4v) obj).h()));
            case 8:
                return ydr.a(Boolean.valueOf(((j4v) obj).h()));
            case 9:
                return (p1v) ((k4v) obj).a.d.getValue();
            case 10:
                return (p1v) ((k4v) ((r4v) obj).d.invoke()).b.getValue();
            case 11:
                return ((n7v) obj).c;
            case 12:
                return (WaveScreenWordsInWaveApi) ((g8v) obj).a.a.b(WaveScreenWordsInWaveApi.class);
            case 13:
                return Float.valueOf(((Number) ((f9v) obj).a.getValue()).floatValue());
            case 14:
                return ((xcv) obj).a;
            case 15:
                ((mfv) obj).a.G();
                return Unit.a;
            case 16:
                pzl pzlVar = ((dfv) obj).k.a;
                pzlVar.getClass();
                return new wfv(pzlVar.b(hag.I(igv.class), true), pzlVar.b(hag.I(z66.class), true), pzlVar.b(hag.I(jgv.class), true), pzlVar.b(hag.I(oev.class), true));
            case 17:
                ((qgv) obj).a();
                return Unit.a;
            case 18:
                skr skrVar = (skr) ((jac) obj).g;
                return new fhv("PUMPKIN", u75.h(ezf.v("activity:wake-up", skrVar.c(R.string.wave_title_activity_wake_up), skrVar.c(R.string.wave_header_activity), "https://music-custom-wave-media.music.yandex.net/JVsyUlrs9Y", "https://avatars.mds.yandex.net/get-music-misc/28592/rotor-activity-wake-up-agent-cover-RSUMc/%%", "#FFFFD6"), ezf.v("activity:road-trip", skrVar.c(R.string.wave_title_activity_road_trip), skrVar.c(R.string.wave_header_activity), "https://music-custom-wave-media.music.yandex.net/Foah9sRLsS", "https://avatars.mds.yandex.net/get-music-misc/70683/rotor-activity-road-trip-agent-cover-S1vPp/%%", "#FFFFDF"), ezf.v("activity:work-background", skrVar.c(R.string.wave_title_activity_road_trip_work_background), skrVar.c(R.string.wave_header_activity), "https://music-custom-wave-media.music.yandex.net/tsXpFHIBjM", "https://avatars.mds.yandex.net/get-music-misc/2413828/rotor-activity-work-background-agent-cover-5t6qb/%%", "#FFFFFF"), ezf.v("activity:workout", skrVar.c(R.string.wave_title_activity_road_trip_workout), skrVar.c(R.string.wave_header_activity), "https://music-custom-wave-media.music.yandex.net/PexWCCcEc9", "https://avatars.mds.yandex.net/get-music-misc/2413828/rotor-activity-workout-agent-cover-Wcrjo/%%", "#EBFFFE"), ezf.v("activity:fall-asleep", skrVar.c(R.string.wave_title_activity_road_fall_asleep), skrVar.c(R.string.wave_header_activity), "https://music-custom-wave-media.music.yandex.net/J9QAoYnnPe", "https://avatars.mds.yandex.net/get-music-misc/28592/rotor-activity-fall-asleep-agent-cover-XaOnj/%%", "#FAFFFF"), ezf.v("mood:energetic", skrVar.c(R.string.wave_title_mood_energetic), skrVar.c(R.string.wave_header_mood), "https://music-custom-wave-media.music.yandex.net/e6Ptlara08", "https://avatars.mds.yandex.net/get-music-misc/70683/rotor-mood-energetic-agent-cover-NrJtV/%%", "#FDFAFF"), ezf.v("mood:happy", skrVar.c(R.string.wave_title_mood_happy), skrVar.c(R.string.wave_header_mood), "https://music-custom-wave-media.music.yandex.net/EzOBeQmIXi", "https://avatars.mds.yandex.net/get-music-misc/70683/rotor-mood-happy-agent-cover-JWFjr/%%", "#FFFFE8"), ezf.v("mood:sad", skrVar.c(R.string.wave_title_mood_sad), skrVar.c(R.string.wave_header_mood), "https://music-custom-wave-media.music.yandex.net/rrF2I4tUvZ", "https://avatars.mds.yandex.net/get-music-misc/30221/rotor-mood-sad-agent-cover-IN0O6/%%", "#EAFFFF")));
            case 19:
                return (viv) obj;
            case 20:
                tur turVar = (tur) obj;
                if (turVar != null) {
                    turVar.a.a(uur.a);
                }
                return Unit.a;
            case 21:
                int i3 = WidgetRecentlyRectangleReceiver.d;
                return (aon) ((knv) ((WidgetRecentlyRectangleReceiver) obj).b.getValue()).k.getValue();
            case 22:
                int i4 = WidgetRectangleReceiver.d;
                return (aon) ((knv) ((WidgetRectangleReceiver) obj).b.getValue()).k.getValue();
            case 23:
                aov aovVar = (aov) ((dov) obj).g.getValue();
                aovVar.getClass();
                return new iov(new uiq(12, aovVar));
            case 24:
                int i5 = WidgetSquareReceiver.d;
                return (f9r) ((knv) ((WidgetSquareReceiver) obj).b.getValue()).l.getValue();
            case 25:
                return ((lvv) ((mvv) ((stv) obj).h.getValue()).b.getValue()).b();
            case 26:
                pkb pkbVar = pkb.Shortcut;
                String str = ((jvv) obj).a;
                str.getClass();
                return new thj(pkbVar, str, 1, 1, "");
            case 27:
                dwv dwvVar = (dwv) obj;
                Object value = dwvVar.a.a.getValue();
                ewv ewvVar = value instanceof ewv ? (ewv) value : null;
                if (ewvVar != null && (hwvVar = ewvVar.a) != null) {
                    ((j1w) ((cyv) ((lwv) dwvVar.c.b).f.b).c.a).a.Z(hwvVar.a);
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((lwv) obj).a();
                return Unit.a;
            default:
                bxv bxvVar = (bxv) obj;
                return new jd1(bxvVar.d, bxvVar.c, bxvVar.f, null);
        }
    }
}
