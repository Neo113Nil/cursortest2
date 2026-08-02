package defpackage;

import android.view.View;
import com.yandex.pulse.metrics.o;
import java.util.Comparator;
import java.util.Locale;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class ehf implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ehf(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                lqs I = ((mqs) obj2).I();
                lqs lqsVar = lqs.c;
                return gl5.b(Boolean.valueOf(I == lqsVar), Boolean.valueOf(((mqs) obj).I() == lqsVar));
            case 1:
                lqs I2 = ((mqs) obj2).I();
                lqs lqsVar2 = lqs.d;
                return gl5.b(Boolean.valueOf(I2 == lqsVar2), Boolean.valueOf(((mqs) obj).I() == lqsVar2));
            case 2:
                return gl5.b(q7g.R(((mqs) obj).c), q7g.R(((mqs) obj2).c));
            case 3:
                return gl5.b(((mqs) obj2).w0, ((mqs) obj).w0);
            case 4:
                View view = (View) obj2;
                View view2 = (View) obj;
                return gl5.b(Float.valueOf(view.getMinimumHeight() / view.getMeasuredHeight()), Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()));
            case 5:
                View view3 = (View) obj2;
                View view4 = (View) obj;
                return gl5.b(Float.valueOf(view3.getMinimumWidth() / view3.getMeasuredWidth()), Float.valueOf(view4.getMinimumWidth() / view4.getMeasuredWidth()));
            case 6:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 7:
                return gl5.b((String) ((Pair) obj2).a, (String) ((Pair) obj).a);
            case 8:
                return gl5.b((String) ((Pair) obj2).a, (String) ((Pair) obj).a);
            case 9:
                return gl5.b((String) ((Pair) obj2).a, (String) ((Pair) obj).a);
            case 10:
                return gl5.b((String) ((Pair) obj2).a, (String) ((Pair) obj).a);
            case 11:
                return gl5.b((String) ((Pair) obj2).a, (String) ((Pair) obj).a);
            case 12:
                return gl5.b((Integer) ((Pair) obj).a, (Integer) ((Pair) obj2).a);
            case 13:
                return gl5.b(((xui) obj2).a, ((xui) obj).a);
            case 14:
                return gl5.b(Integer.valueOf(((mzi) obj).a), Integer.valueOf(((mzi) obj2).a));
            case 15:
                return gl5.b(q7g.R(((oq) obj).b), q7g.R(((oq) obj2).b));
            case 16:
                return gl5.b(((oq) obj2).E, ((oq) obj).E);
            case 17:
                return gl5.b(q7g.R(((oq) obj).b), q7g.R(((oq) obj2).b));
            case 18:
                return gl5.b(((oq) obj2).E, ((oq) obj).E);
            case 19:
                return gl5.b(q7g.R(((mqs) obj).c), q7g.R(((mqs) obj2).c));
            case 20:
                return gl5.b(((mqs) obj2).w0, ((mqs) obj).w0);
            case 21:
                return gl5.b(q7g.R(((mqs) obj).d.d), q7g.R(((mqs) obj2).d.d));
            case 22:
                return gl5.b(q7g.R(((mqs) obj).c), q7g.R(((mqs) obj2).c));
            case 23:
                return gl5.b(((mqs) obj2).w0, ((mqs) obj).w0);
            case 24:
                return gl5.b(Integer.valueOf(((j2m) obj).f), Integer.valueOf(((j2m) obj2).f));
            case 25:
                return gl5.b(q7g.R(((kca) obj).a.b), q7g.R(((kca) obj2).a.b));
            case 26:
                return gl5.b(Long.valueOf(((kca) obj2).b), Long.valueOf(((kca) obj).b));
            case 27:
                return ((i3r) obj).b - ((i3r) obj2).b;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                String str = ((kk4) obj).b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((kk4) obj2).b.toLowerCase(locale);
                lowerCase2.getClass();
                return gl5.b(lowerCase, lowerCase2);
            default:
                String b = ((ggd) obj).b();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = b.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = ((ggd) obj2).b().toLowerCase(locale2);
                lowerCase4.getClass();
                return gl5.b(lowerCase3, lowerCase4);
        }
    }
}
