package defpackage;

import android.os.Message;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1n implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ t1n(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = ((gow) obj).c;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((gow) obj2).c.toLowerCase(locale);
                lowerCase2.getClass();
                return gl5.b(lowerCase, lowerCase2);
            case 1:
                return gl5.b(Long.valueOf(((inn) obj).a()), Long.valueOf(((inn) obj2).a()));
            case 2:
                File file = (File) obj;
                File file2 = (File) obj2;
                file.getClass();
                file2.getClass();
                int e = Intrinsics.e(file.getName().length(), file2.getName().length());
                return e == 0 ? file.compareTo(file2) : e;
            case 3:
                return gl5.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return gl5.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return gl5.b(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
            case 6:
                return gl5.b(((c2s) obj).a, ((c2s) obj2).a);
            case 7:
                return gl5.b(((e2s) obj).a, ((e2s) obj2).a);
            case 8:
                return gl5.b(Integer.valueOf(((n6s) obj2).b.getBitrate()), Integer.valueOf(((n6s) obj).b.getBitrate()));
            case 9:
                return gl5.b(Integer.valueOf(((Number) obj2).intValue()), Integer.valueOf(((Number) obj).intValue()));
            case 10:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 11:
                return gl5.b(Long.valueOf(((iss) obj2).g), Long.valueOf(((iss) obj).g));
            case 12:
                return gl5.b(Long.valueOf(((iss) obj2).g), Long.valueOf(((iss) obj).g));
            case 13:
                return gl5.b(Long.valueOf(((iss) obj2).g), Long.valueOf(((iss) obj).g));
            case 14:
                Pair pair = (Pair) obj;
                String str2 = (String) pair.a;
                kxt kxtVar = (kxt) pair.b;
                StringBuilder k = dfi.k(str2);
                k.append(kxtVar.c());
                String sb = k.toString();
                Pair pair2 = (Pair) obj2;
                String str3 = (String) pair2.a;
                kxt kxtVar2 = (kxt) pair2.b;
                StringBuilder k2 = dfi.k(str3);
                k2.append(kxtVar2.c());
                return gl5.b(sb, k2.toString());
            case 15:
                return ((vfu) obj).b - ((vfu) obj2).b;
            case 16:
                wfu wfuVar = (wfu) ((View) obj).getLayoutParams();
                wfu wfuVar2 = (wfu) ((View) obj2).getLayoutParams();
                boolean z = wfuVar.a;
                return z != wfuVar2.a ? z ? 1 : -1 : wfuVar.e - wfuVar2.e;
            case 17:
                return gl5.b(((c01) obj).r, ((c01) obj2).r);
            case 18:
                return gl5.b(((stw) obj).a, ((stw) obj2).a);
            case 19:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
        }
    }
}
