package com.yandex.passport.internal.core.announcing;

import android.os.Bundle;
import com.yandex.passport.common.core.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a {
    public final String a;
    public final Bundle b;

    public a(Bundle bundle, String str) {
        this.a = str;
        this.b = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ArrayList arrayList, String str, com.yandex.passport.internal.b bVar) {
        f fVar;
        long parseLong;
        com.yandex.passport.common.core.b bVar2;
        String str2 = bVar.c;
        if (str2 == null) {
            com.yandex.passport.legacy.a.e(6, "add: account.uidString is null, action ignored", null);
            return;
        }
        int R = StringsKt.R(str2, ':', 0, false);
        if (R >= 1 && R != str2.length() - 1) {
            String substring = str2.substring(0, R);
            try {
                parseLong = Long.parseLong(str2.substring(R + 1));
            } catch (NumberFormatException unused) {
            }
            if (parseLong > 0) {
                try {
                    com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                    int parseInt = Integer.parseInt(substring);
                    aVar.getClass();
                    bVar2 = com.yandex.passport.common.core.a.b(parseInt);
                } catch (Exception unused2) {
                    bVar2 = com.yandex.passport.common.core.b.c;
                }
                fVar = new f(bVar2, parseLong);
                if (fVar != null) {
                    com.yandex.passport.legacy.a.e(6, "add: uid is null, action ignored", null);
                    return;
                } else {
                    arrayList.add(b(fVar, str));
                    return;
                }
            }
        }
        fVar = null;
        if (fVar != null) {
        }
    }

    public static a b(f fVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("environment", fVar.a.a);
        bundle.putLong("uid", fVar.b);
        return new a(bundle, str);
    }

    public static ArrayList c(com.yandex.passport.internal.c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = cVar.a.iterator();
        while (it.hasNext()) {
            a(arrayList, "com.yandex.passport.client.ACCOUNT_ADDED", (com.yandex.passport.internal.b) it.next());
        }
        Iterator it2 = cVar.c.iterator();
        while (it2.hasNext()) {
            a(arrayList, "com.yandex.passport.client.TOKEN_CHANGED", (com.yandex.passport.internal.b) it2.next());
        }
        Iterator it3 = cVar.d.iterator();
        while (it3.hasNext()) {
            a(arrayList, "com.yandex.passport.client.ACCOUNT_REMOVED", (com.yandex.passport.internal.b) it3.next());
        }
        return arrayList;
    }

    public final String toString() {
        return "AccountChanges{action='" + this.a + "', extras=" + this.b + '}';
    }
}
