package d6;

import C2.N;
import I7.l;
import L3.F;
import Q7.j;
import U.m;
import U.n;
import U.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import c8.e;
import c8.f;
import c8.i;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import k.C4617d;
import kotlin.jvm.internal.h;
import m.Z;
import t0.C4986A;
import t8.g;
import v7.AbstractC5128i;
import w7.C5156c;
import x.C5176n;
import z0.C5247c;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f37075a = true;

    public static final void a(Logger logger, l8.a aVar, l8.c cVar, String str) {
        logger.fine(cVar.f38941b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f38934a);
    }

    public static C5156c b(C5156c c5156c) {
        c5156c.g();
        c5156c.f41669v = true;
        return c5156c.f41668u > 0 ? c5156c : C5156c.f41666w;
    }

    public static final f c(String str, g gVar, e[] eVarArr, l lVar) {
        if (j.c0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (gVar.equals(i.f5651b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        c8.a aVar = new c8.a(str);
        lVar.invoke(aVar);
        return new f(str, gVar, aVar.f5623b.size(), AbstractC5128i.y(eVarArr), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q d(Context context) {
        ProviderInfo providerInfo;
        N n9;
        ApplicationInfo applicationInfo;
        E3.e cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c() : new E3.e();
        PackageManager packageManager = context.getPackageManager();
        F.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] w6 = cVar.w(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : w6) {
                    arrayList.add(signature.toByteArray());
                }
                n9 = new N(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e9) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e9);
            }
            if (n9 != null) {
                return null;
            }
            return new q(new p(context, n9));
        }
        n9 = null;
        if (n9 != null) {
        }
    }

    public static final String e(long j6) {
        String str;
        if (j6 <= -999500000) {
            str = ((j6 - 500000000) / 1000000000) + " s ";
        } else if (j6 <= -999500) {
            str = ((j6 - 500000) / 1000000) + " ms";
        } else if (j6 <= 0) {
            str = ((j6 - 500) / 1000) + " µs";
        } else if (j6 < 999500) {
            str = ((j6 + 500) / 1000) + " µs";
        } else if (j6 < 999500000) {
            str = ((j6 + 500000) / 1000000) + " ms";
        } else {
            str = ((j6 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static Drawable f(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f37075a) {
                return l(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e9) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e9;
            }
            return E.a.b(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f37075a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = F.q.f879a;
        return F.j.a(resources, i, theme);
    }

    public static M.e g(Z z3) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new M.e(o.c(z3));
        }
        TextPaint textPaint = new TextPaint(z3.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a9 = m.a(z3);
        int d2 = m.d(z3);
        if (z3.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (z3.getInputType() & 15) != 3) {
                boolean z6 = z3.getLayoutDirection() == 1;
                switch (z3.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z6) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(o.b(n.a(z3.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new M.e(textPaint, textDirectionHeuristic, a9, d2);
    }

    public static String h(String tableName, String triggerType) {
        h.e(tableName, "tableName");
        h.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static C5247c i(C4986A refHolder, SQLiteDatabase sQLiteDatabase) {
        h.e(refHolder, "refHolder");
        C5247c c5247c = (C5247c) refHolder.f40530n;
        if (c5247c != null && c5247c.f42224n.equals(sQLiteDatabase)) {
            return c5247c;
        }
        C5247c c5247c2 = new C5247c(sQLiteDatabase);
        refHolder.f40530n = c5247c2;
        return c5247c2;
    }

    public static boolean j(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static List k(Object obj) {
        List singletonList = Collections.singletonList(obj);
        h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Drawable l(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C4617d c4617d = new C4617d(context);
            c4617d.f38489b = theme;
            c4617d.a(theme.getResources().getConfiguration());
            context = c4617d;
        }
        return com.bumptech.glide.g.e(context, i);
    }

    public static String m(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        y8.h hVar = y8.h.f41951w;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        h.d(encoded, "getEncoded(...)");
        int i = 0;
        y8.h c9 = C5176n.c(encoded, 0, -1234567890);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(c9.f41952n, 0, c9.a());
        byte[] digest = messageDigest.digest();
        h.b(digest);
        new y8.h(digest);
        byte[] map = y8.a.f41935a;
        h.e(map, "map");
        byte[] bArr = new byte[((digest.length + 2) / 3) * 4];
        int length = digest.length - (digest.length % 3);
        int i6 = 0;
        while (i < length) {
            byte b9 = digest[i];
            int i9 = i + 2;
            byte b10 = digest[i + 1];
            i += 3;
            byte b11 = digest[i9];
            bArr[i6] = map[(b9 & 255) >> 2];
            bArr[i6 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i10 = i6 + 3;
            bArr[i6 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i6 += 4;
            bArr[i10] = map[b11 & com.anythink.core.common.s.a.c.f16318c];
        }
        int length2 = digest.length - length;
        if (length2 == 1) {
            byte b12 = digest[i];
            bArr[i6] = map[(b12 & 255) >> 2];
            bArr[1 + i6] = map[(b12 & 3) << 4];
            bArr[2 + i6] = 61;
            bArr[i6 + 3] = 61;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b13 = digest[i];
            byte b14 = digest[i11];
            bArr[i6] = map[(b13 & 255) >> 2];
            bArr[1 + i6] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr[i6 + 2] = map[(b14 & 15) << 2];
            bArr[i6 + 3] = 61;
        }
        sb.append(new String(bArr, Q7.a.f2664a));
        return sb.toString();
    }

    public static void n(TextView textView, int i) {
        F.e(i);
        if (Build.VERSION.SDK_INT >= 28) {
            o.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), i + i6, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void o(TextView textView, int i) {
        F.e(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i6);
        }
    }

    public static void p(TextView textView, int i) {
        F.e(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        return (!(callback instanceof U.q) || Build.VERSION.SDK_INT < 26) ? callback : ((U.q) callback).f3128a;
    }

    public static ActionMode.Callback r(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof U.q) || callback == null) ? callback : new U.q(callback, textView);
    }

    public static int s(Activity activity, int i) {
        return (int) ((i * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int t(Activity activity) {
        return s(activity, activity.getResources().getConfiguration().screenHeightDp);
    }
}
