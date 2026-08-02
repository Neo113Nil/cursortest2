package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class p36 implements o36 {
    public final Context a;
    public final vy5 b;
    public final Locale c;
    public final DateTimeFormatter d;
    public final DateTimeFormatter e;
    public final DateTimeFormatter f;
    public final DateTimeFormatter g;

    public p36(Context context, vy5 vy5Var, tu5 tu5Var) {
        htr htrVar;
        this.a = context;
        this.b = vy5Var;
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        Locale locale = htrVar.c;
        this.c = locale;
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("MMM", locale);
        ofPattern.getClass();
        this.d = ofPattern;
        DateTimeFormatter.ofPattern("MMMM", locale).getClass();
        this.e = DateTimeFormatter.ofPattern("E", locale);
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("HH:mm", locale);
        ofPattern2.getClass();
        this.f = ofPattern2;
        DateTimeFormatter ofPattern3 = DateTimeFormatter.ofPattern("d MMMM, EEEE", locale);
        ofPattern3.getClass();
        this.g = ofPattern3;
    }

    @Override // defpackage.o36
    public final String a(uy5 uy5Var, vy5 vy5Var) {
        if (vy5Var == null) {
            vy5Var = this.b;
        }
        if (uy5Var != null) {
            return j(uy5Var, vy5Var, Integer.MAX_VALUE);
        }
        String string = this.a.getString(R.string.concert_tab_buy);
        string.getClass();
        return string;
    }

    @Override // defpackage.o36
    public final String b(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        String format = this.e.format(zonedDateTime);
        format.getClass();
        String lowerCase = format.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // defpackage.o36
    public final String c(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        return String.valueOf(zonedDateTime.getDayOfMonth());
    }

    @Override // defpackage.o36
    public final String d(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        String format = this.g.format(zonedDateTime);
        format.getClass();
        return format;
    }

    @Override // defpackage.o36
    public final String e(su5 su5Var) {
        int ordinal = su5Var.ordinal();
        Context context = this.a;
        if (ordinal == 0) {
            String string = context.getString(R.string.concert_event_type_concert);
            string.getClass();
            return string;
        }
        if (ordinal == 1) {
            String string2 = context.getString(R.string.concert_event_type_festival);
            string2.getClass();
            return string2;
        }
        if (ordinal == 2) {
            String string3 = context.getString(R.string.concert_event_type_tribute);
            string3.getClass();
            return string3;
        }
        if (ordinal != 3) {
            String string4 = context.getString(R.string.concert_event_type_unspecified);
            string4.getClass();
            return string4;
        }
        String string5 = context.getString(R.string.concert_event_type_musical);
        string5.getClass();
        return string5;
    }

    @Override // defpackage.o36
    public final String f(int i) {
        String string = this.a.getString(R.string.concert_full_cashback_percent_text, Integer.valueOf(i));
        string.getClass();
        return string;
    }

    @Override // defpackage.o36
    public final String g(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        String format = this.d.format(zonedDateTime);
        format.getClass();
        String lowerCase = StringsKt.a0(format, ".").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // defpackage.o36
    public final String h(ZonedDateTime zonedDateTime) {
        zonedDateTime.getClass();
        String format = this.f.format(zonedDateTime);
        format.getClass();
        return format;
    }

    @Override // defpackage.o36
    public final String i(uy5 uy5Var) {
        if (uy5Var != null) {
            return j(uy5Var, this.b, 100000);
        }
        String string = this.a.getString(R.string.concert_tab_buy);
        string.getClass();
        return string;
    }

    public final String j(uy5 uy5Var, vy5 vy5Var, int i) {
        int i2;
        Context context = this.a;
        int i3 = uy5Var.a;
        if (i3 >= i) {
            vy5Var.getClass();
            String string = context.getString(R.string.concert_tab_buy);
            string.getClass();
            return string;
        }
        String C = i3 >= 10000 ? ot0.C(i3, this.c) : String.valueOf(i3);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((q36) ((byb) qdcVar.C(I)).b(q36.class)).h()) {
            Integer num = vy5Var.b;
            i2 = num != null ? num.intValue() : vy5Var.a;
        } else {
            i2 = vy5Var.a;
        }
        String string2 = context.getString(i2, ouj.o(C, StringUtil.SPACE, uy5Var.c));
        string2.getClass();
        return string2;
    }
}
