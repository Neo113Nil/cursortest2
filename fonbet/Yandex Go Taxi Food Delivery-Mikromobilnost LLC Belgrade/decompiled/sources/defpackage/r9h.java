package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class r9h extends nl11 {
    public static final o9h c = new o9h();
    public final q9h a;
    public final ArrayList b;

    public r9h(q9h q9hVar, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(q9hVar);
        this.a = q9hVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (k7x.a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    ny61.g(oyr.i(i, "Unknown DateFormat style: "));
                    throw null;
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    ny61.g(oyr.i(i2, "Unknown DateFormat style: "));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        Date b;
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b = v3v.b(nextString, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder x = unr0.x("Failed parsing '", nextString, "' as Date; at path ");
                            x.append(wdxVar.w());
                            throw new JsonSyntaxException(x.toString(), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b = dateFormat.parse(nextString);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.a(b);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            afxVar.w();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        afxVar.W(format);
    }
}
