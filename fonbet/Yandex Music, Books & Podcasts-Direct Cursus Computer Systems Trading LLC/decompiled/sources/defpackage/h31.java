package defpackage;

import android.content.Context;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class h31 {
    public final r31 a;
    public final r31 b;
    public final boolean c;
    public final fkn d;

    public h31(s26 s26Var, j31 j31Var, cr crVar, r31 r31Var, r31 r31Var2, boolean z) {
        su5 su5Var;
        String string;
        j31Var.getClass();
        this.a = r31Var;
        this.b = r31Var2;
        this.c = z;
        h06 h06Var = s26Var.a;
        uy5 uy5Var = s26Var.b;
        String str = h06Var.b;
        su5 d = h06Var.m.d();
        String str2 = h06Var.g;
        ZonedDateTime zonedDateTime = h06Var.f;
        j31 j31Var2 = (j31) crVar.c;
        zonedDateTime.getClass();
        c5p c5pVar = (c5p) crVar.h;
        c5pVar.getClass();
        String format = ((DateTimeFormatter) c5pVar.b).format(zonedDateTime);
        format.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = format.toLowerCase(locale);
        lowerCase.getClass();
        String a0 = StringsKt.a0(lowerCase, ".");
        ((l3l) crVar.e).getClass();
        String upperCase = String.valueOf(zonedDateTime.getDayOfMonth()).toUpperCase(locale);
        upperCase.getClass();
        c5p c5pVar2 = (c5p) crVar.g;
        c5pVar2.getClass();
        String format2 = ((DateTimeFormatter) c5pVar2.b).format(zonedDateTime);
        format2.getClass();
        String lowerCase2 = format2.toLowerCase(locale);
        lowerCase2.getClass();
        String str3 = h06Var.d;
        String str4 = h06Var.e;
        c5p c5pVar3 = (c5p) crVar.f;
        c5pVar3.getClass();
        String format3 = ((DateTimeFormatter) c5pVar3.b).format(zonedDateTime);
        format3.getClass();
        Context context = (Context) crVar.b;
        if (uy5Var == null) {
            string = context.getString(R.string.artist_concerts_buy);
            string.getClass();
            su5Var = d;
        } else {
            int i = uy5Var.a;
            su5Var = d;
            if (i >= 100000) {
                string = context.getString(R.string.artist_concerts_buy);
                string.getClass();
            } else {
                string = context.getString(R.string.artist_concerts_buy_from, ouj.o(i >= 10000 ? ot0.C(i, (Locale) crVar.d) : String.valueOf(i), StringUtil.SPACE, uy5Var.c));
                string.getClass();
            }
        }
        String str5 = h06Var.k;
        Integer num = h06Var.l;
        c5p c5pVar4 = (c5p) crVar.i;
        c5pVar4.getClass();
        String format4 = ((DateTimeFormatter) c5pVar4.b).format(zonedDateTime);
        format4.getClass();
        Integer num2 = h06Var.l;
        StringBuilder sb = new StringBuilder();
        if (num2 != null) {
            int intValue = num2.intValue();
            j31Var2.getClass();
            sb.append(context.getString(R.string.concert_full_cashback_percent_text, Integer.valueOf(intValue)));
        }
        this.d = new fkn(ydr.a(new i31(str, su5Var, str2, a0, upperCase, lowerCase2, str3, str4, format3, string, str5, num, format4, sb.toString())));
    }
}
