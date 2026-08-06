package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f7364a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] split = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            int i2 = 0;
            while (str2.length() > i2) {
                int length = str2.length();
                int i3 = i2 + 3800;
                int min = Math.min(length, i3);
                if (length > i3) {
                    int a2 = e.a(this.f7364a.f7369a.matcher(str2), i2, min);
                    length = a2 == -1 ? min : a2 + 1;
                }
                arrayList.add(str2.substring(i2, length));
                i2 = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f7364a = eVar;
    }
}
