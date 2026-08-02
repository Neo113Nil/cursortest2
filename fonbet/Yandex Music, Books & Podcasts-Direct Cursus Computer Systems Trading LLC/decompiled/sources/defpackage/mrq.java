package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class mrq extends p7k {
    public final ArrayList a = new ArrayList();

    public static void a(mrq mrqVar, String str, String str2, Throwable th) {
        mrqVar.a.add(new pt0(str, str2, th));
    }

    public static void b(mrq mrqVar, String str, String str2) {
        mrqVar.a.add(new pt0(str, str2, (Throwable) null));
    }
}
