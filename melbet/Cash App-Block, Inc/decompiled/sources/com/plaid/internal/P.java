package com.plaid.internal;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.V3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class P implements Y3 {
    public final V3 a;
    public final Function3 b;
    public final Pattern c;
    public final List<String> d;

    public P(V3 v3, Function3 function3) {
        v3.getClass();
        this.a = v3;
        this.b = function3;
        this.c = Pattern.compile("(\\$\\d+)+$");
        this.d = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{C0095a6.class.getName(), C0095a6.a.class.getName(), P.class.getName()});
    }

    public final void a(int i, Throwable th, String str, Object[] objArr, boolean z) {
        if (z) {
            return;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.d.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                String substringAfterLast = StringsKt.substringAfterLast('.', className, className);
                Matcher matcher = this.c.matcher(substringAfterLast);
                if (matcher.find()) {
                    substringAfterLast = matcher.replaceAll("");
                    substringAfterLast.getClass();
                }
                V3.a aVar = V3.Companion;
                V3 v3 = this.a;
                aVar.getClass();
                if (i < V3.a.a(v3)) {
                    return;
                }
                if (str == null || str.length() == 0) {
                    if (th == null) {
                        return;
                    }
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    str.getClass();
                } else {
                    if (objArr.length != 0) {
                        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                    }
                    if (th != null) {
                        StringWriter stringWriter2 = new StringWriter(256);
                        PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                        th.printStackTrace(printWriter2);
                        printWriter2.flush();
                        String stringWriter3 = stringWriter2.toString();
                        stringWriter3.getClass();
                        str = Recorder$$ExternalSyntheticOutline2.m(str, "\n", stringWriter3);
                    }
                }
                try {
                    a(i, substringAfterLast, str);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Array contains no element matching the predicate.");
    }

    @Override // com.plaid.internal.Y3
    public final void b(String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(6, new Throwable(), Recorder$$ExternalSyntheticOutline2.m("Plog.e: ", str), Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void c(String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(4, null, str, Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void d(String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(3, null, str, Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void e(String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(5, null, str, Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void b(Throwable th, String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(5, th, str, Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void b(Throwable th, boolean z) {
        a(6, th, null, new Object[0], z);
    }

    @Override // com.plaid.internal.Y3
    public final void a(String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(2, null, str, Arrays.copyOf(objArr, objArr.length), z);
    }

    @Override // com.plaid.internal.Y3
    public final void a(Throwable th, boolean z) {
        a(5, th, null, new Object[0], z);
    }

    @Override // com.plaid.internal.Y3
    public final void a(Throwable th, String str, Object[] objArr, boolean z) {
        objArr.getClass();
        a(6, th, str, Arrays.copyOf(objArr, objArr.length), z);
    }

    public final void a(int i, String str, String str2) {
        int min;
        if (str2.length() < 4000) {
            Function3 function3 = this.b;
            if (function3 != null) {
                function3.invoke(Integer.valueOf(i), str, str2);
            }
            if (i == 7) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(i, str, str2);
                return;
            }
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '\n', i2, false, 4);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            while (true) {
                min = Math.min(indexOf$default, i2 + 4000);
                String substring = str2.substring(i2, min);
                Function3 function32 = this.b;
                if (function32 != null) {
                    function32.invoke(Integer.valueOf(i), str, substring);
                }
                if (i == 7) {
                    Log.wtf(str, substring);
                } else {
                    Log.println(i, str, substring);
                }
                if (min >= indexOf$default) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }
}
